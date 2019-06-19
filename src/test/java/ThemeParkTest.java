import Attractions.Playground;
import Attractions.Rollercoaster;
import Stalls.TobaccoStall;
import VisitorStuff.ThemePark;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Rollercoaster rollercoaster;
    TobaccoStall tobaccoStall;
    Playground playground;

    @Before
    public void before(){
        themePark = new ThemePark();
        rollercoaster = new Rollercoaster("Looper", 7);
        tobaccoStall = new TobaccoStall("Smokes", "Jim", "G6", 10);
        playground = new Playground("Mirror", 3);
    }

    @Test
    public void canAddIReviewed(){
        themePark.addIReviewed(rollercoaster);
        themePark.addIReviewed(playground);
        themePark.addIReviewed(tobaccoStall);
        assertEquals(3, themePark.getAllReviewed().size());
    }
}
