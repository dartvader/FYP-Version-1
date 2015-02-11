
package com.sforce.soap.enterprise;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "InvalidNewPasswordFault", targetNamespace = "urn:fault.enterprise.soap.sforce.com")
public class InvalidNewPasswordFault_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private InvalidNewPasswordFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public InvalidNewPasswordFault_Exception(String message, InvalidNewPasswordFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public InvalidNewPasswordFault_Exception(String message, InvalidNewPasswordFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.sforce.soap.enterprise.InvalidNewPasswordFault
     */
    public InvalidNewPasswordFault getFaultInfo() {
        return faultInfo;
    }

}
