package lld.design.patterns.strategydesign;

import java.util.ArrayList;
import java.util.List;

import lld.design.patterns.strategydesign.strategies.FastSpeedImpl;
import lld.design.patterns.strategydesign.strategies.MediumSpeedImpl;
import lld.design.patterns.strategydesign.strategies.SuperFastImpl;

public class App {
    public static void main(String[] args) {
        Vehical vehical1 = new SportsCar();
        Vehical vehical2 = new SportsBike();
        Vehical vehical3 = new OrdinaryCar(); 


        //Setting strategies, which can be changed runtime. 
        vehical1.setSpeedType(new SuperFastImpl());
        vehical2.setSpeedType(new FastSpeedImpl());
        vehical3.setSpeedType(new MediumSpeedImpl());

        vehical1.setCarName("F1 car");
        vehical2.setCarName("Kawaski Ninja");
        vehical3.setCarName("TATA Punch");

        List<Vehical> vehicals = new ArrayList<Vehical>();
        vehicals.add(vehical3);
        vehicals.add(vehical2);
        vehicals.add(vehical1);  

        vehicals.forEach(vehical -> {
            System.out.println("\nCar Details : "); 
            System.out.println("Car Name : " + vehical.carName);
            System.out.println("Speed : " + vehical.getCarSpeed().getSpeed());
        });

    }
}
