//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.01.16 at 12:21:47 PM GMT-05:00 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExcIEEETypeDC2XmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExcIEEETypeDC2XmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}ExcSimpleTypeXmlType">
 *       &lt;sequence>
 *         &lt;element name="TR" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="TB" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="TC" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="KE" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TE" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="KF" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TF1" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="E1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SE1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="E2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SE2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcIEEETypeDC2XmlType", propOrder = {
    "tr",
    "tb",
    "tc",
    "ke",
    "te",
    "kf",
    "tf1",
    "e1",
    "se1",
    "e2",
    "se2"
})
public class ExcIEEETypeDC2XmlType
    extends ExcSimpleTypeXmlType
{

    @XmlElement(name = "TR", required = true)
    protected TimePeriodXmlType tr;
    @XmlElement(name = "TB", required = true)
    protected TimePeriodXmlType tb;
    @XmlElement(name = "TC", required = true)
    protected TimePeriodXmlType tc;
    @XmlElement(name = "KE")
    protected double ke;
    @XmlElement(name = "TE", required = true)
    protected TimePeriodXmlType te;
    @XmlElement(name = "KF")
    protected double kf;
    @XmlElement(name = "TF1", required = true)
    protected TimePeriodXmlType tf1;
    @XmlElement(name = "E1")
    protected double e1;
    @XmlElement(name = "SE1")
    protected double se1;
    @XmlElement(name = "E2")
    protected double e2;
    @XmlElement(name = "SE2")
    protected double se2;

    /**
     * Gets the value of the tr property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getTR() {
        return tr;
    }

    /**
     * Sets the value of the tr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setTR(TimePeriodXmlType value) {
        this.tr = value;
    }

    /**
     * Gets the value of the tb property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getTB() {
        return tb;
    }

    /**
     * Sets the value of the tb property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setTB(TimePeriodXmlType value) {
        this.tb = value;
    }

    /**
     * Gets the value of the tc property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getTC() {
        return tc;
    }

    /**
     * Sets the value of the tc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setTC(TimePeriodXmlType value) {
        this.tc = value;
    }

    /**
     * Gets the value of the ke property.
     * 
     */
    public double getKE() {
        return ke;
    }

    /**
     * Sets the value of the ke property.
     * 
     */
    public void setKE(double value) {
        this.ke = value;
    }

    /**
     * Gets the value of the te property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getTE() {
        return te;
    }

    /**
     * Sets the value of the te property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setTE(TimePeriodXmlType value) {
        this.te = value;
    }

    /**
     * Gets the value of the kf property.
     * 
     */
    public double getKF() {
        return kf;
    }

    /**
     * Sets the value of the kf property.
     * 
     */
    public void setKF(double value) {
        this.kf = value;
    }

    /**
     * Gets the value of the tf1 property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getTF1() {
        return tf1;
    }

    /**
     * Sets the value of the tf1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setTF1(TimePeriodXmlType value) {
        this.tf1 = value;
    }

    /**
     * Gets the value of the e1 property.
     * 
     */
    public double getE1() {
        return e1;
    }

    /**
     * Sets the value of the e1 property.
     * 
     */
    public void setE1(double value) {
        this.e1 = value;
    }

    /**
     * Gets the value of the se1 property.
     * 
     */
    public double getSE1() {
        return se1;
    }

    /**
     * Sets the value of the se1 property.
     * 
     */
    public void setSE1(double value) {
        this.se1 = value;
    }

    /**
     * Gets the value of the e2 property.
     * 
     */
    public double getE2() {
        return e2;
    }

    /**
     * Sets the value of the e2 property.
     * 
     */
    public void setE2(double value) {
        this.e2 = value;
    }

    /**
     * Gets the value of the se2 property.
     * 
     */
    public double getSE2() {
        return se2;
    }

    /**
     * Sets the value of the se2 property.
     * 
     */
    public void setSE2(double value) {
        this.se2 = value;
    }

}
