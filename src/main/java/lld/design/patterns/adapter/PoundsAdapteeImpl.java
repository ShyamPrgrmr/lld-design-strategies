package lld.design.patterns.adapter;

public class PoundsAdapteeImpl implements Adaptee{

    private float weight; 

    @Override
    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public double getWeightInPounds() {
        return this.weight;
    }
    
    
}
