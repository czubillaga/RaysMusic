import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;
import types.Type;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before() {
        saxophone = new Saxophone();
    }

    @Test
    public void canPlay() {
        assertEquals("saxophone_sample.mp4", saxophone.play());
    }

    @Test
    public void hasType() {
        assertEquals(Type.WOODWIND, saxophone.getType());
    }
}
