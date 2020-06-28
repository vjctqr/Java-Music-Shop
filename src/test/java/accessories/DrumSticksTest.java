package accessories;

import org.junit.Before;
import org.junit.Test;

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
}