package a70;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.ConnectionClosedException;
import org.apache.http.HttpException;
import org.apache.http.MalformedChunkCodingException;
import org.apache.http.TruncatedChunkException;
import org.apache.http.util.CharArrayBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class e extends InputStream {

    /* renamed from: j, reason: collision with root package name */
    public static final int f2222j = 1;

    /* renamed from: k, reason: collision with root package name */
    public static final int f2223k = 2;

    /* renamed from: l, reason: collision with root package name */
    public static final int f2224l = 3;

    /* renamed from: m, reason: collision with root package name */
    public static final int f2225m = Integer.MAX_VALUE;

    /* renamed from: n, reason: collision with root package name */
    public static final int f2226n = 2048;

    /* renamed from: a, reason: collision with root package name */
    public final k70.h f2227a;

    /* renamed from: b, reason: collision with root package name */
    public final CharArrayBuffer f2228b;

    /* renamed from: c, reason: collision with root package name */
    public final v60.c f2229c;

    /* renamed from: d, reason: collision with root package name */
    public int f2230d;

    /* renamed from: e, reason: collision with root package name */
    public long f2231e;

    /* renamed from: f, reason: collision with root package name */
    public long f2232f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2233g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2234h;

    /* renamed from: i, reason: collision with root package name */
    public org.apache.http.e[] f2235i;

    public e(k70.h hVar, v60.c cVar) {
        this.f2233g = false;
        this.f2234h = false;
        this.f2235i = new org.apache.http.e[0];
        this.f2227a = (k70.h) e80.a.j(hVar, "Session input buffer");
        this.f2232f = 0L;
        this.f2228b = new CharArrayBuffer(16);
        this.f2229c = cVar == null ? v60.c.f93129c : cVar;
        this.f2230d = 1;
    }

    public final long a() throws IOException {
        int i11 = this.f2230d;
        if (i11 != 1) {
            if (i11 != 3) {
                throw new IllegalStateException("Inconsistent codec state");
            }
            this.f2228b.clear();
            if (this.f2227a.a(this.f2228b) == -1) {
                throw new MalformedChunkCodingException("CRLF expected at end of chunk");
            }
            if (!this.f2228b.isEmpty()) {
                throw new MalformedChunkCodingException("Unexpected content at the end of chunk");
            }
            this.f2230d = 1;
        }
        this.f2228b.clear();
        if (this.f2227a.a(this.f2228b) == -1) {
            throw new ConnectionClosedException("Premature end of chunk coded message body: closing chunk expected");
        }
        int indexOf = this.f2228b.indexOf(59);
        if (indexOf < 0) {
            indexOf = this.f2228b.length();
        }
        String substringTrimmed = this.f2228b.substringTrimmed(0, indexOf);
        try {
            return Long.parseLong(substringTrimmed, 16);
        } catch (NumberFormatException unused) {
            throw new MalformedChunkCodingException("Bad chunk header: " + substringTrimmed);
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.f2227a instanceof k70.a) {
            return (int) Math.min(((k70.a) r0).length(), this.f2231e - this.f2232f);
        }
        return 0;
    }

    public org.apache.http.e[] c() {
        return (org.apache.http.e[]) this.f2235i.clone();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f2234h) {
            return;
        }
        try {
            if (!this.f2233g && this.f2230d != Integer.MAX_VALUE) {
                do {
                } while (read(new byte[2048]) >= 0);
            }
        } finally {
            this.f2233g = true;
            this.f2234h = true;
        }
    }

    public final void e() throws IOException {
        if (this.f2230d == Integer.MAX_VALUE) {
            throw new MalformedChunkCodingException("Corrupt data stream");
        }
        try {
            long a11 = a();
            this.f2231e = a11;
            if (a11 < 0) {
                throw new MalformedChunkCodingException("Negative chunk size");
            }
            this.f2230d = 2;
            this.f2232f = 0L;
            if (a11 == 0) {
                this.f2233g = true;
                f();
            }
        } catch (MalformedChunkCodingException e11) {
            this.f2230d = Integer.MAX_VALUE;
            throw e11;
        }
    }

    public final void f() throws IOException {
        try {
            this.f2235i = a.c(this.f2227a, this.f2229c.d(), this.f2229c.e(), null);
        } catch (HttpException e11) {
            MalformedChunkCodingException malformedChunkCodingException = new MalformedChunkCodingException("Invalid footer: " + e11.getMessage());
            malformedChunkCodingException.initCause(e11);
            throw malformedChunkCodingException;
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f2234h) {
            throw new IOException("Attempted read from closed stream.");
        }
        if (this.f2233g) {
            return -1;
        }
        if (this.f2230d != 2) {
            e();
            if (this.f2233g) {
                return -1;
            }
        }
        int read = this.f2227a.read();
        if (read != -1) {
            long j11 = this.f2232f + 1;
            this.f2232f = j11;
            if (j11 >= this.f2231e) {
                this.f2230d = 3;
            }
        }
        return read;
    }

    public e(k70.h hVar) {
        this(hVar, null);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        if (!this.f2234h) {
            if (this.f2233g) {
                return -1;
            }
            if (this.f2230d != 2) {
                e();
                if (this.f2233g) {
                    return -1;
                }
            }
            int read = this.f2227a.read(bArr, i11, (int) Math.min(i12, this.f2231e - this.f2232f));
            if (read != -1) {
                long j11 = this.f2232f + read;
                this.f2232f = j11;
                if (j11 >= this.f2231e) {
                    this.f2230d = 3;
                }
                return read;
            }
            this.f2233g = true;
            throw new TruncatedChunkException("Truncated chunk (expected size: %,d; actual size: %,d)", Long.valueOf(this.f2231e), Long.valueOf(this.f2232f));
        }
        throw new IOException("Attempted read from closed stream.");
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
