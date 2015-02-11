
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CaseTeamMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseTeamMember">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Member" type="{urn:sobject.enterprise.soap.sforce.com}Name" minOccurs="0"/>
 *         &lt;element name="MemberId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Parent" type="{urn:sobject.enterprise.soap.sforce.com}Case" minOccurs="0"/>
 *         &lt;element name="ParentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TeamRole" type="{urn:sobject.enterprise.soap.sforce.com}CaseTeamRole" minOccurs="0"/>
 *         &lt;element name="TeamRoleId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="TeamTemplateMember" type="{urn:sobject.enterprise.soap.sforce.com}CaseTeamTemplateMember" minOccurs="0"/>
 *         &lt;element name="TeamTemplateMemberId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseTeamMember", propOrder = {
    "createdBy",
    "createdById",
    "createdDate",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "member",
    "memberId",
    "parent",
    "parentId",
    "systemModstamp",
    "teamRole",
    "teamRoleId",
    "teamTemplateMember",
    "teamTemplateMemberId"
})
public class CaseTeamMember
    extends SObject
{

    @XmlElement(name = "CreatedBy", nillable = true)
    protected User createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected User lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "Member", nillable = true)
    protected Name member;
    @XmlElement(name = "MemberId", nillable = true)
    protected String memberId;
    @XmlElement(name = "Parent", nillable = true)
    protected Case parent;
    @XmlElement(name = "ParentId", nillable = true)
    protected String parentId;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "TeamRole", nillable = true)
    protected CaseTeamRole teamRole;
    @XmlElement(name = "TeamRoleId", nillable = true)
    protected String teamRoleId;
    @XmlElement(name = "TeamTemplateMember", nillable = true)
    protected CaseTeamTemplateMember teamTemplateMember;
    @XmlElement(name = "TeamTemplateMemberId", nillable = true)
    protected String teamTemplateMemberId;

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
     * Gets the value of the member property.
     * 
     * @return
     *     possible object is
     *     {@link Name }
     *     
     */
    public Name getMember() {
        return member;
    }

    /**
     * Sets the value of the member property.
     * 
     * @param value
     *     allowed object is
     *     {@link Name }
     *     
     */
    public void setMember(Name value) {
        this.member = value;
    }

    /**
     * Gets the value of the memberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * Sets the value of the memberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberId(String value) {
        this.memberId = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link Case }
     *     
     */
    public Case getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case }
     *     
     */
    public void setParent(Case value) {
        this.parent = value;
    }

    /**
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentId(String value) {
        this.parentId = value;
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
     * Gets the value of the teamRole property.
     * 
     * @return
     *     possible object is
     *     {@link CaseTeamRole }
     *     
     */
    public CaseTeamRole getTeamRole() {
        return teamRole;
    }

    /**
     * Sets the value of the teamRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseTeamRole }
     *     
     */
    public void setTeamRole(CaseTeamRole value) {
        this.teamRole = value;
    }

    /**
     * Gets the value of the teamRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamRoleId() {
        return teamRoleId;
    }

    /**
     * Sets the value of the teamRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamRoleId(String value) {
        this.teamRoleId = value;
    }

    /**
     * Gets the value of the teamTemplateMember property.
     * 
     * @return
     *     possible object is
     *     {@link CaseTeamTemplateMember }
     *     
     */
    public CaseTeamTemplateMember getTeamTemplateMember() {
        return teamTemplateMember;
    }

    /**
     * Sets the value of the teamTemplateMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseTeamTemplateMember }
     *     
     */
    public void setTeamTemplateMember(CaseTeamTemplateMember value) {
        this.teamTemplateMember = value;
    }

    /**
     * Gets the value of the teamTemplateMemberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamTemplateMemberId() {
        return teamTemplateMemberId;
    }

    /**
     * Sets the value of the teamTemplateMemberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamTemplateMemberId(String value) {
        this.teamTemplateMemberId = value;
    }

}
