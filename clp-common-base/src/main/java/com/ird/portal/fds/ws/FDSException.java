
package com.ird.portal.fds.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.16
 * 2021-03-16T17:10:52.620+08:00
 * Generated source version: 3.0.16
 */

@WebFault(name = "fault", targetNamespace = "urn:dsat.gov.mo:fds/ws")
public class FDSException extends Exception {
    
    private Fault fault;

    public FDSException() {
        super();
    }
    
    public FDSException(String message) {
        super(message);
    }
    
    public FDSException(String message, Throwable cause) {
        super(message, cause);
    }

    public FDSException(String message, Fault fault) {
        super(message);
        this.fault = fault;
    }

    public FDSException(String message, Fault fault, Throwable cause) {
        super(message, cause);
        this.fault = fault;
    }

    public Fault getFaultInfo() {
        return this.fault;
    }
}
