package lld.design.patterns.facade;
import java.util.List;

//this has a object of EmpleeDAO using constructor injection. 
public class EmployeeDAOFacadeImpl implements EmployeeDAOFacade{

    private EmployeeDAO employeeDAO; 
    public EmployeeDAOFacadeImpl(EmployeeDAO employeeDAO){
        this.employeeDAO = employeeDAO; 
    }

    //Using methods of DAO. 
    @Override
    public String getEmployeeByName(String name) {
        return employeeDAO.getEmployeeByName(name);
    }

    @Override
    public List<String> getEmployees() {
        return employeeDAO.getEmployees();
    }
    
}
