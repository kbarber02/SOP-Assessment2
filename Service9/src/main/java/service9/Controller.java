package service9;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.jws.WebService;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;


public class Controller {

	public void registration(int ID, Role role) throws FileNotFoundException, JAXBException, MalformedURLException {
		
		if (role == Role.STUDENT) {
			// invocation to Web API
			URL url = new URL("http://localhost:8080/Service22/?wsdl");
			QName qname = new QName("http://service22/", "Service22ImplService");
			Service service = Service.create(url, qname);

			Service22ImplService obj = service.getPort(Service22ImplService.class);
			//obj.registerStudent(ID);
			
		} else {
			
			URL url = new URL("http://localhost:8080/Service63/?wsdl");
			QName qname = new QName("http://service63/", "Service63ImplService");
			Service service = Service.create(url, qname);

			Service63ImplService obj = service.getPort(Service63ImplService.class);

		}


	}

	public void studentModuleEnroll() {

		System.out.println("");

	}

	public void markInsert() {

		System.out.println("");

	}

	public void printMark() {

		System.out.println("");

	}

	public void asmModuleAssign() {

		System.out.println("");

	}

}
