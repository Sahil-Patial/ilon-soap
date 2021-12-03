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
 * 				
 * 				'Item_Coll' is the generic collection of 'Item'.
 * 				It is used for 'List'-resp, 'Get'-req, 'Set'-resp, 'Delete'-req/-resp, 'Read'-req, 'Write'-resp, 'Clear'-req/-resp, 'InvokeCmd'-req/-resp
 * 			
 * 			
 * 
 * <p>Java class for Item_Coll complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Item_Coll"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_xSelect"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UCPTfaultCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="fault" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_Fault" minOccurs="0"/&gt;
 *         &lt;element name="UCPTcurrentConfig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Item" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}Item" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Item_Coll", propOrder = {
    "ucpTfaultCount",
    "fault",
    "ucpTcurrentConfig",
    "item"
})
public class ItemColl
    extends EXSelect
{

    @XmlElement(name = "UCPTfaultCount")
    protected Integer ucpTfaultCount;
    protected EFault fault;
    @XmlElement(name = "UCPTcurrentConfig")
    protected String ucpTcurrentConfig;
    @XmlElement(name = "Item")
    protected List<Item> item;

    /**
     * Gets the value of the ucpTfaultCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUCPTfaultCount() {
        return ucpTfaultCount;
    }

    /**
     * Sets the value of the ucpTfaultCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUCPTfaultCount(Integer value) {
        this.ucpTfaultCount = value;
    }

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
     * Gets the value of the ucpTcurrentConfig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUCPTcurrentConfig() {
        return ucpTcurrentConfig;
    }

    /**
     * Sets the value of the ucpTcurrentConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUCPTcurrentConfig(String value) {
        this.ucpTcurrentConfig = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Item }
     * 
     * 
     */
    public List<Item> getItem() {
        if (item == null) {
            item = new ArrayList<Item>();
        }
        return this.item;
    }

}
