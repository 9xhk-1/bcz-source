package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class ByteBufferUtil {
    public static int getSizePrefix(ByteBuffer byteBuffer) {
        return byteBuffer.getInt(byteBuffer.position());
    }

    public static ByteBuffer removeSizePrefix(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(duplicate.position() + 4);
        return duplicate;
    }
}
