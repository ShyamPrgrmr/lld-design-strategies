package lld.design.patterns.abstractfactorydp;

public class OrdinaryCar extends Type{

    private String brandName; 

    OrdinaryCar(){}
    OrdinaryCar(String brandName){
        this.brandName = brandName; 
    }

    @Override
    public String getCarType() {
        return CarType.ORDINARY.carType; 
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
