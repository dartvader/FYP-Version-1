
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ApexTestResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApexTestResult">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="ApexClass" type="{urn:sobject.enterprise.soap.sforce.com}ApexClass" minOccurs="0"/>
 *         &lt;element name="ApexClassId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ApexLog" type="{urn:sobject.enterprise.soap.sforce.com}ApexLog" minOccurs="0"/>
 *         &lt;element name="ApexLogId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="AsyncApexJob" type="{urn:sobject.enterprise.soap.sforce.com}AsyncApexJob" minOccurs="0"/>
 *         &lt;element name="AsyncApexJobId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MethodName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Outcome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QueueItem" type="{urn:sobject.enterprise.soap.sforce.com}ApexTestQueueItem" minOccurs="0"/>
 *         &lt;element name="QueueItemId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="StackTrace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TestTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApexTestResult", propOrder = {
    "apexClass",
    "apexClassId",
    "apexLog",
    "apexLogId",
    "asyncApexJob",
    "asyncApexJobId",
    "message",
    "methodName",
    "outcome",
    "queueItem",
    "queueItemId",
    "stackTrace",
    "systemModstamp",
    "testTimestamp"
})
public class ApexTestResult
    extends SObject
{

    @XmlElement(name = "ApexClass", nillable = true)
    protected ApexClass apexClass;
    @XmlElement(name = "ApexClassId", nillable = true)
    protected String apexClassId;
    @XmlElement(name = "ApexLog", nillable = true)
    protected ApexLog apexLog;
    @XmlElement(name = "ApexLogId", nillable = true)
    protected String apexLogId;
    @XmlElement(name = "AsyncApexJob", nillable = true)
    protected AsyncApexJob asyncApexJob;
    @XmlElement(name = "AsyncApexJobId", nillable = true)
    protected String asyncApexJobId;
    @XmlElement(name = "Message", nillable = true)
    protected String message;
    @XmlElement(name = "MethodName", nillable = true)
    protected String methodName;
    @XmlElement(name = "Outcome", nillable = true)
    protected String outcome;
    @XmlElement(name = "QueueItem", nillable = true)
    protected ApexTestQueueItem queueItem;
    @XmlElement(name = "QueueItemId", nillable = true)
    protected String queueItemId;
    @XmlElement(name = "StackTrace", nillable = true)
    protected String stackTrace;
    @XmlElement(name = "SystemModstamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar systemModstamp;
    @XmlElement(name = "TestTimestamp", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar testTimestamp;

    /**
     * Gets the value of the apexClass property.
     * 
     * @return
     *     possible object is
     *     {@link ApexClass }
     *     
     */
    public ApexClass getApexClass() {
        return apexClass;
    }

    /**
     * Sets the value of the apexClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApexClass }
     *     
     */
    public void setApexClass(ApexClass value) {
        this.apexClass = value;
    }

    /**
     * Gets the value of the apexClassId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApexClassId() {
        return apexClassId;
    }

    /**
     * Sets the value of the apexClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApexClassId(String value) {
        this.apexClassId = value;
    }

    /**
     * Gets the value of the apexLog property.
     * 
     * @return
     *     possible object is
     *     {@link ApexLog }
     *     
     */
    public ApexLog getApexLog() {
        return apexLog;
    }

    /**
     * Sets the value of the apexLog property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApexLog }
     *     
     */
    public void setApexLog(ApexLog value) {
        this.apexLog = value;
    }

    /**
     * Gets the value of the apexLogId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApexLogId() {
        return apexLogId;
    }

    /**
     * Sets the value of the apexLogId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApexLogId(String value) {
        this.apexLogId = value;
    }

    /**
     * Gets the value of the asyncApexJob property.
     * 
     * @return
     *     possible object is
     *     {@link AsyncApexJob }
     *     
     */
    public AsyncApexJob getAsyncApexJob() {
        return asyncApexJob;
    }

    /**
     * Sets the value of the asyncApexJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsyncApexJob }
     *     
     */
    public void setAsyncApexJob(AsyncApexJob value) {
        this.asyncApexJob = value;
    }

    /**
     * Gets the value of the asyncApexJobId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsyncApexJobId() {
        return asyncApexJobId;
    }

    /**
     * Sets the value of the asyncApexJobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsyncApexJobId(String value) {
        this.asyncApexJobId = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the methodName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * Sets the value of the methodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodName(String value) {
        this.methodName = value;
    }

    /**
     * Gets the value of the outcome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutcome() {
        return outcome;
    }

    /**
     * Sets the value of the outcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutcome(String value) {
        this.outcome = value;
    }

    /**
     * Gets the value of the queueItem property.
     * 
     * @return
     *     possible object is
     *     {@link ApexTestQueueItem }
     *     
     */
    public ApexTestQueueItem getQueueItem() {
        return queueItem;
    }

    /**
     * Sets the value of the queueItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApexTestQueueItem }
     *     
     */
    public void setQueueItem(ApexTestQueueItem value) {
        this.queueItem = value;
    }

    /**
     * Gets the value of the queueItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueItemId() {
        return queueItemId;
    }

    /**
     * Sets the value of the queueItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueItemId(String value) {
        this.queueItemId = value;
    }

    /**
     * Gets the value of the stackTrace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStackTrace() {
        return stackTrace;
    }

    /**
     * Sets the value of the stackTrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStackTrace(String value) {
        this.stackTrace = value;
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
     * Gets the value of the testTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTestTimestamp() {
        return testTimestamp;
    }

    /**
     * Sets the value of the testTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTestTimestamp(XMLGregorianCalendar value) {
        this.testTimestamp = value;
    }

}
