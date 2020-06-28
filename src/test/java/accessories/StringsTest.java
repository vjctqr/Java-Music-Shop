package accessories;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringsTest {

    private Strings strings;

    @Before
    public void before(){
        strings = new Strings("Elixir", 15.40);
    }

    @Test
    public void hasBrand(){
        assertEquals("Elixir", strings.getBrand());
    }

    @Test
    public void hasPrice(){
        assertEquals(15.40, strings.getPrice(), 0.01);
    }


}
