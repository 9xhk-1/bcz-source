package jz;

import io.ktor.utils.io.core.ByteOrder;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f {
    public static final ByteOrder b(java.nio.ByteOrder byteOrder) {
        return byteOrder == java.nio.ByteOrder.BIG_ENDIAN ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN;
    }
}
