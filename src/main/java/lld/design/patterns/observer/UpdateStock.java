package lld.design.patterns.observer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//not part of observer, it is just a clas to demonstrate. 
public class UpdateStock {
    private List<Stock> stocks = new ArrayList<Stock>();  
    private Random rand; 

    public UpdateStock (){
        rand = new Random(); 
    }

    public void addStock(Stock stock) {
        stocks.add(stock); 
    }
    
    public void updateStockPrices(){
        while(true) {
            for(Stock stock : stocks){
                int upPrice = rand.nextInt(0, 1000);
                stock.setPrice(upPrice);    
            }
            try{
                Thread.sleep(100);
            }catch(Exception exe) {
                exe.printStackTrace();
            } 
        }
    }
} 

