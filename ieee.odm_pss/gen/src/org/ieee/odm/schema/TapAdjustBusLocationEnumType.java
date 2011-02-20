//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.20 at 12:17:33 PM GMT-05:00 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for TapAdjustBusLocationEnumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TapAdjustBusLocationEnumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TerminalBus"/>
 *     &lt;enumeration value="NearFromBus"/>
 *     &lt;enumeration value="NearToBus"/>
 *     &lt;enumeration value="FromBus"/>
 *     &lt;enumeration value="ToBus"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum TapAdjustBusLocationEnumType {

    @XmlEnumValue("TerminalBus")
    TERMINAL_BUS("TerminalBus"),
    @XmlEnumValue("NearFromBus")
    NEAR_FROM_BUS("NearFromBus"),
    @XmlEnumValue("NearToBus")
    NEAR_TO_BUS("NearToBus"),
    @XmlEnumValue("FromBus")
    FROM_BUS("FromBus"),
    @XmlEnumValue("ToBus")
    TO_BUS("ToBus");
    private final String value;

    TapAdjustBusLocationEnumType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TapAdjustBusLocationEnumType fromValue(String v) {
        for (TapAdjustBusLocationEnumType c: TapAdjustBusLocationEnumType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
