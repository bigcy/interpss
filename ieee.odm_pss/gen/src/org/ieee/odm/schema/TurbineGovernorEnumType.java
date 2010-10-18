//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.10.03 at 07:43:49 PM GMT-05:00 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for TurbineGovernorEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TurbineGovernorEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IEEE1981Type1"/>
 *     &lt;enumeration value="IEEE1981Type2"/>
 *     &lt;enumeration value="IEEE1981Type3"/>
 *     &lt;enumeration value="HydroStreamGeneralModel"/>
 *     &lt;enumeration value="HydroGovernerAndTurbine"/>
 *     &lt;enumeration value="HydroGoverner"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum TurbineGovernorEnumType {

    @XmlEnumValue("IEEE1981Type1")
    IEEE_1981_TYPE_1("IEEE1981Type1"),
    @XmlEnumValue("IEEE1981Type2")
    IEEE_1981_TYPE_2("IEEE1981Type2"),
    @XmlEnumValue("IEEE1981Type3")
    IEEE_1981_TYPE_3("IEEE1981Type3"),
    @XmlEnumValue("HydroStreamGeneralModel")
    HYDRO_STREAM_GENERAL_MODEL("HydroStreamGeneralModel"),
    @XmlEnumValue("HydroGovernerAndTurbine")
    HYDRO_GOVERNER_AND_TURBINE("HydroGovernerAndTurbine"),
    @XmlEnumValue("HydroGoverner")
    HYDRO_GOVERNER("HydroGoverner");
    private final String value;

    TurbineGovernorEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TurbineGovernorEnumType fromValue(String v) {
        for (TurbineGovernorEnumType c: TurbineGovernorEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
