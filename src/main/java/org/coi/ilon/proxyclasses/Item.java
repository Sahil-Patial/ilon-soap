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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				
 * 				Any further 'Item' type extends this generic type.
 * 			
 * 			
 * 
 * <p>Java class for Item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fault" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_Fault" minOccurs="0"/&gt;
 *         &lt;element name="UCPTname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UCPTannotation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UCPThidden" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_Flag" minOccurs="0"/&gt;
 *         &lt;element name="UCPTaliasName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UCPTitemStatus" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_LonString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Item", propOrder = {
    "fault",
    "ucpTname",
    "ucpTannotation",
    "ucpThidden",
    "ucpTaliasName",
    "ucpTitemStatus"
})
@XmlSeeAlso({
    ItemService.class,
    EVariant.class,
    EDummy.class,
    DpResetPrioInvoke.class,
    LONNetworkDeviceCommandInvoke.class,
    LONNetworkScanCommandInvoke.class,
    LONNetworkCommandInvoke.class,
    LONDeviceCommandInvoke.class,
    ItemData.class,
    ItemCfg.class
})
public class Item {

    protected EFault fault;
    @XmlElement(name = "UCPTname", required = true)
    protected String ucpTname;
    @XmlElement(name = "UCPTannotation")
    protected String ucpTannotation;
    @XmlElement(name = "UCPThidden")
    protected Short ucpThidden;
    @XmlElement(name = "UCPTaliasName")
    protected String ucpTaliasName;
    @XmlElement(name = "UCPTitemStatus")
    protected ELonString ucpTitemStatus;

    /**
     * Gets the value of the fault property.
     * 
     * @return
     *     possible object is
     *     {@link EFault }
     *     
     */
    public EFault getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link EFault }
     *     
     */
    public void setFault(EFault value) {
        this.fault = value;
    }

    /**
     * Gets the value of the ucpTname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUCPTname() {
        return ucpTname;
    }

    /**
     * Sets the value of the ucpTname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCPTname(String value) {
        this.ucpTname = value;
    }

    /**
     * Gets the value of the ucpTannotation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUCPTannotation() {
        return ucpTannotation;
    }

    /**
     * Sets the value of the ucpTannotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCPTannotation(String value) {
        this.ucpTannotation = value;
    }

    /**
     * Gets the value of the ucpThidden property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUCPThidden() {
        return ucpThidden;
    }

    /**
     * Sets the value of the ucpThidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUCPThidden(Short value) {
        this.ucpThidden = value;
    }

    /**
     * Gets the value of the ucpTaliasName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUCPTaliasName() {
        return ucpTaliasName;
    }

    /**
     * Sets the value of the ucpTaliasName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCPTaliasName(String value) {
        this.ucpTaliasName = value;
    }

    /**
     * Gets the value of the ucpTitemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ELonString }
     *     
     */
    public ELonString getUCPTitemStatus() {
        return ucpTitemStatus;
    }

    /**
     * Sets the value of the ucpTitemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ELonString }
     *     
     */
    public void setUCPTitemStatus(ELonString value) {
        this.ucpTitemStatus = value;
    }

}