package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class BaseVector {

    /* renamed from: bb, reason: collision with root package name */
    protected ByteBuffer f4374bb;
    private int element_size;
    private int length;
    private int vector;

    public int __element(int i11) {
        return this.vector + (i11 * this.element_size);
    }

    public void __reset(int i11, int i12, ByteBuffer byteBuffer) {
        this.f4374bb = byteBuffer;
        if (byteBuffer != null) {
            this.vector = i11;
            this.length = byteBuffer.getInt(i11 - 4);
            this.element_size = i12;
        } else {
            this.vector = 0;
            this.length = 0;
            this.element_size = 0;
        }
    }

    public int __vector() {
        return this.vector;
    }

    public int length() {
        return this.length;
    }

    public void reset() {
        __reset(0, 0, null);
    }
}
