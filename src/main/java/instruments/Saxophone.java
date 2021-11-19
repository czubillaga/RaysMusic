package instruments;

import types.Type;

import java.math.BigDecimal;

public class Saxophone extends Instrument{

    private int keyCount;

    public Saxophone() {
        super(Type.WOODWIND, "saxophone", new BigDecimal("150.23"), new BigDecimal("203.15"));
        this.keyCount = 22;
    }

    public int getKeyCount() {
        return keyCount;
    }
}
