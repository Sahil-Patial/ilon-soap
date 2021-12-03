//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.26 at 02:58:11 PM IST 
//


package org.coi.ilon.proxyclasses;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Generalized data type of the 'UFPTcalendar'.
 * 					Example:  xSelect="//Item[@xsi:type="UFPTcalendar_Data"][UCPTlastUpdate>="2007-01-15T15:30:21Z" and UCPTlastUpdate<"2007-02-11T15:30:21Z"][UCPTexceptionName="Holiday"][position()<500]"
 * 			
 * 
 * <p>Java class for UFPTcalendar_Data complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UFPTcalendar_Data"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}Fb_Data"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UCPTstart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="UCPTstop" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="UCPTexceptionName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DateEvent" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_LonString" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFPTcalendar_Data", propOrder = {
    "ucpTstart",
    "ucpTstop",
    "ucpTexceptionName",
    "dateEvent"
})
@XmlSeeAlso({
    UFPTschedulerCalendarMetaData.class
})
public class UFPTcalendarData
    extends FbData
{

    @XmlElement(name = "UCPTstart")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ucpTstart;
    @XmlElement(name = "UCPTstop")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ucpTstop;
    @XmlElement(name = "UCPTexceptionName")
    protected List<String> ucpTexceptionName;
    @XmlElement(name = "DateEvent")
    protected List<ELonString> dateEvent;

    /**
     * Gets the value of the ucpTstart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUCPTstart() {
        return ucpTstart;
    }

    /**
     * Sets the value of the ucpTstart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUCPTstart(XMLGregorianCalendar value) {
        this.ucpTstart = value;
    }

    /**
     * Gets the value of the ucpTstop property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUCPTstop() {
        return ucpTstop;
    }

    /**
     * Sets the value of the ucpTstop property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUCPTstop(XMLGregorianCalendar value) {
        this.ucpTstop = value;
    }

    /**
     * Gets the value of the ucpTexceptionName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ucpTexceptionName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUCPTexceptionName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUCPTexceptionName() {
        if (ucpTexceptionName == null) {
            ucpTexceptionName = new ArrayList<String>();
        }
        return this.ucpTexceptionName;
    }

    /**
     * Gets the value of the dateEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ELonString }
     * 
     * 
     */
    public List<ELonString> getDateEvent() {
        if (dateEvent == null) {
            dateEvent = new ArrayList<ELonString>();
        }
        return this.dateEvent;
    }

}