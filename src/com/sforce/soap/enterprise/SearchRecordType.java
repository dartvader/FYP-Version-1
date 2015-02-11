
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="record" type="{urn:sobject.enterprise.soap.sforce.com}sObject"/>
 *         &lt;element name="snippet" type="{urn:enterprise.soap.sforce.com}SearchSnippet" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchRecord", namespace = "urn:enterprise.soap.sforce.com", propOrder = {
    "record",
    "snippet"
})
public class SearchRecordType {

    @XmlElement(required = true)
    protected SObject record;
    @XmlElement(nillable = true)
    protected SearchSnippetType snippet;

    /**
     * Gets the value of the record property.
     * 
     * @return
     *     possible object is
     *     {@link SObject }
     *     
     */
    public SObject getRecord() {
        return record;
    }

    /**
     * Sets the value of the record property.
     * 
     * @param value
     *     allowed object is
     *     {@link SObject }
     *     
     */
    public void setRecord(SObject value) {
        this.record = value;
    }

    /**
     * Gets the value of the snippet property.
     * 
     * @return
     *     possible object is
     *     {@link SearchSnippetType }
     *     
     */
    public SearchSnippetType getSnippet() {
        return snippet;
    }

    /**
     * Sets the value of the snippet property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchSnippetType }
     *     
     */
    public void setSnippet(SearchSnippetType value) {
        this.snippet = value;
    }

}
