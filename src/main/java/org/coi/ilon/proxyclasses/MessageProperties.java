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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="UCPTtimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="UCPTuniqueId" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/&gt;
 *         &lt;element name="UCPTipAddress" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="UCPTport" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UCPTlastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="UCPTprocessingTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
    "ucpTtimeStamp",
    "ucpTuniqueId",
    "ucpTipAddress",
    "ucpTport",
    "ucpTlastUpdate",
    "ucpTprocessingTime"
})
@XmlRootElement(name = "messageProperties")
public class MessageProperties {

    @XmlElement(name = "UCPTtimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ucpTtimeStamp;
    @XmlElement(name = "UCPTuniqueId", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] ucpTuniqueId;
    @XmlElement(name = "UCPTipAddress")
    @XmlSchemaType(name = "anyURI")
    protected String ucpTipAddress;
    @XmlElement(name = "UCPTport")
    protected Integer ucpTport;
    @XmlElement(name = "UCPTlastUpdate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ucpTlastUpdate;
    @XmlElement(name = "UCPTprocessingTime")
    protected Long ucpTprocessingTime;

    /**
     * Gets the value of the ucpTtimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUCPTtimeStamp() {
        return ucpTtimeStamp;
    }

    /**
     * Sets the value of the ucpTtimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUCPTtimeStamp(XMLGregorianCalendar value) {
        this.ucpTtimeStamp = value;
    }

    /**
     * Gets the value of the ucpTuniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getUCPTuniqueId() {
        return ucpTuniqueId;
    }

    /**
     * Sets the value of the ucpTuniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCPTuniqueId(byte[] value) {
        this.ucpTuniqueId = value;
    }

    /**
     * Gets the value of the ucpTipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUCPTipAddress() {
        return ucpTipAddress;
    }

    /**
     * Sets the value of the ucpTipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCPTipAddress(String value) {
        this.ucpTipAddress = value;
    }

    /**
     * Gets the value of the ucpTport property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUCPTport() {
        return ucpTport;
    }

    /**
     * Sets the value of the ucpTport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUCPTport(Integer value) {
        this.ucpTport = value;
    }

    /**
     * Gets the value of the ucpTlastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUCPTlastUpdate() {
        return ucpTlastUpdate;
    }

    /**
     * Sets the value of the ucpTlastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUCPTlastUpdate(XMLGregorianCalendar value) {
        this.ucpTlastUpdate = value;
    }

    /**
     * Gets the value of the ucpTprocessingTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUCPTprocessingTime() {
        return ucpTprocessingTime;
    }

    /**
     * Sets the value of the ucpTprocessingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUCPTprocessingTime(Long value) {
        this.ucpTprocessingTime = value;
    }

}
