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
 * 				Specialized network configuration type.
 * 					Example:  xSelect="//Item[@xsi:type="MBS_Network_Cfg"]".
 * 			
 * 
 * <p>Java class for MBS_Network_Cfg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MBS_Network_Cfg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}Item_Cfg"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UCPThandle" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_UniqueKey" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MBS_Network_Cfg", propOrder = {
    "ucpThandle"
})
public class MBSNetworkCfg
    extends ItemCfg
{

    @XmlElement(name = "UCPThandle")
    protected EUniqueKey ucpThandle;

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

}
