package instruments;

import behaviors.IPlay;
import types.Type;

public class Piano extends Instrument {

    private int keyCount;

    public Piano() {
        super(Type.KEYBOARD, "piano");
        this.keyCount = 88;
    }

    public int getKeyCount() {
        return keyCount;
    }
}
