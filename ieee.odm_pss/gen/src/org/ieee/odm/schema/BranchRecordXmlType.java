//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.23 at 11:13:49 AM GMT-05:00 
//


package org.ieee.odm.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BranchRecordXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BranchRecordXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}BranchXmlType">
 *       &lt;sequence>
 *         &lt;element name="loadflowData" type="{http://www.ieee.org/odm/Schema/2008}LoadflowBranchDataXmlType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sequenceData" type="{http://www.ieee.org/odm/Schema/2008}SequenceBranchDataXmlType" minOccurs="0"/>
 *         &lt;element name="dynamicData" type="{http://www.ieee.org/odm/Schema/2008}DynamicBranchDataXmlType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BranchRecordXmlType", propOrder = {
    "loadflowData",
    "sequenceData",
    "dynamicData"
})
public class BranchRecordXmlType
    extends BranchXmlType
{

    protected List<LoadflowBranchDataXmlType> loadflowData;
    protected SequenceBranchDataXmlType sequenceData;
    protected DynamicBranchDataXmlType dynamicData;

    /**
     * Gets the value of the loadflowData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loadflowData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoadflowData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoadflowBranchDataXmlType }
     * 
     * 
     */
    public List<LoadflowBranchDataXmlType> getLoadflowData() {
        if (loadflowData == null) {
            loadflowData = new ArrayList<LoadflowBranchDataXmlType>();
        }
        return this.loadflowData;
    }

    /**
     * Gets the value of the sequenceData property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceBranchDataXmlType }
     *     
     */
    public SequenceBranchDataXmlType getSequenceData() {
        return sequenceData;
    }

    /**
     * Sets the value of the sequenceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceBranchDataXmlType }
     *     
     */
    public void setSequenceData(SequenceBranchDataXmlType value) {
        this.sequenceData = value;
    }

    /**
     * Gets the value of the dynamicData property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicBranchDataXmlType }
     *     
     */
    public DynamicBranchDataXmlType getDynamicData() {
        return dynamicData;
    }

    /**
     * Sets the value of the dynamicData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicBranchDataXmlType }
     *     
     */
    public void setDynamicData(DynamicBranchDataXmlType value) {
        this.dynamicData = value;
    }

}
