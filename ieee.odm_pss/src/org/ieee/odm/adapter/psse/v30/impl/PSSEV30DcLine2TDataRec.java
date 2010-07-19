package org.ieee.odm.adapter.psse.v30.impl;

import java.util.StringTokenizer;
import java.util.logging.Logger;

import org.ieee.odm.adapter.psse.PsseVersion;
import org.ieee.odm.model.JaxbDataSetter;
import org.ieee.odm.model.JaxbODMModelParser;
import org.ieee.odm.schema.ActivePowerUnitType;
import org.ieee.odm.schema.AngleUnitType;
import org.ieee.odm.schema.ConverterXmlType;
import org.ieee.odm.schema.CurrentUnitType;
import org.ieee.odm.schema.DCLineData2TXmlType;
import org.ieee.odm.schema.DcLineControlModeEnumType;
import org.ieee.odm.schema.DcLineMeteredEndEnumType;
import org.ieee.odm.schema.VoltageUnitType;
import org.ieee.odm.schema.ZUnitType;

public class PSSEV30DcLine2TDataRec {
	private static int I, MDC, CCCITMX;
	private static String METER, IDR, IDI;
	private static double RDC,SETVL,VSCHD,VCMOD,RCOMP,DELTI,DCVMIN,CCCACC; 
	private static int IPR, NBR, ICR, IFR, ITR;
	private static double ALFMX,ALFMN,RCR,XCR,EBASR,TRR,TAPR,TMXR,TMNR,STPR,XCAPR;	
	private static int IPI, NBI, ICI, IFI, ITI;
	private static double GAMMX,GAMMN,RCI,XCI,EBASI,TRI,TAPI,TMXI,TMNI,STPI,XCAPI;	

