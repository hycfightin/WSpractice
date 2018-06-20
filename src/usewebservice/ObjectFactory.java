
package usewebservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the usewebservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _WstestResponse_QNAME = new QName("http://cxf/", "wstestResponse");
    private final static QName _Wstest_QNAME = new QName("http://cxf/", "wstest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: usewebservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WstestResponse }
     * 
     */
    public WstestResponse createWstestResponse() {
        return new WstestResponse();
    }

    /**
     * Create an instance of {@link Wstest }
     * 
     */
    public Wstest createWstest() {
        return new Wstest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WstestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf/", name = "wstestResponse")
    public JAXBElement<WstestResponse> createWstestResponse(WstestResponse value) {
        return new JAXBElement<WstestResponse>(_WstestResponse_QNAME, WstestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Wstest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf/", name = "wstest")
    public JAXBElement<Wstest> createWstest(Wstest value) {
        return new JAXBElement<Wstest>(_Wstest_QNAME, Wstest.class, null, value);
    }

}
