
package service22;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
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
@WebService(name = "Service22", targetNamespace = "http://service22/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Service22 {


    /**
     * 
     * @param setMarkMark
     */
    @WebMethod
    @Action(input = "http://service22/Service22/setMarkRequest", output = "http://service22/Service22/setMarkResponse")
    public void setMark(
        @WebParam(name = "setMarkMark", partName = "setMarkMark")
        double setMarkMark);

    /**
     * 
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(name = "getAcademicYear", partName = "getAcademicYear")
    @Action(input = "http://service22/Service22/getAcademicYearRequest", output = "http://service22/Service22/getAcademicYearResponse")
    public double getAcademicYear();

    /**
     * 
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(name = "getModuleCode", partName = "getModuleCode")
    @Action(input = "http://service22/Service22/getModuleCodeRequest", output = "http://service22/Service22/getModuleCodeResponse")
    public double getModuleCode();

    /**
     * 
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(name = "getMarkResult", partName = "getMarkResult")
    @Action(input = "http://service22/Service22/getMarkRequest", output = "http://service22/Service22/getMarkResponse")
    public double getMark();

    /**
     * 
     * @param addToArrayStudent
     */
    @WebMethod
    @Action(input = "http://service22/Service22/addToArrayRequest", output = "http://service22/Service22/addToArrayResponse")
    public void addToArray(
        @WebParam(name = "addToArrayStudent", partName = "addToArrayStudent")
        Student addToArrayStudent);

    /**
     * 
     * @param moduleCode
     * @param student
     * @param module
     * @param students
     * @throws FileNotFoundException_Exception
     * @throws JAXBException_Exception
     */
    @WebMethod(operationName = "Servi\u00e7e22")
    @Action(input = "http://service22/Service22/Servi\u00e7e22Request", output = "http://service22/Service22/Servi\u00e7e22Response", fault = {
        @FaultAction(className = FileNotFoundException_Exception.class, value = "http://service22/Service22/Servi\u00e7e22/Fault/FileNotFoundException"),
        @FaultAction(className = JAXBException_Exception.class, value = "http://service22/Service22/Servi\u00e7e22/Fault/JAXBException")
    })
    public void servi?e22(
        @WebParam(name = "Student", partName = "Student")
        Student student,
        @WebParam(name = "Students", partName = "Students")
        Students students,
        @WebParam(name = "Module", partName = "Module")
        Module22 module,
        @WebParam(name = "ModuleCode", partName = "ModuleCode")
        ModuleCode22 moduleCode)
        throws FileNotFoundException_Exception, JAXBException_Exception
    ;

    /**
     * 
     * @param moduleModuleCode
     * @param moduleAcademicYear
     */
    @WebMethod(operationName = "Module")
    @Action(input = "http://service22/Service22/ModuleRequest", output = "http://service22/Service22/ModuleResponse")
    public void module(
        @WebParam(name = "ModuleModuleCode", partName = "ModuleModuleCode")
        ModuleCode22 moduleModuleCode,
        @WebParam(name = "ModuleAcademicYear", partName = "ModuleAcademicYear")
        String moduleAcademicYear);

    /**
     * 
     * @param addToModulesModule
     * @param addToModulesModuleCode
     */
    @WebMethod
    @Action(input = "http://service22/Service22/addToModulesRequest", output = "http://service22/Service22/addToModulesResponse")
    public void addToModules(
        @WebParam(name = "addToModulesModule", partName = "addToModulesModule")
        Module22 addToModulesModule,
        @WebParam(name = "addToModulesModuleCode", partName = "addToModulesModuleCode")
        ModuleCode22 addToModulesModuleCode);

    /**
     * 
     * @return
     *     returns service22.Module22Array
     */
    @WebMethod
    @WebResult(name = "getModulesResult", partName = "getModulesResult")
    @Action(input = "http://service22/Service22/getModulesRequest", output = "http://service22/Service22/getModulesResponse")
    public Module22Array getModules();

    /**
     * 
     * @param studentStudentID
     */
    @WebMethod(operationName = "Student")
    @Action(input = "http://service22/Service22/StudentRequest", output = "http://service22/Service22/StudentResponse")
    public void student(
        @WebParam(name = "StudentStudentID", partName = "StudentStudentID")
        int studentStudentID);

    /**
     * 
     * @return
     *     returns service22.StudentArray
     */
    @WebMethod
    @WebResult(name = "getStudentsResult", partName = "getStudentsResult")
    @Action(input = "http://service22/Service22/getStudentsRequest", output = "http://service22/Service22/getStudentsResponse")
    public StudentArray getStudents();

    /**
     * 
     * @param getStudentIDStudentID
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "getStudentIDResult", partName = "getStudentIDResult")
    @Action(input = "http://service22/Service22/getStudentIDRequest", output = "http://service22/Service22/getStudentIDResponse")
    public int getStudentID(
        @WebParam(name = "getStudentIDStudentID", partName = "getStudentIDStudentID")
        int getStudentIDStudentID);

}
