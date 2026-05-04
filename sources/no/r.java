package no;

import com.google.common.base.Preconditions;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@i
@go.a
/* loaded from: classes7.dex */
public final class r extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final o f75354a;

    public r(n hashFunction, OutputStream out) {
        super((OutputStream) Preconditions.checkNotNull(out));
        this.f75354a = (o) Preconditions.checkNotNull(hashFunction.i());
    }

    public m a() {
        return this.f75354a.h();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int b11) throws IOException {
        this.f75354a.a((byte) b11);
        ((FilterOutputStream) this).out.write(b11);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bytes, int off, int len) throws IOException {
        this.f75354a.e(bytes, off, len);
        ((FilterOutputStream) this).out.write(bytes, off, len);
    }
}
