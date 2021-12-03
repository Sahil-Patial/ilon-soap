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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				LON specific network command (called with 'InvokeCmd' operation).
 * 			
 * 
 * <p>Java class for LON_Network_ScanCommand_Invoke complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LON_Network_ScanCommand_Invoke"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}Item"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Command" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="fault" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_Fault" minOccurs="0"/&gt;
 *                   &lt;element name="UCPTcommand" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}LON_Device_IlonNi_eCommand"/&gt;
 *                   &lt;element name="UCPTlastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *                   &lt;element name="UCPTstatus" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_LonString" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UCPTscan" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_LonString" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UCPTpredictive" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_Flag" minOccurs="0"/&gt;
 *         &lt;element name="UCPTdeviceLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UCPTunCfgOnly" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_Flag" minOccurs="0"/&gt;
 *         &lt;element name="UCPTppnUseFilterDiscovery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UCPTppnFilterDiscoveryDeviceType" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="UCPTppnFilterDiscoveryDomainType" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="UCPTppnFilterDiscoveryLocationIndex" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ScanCommand" use="required" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}LON_Network_eScanCommand" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LON_Network_ScanCommand_Invoke", propOrder = {
    "command",
    "ucpTscan",
    "ucpTpredictive",
    "ucpTdeviceLimit",
    "ucpTunCfgOnly",
    "ucpTppnUseFilterDiscovery",
    "ucpTppnFilterDiscoveryDeviceType",
    "ucpTppnFilterDiscoveryDomainType",
    "ucpTppnFilterDiscoveryLocationIndex"
})
public class LONNetworkScanCommandInvoke
    extends Item
{

    @XmlElement(name = "Command")
    protected List<LONNetworkScanCommandInvoke.Command> command;
    @XmlElement(name = "UCPTscan")
    protected List<ELonString> ucpTscan;
    @XmlElement(name = "UCPTpredictive")
    protected Short ucpTpredictive;
    @XmlElement(name = "UCPTdeviceLimit")
    protected Integer ucpTdeviceLimit;
    @XmlElement(name = "UCPTunCfgOnly")
    protected Short ucpTunCfgOnly;
    @XmlElement(name = "UCPTppnUseFilterDiscovery")
    protected String ucpTppnUseFilterDiscovery;
    @XmlElement(name = "UCPTppnFilterDiscoveryDeviceType")
    @XmlSchemaType(name = "unsignedInt")
    protected Long ucpTppnFilterDiscoveryDeviceType;
    @XmlElement(name = "UCPTppnFilterDiscoveryDomainType")
    @XmlSchemaType(name = "unsignedInt")
    protected Long ucpTppnFilterDiscoveryDomainType;
    @XmlElement(name = "UCPTppnFilterDiscoveryLocationIndex")
    @XmlSchemaType(name = "unsignedInt")
    protected Long ucpTppnFilterDiscoveryLocationIndex;
    @XmlAttribute(name = "ScanCommand", required = true)
    protected LONNetworkEScanCommand scanCommand;

    /**
     * Gets the value of the command property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the command property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LONNetworkScanCommandInvoke.Command }
     * 
     * 
     */
    public List<LONNetworkScanCommandInvoke.Command> getCommand() {
        if (command == null) {
            command = new ArrayList<LONNetworkScanCommandInvoke.Command>();
        }
        return this.command;
    }

    /**
     * Gets the value of the ucpTscan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ucpTscan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUCPTscan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ELonString }
     * 
     * 
     */
    public List<ELonString> getUCPTscan() {
        if (ucpTscan == null) {
            ucpTscan = new ArrayList<ELonString>();
        }
        return this.ucpTscan;
    }

    /**
     * Gets the value of the ucpTpredictive property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUCPTpredictive() {
        return ucpTpredictive;
    }

    /**
     * Sets the value of the ucpTpredictive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUCPTpredictive(Short value) {
        this.ucpTpredictive = value;
    }

    /**
     * Gets the value of the ucpTdeviceLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUCPTdeviceLimit() {
        return ucpTdeviceLimit;
    }

    /**
     * Sets the value of the ucpTdeviceLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUCPTdeviceLimit(Integer value) {
        this.ucpTdeviceLimit = value;
    }

    /**
     * Gets the value of the ucpTunCfgOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUCPTunCfgOnly() {
        return ucpTunCfgOnly;
    }

    /**
     * Sets the value of the ucpTunCfgOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUCPTunCfgOnly(Short value) {
        this.ucpTunCfgOnly = value;
    }

    /**
     * Gets the value of the ucpTppnUseFilterDiscovery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUCPTppnUseFilterDiscovery() {
        return ucpTppnUseFilterDiscovery;
    }

    /**
     * Sets the value of the ucpTppnUseFilterDiscovery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCPTppnUseFilterDiscovery(String value) {
        this.ucpTppnUseFilterDiscovery = value;
    }

    /**
     * Gets the value of the ucpTppnFilterDiscoveryDeviceType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUCPTppnFilterDiscoveryDeviceType() {
        return ucpTppnFilterDiscoveryDeviceType;
    }

    /**
     * Sets the value of the ucpTppnFilterDiscoveryDeviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUCPTppnFilterDiscoveryDeviceType(Long value) {
        this.ucpTppnFilterDiscoveryDeviceType = value;
    }

    /**
     * Gets the value of the ucpTppnFilterDiscoveryDomainType property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUCPTppnFilterDiscoveryDomainType() {
        return ucpTppnFilterDiscoveryDomainType;
    }

    /**
     * Sets the value of the ucpTppnFilterDiscoveryDomainType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUCPTppnFilterDiscoveryDomainType(Long value) {
        this.ucpTppnFilterDiscoveryDomainType = value;
    }

    /**
     * Gets the value of the ucpTppnFilterDiscoveryLocationIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUCPTppnFilterDiscoveryLocationIndex() {
        return ucpTppnFilterDiscoveryLocationIndex;
    }

    /**
     * Sets the value of the ucpTppnFilterDiscoveryLocationIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUCPTppnFilterDiscoveryLocationIndex(Long value) {
        this.ucpTppnFilterDiscoveryLocationIndex = value;
    }

    /**
     * Gets the value of the scanCommand property.
     * 
     * @return
     *     possible object is
     *     {@link LONNetworkEScanCommand }
     *     
     */
    public LONNetworkEScanCommand getScanCommand() {
        return scanCommand;
    }

    /**
     * Sets the value of the scanCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link LONNetworkEScanCommand }
     *     
     */
    public void setScanCommand(LONNetworkEScanCommand value) {
        this.scanCommand = value;
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
     *         &lt;element name="fault" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_Fault" minOccurs="0"/&gt;
     *         &lt;element name="UCPTcommand" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}LON_Device_IlonNi_eCommand"/&gt;
     *         &lt;element name="UCPTlastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
     *         &lt;element name="UCPTstatus" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_LonString" minOccurs="0"/&gt;
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
        "fault",
        "ucpTcommand",
        "ucpTlastUpdate",
        "ucpTstatus"
    })
    public static class Command {

        protected EFault fault;
        @XmlElement(name = "UCPTcommand", required = true)
        @XmlSchemaType(name = "string")
        protected LONDeviceIlonNiECommand ucpTcommand;
        @XmlElement(name = "UCPTlastUpdate")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar ucpTlastUpdate;
        @XmlElement(name = "UCPTstatus")
        protected ELonString ucpTstatus;

        /**
         * Gets the value of the fault property.
         * 
         * @return
         *     possible object is
         *     {@link EFault }
         *     
         */
        public EFault getFault() {
            return fault;
        }

        /**
         * Sets the value of the fault property.
         * 
         * @param value
         *     allowed object is
         *     {@link EFault }
         *     
         */
        public void setFault(EFault value) {
            this.fault = value;
        }

        /**
         * Gets the value of the ucpTcommand property.
         * 
         * @return
         *     possible object is
         *     {@link LONDeviceIlonNiECommand }
         *     
         */
        public LONDeviceIlonNiECommand getUCPTcommand() {
            return ucpTcommand;
        }

        /**
         * Sets the value of the ucpTcommand property.
         * 
         * @param value
         *     allowed object is
         *     {@link LONDeviceIlonNiECommand }
         *     
         */
        public void setUCPTcommand(LONDeviceIlonNiECommand value) {
            this.ucpTcommand = value;
        }

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
         * Gets the value of the ucpTstatus property.
         * 
         * @return
         *     possible object is
         *     {@link ELonString }
         *     
         */
        public ELonString getUCPTstatus() {
            return ucpTstatus;
        }

        /**
         * Sets the value of the ucpTstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link ELonString }
         *     
         */
        public void setUCPTstatus(ELonString value) {
            this.ucpTstatus = value;
        }

    }

}
