package lld.design.patterns.observer;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Stock elcidStock = new StockImpl("Elcid"); 
        Stock tataPowerStock = new StockImpl("Tata Power");
        Stock suzlonStock = new StockImpl("Suzlon Power");
        UpdateStock upStock = new UpdateStock();

        upStock.addStock(suzlonStock);
        upStock.addStock(tataPowerStock);
        upStock.addStock(elcidStock);

        Display mobileDisplay = new DisplayImpl(elcidStock, "Mobile");
        Display monitorDisplay = new DisplayImpl(suzlonStock, "Monitor");
        Display bannerDisplay = new DisplayImpl(tataPowerStock, "Banner");  

        
        Thread updateStock = new Thread(()->{
            upStock.updateStockPrices(); 
        });

        System.out.println("\n");
        Thread displayUpdate = new Thread(()->{
            while (true) {
                System.out.println("---------------------------------------"); 
                System.out.println(mobileDisplay.getDisplayName());
                System.out.println(mobileDisplay.getDisplayVal()); 
                System.out.println("---------------------------------------");
                System.out.println(monitorDisplay.getDisplayName());
                System.out.println(monitorDisplay.getDisplayVal());
                System.out.println("---------------------------------------");
                System.out.println(bannerDisplay.getDisplayName());
                System.out.println(bannerDisplay.getDisplayVal());
                System.out.println("---------------------------------------");
                System.out.println("\n\n");
                try {
                    Thread.sleep(1000);    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        
        updateStock.start();
        displayUpdate.start();
    }
}
