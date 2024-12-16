package lld.design.patterns.facade;

import java.util.List;

public interface EmployeeDAOFacade {
    public String getEmployeeByName(String name); 
    public List<String> getEmployees(); 
}
