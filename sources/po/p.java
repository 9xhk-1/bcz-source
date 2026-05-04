package po;

import com.google.common.base.Preconditions;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@q
/* loaded from: classes7.dex */
public final class p extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public long f81075a;

    public p(OutputStream out) {
        super((OutputStream) Preconditions.checkNotNull(out));
    }

    public long a() {
        return this.f81075a;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] b11, int off, int len) throws IOException {
        ((FilterOutputStream) this).out.write(b11, off, len);
        this.f81075a += len;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int b11) throws IOException {
        ((FilterOutputStream) this).out.write(b11);
        this.f81075a++;
    }
}
