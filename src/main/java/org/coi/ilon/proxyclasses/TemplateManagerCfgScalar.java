//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.26 at 02:58:11 PM IST 
//


package org.coi.ilon.proxyclasses;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TemplateManager_CfgScalar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TemplateManager_CfgScalar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UCPTbaseType" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_LonString"/&gt;
 *         &lt;element name="UCPTminValue" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_LonString"/&gt;
 *         &lt;element name="UCPTmaxValue" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_LonString"/&gt;
 *         &lt;element name="UCPTinvalidValue" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_LonString" minOccurs="0"/&gt;
 *         &lt;element name="Scale"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="UCPTmultiplier" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *                   &lt;element name="UCPTexponent" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="UCPToffset" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="UCPTresolution" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemplateManager_CfgScalar", propOrder = {
    "ucpTbaseType",
    "ucpTminValue",
    "ucpTmaxValue",
    "ucpTinvalidValue",
    "scale"
})
public class TemplateManagerCfgScalar {

    @XmlElement(name = "UCPTbaseType", required = true)
    protected ELonString ucpTbaseType;
    @XmlElement(name = "UCPTminValue", required = true)
    protected ELonString ucpTminValue;
    @XmlElement(name = "UCPTmaxValue", required = true)
    protected ELonString ucpTmaxValue;
    @XmlElement(name = "UCPTinvalidValue")
    protected ELonString ucpTinvalidValue;
    @XmlElement(name = "Scale", required = true)
    protected TemplateManagerCfgScalar.Scale scale;

    /**
     * Gets the value of the ucpTbaseType property.
     * 
     * @return
     *     possible object is
     *     {@link ELonString }
     *     
     */
    public ELonString getUCPTbaseType() {
        return ucpTbaseType;
    }

    /**
     * Sets the value of the ucpTbaseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ELonString }
     *     
     */
    public void setUCPTbaseType(ELonString value) {
        this.ucpTbaseType = value;
    }

    /**
     * Gets the value of the ucpTminValue property.
     * 
     * @return
     *     possible object is
     *     {@link ELonString }
     *     
     */
    public ELonString getUCPTminValue() {
        return ucpTminValue;
    }

    /**
     * Sets the value of the ucpTminValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ELonString }
     *     
     */
    public void setUCPTminValue(ELonString value) {
        this.ucpTminValue = value;
    }

    /**
     * Gets the value of the ucpTmaxValue property.
     * 
     * @return
     *     possible object is
     *     {@link ELonString }
     *     
     */
    public ELonString getUCPTmaxValue() {
        return ucpTmaxValue;
    }

    /**
     * Sets the value of the ucpTmaxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ELonString }
     *     
     */
    public void setUCPTmaxValue(ELonString value) {
        this.ucpTmaxValue = value;
    }

    /**
     * Gets the value of the ucpTinvalidValue property.
     * 
     * @return
     *     possible object is
     *     {@link ELonString }
     *     
     */
    public ELonString getUCPTinvalidValue() {
        return ucpTinvalidValue;
    }

    /**
     * Sets the value of the ucpTinvalidValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ELonString }
     *     
     */
    public void setUCPTinvalidValue(ELonString value) {
        this.ucpTinvalidValue = value;
    }

    /**
     * Gets the value of the scale property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateManagerCfgScalar.Scale }
     *     
     */
    public TemplateManagerCfgScalar.Scale getScale() {
        return scale;
    }

    /**
     * Sets the value of the scale property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateManagerCfgScalar.Scale }
     *     
     */
    public void setScale(TemplateManagerCfgScalar.Scale value) {
        this.scale = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="UCPTmultiplier" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
     *         &lt;element name="UCPTexponent" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="UCPToffset" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="UCPTresolution" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ucpTmultiplier",
        "ucpTexponent",
        "ucpToffset",
        "ucpTresolution"
    })
    public static class Scale {

        @XmlElement(name = "UCPTmultiplier")
        protected float ucpTmultiplier;
        @XmlElement(name = "UCPTexponent")
        protected int ucpTexponent;
        @XmlElement(name = "UCPToffset")
        protected int ucpToffset;
        @XmlElement(name = "UCPTresolution")
        protected double ucpTresolution;

        /**
         * Gets the value of the ucpTmultiplier property.
         * 
         */
        public float getUCPTmultiplier() {
            return ucpTmultiplier;
        }

        /**
         * Sets the value of the ucpTmultiplier property.
         * 
         */
        public void setUCPTmultiplier(float value) {
            this.ucpTmultiplier = value;
        }

        /**
         * Gets the value of the ucpTexponent property.
         * 
         */
        public int getUCPTexponent() {
            return ucpTexponent;
        }

        /**
         * Sets the value of the ucpTexponent property.
         * 
         */
        public void setUCPTexponent(int value) {
            this.ucpTexponent = value;
        }

        /**
         * Gets the value of the ucpToffset property.
         * 
         */
        public int getUCPToffset() {
            return ucpToffset;
        }

        /**
         * Sets the value of the ucpToffset property.
         * 
         */
        public void setUCPToffset(int value) {
            this.ucpToffset = value;
        }

        /**
         * Gets the value of the ucpTresolution property.
         * 
         */
        public double getUCPTresolution() {
            return ucpTresolution;
        }

        /**
         * Sets the value of the ucpTresolution property.
         * 
         */
        public void setUCPTresolution(double value) {
            this.ucpTresolution = value;
        }

    }

}