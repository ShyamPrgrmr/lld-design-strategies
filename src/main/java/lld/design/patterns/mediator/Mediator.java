package lld.design.patterns.mediator;

public interface Mediator {
    public String getAuctionName(); 
    public void addCollegue(Collegue collegue);
    public void placeBid(int bid); 
}
