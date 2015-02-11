
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PermissionSetAssignment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PermissionSetAssignment">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Assignee" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="AssigneeId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="PermissionSet" type="{urn:sobject.enterprise.soap.sforce.com}PermissionSet" minOccurs="0"/>
 *         &lt;element name="PermissionSetId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PermissionSetAssignment", propOrder = {
    "assignee",
    "assigneeId",
    "permissionSet",
    "permissionSetId",
    "systemModstamp"
})
public class PermissionSetAssignment
    extends SObject
{

    @XmlElement(name = "Assignee", nillable = true)
    protected User assignee;
    @XmlElement(name = "AssigneeId", nillable = true)
    protected String assigneeId;
    @XmlElement(name = "PermissionSet", nillable = true)
    protected PermissionSet permissionSet;
    @XmlElement(name = "PermissionSetId", nillable = true)
    protected String permissionSetId;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;

    /**
     * Gets the value of the assignee property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getAssignee() {
        return assignee;
    }

    /**
     * Sets the value of the assignee property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setAssignee(User value) {
        this.assignee = value;
    }

    /**
     * Gets the value of the assigneeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssigneeId() {
        return assigneeId;
    }

    /**
     * Sets the value of the assigneeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssigneeId(String value) {
        this.assigneeId = value;
    }

    /**
     * Gets the value of the permissionSet property.
     * 
     * @return
     *     possible object is
     *     {@link PermissionSet }
     *     
     */
    public PermissionSet getPermissionSet() {
        return permissionSet;
    }

    /**
     * Sets the value of the permissionSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermissionSet }
     *     
     */
    public void setPermissionSet(PermissionSet value) {
        this.permissionSet = value;
    }

    /**
     * Gets the value of the permissionSetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermissionSetId() {
        return permissionSetId;
    }

    /**
     * Sets the value of the permissionSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermissionSetId(String value) {
        this.permissionSetId = value;
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

}
