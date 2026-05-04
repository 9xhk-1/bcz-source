package no;

import com.google.common.base.Preconditions;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@i
@go.a
/* loaded from: classes7.dex */
public final class q extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final o f75353a;

    public q(n hashFunction, InputStream in2) {
        super((InputStream) Preconditions.checkNotNull(in2));
        this.f75353a = (o) Preconditions.checkNotNull(hashFunction.i());
    }

    public m a() {
        return this.f75353a.h();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    @uo.a
    public int read() throws IOException {
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f75353a.a((byte) read);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new IOException("reset not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    @uo.a
    public int read(byte[] bytes, int off, int len) throws IOException {
        int read = ((FilterInputStream) this).in.read(bytes, off, len);
        if (read != -1) {
            this.f75353a.e(bytes, off, read);
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int readlimit) {
    }
}
