package instruments;

import behaviors.IPlay;
import types.Type;

public class Trumpet extends Instrument implements IPlay {

    private String sound;

    public Trumpet() {
        super(Type.BRASS);
        this.sound = "trumpet_sample.mp4";
    }

    @Override
    public String play() {
        return this.sound;
    }
}
