package instrument_tests;

import instruments.Drum;
import org.junit.Before;
import org.junit.Test;
import types.Type;

import java.math.BigDecimal;

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

    @Test
    public void hasPieceCount() {
        assertEquals(4, drum.getPieceCount());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(new BigDecimal("75.09"), drum.calculateMarkup());
    }
}
