
package com.sforce.soap.enterprise;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "InvalidIdFault", targetNamespace = "urn:fault.enterprise.soap.sforce.com")
public class InvalidIdFault_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InvalidIdFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public InvalidIdFault_Exception(String message, InvalidIdFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public InvalidIdFault_Exception(String message, InvalidIdFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.sforce.soap.enterprise.InvalidIdFault
     */
    public InvalidIdFault getFaultInfo() {
        return faultInfo;
    }

}
