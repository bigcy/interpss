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
 * <p>Java class for TransientSimulationXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransientSimulationXmlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="simulationSetting" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="method" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="ModifiedEuler"/>
 *                         &lt;enumeration value="RungerKutta"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="time" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType" minOccurs="0"/>
 *                   &lt;element name="step" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="aclfInitialization" type="{http://www.ieee.org/odm/Schema/2008}AclfAlgorithmXmlType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransientSimulationXmlType", propOrder = {
    "simulationSetting",
    "aclfInitialization"
})
public class TransientSimulationXmlType {

    protected TransientSimulationXmlType.SimulationSetting simulationSetting;
    protected AclfAlgorithmXmlType aclfInitialization;

    /**
     * Gets the value of the simulationSetting property.
     * 
     * @return
     *     possible object is
     *     {@link TransientSimulationXmlType.SimulationSetting }
     *     
     */
    public TransientSimulationXmlType.SimulationSetting getSimulationSetting() {
        return simulationSetting;
    }

    /**
     * Sets the value of the simulationSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransientSimulationXmlType.SimulationSetting }
     *     
     */
    public void setSimulationSetting(TransientSimulationXmlType.SimulationSetting value) {
        this.simulationSetting = value;
    }

    /**
     * Gets the value of the aclfInitialization property.
     * 
     * @return
     *     possible object is
     *     {@link AclfAlgorithmXmlType }
     *     
     */
    public AclfAlgorithmXmlType getAclfInitialization() {
        return aclfInitialization;
    }

    /**
     * Sets the value of the aclfInitialization property.
     * 
     * @param value
     *     allowed object is
     *     {@link AclfAlgorithmXmlType }
     *     
     */
    public void setAclfInitialization(AclfAlgorithmXmlType value) {
        this.aclfInitialization = value;
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
     *         &lt;element name="method" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="ModifiedEuler"/>
     *               &lt;enumeration value="RungerKutta"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="time" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType" minOccurs="0"/>
     *         &lt;element name="step" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType" minOccurs="0"/>
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
        "method",
        "time",
        "step"
    })
    public static class SimulationSetting {

        protected String method;
        protected TimePeriodXmlType time;
        protected TimePeriodXmlType step;

        /**
         * Gets the value of the method property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMethod() {
            return method;
        }

        /**
         * Sets the value of the method property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMethod(String value) {
            this.method = value;
        }

        /**
         * Gets the value of the time property.
         * 
         * @return
         *     possible object is
         *     {@link TimePeriodXmlType }
         *     
         */
        public TimePeriodXmlType getTime() {
            return time;
        }

        /**
         * Sets the value of the time property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimePeriodXmlType }
         *     
         */
        public void setTime(TimePeriodXmlType value) {
            this.time = value;
        }

        /**
         * Gets the value of the step property.
         * 
         * @return
         *     possible object is
         *     {@link TimePeriodXmlType }
         *     
         */
        public TimePeriodXmlType getStep() {
            return step;
        }

        /**
         * Sets the value of the step property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimePeriodXmlType }
         *     
         */
        public void setStep(TimePeriodXmlType value) {
            this.step = value;
        }

    }

}
