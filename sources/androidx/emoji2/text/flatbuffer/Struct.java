package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class Struct {

    /* renamed from: bb, reason: collision with root package name */
    protected ByteBuffer f4379bb;
    protected int bb_pos;

    public void __reset(int i11, ByteBuffer byteBuffer) {
        this.f4379bb = byteBuffer;
        if (byteBuffer != null) {
            this.bb_pos = i11;
        } else {
            this.bb_pos = 0;
        }
    }

    public void __reset() {
        __reset(0, null);
    }
}
