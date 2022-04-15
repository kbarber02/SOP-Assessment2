
package service9;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Service9", targetNamespace = "http://service9/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Service9 {


    /**
     * 
     * @param role
     * @param id
     * @throws JAXBException_Exception
     * @throws FileNotFoundException_Exception
     */
    @WebMethod(operationName = "Registration")
    @Action(input = "http://service9/Service9/RegistrationRequest", output = "http://service9/Service9/RegistrationResponse", fault = {
        @FaultAction(className = FileNotFoundException_Exception.class, value = "http://service9/Service9/Registration/Fault/FileNotFoundException"),
        @FaultAction(className = JAXBException_Exception.class, value = "http://service9/Service9/Registration/Fault/JAXBException")
    })
    public void registration(
        @WebParam(name = "Role", partName = "Role")
        Role role,
        @WebParam(name = "ID", partName = "ID")
        int id)
        throws FileNotFoundException_Exception, JAXBException_Exception
    ;

}
