package service22;

import java.io.FileNotFoundException;

import javax.jws.WebService;
import javax.xml.bind.JAXBException;

@WebService(endpointInterface="service22.Service22")

public class Service22Impl implements Service22 {
	
	public void Serviçe22(service22.Student student, Students students, Module22 module, ModuleCode22 moduleCode)
			throws FileNotFoundException, JAXBException {
		
	}

	public void Student(int studentID) {
		
	}

	public int getStudentID(int studentID) {
		return 0;
	}

	public void addToModules(Module22 module, ModuleCode22 moduleCode) {
		
	}

	public Module22[] getModules() {
		return null;
	}

	public void addToArray(service22.Student student) {		
	}

	public service22.Student[] getStudents() {
		return null;
	}

	public void Module(ModuleCode22 moduleCode, String academicYear) {
		
	}

	public void setMark(double mark) {
		
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
