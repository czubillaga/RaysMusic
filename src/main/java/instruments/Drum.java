package instruments;

import types.Type;

import java.math.BigDecimal;

public class Drum extends Instrument{

    private int pieceCount;

    public Drum() {
        super(Type.PERCUSSION, "drum", new BigDecimal("430.21"), new BigDecimal("505.30"));
        this.pieceCount = 4;
    }

    public int getPieceCount() {
        return pieceCount;
    }

}
