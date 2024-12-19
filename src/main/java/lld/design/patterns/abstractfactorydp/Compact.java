package lld.design.patterns.abstractfactorydp;

public class Compact implements Size{
    private String carName; 
    Compact(){}
    Compact(String carName){
        this.carName = carName; 
    }

    @Override
    public String getSize() {
        return CarSize.COMPACT.carSize; 
    }

    @Override
    public void setCarName(String carName){
        this.carName = carName; 
    }
    @Override
    public String getCarName(){
        return this.carName; 
    }
}
