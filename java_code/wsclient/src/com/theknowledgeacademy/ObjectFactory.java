
package com.theknowledgeacademy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.theknowledgeacademy package. 
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

    private final static QName _AddOp_QNAME = new QName("http://theknowledgeacademy.com", "addOp");
    private final static QName _MultiplyOp_QNAME = new QName("http://theknowledgeacademy.com", "multiplyOp");
    private final static QName _MultiplyOpResponse_QNAME = new QName("http://theknowledgeacademy.com", "multiplyOpResponse");
    private final static QName _AddOpResponse_QNAME = new QName("http://theknowledgeacademy.com", "addOpResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.theknowledgeacademy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MultiplyOpResponse }
     * 
     */
    public MultiplyOpResponse createMultiplyOpResponse() {
        return new MultiplyOpResponse();
    }

    /**
     * Create an instance of {@link MultiplyOp }
     * 
     */
    public MultiplyOp createMultiplyOp() {
        return new MultiplyOp();
    }

    /**
     * Create an instance of {@link AddOp }
     * 
     */
    public AddOp createAddOp() {
        return new AddOp();
    }

    /**
     * Create an instance of {@link AddOpResponse }
     * 
     */
    public AddOpResponse createAddOpResponse() {
        return new AddOpResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://theknowledgeacademy.com", name = "addOp")
    public JAXBElement<AddOp> createAddOp(AddOp value) {
        return new JAXBElement<AddOp>(_AddOp_QNAME, AddOp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplyOp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://theknowledgeacademy.com", name = "multiplyOp")
    public JAXBElement<MultiplyOp> createMultiplyOp(MultiplyOp value) {
        return new JAXBElement<MultiplyOp>(_MultiplyOp_QNAME, MultiplyOp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplyOpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://theknowledgeacademy.com", name = "multiplyOpResponse")
    public JAXBElement<MultiplyOpResponse> createMultiplyOpResponse(MultiplyOpResponse value) {
        return new JAXBElement<MultiplyOpResponse>(_MultiplyOpResponse_QNAME, MultiplyOpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://theknowledgeacademy.com", name = "addOpResponse")
    public JAXBElement<AddOpResponse> createAddOpResponse(AddOpResponse value) {
        return new JAXBElement<AddOpResponse>(_AddOpResponse_QNAME, AddOpResponse.class, null, value);
    }

}
