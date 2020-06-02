package stalls;

import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    Integer minAge;
    Integer rating;

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot, Integer minAge, Integer rating) {
        super(name, ownerName, parkingSpot, rating);
        this.minAge = minAge;
    }

    public Integer getMinAge() {
        return this.minAge;
    }

    public Boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() >= this.getMinAge()) {
            return true;
        }
        return false;
    }

    public Integer getRating() {
        return this.rating;
    }
}
