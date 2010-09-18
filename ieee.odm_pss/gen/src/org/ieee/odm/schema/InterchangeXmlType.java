//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.09.18 at 03:50:12 PM GMT-05:00 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for InterchangeXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterchangeXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="powerEx" type="{http://www.ieee.org/odm/Schema/2008}PowerInterchangeXmlType" minOccurs="0"/>
 *         &lt;element name="ucteExchange" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fromIsoId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="toIsoId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="exchangePower" type="{http://www.ieee.org/odm/Schema/2008}PowerXmlType"/>
 *                   &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="areaTransfer" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *                 &lt;attribute name="fromArea" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="toArea" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="amountMW" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterchangeXmlType", propOrder = {
    "powerEx",
    "ucteExchange",
    "areaTransfer"
})
public class InterchangeXmlType {

    protected PowerInterchangeXmlType powerEx;
    protected InterchangeXmlType.UcteExchange ucteExchange;
    protected InterchangeXmlType.AreaTransfer areaTransfer;

    /**
     * Gets the value of the powerEx property.
     * 
     * @return
     *     possible object is
     *     {@link PowerInterchangeXmlType }
     *     
     */
    public PowerInterchangeXmlType getPowerEx() {
        return powerEx;
    }

    /**
     * Sets the value of the powerEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerInterchangeXmlType }
     *     
     */
    public void setPowerEx(PowerInterchangeXmlType value) {
        this.powerEx = value;
    }

    /**
     * Gets the value of the ucteExchange property.
     * 
     * @return
     *     possible object is
     *     {@link InterchangeXmlType.UcteExchange }
     *     
     */
    public InterchangeXmlType.UcteExchange getUcteExchange() {
        return ucteExchange;
    }

    /**
     * Sets the value of the ucteExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterchangeXmlType.UcteExchange }
     *     
     */
    public void setUcteExchange(InterchangeXmlType.UcteExchange value) {
        this.ucteExchange = value;
    }

    /**
     * Gets the value of the areaTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link InterchangeXmlType.AreaTransfer }
     *     
     */
    public InterchangeXmlType.AreaTransfer getAreaTransfer() {
        return areaTransfer;
    }

    /**
     * Sets the value of the areaTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterchangeXmlType.AreaTransfer }
     *     
     */
    public void setAreaTransfer(InterchangeXmlType.AreaTransfer value) {
        this.areaTransfer = value;
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
     *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *       &lt;attribute name="fromArea" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="toArea" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="amountMW" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AreaTransfer {

        @XmlAttribute(required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;
        @XmlAttribute(required = true)
        protected int fromArea;
        @XmlAttribute(required = true)
        protected int toArea;
        @XmlAttribute(required = true)
        protected double amountMW;

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
         * Gets the value of the fromArea property.
         * 
         */
        public int getFromArea() {
            return fromArea;
        }

        /**
         * Sets the value of the fromArea property.
         * 
         */
        public void setFromArea(int value) {
            this.fromArea = value;
        }

        /**
         * Gets the value of the toArea property.
         * 
         */
        public int getToArea() {
            return toArea;
        }

        /**
         * Sets the value of the toArea property.
         * 
         */
        public void setToArea(int value) {
            this.toArea = value;
        }

        /**
         * Gets the value of the amountMW property.
         * 
         */
        public double getAmountMW() {
            return amountMW;
        }

        /**
         * Sets the value of the amountMW property.
         * 
         */
        public void setAmountMW(double value) {
            this.amountMW = value;
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
     *         &lt;element name="fromIsoId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="toIsoId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="exchangePower" type="{http://www.ieee.org/odm/Schema/2008}PowerXmlType"/>
     *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "fromIsoId",
        "toIsoId",
        "exchangePower",
        "comment"
    })
    public static class UcteExchange {

        @XmlElement(required = true)
        protected String fromIsoId;
        @XmlElement(required = true)
        protected String toIsoId;
        @XmlElement(required = true)
        protected PowerXmlType exchangePower;
        protected String comment;

        /**
         * Gets the value of the fromIsoId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFromIsoId() {
            return fromIsoId;
        }

        /**
         * Sets the value of the fromIsoId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFromIsoId(String value) {
            this.fromIsoId = value;
        }

        /**
         * Gets the value of the toIsoId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getToIsoId() {
            return toIsoId;
        }

        /**
         * Sets the value of the toIsoId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setToIsoId(String value) {
            this.toIsoId = value;
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

        /**
         * Gets the value of the comment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComment() {
            return comment;
        }

        /**
         * Sets the value of the comment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComment(String value) {
            this.comment = value;
        }

    }

}
