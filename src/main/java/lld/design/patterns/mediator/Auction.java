package lld.design.patterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class Auction implements Mediator{

    private String auctionName; 
    private int currentBid;
    private List<Collegue> collegues;  

    Auction(String auctionName){
        this.collegues = new ArrayList<Collegue>(); 
        this.auctionName = auctionName;
        this.currentBid = 0;  
    }

    @Override
    public void addCollegue(Collegue collegue) {
       collegues.add(collegue); 
    }

    @Override
    public String getAuctionName() {
        return this.auctionName;
    }

    @Override
    public void placeBid(int bid) {
        if(bid>currentBid){
            currentBid = bid; 

            for(Collegue collegue : collegues){
                collegue.receiveBidNotification(bid);
            }

        }else{
            System.out.print("\nBid values less than current bid");
        }
    }
}
