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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="iLonItem" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}Item_DataColl"/&gt;
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
    "iLonItem"
})
@XmlRootElement(name = "Write")
public class Write {

    @XmlElement(required = true)
    protected ItemDataColl iLonItem;

    /**
     * Gets the value of the iLonItem property.
     * 
     * @return
     *     possible object is
     *     {@link ItemDataColl }
     *     
     */
    public ItemDataColl getILonItem() {
        return iLonItem;
    }

    /**
     * Sets the value of the iLonItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemDataColl }
     *     
     */
    public void setILonItem(ItemDataColl value) {
        this.iLonItem = value;
    }

}
