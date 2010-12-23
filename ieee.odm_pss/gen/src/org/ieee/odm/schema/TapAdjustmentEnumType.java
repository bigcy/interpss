//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.23 at 11:13:49 AM GMT-05:00 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for TapAdjustmentEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TapAdjustmentEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Voltage"/>
 *     &lt;enumeration value="MVarFlow"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum TapAdjustmentEnumType {

    @XmlEnumValue("Voltage")
    VOLTAGE("Voltage"),
    @XmlEnumValue("MVarFlow")
    M_VAR_FLOW("MVarFlow");
    private final String value;

    TapAdjustmentEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TapAdjustmentEnumType fromValue(String v) {
        for (TapAdjustmentEnumType c: TapAdjustmentEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
