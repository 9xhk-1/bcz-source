package kotlin.io.encoding;

import a00.q;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.g0;
import m80.k;
import s00.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d
/* loaded from: classes8.dex */
public final class a extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final OutputStream f66953a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Base64 f66954b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f66955c;

    /* renamed from: d, reason: collision with root package name */
    public int f66956d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final byte[] f66957e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final byte[] f66958f;

    /* renamed from: g, reason: collision with root package name */
    public int f66959g;

    public a(@k OutputStream output, @k Base64 base64) {
        g0.p(output, "output");
        g0.p(base64, "base64");
        this.f66953a = output;
        this.f66954b = base64;
        this.f66956d = base64.H() ? base64.E() : -1;
        this.f66957e = new byte[1024];
        this.f66958f = new byte[3];
    }

    public final void a() {
        if (this.f66955c) {
            throw new IOException("The output stream is closed.");
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f66955c) {
            return;
        }
        this.f66955c = true;
        if (this.f66959g != 0) {
            f();
        }
        this.f66953a.close();
    }

    public final int e(byte[] bArr, int i11, int i12) {
        int min = Math.min(3 - this.f66959g, i12 - i11);
        q.v0(bArr, this.f66958f, this.f66959g, i11, i11 + min);
        int i13 = this.f66959g + min;
        this.f66959g = i13;
        if (i13 == 3) {
            f();
        }
        return min;
    }

    public final void f() {
        if (i(this.f66958f, 0, this.f66959g) != 4) {
            throw new IllegalStateException("Check failed.");
        }
        this.f66959g = 0;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        a();
        this.f66953a.flush();
    }

    public final int i(byte[] bArr, int i11, int i12) {
        int v11 = this.f66954b.v(bArr, this.f66957e, 0, i11, i12);
        if (this.f66956d == 0) {
            this.f66953a.write(Base64.f66936f.N());
            this.f66956d = this.f66954b.E();
            if (v11 > this.f66954b.E()) {
                throw new IllegalStateException("Check failed.");
            }
        }
        this.f66953a.write(this.f66957e, 0, v11);
        this.f66956d -= v11;
        return v11;
    }

    @Override // java.io.OutputStream
    public void write(int i11) {
        a();
        byte[] bArr = this.f66958f;
        int i12 = this.f66959g;
        int i13 = i12 + 1;
        this.f66959g = i13;
        bArr[i12] = (byte) i11;
        if (i13 == 3) {
            f();
        }
    }

    @Override // java.io.OutputStream
    public void write(@k byte[] source, int i11, int i12) {
        int i13;
        g0.p(source, "source");
        a();
        if (i11 < 0 || i12 < 0 || (i13 = i11 + i12) > source.length) {
            throw new IndexOutOfBoundsException("offset: " + i11 + ", length: " + i12 + ", source size: " + source.length);
        }
        if (i12 == 0) {
            return;
        }
        int i14 = this.f66959g;
        if (i14 < 3) {
            if (i14 != 0) {
                i11 += e(source, i11, i13);
                if (this.f66959g != 0) {
                    return;
                }
            }
            while (i11 + 3 <= i13) {
                int min = Math.min((this.f66954b.H() ? this.f66956d : this.f66957e.length) / 4, (i13 - i11) / 3);
                int i15 = (min * 3) + i11;
                if (i(source, i11, i15) != min * 4) {
                    throw new IllegalStateException("Check failed.");
                }
                i11 = i15;
            }
            q.v0(source, this.f66958f, 0, i11, i13);
            this.f66959g = i13 - i11;
            return;
        }
        throw new IllegalStateException("Check failed.");
    }
}
