package lld.design.patterns.adapter;

public class App {
    public static void main(String[] args) {

        System.out.println("\n\n");

        Adaptee adaptee = new PoundsAdapteeImpl(); 
        adaptee.setWeight(20);     
        System.out.println("Weight in pound "+ adaptee.getWeightInPounds());

        //Client wants in KGs

        KGAdapter kgAdapter = new KGAdapterImpl(adaptee); 
        System.out.println("Weight in KGs "+ kgAdapter.getWeightInKG());

        //Client want data in GMs
        
        GMAdapter gmAdapter = new GMAdapterImpl(adaptee); 
        System.out.println("Weight in GMs "+ gmAdapter.getWeightInGM());

    }
}
