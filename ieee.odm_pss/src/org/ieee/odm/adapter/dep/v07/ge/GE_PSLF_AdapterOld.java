/*
 * @(#)GE_PSLF_Adapter.java   
 *
 * Copyright (C) 2006 www.interpss.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU LESSER GENERAL PUBLIC LICENSE
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * @Author Mike Zhou
 * @Version 1.0
 * @Date 02/11/2008
 * 
 *   Revision History
 *   ================
 *
 */

package org.ieee.odm.adapter.dep.v07.ge;

import java.util.logging.Logger;

import org.ieee.odm.adapter.AbstractODMAdapter;
import org.ieee.odm.adapter.IFileReader;
import org.ieee.odm.adapter.dep.v07.ge.impl.BranchSecDataRec;
import org.ieee.odm.adapter.dep.v07.ge.impl.BusDataRec;
import org.ieee.odm.adapter.dep.v07.ge.impl.GenDataRec;
import org.ieee.odm.adapter.dep.v07.ge.impl.LoadDataRec;
import org.ieee.odm.adapter.dep.v07.ge.impl.NetDataRec;
import org.ieee.odm.adapter.dep.v07.ge.impl.XformerDataRec;
import org.ieee.odm.model.jaxb.JaxbODMModelParser;
import org.ieee.odm.model.jaxb.JaxbParserHelper;
import org.ieee.odm.schema.LoadflowNetXmlType;
import org.ieee.odm.schema.OriginalDataFormatEnumType;

public class GE_PSLF_AdapterOld  extends AbstractODMAdapter {
	public static enum VersionNo {PSLF15};

	public static final String Token_XfrType = "GE_XfrType";

	public static final String Token_CommentLine1 = "!";
	public static final String Token_CommentLine2 = "!";
	public static final String Token_Title = "title";
	public static final String Token_Comments = "comments";
	public static final String Token_SolutionParameters = "solution parameters";
	public static final String Token_BusData = "bus data";
	public static final String Token_BranchSectionData = "branch data";
	public static final String Token_TransformerData = "transformer data";
	public static final String Token_GeneratorData = "generator data";
	public static final String Token_LoadData = "load data";
	public static final String Token_ShuntData = "shunt data";
	public static final String Token_ControlledShuntData = "svd data";
	public static final String Token_AreaData = "area data";
	public static final String Token_ZoneData = "zone data";
	public static final String Token_Interfacedata = "interface data";
	public static final String Token_InterfaceBranchData = "interface branch data";
	public static final String Token_DCBusData = "dc bus data";
	public static final String Token_DCLineData = "dc line data";
	public static final String Token_DCConverterData = "dc converter data";
	public static final String Token_TransformerImpedanceAdjustmentData = "z table data";
	public static final String Token_UPFCData  = "gcd data";
	public static final String Token_TransactionData = "transaction data";
	public static final String Token_OwnerData = "owner data";
	public static final String Token_InductionMotorData = "motor data";
	public static final String Token_LineData = "line data";
	public static final String Token_GeneratorReactiveCapabilityCurves = "qtable data";
	public static final String Token_End = "end";
		
	public static enum RecType {Title, Comments, SolutionParameters,
				BusData, BranchSecData, XfrData, GenData,
				LoadData, ShuntData, ConShuntData,
				AreaData, ZoneData, InterfaceData, InterfaceBranchData,
				DCBusData, DCLineData, DCConverterData,
				XfrZAdjData, UPFCData, TransactionData,
				OwnerData, InductMotorData, LineData, GenQCurves,
				End, NotDefined};
	
	public GE_PSLF_AdapterOld(Logger logger) {
		super(logger);
	}
	 
