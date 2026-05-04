package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class q extends InputStream {

    /* renamed from: h, reason: collision with root package name */
    public static final int f41927h = 4096;

    /* renamed from: i, reason: collision with root package name */
    public static final int f41928i = 1024;

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f41929a;

    /* renamed from: b, reason: collision with root package name */
    public long f41930b;

    /* renamed from: c, reason: collision with root package name */
    public long f41931c;

    /* renamed from: d, reason: collision with root package name */
    public long f41932d;

    /* renamed from: e, reason: collision with root package name */
    public long f41933e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f41934f;

    /* renamed from: g, reason: collision with root package name */
    public int f41935g;

    public q(InputStream inputStream) {
        this(inputStream, 4096);
    }

    public void a(boolean z11) {
        this.f41934f = z11;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f41929a.available();
    }

    public void c(long j11) throws IOException {
        if (this.f41930b > this.f41932d || j11 < this.f41931c) {
            throw new IOException("Cannot reset");
        }
        this.f41929a.reset();
        i(this.f41931c, j11);
        this.f41930b = j11;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f41929a.close();
    }

    public long e(int i11) {
        long j11 = this.f41930b + i11;
        if (this.f41932d < j11) {
            f(j11);
        }
        return this.f41930b;
    }

    public final void f(long j11) {
        try {
            long j12 = this.f41931c;
            long j13 = this.f41930b;
            if (j12 >= j13 || j13 > this.f41932d) {
                this.f41931c = j13;
                this.f41929a.mark((int) (j11 - j13));
            } else {
                this.f41929a.reset();
                this.f41929a.mark((int) (j11 - this.f41931c));
                i(this.f41931c, this.f41930b);
            }
            this.f41932d = j11;
        } catch (IOException e11) {
            throw new IllegalStateException("Unable to mark: " + e11);
        }
    }

    public final void i(long j11, long j12) throws IOException {
        while (j11 < j12) {
            long skip = this.f41929a.skip(j12 - j11);
            if (skip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    skip = 1;
                }
            }
            j11 += skip;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i11) {
        this.f41933e = e(i11);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f41929a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!this.f41934f) {
            long j11 = this.f41930b + 1;
            long j12 = this.f41932d;
            if (j11 > j12) {
                f(j12 + this.f41935g);
            }
        }
        int read = this.f41929a.read();
        if (read != -1) {
            this.f41930b++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        c(this.f41933e);
    }

    @Override // java.io.InputStream
    public long skip(long j11) throws IOException {
        if (!this.f41934f) {
            long j12 = this.f41930b;
            if (j12 + j11 > this.f41932d) {
                f(j12 + j11 + this.f41935g);
            }
        }
        long skip = this.f41929a.skip(j11);
        this.f41930b += skip;
        return skip;
    }

    public q(InputStream inputStream, int i11) {
        this(inputStream, i11, 1024);
    }

    public q(InputStream inputStream, int i11, int i12) {
        this.f41933e = -1L;
        this.f41934f = true;
        this.f41935g = -1;
        this.f41929a = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, i11);
        this.f41935g = i12;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        if (!this.f41934f) {
            long j11 = this.f41930b;
            if (bArr.length + j11 > this.f41932d) {
                f(j11 + bArr.length + this.f41935g);
            }
        }
        int read = this.f41929a.read(bArr);
        if (read != -1) {
            this.f41930b += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        if (!this.f41934f) {
            long j11 = this.f41930b;
            long j12 = i12;
            if (j11 + j12 > this.f41932d) {
                f(j11 + j12 + this.f41935g);
            }
        }
        int read = this.f41929a.read(bArr, i11, i12);
        if (read != -1) {
            this.f41930b += read;
        }
        return read;
    }
}
