package com.baicizhan.framework.common.magicdialog;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public enum ButtonType {
    NONE(0),
    SINGLE_NEGATIVE(4),
    SINGLE_POSITIVE(1),
    DOUBLE(5),
    TRIPLE(7);

    private final int flag;

    ButtonType(int i11) {
        this.flag = i11;
    }

    public final int getFlag() {
        return this.flag;
    }
}
