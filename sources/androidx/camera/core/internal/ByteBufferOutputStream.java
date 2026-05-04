package androidx.camera.core.internal;

import androidx.annotation.NonNull;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ByteBufferOutputStream extends OutputStream {
    private final ByteBuffer mByteBuffer;

    public ByteBufferOutputStream(@NonNull ByteBuffer byteBuffer) {
        this.mByteBuffer = byteBuffer;
    }

    @Override // java.io.OutputStream
    public void write(int i11) throws IOException {
        if (!this.mByteBuffer.hasRemaining()) {
            throw new EOFException("Output ByteBuffer has no bytes remaining.");
        }
        this.mByteBuffer.put((byte) i11);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        int i13;
        bArr.getClass();
        if (i11 < 0 || i11 > bArr.length || i12 < 0 || (i13 = i11 + i12) > bArr.length || i13 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i12 == 0) {
            return;
        }
        if (this.mByteBuffer.remaining() >= i12) {
            this.mByteBuffer.put(bArr, i11, i12);
            return;
        }
        throw new EOFException("Output ByteBuffer has insufficient bytes remaining.");
    }
}
