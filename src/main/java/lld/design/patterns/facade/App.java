package lld.design.patterns.facade;

public class App {
    public static void main(String[] args) {
        EmployeeDAOFacade facade = new EmployeeDAOFacadeImpl(new EmployeeDAOImpl());
        System.out.println(facade.getEmployees());
        System.out.println(facade.getEmployeeByName("Shyam"));     
    }
}
