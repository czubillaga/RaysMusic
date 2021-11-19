package item_tests;

import items.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before() {
        guitarStrings = new GuitarStrings();
    }

    @Test
    public void hasDescription() {
        assertEquals("Guitar Strings", guitarStrings.getDescription());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(new BigDecimal("9.83"), guitarStrings.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(new BigDecimal("12.13"), guitarStrings.getSellingPrice());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(new BigDecimal("2.30"), guitarStrings.calculateMarkup());
    }
}
