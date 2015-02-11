
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DashboardComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DashboardComponent">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="CombinedAttachments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Dashboard" type="{urn:sobject.enterprise.soap.sforce.com}Dashboard" minOccurs="0"/>
 *         &lt;element name="DashboardId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DashboardComponent", propOrder = {
    "combinedAttachments",
    "dashboard",
    "dashboardId",
    "name"
})
public class DashboardComponent
    extends SObject
{

    @XmlElement(name = "CombinedAttachments", nillable = true)
    protected QueryResultType combinedAttachments;
    @XmlElement(name = "Dashboard", nillable = true)
    protected Dashboard dashboard;
    @XmlElement(name = "DashboardId", nillable = true)
    protected String dashboardId;
    @XmlElement(name = "Name", nillable = true)
    protected String name;

    /**
     * Gets the value of the combinedAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link QueryResultType }
     *     
     */
    public QueryResultType getCombinedAttachments() {
        return combinedAttachments;
    }

    /**
     * Sets the value of the combinedAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryResultType }
     *     
     */
    public void setCombinedAttachments(QueryResultType value) {
        this.combinedAttachments = value;
    }

    /**
     * Gets the value of the dashboard property.
     * 
     * @return
     *     possible object is
     *     {@link Dashboard }
     *     
     */
    public Dashboard getDashboard() {
        return dashboard;
    }

    /**
     * Sets the value of the dashboard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dashboard }
     *     
     */
    public void setDashboard(Dashboard value) {
        this.dashboard = value;
    }

    /**
     * Gets the value of the dashboardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDashboardId() {
        return dashboardId;
    }

    /**
     * Sets the value of the dashboardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDashboardId(String value) {
        this.dashboardId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
