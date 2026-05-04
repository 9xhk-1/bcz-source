package org.apache.thrift.protocol;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class TMap {
    public final byte keyType;
    public final int size;
    public final byte valueType;

    public TMap() {
        this((byte) 0, (byte) 0, 0);
    }

    public TMap(byte b11, byte b12, int i11) {
        this.keyType = b11;
        this.valueType = b12;
        this.size = i11;
    }
}
