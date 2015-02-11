
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ContentDistribution complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentDistribution">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="ContentDistributionViews" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="ContentDocumentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ContentVersion" type="{urn:sobject.enterprise.soap.sforce.com}ContentVersion" minOccurs="0"/>
 *         &lt;element name="ContentVersionId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DistributionPublicUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FirstViewDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastViewDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Owner" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="OwnerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferencesAllowOriginalDownload" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PreferencesAllowPDFDownload" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PreferencesAllowViewInBrowser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PreferencesExpires" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PreferencesLinkLatestVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PreferencesNotifyOnVisit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PreferencesNotifyRndtnComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PreferencesPasswordRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RelatedRecord" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="RelatedRecordId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ViewCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentDistribution", propOrder = {
    "contentDistributionViews",
    "contentDocumentId",
    "contentVersion",
    "contentVersionId",
    "createdBy",
    "createdById",
    "createdDate",
    "distributionPublicUrl",
    "expiryDate",
    "firstViewDate",
    "isDeleted",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "lastViewDate",
    "name",
    "owner",
    "ownerId",
    "password",
    "preferencesAllowOriginalDownload",
    "preferencesAllowPDFDownload",
    "preferencesAllowViewInBrowser",
    "preferencesExpires",
    "preferencesLinkLatestVersion",
    "preferencesNotifyOnVisit",
    "preferencesNotifyRndtnComplete",
    "preferencesPasswordRequired",
    "relatedRecord",
    "relatedRecordId",
    "systemModstamp",
    "viewCount"
})
public class ContentDistribution
    extends SObject
{

    @XmlElement(name = "ContentDistributionViews", nillable = true)
    protected QueryResultType contentDistributionViews;
    @XmlElement(name = "ContentDocumentId", nillable = true)
    protected String contentDocumentId;
    @XmlElement(name = "ContentVersion", nillable = true)
    protected ContentVersion contentVersion;
    @XmlElement(name = "ContentVersionId", nillable = true)
    protected String contentVersionId;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected User createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "DistributionPublicUrl", nillable = true)
    protected String distributionPublicUrl;
    @XmlElement(name = "ExpiryDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(name = "FirstViewDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstViewDate;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected User lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "LastViewDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastViewDate;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "Owner", nillable = true)
    protected User owner;
    @XmlElement(name = "OwnerId", nillable = true)
    protected String ownerId;
    @XmlElement(name = "Password", nillable = true)
    protected String password;
    @XmlElement(name = "PreferencesAllowOriginalDownload", nillable = true)
    protected Boolean preferencesAllowOriginalDownload;
    @XmlElement(name = "PreferencesAllowPDFDownload", nillable = true)
    protected Boolean preferencesAllowPDFDownload;
    @XmlElement(name = "PreferencesAllowViewInBrowser", nillable = true)
    protected Boolean preferencesAllowViewInBrowser;
    @XmlElement(name = "PreferencesExpires", nillable = true)
    protected Boolean preferencesExpires;
    @XmlElement(name = "PreferencesLinkLatestVersion", nillable = true)
    protected Boolean preferencesLinkLatestVersion;
    @XmlElement(name = "PreferencesNotifyOnVisit", nillable = true)
    protected Boolean preferencesNotifyOnVisit;
    @XmlElement(name = "PreferencesNotifyRndtnComplete", nillable = true)
    protected Boolean preferencesNotifyRndtnComplete;
    @XmlElement(name = "PreferencesPasswordRequired", nillable = true)
    protected Boolean preferencesPasswordRequired;
    @XmlElement(name = "RelatedRecord", nillable = true)
    protected Name relatedRecord;
    @XmlElement(name = "RelatedRecordId", nillable = true)
    protected String relatedRecordId;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "ViewCount", nillable = true)
    protected Integer viewCount;

    /**
     * Gets the value of the contentDistributionViews property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getContentDistributionViews() {
        return contentDistributionViews;
    }

    /**
     * Sets the value of the contentDistributionViews property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setContentDistributionViews(QueryResultType value) {
        this.contentDistributionViews = value;
    }

    /**
     * Gets the value of the contentDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentDocumentId() {
        return contentDocumentId;
    }

    /**
     * Sets the value of the contentDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentDocumentId(String value) {
        this.contentDocumentId = value;
    }

    /**
     * Gets the value of the contentVersion property.
     * 
     * @return
     *     possible object is
     *     {@link ContentVersion }
     *     
     */
    public ContentVersion getContentVersion() {
        return contentVersion;
    }

    /**
     * Sets the value of the contentVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentVersion }
     *     
     */
    public void setContentVersion(ContentVersion value) {
        this.contentVersion = value;
    }

    /**
     * Gets the value of the contentVersionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentVersionId() {
        return contentVersionId;
    }

    /**
     * Sets the value of the contentVersionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentVersionId(String value) {
        this.contentVersionId = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setCreatedBy(User value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the createdById property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedById() {
        return createdById;
    }

    /**
     * Sets the value of the createdById property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedById(String value) {
        this.createdById = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the distributionPublicUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributionPublicUrl() {
        return distributionPublicUrl;
    }

    /**
     * Sets the value of the distributionPublicUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributionPublicUrl(String value) {
        this.distributionPublicUrl = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the firstViewDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstViewDate() {
        return firstViewDate;
    }

    /**
     * Sets the value of the firstViewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstViewDate(XMLGregorianCalendar value) {
        this.firstViewDate = value;
    }

    /**
     * Gets the value of the isDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDeleted() {
        return isDeleted;
    }

    /**
     * Sets the value of the isDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
    }

    /**
     * Gets the value of the lastModifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * Sets the value of the lastModifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setLastModifiedBy(User value) {
        this.lastModifiedBy = value;
    }

    /**
     * Gets the value of the lastModifiedById property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifiedById() {
        return lastModifiedById;
    }

    /**
     * Sets the value of the lastModifiedById property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifiedById(String value) {
        this.lastModifiedById = value;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDate(XMLGregorianCalendar value) {
        this.lastModifiedDate = value;
    }

    /**
     * Gets the value of the lastViewDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastViewDate() {
        return lastViewDate;
    }

    /**
     * Sets the value of the lastViewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastViewDate(XMLGregorianCalendar value) {
        this.lastViewDate = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setOwner(User value) {
        this.owner = value;
    }

    /**
     * Gets the value of the ownerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * Sets the value of the ownerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerId(String value) {
        this.ownerId = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the preferencesAllowOriginalDownload property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferencesAllowOriginalDownload() {
        return preferencesAllowOriginalDownload;
    }

    /**
     * Sets the value of the preferencesAllowOriginalDownload property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferencesAllowOriginalDownload(Boolean value) {
        this.preferencesAllowOriginalDownload = value;
    }

    /**
     * Gets the value of the preferencesAllowPDFDownload property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferencesAllowPDFDownload() {
        return preferencesAllowPDFDownload;
    }

    /**
     * Sets the value of the preferencesAllowPDFDownload property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferencesAllowPDFDownload(Boolean value) {
        this.preferencesAllowPDFDownload = value;
    }

    /**
     * Gets the value of the preferencesAllowViewInBrowser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferencesAllowViewInBrowser() {
        return preferencesAllowViewInBrowser;
    }

    /**
     * Sets the value of the preferencesAllowViewInBrowser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferencesAllowViewInBrowser(Boolean value) {
        this.preferencesAllowViewInBrowser = value;
    }

    /**
     * Gets the value of the preferencesExpires property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferencesExpires() {
        return preferencesExpires;
    }

    /**
     * Sets the value of the preferencesExpires property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferencesExpires(Boolean value) {
        this.preferencesExpires = value;
    }

    /**
     * Gets the value of the preferencesLinkLatestVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferencesLinkLatestVersion() {
        return preferencesLinkLatestVersion;
    }

    /**
     * Sets the value of the preferencesLinkLatestVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferencesLinkLatestVersion(Boolean value) {
        this.preferencesLinkLatestVersion = value;
    }

    /**
     * Gets the value of the preferencesNotifyOnVisit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferencesNotifyOnVisit() {
        return preferencesNotifyOnVisit;
    }

    /**
     * Sets the value of the preferencesNotifyOnVisit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferencesNotifyOnVisit(Boolean value) {
        this.preferencesNotifyOnVisit = value;
    }

    /**
     * Gets the value of the preferencesNotifyRndtnComplete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferencesNotifyRndtnComplete() {
        return preferencesNotifyRndtnComplete;
    }

    /**
     * Sets the value of the preferencesNotifyRndtnComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferencesNotifyRndtnComplete(Boolean value) {
        this.preferencesNotifyRndtnComplete = value;
    }

    /**
     * Gets the value of the preferencesPasswordRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferencesPasswordRequired() {
        return preferencesPasswordRequired;
    }

    /**
     * Sets the value of the preferencesPasswordRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferencesPasswordRequired(Boolean value) {
        this.preferencesPasswordRequired = value;
    }

    /**
     * Gets the value of the relatedRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getRelatedRecord() {
        return relatedRecord;
    }

    /**
     * Sets the value of the relatedRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setRelatedRecord(Name value) {
        this.relatedRecord = value;
    }

    /**
     * Gets the value of the relatedRecordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedRecordId() {
        return relatedRecordId;
    }

    /**
     * Sets the value of the relatedRecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedRecordId(String value) {
        this.relatedRecordId = value;
    }

    /**
     * Gets the value of the systemModstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSystemModstamp() {
        return systemModstamp;
    }

    /**
     * Sets the value of the systemModstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSystemModstamp(XMLGregorianCalendar value) {
        this.systemModstamp = value;
    }

    /**
     * Gets the value of the viewCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getViewCount() {
        return viewCount;
    }

    /**
     * Sets the value of the viewCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setViewCount(Integer value) {
        this.viewCount = value;
    }

}
