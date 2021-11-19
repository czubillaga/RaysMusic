package items;

import behaviors.ISell;
import instruments.Instrument;

import java.math.BigDecimal;

public abstract class Item implements ISell {
    private String description;
    private BigDecimal buyingPrice;
    private BigDecimal sellingPrice;

    public Item(String description, BigDecimal buyingPrice, BigDecimal sellingPrice) {
        this.description = description;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getDescription() {
        return this.description;
    }

    public BigDecimal getBuyingPrice() {
        return this.buyingPrice;
    }

    public BigDecimal getSellingPrice() {
        return this.sellingPrice;
    }

    public BigDecimal calculateMarkup() {
        return this.sellingPrice.subtract(this.buyingPrice);
    }
}
