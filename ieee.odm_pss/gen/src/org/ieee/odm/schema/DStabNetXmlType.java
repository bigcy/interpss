//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.09.03 at 09:00:05 PM GMT-05:00 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			
 * 
 * <p>Java class for DStabNetXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DStabNetXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}ShortCircuitNetXmlType">
 *       &lt;sequence>
 *         &lt;element name="saturatedMachineParameter" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DStabNetXmlType", propOrder = {
    "saturatedMachineParameter"
})
public class DStabNetXmlType
    extends ShortCircuitNetXmlType
{

    protected boolean saturatedMachineParameter;

    /**
     * Gets the value of the saturatedMachineParameter property.
     * 
     */
    public boolean isSaturatedMachineParameter() {
        return saturatedMachineParameter;
    }

    /**
     * Sets the value of the saturatedMachineParameter property.
     * 
     */
    public void setSaturatedMachineParameter(boolean value) {
        this.saturatedMachineParameter = value;
    }

}
