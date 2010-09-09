//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.09.09 at 02:24:39 PM GMT-05:00 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XfrBranchXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XfrBranchXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}BranchXmlType">
 *       &lt;sequence>
 *         &lt;element name="fromTurnRatio" type="{http://www.ieee.org/odm/Schema/2008}TurnRatioXmlType" minOccurs="0"/>
 *         &lt;element name="toTurnRatio" type="{http://www.ieee.org/odm/Schema/2008}TurnRatioXmlType" minOccurs="0"/>
 *         &lt;element name="magnitizingY" type="{http://www.ieee.org/odm/Schema/2008}YXmlType" minOccurs="0"/>
 *         &lt;element name="tapAdjustment" type="{http://www.ieee.org/odm/Schema/2008}TapAdjustmentXmlType" minOccurs="0"/>
 *         &lt;element name="xfrInfo" type="{http://www.ieee.org/odm/Schema/2008}TransformerInfoXmlType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XfrBranchXmlType", propOrder = {
    "fromTurnRatio",
    "toTurnRatio",
    "magnitizingY",
    "tapAdjustment",
    "xfrInfo"
})
@XmlSeeAlso({
    PSXfrBranchXmlType.class,
    XfrShortCircuitXmlType.class,
    Xfr3WBranchXmlType.class
})
public class XfrBranchXmlType
    extends BranchXmlType
{

    protected TurnRatioXmlType fromTurnRatio;
    protected TurnRatioXmlType toTurnRatio;
    protected YXmlType magnitizingY;
    protected TapAdjustmentXmlType tapAdjustment;
    protected TransformerInfoXmlType xfrInfo;

    /**
     * Gets the value of the fromTurnRatio property.
     * 
     * @return
     *     possible object is
     *     {@link TurnRatioXmlType }
     *     
     */
    public TurnRatioXmlType getFromTurnRatio() {
        return fromTurnRatio;
    }

    /**
     * Sets the value of the fromTurnRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TurnRatioXmlType }
     *     
     */
    public void setFromTurnRatio(TurnRatioXmlType value) {
        this.fromTurnRatio = value;
    }

    /**
     * Gets the value of the toTurnRatio property.
     * 
     * @return
     *     possible object is
     *     {@link TurnRatioXmlType }
     *     
     */
    public TurnRatioXmlType getToTurnRatio() {
        return toTurnRatio;
    }

    /**
     * Sets the value of the toTurnRatio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TurnRatioXmlType }
     *     
     */
    public void setToTurnRatio(TurnRatioXmlType value) {
        this.toTurnRatio = value;
    }

    /**
     * Gets the value of the magnitizingY property.
     * 
     * @return
     *     possible object is
     *     {@link YXmlType }
     *     
     */
    public YXmlType getMagnitizingY() {
        return magnitizingY;
    }

    /**
     * Sets the value of the magnitizingY property.
     * 
     * @param value
     *     allowed object is
     *     {@link YXmlType }
     *     
     */
    public void setMagnitizingY(YXmlType value) {
        this.magnitizingY = value;
    }

    /**
     * Gets the value of the tapAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link TapAdjustmentXmlType }
     *     
     */
    public TapAdjustmentXmlType getTapAdjustment() {
        return tapAdjustment;
    }

    /**
     * Sets the value of the tapAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TapAdjustmentXmlType }
     *     
     */
    public void setTapAdjustment(TapAdjustmentXmlType value) {
        this.tapAdjustment = value;
    }

    /**
     * Gets the value of the xfrInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TransformerInfoXmlType }
     *     
     */
    public TransformerInfoXmlType getXfrInfo() {
        return xfrInfo;
    }

    /**
     * Sets the value of the xfrInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformerInfoXmlType }
     *     
     */
    public void setXfrInfo(TransformerInfoXmlType value) {
        this.xfrInfo = value;
    }

}
