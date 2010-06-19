//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.06.19 at 08:28:58 AM GMT-08:00 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StabilizerXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StabilizerXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locatedBus" type="{http://www.ieee.org/odm/Schema}IDRefRecordXmlType"/>
 *         &lt;element name="busRatedVoltage" type="{http://www.ieee.org/odm/Schema}VoltageXmlType" minOccurs="0"/>
 *         &lt;element name="stabilizerType" type="{http://www.ieee.org/odm/Schema}StabilizerEnumType"/>
 *         &lt;element name="stabilizerModel" type="{http://www.ieee.org/odm/Schema}StabilizerModelListXmlType"/>
 *         &lt;element name="macId" type="{http://www.ieee.org/odm/Schema}IDRefRecordXmlType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StabilizerXmlType", propOrder = {
    "locatedBus",
    "busRatedVoltage",
    "stabilizerType",
    "stabilizerModel",
    "macId"
})
public class StabilizerXmlType {

    @XmlElement(required = true)
    protected IDRefRecordXmlType locatedBus;
    protected VoltageXmlType busRatedVoltage;
    @XmlElement(required = true)
    protected StabilizerEnumType stabilizerType;
    @XmlElement(required = true)
    protected StabilizerModelListXmlType stabilizerModel;
    protected IDRefRecordXmlType macId;

    /**
     * Gets the value of the locatedBus property.
     * 
     * @return
     *     possible object is
     *     {@link IDRefRecordXmlType }
     *     
     */
    public IDRefRecordXmlType getLocatedBus() {
        return locatedBus;
    }

    /**
     * Sets the value of the locatedBus property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDRefRecordXmlType }
     *     
     */
    public void setLocatedBus(IDRefRecordXmlType value) {
        this.locatedBus = value;
    }

    /**
     * Gets the value of the busRatedVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link VoltageXmlType }
     *     
     */
    public VoltageXmlType getBusRatedVoltage() {
        return busRatedVoltage;
    }

    /**
     * Sets the value of the busRatedVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoltageXmlType }
     *     
     */
    public void setBusRatedVoltage(VoltageXmlType value) {
        this.busRatedVoltage = value;
    }

    /**
     * Gets the value of the stabilizerType property.
     * 
     * @return
     *     possible object is
     *     {@link StabilizerEnumType }
     *     
     */
    public StabilizerEnumType getStabilizerType() {
        return stabilizerType;
    }

    /**
     * Sets the value of the stabilizerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StabilizerEnumType }
     *     
     */
    public void setStabilizerType(StabilizerEnumType value) {
        this.stabilizerType = value;
    }

    /**
     * Gets the value of the stabilizerModel property.
     * 
     * @return
     *     possible object is
     *     {@link StabilizerModelListXmlType }
     *     
     */
    public StabilizerModelListXmlType getStabilizerModel() {
        return stabilizerModel;
    }

    /**
     * Sets the value of the stabilizerModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link StabilizerModelListXmlType }
     *     
     */
    public void setStabilizerModel(StabilizerModelListXmlType value) {
        this.stabilizerModel = value;
    }

    /**
     * Gets the value of the macId property.
     * 
     * @return
     *     possible object is
     *     {@link IDRefRecordXmlType }
     *     
     */
    public IDRefRecordXmlType getMacId() {
        return macId;
    }

    /**
     * Sets the value of the macId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDRefRecordXmlType }
     *     
     */
    public void setMacId(IDRefRecordXmlType value) {
        this.macId = value;
    }

}
