package com.getui.gtc.dim;

/* loaded from: classes6.dex */
public enum Caller {
    UNKNOWN(1),
    PUSH(2),
    GY(4),
    IDO(8),
    WUS(16),
    ONEID(32);

    public final int index;

    Caller(int i11) {
        this.index = i11;
    }

    public final boolean containAt(int i11) {
        return (i11 & this.index) != 0;
    }
}
