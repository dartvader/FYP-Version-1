
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ContentWorkspaceDoc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentWorkspaceDoc">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="ContentDocument" type="{urn:sobject.enterprise.soap.sforce.com}ContentDocument" minOccurs="0"/>
 *         &lt;element name="ContentDocumentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ContentWorkspace" type="{urn:sobject.enterprise.soap.sforce.com}ContentWorkspace" minOccurs="0"/>
 *         &lt;element name="ContentWorkspaceId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsOwner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "ContentWorkspaceDoc", propOrder = {
    "contentDocument",
    "contentDocumentId",
    "contentWorkspace",
    "contentWorkspaceId",
    "createdDate",
    "isDeleted",
    "isOwner",
    "systemModstamp"
})
public class ContentWorkspaceDoc
    extends SObject
{

    @XmlElement(name = "ContentDocument", nillable = true)
    protected ContentDocument contentDocument;
    @XmlElement(name = "ContentDocumentId", nillable = true)
    protected String contentDocumentId;
    @XmlElement(name = "ContentWorkspace", nillable = true)
    protected ContentWorkspace contentWorkspace;
    @XmlElement(name = "ContentWorkspaceId", nillable = true)
    protected String contentWorkspaceId;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "IsOwner", nillable = true)
    protected Boolean isOwner;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;

    /**
     * Gets the value of the contentDocument property.
     * 
     * @return
     *     possible object is
     *     {@link ContentDocument }
     *     
     */
    public ContentDocument getContentDocument() {
        return contentDocument;
    }

    /**
     * Sets the value of the contentDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentDocument }
     *     
     */
    public void setContentDocument(ContentDocument value) {
        this.contentDocument = value;
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
     * Gets the value of the contentWorkspace property.
     * 
     * @return
     *     possible object is
     *     {@link ContentWorkspace }
     *     
     */
    public ContentWorkspace getContentWorkspace() {
        return contentWorkspace;
    }

    /**
     * Sets the value of the contentWorkspace property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentWorkspace }
     *     
     */
    public void setContentWorkspace(ContentWorkspace value) {
        this.contentWorkspace = value;
    }

    /**
     * Gets the value of the contentWorkspaceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentWorkspaceId() {
        return contentWorkspaceId;
    }

    /**
     * Sets the value of the contentWorkspaceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentWorkspaceId(String value) {
        this.contentWorkspaceId = value;
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
     * Gets the value of the isOwner property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOwner() {
        return isOwner;
    }

    /**
     * Sets the value of the isOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOwner(Boolean value) {
        this.isOwner = value;
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
