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
 * <p>Java class for E_InterfaceOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="E_InterfaceOptions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UCPTspeed" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_LonString"/&gt;
 *         &lt;element name="UCPTsize" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_LonString"/&gt;
 *         &lt;element name="UCPTparity" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_LonString"/&gt;
 *         &lt;element name="UCPTstopBits" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_LonString"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "E_InterfaceOptions", propOrder = {
    "ucpTspeed",
    "ucpTsize",
    "ucpTparity",
    "ucpTstopBits"
})
public class EInterfaceOptions {

    @XmlElement(name = "UCPTspeed", required = true)
    protected ELonString ucpTspeed;
    @XmlElement(name = "UCPTsize", required = true)
    protected ELonString ucpTsize;
    @XmlElement(name = "UCPTparity", required = true)
    protected ELonString ucpTparity;
    @XmlElement(name = "UCPTstopBits", required = true)
    protected ELonString ucpTstopBits;

    /**
     * Gets the value of the ucpTspeed property.
     * 
     * @return
     *     possible object is
     *     {@link ELonString }
     *     
     */
    public ELonString getUCPTspeed() {
        return ucpTspeed;
    }

    /**
     * Sets the value of the ucpTspeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link ELonString }
     *     
     */
    public void setUCPTspeed(ELonString value) {
        this.ucpTspeed = value;
    }

    /**
     * Gets the value of the ucpTsize property.
     * 
     * @return
     *     possible object is
     *     {@link ELonString }
     *     
     */
    public ELonString getUCPTsize() {
        return ucpTsize;
    }

    /**
     * Sets the value of the ucpTsize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ELonString }
     *     
     */
    public void setUCPTsize(ELonString value) {
        this.ucpTsize = value;
    }

    /**
     * Gets the value of the ucpTparity property.
     * 
     * @return
     *     possible object is
     *     {@link ELonString }
     *     
     */
    public ELonString getUCPTparity() {
        return ucpTparity;
    }

    /**
     * Sets the value of the ucpTparity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ELonString }
     *     
     */
    public void setUCPTparity(ELonString value) {
        this.ucpTparity = value;
    }

    /**
     * Gets the value of the ucpTstopBits property.
     * 
     * @return
     *     possible object is
     *     {@link ELonString }
     *     
     */
    public ELonString getUCPTstopBits() {
        return ucpTstopBits;
    }

    /**
     * Sets the value of the ucpTstopBits property.
     * 
     * @param value
     *     allowed object is
     *     {@link ELonString }
     *     
     */
    public void setUCPTstopBits(ELonString value) {
        this.ucpTstopBits = value;
    }

}
