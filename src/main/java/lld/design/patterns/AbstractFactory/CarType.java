package lld.design.patterns.AbstractFactory;

public enum CarType {
    LUXURY("Luxury Car"), ORDINARY("Ordinary Car");
    String carType; 
    CarType(String carType) {
        this.carType = carType; 
    }
}


