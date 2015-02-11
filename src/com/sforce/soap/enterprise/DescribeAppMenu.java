
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appMenuType" type="{urn:enterprise.soap.sforce.com}AppMenuType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "appMenuType"
})
@XmlRootElement(name = "describeAppMenu", namespace = "urn:enterprise.soap.sforce.com")
public class DescribeAppMenu {

    @XmlElement(namespace = "urn:enterprise.soap.sforce.com", required = true)
    @XmlSchemaType(name = "string")
    protected AppMenuTypeType appMenuType;

    /**
     * Gets the value of the appMenuType property.
     * 
     * @return
     *     possible object is
     *     {@link AppMenuTypeType }
     *     
     */
    public AppMenuTypeType getAppMenuType() {
        return appMenuType;
    }

    /**
     * Sets the value of the appMenuType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppMenuTypeType }
     *     
     */
    public void setAppMenuType(AppMenuTypeType value) {
        this.appMenuType = value;
    }

}
