package lld.design.patterns.proxy;

import java.util.List;

public class EmployeeDAOProxy implements EmployeeDAO{
    private EmployeeDAO realEmployeeDAO;
    public EmployeeDAOProxy(EmployeeDAO realEmployeeDAO){
        this.realEmployeeDAO = realEmployeeDAO; 
    }

    //we can security or logging code in methods. 
    @Override
    public String addEmployee(String name) {
        return this.realEmployeeDAO.addEmployee(name);
    }
    @Override
    public boolean deleteEmployee(String name) {
        return this.realEmployeeDAO.deleteEmployee(name);
    }
    @Override
    public String getEmployeeByName(String name) {
        return this.realEmployeeDAO.getEmployeeByName(name);
    }
    @Override
    public List<String> getEmployees() {
        return this.realEmployeeDAO.getEmployees();
    }
    @Override
    public String updateEmployee(String name) {
        return this.realEmployeeDAO.updateEmployee(name);
    }

}
