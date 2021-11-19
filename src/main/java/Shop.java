import behaviors.ISell;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public void addToStock(ISell item) {
        this.stock.add(item);
    }

    public int getStockCount() {
        return this.stock.size();
    }

    public void removeFromStock(ISell item) {
        this.stock.remove(item);
    }

    public BigDecimal calculatePotentialProfit() {
        BigDecimal potentialProfit = new BigDecimal("0");
        for(ISell item: this.stock) {
            potentialProfit = potentialProfit.add(item.calculateMarkup());
        }
        return potentialProfit;
    }
}
