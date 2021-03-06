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


/**
 * 
 * 			  Response to LON specific device command 'PPNData'.
 * 			
 * 
 * <p>Java class for LON_Device_PPNData_InvokeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LON_Device_PPNData_InvokeResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}Item_Data"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UCPTtimeToRemoval" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LON_Device_PPNData_InvokeResponse", propOrder = {
    "ucpTtimeToRemoval"
})
public class LONDevicePPNDataInvokeResponse
    extends ItemData
{

    @XmlElement(name = "UCPTtimeToRemoval")
    @XmlSchemaType(name = "unsignedInt")
    protected long ucpTtimeToRemoval;

    /**
     * Gets the value of the ucpTtimeToRemoval property.
     * 
     */
    public long getUCPTtimeToRemoval() {
        return ucpTtimeToRemoval;
    }

    /**
     * Sets the value of the ucpTtimeToRemoval property.
     * 
     */
    public void setUCPTtimeToRemoval(long value) {
        this.ucpTtimeToRemoval = value;
    }

}
