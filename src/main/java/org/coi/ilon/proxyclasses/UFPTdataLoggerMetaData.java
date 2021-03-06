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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Gneralized meta-data type of the 'UFPTdataLogger'. It'll only be responded (never used for a request).
 * 			
 * 
 * <p>Java class for UFPTdataLogger_Meta_Data complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UFPTdataLogger_Meta_Data"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}Fb_Data"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UCPTstart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="UCPTstop" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="UCPTmodificationNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UCPTlogLevel" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="UCPTtotalCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFPTdataLogger_Meta_Data", propOrder = {
    "ucpTstart",
    "ucpTstop",
    "ucpTmodificationNumber",
    "ucpTlogLevel",
    "ucpTtotalCount"
})
@XmlSeeAlso({
    UFPTdataLoggerClearResponse.class
})
public class UFPTdataLoggerMetaData
    extends FbData
{

    @XmlElement(name = "UCPTstart")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ucpTstart;
    @XmlElement(name = "UCPTstop")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ucpTstop;
    @XmlElement(name = "UCPTmodificationNumber")
    protected int ucpTmodificationNumber;
    @XmlElement(name = "UCPTlogLevel")
    protected float ucpTlogLevel;
    @XmlElement(name = "UCPTtotalCount")
    protected int ucpTtotalCount;

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
     * Gets the value of the ucpTmodificationNumber property.
     * 
     */
    public int getUCPTmodificationNumber() {
        return ucpTmodificationNumber;
    }

    /**
     * Sets the value of the ucpTmodificationNumber property.
     * 
     */
    public void setUCPTmodificationNumber(int value) {
        this.ucpTmodificationNumber = value;
    }

    /**
     * Gets the value of the ucpTlogLevel property.
     * 
     */
    public float getUCPTlogLevel() {
        return ucpTlogLevel;
    }

    /**
     * Sets the value of the ucpTlogLevel property.
     * 
     */
    public void setUCPTlogLevel(float value) {
        this.ucpTlogLevel = value;
    }

    /**
     * Gets the value of the ucpTtotalCount property.
     * 
     */
    public int getUCPTtotalCount() {
        return ucpTtotalCount;
    }

    /**
     * Sets the value of the ucpTtotalCount property.
     * 
     */
    public void setUCPTtotalCount(int value) {
        this.ucpTtotalCount = value;
    }

}
