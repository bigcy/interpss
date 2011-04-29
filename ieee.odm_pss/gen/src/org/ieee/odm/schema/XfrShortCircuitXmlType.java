//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.29 at 07:02:33 AM GMT-05:00 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XfrShortCircuitXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XfrShortCircuitXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}XfrBranchXmlType">
 *       &lt;sequence>
 *         &lt;element name="z0" type="{http://www.ieee.org/odm/Schema/2008}ZXmlType" minOccurs="0"/>
 *         &lt;element name="fromSideConnection" type="{http://www.ieee.org/odm/Schema/2008}XformerConnectionXmlType" minOccurs="0"/>
 *         &lt;element name="toSideConnection" type="{http://www.ieee.org/odm/Schema/2008}XformerConnectionXmlType" minOccurs="0"/>
 *         &lt;element name="xfrZeroSeq" type="{http://www.ieee.org/odm/Schema/2008}TransformerZeroSeqXmlType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XfrShortCircuitXmlType", propOrder = {
    "z0",
    "fromSideConnection",
    "toSideConnection",
    "xfrZeroSeq"
})
@XmlSeeAlso({
    XfrDStabXmlType.class
})
public class XfrShortCircuitXmlType
    extends XfrBranchXmlType
{

    protected ZXmlType z0;
    protected XformerConnectionXmlType fromSideConnection;
    protected XformerConnectionXmlType toSideConnection;
    protected TransformerZeroSeqXmlType xfrZeroSeq;

    /**
     * Gets the value of the z0 property.
     * 
     * @return
     *     possible object is
     *     {@link ZXmlType }
     *     
     */
    public ZXmlType getZ0() {
        return z0;
    }

    /**
     * Sets the value of the z0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZXmlType }
     *     
     */
    public void setZ0(ZXmlType value) {
        this.z0 = value;
    }

    /**
     * Gets the value of the fromSideConnection property.
     * 
     * @return
     *     possible object is
     *     {@link XformerConnectionXmlType }
     *     
     */
    public XformerConnectionXmlType getFromSideConnection() {
        return fromSideConnection;
    }

    /**
     * Sets the value of the fromSideConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link XformerConnectionXmlType }
     *     
     */
    public void setFromSideConnection(XformerConnectionXmlType value) {
        this.fromSideConnection = value;
    }

    /**
     * Gets the value of the toSideConnection property.
     * 
     * @return
     *     possible object is
     *     {@link XformerConnectionXmlType }
     *     
     */
    public XformerConnectionXmlType getToSideConnection() {
        return toSideConnection;
    }

    /**
     * Sets the value of the toSideConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link XformerConnectionXmlType }
     *     
     */
    public void setToSideConnection(XformerConnectionXmlType value) {
        this.toSideConnection = value;
    }

    /**
     * Gets the value of the xfrZeroSeq property.
     * 
     * @return
     *     possible object is
     *     {@link TransformerZeroSeqXmlType }
     *     
     */
    public TransformerZeroSeqXmlType getXfrZeroSeq() {
        return xfrZeroSeq;
    }

    /**
     * Sets the value of the xfrZeroSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformerZeroSeqXmlType }
     *     
     */
    public void setXfrZeroSeq(TransformerZeroSeqXmlType value) {
        this.xfrZeroSeq = value;
    }

}
