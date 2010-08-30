//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.30 at 08:25:32 AM GMT-05:00 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for XformrtConnectionEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="XformrtConnectionEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Wye"/>
 *     &lt;enumeration value="Delta"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum XformrtConnectionEnumType {

    @XmlEnumValue("Wye")
    WYE("Wye"),
    @XmlEnumValue("Delta")
    DELTA("Delta");
    private final String value;

    XformrtConnectionEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XformrtConnectionEnumType fromValue(String v) {
        for (XformrtConnectionEnumType c: XformrtConnectionEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
