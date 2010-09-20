//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.09.19 at 07:43:52 PM GMT-05:00 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for BranchMeterLocationEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BranchMeterLocationEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FromSide"/>
 *     &lt;enumeration value="ToSide"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum BranchMeterLocationEnumType {

    @XmlEnumValue("FromSide")
    FROM_SIDE("FromSide"),
    @XmlEnumValue("ToSide")
    TO_SIDE("ToSide");
    private final String value;

    BranchMeterLocationEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BranchMeterLocationEnumType fromValue(String v) {
        for (BranchMeterLocationEnumType c: BranchMeterLocationEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
