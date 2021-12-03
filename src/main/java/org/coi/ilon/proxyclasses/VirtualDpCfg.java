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
 * 				Specialized data point configuration type.
 * 				Example: xSelect="//Item[@xsi:type="Virtual_Dp_Cfg"]"
 * 			
 * 
 * <p>Java class for Virtual_Dp_Cfg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Virtual_Dp_Cfg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}Dp_Cfg_Base"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UCPThandle" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_UniqueKey" minOccurs="0"/&gt;
 *         &lt;element name="UCPTpollRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="UCPTprogrammaticName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Virtual_Dp_Cfg", propOrder = {
    "ucpThandle",
    "ucpTpollRate",
    "ucpTprogrammaticName"
})
public class VirtualDpCfg
    extends DpCfgBase
{

    @XmlElement(name = "UCPThandle")
    protected EUniqueKey ucpThandle;
    @XmlElement(name = "UCPTpollRate")
    protected Double ucpTpollRate;
    @XmlElement(name = "UCPTprogrammaticName")
    protected String ucpTprogrammaticName;

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

    /**
     * Gets the value of the ucpTprogrammaticName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUCPTprogrammaticName() {
        return ucpTprogrammaticName;
    }

    /**
     * Sets the value of the ucpTprogrammaticName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCPTprogrammaticName(String value) {
        this.ucpTprogrammaticName = value;
    }

}
