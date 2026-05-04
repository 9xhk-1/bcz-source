package s00;

import a00.q;
import java.io.IOException;
import java.io.InputStream;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d
/* loaded from: classes8.dex */
public final class c extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InputStream f87072a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Base64 f87073b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f87074c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f87075d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final byte[] f87076e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final byte[] f87077f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final byte[] f87078g;

    /* renamed from: h, reason: collision with root package name */
    public int f87079h;

    /* renamed from: i, reason: collision with root package name */
    public int f87080i;

    public c(@k InputStream input, @k Base64 base64) {
        g0.p(input, "input");
        g0.p(base64, "base64");
        this.f87072a = input;
        this.f87073b = base64;
        this.f87076e = new byte[1];
        this.f87077f = new byte[1024];
        this.f87078g = new byte[1024];
    }

    public final void a(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = this.f87078g;
        int i13 = this.f87079h;
        q.v0(bArr2, bArr, i11, i13, i13 + i12);
        this.f87079h += i12;
        k();
    }

    public final int c(byte[] bArr, int i11, int i12, int i13) {
        int i14 = this.f87080i;
        this.f87080i = i14 + this.f87073b.p(this.f87077f, this.f87078g, i14, 0, i13);
        int min = Math.min(e(), i12 - i11);
        a(bArr, i11, min);
        q();
        return min;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f87074c) {
            return;
        }
        this.f87074c = true;
        this.f87072a.close();
    }

    public final int e() {
        return this.f87080i - this.f87079h;
    }

    public final int f(int i11) {
        this.f87077f[i11] = 61;
        if ((i11 & 3) != 2) {
            return i11 + 1;
        }
        int j11 = j();
        if (j11 >= 0) {
            this.f87077f[i11 + 1] = (byte) j11;
        }
        return i11 + 2;
    }

    public final int j() {
        int read;
        if (!this.f87073b.H()) {
            return this.f87072a.read();
        }
        do {
            read = this.f87072a.read();
            if (read == -1) {
                break;
            }
        } while (!b.e(read));
        return read;
    }

    public final void k() {
        if (this.f87079h == this.f87080i) {
            this.f87079h = 0;
            this.f87080i = 0;
        }
    }

    public final void q() {
        byte[] bArr = this.f87078g;
        int length = bArr.length;
        int i11 = this.f87080i;
        if ((this.f87077f.length / 4) * 3 > length - i11) {
            q.v0(bArr, bArr, 0, this.f87079h, i11);
            this.f87080i -= this.f87079h;
            this.f87079h = 0;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        int i11 = this.f87079h;
        if (i11 < this.f87080i) {
            int i12 = this.f87078g[i11] & 255;
            this.f87079h = i11 + 1;
            k();
            return i12;
        }
        int read = read(this.f87076e, 0, 1);
        if (read == -1) {
            return -1;
        }
        if (read == 1) {
            return this.f87076e[0] & 255;
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.io.InputStream
    public int read(@k byte[] destination, int i11, int i12) {
        int i13;
        boolean z11;
        boolean z12;
        g0.p(destination, "destination");
        if (i11 >= 0 && i12 >= 0 && (i13 = i11 + i12) <= destination.length) {
            if (!this.f87074c) {
                if (this.f87075d) {
                    return -1;
                }
                if (i12 == 0) {
                    return 0;
                }
                if (e() >= i12) {
                    a(destination, i11, i12);
                    return i12;
                }
                int e11 = (((i12 - e()) + 2) / 3) * 4;
                int i14 = i11;
                while (true) {
                    z11 = this.f87075d;
                    if (z11 || e11 <= 0) {
                        break;
                    }
                    int min = Math.min(this.f87077f.length, e11);
                    int i15 = 0;
                    while (true) {
                        z12 = this.f87075d;
                        if (z12 || i15 >= min) {
                            break;
                        }
                        int j11 = j();
                        if (j11 == -1) {
                            this.f87075d = true;
                        } else if (j11 != 61) {
                            this.f87077f[i15] = (byte) j11;
                            i15++;
                        } else {
                            i15 = f(i15);
                            this.f87075d = true;
                        }
                    }
                    if (!z12 && i15 != min) {
                        throw new IllegalStateException("Check failed.");
                    }
                    e11 -= i15;
                    i14 += c(destination, i14, i13, i15);
                }
                if (i14 == i11 && z11) {
                    return -1;
                }
                return i14 - i11;
            }
            throw new IOException("The input stream is closed.");
        }
        throw new IndexOutOfBoundsException("offset: " + i11 + ", length: " + i12 + ", buffer size: " + destination.length);
    }
}
