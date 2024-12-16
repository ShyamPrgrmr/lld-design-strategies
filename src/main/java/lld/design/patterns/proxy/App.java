package lld.design.patterns.proxy;

public class App {
    public static void main(String[] args) {
        EmployeeDAO proxy = new EmployeeDAOProxy(new EmployeeDAOImpl()); 
        System.out.println(proxy.addEmployee("Shyam"));
        System.out.println(proxy.getEmployees());
    }
}
