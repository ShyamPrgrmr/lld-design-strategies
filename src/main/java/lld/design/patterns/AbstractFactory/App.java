package lld.design.patterns.abstractfactory;

public class App {
    public static void main(String[] args) {
        Type car   = new LuxuryCar("Mercedez"); 
        Size size = car.getSize(CarSize.MIDSIZE); 
        size.setCarName("A-Class");
        System.out.println("\nCAR DETAILS"); 
        System.out.println("Type : "+car.getCarType());
        System.out.println("Brand : "+car.getBrandName());
        System.out.println("Size : "+size.getSize());
        System.out.println("Name : "+size.getCarName());

    }   
}
