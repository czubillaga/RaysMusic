package item_tests;

import items.GuitarStrings;
import items.SongBook;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class SongBookTest {

    SongBook songBook;

    @Before
    public void before() {
        songBook = new SongBook();
    }

    @Test
    public void hasDescription() {
        assertEquals("Beginner Guitar Songbook", songBook.getDescription());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(new BigDecimal("13.42"), songBook.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(new BigDecimal("17.55"), songBook.getSellingPrice());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(new BigDecimal("4.13"), songBook.calculateMarkup());
    }

}
