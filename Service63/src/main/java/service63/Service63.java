package service63;

import java.io.FileNotFoundException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.bind.JAXBException;


@WebService
@SOAPBinding(style=Style.RPC)

public interface Service63 {
	
	@WebMethod
	public void Serviçe22(@WebParam(name = "AcademicStaffMember") AcademicStaffMember asm, @WebParam(name = "AcademicStaffMembers") AcademicStaffMembers asms,
	      @WebParam(name = "Module") Module63 module, @WebParam(name = "ModuleCode") ModuleCode63 moduleCode)
	       throws FileNotFoundException, JAXBException;
	
	@WebMethod
	public void AcademicStaffMember(@WebParam(name = "AcademicStaffMemberID") int asmID);

	@WebMethod
	public @WebResult(name = "getAcademicStaffMemberIDResult") int getAsmID(
			@WebParam(name = "getAcademicStaffMemberID") int asmID);

	@WebMethod
	public void addToModules(@WebParam(name = "addToModulesModule") Module63 module,
			@WebParam(name = "addToModulesModuleCode") ModuleCode63 moduleCode);

	@WebMethod
	public @WebResult(name = "getModulesResult") Module63[] getModules ();

	// Students
	@WebMethod
	public void addToArray(@WebParam(name = "addToArrayAcademicStaffMember") AcademicStaffMember staff);

	@WebMethod
	public @WebResult(name = "getAcademicStaffMembersResult") AcademicStaffMember[] getAsms();

	// Module
	@WebMethod
	public void Module(@WebParam(name = "ModuleModuleCode") ModuleCode63 moduleCode,
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
