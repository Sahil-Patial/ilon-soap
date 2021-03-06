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
 * 					Example:  xSelect="//Item[@xsi:type="MOD_Dp_Cfg"]"
 * 					Example:  xSelect="//Item[@xsi:type="MOD_Dp_Cfg"][starts-with(UCPTname,'Net/MOD/')]"
 * 			
 * 
 * <p>Java class for MOD_Dp_Cfg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MOD_Dp_Cfg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}Dp_Cfg_Base"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UCPThandle" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_UniqueKey" minOccurs="0"/&gt;
 *         &lt;element name="UCPTbaseType" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_LonString"/&gt;
 *         &lt;element name="UCPTmodbusTable" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_LonString"/&gt;
 *         &lt;element name="UCPTstartAddress" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UCPTstartBit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="UCPTbitLength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UCPTdataOrdering" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_LonString"/&gt;
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
@XmlType(name = "MOD_Dp_Cfg", propOrder = {
    "ucpThandle",
    "ucpTbaseType",
    "ucpTmodbusTable",
    "ucpTstartAddress",
    "ucpTstartBit",
    "ucpTbitLength",
    "ucpTdataOrdering",
    "ucpTpollRate"
})
public class MODDpCfg
    extends DpCfgBase
{

    @XmlElement(name = "UCPThandle")
    protected EUniqueKey ucpThandle;
    @XmlElement(name = "UCPTbaseType", required = true)
    protected ELonString ucpTbaseType;
    @XmlElement(name = "UCPTmodbusTable", required = true)
    protected ELonString ucpTmodbusTable;
    @XmlElement(name = "UCPTstartAddress")
    protected int ucpTstartAddress;
    @XmlElement(name = "UCPTstartBit")
    protected int ucpTstartBit;
    @XmlElement(name = "UCPTbitLength")
    protected Integer ucpTbitLength;
    @XmlElement(name = "UCPTdataOrdering", required = true)
    protected ELonString ucpTdataOrdering;
    @XmlElement(name = "UCPTpollRate")
    protected Double ucpTpollRate;

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
     * Gets the value of the ucpTbaseType property.
     * 
     * @return
     *     possible object is
     *     {@link ELonString }
     *     
     */
    public ELonString getUCPTbaseType() {
        return ucpTbaseType;
    }

    /**
     * Sets the value of the ucpTbaseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ELonString }
     *     
     */
    public void setUCPTbaseType(ELonString value) {
        this.ucpTbaseType = value;
    }

    /**
     * Gets the value of the ucpTmodbusTable property.
     * 
     * @return
     *     possible object is
     *     {@link ELonString }
     *     
     */
    public ELonString getUCPTmodbusTable() {
        return ucpTmodbusTable;
    }

    /**
     * Sets the value of the ucpTmodbusTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link ELonString }
     *     
     */
    public void setUCPTmodbusTable(ELonString value) {
        this.ucpTmodbusTable = value;
    }

    /**
     * Gets the value of the ucpTstartAddress property.
     * 
     */
    public int getUCPTstartAddress() {
        return ucpTstartAddress;
    }

    /**
     * Sets the value of the ucpTstartAddress property.
     * 
     */
    public void setUCPTstartAddress(int value) {
        this.ucpTstartAddress = value;
    }

    /**
     * Gets the value of the ucpTstartBit property.
     * 
     */
    public int getUCPTstartBit() {
        return ucpTstartBit;
    }

    /**
     * Sets the value of the ucpTstartBit property.
     * 
     */
    public void setUCPTstartBit(int value) {
        this.ucpTstartBit = value;
    }

    /**
     * Gets the value of the ucpTbitLength property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUCPTbitLength() {
        return ucpTbitLength;
    }

    /**
     * Sets the value of the ucpTbitLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUCPTbitLength(Integer value) {
        this.ucpTbitLength = value;
    }

    /**
     * Gets the value of the ucpTdataOrdering property.
     * 
     * @return
     *     possible object is
     *     {@link ELonString }
     *     
     */
    public ELonString getUCPTdataOrdering() {
        return ucpTdataOrdering;
    }

    /**
     * Sets the value of the ucpTdataOrdering property.
     * 
     * @param value
     *     allowed object is
     *     {@link ELonString }
     *     
     */
    public void setUCPTdataOrdering(ELonString value) {
        this.ucpTdataOrdering = value;
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
