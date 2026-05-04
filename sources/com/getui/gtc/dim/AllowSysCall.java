package com.getui.gtc.dim;

/* loaded from: classes6.dex */
public enum AllowSysCall {
    NOT_ALLOW(0),
    ONLY_ALLOW_FORE_CALL(1),
    ALL_ALLOW(2);

    private final int value;

    AllowSysCall(int i11) {
        this.value = i11;
    }

    public static AllowSysCall valueOf(int i11) {
        return i11 != 0 ? i11 != 1 ? ALL_ALLOW : ONLY_ALLOW_FORE_CALL : NOT_ALLOW;
    }

    public final int getValue() {
        return this.value;
    }
}
