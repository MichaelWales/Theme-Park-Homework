package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements IReviewed, ITicketed {

    Double price;

    public Dodgems(String name, int rating, double price) {
        super(name, rating);
        this.price = price;
    }

    public Double defaultPrice() {
        return this.price;
    }

    public Double priceFor(Visitor visitor) {
        if(visitor.getAge() < 12) {
            return this.price / 2;
        }
        return this.price;
    }
}
