
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CustomObjectUserLicenseMetrics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomObjectUserLicenseMetrics">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="CustomObjectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomObjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CustomObjectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MetricsDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ObjectCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UserLicense" type="{urn:sobject.enterprise.soap.sforce.com}UserLicense" minOccurs="0"/>
 *         &lt;element name="UserLicenseId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomObjectUserLicenseMetrics", propOrder = {
    "customObjectId",
    "customObjectName",
    "customObjectType",
    "metricsDate",
    "objectCount",
    "systemModstamp",
    "userLicense",
    "userLicenseId"
})
public class CustomObjectUserLicenseMetrics
    extends SObject
{

    @XmlElement(name = "CustomObjectId", nillable = true)
    protected String customObjectId;
    @XmlElement(name = "CustomObjectName", nillable = true)
    protected String customObjectName;
    @XmlElement(name = "CustomObjectType", nillable = true)
    protected String customObjectType;
    @XmlElement(name = "MetricsDate", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar metricsDate;
    @XmlElement(name = "ObjectCount", nillable = true)
    protected Integer objectCount;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "UserLicense", nillable = true)
    protected UserLicense userLicense;
    @XmlElement(name = "UserLicenseId", nillable = true)
    protected String userLicenseId;

    /**
     * Gets the value of the customObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomObjectId() {
        return customObjectId;
    }

    /**
     * Sets the value of the customObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomObjectId(String value) {
        this.customObjectId = value;
    }

    /**
     * Gets the value of the customObjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomObjectName() {
        return customObjectName;
    }

    /**
     * Sets the value of the customObjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomObjectName(String value) {
        this.customObjectName = value;
    }

    /**
     * Gets the value of the customObjectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomObjectType() {
        return customObjectType;
    }

    /**
     * Sets the value of the customObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomObjectType(String value) {
        this.customObjectType = value;
    }

    /**
     * Gets the value of the metricsDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMetricsDate() {
        return metricsDate;
    }

    /**
     * Sets the value of the metricsDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMetricsDate(XMLGregorianCalendar value) {
        this.metricsDate = value;
    }

    /**
     * Gets the value of the objectCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObjectCount() {
        return objectCount;
    }

    /**
     * Sets the value of the objectCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjectCount(Integer value) {
        this.objectCount = value;
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
     * Gets the value of the userLicense property.
     * 
     * @return
     *     possible object is
     *     {@link UserLicense }
     *     
     */
    public UserLicense getUserLicense() {
        return userLicense;
    }

    /**
     * Sets the value of the userLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserLicense }
     *     
     */
    public void setUserLicense(UserLicense value) {
        this.userLicense = value;
    }

    /**
     * Gets the value of the userLicenseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserLicenseId() {
        return userLicenseId;
    }

    /**
     * Sets the value of the userLicenseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserLicenseId(String value) {
        this.userLicenseId = value;
    }

}
