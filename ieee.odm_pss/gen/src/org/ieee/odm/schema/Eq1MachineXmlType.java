//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.08.26 at 09:51:00 PM GMT-05:00 
//


package org.ieee.odm.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Eq1MachineXmlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Eq1MachineXmlType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ieee.org/odm/Schema/2008}ClassicMachineXmlType">
 *       &lt;sequence>
 *         &lt;element name="xl" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="x0" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="x2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ra" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="xd" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="xq" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Tdo1" type="{http://www.ieee.org/odm/Schema/2008}TimePeriodXmlType"/>
 *         &lt;choice>
 *           &lt;element name="seFmt1">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="SE100" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                     &lt;element name="SE120" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                     &lt;element name="sliner" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="seFmt2">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="E1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                     &lt;element name="E2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                     &lt;element name="SE1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                     &lt;element name="SE2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                     &lt;element name="AF" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Eq1MachineXmlType", propOrder = {
    "xl",
    "x0",
    "x2",
    "ra",
    "xd",
    "xq",
    "tdo1",
    "seFmt1",
    "seFmt2"
})
@XmlSeeAlso({
    Eq11MachineXmlType.class,
    Eq1Ed1MachineXmlType.class
})
public class Eq1MachineXmlType
    extends ClassicMachineXmlType
{

    protected Double xl;
    protected Double x0;
    protected Double x2;
    protected double ra;
    protected double xd;
    protected double xq;
    @XmlElement(name = "Tdo1", required = true)
    protected TimePeriodXmlType tdo1;
    protected Eq1MachineXmlType.SeFmt1 seFmt1;
    protected Eq1MachineXmlType.SeFmt2 seFmt2;

    /**
     * Gets the value of the xl property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getXl() {
        return xl;
    }

    /**
     * Sets the value of the xl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setXl(Double value) {
        this.xl = value;
    }

    /**
     * Gets the value of the x0 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getX0() {
        return x0;
    }

    /**
     * Sets the value of the x0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setX0(Double value) {
        this.x0 = value;
    }

    /**
     * Gets the value of the x2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getX2() {
        return x2;
    }

    /**
     * Sets the value of the x2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setX2(Double value) {
        this.x2 = value;
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
     * Gets the value of the seFmt1 property.
     * 
     * @return
     *     possible object is
     *     {@link Eq1MachineXmlType.SeFmt1 }
     *     
     */
    public Eq1MachineXmlType.SeFmt1 getSeFmt1() {
        return seFmt1;
    }

    /**
     * Sets the value of the seFmt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Eq1MachineXmlType.SeFmt1 }
     *     
     */
    public void setSeFmt1(Eq1MachineXmlType.SeFmt1 value) {
        this.seFmt1 = value;
    }

    /**
     * Gets the value of the seFmt2 property.
     * 
     * @return
     *     possible object is
     *     {@link Eq1MachineXmlType.SeFmt2 }
     *     
     */
    public Eq1MachineXmlType.SeFmt2 getSeFmt2() {
        return seFmt2;
    }

    /**
     * Sets the value of the seFmt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Eq1MachineXmlType.SeFmt2 }
     *     
     */
    public void setSeFmt2(Eq1MachineXmlType.SeFmt2 value) {
        this.seFmt2 = value;
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
     *         &lt;element name="SE100" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="SE120" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="sliner" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
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
        "se100",
        "se120",
        "sliner"
    })
    public static class SeFmt1 {

        @XmlElement(name = "SE100")
        protected double se100;
        @XmlElement(name = "SE120")
        protected double se120;
        protected Double sliner;

        /**
         * Gets the value of the se100 property.
         * 
         */
        public double getSE100() {
            return se100;
        }

        /**
         * Sets the value of the se100 property.
         * 
         */
        public void setSE100(double value) {
            this.se100 = value;
        }

        /**
         * Gets the value of the se120 property.
         * 
         */
        public double getSE120() {
            return se120;
        }

        /**
         * Sets the value of the se120 property.
         * 
         */
        public void setSE120(double value) {
            this.se120 = value;
        }

        /**
         * Gets the value of the sliner property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getSliner() {
            return sliner;
        }

        /**
         * Sets the value of the sliner property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setSliner(Double value) {
            this.sliner = value;
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
     *         &lt;element name="E1" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="E2" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *         &lt;element name="SE1" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    @XmlType(name = "", propOrder = {
        "e1",
        "e2",
        "se1",
        "se2",
        "af"
    })
    public static class SeFmt2 {

        @XmlElement(name = "E1")
        protected double e1;
        @XmlElement(name = "E2")
        protected double e2;
        @XmlElement(name = "SE1")
        protected double se1;
        @XmlElement(name = "SE2")
        protected double se2;
        @XmlElement(name = "AF")
        protected Double af;

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

}
