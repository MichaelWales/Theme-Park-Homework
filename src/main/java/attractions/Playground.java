package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity, IReviewed {

    Integer maxAge;

    public Playground(String name, int rating, int maxAge) {
        super(name, rating);
        this.maxAge = maxAge;
    }

    public Integer getMaxAge() {
        return this.maxAge;
    }

    public Boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() <= this.getMaxAge()) {
            return true;
        }
        return false;
    }

}
