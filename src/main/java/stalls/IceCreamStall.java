package stalls;

public class IceCreamStall extends Stall {

    Integer rating;

    public IceCreamStall(String name, String ownerName, ParkingSpot parkingSpot, Integer rating) {
        super(name, ownerName, parkingSpot, rating);
    }

    public Integer getRating() {
        return this.rating;
    }
}
