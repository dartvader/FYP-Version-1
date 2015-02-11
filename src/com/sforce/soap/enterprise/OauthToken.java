
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OauthToken complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OauthToken">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="AccessToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AppMenuItem" type="{urn:sobject.enterprise.soap.sforce.com}AppMenuItem" minOccurs="0"/>
 *         &lt;element name="AppMenuItemId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="AppName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DeleteToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUsedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UseCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="User" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
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
@XmlType(name = "OauthToken", propOrder = {
    "accessToken",
    "appMenuItem",
    "appMenuItemId",
    "appName",
    "createdDate",
    "deleteToken",
    "lastUsedDate",
    "requestToken",
    "useCount",
    "user",
    "userId"
})
public class OauthToken
    extends SObject
{

    @XmlElement(name = "AccessToken", nillable = true)
    protected String accessToken;
    @XmlElement(name = "AppMenuItem", nillable = true)
    protected AppMenuItem appMenuItem;
    @XmlElement(name = "AppMenuItemId", nillable = true)
    protected String appMenuItemId;
    @XmlElement(name = "AppName", nillable = true)
    protected String appName;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "DeleteToken", nillable = true)
    protected String deleteToken;
    @XmlElement(name = "LastUsedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUsedDate;
    @XmlElement(name = "RequestToken", nillable = true)
    protected String requestToken;
    @XmlElement(name = "UseCount", nillable = true)
    protected Integer useCount;
    @XmlElement(name = "User", nillable = true)
    protected User user;
    @XmlElement(name = "UserId", nillable = true)
    protected String userId;

    /**
     * Gets the value of the accessToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Sets the value of the accessToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessToken(String value) {
        this.accessToken = value;
    }

    /**
     * Gets the value of the appMenuItem property.
     * 
     * @return
     *     possible object is
     *     {@link AppMenuItem }
     *     
     */
    public AppMenuItem getAppMenuItem() {
        return appMenuItem;
    }

    /**
     * Sets the value of the appMenuItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppMenuItem }
     *     
     */
    public void setAppMenuItem(AppMenuItem value) {
        this.appMenuItem = value;
    }

    /**
     * Gets the value of the appMenuItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppMenuItemId() {
        return appMenuItemId;
    }

    /**
     * Sets the value of the appMenuItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppMenuItemId(String value) {
        this.appMenuItemId = value;
    }

    /**
     * Gets the value of the appName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppName() {
        return appName;
    }

    /**
     * Sets the value of the appName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppName(String value) {
        this.appName = value;
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
     * Gets the value of the deleteToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeleteToken() {
        return deleteToken;
    }

    /**
     * Sets the value of the deleteToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeleteToken(String value) {
        this.deleteToken = value;
    }

    /**
     * Gets the value of the lastUsedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUsedDate() {
        return lastUsedDate;
    }

    /**
     * Sets the value of the lastUsedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUsedDate(XMLGregorianCalendar value) {
        this.lastUsedDate = value;
    }

    /**
     * Gets the value of the requestToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestToken() {
        return requestToken;
    }

    /**
     * Sets the value of the requestToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestToken(String value) {
        this.requestToken = value;
    }

    /**
     * Gets the value of the useCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUseCount() {
        return useCount;
    }

    /**
     * Sets the value of the useCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUseCount(Integer value) {
        this.useCount = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
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
