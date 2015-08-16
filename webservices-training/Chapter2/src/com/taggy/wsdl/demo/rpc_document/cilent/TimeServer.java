
package com.taggy.wsdl.demo.rpc_document.cilent;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TimeServer", targetNamespace = "http://rpc_document.demo.wsdl.taggy.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TimeServer {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTimeAsString", targetNamespace = "http://rpc_document.demo.wsdl.taggy.com/", className = "com.taggy.wsdl.demo.rpc_document.cilent.GetTimeAsString")
    @ResponseWrapper(localName = "getTimeAsStringResponse", targetNamespace = "http://rpc_document.demo.wsdl.taggy.com/", className = "com.taggy.wsdl.demo.rpc_document.cilent.GetTimeAsStringResponse")
    @Action(input = "http://rpc_document.demo.wsdl.taggy.com/TimeServer/getTimeAsStringRequest", output = "http://rpc_document.demo.wsdl.taggy.com/TimeServer/getTimeAsStringResponse")
    public String getTimeAsString();

    /**
     * 
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTimeAsElapsed", targetNamespace = "http://rpc_document.demo.wsdl.taggy.com/", className = "com.taggy.wsdl.demo.rpc_document.cilent.GetTimeAsElapsed")
    @ResponseWrapper(localName = "getTimeAsElapsedResponse", targetNamespace = "http://rpc_document.demo.wsdl.taggy.com/", className = "com.taggy.wsdl.demo.rpc_document.cilent.GetTimeAsElapsedResponse")
    @Action(input = "http://rpc_document.demo.wsdl.taggy.com/TimeServer/getTimeAsElapsedRequest", output = "http://rpc_document.demo.wsdl.taggy.com/TimeServer/getTimeAsElapsedResponse")
    public long getTimeAsElapsed();

}
