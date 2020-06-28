package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Fender", "Vintage Blonde", 575.00);
    }

    @Test
    public void hasBrand(){
        assertEquals("Fender", guitar.getBrand());
    }

    @Test
    public void hasColor(){
        assertEquals("Vintage Blonde", guitar.getColor());
    }

    @Test
    public void hasPrice(){
        assertEquals(575.00, guitar.getPrice(), 0.01);
    }
}
