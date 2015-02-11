
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AppMenuItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppMenuItem">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="ApplicationId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CanvasAccessMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CanvasEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CanvasReferenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CanvasSelectedLocations" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CanvasUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IconUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InfoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsRegisteredDeviceOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsUsingAdminAuthorization" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LogoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobileAppBinaryId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobileAppInstallUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobileAppInstalledDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MobileAppInstalledVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobileAppVer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobileDeviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobileMinOsVer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobilePlatform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobileStartUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NamespacePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SortOrder" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StartUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppMenuItem", propOrder = {
    "applicationId",
    "canvasAccessMethod",
    "canvasEnabled",
    "canvasReferenceId",
    "canvasSelectedLocations",
    "canvasUrl",
    "createdBy",
    "createdById",
    "createdDate",
    "description",
    "iconUrl",
    "infoUrl",
    "isDeleted",
    "isRegisteredDeviceOnly",
    "isUsingAdminAuthorization",
    "label",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "logoUrl",
    "mobileAppBinaryId",
    "mobileAppInstallUrl",
    "mobileAppInstalledDate",
    "mobileAppInstalledVersion",
    "mobileAppVer",
    "mobileDeviceType",
    "mobileMinOsVer",
    "mobilePlatform",
    "mobileStartUrl",
    "name",
    "namespacePrefix",
    "sortOrder",
    "startUrl",
    "systemModstamp",
    "type"
})
public class AppMenuItem
    extends SObject
{

    @XmlElement(name = "ApplicationId", nillable = true)
    protected String applicationId;
    @XmlElement(name = "CanvasAccessMethod", nillable = true)
    protected String canvasAccessMethod;
    @XmlElement(name = "CanvasEnabled", nillable = true)
    protected Boolean canvasEnabled;
    @XmlElement(name = "CanvasReferenceId", nillable = true)
    protected String canvasReferenceId;
    @XmlElement(name = "CanvasSelectedLocations", nillable = true)
    protected String canvasSelectedLocations;
    @XmlElement(name = "CanvasUrl", nillable = true)
    protected String canvasUrl;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected User createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "Description", nillable = true)
    protected String description;
    @XmlElement(name = "IconUrl", nillable = true)
    protected String iconUrl;
    @XmlElement(name = "InfoUrl", nillable = true)
    protected String infoUrl;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "IsRegisteredDeviceOnly", nillable = true)
    protected Boolean isRegisteredDeviceOnly;
    @XmlElement(name = "IsUsingAdminAuthorization", nillable = true)
    protected Boolean isUsingAdminAuthorization;
    @XmlElement(name = "Label", nillable = true)
    protected String label;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected User lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "LogoUrl", nillable = true)
    protected String logoUrl;
    @XmlElement(name = "MobileAppBinaryId", nillable = true)
    protected String mobileAppBinaryId;
    @XmlElement(name = "MobileAppInstallUrl", nillable = true)
    protected String mobileAppInstallUrl;
    @XmlElement(name = "MobileAppInstalledDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mobileAppInstalledDate;
    @XmlElement(name = "MobileAppInstalledVersion", nillable = true)
    protected String mobileAppInstalledVersion;
    @XmlElement(name = "MobileAppVer", nillable = true)
    protected String mobileAppVer;
    @XmlElement(name = "MobileDeviceType", nillable = true)
    protected String mobileDeviceType;
    @XmlElement(name = "MobileMinOsVer", nillable = true)
    protected String mobileMinOsVer;
    @XmlElement(name = "MobilePlatform", nillable = true)
    protected String mobilePlatform;
    @XmlElement(name = "MobileStartUrl", nillable = true)
    protected String mobileStartUrl;
    @XmlElement(name = "Name", nillable = true)
    protected String name;
    @XmlElement(name = "NamespacePrefix", nillable = true)
    protected String namespacePrefix;
    @XmlElement(name = "SortOrder", nillable = true)
    protected Integer sortOrder;
    @XmlElement(name = "StartUrl", nillable = true)
    protected String startUrl;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "Type", nillable = true)
    protected String type;

    /**
     * Gets the value of the applicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationId(String value) {
        this.applicationId = value;
    }

    /**
     * Gets the value of the canvasAccessMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanvasAccessMethod() {
        return canvasAccessMethod;
    }

    /**
     * Sets the value of the canvasAccessMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanvasAccessMethod(String value) {
        this.canvasAccessMethod = value;
    }

    /**
     * Gets the value of the canvasEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanvasEnabled() {
        return canvasEnabled;
    }

    /**
     * Sets the value of the canvasEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanvasEnabled(Boolean value) {
        this.canvasEnabled = value;
    }

    /**
     * Gets the value of the canvasReferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanvasReferenceId() {
        return canvasReferenceId;
    }

    /**
     * Sets the value of the canvasReferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanvasReferenceId(String value) {
        this.canvasReferenceId = value;
    }

    /**
     * Gets the value of the canvasSelectedLocations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanvasSelectedLocations() {
        return canvasSelectedLocations;
    }

    /**
     * Sets the value of the canvasSelectedLocations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanvasSelectedLocations(String value) {
        this.canvasSelectedLocations = value;
    }

    /**
     * Gets the value of the canvasUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanvasUrl() {
        return canvasUrl;
    }

    /**
     * Sets the value of the canvasUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanvasUrl(String value) {
        this.canvasUrl = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the iconUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * Sets the value of the iconUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconUrl(String value) {
        this.iconUrl = value;
    }

    /**
     * Gets the value of the infoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoUrl() {
        return infoUrl;
    }

    /**
     * Sets the value of the infoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoUrl(String value) {
        this.infoUrl = value;
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
     * Gets the value of the isRegisteredDeviceOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRegisteredDeviceOnly() {
        return isRegisteredDeviceOnly;
    }

    /**
     * Sets the value of the isRegisteredDeviceOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRegisteredDeviceOnly(Boolean value) {
        this.isRegisteredDeviceOnly = value;
    }

    /**
     * Gets the value of the isUsingAdminAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsUsingAdminAuthorization() {
        return isUsingAdminAuthorization;
    }

    /**
     * Sets the value of the isUsingAdminAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsUsingAdminAuthorization(Boolean value) {
        this.isUsingAdminAuthorization = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
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
     * Gets the value of the logoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    /**
     * Sets the value of the logoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogoUrl(String value) {
        this.logoUrl = value;
    }

    /**
     * Gets the value of the mobileAppBinaryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileAppBinaryId() {
        return mobileAppBinaryId;
    }

    /**
     * Sets the value of the mobileAppBinaryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileAppBinaryId(String value) {
        this.mobileAppBinaryId = value;
    }

    /**
     * Gets the value of the mobileAppInstallUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileAppInstallUrl() {
        return mobileAppInstallUrl;
    }

    /**
     * Sets the value of the mobileAppInstallUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileAppInstallUrl(String value) {
        this.mobileAppInstallUrl = value;
    }

    /**
     * Gets the value of the mobileAppInstalledDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMobileAppInstalledDate() {
        return mobileAppInstalledDate;
    }

    /**
     * Sets the value of the mobileAppInstalledDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMobileAppInstalledDate(XMLGregorianCalendar value) {
        this.mobileAppInstalledDate = value;
    }

    /**
     * Gets the value of the mobileAppInstalledVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileAppInstalledVersion() {
        return mobileAppInstalledVersion;
    }

    /**
     * Sets the value of the mobileAppInstalledVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileAppInstalledVersion(String value) {
        this.mobileAppInstalledVersion = value;
    }

    /**
     * Gets the value of the mobileAppVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileAppVer() {
        return mobileAppVer;
    }

    /**
     * Sets the value of the mobileAppVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileAppVer(String value) {
        this.mobileAppVer = value;
    }

    /**
     * Gets the value of the mobileDeviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileDeviceType() {
        return mobileDeviceType;
    }

    /**
     * Sets the value of the mobileDeviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileDeviceType(String value) {
        this.mobileDeviceType = value;
    }

    /**
     * Gets the value of the mobileMinOsVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileMinOsVer() {
        return mobileMinOsVer;
    }

    /**
     * Sets the value of the mobileMinOsVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileMinOsVer(String value) {
        this.mobileMinOsVer = value;
    }

    /**
     * Gets the value of the mobilePlatform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePlatform() {
        return mobilePlatform;
    }

    /**
     * Sets the value of the mobilePlatform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePlatform(String value) {
        this.mobilePlatform = value;
    }

    /**
     * Gets the value of the mobileStartUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileStartUrl() {
        return mobileStartUrl;
    }

    /**
     * Sets the value of the mobileStartUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileStartUrl(String value) {
        this.mobileStartUrl = value;
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
     * Gets the value of the namespacePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespacePrefix() {
        return namespacePrefix;
    }

    /**
     * Sets the value of the namespacePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespacePrefix(String value) {
        this.namespacePrefix = value;
    }

    /**
     * Gets the value of the sortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * Sets the value of the sortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSortOrder(Integer value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the startUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartUrl() {
        return startUrl;
    }

    /**
     * Sets the value of the startUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartUrl(String value) {
        this.startUrl = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
