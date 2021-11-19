package instruments;

import types.Type;

public class Drum extends Instrument{

    private int pieceCount;

    public Drum() {
        super(Type.PERCUSSION, "drum");
        this.pieceCount = 4;
    }

    public int getPieceCount() {
        return pieceCount;
    }
}