	public static void procLineString(String lineStr1, String lineStr2, String lineStr3, PsseVersion version, JaxbODMModelParser parser, Logger logger) {
		procLineFields(lineStr1, lineStr2, lineStr3, version, logger);
		
		final String fid = JaxbODMModelParser.BusIdPreFix+IPR;
		final String tid = JaxbODMModelParser.BusIdPreFix+IPI;
		DCLineData2TXmlType dcLine2T;
		try {
			dcLine2T = parser.createDCLine2TRecord(fid, tid, I);
		} catch (Exception e) {
			e.printStackTrace();
			logger.severe(e.toString());
			return;
		}			

		/*
		Line-1: 
			I,MDC,RDC,      SETVL,    VSCHD,   VCMOD,  RCOMP,    DELTI,  METER,  DCVMIN,CCCITMX,CCCACC
            1,1,  13.7500,  552.00,   410.00,  -1.00,  13.7500,  0.10000,'I',    0.00,  20,   1.00000
			
			MDC Control mode: 0 for blocked, 1 for power, 2 for current. MDC = 0 by default.
			SETVL Current (amps) or power (MW) demand. When MDC is one, a positive value of
				SETVL specifies desired power at the rectifier and a negative value specifies
				desired inverter power. No default allowed.					
			RDC The dc line resistance; entered in ohms. No default allowed.
		 */
		if (MDC == 1) {
			dcLine2T.setControlMode(DcLineControlModeEnumType.POWER);
			dcLine2T.setControlOnRectifierSide(SETVL > 0.0);
			dcLine2T.setPowerDemand(JaxbDataSetter.createActivePowerValue(SETVL, ActivePowerUnitType.MW));
		}
		else if (MDC == 2) {
			dcLine2T.setControlMode(DcLineControlModeEnumType.CURRENT);
			dcLine2T.setCurrentDemand(JaxbDataSetter.createCurrentValue(SETVL, CurrentUnitType.AMP));
		}
		else
			dcLine2T.setControlMode(DcLineControlModeEnumType.BLOCKED);
			
		dcLine2T.setLineR(JaxbDataSetter.createRValue(RDC, ZUnitType.OHM));
		
		/*
			VSCHD Scheduled compounded dc voltage; entered in kV. No default allowed.
			METER Metered end code of either �R� (for rectifier) or �I� (for inverter). METER = �I� by default.
		*/
		dcLine2T.setScheduledDCVoltage(JaxbDataSetter.createVoltageValue(VSCHD, VoltageUnitType.KV));
		dcLine2T.setMeteredEnd(METER.equals("R")? DcLineMeteredEndEnumType.RECTIFIER :
								DcLineMeteredEndEnumType.INVERTER);
		/*
			VCMOD Mode switch dc voltage; entered in kV. When the inverter dc voltage falls below
				this value and the line is in power control mode (i.e., MDC = 1), the line switches
				to current control mode with a desired current corresponding to the desired power
				at scheduled dc voltage. VCMOD = 0.0 by default.
			RCOMP Compounding resistance; entered in ohms. Gamma and/or TAPI is used to attempt
				to hold the compounded voltage (VDCI + DCCUR*RCOMP) at VSCHD. To control
				the inverter end dc voltage VDCI, set RCOMP to zero; to control the rectifier
				end dc voltage VDCR, set RCOMP to the dc line resistance, RDC; otherwise, set
				RCOMP to the appropriate fraction of RDC. RCOMP = 0.0 by default.
		*/
		dcLine2T.setModeSwitchDCVoltage(JaxbDataSetter.createVoltageValue(VCMOD, VoltageUnitType.KV));
		dcLine2T.setCompoundingR(JaxbDataSetter.createRValue(RCOMP, ZUnitType.OHM));

		/*
			DELTI Margin entered in per unit of desired dc power or current. This is the fraction by
				which the order is reduced when ALPHA is at its minimum and the inverter is controlling
				the line current. DELTI = 0.0 by default.
			DCVMIN Minimum compounded dc voltage; entered in kV. Only used in constant gamma
				operation (i.e., when GAMMX = GAMMN) when TAPI is held constant and an ac
				transformer tap is adjusted to control dc voltage (i.e., when IFI, ITI, and IDI specify
				a two-winding transformer). DCVMIN = 0.0 by default.
		 */
		dcLine2T.setPowerOrCurrentMarginPU(DELTI);
		dcLine2T.setMinDCVoltage(JaxbDataSetter.createVoltageValue(DCVMIN, VoltageUnitType.KV));
		
		/*
		Line-2: IPR,NBR,ALFMX,ALFMN,RCR,XCR,EBASR,TRR,TAPR,TMXR,TMNR,STPR,ICR,IFR,ITR,IDR,XCAPR
		Line-3: IPI,NBI,GAMMX,GAMMN,RCI,XCI,EBASI,TRI,TAPI,TMXI,TMNI,STPI,ICI,IFI,ITI,IDI,XCAPI		
		 */
		/*
			IPR Rectifier converter bus number, or extended bus name enclosed in single quotes
				(see Section 4.1.2). No default allowed.
			NBR Number of bridges in series (rectifier). No default allowed.
			ALFMX Nominal maximum rectifier firing angle; entered in degrees. No default allowed.
			ALFMN Minimum steady-state rectifier firing angle; entered in degrees. No default allowed.
			EBASR Rectifier primary base ac voltage; entered in kV. No default allowed.
			ICR Rectifier firing angle measuring bus number, or extended bus name enclosed in
				single quotes (see Section 4.1.2). The firing angle and angle limits used inside the
				dc model are adjusted by the difference between the phase angles at this bus and
				the ac/dc interface (i.e., the converter bus, IPR). ICR = 0 by default.
			*/
		ConverterXmlType rectifier = dcLine2T.getRectifier();
		ConverterXmlType inverter = dcLine2T.getInverter();
		
		rectifier.setNumberofBridges(NBR);
		rectifier.setMaxFiringAngle(JaxbDataSetter.createAngleValue(ALFMX, AngleUnitType.DEG));
		rectifier.setMinFiringAngle(JaxbDataSetter.createAngleValue(ALFMN, AngleUnitType.DEG));
		rectifier.setAcSideRatedVoltage(JaxbDataSetter.createVoltageValue(EBASR, VoltageUnitType.KV));
		if (ICR != 0)
			rectifier.setFiringAngleMeasuringBusId(parser.createBusRef(JaxbODMModelParser.BusIdPreFix+ICR));
		
		inverter.setNumberofBridges(NBI);
		inverter.setMaxFiringAngle(JaxbDataSetter.createAngleValue(GAMMX, AngleUnitType.DEG));
		inverter.setMinFiringAngle(JaxbDataSetter.createAngleValue(GAMMN, AngleUnitType.DEG));
		inverter.setAcSideRatedVoltage(JaxbDataSetter.createVoltageValue(EBASI, VoltageUnitType.KV));
		if (ICI != 0)
			inverter.setFiringAngleMeasuringBusId(parser.createBusRef(JaxbODMModelParser.BusIdPreFix+ICI));
		
		/*
			RCR Rectifier commutating transformer resistance per bridge; entered in ohms. No default allowed.
			XCR Rectifier commutating transformer reactance per bridge; entered in ohms. No default allowed.
			XCAPR Commutating capacitor reactance magnitude per bridge; entered in ohms. XCAPR = 0.0 by default.			
		*/
		rectifier.setCommutatingZ(JaxbDataSetter.createZValue(RCR, XCR, ZUnitType.OHM));
		rectifier.setCommutatingCapacitor(XCAPR);
		
		inverter.setCommutatingZ(JaxbDataSetter.createZValue(RCI, XCI, ZUnitType.OHM));
		inverter.setCommutatingCapacitor(XCAPI);	
		
		/*
			TRR Rectifier transformer ratio. TRR = 1.0 by default.
			TAPR Rectifier tap setting. TAPR = 1.0 by default.
			TMXR Maximum rectifier tap setting. TMXR = 1.5 by default.
			TMNR Minimum rectifier tap setting. TMNR = 0.51 by default.
			STPR Rectifier tap step; must be positive. STPR = 0.00625 by default.
			*/
		rectifier.setXformerTurnRatio(TRR);
		rectifier.setXformerTapSetting(JaxbDataSetter.createTapPU(TAPR));
		rectifier.setXformerTapLimit(JaxbDataSetter.createTapLimit(TMXR, TMNR));
       	rectifier.setXformerTapStepSize(STPR);

       	inverter.setXformerTurnRatio(TRI);
       	inverter.setXformerTapSetting(JaxbDataSetter.createTapPU(TAPI));
       	inverter.setXformerTapLimit(JaxbDataSetter.createTapLimit(TMXI, TMNI));
       	inverter.setXformerTapStepSize(STPI);
		/*
			IFR Winding one side "from bus" number, or extended bus name enclosed in single
				quotes (see Section 4.1.2), of a two-winding transformer. IFR = 0 by default.
			ITR Winding two side "to bus" number, or extended bus name enclosed in single quotes
				(see Section 4.1.2), of a two-winding transformer. ITR = 0 by default.
			IDR Circuit identifier; the branch described by IFR, ITR, and IDR must have been
				entered as a two-winding transformer; an ac transformer may control at most only
				one dc converter. IDR = '1' by default.
		*/
		if (IFR != 0 && ITR != 0) {
			rectifier.setRefXfrFromBusId(parser.createBusRef(JaxbODMModelParser.BusIdPreFix+IFR));
			rectifier.setRefXfrToBusId(parser.createBusRef(JaxbODMModelParser.BusIdPreFix+ITR));
			rectifier.setRefXfrCirId(IDR);
		}

		if (IFI != 0 && ITI != 0) {
			inverter.setRefXfrFromBusId(parser.createBusRef(JaxbODMModelParser.BusIdPreFix+IFI));
			inverter.setRefXfrToBusId(parser.createBusRef(JaxbODMModelParser.BusIdPreFix+ITI));
			inverter.setRefXfrCirId(IDI);
		}
	}
	
