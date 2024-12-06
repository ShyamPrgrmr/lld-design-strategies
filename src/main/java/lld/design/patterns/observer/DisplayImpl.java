package lld.design.patterns.observer;

//Display could be the small block where I want to show price of single Stock. 
public class DisplayImpl implements Display{
    private Stock stock; 
    private String displayName; 
    //Injecting stock in constructor
    public DisplayImpl(Stock stock, String name){
        this.stock = stock; 
        this.displayName = name; 
    }
    @Override
    public void update() {
       System.out.println(stock.toString());
    }
    @Override
    public String getDisplayVal() {
        return this.stock.toString(); 
    }
    @Override
    public String getDisplayName() {
        return this.displayName; 
    }
    
}
