package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ByteVector extends BaseVector {
    public ByteVector __assign(int i11, ByteBuffer byteBuffer) {
        __reset(i11, 1, byteBuffer);
        return this;
    }

    public byte get(int i11) {
        return this.f4374bb.get(__element(i11));
    }

    public int getAsUnsigned(int i11) {
        return get(i11) & 255;
    }
}
