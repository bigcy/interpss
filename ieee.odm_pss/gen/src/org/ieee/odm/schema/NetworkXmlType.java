//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.09.18 at 03:50:12 PM GMT-05:00 
//


package org.ieee.odm.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}IDRecordXmlType">
 *       &lt;sequence>
 *         &lt;element name="networkCategory" type="{http://www.ieee.org/odm/Schema/2008}NetworkCategoryEnumType"/>
 *         &lt;element name="analysisCategory" type="{http://www.ieee.org/odm/Schema/2008}AnalysisCategoryEnumType"/>
 *         &lt;element name="basePower" type="{http://www.ieee.org/odm/Schema/2008}ApparentPowerXmlType"/>
 *         &lt;element name="frequency" type="{http://www.ieee.org/odm/Schema/2008}FrequencyXmlType" minOccurs="0"/>
 *         &lt;element name="busList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ieee.org/odm/Schema/2008}bus" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="branchList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.ieee.org/odm/Schema/2008}branch" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="areaList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="area" type="{http://www.ieee.org/odm/Schema/2008}NetAreaXmlType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="lossZoneList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="lossZone" type="{http://www.ieee.org/odm/Schema/2008}NetZoneXmlType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkXmlType", propOrder = {
    "networkCategory",
    "analysisCategory",
    "basePower",
    "frequency",
    "busList",
    "branchList",
    "areaList",
    "lossZoneList"
})
@XmlSeeAlso({
    LoadflowNetXmlType.class
})
public abstract class NetworkXmlType
    extends IDRecordXmlType
{

    @XmlElement(required = true)
    protected NetworkCategoryEnumType networkCategory;
    @XmlElement(required = true)
    protected AnalysisCategoryEnumType analysisCategory;
    @XmlElement(required = true)
    protected ApparentPowerXmlType basePower;
    protected FrequencyXmlType frequency;
    @XmlElement(required = true)
    protected NetworkXmlType.BusList busList;
    @XmlElement(required = true)
    protected NetworkXmlType.BranchList branchList;
    protected NetworkXmlType.AreaList areaList;
    protected NetworkXmlType.LossZoneList lossZoneList;

    /**
     * Gets the value of the networkCategory property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkCategoryEnumType }
     *     
     */
    public NetworkCategoryEnumType getNetworkCategory() {
        return networkCategory;
    }

    /**
     * Sets the value of the networkCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkCategoryEnumType }
     *     
     */
    public void setNetworkCategory(NetworkCategoryEnumType value) {
        this.networkCategory = value;
    }

    /**
     * Gets the value of the analysisCategory property.
     * 
     * @return
     *     possible object is
     *     {@link AnalysisCategoryEnumType }
     *     
     */
    public AnalysisCategoryEnumType getAnalysisCategory() {
        return analysisCategory;
    }

    /**
     * Sets the value of the analysisCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnalysisCategoryEnumType }
     *     
     */
    public void setAnalysisCategory(AnalysisCategoryEnumType value) {
        this.analysisCategory = value;
    }

    /**
     * Gets the value of the basePower property.
     * 
     * @return
     *     possible object is
     *     {@link ApparentPowerXmlType }
     *     
     */
    public ApparentPowerXmlType getBasePower() {
        return basePower;
    }

    /**
     * Sets the value of the basePower property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApparentPowerXmlType }
     *     
     */
    public void setBasePower(ApparentPowerXmlType value) {
        this.basePower = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyXmlType }
     *     
     */
    public FrequencyXmlType getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyXmlType }
     *     
     */
    public void setFrequency(FrequencyXmlType value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the busList property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkXmlType.BusList }
     *     
     */
    public NetworkXmlType.BusList getBusList() {
        return busList;
    }

    /**
     * Sets the value of the busList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkXmlType.BusList }
     *     
     */
    public void setBusList(NetworkXmlType.BusList value) {
        this.busList = value;
    }

    /**
     * Gets the value of the branchList property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkXmlType.BranchList }
     *     
     */
    public NetworkXmlType.BranchList getBranchList() {
        return branchList;
    }

    /**
     * Sets the value of the branchList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkXmlType.BranchList }
     *     
     */
    public void setBranchList(NetworkXmlType.BranchList value) {
        this.branchList = value;
    }

    /**
     * Gets the value of the areaList property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkXmlType.AreaList }
     *     
     */
    public NetworkXmlType.AreaList getAreaList() {
        return areaList;
    }

    /**
     * Sets the value of the areaList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkXmlType.AreaList }
     *     
     */
    public void setAreaList(NetworkXmlType.AreaList value) {
        this.areaList = value;
    }

    /**
     * Gets the value of the lossZoneList property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkXmlType.LossZoneList }
     *     
     */
    public NetworkXmlType.LossZoneList getLossZoneList() {
        return lossZoneList;
    }

    /**
     * Sets the value of the lossZoneList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkXmlType.LossZoneList }
     *     
     */
    public void setLossZoneList(NetworkXmlType.LossZoneList value) {
        this.lossZoneList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="area" type="{http://www.ieee.org/odm/Schema/2008}NetAreaXmlType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "area"
    })
    public static class AreaList {

        protected List<NetAreaXmlType> area;

        /**
         * Gets the value of the area property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the area property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getArea().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NetAreaXmlType }
         * 
         * 
         */
        public List<NetAreaXmlType> getArea() {
            if (area == null) {
                area = new ArrayList<NetAreaXmlType>();
            }
            return this.area;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.ieee.org/odm/Schema/2008}branch" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "branch"
    })
    public static class BranchList {

        @XmlElementRef(name = "branch", namespace = "http://www.ieee.org/odm/Schema/2008", type = JAXBElement.class)
        protected List<JAXBElement<? extends BaseBranchXmlType>> branch;

        /**
         * Gets the value of the branch property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the branch property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBranch().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link BaseBranchXmlType }{@code >}
         * {@link JAXBElement }{@code <}{@link LineBranchXmlType }{@code >}
         * {@link JAXBElement }{@code <}{@link LineShortCircuitXmlType }{@code >}
         * {@link JAXBElement }{@code <}{@link LineDStabXmlType }{@code >}
         * {@link JAXBElement }{@code <}{@link XfrBranchXmlType }{@code >}
         * {@link JAXBElement }{@code <}{@link PSXfrBranchXmlType }{@code >}
         * {@link JAXBElement }{@code <}{@link PSXfrDStabXmlType }{@code >}
         * {@link JAXBElement }{@code <}{@link BaseBranchXmlType }{@code >}
         * {@link JAXBElement }{@code <}{@link PSXfrShortCircuitXmlType }{@code >}
         * {@link JAXBElement }{@code <}{@link XfrShortCircuitXmlType }{@code >}
         * {@link JAXBElement }{@code <}{@link XfrDStabXmlType }{@code >}
         * 
         * 
         */
        public List<JAXBElement<? extends BaseBranchXmlType>> getBranch() {
            if (branch == null) {
                branch = new ArrayList<JAXBElement<? extends BaseBranchXmlType>>();
            }
            return this.branch;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.ieee.org/odm/Schema/2008}bus" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bus"
    })
    public static class BusList {

        @XmlElementRef(name = "bus", namespace = "http://www.ieee.org/odm/Schema/2008", type = JAXBElement.class)
        protected List<JAXBElement<? extends BusXmlType>> bus;

        /**
         * Gets the value of the bus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link BusXmlType }{@code >}
         * {@link JAXBElement }{@code <}{@link ShortCircuitBusXmlType }{@code >}
         * {@link JAXBElement }{@code <}{@link ScSimpleBusXmlType }{@code >}
         * {@link JAXBElement }{@code <}{@link BusXmlType }{@code >}
         * {@link JAXBElement }{@code <}{@link OpfGenBusXmlType }{@code >}
         * {@link JAXBElement }{@code <}{@link LoadflowBusXmlType }{@code >}
         * {@link JAXBElement }{@code <}{@link DStabBusXmlType }{@code >}
         * 
         * 
         */
        public List<JAXBElement<? extends BusXmlType>> getBus() {
            if (bus == null) {
                bus = new ArrayList<JAXBElement<? extends BusXmlType>>();
            }
            return this.bus;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="lossZone" type="{http://www.ieee.org/odm/Schema/2008}NetZoneXmlType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "lossZone"
    })
    public static class LossZoneList {

        protected List<NetZoneXmlType> lossZone;

        /**
         * Gets the value of the lossZone property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lossZone property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLossZone().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NetZoneXmlType }
         * 
         * 
         */
        public List<NetZoneXmlType> getLossZone() {
            if (lossZone == null) {
                lossZone = new ArrayList<NetZoneXmlType>();
            }
            return this.lossZone;
        }

    }

}
