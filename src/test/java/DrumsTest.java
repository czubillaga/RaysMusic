import instruments.Drum;
import org.junit.Before;
import org.junit.Test;
import types.Type;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drum drum;

    @Before
    public void before() {
        drum = new Drum();
    }

    @Test
    public void canPlay() {
        assertEquals("drum_sample.mp4", drum.play());
    }

    @Test
    public void hasType() {
        assertEquals(Type.PERCUSSION, drum.getType());
    }
}
