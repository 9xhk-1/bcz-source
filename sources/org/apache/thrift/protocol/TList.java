package org.apache.thrift.protocol;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class TList {
    public final byte elemType;
    public final int size;

    public TList() {
        this((byte) 0, 0);
    }

    public TList(byte b11, int i11) {
        this.elemType = b11;
        this.size = i11;
    }
}
