package service9;

import java.io.FileNotFoundException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.bind.JAXBException;


@WebService
@SOAPBinding(style = Style.RPC)

public interface Service9 {

	/* Registration of end users */
	public void Registration(@WebParam(name = "Role") Role role,
			@WebParam(name = "ID") int ID)
			throws FileNotFoundException, JAXBException;
	
	/* Enrolling student on module */

	/* Inserting new mark */

	/* Printing mark for module of student */

	/* Assigning module to an academic staff member */
}
