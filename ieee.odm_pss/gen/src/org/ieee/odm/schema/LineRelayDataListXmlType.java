//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.06.19 at 08:28:58 AM GMT-08:00 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineRelayDataListXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineRelayDataListXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lineRelay" type="{http://www.ieee.org/odm/Schema}LineRelayXmlType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineRelayDataListXmlType", propOrder = {
    "lineRelay"
})
public class LineRelayDataListXmlType {

    protected LineRelayXmlType lineRelay;

    /**
     * Gets the value of the lineRelay property.
     * 
     * @return
     *     possible object is
     *     {@link LineRelayXmlType }
     *     
     */
    public LineRelayXmlType getLineRelay() {
        return lineRelay;
    }

    /**
     * Sets the value of the lineRelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRelayXmlType }
     *     
     */
    public void setLineRelay(LineRelayXmlType value) {
        this.lineRelay = value;
    }

}
