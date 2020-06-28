package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    private Violin violin;

    @Before
    public void before(){
        violin = new Violin("Cremona", "Ebony", 189.99);
    }

    @Test
    public void hasBrand(){
        assertEquals("Cremona", violin.getBrand());
    }

    @Test
    public void hasColor(){
        assertEquals("Ebony", violin.getColor());
    }

    @Test
    public void hasPrice(){
        assertEquals(189.99, violin.getPrice(), 0.01);
    }

    @Test
    public void canAmplify(){
        assertEquals("amplifying: Pling pling-a-pling!", violin.playedSound("Pling pling-a-pling!"));
    }

}
