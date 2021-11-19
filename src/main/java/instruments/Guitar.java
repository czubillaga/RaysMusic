package instruments;

import behaviors.IPlay;
import types.Type;

public class Guitar extends Instrument implements IPlay {

    private String sound;
    private Type type;

    public Guitar() {
        super(Type.STRING);
        this.sound = "guitar_sample.mp4";
    }
    public String play() {
        return this.sound;
    }
}
