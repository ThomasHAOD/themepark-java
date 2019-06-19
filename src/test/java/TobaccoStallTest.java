import Stalls.TobaccoStall;
import VisitorStuff.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Smokes", "Harry", "G6", 9);
        visitor = new Visitor(18, 180, 60.79);
    }

    @Test
    public void canGetName(){
        assertEquals("Smokes", tobaccoStall.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("Harry", tobaccoStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot(){
        assertEquals("G6", tobaccoStall.getParkingSpot());
    }

    @Test
    public void canCheckIsAllowedTo(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitor));
    }
}
