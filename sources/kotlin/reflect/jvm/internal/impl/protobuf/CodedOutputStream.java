package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class CodedOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f67507a;

    /* renamed from: b, reason: collision with root package name */
    public final int f67508b;

    /* renamed from: e, reason: collision with root package name */
    public final OutputStream f67511e;

    /* renamed from: d, reason: collision with root package name */
    public int f67510d = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f67509c = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.f67511e = outputStream;
        this.f67507a = bArr;
        this.f67508b = bArr.length;
    }

    public static int A(int i11, long j11) {
        return D(i11) + B(j11);
    }

    public static int B(long j11) {
        return w(H(j11));
    }

    public static int C(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return v(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e11) {
            throw new RuntimeException("UTF-8 not supported.", e11);
        }
    }

    public static int D(int i11) {
        return v(WireFormat.c(i11, 0));
    }

    public static int E(int i11) {
        return v(i11);
    }

    public static int F(long j11) {
        return w(j11);
    }

    public static int G(int i11) {
        return (i11 >> 31) ^ (i11 << 1);
    }

    public static long H(long j11) {
        return (j11 >> 63) ^ (j11 << 1);
    }

    public static CodedOutputStream J(OutputStream outputStream, int i11) {
        return new CodedOutputStream(outputStream, new byte[i11]);
    }

    public static int a(int i11, boolean z11) {
        return D(i11) + b(z11);
    }

    public static int b(boolean z11) {
        return 1;
    }

    public static int c(byte[] bArr) {
        return v(bArr.length) + bArr.length;
    }

    public static int d(int i11, d dVar) {
        return D(i11) + e(dVar);
    }

    public static int e(d dVar) {
        return v(dVar.size()) + dVar.size();
    }

    public static int f(int i11, double d11) {
        return D(i11) + g(d11);
    }

    public static int g(double d11) {
        return 8;
    }

    public static int h(int i11, int i12) {
        return D(i11) + i(i12);
    }

    public static int i(int i11) {
        return p(i11);
    }

    public static int j(int i11) {
        return 4;
    }

    public static int k(long j11) {
        return 8;
    }

    public static int l(int i11, float f11) {
        return D(i11) + m(f11);
    }

    public static int m(float f11) {
        return 4;
    }

    public static int n(n nVar) {
        return nVar.getSerializedSize();
    }

    public static int o(int i11, int i12) {
        return D(i11) + p(i12);
    }

    public static int p(int i11) {
        if (i11 >= 0) {
            return v(i11);
        }
        return 10;
    }

    public static int q(long j11) {
        return w(j11);
    }

    public static int r(j jVar) {
        int b11 = jVar.b();
        return v(b11) + b11;
    }

    public static int s(int i11, n nVar) {
        return D(i11) + t(nVar);
    }

    public static int t(n nVar) {
        int serializedSize = nVar.getSerializedSize();
        return v(serializedSize) + serializedSize;
    }

    public static int u(int i11) {
        if (i11 > 4096) {
            return 4096;
        }
        return i11;
    }

    public static int v(int i11) {
        if ((i11 & com.alipay.sdk.m.n.a.f10855g) == 0) {
            return 1;
        }
        if ((i11 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i11) == 0) {
            return 3;
        }
        return (i11 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int w(long j11) {
        if (((-128) & j11) == 0) {
            return 1;
        }
        if (((-16384) & j11) == 0) {
            return 2;
        }
        if ((CoroutineScheduler.f68464x & j11) == 0) {
            return 3;
        }
        if (((-268435456) & j11) == 0) {
            return 4;
        }
        if (((-34359738368L) & j11) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j11) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j11) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j11) == 0) {
            return 8;
        }
        return (j11 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int x(int i11) {
        return 4;
    }

    public static int y(long j11) {
        return 8;
    }

    public static int z(int i11) {
        return v(G(i11));
    }

    public void I() throws IOException {
        if (this.f67511e != null) {
            K();
        }
    }

    public final void K() throws IOException {
        OutputStream outputStream = this.f67511e;
        if (outputStream == null) {
            throw new OutOfSpaceException();
        }
        outputStream.write(this.f67507a, 0, this.f67509c);
        this.f67509c = 0;
    }

    public void L(int i11, boolean z11) throws IOException {
        w0(i11, 0);
        M(z11);
    }

    public void M(boolean z11) throws IOException {
        h0(z11 ? 1 : 0);
    }

    public void N(byte[] bArr) throws IOException {
        o0(bArr.length);
        k0(bArr);
    }

    public void O(int i11, d dVar) throws IOException {
        w0(i11, 2);
        P(dVar);
    }

    public void P(d dVar) throws IOException {
        o0(dVar.size());
        i0(dVar);
    }

    public void Q(int i11, double d11) throws IOException {
        w0(i11, 1);
        R(d11);
    }

    public void R(double d11) throws IOException {
        n0(Double.doubleToRawLongBits(d11));
    }

    public void S(int i11, int i12) throws IOException {
        w0(i11, 0);
        T(i12);
    }

    public void T(int i11) throws IOException {
        b0(i11);
    }

    public void U(int i11) throws IOException {
        m0(i11);
    }

    public void V(long j11) throws IOException {
        n0(j11);
    }

    public void W(int i11, float f11) throws IOException {
        w0(i11, 5);
        X(f11);
    }

    public void X(float f11) throws IOException {
        m0(Float.floatToRawIntBits(f11));
    }

    public void Y(int i11, n nVar) throws IOException {
        w0(i11, 3);
        Z(nVar);
        w0(i11, 4);
    }

    public void Z(n nVar) throws IOException {
        nVar.writeTo(this);
    }

    public void a0(int i11, int i12) throws IOException {
        w0(i11, 0);
        b0(i12);
    }

    public void b0(int i11) throws IOException {
        if (i11 >= 0) {
            o0(i11);
        } else {
            p0(i11);
        }
    }

    public void c0(long j11) throws IOException {
        p0(j11);
    }

    public void d0(int i11, n nVar) throws IOException {
        w0(i11, 2);
        e0(nVar);
    }

    public void e0(n nVar) throws IOException {
        o0(nVar.getSerializedSize());
        nVar.writeTo(this);
    }

    public void f0(int i11, n nVar) throws IOException {
        w0(1, 3);
        x0(2, i11);
        d0(3, nVar);
        w0(1, 4);
    }

    public void g0(byte b11) throws IOException {
        if (this.f67509c == this.f67508b) {
            K();
        }
        byte[] bArr = this.f67507a;
        int i11 = this.f67509c;
        this.f67509c = i11 + 1;
        bArr[i11] = b11;
        this.f67510d++;
    }

    public void h0(int i11) throws IOException {
        g0((byte) i11);
    }

    public void i0(d dVar) throws IOException {
        j0(dVar, 0, dVar.size());
    }

    public void j0(d dVar, int i11, int i12) throws IOException {
        int i13 = this.f67508b;
        int i14 = this.f67509c;
        if (i13 - i14 >= i12) {
            dVar.j(this.f67507a, i11, i14, i12);
            this.f67509c += i12;
            this.f67510d += i12;
            return;
        }
        int i15 = i13 - i14;
        dVar.j(this.f67507a, i11, i14, i15);
        int i16 = i11 + i15;
        int i17 = i12 - i15;
        this.f67509c = this.f67508b;
        this.f67510d += i15;
        K();
        if (i17 <= this.f67508b) {
            dVar.j(this.f67507a, i16, 0, i17);
            this.f67509c = i17;
        } else {
            dVar.x(this.f67511e, i16, i17);
        }
        this.f67510d += i17;
    }

    public void k0(byte[] bArr) throws IOException {
        l0(bArr, 0, bArr.length);
    }

    public void l0(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = this.f67508b;
        int i14 = this.f67509c;
        if (i13 - i14 >= i12) {
            System.arraycopy(bArr, i11, this.f67507a, i14, i12);
            this.f67509c += i12;
            this.f67510d += i12;
            return;
        }
        int i15 = i13 - i14;
        System.arraycopy(bArr, i11, this.f67507a, i14, i15);
        int i16 = i11 + i15;
        int i17 = i12 - i15;
        this.f67509c = this.f67508b;
        this.f67510d += i15;
        K();
        if (i17 <= this.f67508b) {
            System.arraycopy(bArr, i16, this.f67507a, 0, i17);
            this.f67509c = i17;
        } else {
            this.f67511e.write(bArr, i16, i17);
        }
        this.f67510d += i17;
    }

    public void m0(int i11) throws IOException {
        h0(i11 & 255);
        h0((i11 >> 8) & 255);
        h0((i11 >> 16) & 255);
        h0((i11 >> 24) & 255);
    }

    public void n0(long j11) throws IOException {
        h0(((int) j11) & 255);
        h0(((int) (j11 >> 8)) & 255);
        h0(((int) (j11 >> 16)) & 255);
        h0(((int) (j11 >> 24)) & 255);
        h0(((int) (j11 >> 32)) & 255);
        h0(((int) (j11 >> 40)) & 255);
        h0(((int) (j11 >> 48)) & 255);
        h0(((int) (j11 >> 56)) & 255);
    }

    public void o0(int i11) throws IOException {
        while ((i11 & com.alipay.sdk.m.n.a.f10855g) != 0) {
            h0((i11 & 127) | 128);
            i11 >>>= 7;
        }
        h0(i11);
    }

    public void p0(long j11) throws IOException {
        while (((-128) & j11) != 0) {
            h0((((int) j11) & 127) | 128);
            j11 >>>= 7;
        }
        h0((int) j11);
    }

    public void q0(int i11) throws IOException {
        m0(i11);
    }

    public void r0(long j11) throws IOException {
        n0(j11);
    }

    public void s0(int i11) throws IOException {
        o0(G(i11));
    }

    public void t0(int i11, long j11) throws IOException {
        w0(i11, 0);
        u0(j11);
    }

    public void u0(long j11) throws IOException {
        p0(H(j11));
    }

    public void v0(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        o0(bytes.length);
        k0(bytes);
    }

    public void w0(int i11, int i12) throws IOException {
        o0(WireFormat.c(i11, i12));
    }

    public void x0(int i11, int i12) throws IOException {
        w0(i11, 0);
        y0(i12);
    }

    public void y0(int i11) throws IOException {
        o0(i11);
    }

    public void z0(long j11) throws IOException {
        p0(j11);
    }
}
