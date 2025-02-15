package lld.design.patterns.abstractfactorydp;

public abstract class Type {
    public abstract String getCarType(); 
    public Size getSize(CarSize carSize) {
        switch (carSize) {
            case COMPACT:
                return new Compact(); 
            case MIDSIZE:
                return new MidSize(); 
            case FULLSIZE:
                return new FullSize(); 
            default:
                return null; 
        }
    }
    public abstract String getBrandName(); 
    public abstract void setBrandName(String brandName); 

}
