package accessories;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringTest {

    private String string;

    @Before
    public void before(){
        string = new String("Elixir", 15.40);
    }

    @Test
    public void hasBrand(){
        assertEquals("Elixir", string.getBrand());
    }

    @Test


}
