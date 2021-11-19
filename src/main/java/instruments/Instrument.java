package instruments;

import behaviors.IPlay;
import behaviors.ISell;
import items.Item;
import types.Type;

import java.math.BigDecimal;

public abstract class Instrument extends Item implements IPlay, ISell {

    private Type type;
    private String string;

    public Instrument(Type type, String string, BigDecimal buyingPrice, BigDecimal sellingPrice) {
        super(string, buyingPrice, sellingPrice);
        this.type = type;
        this.string = string;
    }

    public Type getType() {
        return type;
    }

    public String play() {
        return this.stringify() + "_sample.mp4";
    }

    public String stringify() {
        return this.string;
    }
}
