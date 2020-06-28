package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSetTest {

    private DrumSet drumSet;

    @Before
    public void before(){
        drumSet = new DrumSet("Yamaha", "Black", 499.99);
    }

    @Test
    public void hasBrand(){
        assertEquals("Yamaha", drumSet.getBrand());
    }

    @Test
    public void hasColor(){
        assertEquals("Black", drumSet.getColor());
    }

}
