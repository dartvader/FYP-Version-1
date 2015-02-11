
package com.sforce.soap.enterprise;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for soqlConjunction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="soqlConjunction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="and"/>
 *     &lt;enumeration value="or"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "soqlConjunction", namespace = "urn:enterprise.soap.sforce.com")
@XmlEnum
public enum SoqlConjunctionType {

    @XmlEnumValue("and")
    AND("and"),
    @XmlEnumValue("or")
    OR("or");
    private final String value;

    SoqlConjunctionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SoqlConjunctionType fromValue(String v) {
        for (SoqlConjunctionType c: SoqlConjunctionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
