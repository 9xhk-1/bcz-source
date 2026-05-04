package po;

import com.google.common.base.Preconditions;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@q
/* loaded from: classes7.dex */
public final class o extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public long f81073a;

    /* renamed from: b, reason: collision with root package name */
    public long f81074b;

    public o(InputStream in2) {
        super((InputStream) Preconditions.checkNotNull(in2));
        this.f81074b = -1L;
    }

    public long a() {
        return this.f81073a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int readlimit) {
        ((FilterInputStream) this).in.mark(readlimit);
        this.f81074b = this.f81073a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f81073a++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f81074b == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f81073a = this.f81074b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long n11) throws IOException {
        long skip = ((FilterInputStream) this).in.skip(n11);
        this.f81073a += skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] b11, int off, int len) throws IOException {
        int read = ((FilterInputStream) this).in.read(b11, off, len);
        if (read != -1) {
            this.f81073a += read;
        }
        return read;
    }
}
