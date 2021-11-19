import instruments.Piano;
import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;
import types.Type;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet();
    }

    @Test
    public void canPlay() {
        assertEquals("trumpet_sample.mp4", trumpet.play());
    }

    @Test
    public void hasType() {
        assertEquals(Type.BRASS, trumpet.getType());
    }

    @Test
    public void hasValveCount() {
        assertEquals(3, trumpet.getValveCount());
    }
}
