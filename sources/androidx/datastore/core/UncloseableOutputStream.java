package androidx.datastore.core;

import java.io.FileOutputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class UncloseableOutputStream extends OutputStream {

    @k
    private final FileOutputStream fileOutputStream;

    public UncloseableOutputStream(@k FileOutputStream fileOutputStream) {
        g0.p(fileOutputStream, "fileOutputStream");
        this.fileOutputStream = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.fileOutputStream.flush();
    }

    @k
    public final FileOutputStream getFileOutputStream() {
        return this.fileOutputStream;
    }

    @Override // java.io.OutputStream
    public void write(int i11) {
        this.fileOutputStream.write(i11);
    }

    @Override // java.io.OutputStream
    public void write(@k byte[] b11) {
        g0.p(b11, "b");
        this.fileOutputStream.write(b11);
    }

    @Override // java.io.OutputStream
    public void write(@k byte[] bytes, int i11, int i12) {
        g0.p(bytes, "bytes");
        this.fileOutputStream.write(bytes, i11, i12);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
