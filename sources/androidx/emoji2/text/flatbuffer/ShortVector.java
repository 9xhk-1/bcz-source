package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import yz.c2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ShortVector extends BaseVector {
    public ShortVector __assign(int i11, ByteBuffer byteBuffer) {
        __reset(i11, 2, byteBuffer);
        return this;
    }

    public short get(int i11) {
        return this.f4374bb.getShort(__element(i11));
    }

    public int getAsUnsigned(int i11) {
        return get(i11) & c2.f100412d;
    }
}
