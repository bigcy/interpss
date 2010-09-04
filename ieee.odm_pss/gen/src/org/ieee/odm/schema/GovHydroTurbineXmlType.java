//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.09.03 at 09:00:05 PM GMT-05:00 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GovHydroTurbineXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GovHydroTurbineXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}GovernorModelXmlType">
 *       &lt;sequence>
 *         &lt;element name="R" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TG" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="TP" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="TD" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="PMAX" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TWhalf" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="Uo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Uc" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="D4" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GovHydroTurbineXmlType", propOrder = {
    "r",
    "tg",
    "tp",
    "td",
    "pmax",
    "tWhalf",
    "uo",
    "uc",
    "d4"
})
public class GovHydroTurbineXmlType
    extends GovernorModelXmlType
{

    @XmlElement(name = "R")
    protected double r;
    @XmlElement(name = "TG", required = true)
    protected TimePeriodXmlType tg;
    @XmlElement(name = "TP", required = true)
    protected TimePeriodXmlType tp;
    @XmlElement(name = "TD", required = true)
    protected TimePeriodXmlType td;
    @XmlElement(name = "PMAX")
    protected double pmax;
    @XmlElement(name = "TWhalf", required = true)
    protected TimePeriodXmlType tWhalf;
    @XmlElement(name = "Uo")
    protected double uo;
    @XmlElement(name = "Uc")
    protected double uc;
    @XmlElement(name = "D4")
    protected double d4;

    /**
     * Gets the value of the r property.
     * 
     */
    public double getR() {
        return r;
    }

    /**
     * Sets the value of the r property.
     * 
     */
    public void setR(double value) {
        this.r = value;
    }

    /**
     * Gets the value of the tg property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getTG() {
        return tg;
    }

    /**
     * Sets the value of the tg property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setTG(TimePeriodXmlType value) {
        this.tg = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getTP() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setTP(TimePeriodXmlType value) {
        this.tp = value;
    }

    /**
     * Gets the value of the td property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getTD() {
        return td;
    }

    /**
     * Sets the value of the td property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setTD(TimePeriodXmlType value) {
        this.td = value;
    }

    /**
     * Gets the value of the pmax property.
     * 
     */
    public double getPMAX() {
        return pmax;
    }

    /**
     * Sets the value of the pmax property.
     * 
     */
    public void setPMAX(double value) {
        this.pmax = value;
    }

    /**
     * Gets the value of the tWhalf property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getTWhalf() {
        return tWhalf;
    }

    /**
     * Sets the value of the tWhalf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setTWhalf(TimePeriodXmlType value) {
        this.tWhalf = value;
    }

    /**
     * Gets the value of the uo property.
     * 
     */
    public double getUo() {
        return uo;
    }

    /**
     * Sets the value of the uo property.
     * 
     */
    public void setUo(double value) {
        this.uo = value;
    }

    /**
     * Gets the value of the uc property.
     * 
     */
    public double getUc() {
        return uc;
    }

    /**
     * Sets the value of the uc property.
     * 
     */
    public void setUc(double value) {
        this.uc = value;
    }

    /**
     * Gets the value of the d4 property.
     * 
     */
    public double getD4() {
        return d4;
    }

    /**
     * Sets the value of the d4 property.
     * 
     */
    public void setD4(double value) {
        this.d4 = value;
    }

}
