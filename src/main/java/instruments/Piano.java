package instruments;

import behaviors.IPlay;
import types.Type;

import java.math.BigDecimal;

public class Piano extends Instrument {

    private int keyCount;

    public Piano() {
        super(Type.KEYBOARD, "piano", new BigDecimal("780.29"), new BigDecimal("1005.20"));
        this.keyCount = 88;
    }

    public int getKeyCount() {
        return keyCount;
    }
}
