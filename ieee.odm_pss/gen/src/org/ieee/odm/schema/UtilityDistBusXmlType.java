//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.23 at 11:13:49 AM GMT-05:00 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 		bus record for loadflow study
 * 		
 * 
 * <p>Java class for UtilityDistBusXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UtilityDistBusXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}NonContributingDistBusXmlType">
 *       &lt;sequence>
 *         &lt;element name="voltage" type="{http://www.ieee.org/odm/Schema/2008}VoltageXmlType"/>
 *         &lt;element name="angle" type="{http://www.ieee.org/odm/Schema/2008}AngleXmlType"/>
 *         &lt;element name="source" type="{http://www.ieee.org/odm/Schema/2008}ScEquivSourceXmlType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UtilityDistBusXmlType", propOrder = {
    "voltage",
    "angle",
    "source"
})
public class UtilityDistBusXmlType
    extends NonContributingDistBusXmlType
{

    @XmlElement(required = true)
    protected VoltageXmlType voltage;
    @XmlElement(required = true)
    protected AngleXmlType angle;
    @XmlElement(required = true)
    protected ScEquivSourceXmlType source;

    /**
     * Gets the value of the voltage property.
     * 
     * @return
     *     possible object is
     *     {@link VoltageXmlType }
     *     
     */
    public VoltageXmlType getVoltage() {
        return voltage;
    }

    /**
     * Sets the value of the voltage property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoltageXmlType }
     *     
     */
    public void setVoltage(VoltageXmlType value) {
        this.voltage = value;
    }

    /**
     * Gets the value of the angle property.
     * 
     * @return
     *     possible object is
     *     {@link AngleXmlType }
     *     
     */
    public AngleXmlType getAngle() {
        return angle;
    }

    /**
     * Sets the value of the angle property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngleXmlType }
     *     
     */
    public void setAngle(AngleXmlType value) {
        this.angle = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link ScEquivSourceXmlType }
     *     
     */
    public ScEquivSourceXmlType getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScEquivSourceXmlType }
     *     
     */
    public void setSource(ScEquivSourceXmlType value) {
        this.source = value;
    }

}
