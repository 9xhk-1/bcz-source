package org.apache.thrift;

import java.io.ByteArrayOutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TByteArrayOutputStream extends ByteArrayOutputStream {
    private final int initialSize;

    public TByteArrayOutputStream(int i11) {
        super(i11);
        this.initialSize = i11;
    }

    public byte[] get() {
        return ((ByteArrayOutputStream) this).buf;
    }

    public int len() {
        return ((ByteArrayOutputStream) this).count;
    }

    @Override // java.io.ByteArrayOutputStream
    public void reset() {
        super.reset();
        int length = ((ByteArrayOutputStream) this).buf.length;
        int i11 = this.initialSize;
        if (length > i11) {
            ((ByteArrayOutputStream) this).buf = new byte[i11];
        }
    }

    public TByteArrayOutputStream() {
        this(32);
    }
}
