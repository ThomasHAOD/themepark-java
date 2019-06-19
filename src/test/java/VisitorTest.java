import VisitorStuff.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(25, 180, 25.50);
    }

    @Test
    public void canGetAge(){
        assertEquals(25, visitor.getAge());
    }

    @Test
    public void canGetHeight(){
        assertEquals(180, visitor.getHeight());
    }

    @Test
    public void canGetMoney(){
        assertEquals(25.50, visitor.getMoney(), 0.01);
    }
}
