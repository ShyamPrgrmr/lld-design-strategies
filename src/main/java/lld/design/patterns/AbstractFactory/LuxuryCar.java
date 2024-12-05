package lld.design.patterns.AbstractFactory;

public class LuxuryCar extends Type{
    private String brandName; 
    LuxuryCar() {}
    LuxuryCar(String brandName){
        this.brandName = brandName; 
    }

    @Override
    public String getCarType() {
        return CarType.LUXURY.carType; 
    }

    @Override
    public String getBrandName(){
        return this.brandName; 
    }

    @Override
    public void setBrandName(String brandName) {
        this.brandName = brandName; 
    }
}
