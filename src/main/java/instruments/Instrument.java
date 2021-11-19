package instruments;

import behaviors.IPlay;
import types.Type;

public abstract class Instrument implements IPlay {

    private Type type;
    private String string;

    public Instrument(Type type, String string) {
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
