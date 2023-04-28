package com.ird.portal.tcs.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.10
 * 2019-09-14T21:43:20.200+08:00
 * Generated source version: 3.2.10
 *
 */
@WebServiceClient(name = "TCSService",
                  wsdlLocation = "http://dsatoss/tcs/ws/TCSService?wsdl",
                  targetNamespace = "urn:dsat.gov.mo:tcs/ws")
public class TCSService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:dsat.gov.mo:tcs/ws", "TCSService");
    public final static QName Port1 = new QName("urn:dsat.gov.mo:tcs/ws", "port1");
    static {
        URL url = null;
        try {
            url = new URL("http://dsatoss/tcs/ws/TCSService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(TCSService_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://dsatoss/tcs/ws/TCSService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public TCSService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TCSService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TCSService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public TCSService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public TCSService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public TCSService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns TCSService
     */
    @WebEndpoint(name = "port1")
    public TCSService getPort1() {
        return super.getPort(Port1, TCSService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TCSService
     */
    @WebEndpoint(name = "port1")
    public TCSService getPort1(WebServiceFeature... features) {
        return super.getPort(Port1, TCSService.class, features);
    }

}