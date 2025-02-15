package lld.design.patterns.proxy;
import java.util.List;

public interface EmployeeDAO {
    //Assume String is a Employee object. 
    public List<String> getEmployees(); 
    public String getEmployeeByName(String name);
    public String addEmployee(String name);
    public String updateEmployee(String name);
    public boolean deleteEmployee(String name);  
}
