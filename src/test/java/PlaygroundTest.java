import Attractions.Playground;
import VisitorStuff.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(10, 150, 30.05);
        playground = new Playground("Swings and roundabouts", 5);
    }

    @Test
    public void canGetPlaygroundName(){
        assertEquals("Swings and roundabouts", playground.getName());
    }

    @Test
    public void canCheckIsAllowedTo(){
        assertEquals(true, playground.isAllowedTo(visitor));
    }
}