	private static void procLineFields(String lineStr1, String lineStr2, String lineStr3, PsseVersion version, Logger logger) {
		StringTokenizer st;
		/*
		Line-1: I,MDC,RDC,SETVL,VSCHD,VCMOD,RCOMP,DELTI,METER,DCVMIN,CCCITMX,CCCACC
		 */
		st = new StringTokenizer(lineStr1, ",");
		I = new Integer(st.nextToken().trim()).intValue();
		MDC = new Integer(st.nextToken().trim()).intValue();
		RDC = new Double(st.nextToken().trim()).doubleValue();
		SETVL  = new Double(st.nextToken().trim()).doubleValue();
		VSCHD  = new Double(st.nextToken().trim()).doubleValue();
		VCMOD  = new Double(st.nextToken().trim()).doubleValue();
		RCOMP  = new Double(st.nextToken().trim()).doubleValue();
		DELTI  = new Double(st.nextToken().trim()).doubleValue();
		METER  = st.nextToken().trim();
		DCVMIN  = new Double(st.nextToken().trim()).doubleValue();
		CCCITMX = new Integer(st.nextToken().trim()).intValue();
		CCCACC  = new Double(st.nextToken().trim()).doubleValue();

		/*
		Line-2: IPR,NPR,ALFMX,ALFMN,RCR,XCR,EBASR,TRR,TAPR,TMXR,TMNR,STPR,ICR,IFR,ITR,IDR,XCAPR
		 */
		st = new StringTokenizer(lineStr2, ",");
		IPR = new Integer(st.nextToken().trim()).intValue();
		NBR = new Integer(st.nextToken().trim()).intValue();
		ALFMX  = new Double(st.nextToken().trim()).doubleValue();
		ALFMN = new Double(st.nextToken().trim()).doubleValue();
		RCR  = new Double(st.nextToken().trim()).doubleValue();
		XCR  = new Double(st.nextToken().trim()).doubleValue();
		EBASR  = new Double(st.nextToken().trim()).doubleValue();
		TRR = new Double(st.nextToken().trim()).doubleValue();
		TAPR  = new Double(st.nextToken().trim()).doubleValue();
		TMXR  = new Double(st.nextToken().trim()).doubleValue();
		TMNR  = new Double(st.nextToken().trim()).doubleValue();
		STPR  = new Double(st.nextToken().trim()).doubleValue();
		ICR = new Integer(st.nextToken().trim()).intValue();
		IFR = new Integer(st.nextToken().trim()).intValue();
		ITR = new Integer(st.nextToken().trim()).intValue();
		IDR = st.nextToken().trim();
		XCAPR  = new Double(st.nextToken().trim()).doubleValue();
		
		/*
		Line-3: IPI,NBI,GAMMX,GAMMN,RCI,XCI,EBASI,TRI,TAPI,TMXI,TMNI,STPI,ICI,IFI,ITI,IDI,XCAPI		
		 */
		st = new StringTokenizer(lineStr3, ",");
		IPI = new Integer(st.nextToken().trim()).intValue();
		NBI = new Integer(st.nextToken().trim()).intValue();
		GAMMX  = new Double(st.nextToken().trim()).doubleValue();
		GAMMN = new Double(st.nextToken().trim()).doubleValue();
		RCI  = new Double(st.nextToken().trim()).doubleValue();
		XCI  = new Double(st.nextToken().trim()).doubleValue();
		EBASI  = new Double(st.nextToken().trim()).doubleValue();
		TRI = new Double(st.nextToken().trim()).doubleValue();
		TAPI  = new Double(st.nextToken().trim()).doubleValue();
		TMXI  = new Double(st.nextToken().trim()).doubleValue();
		TMNI  = new Double(st.nextToken().trim()).doubleValue();
		STPI  = new Double(st.nextToken().trim()).doubleValue();
		ICI = new Integer(st.nextToken().trim()).intValue();
		IFI = new Integer(st.nextToken().trim()).intValue();
		ITI = new Integer(st.nextToken().trim()).intValue();
		IDI = st.nextToken().trim();
		XCAPI  = new Double(st.nextToken().trim()).doubleValue();
	}	
}
