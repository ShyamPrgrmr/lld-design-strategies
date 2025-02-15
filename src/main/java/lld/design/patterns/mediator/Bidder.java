package lld.design.patterns.mediator;

public class Bidder implements Collegue{

    private Mediator auction; 
    private String name; 

    public Bidder(Mediator auction, String name){
        this.auction = auction; 
        this.name = name; 
    }

    @Override
    public void placeBid(int bid) {
        System.out.printf("\nName: %s placed bid of %d",this.name, bid);
        this.auction.placeBid(bid);        
    }

    @Override
    public void receiveBidNotification(int bid) {
        System.out.printf("\nName: %s received notification about bid %d",this.name, bid);
    }
    
}
