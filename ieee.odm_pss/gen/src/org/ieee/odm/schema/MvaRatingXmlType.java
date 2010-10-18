//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.10.03 at 07:43:49 PM GMT-05:00 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MvaRatingXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MvaRatingXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="rating1" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="rating2" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="rating3" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="rating4" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="unit" use="required" type="{http://www.ieee.org/odm/Schema/2008}ApparentPowerUnitType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MvaRatingXmlType")
public class MvaRatingXmlType {

    @XmlAttribute(required = true)
    protected double rating1;
    @XmlAttribute
    protected Double rating2;
    @XmlAttribute
    protected Double rating3;
    @XmlAttribute
    protected Double rating4;
    @XmlAttribute(required = true)
    protected ApparentPowerUnitType unit;

    /**
     * Gets the value of the rating1 property.
     * 
     */
    public double getRating1() {
        return rating1;
    }

    /**
     * Sets the value of the rating1 property.
     * 
     */
    public void setRating1(double value) {
        this.rating1 = value;
    }

    /**
     * Gets the value of the rating2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRating2() {
        return rating2;
    }

    /**
     * Sets the value of the rating2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRating2(Double value) {
        this.rating2 = value;
    }

    /**
     * Gets the value of the rating3 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRating3() {
        return rating3;
    }

    /**
     * Sets the value of the rating3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRating3(Double value) {
        this.rating3 = value;
    }

    /**
     * Gets the value of the rating4 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRating4() {
        return rating4;
    }

    /**
     * Sets the value of the rating4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRating4(Double value) {
        this.rating4 = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link ApparentPowerUnitType }
     *     
     */
    public ApparentPowerUnitType getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparentPowerUnitType }
     *     
     */
    public void setUnit(ApparentPowerUnitType value) {
        this.unit = value;
    }

}
