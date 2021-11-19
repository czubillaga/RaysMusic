package instruments;

import behaviors.IPlay;
import types.Type;

public class Guitar extends Instrument {

    private int stringCount;

    public Guitar() {
        super(Type.STRING, "guitar");
        this.stringCount = 6;
    }

    public int getStringCount() {
        return stringCount;
    }
}
