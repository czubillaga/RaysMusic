import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;
import types.Type;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar();
    }

    @Test
    public void canPlay() {
        assertEquals("guitar_sample.mp4", guitar.play());
    }

    @Test
    public void hasType() {
        assertEquals(Type.STRING, guitar.getType());
    }

    @Test
    public void hasStringCount() {
        assertEquals(6, guitar.getStringCount());
    }
}
