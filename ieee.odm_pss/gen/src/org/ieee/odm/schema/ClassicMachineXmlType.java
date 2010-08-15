//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.14 at 06:36:41 PM GMT-05:00 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClassicMachineXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassicMachineXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}MachineModelXmlType">
 *       &lt;sequence>
 *         &lt;element name="H" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="D" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="xd1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassicMachineXmlType", propOrder = {
    "h",
    "d",
    "xd1"
})
@XmlSeeAlso({
    TransientMachineXmlType.class
})
public class ClassicMachineXmlType
    extends MachineModelXmlType
{

    @XmlElement(name = "H")
    protected double h;
    @XmlElement(name = "D")
    protected double d;
    protected double xd1;

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

}
