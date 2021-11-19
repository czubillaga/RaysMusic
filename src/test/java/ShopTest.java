import instrument_tests.GuitarTest;
import instruments.Guitar;
import instruments.Piano;
import items.SongBook;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    SongBook songBook;
    Piano piano;

    @Before
    public void before() {
        shop = new Shop();
        guitar = new Guitar();
        songBook = new SongBook();
        piano = new Piano();
    }

    @Test
    public void canAddItemsToStock() {
        shop.addToStock(guitar);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canRemoveItemsFromStock() {
        shop.addToStock(guitar);
        shop.removeFromStock(guitar);
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canCalculatePotentialProfit() {
        shop.addToStock(piano);
        shop.addToStock(guitar);
        shop.addToStock(songBook);
        assertEquals(new BigDecimal("361.30"), shop.calculatePotentialProfit());
    }
}
