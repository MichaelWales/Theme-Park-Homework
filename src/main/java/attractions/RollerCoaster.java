package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity, IReviewed, ITicketed {

    Integer minHeight;
    Integer minAge;
    Double price;

    public RollerCoaster(String name, int rating, int minHeight, int minAge, double price) {
        super(name, rating);
        this.minHeight = minHeight;
        this.minAge = minAge;
        this.price = price;
    }

    public Integer getMinHeight() {
        return this.minHeight;
    }

    public Integer getMinAge() {
        return this.minAge;
    }

    public Double defaultPrice() {
        return this.price;
    }

    public Double priceFor(Visitor visitor) {
        if(visitor.getHeight() > 200) {
            return this.price * 2;
        }
        return this.price;
    }

    public Boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() >= this.getMinAge() && visitor.getHeight() >= this.getMinHeight()) {
            return true;
        }
        return false;
    }
}
