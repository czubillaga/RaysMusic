package instruments;

import behaviors.IPlay;
import types.Type;

import java.math.BigDecimal;

public class Guitar extends Instrument {

    private int stringCount;

    public Guitar() {
        super(Type.STRING, "guitar", new BigDecimal("213.24"), new BigDecimal("345.50"));
        this.stringCount = 6;
    }

    public int getStringCount() {
        return stringCount;
    }
}
