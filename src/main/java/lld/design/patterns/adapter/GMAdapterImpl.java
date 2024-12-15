package lld.design.patterns.adapter;

public class GMAdapterImpl  implements GMAdapter{
    private Adaptee adaptee; 

    public GMAdapterImpl(Adaptee adaptee){
        this.adaptee = adaptee; 
    }   

    @Override
    public double getWeightInGM() {
        return this.adaptee.getWeightInPounds() * 453.6;
    }    
}
