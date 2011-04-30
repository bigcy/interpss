//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.29 at 11:34:17 PM GMT-05:00 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for AnalysisCategoryEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AnalysisCategoryEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Loadflow"/>
 *     &lt;enumeration value="ShortCircuit"/>
 *     &lt;enumeration value="TransientStability"/>
 *     &lt;enumeration value="OPF"/>
 *     &lt;enumeration value="DistributionAnalysis"/>
 *     &lt;enumeration value="DcSystemAnalysis"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum AnalysisCategoryEnumType {

    @XmlEnumValue("Loadflow")
    LOADFLOW("Loadflow"),
    @XmlEnumValue("ShortCircuit")
    SHORT_CIRCUIT("ShortCircuit"),
    @XmlEnumValue("TransientStability")
    TRANSIENT_STABILITY("TransientStability"),
    OPF("OPF"),
    @XmlEnumValue("DistributionAnalysis")
    DISTRIBUTION_ANALYSIS("DistributionAnalysis"),
    @XmlEnumValue("DcSystemAnalysis")
    DC_SYSTEM_ANALYSIS("DcSystemAnalysis");
    private final String value;

    AnalysisCategoryEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AnalysisCategoryEnumType fromValue(String v) {
        for (AnalysisCategoryEnumType c: AnalysisCategoryEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
