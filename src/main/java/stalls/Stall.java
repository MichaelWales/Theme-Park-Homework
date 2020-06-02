package stalls;

import behaviours.IReviewed;

public abstract class Stall implements IReviewed {

    private String name;
    private String ownerName;
    private ParkingSpot parkingSpot;
    private Integer rating;

    public Stall(String name, String ownerName, ParkingSpot parkingSpot, Integer rating) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public Integer getRating() {
        return rating;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
}