	@Override
	protected JaxbODMModelParser parseInputFile(
			final IFileReader din) throws Exception {
		VersionNo version = VersionNo.PSLF15;
		
		JaxbODMModelParser parser = new JaxbODMModelParser();
		parser.setLFTransInfo(OriginalDataFormatEnumType.GE_PSLF);

		LoadflowNetXmlType baseCaseNet = parser.getAclfBaseCase();
		baseCaseNet.setId("Base_Case_from_GE_PSLF_format");

		NetDataRec.TitleRec titleRec = new NetDataRec.TitleRec();
		NetDataRec.CommentsRec commentRec = new NetDataRec.CommentsRec();
		NetDataRec.SolutionParamRec solParamRec = new NetDataRec.SolutionParamRec();
		
		RecType recType = RecType.NotDefined; 
  		String lineStr = null;
  		int lineNo = 0;
  		try {
      		do {
      			lineStr = din.readLine();
  				lineNo++;
      			if (lineStr != null && !lineStr.startsWith(Token_CommentLine1) && !lineStr.startsWith(Token_CommentLine2)) {
      				while (lineStr.endsWith("/")) {
      					lineStr = lineStr.substring(0, lineStr.indexOf("/")) + din.readLine();
      	  				lineNo++;
      				}
      				//System.out.println(lineStr);
      				
      				if (lineStr.startsWith(Token_Title)) {
      					recType = RecType.Title;
      				}
      				else if (lineStr.startsWith(Token_Comments)) {
      					recType = RecType.Comments;
      				}
      				else if (lineStr.startsWith(Token_SolutionParameters)) {
      					recType = RecType.SolutionParameters;
      				}
      				else if (lineStr.startsWith(Token_BusData)) {
      					recType = RecType.BusData;
      				}
      				else if (lineStr.startsWith(Token_BranchSectionData)) {
      					recType = RecType.BranchSecData;
      				}
      				else if (lineStr.startsWith(Token_TransformerData)) {
      					recType = RecType.XfrData;
      				}
      				else if (lineStr.startsWith(Token_GeneratorData)) {
      					recType = RecType.GenData;
      				}
      				else if (lineStr.startsWith(Token_LoadData)) {
      					recType = RecType.LoadData;
      				}
      				else if (lineStr.startsWith(Token_ShuntData)) {
      					recType = RecType.ShuntData;
      				}
      				else if (lineStr.startsWith(Token_ControlledShuntData)) {
      					recType = RecType.ConShuntData;
      				}
      				else if (lineStr.startsWith(Token_AreaData)) {
      					recType = RecType.AreaData;
      				}
      				else if (lineStr.startsWith(Token_ZoneData)) {
      					recType = RecType.ZoneData;
      				}
      				else if (lineStr.startsWith(Token_Interfacedata)) {
      					recType = RecType.InterfaceData;
      				}
      				else if (lineStr.startsWith(Token_InterfaceBranchData)) {
      					recType = RecType.InterfaceBranchData;
      				}
      				else if (lineStr.startsWith(Token_DCBusData)) {
      					recType = RecType.DCBusData;
      				}
      				else if (lineStr.startsWith(Token_DCLineData)) {
      					recType = RecType.DCLineData;
      				}
      				else if (lineStr.startsWith(Token_DCConverterData)) {
      					recType = RecType.DCConverterData;
      				}
      				else if (lineStr.startsWith(Token_TransformerImpedanceAdjustmentData)) {
      					recType = RecType.XfrZAdjData;
      				}
      				else if (lineStr.startsWith(Token_UPFCData)) {
      					recType = RecType.UPFCData; 
      				}
      				else if (lineStr.startsWith(Token_TransactionData)) {
      					recType = RecType.TransactionData;
      				}
      				else if (lineStr.startsWith(Token_OwnerData)) {
      					recType = RecType.OwnerData;
      				}
      				else if (lineStr.startsWith(Token_InductionMotorData)) {
      					recType = RecType.InductMotorData; 
      				}
      				else if (lineStr.startsWith(Token_LineData)) {
      					recType = RecType.LineData;
      				}
      				else if (lineStr.startsWith(Token_GeneratorReactiveCapabilityCurves)) {
      					recType = RecType.GenQCurves;
      				}
      				else if (lineStr.startsWith(Token_End)) {
      					recType = RecType.End;
      				}
      				else {
      					if (recType == RecType.Title) {
      						titleRec.processLineStr(lineStr, version, parser);
      					}
      					else if (recType == RecType.Comments) {
      						commentRec.processLineStr(lineStr, version, parser);
      					}
      					else if (recType == RecType.SolutionParameters) {
      						solParamRec.processLineStr(lineStr, version, parser);
      					}
      					else if (recType == RecType.BusData) {
      						// process BusData
      						new BusDataRec(lineStr, version, parser, this.getLogger());
      					}
      					else if (recType == RecType.BranchSecData) {
      						// process Branch section Data
      						new BranchSecDataRec(lineStr, version, parser);
      					}
      					else if (recType == RecType.XfrData) {
      						// process Xfr Data
      						new XformerDataRec(lineStr, version, parser);
      					}
      					else if (recType == RecType.GenData) {
      						// process Gen Data
      						new GenDataRec(lineStr, version, parser, this.getLogger());
      					}
      					else if (recType == RecType.LoadData) {
      						// process Line Data
      						new LoadDataRec(lineStr, version, parser, this.getLogger());
      					}
      					else if (recType == RecType.ShuntData) {
      						// process Shunt Data
      						///ShuntDataRec rec = new ShuntDataRec(lineStr, version);
      					}
      					else if (recType == RecType.ConShuntData) {
      						// process Controlled Data
      						///ControlledShuntDataRec rec = new ControlledShuntDataRec(lineStr, version);
      					}
      					else if (recType == RecType.AreaData) {
      						// process Area Data
      						new NetDataRec.AreaRec(lineStr, version, parser);
      					}
      					else if (recType == RecType.ZoneData) {
      						// process Zone Data
      						new NetDataRec.ZoneRec(lineStr, version, parser);
      					}
      					else if (recType == RecType.InterfaceData) {
      						// process Interface Data
      						///GEDataRec.InterfaceRec rec = new GEDataRec.InterfaceRec(lineStr, version);
      						///rec.setInterfaceData(adjNet);
      					}
      					else if (recType == RecType.InterfaceBranchData) {
      						// process Interface Branch Data
      						///GEDataRec.InterfaceBranchRec rec = new GEDataRec.InterfaceBranchRec(lineStr, version);
      						///rec.setInterfaceBranchData(adjNet, msg);
      					}
      					else if (recType == RecType.DCBusData) {
      						// process DCBus Data
      						System.out.println("DCBusData:" + lineStr);
      					}
      					else if (recType == RecType.DCLineData) {
      						// process DCLine Data
      						System.out.println("DCLineData:" + lineStr);
      					}
      					else if (recType == RecType.DCConverterData) {
      						// process DCCon Data
      						System.out.println("DCConData:" + lineStr);
      					}
      					else if (recType == RecType.XfrZAdjData) {
      						// process XfrZAdj Data
      						System.out.println("XfrZAdjData:" + lineStr);
      					}
      					else if (recType == RecType.UPFCData) {
      						// process UPF Data
      						System.out.println("UPFData:" + lineStr);
      					} 
      					else if (recType == RecType.TransactionData) {
      						// process Transaction Data
      						System.out.println("TranData:" + lineStr);
      					}
      					else if (recType == RecType.OwnerData) {
      						// process Owner Data
      						///GEDataRec.OwnerRec rec = new GEDataRec.OwnerRec(lineStr, version);
      						///rec.setOwnerData(adjNet);
      					}
      					else if (recType == RecType.InductMotorData) {
      						// process InductMotor Data
      						System.out.println("IndMotorData:" + lineStr);
      					} 
      					else if (recType == RecType.LineData) {
      						// process Line Data
      						System.out.println("LineData:" + lineStr);
      					}
      					else if (recType == RecType.GenQCurves) {
      						// process GenQCurve Data
      						System.out.println("GenQCurveData:" + lineStr);
      					}
      					else if (recType == RecType.End) {
      						// date after end, doing nothing
      					}
      				}
      			}
    		} while (lineStr != null);
  		} catch (Exception e) {
    		throw new Exception("GE data input error, line no " + lineNo + ", " + e.toString() + "\n" + lineStr);
  		}

  		JaxbParserHelper.createBusEquivData(parser, this.getLogger());
  		
		return parser;
	}

}