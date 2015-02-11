
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AuthProvider complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthProvider">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="AuthorizeUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsumerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsumerSecret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DefaultScopes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeveloperName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExecutionUserId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="FriendlyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IconUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdTokenIssuer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptionsIncludeOrgIdInId" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OptionsSendAccessTokenInHeader" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OptionsSendClientCredentialsInHeader" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProviderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistrationHandlerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="TokenUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserInfoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthProvider", propOrder = {
    "authorizeUrl",
    "consumerKey",
    "consumerSecret",
    "createdDate",
    "defaultScopes",
    "developerName",
    "errorUrl",
    "executionUserId",
    "friendlyName",
    "iconUrl",
    "idTokenIssuer",
    "optionsIncludeOrgIdInId",
    "optionsSendAccessTokenInHeader",
    "optionsSendClientCredentialsInHeader",
    "providerType",
    "registrationHandlerId",
    "tokenUrl",
    "userInfoUrl"
})
public class AuthProvider
    extends SObject
{

    @XmlElement(name = "AuthorizeUrl", nillable = true)
    protected String authorizeUrl;
    @XmlElement(name = "ConsumerKey", nillable = true)
    protected String consumerKey;
    @XmlElement(name = "ConsumerSecret", nillable = true)
    protected String consumerSecret;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "DefaultScopes", nillable = true)
    protected String defaultScopes;
    @XmlElement(name = "DeveloperName", nillable = true)
    protected String developerName;
    @XmlElement(name = "ErrorUrl", nillable = true)
    protected String errorUrl;
    @XmlElement(name = "ExecutionUserId", nillable = true)
    protected String executionUserId;
    @XmlElement(name = "FriendlyName", nillable = true)
    protected String friendlyName;
    @XmlElement(name = "IconUrl", nillable = true)
    protected String iconUrl;
    @XmlElement(name = "IdTokenIssuer", nillable = true)
    protected String idTokenIssuer;
    @XmlElement(name = "OptionsIncludeOrgIdInId", nillable = true)
    protected Boolean optionsIncludeOrgIdInId;
    @XmlElement(name = "OptionsSendAccessTokenInHeader", nillable = true)
    protected Boolean optionsSendAccessTokenInHeader;
    @XmlElement(name = "OptionsSendClientCredentialsInHeader", nillable = true)
    protected Boolean optionsSendClientCredentialsInHeader;
    @XmlElement(name = "ProviderType", nillable = true)
    protected String providerType;
    @XmlElement(name = "RegistrationHandlerId", nillable = true)
    protected String registrationHandlerId;
    @XmlElement(name = "TokenUrl", nillable = true)
    protected String tokenUrl;
    @XmlElement(name = "UserInfoUrl", nillable = true)
    protected String userInfoUrl;

    /**
     * Gets the value of the authorizeUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizeUrl() {
        return authorizeUrl;
    }

    /**
     * Sets the value of the authorizeUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizeUrl(String value) {
        this.authorizeUrl = value;
    }

    /**
     * Gets the value of the consumerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerKey() {
        return consumerKey;
    }

    /**
     * Sets the value of the consumerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerKey(String value) {
        this.consumerKey = value;
    }

    /**
     * Gets the value of the consumerSecret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumerSecret() {
        return consumerSecret;
    }

    /**
     * Sets the value of the consumerSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumerSecret(String value) {
        this.consumerSecret = value;
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
     * Gets the value of the defaultScopes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultScopes() {
        return defaultScopes;
    }

    /**
     * Sets the value of the defaultScopes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultScopes(String value) {
        this.defaultScopes = value;
    }

    /**
     * Gets the value of the developerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeveloperName() {
        return developerName;
    }

    /**
     * Sets the value of the developerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeveloperName(String value) {
        this.developerName = value;
    }

    /**
     * Gets the value of the errorUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorUrl() {
        return errorUrl;
    }

    /**
     * Sets the value of the errorUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorUrl(String value) {
        this.errorUrl = value;
    }

    /**
     * Gets the value of the executionUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutionUserId() {
        return executionUserId;
    }

    /**
     * Sets the value of the executionUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutionUserId(String value) {
        this.executionUserId = value;
    }

    /**
     * Gets the value of the friendlyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFriendlyName() {
        return friendlyName;
    }

    /**
     * Sets the value of the friendlyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFriendlyName(String value) {
        this.friendlyName = value;
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
     * Gets the value of the idTokenIssuer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTokenIssuer() {
        return idTokenIssuer;
    }

    /**
     * Sets the value of the idTokenIssuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTokenIssuer(String value) {
        this.idTokenIssuer = value;
    }

    /**
     * Gets the value of the optionsIncludeOrgIdInId property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptionsIncludeOrgIdInId() {
        return optionsIncludeOrgIdInId;
    }

    /**
     * Sets the value of the optionsIncludeOrgIdInId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptionsIncludeOrgIdInId(Boolean value) {
        this.optionsIncludeOrgIdInId = value;
    }

    /**
     * Gets the value of the optionsSendAccessTokenInHeader property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptionsSendAccessTokenInHeader() {
        return optionsSendAccessTokenInHeader;
    }

    /**
     * Sets the value of the optionsSendAccessTokenInHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptionsSendAccessTokenInHeader(Boolean value) {
        this.optionsSendAccessTokenInHeader = value;
    }

    /**
     * Gets the value of the optionsSendClientCredentialsInHeader property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptionsSendClientCredentialsInHeader() {
        return optionsSendClientCredentialsInHeader;
    }

    /**
     * Sets the value of the optionsSendClientCredentialsInHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptionsSendClientCredentialsInHeader(Boolean value) {
        this.optionsSendClientCredentialsInHeader = value;
    }

    /**
     * Gets the value of the providerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderType() {
        return providerType;
    }

    /**
     * Sets the value of the providerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderType(String value) {
        this.providerType = value;
    }

    /**
     * Gets the value of the registrationHandlerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationHandlerId() {
        return registrationHandlerId;
    }

    /**
     * Sets the value of the registrationHandlerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationHandlerId(String value) {
        this.registrationHandlerId = value;
    }

    /**
     * Gets the value of the tokenUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenUrl() {
        return tokenUrl;
    }

    /**
     * Sets the value of the tokenUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenUrl(String value) {
        this.tokenUrl = value;
    }

    /**
     * Gets the value of the userInfoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserInfoUrl() {
        return userInfoUrl;
    }

    /**
     * Sets the value of the userInfoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserInfoUrl(String value) {
        this.userInfoUrl = value;
    }

}
