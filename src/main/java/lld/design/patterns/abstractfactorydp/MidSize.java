package lld.design.patterns.abstractfactorydp;

public class MidSize implements Size{
    private String carName; 
    public MidSize(){}
    public MidSize (String carName){
        this.carName = carName; 
    }

    @Override
    public String getSize() {
        return CarSize.MIDSIZE.carSize; 
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
