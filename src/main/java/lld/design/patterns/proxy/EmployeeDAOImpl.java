package lld.design.patterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO{

    private List<String> employees;
    
    public EmployeeDAOImpl(){
        this.employees = new ArrayList<String>();
        this.employees.add("Shyam"); 
        this.employees.add("Ram"); 
        this.employees.add("Abhijeet");  
    }
    
    @Override
    public String addEmployee(String name) {
        return "Shyam";
    }

    @Override
    public boolean deleteEmployee(String name) {
        return true;
    }

    @Override
    public String getEmployeeByName(String name) {
        return "Shyam Pradhan";
    }

    @Override
    public List<String> getEmployees() {
        return employees;
    }

    @Override
    public String updateEmployee(String name) {
        return "Shyam";
    }
    
}
