package instruments;

import behaviors.IPlay;
import types.Type;

public class Guitar extends Instrument {

    private Type type;

    public Guitar() {
        super(Type.STRING, "guitar");
    }

}
