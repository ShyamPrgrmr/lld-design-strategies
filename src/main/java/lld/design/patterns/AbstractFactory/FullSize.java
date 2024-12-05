package lld.design.patterns.AbstractFactory;

public class FullSize implements Size{
    private String carName; 
    
    FullSize(){}
    
    FullSize(String carName){
        this.carName = carName; 
    }

    @Override
    public String getSize() {
        return CarSize.FULLSIZE.carSize; 
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
