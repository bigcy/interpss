//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.06.02 at 03:49:36 ���� CST 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExcBPAFUXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExcBPAFUXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}ExcSimpleTypeXmlType">
 *       &lt;sequence>
 *         &lt;element name="K" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="KV" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="T1" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType" minOccurs="0"/>
 *         &lt;element name="T2" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType" minOccurs="0"/>
 *         &lt;element name="VA1MAX" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="VA1MIN" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="T3" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="T4" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="VAMAX" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="VAMIN" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="KF" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TF" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="KC" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcBPAFUXmlType", propOrder = {
    "k",
    "kv",
    "t1",
    "t2",
    "va1MAX",
    "va1MIN",
    "t3",
    "t4",
    "vamax",
    "vamin",
    "kf",
    "tf",
    "kc"
})
public class ExcBPAFUXmlType
    extends ExcSimpleTypeXmlType
{

    @XmlElement(name = "K", namespace = "http://www.ieee.org/odm/Schema/2008")
    protected double k;
    @XmlElement(name = "KV", namespace = "http://www.ieee.org/odm/Schema/2008")
    protected double kv;
    @XmlElement(name = "T1", namespace = "http://www.ieee.org/odm/Schema/2008")
    protected TimePeriodXmlType t1;
    @XmlElement(name = "T2", namespace = "http://www.ieee.org/odm/Schema/2008")
    protected TimePeriodXmlType t2;
    @XmlElement(name = "VA1MAX", namespace = "http://www.ieee.org/odm/Schema/2008")
    protected double va1MAX;
    @XmlElement(name = "VA1MIN", namespace = "http://www.ieee.org/odm/Schema/2008")
    protected double va1MIN;
    @XmlElement(name = "T3", namespace = "http://www.ieee.org/odm/Schema/2008", required = true)
    protected TimePeriodXmlType t3;
    @XmlElement(name = "T4", namespace = "http://www.ieee.org/odm/Schema/2008", required = true)
    protected TimePeriodXmlType t4;
    @XmlElement(name = "VAMAX", namespace = "http://www.ieee.org/odm/Schema/2008")
    protected double vamax;
    @XmlElement(name = "VAMIN", namespace = "http://www.ieee.org/odm/Schema/2008")
    protected double vamin;
    @XmlElement(name = "KF", namespace = "http://www.ieee.org/odm/Schema/2008")
    protected double kf;
    @XmlElement(name = "TF", namespace = "http://www.ieee.org/odm/Schema/2008", required = true)
    protected TimePeriodXmlType tf;
    @XmlElement(name = "KC", namespace = "http://www.ieee.org/odm/Schema/2008")
    protected double kc;

    /**
     * Gets the value of the k property.
     * 
     */
    public double getK() {
        return k;
    }

    /**
     * Sets the value of the k property.
     * 
     */
    public void setK(double value) {
        this.k = value;
    }

    /**
     * Gets the value of the kv property.
     * 
     */
    public double getKV() {
        return kv;
    }

    /**
     * Sets the value of the kv property.
     * 
     */
    public void setKV(double value) {
        this.kv = value;
    }

    /**
     * Gets the value of the t1 property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getT1() {
        return t1;
    }

    /**
     * Sets the value of the t1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setT1(TimePeriodXmlType value) {
        this.t1 = value;
    }

    /**
     * Gets the value of the t2 property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getT2() {
        return t2;
    }

    /**
     * Sets the value of the t2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setT2(TimePeriodXmlType value) {
        this.t2 = value;
    }

    /**
     * Gets the value of the va1MAX property.
     * 
     */
    public double getVA1MAX() {
        return va1MAX;
    }

    /**
     * Sets the value of the va1MAX property.
     * 
     */
    public void setVA1MAX(double value) {
        this.va1MAX = value;
    }

    /**
     * Gets the value of the va1MIN property.
     * 
     */
    public double getVA1MIN() {
        return va1MIN;
    }

    /**
     * Sets the value of the va1MIN property.
     * 
     */
    public void setVA1MIN(double value) {
        this.va1MIN = value;
    }

    /**
     * Gets the value of the t3 property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getT3() {
        return t3;
    }

    /**
     * Sets the value of the t3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setT3(TimePeriodXmlType value) {
        this.t3 = value;
    }

    /**
     * Gets the value of the t4 property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getT4() {
        return t4;
    }

    /**
     * Sets the value of the t4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setT4(TimePeriodXmlType value) {
        this.t4 = value;
    }

    /**
     * Gets the value of the vamax property.
     * 
     */
    public double getVAMAX() {
        return vamax;
    }

    /**
     * Sets the value of the vamax property.
     * 
     */
    public void setVAMAX(double value) {
        this.vamax = value;
    }

    /**
     * Gets the value of the vamin property.
     * 
     */
    public double getVAMIN() {
        return vamin;
    }

    /**
     * Sets the value of the vamin property.
     * 
     */
    public void setVAMIN(double value) {
        this.vamin = value;
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
     * Gets the value of the tf property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getTF() {
        return tf;
    }

    /**
     * Sets the value of the tf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setTF(TimePeriodXmlType value) {
        this.tf = value;
    }

    /**
     * Gets the value of the kc property.
     * 
     */
    public double getKC() {
        return kc;
    }

    /**
     * Sets the value of the kc property.
     * 
     */
    public void setKC(double value) {
        this.kc = value;
    }

}
