//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.29 at 11:34:17 PM GMT-05:00 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExcIEEE1981NewExcSystemXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExcIEEE1981NewExcSystemXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}ExcSimpleTypeXmlType">
 *       &lt;sequence>
 *         &lt;element name="Rc" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Xc" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Tr" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="K" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Kv" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="T1" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="T2" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="T3" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="T4" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="Kb" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Kf" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Tf" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="Kh" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="VAmax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="VAmin" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="K5" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="T5" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="Ke" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Te" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;element name="SE1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SE2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Kc" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Kd" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="KL1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="VL1r" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="EFDmax" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="E1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="E2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcIEEE1981NewExcSystemXmlType", propOrder = {
    "rc",
    "xc",
    "tr",
    "k",
    "kv",
    "t1",
    "t2",
    "t3",
    "t4",
    "kb",
    "kf",
    "tf",
    "kh",
    "vAmax",
    "vAmin",
    "k5",
    "t5",
    "ke",
    "te",
    "se1",
    "se2",
    "kc",
    "kd",
    "kl1",
    "vl1R",
    "efDmax",
    "e1",
    "e2"
})
public class ExcIEEE1981NewExcSystemXmlType
    extends ExcSimpleTypeXmlType
{

    @XmlElement(name = "Rc")
    protected double rc;
    @XmlElement(name = "Xc")
    protected double xc;
    @XmlElement(name = "Tr", required = true)
    protected TimePeriodXmlType tr;
    @XmlElement(name = "K")
    protected double k;
    @XmlElement(name = "Kv")
    protected double kv;
    @XmlElement(name = "T1", required = true)
    protected TimePeriodXmlType t1;
    @XmlElement(name = "T2", required = true)
    protected TimePeriodXmlType t2;
    @XmlElement(name = "T3", required = true)
    protected TimePeriodXmlType t3;
    @XmlElement(name = "T4", required = true)
    protected TimePeriodXmlType t4;
    @XmlElement(name = "Kb")
    protected Double kb;
    @XmlElement(name = "Kf")
    protected double kf;
    @XmlElement(name = "Tf", required = true)
    protected TimePeriodXmlType tf;
    @XmlElement(name = "Kh")
    protected double kh;
    @XmlElement(name = "VAmax")
    protected double vAmax;
    @XmlElement(name = "VAmin")
    protected double vAmin;
    @XmlElement(name = "K5")
    protected double k5;
    @XmlElement(name = "T5", required = true)
    protected TimePeriodXmlType t5;
    @XmlElement(name = "Ke")
    protected double ke;
    @XmlElement(name = "Te", required = true)
    protected TimePeriodXmlType te;
    @XmlElement(name = "SE1")
    protected Double se1;
    @XmlElement(name = "SE2")
    protected Double se2;
    @XmlElement(name = "Kc")
    protected double kc;
    @XmlElement(name = "Kd")
    protected double kd;
    @XmlElement(name = "KL1")
    protected double kl1;
    @XmlElement(name = "VL1r")
    protected double vl1R;
    @XmlElement(name = "EFDmax")
    protected double efDmax;
    @XmlElement(name = "E1")
    protected Double e1;
    @XmlElement(name = "E2")
    protected Double e2;

    /**
     * Gets the value of the rc property.
     * 
     */
    public double getRc() {
        return rc;
    }

    /**
     * Sets the value of the rc property.
     * 
     */
    public void setRc(double value) {
        this.rc = value;
    }

    /**
     * Gets the value of the xc property.
     * 
     */
    public double getXc() {
        return xc;
    }

    /**
     * Sets the value of the xc property.
     * 
     */
    public void setXc(double value) {
        this.xc = value;
    }

    /**
     * Gets the value of the tr property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getTr() {
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
    public void setTr(TimePeriodXmlType value) {
        this.tr = value;
    }

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
    public double getKv() {
        return kv;
    }

    /**
     * Sets the value of the kv property.
     * 
     */
    public void setKv(double value) {
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
     * Gets the value of the kb property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getKb() {
        return kb;
    }

    /**
     * Sets the value of the kb property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setKb(Double value) {
        this.kb = value;
    }

    /**
     * Gets the value of the kf property.
     * 
     */
    public double getKf() {
        return kf;
    }

    /**
     * Sets the value of the kf property.
     * 
     */
    public void setKf(double value) {
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
    public TimePeriodXmlType getTf() {
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
    public void setTf(TimePeriodXmlType value) {
        this.tf = value;
    }

    /**
     * Gets the value of the kh property.
     * 
     */
    public double getKh() {
        return kh;
    }

    /**
     * Sets the value of the kh property.
     * 
     */
    public void setKh(double value) {
        this.kh = value;
    }

    /**
     * Gets the value of the vAmax property.
     * 
     */
    public double getVAmax() {
        return vAmax;
    }

    /**
     * Sets the value of the vAmax property.
     * 
     */
    public void setVAmax(double value) {
        this.vAmax = value;
    }

    /**
     * Gets the value of the vAmin property.
     * 
     */
    public double getVAmin() {
        return vAmin;
    }

    /**
     * Sets the value of the vAmin property.
     * 
     */
    public void setVAmin(double value) {
        this.vAmin = value;
    }

    /**
     * Gets the value of the k5 property.
     * 
     */
    public double getK5() {
        return k5;
    }

    /**
     * Sets the value of the k5 property.
     * 
     */
    public void setK5(double value) {
        this.k5 = value;
    }

    /**
     * Gets the value of the t5 property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getT5() {
        return t5;
    }

    /**
     * Sets the value of the t5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setT5(TimePeriodXmlType value) {
        this.t5 = value;
    }

    /**
     * Gets the value of the ke property.
     * 
     */
    public double getKe() {
        return ke;
    }

    /**
     * Sets the value of the ke property.
     * 
     */
    public void setKe(double value) {
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
    public TimePeriodXmlType getTe() {
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
    public void setTe(TimePeriodXmlType value) {
        this.te = value;
    }

    /**
     * Gets the value of the se1 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSE1() {
        return se1;
    }

    /**
     * Sets the value of the se1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSE1(Double value) {
        this.se1 = value;
    }

    /**
     * Gets the value of the se2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSE2() {
        return se2;
    }

    /**
     * Sets the value of the se2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSE2(Double value) {
        this.se2 = value;
    }

    /**
     * Gets the value of the kc property.
     * 
     */
    public double getKc() {
        return kc;
    }

    /**
     * Sets the value of the kc property.
     * 
     */
    public void setKc(double value) {
        this.kc = value;
    }

    /**
     * Gets the value of the kd property.
     * 
     */
    public double getKd() {
        return kd;
    }

    /**
     * Sets the value of the kd property.
     * 
     */
    public void setKd(double value) {
        this.kd = value;
    }

    /**
     * Gets the value of the kl1 property.
     * 
     */
    public double getKL1() {
        return kl1;
    }

    /**
     * Sets the value of the kl1 property.
     * 
     */
    public void setKL1(double value) {
        this.kl1 = value;
    }

    /**
     * Gets the value of the vl1R property.
     * 
     */
    public double getVL1R() {
        return vl1R;
    }

    /**
     * Sets the value of the vl1R property.
     * 
     */
    public void setVL1R(double value) {
        this.vl1R = value;
    }

    /**
     * Gets the value of the efDmax property.
     * 
     */
    public double getEFDmax() {
        return efDmax;
    }

    /**
     * Sets the value of the efDmax property.
     * 
     */
    public void setEFDmax(double value) {
        this.efDmax = value;
    }

    /**
     * Gets the value of the e1 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getE1() {
        return e1;
    }

    /**
     * Sets the value of the e1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setE1(Double value) {
        this.e1 = value;
    }

    /**
     * Gets the value of the e2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getE2() {
        return e2;
    }

    /**
     * Sets the value of the e2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setE2(Double value) {
        this.e2 = value;
    }

}
