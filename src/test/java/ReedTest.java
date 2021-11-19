import items.Reed;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class ReedTest {

    Reed reed;

    @Before
    public void before() {
        reed = new Reed();
    }

    @Test
    public void hasDescription() {
        assertEquals("Alto Saxophone Reed", reed.getDescription());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(new BigDecimal("21.30"), reed.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(new BigDecimal("30.59"), reed.getSellingPrice());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(new BigDecimal("9.29"), reed.calculateMarkup());
    }
}
