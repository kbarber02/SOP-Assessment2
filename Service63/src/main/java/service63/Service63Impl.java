package service63;

import javax.jws.WebService;
import java.io.FileNotFoundException;

import javax.jws.WebService;
import javax.xml.bind.JAXBException;

@WebService(endpointInterface="service63.Service63")

public class Service63Impl implements Service63 {

	public void Serviçe22(service63.AcademicStaffMember asm, AcademicStaffMembers asms, Module63 module,
			ModuleCode63 moduleCode) throws FileNotFoundException, JAXBException {
		
	}

	public void AcademicStaffMember(int asmID) {
		
	}

	public int getAsmID(int asmID) {
		return 0;
	}

	public void addToModules(Module63 module, ModuleCode63 moduleCode) {
		
	}

	public Module63[] getModules() {
		return null;
	}

	public void addToArray(service63.AcademicStaffMember staff) {
		
	}

	public service63.AcademicStaffMember[] getAsms() {
		return null;
	}

	public void Module(ModuleCode63 moduleCode, String academicYear) {
		
	}

	@Override
	public void setMark(double mark) {
		// TODO Auto-generated method stub
		
	}

	public double getMark() {
		return 0;
	}

	public double getAcademicYear() {
		return 0;
	}

	public double getModuleCode() {
		return 0;
	}

}
