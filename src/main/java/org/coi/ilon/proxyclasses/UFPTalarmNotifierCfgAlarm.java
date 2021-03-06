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
 * <p>Java class for UFPTalarmNotifier_CfgAlarm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UFPTalarmNotifier_CfgAlarm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UCPTindex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UCPTlevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UCPTalarmText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UCPTalarmCondition" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_LonString" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFPTalarmNotifier_CfgAlarm", propOrder = {
    "ucpTindex",
    "ucpTlevel",
    "ucpTalarmText",
    "ucpTalarmCondition"
})
public class UFPTalarmNotifierCfgAlarm {

    @XmlElement(name = "UCPTindex")
    protected Integer ucpTindex;
    @XmlElement(name = "UCPTlevel")
    protected Integer ucpTlevel;
    @XmlElement(name = "UCPTalarmText")
    protected String ucpTalarmText;
    @XmlElement(name = "UCPTalarmCondition", required = true)
    protected List<ELonString> ucpTalarmCondition;

    /**
     * Gets the value of the ucpTindex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUCPTindex() {
        return ucpTindex;
    }

    /**
     * Sets the value of the ucpTindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUCPTindex(Integer value) {
        this.ucpTindex = value;
    }

    /**
     * Gets the value of the ucpTlevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUCPTlevel() {
        return ucpTlevel;
    }

    /**
     * Sets the value of the ucpTlevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUCPTlevel(Integer value) {
        this.ucpTlevel = value;
    }

    /**
     * Gets the value of the ucpTalarmText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUCPTalarmText() {
        return ucpTalarmText;
    }

    /**
     * Sets the value of the ucpTalarmText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCPTalarmText(String value) {
        this.ucpTalarmText = value;
    }

    /**
     * Gets the value of the ucpTalarmCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ucpTalarmCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUCPTalarmCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ELonString }
     * 
     * 
     */
    public List<ELonString> getUCPTalarmCondition() {
        if (ucpTalarmCondition == null) {
            ucpTalarmCondition = new ArrayList<ELonString>();
        }
        return this.ucpTalarmCondition;
    }

}
