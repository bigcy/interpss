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
 * <p>Java class for PVModuleDataEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PVModuleDataEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Points"/>
 *     &lt;enumeration value="Function"/>
 *     &lt;enumeration value="value"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum PVModuleDataEnumType {

    @XmlEnumValue("Points")
    POINTS("Points"),
    @XmlEnumValue("Function")
    FUNCTION("Function"),
    @XmlEnumValue("value")
    VALUE("value");
    private final String value;

    PVModuleDataEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PVModuleDataEnumType fromValue(String v) {
        for (PVModuleDataEnumType c: PVModuleDataEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
