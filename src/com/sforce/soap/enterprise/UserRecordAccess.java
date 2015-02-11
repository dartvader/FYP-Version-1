
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserRecordAccess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserRecordAccess">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="HasAllAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasDeleteAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasEditAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasReadAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HasTransferAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaxAccessLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecordId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserRecordAccess", propOrder = {
    "hasAllAccess",
    "hasDeleteAccess",
    "hasEditAccess",
    "hasReadAccess",
    "hasTransferAccess",
    "maxAccessLevel",
    "recordId",
    "userId"
})
public class UserRecordAccess
    extends SObject
{

    @XmlElement(name = "HasAllAccess", nillable = true)
    protected Boolean hasAllAccess;
    @XmlElement(name = "HasDeleteAccess", nillable = true)
    protected Boolean hasDeleteAccess;
    @XmlElement(name = "HasEditAccess", nillable = true)
    protected Boolean hasEditAccess;
    @XmlElement(name = "HasReadAccess", nillable = true)
    protected Boolean hasReadAccess;
    @XmlElement(name = "HasTransferAccess", nillable = true)
    protected Boolean hasTransferAccess;
    @XmlElement(name = "MaxAccessLevel", nillable = true)
    protected String maxAccessLevel;
    @XmlElement(name = "RecordId", nillable = true)
    protected String recordId;
    @XmlElement(name = "UserId", nillable = true)
    protected String userId;

    /**
     * Gets the value of the hasAllAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAllAccess() {
        return hasAllAccess;
    }

    /**
     * Sets the value of the hasAllAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAllAccess(Boolean value) {
        this.hasAllAccess = value;
    }

    /**
     * Gets the value of the hasDeleteAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasDeleteAccess() {
        return hasDeleteAccess;
    }

    /**
     * Sets the value of the hasDeleteAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasDeleteAccess(Boolean value) {
        this.hasDeleteAccess = value;
    }

    /**
     * Gets the value of the hasEditAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasEditAccess() {
        return hasEditAccess;
    }

    /**
     * Sets the value of the hasEditAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasEditAccess(Boolean value) {
        this.hasEditAccess = value;
    }

    /**
     * Gets the value of the hasReadAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasReadAccess() {
        return hasReadAccess;
    }

    /**
     * Sets the value of the hasReadAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasReadAccess(Boolean value) {
        this.hasReadAccess = value;
    }

    /**
     * Gets the value of the hasTransferAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasTransferAccess() {
        return hasTransferAccess;
    }

    /**
     * Sets the value of the hasTransferAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasTransferAccess(Boolean value) {
        this.hasTransferAccess = value;
    }

    /**
     * Gets the value of the maxAccessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxAccessLevel() {
        return maxAccessLevel;
    }

    /**
     * Sets the value of the maxAccessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxAccessLevel(String value) {
        this.maxAccessLevel = value;
    }

    /**
     * Gets the value of the recordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordId() {
        return recordId;
    }

    /**
     * Sets the value of the recordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordId(String value) {
        this.recordId = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

}
