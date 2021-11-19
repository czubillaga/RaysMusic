package instruments;

import types.Type;

public class Saxophone extends Instrument{

    private int keyCount;

    public Saxophone() {
        super(Type.WOODWIND, "saxophone");
        this.keyCount = 22;
    }

    public int getKeyCount() {
        return keyCount;
    }
}
