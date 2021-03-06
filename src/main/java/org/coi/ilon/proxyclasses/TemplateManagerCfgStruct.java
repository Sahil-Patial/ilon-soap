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
 * <p>Java class for TemplateManager_CfgStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TemplateManager_CfgStruct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Member" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="UCPTdescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="UCPTshortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="UCPTunit" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_Unit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="UCPTmemberName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="UCPTreference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="enum_" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}TemplateManager_CfgEnum" minOccurs="0"/&gt;
 *                   &lt;element name="float_" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}TemplateManager_CfgFloat" minOccurs="0"/&gt;
 *                   &lt;element name="struct_" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}TemplateManager_CfgStruct" minOccurs="0"/&gt;
 *                   &lt;element name="union_" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}TemplateManager_CfgStruct" minOccurs="0"/&gt;
 *                   &lt;element name="scalar_" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}TemplateManager_CfgScalar" minOccurs="0"/&gt;
 *                   &lt;element name="bitfield_" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}TemplateManager_CfgBitfield" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemplateManager_CfgStruct", propOrder = {
    "member"
})
public class TemplateManagerCfgStruct {

    @XmlElement(name = "Member")
    protected List<TemplateManagerCfgStruct.Member> member;

    /**
     * Gets the value of the member property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the member property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemplateManagerCfgStruct.Member }
     * 
     * 
     */
    public List<TemplateManagerCfgStruct.Member> getMember() {
        if (member == null) {
            member = new ArrayList<TemplateManagerCfgStruct.Member>();
        }
        return this.member;
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
     *         &lt;element name="UCPTdescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="UCPTshortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="UCPTunit" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_Unit" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="UCPTmemberName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="UCPTreference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="enum_" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}TemplateManager_CfgEnum" minOccurs="0"/&gt;
     *         &lt;element name="float_" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}TemplateManager_CfgFloat" minOccurs="0"/&gt;
     *         &lt;element name="struct_" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}TemplateManager_CfgStruct" minOccurs="0"/&gt;
     *         &lt;element name="union_" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}TemplateManager_CfgStruct" minOccurs="0"/&gt;
     *         &lt;element name="scalar_" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}TemplateManager_CfgScalar" minOccurs="0"/&gt;
     *         &lt;element name="bitfield_" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}TemplateManager_CfgBitfield" minOccurs="0"/&gt;
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
        "ucpTdescription",
        "ucpTshortDescription",
        "ucpTunit",
        "ucpTmemberName",
        "ucpTreference",
        "_enum",
        "_float",
        "struct",
        "union",
        "scalar",
        "bitfield"
    })
    public static class Member {

        @XmlElement(name = "UCPTdescription")
        protected String ucpTdescription;
        @XmlElement(name = "UCPTshortDescription")
        protected String ucpTshortDescription;
        @XmlElement(name = "UCPTunit")
        protected List<EUnit> ucpTunit;
        @XmlElement(name = "UCPTmemberName", required = true)
        protected String ucpTmemberName;
        @XmlElement(name = "UCPTreference")
        protected String ucpTreference;
        @XmlElement(name = "enum_")
        protected TemplateManagerCfgEnum _enum;
        @XmlElement(name = "float_")
        protected TemplateManagerCfgFloat _float;
        @XmlElement(name = "struct_")
        protected TemplateManagerCfgStruct struct;
        @XmlElement(name = "union_")
        protected TemplateManagerCfgStruct union;
        @XmlElement(name = "scalar_")
        protected TemplateManagerCfgScalar scalar;
        @XmlElement(name = "bitfield_")
        protected TemplateManagerCfgBitfield bitfield;

        /**
         * Gets the value of the ucpTdescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUCPTdescription() {
            return ucpTdescription;
        }

        /**
         * Sets the value of the ucpTdescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUCPTdescription(String value) {
            this.ucpTdescription = value;
        }

        /**
         * Gets the value of the ucpTshortDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUCPTshortDescription() {
            return ucpTshortDescription;
        }

        /**
         * Sets the value of the ucpTshortDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUCPTshortDescription(String value) {
            this.ucpTshortDescription = value;
        }

        /**
         * Gets the value of the ucpTunit property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ucpTunit property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUCPTunit().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EUnit }
         * 
         * 
         */
        public List<EUnit> getUCPTunit() {
            if (ucpTunit == null) {
                ucpTunit = new ArrayList<EUnit>();
            }
            return this.ucpTunit;
        }

        /**
         * Gets the value of the ucpTmemberName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUCPTmemberName() {
            return ucpTmemberName;
        }

        /**
         * Sets the value of the ucpTmemberName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUCPTmemberName(String value) {
            this.ucpTmemberName = value;
        }

        /**
         * Gets the value of the ucpTreference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUCPTreference() {
            return ucpTreference;
        }

        /**
         * Sets the value of the ucpTreference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUCPTreference(String value) {
            this.ucpTreference = value;
        }

        /**
         * Gets the value of the enum property.
         * 
         * @return
         *     possible object is
         *     {@link TemplateManagerCfgEnum }
         *     
         */
        public TemplateManagerCfgEnum getEnum() {
            return _enum;
        }

        /**
         * Sets the value of the enum property.
         * 
         * @param value
         *     allowed object is
         *     {@link TemplateManagerCfgEnum }
         *     
         */
        public void setEnum(TemplateManagerCfgEnum value) {
            this._enum = value;
        }

        /**
         * Gets the value of the float property.
         * 
         * @return
         *     possible object is
         *     {@link TemplateManagerCfgFloat }
         *     
         */
        public TemplateManagerCfgFloat getFloat() {
            return _float;
        }

        /**
         * Sets the value of the float property.
         * 
         * @param value
         *     allowed object is
         *     {@link TemplateManagerCfgFloat }
         *     
         */
        public void setFloat(TemplateManagerCfgFloat value) {
            this._float = value;
        }

        /**
         * Gets the value of the struct property.
         * 
         * @return
         *     possible object is
         *     {@link TemplateManagerCfgStruct }
         *     
         */
        public TemplateManagerCfgStruct getStruct() {
            return struct;
        }

        /**
         * Sets the value of the struct property.
         * 
         * @param value
         *     allowed object is
         *     {@link TemplateManagerCfgStruct }
         *     
         */
        public void setStruct(TemplateManagerCfgStruct value) {
            this.struct = value;
        }

        /**
         * Gets the value of the union property.
         * 
         * @return
         *     possible object is
         *     {@link TemplateManagerCfgStruct }
         *     
         */
        public TemplateManagerCfgStruct getUnion() {
            return union;
        }

        /**
         * Sets the value of the union property.
         * 
         * @param value
         *     allowed object is
         *     {@link TemplateManagerCfgStruct }
         *     
         */
        public void setUnion(TemplateManagerCfgStruct value) {
            this.union = value;
        }

        /**
         * Gets the value of the scalar property.
         * 
         * @return
         *     possible object is
         *     {@link TemplateManagerCfgScalar }
         *     
         */
        public TemplateManagerCfgScalar getScalar() {
            return scalar;
        }

        /**
         * Sets the value of the scalar property.
         * 
         * @param value
         *     allowed object is
         *     {@link TemplateManagerCfgScalar }
         *     
         */
        public void setScalar(TemplateManagerCfgScalar value) {
            this.scalar = value;
        }

        /**
         * Gets the value of the bitfield property.
         * 
         * @return
         *     possible object is
         *     {@link TemplateManagerCfgBitfield }
         *     
         */
        public TemplateManagerCfgBitfield getBitfield() {
            return bitfield;
        }

        /**
         * Sets the value of the bitfield property.
         * 
         * @param value
         *     allowed object is
         *     {@link TemplateManagerCfgBitfield }
         *     
         */
        public void setBitfield(TemplateManagerCfgBitfield value) {
            this.bitfield = value;
        }

    }

}
