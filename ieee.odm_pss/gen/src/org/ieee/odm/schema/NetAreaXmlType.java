//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.05.21 at 03:39:47 PM MST 
//


package org.ieee.odm.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetAreaXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetAreaXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="swingBusId" type="{http://www.ieee.org/odm/Schema}IDRefRecordXmlType" minOccurs="0"/>
 *         &lt;element name="alternateSwingBus" type="{http://www.ieee.org/odm/Schema}IDRefRecordXmlType" minOccurs="0"/>
 *         &lt;element name="desiredExchangePower" type="{http://www.ieee.org/odm/Schema}ActivePowerXmlType" minOccurs="0"/>
 *         &lt;element name="exchangeErrTolerance" type="{http://www.ieee.org/odm/Schema}ActivePowerXmlType" minOccurs="0"/>
 *         &lt;element name="totalExchangePower" type="{http://www.ieee.org/odm/Schema}PowerXmlType" minOccurs="0"/>
 *         &lt;element name="exchangePower" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="toArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="exchangePower" type="{http://www.ieee.org/odm/Schema}PowerXmlType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="measredOnFromSide" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ratedVoltage" type="{http://www.ieee.org/odm/Schema}VoltageXmlType" minOccurs="0"/>
 *         &lt;element name="zoneList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="zone" type="{http://www.ieee.org/odm/Schema}NetZoneXmlType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetAreaXmlType", propOrder = {
    "swingBusId",
    "alternateSwingBus",
    "desiredExchangePower",
    "exchangeErrTolerance",
    "totalExchangePower",
    "exchangePower",
    "measredOnFromSide",
    "ratedVoltage",
    "zoneList"
})
public class NetAreaXmlType {

    protected IDRefRecordXmlType swingBusId;
    protected IDRefRecordXmlType alternateSwingBus;
    protected ActivePowerXmlType desiredExchangePower;
    protected ActivePowerXmlType exchangeErrTolerance;
    protected PowerXmlType totalExchangePower;
    protected List<NetAreaXmlType.ExchangePower> exchangePower;
    protected Boolean measredOnFromSide;
    protected VoltageXmlType ratedVoltage;
    protected NetAreaXmlType.ZoneList zoneList;
    @XmlAttribute
    protected String id;
    @XmlAttribute
    protected String name;
    @XmlAttribute
    protected Integer number;

    /**
     * Gets the value of the swingBusId property.
     * 
     * @return
     *     possible object is
     *     {@link IDRefRecordXmlType }
     *     
     */
    public IDRefRecordXmlType getSwingBusId() {
        return swingBusId;
    }

    /**
     * Sets the value of the swingBusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDRefRecordXmlType }
     *     
     */
    public void setSwingBusId(IDRefRecordXmlType value) {
        this.swingBusId = value;
    }

    /**
     * Gets the value of the alternateSwingBus property.
     * 
     * @return
     *     possible object is
     *     {@link IDRefRecordXmlType }
     *     
     */
    public IDRefRecordXmlType getAlternateSwingBus() {
        return alternateSwingBus;
    }

    /**
     * Sets the value of the alternateSwingBus property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDRefRecordXmlType }
     *     
     */
    public void setAlternateSwingBus(IDRefRecordXmlType value) {
        this.alternateSwingBus = value;
    }

    /**
     * Gets the value of the desiredExchangePower property.
     * 
     * @return
     *     possible object is
     *     {@link ActivePowerXmlType }
     *     
     */
    public ActivePowerXmlType getDesiredExchangePower() {
        return desiredExchangePower;
    }

    /**
     * Sets the value of the desiredExchangePower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivePowerXmlType }
     *     
     */
    public void setDesiredExchangePower(ActivePowerXmlType value) {
        this.desiredExchangePower = value;
    }

    /**
     * Gets the value of the exchangeErrTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link ActivePowerXmlType }
     *     
     */
    public ActivePowerXmlType getExchangeErrTolerance() {
        return exchangeErrTolerance;
    }

    /**
     * Sets the value of the exchangeErrTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivePowerXmlType }
     *     
     */
    public void setExchangeErrTolerance(ActivePowerXmlType value) {
        this.exchangeErrTolerance = value;
    }

    /**
     * Gets the value of the totalExchangePower property.
     * 
     * @return
     *     possible object is
     *     {@link PowerXmlType }
     *     
     */
    public PowerXmlType getTotalExchangePower() {
        return totalExchangePower;
    }

    /**
     * Sets the value of the totalExchangePower property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerXmlType }
     *     
     */
    public void setTotalExchangePower(PowerXmlType value) {
        this.totalExchangePower = value;
    }

    /**
     * Gets the value of the exchangePower property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exchangePower property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExchangePower().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetAreaXmlType.ExchangePower }
     * 
     * 
     */
    public List<NetAreaXmlType.ExchangePower> getExchangePower() {
        if (exchangePower == null) {
            exchangePower = new ArrayList<NetAreaXmlType.ExchangePower>();
        }
        return this.exchangePower;
    }

    /**
     * Gets the value of the measredOnFromSide property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMeasredOnFromSide() {
        return measredOnFromSide;
    }

    /**
     * Sets the value of the measredOnFromSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMeasredOnFromSide(Boolean value) {
        this.measredOnFromSide = value;
    }

    /**
     * Gets the value of the ratedVoltage property.
     * 
     * @return
     *     possible object is
     *     {@link VoltageXmlType }
     *     
     */
    public VoltageXmlType getRatedVoltage() {
        return ratedVoltage;
    }

    /**
     * Sets the value of the ratedVoltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoltageXmlType }
     *     
     */
    public void setRatedVoltage(VoltageXmlType value) {
        this.ratedVoltage = value;
    }

    /**
     * Gets the value of the zoneList property.
     * 
     * @return
     *     possible object is
     *     {@link NetAreaXmlType.ZoneList }
     *     
     */
    public NetAreaXmlType.ZoneList getZoneList() {
        return zoneList;
    }

    /**
     * Sets the value of the zoneList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetAreaXmlType.ZoneList }
     *     
     */
    public void setZoneList(NetAreaXmlType.ZoneList value) {
        this.zoneList = value;
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
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumber(Integer value) {
        this.number = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="toArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="exchangePower" type="{http://www.ieee.org/odm/Schema}PowerXmlType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "toArea",
        "exchangePower"
    })
    public static class ExchangePower {

        protected String toArea;
        @XmlElement(required = true)
        protected PowerXmlType exchangePower;

        /**
         * Gets the value of the toArea property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getToArea() {
            return toArea;
        }

        /**
         * Sets the value of the toArea property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setToArea(String value) {
            this.toArea = value;
        }

        /**
         * Gets the value of the exchangePower property.
         * 
         * @return
         *     possible object is
         *     {@link PowerXmlType }
         *     
         */
        public PowerXmlType getExchangePower() {
            return exchangePower;
        }

        /**
         * Sets the value of the exchangePower property.
         * 
         * @param value
         *     allowed object is
         *     {@link PowerXmlType }
         *     
         */
        public void setExchangePower(PowerXmlType value) {
            this.exchangePower = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="zone" type="{http://www.ieee.org/odm/Schema}NetZoneXmlType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "zone"
    })
    public static class ZoneList {

        protected List<NetZoneXmlType> zone;

        /**
         * Gets the value of the zone property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the zone property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getZone().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NetZoneXmlType }
         * 
         * 
         */
        public List<NetZoneXmlType> getZone() {
            if (zone == null) {
                zone = new ArrayList<NetZoneXmlType>();
            }
            return this.zone;
        }

    }

}
