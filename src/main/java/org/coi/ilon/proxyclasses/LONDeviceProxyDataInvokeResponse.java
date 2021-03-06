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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			  Response to LON specific device command 'ProxyData'.
 * 			
 * 
 * <p>Java class for LON_Device_ProxyData_InvokeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LON_Device_ProxyData_InvokeResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}Item_Data"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProxyAgent" maxOccurs="10" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="UCPTname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="UCPTfailureHistory" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_LonString"/&gt;
 *                   &lt;element name="FrequencyInfo" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}LON_Device_DataFrequencyInfo" maxOccurs="2"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LON_Device_ProxyData_InvokeResponse", propOrder = {
    "proxyAgent"
})
public class LONDeviceProxyDataInvokeResponse
    extends ItemData
{

    @XmlElement(name = "ProxyAgent")
    protected List<LONDeviceProxyDataInvokeResponse.ProxyAgent> proxyAgent;

    /**
     * Gets the value of the proxyAgent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proxyAgent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProxyAgent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LONDeviceProxyDataInvokeResponse.ProxyAgent }
     * 
     * 
     */
    public List<LONDeviceProxyDataInvokeResponse.ProxyAgent> getProxyAgent() {
        if (proxyAgent == null) {
            proxyAgent = new ArrayList<LONDeviceProxyDataInvokeResponse.ProxyAgent>();
        }
        return this.proxyAgent;
    }


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
     *         &lt;element name="UCPTname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="UCPTfailureHistory" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_LonString"/&gt;
     *         &lt;element name="FrequencyInfo" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}LON_Device_DataFrequencyInfo" maxOccurs="2"/&gt;
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
        "ucpTname",
        "ucpTfailureHistory",
        "frequencyInfo"
    })
    public static class ProxyAgent {

        @XmlElement(name = "UCPTname", required = true)
        protected String ucpTname;
        @XmlElement(name = "UCPTfailureHistory", required = true)
        protected ELonString ucpTfailureHistory;
        @XmlElement(name = "FrequencyInfo", required = true)
        protected List<LONDeviceDataFrequencyInfo> frequencyInfo;

        /**
         * Gets the value of the ucpTname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUCPTname() {
            return ucpTname;
        }

        /**
         * Sets the value of the ucpTname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUCPTname(String value) {
            this.ucpTname = value;
        }

        /**
         * Gets the value of the ucpTfailureHistory property.
         * 
         * @return
         *     possible object is
         *     {@link ELonString }
         *     
         */
        public ELonString getUCPTfailureHistory() {
            return ucpTfailureHistory;
        }

        /**
         * Sets the value of the ucpTfailureHistory property.
         * 
         * @param value
         *     allowed object is
         *     {@link ELonString }
         *     
         */
        public void setUCPTfailureHistory(ELonString value) {
            this.ucpTfailureHistory = value;
        }

        /**
         * Gets the value of the frequencyInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the frequencyInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFrequencyInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LONDeviceDataFrequencyInfo }
         * 
         * 
         */
        public List<LONDeviceDataFrequencyInfo> getFrequencyInfo() {
            if (frequencyInfo == null) {
                frequencyInfo = new ArrayList<LONDeviceDataFrequencyInfo>();
            }
            return this.frequencyInfo;
        }

    }

}
