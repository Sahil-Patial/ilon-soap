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
 * <p>Java class for UFPTanalogFunctionBlock_DpRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UFPTanalogFunctionBlock_DpRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_DpRef"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UCPTfieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UCPTpollRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFPTanalogFunctionBlock_DpRef", propOrder = {
    "ucpTfieldName",
    "ucpTpollRate"
})
public class UFPTanalogFunctionBlockDpRef
    extends EDpRef
{

    @XmlElement(name = "UCPTfieldName")
    protected String ucpTfieldName;
    @XmlElement(name = "UCPTpollRate")
    protected Double ucpTpollRate;

    /**
     * Gets the value of the ucpTfieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUCPTfieldName() {
        return ucpTfieldName;
    }

    /**
     * Sets the value of the ucpTfieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCPTfieldName(String value) {
        this.ucpTfieldName = value;
    }

    /**
     * Gets the value of the ucpTpollRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUCPTpollRate() {
        return ucpTpollRate;
    }

    /**
     * Sets the value of the ucpTpollRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUCPTpollRate(Double value) {
        this.ucpTpollRate = value;
    }

}