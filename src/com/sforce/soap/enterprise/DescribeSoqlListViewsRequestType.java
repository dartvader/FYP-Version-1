
package com.sforce.soap.enterprise;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DescribeSoqlListViewsRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeSoqlListViewsRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listViewParams" type="{urn:enterprise.soap.sforce.com}DescribeSoqlListViewParams" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeSoqlListViewsRequest", namespace = "urn:enterprise.soap.sforce.com", propOrder = {
    "listViewParams"
})
public class DescribeSoqlListViewsRequestType {

    @XmlElement(required = true)
    protected List<DescribeSoqlListViewParamsType> listViewParams;

    /**
     * Gets the value of the listViewParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listViewParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListViewParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescribeSoqlListViewParamsType }
     * 
     * 
     */
    public List<DescribeSoqlListViewParamsType> getListViewParams() {
        if (listViewParams == null) {
            listViewParams = new ArrayList<DescribeSoqlListViewParamsType>();
        }
        return this.listViewParams;
    }

}
