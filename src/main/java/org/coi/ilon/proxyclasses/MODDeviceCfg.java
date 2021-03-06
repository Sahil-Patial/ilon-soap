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
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 				Specialized device configuration type.
 * 					Example:  xSelect="//Item[@xsi:type="MOD_Device_Cfg"]"
 * 					Example:  xSelect="//Item[@xsi:type="MOD_Device_Cfg"][starts-with(UCPTname,'Net/MOD/')]"
 * 			
 * 
 * <p>Java class for MOD_Device_Cfg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MOD_Device_Cfg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}Item_Cfg"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UCPThandle" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_UniqueKey" minOccurs="0"/&gt;
 *         &lt;element name="UCPTprogramId" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/&gt;
 *         &lt;element name="UCPTmaxElements" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Address" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="UCPTaddress" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="UCPTipAddress" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
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
@XmlType(name = "MOD_Device_Cfg", propOrder = {
    "ucpThandle",
    "ucpTprogramId",
    "ucpTmaxElements",
    "address"
})
public class MODDeviceCfg
    extends ItemCfg
{

    @XmlElement(name = "UCPThandle")
    protected EUniqueKey ucpThandle;
    @XmlElement(name = "UCPTprogramId", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] ucpTprogramId;
    @XmlElement(name = "UCPTmaxElements")
    protected Integer ucpTmaxElements;
    @XmlElement(name = "Address")
    protected MODDeviceCfg.Address address;

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
     * Gets the value of the ucpTprogramId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getUCPTprogramId() {
        return ucpTprogramId;
    }

    /**
     * Sets the value of the ucpTprogramId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCPTprogramId(byte[] value) {
        this.ucpTprogramId = value;
    }

    /**
     * Gets the value of the ucpTmaxElements property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUCPTmaxElements() {
        return ucpTmaxElements;
    }

    /**
     * Sets the value of the ucpTmaxElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUCPTmaxElements(Integer value) {
        this.ucpTmaxElements = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link MODDeviceCfg.Address }
     *     
     */
    public MODDeviceCfg.Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link MODDeviceCfg.Address }
     *     
     */
    public void setAddress(MODDeviceCfg.Address value) {
        this.address = value;
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
     *         &lt;element name="UCPTaddress" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="UCPTipAddress" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
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
        "ucpTaddress",
        "ucpTipAddress"
    })
    public static class Address {

        @XmlElement(name = "UCPTaddress")
        protected int ucpTaddress;
        @XmlElement(name = "UCPTipAddress")
        @XmlSchemaType(name = "anyURI")
        protected String ucpTipAddress;

        /**
         * Gets the value of the ucpTaddress property.
         * 
         */
        public int getUCPTaddress() {
            return ucpTaddress;
        }

        /**
         * Sets the value of the ucpTaddress property.
         * 
         */
        public void setUCPTaddress(int value) {
            this.ucpTaddress = value;
        }

        /**
         * Gets the value of the ucpTipAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUCPTipAddress() {
            return ucpTipAddress;
        }

        /**
         * Sets the value of the ucpTipAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUCPTipAddress(String value) {
            this.ucpTipAddress = value;
        }

    }

}
