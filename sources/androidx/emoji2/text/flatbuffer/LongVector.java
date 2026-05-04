package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class LongVector extends BaseVector {
    public LongVector __assign(int i11, ByteBuffer byteBuffer) {
        __reset(i11, 8, byteBuffer);
        return this;
    }

    public long get(int i11) {
        return this.f4374bb.getLong(__element(i11));
    }
}
