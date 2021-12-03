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
 * <p>Java class for LON_Device_RNI_Cfg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LON_Device_RNI_Cfg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}LON_Device_Cfg"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UCPTport" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UCPTmaxRxTransactions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LON_Device_RNI_Cfg", propOrder = {
    "ucpTport",
    "ucpTmaxRxTransactions"
})
public class LONDeviceRNICfg
    extends LONDeviceCfg
{

    @XmlElement(name = "UCPTport")
    protected Integer ucpTport;
    @XmlElement(name = "UCPTmaxRxTransactions")
    protected Integer ucpTmaxRxTransactions;

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
     * Gets the value of the ucpTmaxRxTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUCPTmaxRxTransactions() {
        return ucpTmaxRxTransactions;
    }

    /**
     * Sets the value of the ucpTmaxRxTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUCPTmaxRxTransactions(Integer value) {
        this.ucpTmaxRxTransactions = value;
    }

}