package com.ird.portal.be.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.16
 * 2021-03-16T11:35:25.061+08:00
 * Generated source version: 3.0.16
 * 
 */
@WebServiceClient(name = "BEService", 
                  wsdlLocation = "file:/C:/software/ws/BEService.wsdl",
                  targetNamespace = "urn:dsat.gov.mo:be/ws") 
public class BEService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:dsat.gov.mo:be/ws", "BEService");
    public final static QName Port1 = new QName("urn:dsat.gov.mo:be/ws", "port1");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/software/ws/BEService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(BEService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/software/ws/BEService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public BEService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BEService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BEService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BEService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BEService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public BEService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns BEService
     */
    @WebEndpoint(name = "port1")
    public BEService getPort1() {
        return super.getPort(Port1, BEService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BEService
     */
    @WebEndpoint(name = "port1")
    public BEService getPort1(WebServiceFeature... features) {
        return super.getPort(Port1, BEService.class, features);
    }

}
