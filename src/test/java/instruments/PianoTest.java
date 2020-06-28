package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void before(){
        piano = new Piano("Gewa", "White", 2399.00 );
    }

    @Test
    public void hasBrand(){
        assertEquals("Gewa", piano.getBrand());
    }

    @Test
    public void hasColor(){
        assertEquals("White", piano.getColor());
    }

    @Test
    public void hasPrice(){
        assertEquals(2399.00, piano.getPrice(), 0.01);
    }

    @Test
    public void canAmplify(){
        assertEquals("amplifying: Plink-a-plink!", piano.playedSound("Plink-a-plink!"));
    }
}
