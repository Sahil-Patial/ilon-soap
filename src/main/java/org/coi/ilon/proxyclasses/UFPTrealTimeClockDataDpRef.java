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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UFPTrealTimeClock_Data_DpRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UFPTrealTimeClock_Data_DpRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_DpRef"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}dateTime" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UFPTrealTimeClock_Data_DpRef", propOrder = {
    "value"
})
public class UFPTrealTimeClockDataDpRef
    extends EDpRef
{

    @XmlElement(name = "Value", required = true)
    @XmlSchemaType(name = "dateTime")
    protected List<XMLGregorianCalendar> value;

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getValue() {
        if (value == null) {
            value = new ArrayList<XMLGregorianCalendar>();
        }
        return this.value;
    }

}