
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MalformedQueryFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MalformedQueryFault">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:fault.enterprise.soap.sforce.com}ApiQueryFault">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MalformedQueryFault", namespace = "urn:fault.enterprise.soap.sforce.com")
public class MalformedQueryFault
    extends ApiQueryFault
{


}
