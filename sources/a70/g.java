package a70;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.ConnectionClosedException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class g extends InputStream {

    /* renamed from: e, reason: collision with root package name */
    public static final int f2241e = 2048;

    /* renamed from: a, reason: collision with root package name */
    public final long f2242a;

    /* renamed from: b, reason: collision with root package name */
    public long f2243b = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2244c = false;

    /* renamed from: d, reason: collision with root package name */
    public k70.h f2245d;

    public g(k70.h hVar, long j11) {
        this.f2245d = null;
        this.f2245d = (k70.h) e80.a.j(hVar, "Session input buffer");
        this.f2242a = e80.a.i(j11, "Content length");
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        k70.h hVar = this.f2245d;
        if (hVar instanceof k70.a) {
            return Math.min(((k70.a) hVar).length(), (int) (this.f2242a - this.f2243b));
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f2244c) {
            return;
        }
        try {
            if (this.f2243b < this.f2242a) {
                do {
                } while (read(new byte[2048]) >= 0);
            }
        } finally {
            this.f2244c = true;
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f2244c) {
            throw new IOException("Attempted read from closed stream.");
        }
        if (this.f2243b >= this.f2242a) {
            return -1;
        }
        int read = this.f2245d.read();
        if (read != -1) {
            this.f2243b++;
            return read;
        }
        if (this.f2243b >= this.f2242a) {
            return read;
        }
        throw new ConnectionClosedException("Premature end of Content-Length delimited message body (expected: %,d; received: %,d)", Long.valueOf(this.f2242a), Long.valueOf(this.f2243b));
    }

    @Override // java.io.InputStream
    public long skip(long j11) throws IOException {
        int read;
        if (j11 <= 0) {
            return 0L;
        }
        byte[] bArr = new byte[2048];
        long min = Math.min(j11, this.f2242a - this.f2243b);
        long j12 = 0;
        while (min > 0 && (read = read(bArr, 0, (int) Math.min(2048L, min))) != -1) {
            long j13 = read;
            j12 += j13;
            min -= j13;
        }
        return j12;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        if (!this.f2244c) {
            long j11 = this.f2243b;
            long j12 = this.f2242a;
            if (j11 >= j12) {
                return -1;
            }
            if (i12 + j11 > j12) {
                i12 = (int) (j12 - j11);
            }
            int read = this.f2245d.read(bArr, i11, i12);
            if (read == -1 && this.f2243b < this.f2242a) {
                throw new ConnectionClosedException("Premature end of Content-Length delimited message body (expected: %,d; received: %,d)", Long.valueOf(this.f2242a), Long.valueOf(this.f2243b));
            }
            if (read > 0) {
                this.f2243b += read;
            }
            return read;
        }
        throw new IOException("Attempted read from closed stream.");
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
