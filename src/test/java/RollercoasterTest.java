import Attractions.Rollercoaster;
import VisitorStuff.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Looper", 7);
        visitor = new Visitor(14, 144, 75.75);
    }

    @Test
    public void canGetRollercoasterName(){
        assertEquals("Looper", rollercoaster.getName());
    }

    @Test
    public void canCheckIsAllowedTo(){
        assertEquals(false, rollercoaster.isAllowedTo(visitor));
    }

    @Test
    public void canGetRating(){
        assertEquals(7, rollercoaster.getRating());
    }
}
