package instruments;

import behaviors.IPlay;
import types.Type;

import java.math.BigDecimal;

public class Trumpet extends Instrument {

    private int valveCount;

    public Trumpet() {
        super(Type.BRASS, "trumpet", new BigDecimal("305.21"), new BigDecimal("389.56"));
        this.valveCount = 3;
    }

    public int getValveCount() {
        return valveCount;
    }
}
