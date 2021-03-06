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


/**
 * 
 * 					Service configuration type of the service 'TemplateManager'.
 * 						Example:  xSelect="//Item[@xsi:type="TemplateManager_CPT_Cfg"][UCPTprogramId="900001012881040C"][UCPTlength="2"][UCPTlanguage="enu"]"
 * 			
 * 
 * <p>Java class for TemplateManager_CPT_Cfg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TemplateManager_CPT_Cfg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}TemplateManager_Cfg"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UCPTshortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UCPTunit" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_Unit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UCPTmemberName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UCPTreference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="enum_" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}TemplateManager_CfgEnum" minOccurs="0"/&gt;
 *         &lt;element name="float_" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}TemplateManager_CfgFloat" minOccurs="0"/&gt;
 *         &lt;element name="struct_" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}TemplateManager_CfgStruct" minOccurs="0"/&gt;
 *         &lt;element name="union_" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}TemplateManager_CfgStruct" minOccurs="0"/&gt;
 *         &lt;element name="scalar_" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}TemplateManager_CfgScalar" minOccurs="0"/&gt;
 *         &lt;element name="bitfield_" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}TemplateManager_CfgBitfield" minOccurs="0"/&gt;
 *         &lt;element name="UCPTlength" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
 *         &lt;element name="UCPTinheriting" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_Flag" minOccurs="0"/&gt;
 *         &lt;element name="UCPTminValue" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_LonString" minOccurs="0"/&gt;
 *         &lt;element name="UCPTmaxValue" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_LonString" minOccurs="0"/&gt;
 *         &lt;element name="UCPTdefaultValue" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}E_LonString" minOccurs="0"/&gt;
 *         &lt;element name="FormatString" type="{http://wsdl.echelon.com/web_services_ns/ilon100/v4.0/message/}TemplateManager_CfgFormatString" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemplateManager_CPT_Cfg", propOrder = {
    "ucpTshortDescription",
    "ucpTunit",
    "ucpTmemberName",
    "ucpTreference",
    "_enum",
    "_float",
    "struct",
    "union",
    "scalar",
    "bitfield",
    "ucpTlength",
    "ucpTinheriting",
    "ucpTminValue",
    "ucpTmaxValue",
    "ucpTdefaultValue",
    "formatString"
})
public class TemplateManagerCPTCfg
    extends TemplateManagerCfg
{

    @XmlElement(name = "UCPTshortDescription")
    protected String ucpTshortDescription;
    @XmlElement(name = "UCPTunit")
    protected List<EUnit> ucpTunit;
    @XmlElement(name = "UCPTmemberName")
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
    @XmlElement(name = "UCPTlength")
    @XmlSchemaType(name = "unsignedShort")
    protected int ucpTlength;
    @XmlElement(name = "UCPTinheriting")
    protected Short ucpTinheriting;
    @XmlElement(name = "UCPTminValue")
    protected ELonString ucpTminValue;
    @XmlElement(name = "UCPTmaxValue")
    protected ELonString ucpTmaxValue;
    @XmlElement(name = "UCPTdefaultValue")
    protected ELonString ucpTdefaultValue;
    @XmlElement(name = "FormatString")
    protected List<TemplateManagerCfgFormatString> formatString;

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

    /**
     * Gets the value of the ucpTlength property.
     * 
     */
    public int getUCPTlength() {
        return ucpTlength;
    }

    /**
     * Sets the value of the ucpTlength property.
     * 
     */
    public void setUCPTlength(int value) {
        this.ucpTlength = value;
    }

    /**
     * Gets the value of the ucpTinheriting property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUCPTinheriting() {
        return ucpTinheriting;
    }

    /**
     * Sets the value of the ucpTinheriting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUCPTinheriting(Short value) {
        this.ucpTinheriting = value;
    }

    /**
     * Gets the value of the ucpTminValue property.
     * 
     * @return
     *     possible object is
     *     {@link ELonString }
     *     
     */
    public ELonString getUCPTminValue() {
        return ucpTminValue;
    }

    /**
     * Sets the value of the ucpTminValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ELonString }
     *     
     */
    public void setUCPTminValue(ELonString value) {
        this.ucpTminValue = value;
    }

    /**
     * Gets the value of the ucpTmaxValue property.
     * 
     * @return
     *     possible object is
     *     {@link ELonString }
     *     
     */
    public ELonString getUCPTmaxValue() {
        return ucpTmaxValue;
    }

    /**
     * Sets the value of the ucpTmaxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ELonString }
     *     
     */
    public void setUCPTmaxValue(ELonString value) {
        this.ucpTmaxValue = value;
    }

    /**
     * Gets the value of the ucpTdefaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link ELonString }
     *     
     */
    public ELonString getUCPTdefaultValue() {
        return ucpTdefaultValue;
    }

    /**
     * Sets the value of the ucpTdefaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ELonString }
     *     
     */
    public void setUCPTdefaultValue(ELonString value) {
        this.ucpTdefaultValue = value;
    }

    /**
     * Gets the value of the formatString property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formatString property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormatString().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemplateManagerCfgFormatString }
     * 
     * 
     */
    public List<TemplateManagerCfgFormatString> getFormatString() {
        if (formatString == null) {
            formatString = new ArrayList<TemplateManagerCfgFormatString>();
        }
        return this.formatString;
    }

}
