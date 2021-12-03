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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				
 * 				Extended 'Item' service responses
 * 			
 * 			
 * 
 * <p>Java class for Item_Service complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Item_Service"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}Item"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UCPTlastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="UCPTdescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UCPTfileSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Item_Service", propOrder = {
    "ucpTlastUpdate",
    "ucpTdescription",
    "ucpTfileSize"
})
public class ItemService
    extends Item
{

    @XmlElement(name = "UCPTlastUpdate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ucpTlastUpdate;
    @XmlElement(name = "UCPTdescription")
    protected String ucpTdescription;
    @XmlElement(name = "UCPTfileSize")
    protected Integer ucpTfileSize;

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
     * Gets the value of the ucpTdescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUCPTdescription() {
        return ucpTdescription;
    }

    /**
     * Sets the value of the ucpTdescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCPTdescription(String value) {
        this.ucpTdescription = value;
    }

    /**
     * Gets the value of the ucpTfileSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUCPTfileSize() {
        return ucpTfileSize;
    }

    /**
     * Sets the value of the ucpTfileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUCPTfileSize(Integer value) {
        this.ucpTfileSize = value;
    }

}
