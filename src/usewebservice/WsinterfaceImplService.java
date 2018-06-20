
package usewebservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "wsinterfaceImplService", targetNamespace = "http://cxf/", wsdlLocation = "http://100.5.8.52:8080/hello?wsdl")
public class WsinterfaceImplService
    extends Service
{

    private final static URL WSINTERFACEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException WSINTERFACEIMPLSERVICE_EXCEPTION;
    private final static QName WSINTERFACEIMPLSERVICE_QNAME = new QName("http://cxf/", "wsinterfaceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://100.5.8.52:8080/hello?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSINTERFACEIMPLSERVICE_WSDL_LOCATION = url;
        WSINTERFACEIMPLSERVICE_EXCEPTION = e;
    }

    public WsinterfaceImplService() {
        super(__getWsdlLocation(), WSINTERFACEIMPLSERVICE_QNAME);
    }

    public WsinterfaceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSINTERFACEIMPLSERVICE_QNAME, features);
    }

    public WsinterfaceImplService(URL wsdlLocation) {
        super(wsdlLocation, WSINTERFACEIMPLSERVICE_QNAME);
    }

    public WsinterfaceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSINTERFACEIMPLSERVICE_QNAME, features);
    }

    public WsinterfaceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsinterfaceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WsinterfaceImpl
     */
    @WebEndpoint(name = "wsinterfaceImplPort")
    public WsinterfaceImpl getWsinterfaceImplPort() {
        return super.getPort(new QName("http://cxf/", "wsinterfaceImplPort"), WsinterfaceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsinterfaceImpl
     */
    @WebEndpoint(name = "wsinterfaceImplPort")
    public WsinterfaceImpl getWsinterfaceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://cxf/", "wsinterfaceImplPort"), WsinterfaceImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSINTERFACEIMPLSERVICE_EXCEPTION!= null) {
            throw WSINTERFACEIMPLSERVICE_EXCEPTION;
        }
        return WSINTERFACEIMPLSERVICE_WSDL_LOCATION;
    }

}
