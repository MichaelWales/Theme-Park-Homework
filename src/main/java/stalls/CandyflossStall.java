package stalls;

import behaviours.IReviewed;

public class CandyflossStall extends Stall {

    Integer rating;

    public CandyflossStall(String name, String ownerName, ParkingSpot parkingSpot, Integer rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public Integer getRating() {
        return this.rating;
    }
}
