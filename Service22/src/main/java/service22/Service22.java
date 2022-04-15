package service22;

import java.io.FileNotFoundException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.bind.JAXBException;

@WebService
@SOAPBinding(style = Style.RPC)

public interface Service22 {


	@WebMethod
	public void Serviçe22(@WebParam(name = "Student") Student student, @WebParam(name = "Students") Students students,
	      @WebParam(name = "Module") Module22 module, @WebParam(name = "ModuleCode") ModuleCode22 moduleCode)
	       throws FileNotFoundException, JAXBException;
	
	// Student
	@WebMethod
	public void Student(@WebParam(name = "StudentStudentID") int studentID);

	@WebMethod
	public @WebResult(name = "getStudentIDResult") int getStudentID(
			@WebParam(name = "getStudentIDStudentID") int studentID);

	@WebMethod
	public void addToModules(@WebParam(name = "addToModulesModule") Module22 module,
			@WebParam(name = "addToModulesModuleCode") ModuleCode22 moduleCode);

	@WebMethod
	public @WebResult(name = "getModulesResult") Module22[] getModules ();

	// Students
	@WebMethod
	public void addToArray(@WebParam(name = "addToArrayStudent") Student student);

	@WebMethod
	public @WebResult(name = "getStudentsResult") Student[] getStudents();

	// Module
	@WebMethod
	public void Module(@WebParam(name = "ModuleModuleCode") ModuleCode22 moduleCode,
			@WebParam(name = "ModuleAcademicYear") String academicYear);

	@WebMethod
	public void setMark(@WebParam(name = "setMarkMark") double mark);

	@WebMethod
	public @WebResult(name = "getMarkResult") double getMark();

	@WebMethod
	public @WebResult(name = "getAcademicYear") double getAcademicYear();
	
	@WebMethod
	public @WebResult(name = "getModuleCode") double getModuleCode();
}
