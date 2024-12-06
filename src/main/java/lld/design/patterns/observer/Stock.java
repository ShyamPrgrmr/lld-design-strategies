package lld.design.patterns.observer;

public interface Stock {
    public void setPrice(int price); 
    public int getPrice(); 
    public void notifyDisplay(); 
    public void add(Display display); 
    public String getName(); 
}
