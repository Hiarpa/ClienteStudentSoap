
package com.digitalhouse.soap.ws.client.generated;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "StudentDetailsPort", targetNamespace = "http://www.digitalhouse.com/xml/school")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface StudentDetailsPort {


    /**
     * 
     * @param studentDetailsRequest
     * @return
     *     returns com.digitalhouse.soap.ws.client.generated.StudentDetailsResponse
     */
    @WebMethod(operationName = "StudentDetails")
    @WebResult(name = "StudentDetailsResponse", targetNamespace = "http://www.digitalhouse.com.br/xml/school", partName = "StudentDetailsResponse")
    public StudentDetailsResponse studentDetails(
        @WebParam(name = "StudentDetailsRequest", targetNamespace = "http://www.digitalhouse.com.br/xml/school", partName = "StudentDetailsRequest")
        StudentDetailsRequest studentDetailsRequest);

}
