//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.01 at 07:21:18 AM GMT-05:00 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Only "simple" fault could be simulated, meaning at any time there should be on active fault event, although
 *         any number of faults could be defined.
 *         
 * 
 * <p>Java class for DynamicEventXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DynamicEventXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="startTime" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="duration" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType" minOccurs="0"/>
 *         &lt;element name="permanentFault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="fault" type="{http://www.ieee.org/odm/Schema/2008}AcscFaultXmlType" minOccurs="0"/>
 *           &lt;element name="loadChangeData" type="{http://www.ieee.org/odm/Schema/2008}DStabLoadChangeXmlType" minOccurs="0"/>
 *           &lt;element name="setPointChangeData" type="{http://www.ieee.org/odm/Schema/2008}DStabSetPointChangeXmlType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="eventType" type="{http://www.ieee.org/odm/Schema/2008}DynamicEventEnumType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicEventXmlType", propOrder = {
    "startTime",
    "duration",
    "permanentFault",
    "fault",
    "loadChangeData",
    "setPointChangeData"
})
public class DynamicEventXmlType {

    @XmlElement(required = true)
    protected TimePeriodXmlType startTime;
    protected TimePeriodXmlType duration;
    protected Boolean permanentFault;
    protected AcscFaultXmlType fault;
    protected DStabLoadChangeXmlType loadChangeData;
    protected DStabSetPointChangeXmlType setPointChangeData;
    @XmlAttribute
    protected String id;
    @XmlAttribute
    protected String name;
    @XmlAttribute
    protected DynamicEventEnumType eventType;

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setStartTime(TimePeriodXmlType value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setDuration(TimePeriodXmlType value) {
        this.duration = value;
    }

    /**
     * Gets the value of the permanentFault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermanentFault() {
        return permanentFault;
    }

    /**
     * Sets the value of the permanentFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermanentFault(Boolean value) {
        this.permanentFault = value;
    }

    /**
     * Gets the value of the fault property.
     * 
     * @return
     *     possible object is
     *     {@link AcscFaultXmlType }
     *     
     */
    public AcscFaultXmlType getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcscFaultXmlType }
     *     
     */
    public void setFault(AcscFaultXmlType value) {
        this.fault = value;
    }

    /**
     * Gets the value of the loadChangeData property.
     * 
     * @return
     *     possible object is
     *     {@link DStabLoadChangeXmlType }
     *     
     */
    public DStabLoadChangeXmlType getLoadChangeData() {
        return loadChangeData;
    }

    /**
     * Sets the value of the loadChangeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DStabLoadChangeXmlType }
     *     
     */
    public void setLoadChangeData(DStabLoadChangeXmlType value) {
        this.loadChangeData = value;
    }

    /**
     * Gets the value of the setPointChangeData property.
     * 
     * @return
     *     possible object is
     *     {@link DStabSetPointChangeXmlType }
     *     
     */
    public DStabSetPointChangeXmlType getSetPointChangeData() {
        return setPointChangeData;
    }

    /**
     * Sets the value of the setPointChangeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DStabSetPointChangeXmlType }
     *     
     */
    public void setSetPointChangeData(DStabSetPointChangeXmlType value) {
        this.setPointChangeData = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicEventEnumType }
     *     
     */
    public DynamicEventEnumType getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicEventEnumType }
     *     
     */
    public void setEventType(DynamicEventEnumType value) {
        this.eventType = value;
    }

}
