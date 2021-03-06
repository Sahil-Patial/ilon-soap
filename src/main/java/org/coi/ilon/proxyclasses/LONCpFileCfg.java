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
 * 
 * 				Specialized file configuration type.
 * 					Example:  xSelect="//Item[@xsi:type="LON_Cp_File_Cfg"]"
 * 			
 * 
 * <p>Java class for LON_Cp_File_Cfg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LON_Cp_File_Cfg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}Dp_Cfg_Base"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UCPThandle" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_UniqueKey" minOccurs="0"/&gt;
 *         &lt;element name="UCPToffset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UCPTfileIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UCPTreadOnlyFlag" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_Flag" minOccurs="0"/&gt;
 *         &lt;element name="UCPTdeviceFlag" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_Flag" minOccurs="0"/&gt;
 *         &lt;element name="UCPTmanufactureFlag" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_Flag" minOccurs="0"/&gt;
 *         &lt;element name="UCPTobjDisableFlag" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_Flag" minOccurs="0"/&gt;
 *         &lt;element name="UCPTofflineFlag" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_Flag" minOccurs="0"/&gt;
 *         &lt;element name="UCPTresetFlag" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_Flag" minOccurs="0"/&gt;
 *         &lt;element name="UCPTrelation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LON_Cp_File_Cfg", propOrder = {
    "ucpThandle",
    "ucpToffset",
    "ucpTfileIndex",
    "ucpTreadOnlyFlag",
    "ucpTdeviceFlag",
    "ucpTmanufactureFlag",
    "ucpTobjDisableFlag",
    "ucpTofflineFlag",
    "ucpTresetFlag",
    "ucpTrelation"
})
public class LONCpFileCfg
    extends DpCfgBase
{

    @XmlElement(name = "UCPThandle")
    protected EUniqueKey ucpThandle;
    @XmlElement(name = "UCPToffset")
    protected Integer ucpToffset;
    @XmlElement(name = "UCPTfileIndex")
    protected Integer ucpTfileIndex;
    @XmlElement(name = "UCPTreadOnlyFlag")
    protected Short ucpTreadOnlyFlag;
    @XmlElement(name = "UCPTdeviceFlag")
    protected Short ucpTdeviceFlag;
    @XmlElement(name = "UCPTmanufactureFlag")
    protected Short ucpTmanufactureFlag;
    @XmlElement(name = "UCPTobjDisableFlag")
    protected Short ucpTobjDisableFlag;
    @XmlElement(name = "UCPTofflineFlag")
    protected Short ucpTofflineFlag;
    @XmlElement(name = "UCPTresetFlag")
    protected Short ucpTresetFlag;
    @XmlElement(name = "UCPTrelation")
    protected String ucpTrelation;

    /**
     * Gets the value of the ucpThandle property.
     * 
     * @return
     *     possible object is
     *     {@link EUniqueKey }
     *     
     */
    public EUniqueKey getUCPThandle() {
        return ucpThandle;
    }

    /**
     * Sets the value of the ucpThandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EUniqueKey }
     *     
     */
    public void setUCPThandle(EUniqueKey value) {
        this.ucpThandle = value;
    }

    /**
     * Gets the value of the ucpToffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUCPToffset() {
        return ucpToffset;
    }

    /**
     * Sets the value of the ucpToffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUCPToffset(Integer value) {
        this.ucpToffset = value;
    }

    /**
     * Gets the value of the ucpTfileIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUCPTfileIndex() {
        return ucpTfileIndex;
    }

    /**
     * Sets the value of the ucpTfileIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUCPTfileIndex(Integer value) {
        this.ucpTfileIndex = value;
    }

    /**
     * Gets the value of the ucpTreadOnlyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUCPTreadOnlyFlag() {
        return ucpTreadOnlyFlag;
    }

    /**
     * Sets the value of the ucpTreadOnlyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUCPTreadOnlyFlag(Short value) {
        this.ucpTreadOnlyFlag = value;
    }

    /**
     * Gets the value of the ucpTdeviceFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUCPTdeviceFlag() {
        return ucpTdeviceFlag;
    }

    /**
     * Sets the value of the ucpTdeviceFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUCPTdeviceFlag(Short value) {
        this.ucpTdeviceFlag = value;
    }

    /**
     * Gets the value of the ucpTmanufactureFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUCPTmanufactureFlag() {
        return ucpTmanufactureFlag;
    }

    /**
     * Sets the value of the ucpTmanufactureFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUCPTmanufactureFlag(Short value) {
        this.ucpTmanufactureFlag = value;
    }

    /**
     * Gets the value of the ucpTobjDisableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUCPTobjDisableFlag() {
        return ucpTobjDisableFlag;
    }

    /**
     * Sets the value of the ucpTobjDisableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUCPTobjDisableFlag(Short value) {
        this.ucpTobjDisableFlag = value;
    }

    /**
     * Gets the value of the ucpTofflineFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUCPTofflineFlag() {
        return ucpTofflineFlag;
    }

    /**
     * Sets the value of the ucpTofflineFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUCPTofflineFlag(Short value) {
        this.ucpTofflineFlag = value;
    }

    /**
     * Gets the value of the ucpTresetFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUCPTresetFlag() {
        return ucpTresetFlag;
    }

    /**
     * Sets the value of the ucpTresetFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUCPTresetFlag(Short value) {
        this.ucpTresetFlag = value;
    }

    /**
     * Gets the value of the ucpTrelation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUCPTrelation() {
        return ucpTrelation;
    }

    /**
     * Sets the value of the ucpTrelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCPTrelation(String value) {
        this.ucpTrelation = value;
    }

}
