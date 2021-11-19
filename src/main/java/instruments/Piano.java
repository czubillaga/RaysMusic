package instruments;

import behaviors.IPlay;
import types.Type;

public class Piano extends Instrument implements IPlay {

    private String sound;

    public Piano() {
        super(Type.KEYBOARD);
        this.sound = "piano_sample.mp4";
    }
    public String play() {
        return this.sound;
    }
}
