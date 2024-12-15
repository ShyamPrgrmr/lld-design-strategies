package lld.design.patterns.adapter;

public class KGAdapterImpl implements KGAdapter {
    private Adaptee adaptee; 
    public KGAdapterImpl(Adaptee adaptee){
        this.adaptee = adaptee; 
    }
    @Override
    public double getWeightInKG() {
        return this.adaptee.getWeightInPounds() / 2.205;
    }
}
