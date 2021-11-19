package instrument_tests;

import instruments.Piano;
import org.junit.Before;
import org.junit.Test;
import types.Type;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano();
    }

    @Test
    public void canPlay() {
        assertEquals("piano_sample.mp4", piano.play());
    }

    @Test
    public void hasType() {
        assertEquals(Type.KEYBOARD, piano.getType());
    }

    @Test
    public void hasKeyCount() {
        assertEquals(88, piano.getKeyCount());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(new BigDecimal("224.91"), piano.calculateMarkup());
    }
}
