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
}
