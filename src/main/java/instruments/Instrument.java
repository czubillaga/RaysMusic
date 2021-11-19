package instruments;

import behaviors.IPlay;
import types.Type;

public abstract class Instrument implements IPlay {

    private Type type;

    public Instrument(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }
}
