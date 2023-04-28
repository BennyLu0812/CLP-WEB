package com.ird.portal.client;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 3.0.16
 * 2018-09-30T14:27:34.783+08:00
 * Generated source version: 3.0.16
 * 
 */
@WebServiceClient(name = "SMSWebService", 
                  wsdlLocation = "http://doisrvdev/sms_dev/SMSWebService.asmx?WSDL",
                  targetNamespace = "http://dsat/SMSwebservices/") 
public class SMSWebService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://dsat/SMSwebservices/", "SMSWebService");
    public final static QName SMSWebServiceSoap12 = new QName("http://dsat/SMSwebservices/", "SMSWebServiceSoap12");
    public final static QName SMSWebServiceSoap = new QName("http://dsat/SMSwebservices/", "SMSWebServiceSoap");
    static {
        URL url = null;
        try {
            url = new URL("http://doisrvdev/sms_dev/SMSWebService.asmx?WSDL");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SMSWebService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://doisrvdev/sms_dev/SMSWebService.asmx?WSDL");
        }
        WSDL_LOCATION = url;
    }

    public SMSWebService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SMSWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SMSWebService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SMSWebService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SMSWebService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public SMSWebService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns SMSWebServiceSoap
     */
    @WebEndpoint(name = "SMSWebServiceSoap12")
    public SMSWebServiceSoap getSMSWebServiceSoap12() {
        return super.getPort(SMSWebServiceSoap12, SMSWebServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SMSWebServiceSoap
     */
    @WebEndpoint(name = "SMSWebServiceSoap12")
    public SMSWebServiceSoap getSMSWebServiceSoap12(WebServiceFeature... features) {
        return super.getPort(SMSWebServiceSoap12, SMSWebServiceSoap.class, features);
    }
    /**
     *
     * @return
     *     returns SMSWebServiceSoap
     */
    @WebEndpoint(name = "SMSWebServiceSoap")
    public SMSWebServiceSoap getSMSWebServiceSoap() {
        return super.getPort(SMSWebServiceSoap, SMSWebServiceSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SMSWebServiceSoap
     */
    @WebEndpoint(name = "SMSWebServiceSoap")
    public SMSWebServiceSoap getSMSWebServiceSoap(WebServiceFeature... features) {
        return super.getPort(SMSWebServiceSoap, SMSWebServiceSoap.class, features);
    }

}