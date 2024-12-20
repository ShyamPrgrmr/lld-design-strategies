package lld.design.patterns.mediator;

public class App {
    public static void main(String[] args) {
        
        Mediator auction = new Auction("Antigue Jwellery"); 
        Collegue bidder_1 = new Bidder(auction, "Shyam Pradhan"); 
        Collegue bidder_2 = new Bidder(auction, "Ram Pradhan");
        Collegue bidder_3 = new Bidder(auction, "Abhi Pradhan");

        auction.addCollegue(bidder_3);
        auction.addCollegue(bidder_2);
        auction.addCollegue(bidder_1);
        
        
        bidder_1.placeBid(10);
        bidder_2.placeBid(10);
        bidder_2.placeBid(11);
        bidder_3.placeBid(15);

    }
}
