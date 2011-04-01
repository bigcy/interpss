//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.01 at 07:21:18 AM GMT-05:00 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoadChangeDynamicEventXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadChangeDynamicEventXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loadChangeCategory" type="{http://www.ieee.org/odm/Schema/2008}LoadChangeCategoryEnumType" minOccurs="0"/>
 *         &lt;element name="bus" type="{http://www.ieee.org/odm/Schema/2008}IDRefRecordXmlType" minOccurs="0"/>
 *         &lt;element name="busRatedVoltage" type="{http://www.ieee.org/odm/Schema/2008}VoltageXmlType" minOccurs="0"/>
 *         &lt;element name="operationTime" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType" minOccurs="0"/>
 *         &lt;element name="operateAtFrequence" type="{http://www.ieee.org/odm/Schema/2008}FrequencyXmlType" minOccurs="0"/>
 *         &lt;element name="operateAtVoltage" type="{http://www.ieee.org/odm/Schema/2008}VoltageXmlType" minOccurs="0"/>
 *         &lt;element name="operationDelayTime" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType" minOccurs="0"/>
 *         &lt;element name="constantPChange" type="{http://www.ieee.org/odm/Schema/2008}PowerXmlType" minOccurs="0"/>
 *         &lt;element name="constantIChange" type="{http://www.ieee.org/odm/Schema/2008}PowerXmlType" minOccurs="0"/>
 *         &lt;element name="constantZChange" type="{http://www.ieee.org/odm/Schema/2008}PowerXmlType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadChangeDynamicEventXmlType", propOrder = {
    "loadChangeCategory",
    "bus",
    "busRatedVoltage",
    "operationTime",
    "operateAtFrequence",
    "operateAtVoltage",
    "operationDelayTime",
    "constantPChange",
    "constantIChange",
    "constantZChange"
})
public class LoadChangeDynamicEventXmlType {

    protected LoadChangeCategoryEnumType loadChangeCategory;
    protected IDRefRecordXmlType bus;
    protected VoltageXmlType busRatedVoltage;
    protected TimePeriodXmlType operationTime;
    protected FrequencyXmlType operateAtFrequence;
    protected VoltageXmlType operateAtVoltage;
    protected TimePeriodXmlType operationDelayTime;
    protected PowerXmlType constantPChange;
    protected PowerXmlType constantIChange;
    protected PowerXmlType constantZChange;

    /**
     * Gets the value of the loadChangeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link LoadChangeCategoryEnumType }
     *     
     */
    public LoadChangeCategoryEnumType getLoadChangeCategory() {
        return loadChangeCategory;
    }

    /**
     * Sets the value of the loadChangeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadChangeCategoryEnumType }
     *     
     */
    public void setLoadChangeCategory(LoadChangeCategoryEnumType value) {
        this.loadChangeCategory = value;
    }

    /**
     * Gets the value of the bus property.
     * 
     * @return
     *     possible object is
     *     {@link IDRefRecordXmlType }
     *     
     */
    public IDRefRecordXmlType getBus() {
        return bus;
    }

    /**
     * Sets the value of the bus property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDRefRecordXmlType }
     *     
     */
    public void setBus(IDRefRecordXmlType value) {
        this.bus = value;
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
     * Gets the value of the operationTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getOperationTime() {
        return operationTime;
    }

    /**
     * Sets the value of the operationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setOperationTime(TimePeriodXmlType value) {
        this.operationTime = value;
    }

    /**
     * Gets the value of the operateAtFrequence property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyXmlType }
     *     
     */
    public FrequencyXmlType getOperateAtFrequence() {
        return operateAtFrequence;
    }

    /**
     * Sets the value of the operateAtFrequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyXmlType }
     *     
     */
    public void setOperateAtFrequence(FrequencyXmlType value) {
        this.operateAtFrequence = value;
    }

    /**
     * Gets the value of the operateAtVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link VoltageXmlType }
     *     
     */
    public VoltageXmlType getOperateAtVoltage() {
        return operateAtVoltage;
    }

    /**
     * Sets the value of the operateAtVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoltageXmlType }
     *     
     */
    public void setOperateAtVoltage(VoltageXmlType value) {
        this.operateAtVoltage = value;
    }

    /**
     * Gets the value of the operationDelayTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getOperationDelayTime() {
        return operationDelayTime;
    }

    /**
     * Sets the value of the operationDelayTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setOperationDelayTime(TimePeriodXmlType value) {
        this.operationDelayTime = value;
    }

    /**
     * Gets the value of the constantPChange property.
     * 
     * @return
     *     possible object is
     *     {@link PowerXmlType }
     *     
     */
    public PowerXmlType getConstantPChange() {
        return constantPChange;
    }

    /**
     * Sets the value of the constantPChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerXmlType }
     *     
     */
    public void setConstantPChange(PowerXmlType value) {
        this.constantPChange = value;
    }

    /**
     * Gets the value of the constantIChange property.
     * 
     * @return
     *     possible object is
     *     {@link PowerXmlType }
     *     
     */
    public PowerXmlType getConstantIChange() {
        return constantIChange;
    }

    /**
     * Sets the value of the constantIChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerXmlType }
     *     
     */
    public void setConstantIChange(PowerXmlType value) {
        this.constantIChange = value;
    }

    /**
     * Gets the value of the constantZChange property.
     * 
     * @return
     *     possible object is
     *     {@link PowerXmlType }
     *     
     */
    public PowerXmlType getConstantZChange() {
        return constantZChange;
    }

    /**
     * Sets the value of the constantZChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerXmlType }
     *     
     */
    public void setConstantZChange(PowerXmlType value) {
        this.constantZChange = value;
    }

}
