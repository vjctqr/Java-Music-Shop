package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    private  DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks("Vater", 35.50);
    }

    @Test
    public void hasBrand(){
        assertEquals("Vater", drumSticks.getBrand());
    }

    @Test
    public void hasPrice(){
        assertEquals(35.50, drumSticks.getPrice(), 0.01);
    }
}
