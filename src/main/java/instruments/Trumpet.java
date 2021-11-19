package instruments;

import behaviors.IPlay;
import types.Type;

public class Trumpet extends Instrument {

    private int valveCount;

    public Trumpet() {
        super(Type.BRASS, "trumpet");
        this.valveCount = 3;
    }

    public int getValveCount() {
        return valveCount;
    }
}
