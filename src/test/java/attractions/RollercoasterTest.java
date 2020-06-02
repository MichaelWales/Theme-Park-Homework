package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10, 145, 12, 8.40);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, (int)rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasMinAge() {
        assertEquals(12, (int)rollerCoaster.getMinAge());
    }

    @Test
    public void hasPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void canRobTallPerson() {
        Visitor visitor = new Visitor(30, 211, 20.00);
        assertEquals(16.80, rollerCoaster.priceFor(visitor), 0.1);
    }

    @Test
    public void visitorCanRide() {
        Visitor visitor = new Visitor(9, 100, 10.00);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void visitorCannotRide() {
        Visitor visitor = new Visitor(82, 185, 100.00);
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }
}
