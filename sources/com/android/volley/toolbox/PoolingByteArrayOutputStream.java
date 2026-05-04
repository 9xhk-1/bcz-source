package com.android.volley.toolbox;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class PoolingByteArrayOutputStream extends ByteArrayOutputStream {
    private static final int DEFAULT_SIZE = 256;
    private final ByteArrayPool mPool;

    public PoolingByteArrayOutputStream(ByteArrayPool byteArrayPool) {
        this(byteArrayPool, 256);
    }

    private void expand(int i11) {
        int i12 = ((ByteArrayOutputStream) this).count;
        if (i12 + i11 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        byte[] buf = this.mPool.getBuf((i12 + i11) * 2);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, buf, 0, ((ByteArrayOutputStream) this).count);
        this.mPool.returnBuf(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = buf;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.mPool.returnBuf(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public void finalize() {
        this.mPool.returnBuf(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i11, int i12) {
        expand(i12);
        super.write(bArr, i11, i12);
    }

    public PoolingByteArrayOutputStream(ByteArrayPool byteArrayPool, int i11) {
        this.mPool = byteArrayPool;
        ((ByteArrayOutputStream) this).buf = byteArrayPool.getBuf(Math.max(i11, 256));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i11) {
        expand(1);
        super.write(i11);
    }
}
