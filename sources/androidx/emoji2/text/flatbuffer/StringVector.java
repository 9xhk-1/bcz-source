package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class StringVector extends BaseVector {
    private Utf8 utf8 = Utf8.getDefault();

    public StringVector __assign(int i11, int i12, ByteBuffer byteBuffer) {
        __reset(i11, i12, byteBuffer);
        return this;
    }

    public String get(int i11) {
        return Table.__string(__element(i11), this.f4374bb, this.utf8);
    }
}
