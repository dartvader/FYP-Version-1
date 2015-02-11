
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThirdPartyAccountLink complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThirdPartyAccountLink">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Handle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsNotSsoUsable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Provider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RemoteIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SsoProvider" type="{urn:sobject.enterprise.soap.sforce.com}AuthProvider" minOccurs="0"/>
 *         &lt;element name="SsoProviderId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="SsoProviderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThirdPartyAccountLinkKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "ThirdPartyAccountLink", propOrder = {
    "handle",
    "isNotSsoUsable",
    "provider",
    "remoteIdentifier",
    "ssoProvider",
    "ssoProviderId",
    "ssoProviderName",
    "thirdPartyAccountLinkKey",
    "user",
    "userId"
})
public class ThirdPartyAccountLink
    extends SObject
{

    @XmlElement(name = "Handle", nillable = true)
    protected String handle;
    @XmlElement(name = "IsNotSsoUsable", nillable = true)
    protected Boolean isNotSsoUsable;
    @XmlElement(name = "Provider", nillable = true)
    protected String provider;
    @XmlElement(name = "RemoteIdentifier", nillable = true)
    protected String remoteIdentifier;
    @XmlElement(name = "SsoProvider", nillable = true)
    protected AuthProvider ssoProvider;
    @XmlElement(name = "SsoProviderId", nillable = true)
    protected String ssoProviderId;
    @XmlElement(name = "SsoProviderName", nillable = true)
    protected String ssoProviderName;
    @XmlElement(name = "ThirdPartyAccountLinkKey", nillable = true)
    protected String thirdPartyAccountLinkKey;
    @XmlElement(name = "User", nillable = true)
    protected User user;
    @XmlElement(name = "UserId", nillable = true)
    protected String userId;

    /**
     * Gets the value of the handle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandle() {
        return handle;
    }

    /**
     * Sets the value of the handle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandle(String value) {
        this.handle = value;
    }

    /**
     * Gets the value of the isNotSsoUsable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsNotSsoUsable() {
        return isNotSsoUsable;
    }

    /**
     * Sets the value of the isNotSsoUsable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNotSsoUsable(Boolean value) {
        this.isNotSsoUsable = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvider(String value) {
        this.provider = value;
    }

    /**
     * Gets the value of the remoteIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteIdentifier() {
        return remoteIdentifier;
    }

    /**
     * Sets the value of the remoteIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteIdentifier(String value) {
        this.remoteIdentifier = value;
    }

    /**
     * Gets the value of the ssoProvider property.
     * 
     * @return
     *     possible object is
     *     {@link AuthProvider }
     *     
     */
    public AuthProvider getSsoProvider() {
        return ssoProvider;
    }

    /**
     * Sets the value of the ssoProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthProvider }
     *     
     */
    public void setSsoProvider(AuthProvider value) {
        this.ssoProvider = value;
    }

    /**
     * Gets the value of the ssoProviderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsoProviderId() {
        return ssoProviderId;
    }

    /**
     * Sets the value of the ssoProviderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsoProviderId(String value) {
        this.ssoProviderId = value;
    }

    /**
     * Gets the value of the ssoProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsoProviderName() {
        return ssoProviderName;
    }

    /**
     * Sets the value of the ssoProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsoProviderName(String value) {
        this.ssoProviderName = value;
    }

    /**
     * Gets the value of the thirdPartyAccountLinkKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyAccountLinkKey() {
        return thirdPartyAccountLinkKey;
    }

    /**
     * Sets the value of the thirdPartyAccountLinkKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyAccountLinkKey(String value) {
        this.thirdPartyAccountLinkKey = value;
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
