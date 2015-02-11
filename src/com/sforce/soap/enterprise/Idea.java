
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Idea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Idea">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Categories" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Community" type="{urn:sobject.enterprise.soap.sforce.com}Community" minOccurs="0"/>
 *         &lt;element name="CommunityId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreatorFullPhotoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatorSmallPhotoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsHtml" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsMerged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastComment" type="{urn:sobject.enterprise.soap.sforce.com}IdeaComment" minOccurs="0"/>
 *         &lt;element name="LastCommentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastCommentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastReferencedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastViewedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NumComments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ParentIdea" type="{urn:sobject.enterprise.soap.sforce.com}Idea" minOccurs="0"/>
 *         &lt;element name="ParentIdeaId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="RecordType" type="{urn:sobject.enterprise.soap.sforce.com}RecordType" minOccurs="0"/>
 *         &lt;element name="RecordTypeId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserRecordAccess" type="{urn:sobject.enterprise.soap.sforce.com}UserRecordAccess" minOccurs="0"/>
 *         &lt;element name="VoteScore" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="VoteTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Votes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Idea", propOrder = {
    "body",
    "categories",
    "comments",
    "community",
    "communityId",
    "createdBy",
    "createdById",
    "createdDate",
    "creatorFullPhotoUrl",
    "creatorName",
    "creatorSmallPhotoUrl",
    "isDeleted",
    "isHtml",
    "isMerged",
    "lastComment",
    "lastCommentDate",
    "lastCommentId",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "lastReferencedDate",
    "lastViewedDate",
    "numComments",
    "parentIdea",
    "parentIdeaId",
    "recordType",
    "recordTypeId",
    "status",
    "systemModstamp",
    "title",
    "userRecordAccess",
    "voteScore",
    "voteTotal",
    "votes"
})
public class Idea
    extends SObject
{

    @XmlElement(name = "Body", nillable = true)
    protected String body;
    @XmlElement(name = "Categories", nillable = true)
    protected String categories;
    @XmlElement(name = "Comments", nillable = true)
    protected QueryResultType comments;
    @XmlElement(name = "Community", nillable = true)
    protected Community community;
    @XmlElement(name = "CommunityId", nillable = true)
    protected String communityId;
    @XmlElement(name = "CreatedBy", nillable = true)
    protected User createdBy;
    @XmlElement(name = "CreatedById", nillable = true)
    protected String createdById;
    @XmlElement(name = "CreatedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "CreatorFullPhotoUrl", nillable = true)
    protected String creatorFullPhotoUrl;
    @XmlElement(name = "CreatorName", nillable = true)
    protected String creatorName;
    @XmlElement(name = "CreatorSmallPhotoUrl", nillable = true)
    protected String creatorSmallPhotoUrl;
    @XmlElement(name = "IsDeleted", nillable = true)
    protected Boolean isDeleted;
    @XmlElement(name = "IsHtml", nillable = true)
    protected Boolean isHtml;
    @XmlElement(name = "IsMerged", nillable = true)
    protected Boolean isMerged;
    @XmlElement(name = "LastComment", nillable = true)
    protected IdeaComment lastComment;
    @XmlElement(name = "LastCommentDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastCommentDate;
    @XmlElement(name = "LastCommentId", nillable = true)
    protected String lastCommentId;
    @XmlElement(name = "LastModifiedBy", nillable = true)
    protected User lastModifiedBy;
    @XmlElement(name = "LastModifiedById", nillable = true)
    protected String lastModifiedById;
    @XmlElement(name = "LastModifiedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    @XmlElement(name = "LastReferencedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastReferencedDate;
    @XmlElement(name = "LastViewedDate", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastViewedDate;
    @XmlElement(name = "NumComments", nillable = true)
    protected Integer numComments;
    @XmlElement(name = "ParentIdea", nillable = true)
    protected Idea parentIdea;
    @XmlElement(name = "ParentIdeaId", nillable = true)
    protected String parentIdeaId;
    @XmlElement(name = "RecordType", nillable = true)
    protected RecordType recordType;
    @XmlElement(name = "RecordTypeId", nillable = true)
    protected String recordTypeId;
    @XmlElement(name = "Status", nillable = true)
    protected String status;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "Title", nillable = true)
    protected String title;
    @XmlElement(name = "UserRecordAccess", nillable = true)
    protected UserRecordAccess userRecordAccess;
    @XmlElement(name = "VoteScore", nillable = true)
    protected Double voteScore;
    @XmlElement(name = "VoteTotal", nillable = true)
    protected Double voteTotal;
    @XmlElement(name = "Votes", nillable = true)
    protected QueryResultType votes;

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBody(String value) {
        this.body = value;
    }

    /**
     * Gets the value of the categories property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategories() {
        return categories;
    }

    /**
     * Sets the value of the categories property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategories(String value) {
        this.categories = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setComments(QueryResultType value) {
        this.comments = value;
    }

    /**
     * Gets the value of the community property.
     * 
     * @return
     *     possible object is
     *     {@link Community }
     *     
     */
    public Community getCommunity() {
        return community;
    }

    /**
     * Sets the value of the community property.
     * 
     * @param value
     *     allowed object is
     *     {@link Community }
     *     
     */
    public void setCommunity(Community value) {
        this.community = value;
    }

    /**
     * Gets the value of the communityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunityId() {
        return communityId;
    }

    /**
     * Sets the value of the communityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunityId(String value) {
        this.communityId = value;
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
     * Gets the value of the creatorFullPhotoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorFullPhotoUrl() {
        return creatorFullPhotoUrl;
    }

    /**
     * Sets the value of the creatorFullPhotoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorFullPhotoUrl(String value) {
        this.creatorFullPhotoUrl = value;
    }

    /**
     * Gets the value of the creatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * Sets the value of the creatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorName(String value) {
        this.creatorName = value;
    }

    /**
     * Gets the value of the creatorSmallPhotoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorSmallPhotoUrl() {
        return creatorSmallPhotoUrl;
    }

    /**
     * Sets the value of the creatorSmallPhotoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorSmallPhotoUrl(String value) {
        this.creatorSmallPhotoUrl = value;
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
     * Gets the value of the isHtml property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHtml() {
        return isHtml;
    }

    /**
     * Sets the value of the isHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHtml(Boolean value) {
        this.isHtml = value;
    }

    /**
     * Gets the value of the isMerged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMerged() {
        return isMerged;
    }

    /**
     * Sets the value of the isMerged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMerged(Boolean value) {
        this.isMerged = value;
    }

    /**
     * Gets the value of the lastComment property.
     * 
     * @return
     *     possible object is
     *     {@link IdeaComment }
     *     
     */
    public IdeaComment getLastComment() {
        return lastComment;
    }

    /**
     * Sets the value of the lastComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdeaComment }
     *     
     */
    public void setLastComment(IdeaComment value) {
        this.lastComment = value;
    }

    /**
     * Gets the value of the lastCommentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastCommentDate() {
        return lastCommentDate;
    }

    /**
     * Sets the value of the lastCommentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastCommentDate(XMLGregorianCalendar value) {
        this.lastCommentDate = value;
    }

    /**
     * Gets the value of the lastCommentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastCommentId() {
        return lastCommentId;
    }

    /**
     * Sets the value of the lastCommentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastCommentId(String value) {
        this.lastCommentId = value;
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
     * Gets the value of the lastReferencedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastReferencedDate() {
        return lastReferencedDate;
    }

    /**
     * Sets the value of the lastReferencedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastReferencedDate(XMLGregorianCalendar value) {
        this.lastReferencedDate = value;
    }

    /**
     * Gets the value of the lastViewedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastViewedDate() {
        return lastViewedDate;
    }

    /**
     * Sets the value of the lastViewedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastViewedDate(XMLGregorianCalendar value) {
        this.lastViewedDate = value;
    }

    /**
     * Gets the value of the numComments property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumComments() {
        return numComments;
    }

    /**
     * Sets the value of the numComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumComments(Integer value) {
        this.numComments = value;
    }

    /**
     * Gets the value of the parentIdea property.
     * 
     * @return
     *     possible object is
     *     {@link Idea }
     *     
     */
    public Idea getParentIdea() {
        return parentIdea;
    }

    /**
     * Sets the value of the parentIdea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Idea }
     *     
     */
    public void setParentIdea(Idea value) {
        this.parentIdea = value;
    }

    /**
     * Gets the value of the parentIdeaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentIdeaId() {
        return parentIdeaId;
    }

    /**
     * Sets the value of the parentIdeaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentIdeaId(String value) {
        this.parentIdeaId = value;
    }

    /**
     * Gets the value of the recordType property.
     * 
     * @return
     *     possible object is
     *     {@link RecordType }
     *     
     */
    public RecordType getRecordType() {
        return recordType;
    }

    /**
     * Sets the value of the recordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordType }
     *     
     */
    public void setRecordType(RecordType value) {
        this.recordType = value;
    }

    /**
     * Gets the value of the recordTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordTypeId() {
        return recordTypeId;
    }

    /**
     * Sets the value of the recordTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordTypeId(String value) {
        this.recordTypeId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the userRecordAccess property.
     * 
     * @return
     *     possible object is
     *     {@link UserRecordAccess }
     *     
     */
    public UserRecordAccess getUserRecordAccess() {
        return userRecordAccess;
    }

    /**
     * Sets the value of the userRecordAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserRecordAccess }
     *     
     */
    public void setUserRecordAccess(UserRecordAccess value) {
        this.userRecordAccess = value;
    }

    /**
     * Gets the value of the voteScore property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVoteScore() {
        return voteScore;
    }

    /**
     * Sets the value of the voteScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVoteScore(Double value) {
        this.voteScore = value;
    }

    /**
     * Gets the value of the voteTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVoteTotal() {
        return voteTotal;
    }

    /**
     * Sets the value of the voteTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVoteTotal(Double value) {
        this.voteTotal = value;
    }

    /**
     * Gets the value of the votes property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getVotes() {
        return votes;
    }

    /**
     * Sets the value of the votes property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setVotes(QueryResultType value) {
        this.votes = value;
    }

}
