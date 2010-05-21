//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.05.21 at 03:39:47 PM MST 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubTransientMachineXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubTransientMachineXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="genName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="basePower" type="{http://www.ieee.org/odm/Schema}ActivePowerXmlType" minOccurs="0"/>
 *         &lt;element name="xd" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="xr" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ra" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="xd1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="xd11" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Tdo1" type="{http://www.ieee.org/odm/Schema}TimePeriodXmlType"/>
 *         &lt;element name="Td011" type="{http://www.ieee.org/odm/Schema}TimePeriodXmlType"/>
 *         &lt;element name="xq" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="xq1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="xq11" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Tq01" type="{http://www.ieee.org/odm/Schema}TimePeriodXmlType"/>
 *         &lt;element name="Tq011" type="{http://www.ieee.org/odm/Schema}TimePeriodXmlType"/>
 *         &lt;element name="H" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="D" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="E1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SE1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="E2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="SE2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AF" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubTransientMachineXmlType", propOrder = {
    "genName",
    "desc",
    "basePower",
    "xd",
    "xr",
    "ra",
    "xd1",
    "xd11",
    "tdo1",
    "td011",
    "xq",
    "xq1",
    "xq11",
    "tq01",
    "tq011",
    "h",
    "d",
    "e1",
    "se1",
    "e2",
    "se2",
    "af"
})
public class SubTransientMachineXmlType {

    protected String genName;
    protected String desc;
    protected ActivePowerXmlType basePower;
    protected double xd;
    protected double xr;
    protected double ra;
    protected double xd1;
    protected double xd11;
    @XmlElement(name = "Tdo1", required = true)
    protected TimePeriodXmlType tdo1;
    @XmlElement(name = "Td011", required = true)
    protected TimePeriodXmlType td011;
    protected double xq;
    protected double xq1;
    protected double xq11;
    @XmlElement(name = "Tq01", required = true)
    protected TimePeriodXmlType tq01;
    @XmlElement(name = "Tq011", required = true)
    protected TimePeriodXmlType tq011;
    @XmlElement(name = "H")
    protected double h;
    @XmlElement(name = "D")
    protected double d;
    @XmlElement(name = "E1")
    protected double e1;
    @XmlElement(name = "SE1")
    protected double se1;
    @XmlElement(name = "E2")
    protected double e2;
    @XmlElement(name = "SE2")
    protected double se2;
    @XmlElement(name = "AF")
    protected Double af;

    /**
     * Gets the value of the genName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenName() {
        return genName;
    }

    /**
     * Sets the value of the genName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenName(String value) {
        this.genName = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the basePower property.
     * 
     * @return
     *     possible object is
     *     {@link ActivePowerXmlType }
     *     
     */
    public ActivePowerXmlType getBasePower() {
        return basePower;
    }

    /**
     * Sets the value of the basePower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivePowerXmlType }
     *     
     */
    public void setBasePower(ActivePowerXmlType value) {
        this.basePower = value;
    }

    /**
     * Gets the value of the xd property.
     * 
     */
    public double getXd() {
        return xd;
    }

    /**
     * Sets the value of the xd property.
     * 
     */
    public void setXd(double value) {
        this.xd = value;
    }

    /**
     * Gets the value of the xr property.
     * 
     */
    public double getXr() {
        return xr;
    }

    /**
     * Sets the value of the xr property.
     * 
     */
    public void setXr(double value) {
        this.xr = value;
    }

    /**
     * Gets the value of the ra property.
     * 
     */
    public double getRa() {
        return ra;
    }

    /**
     * Sets the value of the ra property.
     * 
     */
    public void setRa(double value) {
        this.ra = value;
    }

    /**
     * Gets the value of the xd1 property.
     * 
     */
    public double getXd1() {
        return xd1;
    }

    /**
     * Sets the value of the xd1 property.
     * 
     */
    public void setXd1(double value) {
        this.xd1 = value;
    }

    /**
     * Gets the value of the xd11 property.
     * 
     */
    public double getXd11() {
        return xd11;
    }

    /**
     * Sets the value of the xd11 property.
     * 
     */
    public void setXd11(double value) {
        this.xd11 = value;
    }

    /**
     * Gets the value of the tdo1 property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getTdo1() {
        return tdo1;
    }

    /**
     * Sets the value of the tdo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setTdo1(TimePeriodXmlType value) {
        this.tdo1 = value;
    }

    /**
     * Gets the value of the td011 property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getTd011() {
        return td011;
    }

    /**
     * Sets the value of the td011 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setTd011(TimePeriodXmlType value) {
        this.td011 = value;
    }

    /**
     * Gets the value of the xq property.
     * 
     */
    public double getXq() {
        return xq;
    }

    /**
     * Sets the value of the xq property.
     * 
     */
    public void setXq(double value) {
        this.xq = value;
    }

    /**
     * Gets the value of the xq1 property.
     * 
     */
    public double getXq1() {
        return xq1;
    }

    /**
     * Sets the value of the xq1 property.
     * 
     */
    public void setXq1(double value) {
        this.xq1 = value;
    }

    /**
     * Gets the value of the xq11 property.
     * 
     */
    public double getXq11() {
        return xq11;
    }

    /**
     * Sets the value of the xq11 property.
     * 
     */
    public void setXq11(double value) {
        this.xq11 = value;
    }

    /**
     * Gets the value of the tq01 property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getTq01() {
        return tq01;
    }

    /**
     * Sets the value of the tq01 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setTq01(TimePeriodXmlType value) {
        this.tq01 = value;
    }

    /**
     * Gets the value of the tq011 property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public TimePeriodXmlType getTq011() {
        return tq011;
    }

    /**
     * Sets the value of the tq011 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodXmlType }
     *     
     */
    public void setTq011(TimePeriodXmlType value) {
        this.tq011 = value;
    }

    /**
     * Gets the value of the h property.
     * 
     */
    public double getH() {
        return h;
    }

    /**
     * Sets the value of the h property.
     * 
     */
    public void setH(double value) {
        this.h = value;
    }

    /**
     * Gets the value of the d property.
     * 
     */
    public double getD() {
        return d;
    }

    /**
     * Sets the value of the d property.
     * 
     */
    public void setD(double value) {
        this.d = value;
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

    /**
     * Gets the value of the af property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAF() {
        return af;
    }

    /**
     * Sets the value of the af property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAF(Double value) {
        this.af = value;
    }

}
