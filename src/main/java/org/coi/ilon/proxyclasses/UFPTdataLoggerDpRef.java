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
 * <p>Java class for UFPTdataLogger_DpRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UFPTdataLogger_DpRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_DpRef"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UCPTlogMinDeltaTime" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="UCPTlogMinDeltaValue" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_LonString" minOccurs="0"/&gt;
 *         &lt;element name="UCPTpollRate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFPTdataLogger_DpRef", propOrder = {
    "ucpTlogMinDeltaTime",
    "ucpTlogMinDeltaValue",
    "ucpTpollRate"
})
public class UFPTdataLoggerDpRef
    extends EDpRef
{

    @XmlElement(name = "UCPTlogMinDeltaTime")
    protected double ucpTlogMinDeltaTime;
    @XmlElement(name = "UCPTlogMinDeltaValue")
    protected ELonString ucpTlogMinDeltaValue;
    @XmlElement(name = "UCPTpollRate")
    protected double ucpTpollRate;

    /**
     * Gets the value of the ucpTlogMinDeltaTime property.
     * 
     */
    public double getUCPTlogMinDeltaTime() {
        return ucpTlogMinDeltaTime;
    }

    /**
     * Sets the value of the ucpTlogMinDeltaTime property.
     * 
     */
    public void setUCPTlogMinDeltaTime(double value) {
        this.ucpTlogMinDeltaTime = value;
    }

    /**
     * Gets the value of the ucpTlogMinDeltaValue property.
     * 
     * @return
     *     possible object is
     *     {@link ELonString }
     *     
     */
    public ELonString getUCPTlogMinDeltaValue() {
        return ucpTlogMinDeltaValue;
    }

    /**
     * Sets the value of the ucpTlogMinDeltaValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ELonString }
     *     
     */
    public void setUCPTlogMinDeltaValue(ELonString value) {
        this.ucpTlogMinDeltaValue = value;
    }

    /**
     * Gets the value of the ucpTpollRate property.
     * 
     */
    public double getUCPTpollRate() {
        return ucpTpollRate;
    }

    /**
     * Sets the value of the ucpTpollRate property.
     * 
     */
    public void setUCPTpollRate(double value) {
        this.ucpTpollRate = value;
    }

}