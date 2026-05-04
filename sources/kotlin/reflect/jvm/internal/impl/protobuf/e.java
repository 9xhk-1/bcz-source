package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f67550a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f67551b;

    /* renamed from: c, reason: collision with root package name */
    public int f67552c;

    /* renamed from: d, reason: collision with root package name */
    public int f67553d;

    /* renamed from: e, reason: collision with root package name */
    public int f67554e;

    /* renamed from: f, reason: collision with root package name */
    public final InputStream f67555f;

    /* renamed from: g, reason: collision with root package name */
    public int f67556g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f67557h;

    /* renamed from: i, reason: collision with root package name */
    public int f67558i;

    /* renamed from: j, reason: collision with root package name */
    public int f67559j;

    /* renamed from: k, reason: collision with root package name */
    public int f67560k;

    /* renamed from: l, reason: collision with root package name */
    public int f67561l;

    /* renamed from: m, reason: collision with root package name */
    public int f67562m;

    /* renamed from: n, reason: collision with root package name */
    public a f67563n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void onRefill();
    }

    public e(InputStream inputStream) {
        this.f67557h = false;
        this.f67559j = Integer.MAX_VALUE;
        this.f67561l = 64;
        this.f67562m = 67108864;
        this.f67563n = null;
        this.f67550a = new byte[4096];
        this.f67552c = 0;
        this.f67554e = 0;
        this.f67558i = 0;
        this.f67555f = inputStream;
        this.f67551b = false;
    }

    public static int B(int i11, InputStream inputStream) throws IOException {
        if ((i11 & 128) == 0) {
            return i11;
        }
        int i12 = i11 & 127;
        int i13 = 7;
        while (i13 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            i12 |= (read & 127) << i13;
            if ((read & 128) == 0) {
                return i12;
            }
            i13 += 7;
        }
        while (i13 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if ((read2 & 128) == 0) {
                return i12;
            }
            i13 += 7;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public static int b(int i11) {
        return (-(i11 & 1)) ^ (i11 >>> 1);
    }

    public static long c(long j11) {
        return (-(j11 & 1)) ^ (j11 >>> 1);
    }

    public static e g(InputStream inputStream) {
        return new e(inputStream);
    }

    public static e h(m mVar) {
        e eVar = new e(mVar);
        try {
            eVar.j(mVar.size());
            return eVar;
        } catch (InvalidProtocolBufferException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public int A() throws IOException {
        int i11;
        int i12 = this.f67554e;
        int i13 = this.f67552c;
        if (i13 != i12) {
            byte[] bArr = this.f67550a;
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            if (b11 >= 0) {
                this.f67554e = i14;
                return b11;
            }
            if (i13 - i14 >= 9) {
                int i15 = i12 + 2;
                int i16 = (bArr[i14] << 7) ^ b11;
                long j11 = i16;
                if (j11 < 0) {
                    i11 = (int) ((-128) ^ j11);
                } else {
                    int i17 = i12 + 3;
                    int i18 = (bArr[i15] << 14) ^ i16;
                    long j12 = i18;
                    if (j12 >= 0) {
                        i11 = (int) (16256 ^ j12);
                    } else {
                        int i19 = i12 + 4;
                        long j13 = i18 ^ (bArr[i17] << ho.c.f59560y);
                        if (j13 < 0) {
                            i11 = (int) ((-2080896) ^ j13);
                        } else {
                            i17 = i12 + 5;
                            int i21 = (int) ((r1 ^ (r3 << 28)) ^ 266354560);
                            if (bArr[i19] < 0) {
                                i19 = i12 + 6;
                                if (bArr[i17] < 0) {
                                    i17 = i12 + 7;
                                    if (bArr[i19] < 0) {
                                        i19 = i12 + 8;
                                        if (bArr[i17] < 0) {
                                            i17 = i12 + 9;
                                            if (bArr[i19] < 0) {
                                                int i22 = i12 + 10;
                                                if (bArr[i17] >= 0) {
                                                    i15 = i22;
                                                    i11 = i21;
                                                }
                                            }
                                        }
                                    }
                                }
                                i11 = i21;
                            }
                            i11 = i21;
                        }
                        i15 = i19;
                    }
                    i15 = i17;
                }
                this.f67554e = i15;
                return i11;
            }
        }
        return (int) D();
    }

    public long C() throws IOException {
        long j11;
        long j12;
        long j13;
        int i11 = this.f67554e;
        int i12 = this.f67552c;
        if (i12 != i11) {
            byte[] bArr = this.f67550a;
            int i13 = i11 + 1;
            byte b11 = bArr[i11];
            if (b11 >= 0) {
                this.f67554e = i13;
                return b11;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                long j14 = (bArr[i13] << 7) ^ b11;
                if (j14 >= 0) {
                    int i15 = i11 + 3;
                    long j15 = j14 ^ (bArr[i14] << 14);
                    if (j15 >= 0) {
                        j13 = 16256;
                    } else {
                        i14 = i11 + 4;
                        j14 = j15 ^ (bArr[i15] << ho.c.f59560y);
                        if (j14 < 0) {
                            j12 = -2080896;
                        } else {
                            i15 = i11 + 5;
                            j15 = j14 ^ (bArr[i14] << 28);
                            if (j15 >= 0) {
                                j13 = 266354560;
                            } else {
                                i14 = i11 + 6;
                                j14 = j15 ^ (bArr[i15] << 35);
                                if (j14 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    i15 = i11 + 7;
                                    j15 = j14 ^ (bArr[i14] << 42);
                                    if (j15 >= 0) {
                                        j13 = 4363953127296L;
                                    } else {
                                        i14 = i11 + 8;
                                        j14 = j15 ^ (bArr[i15] << 49);
                                        if (j14 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            i15 = i11 + 9;
                                            long j16 = (j14 ^ (bArr[i14] << 56)) ^ 71499008037633920L;
                                            if (j16 >= 0) {
                                                j11 = j16;
                                                i14 = i15;
                                                this.f67554e = i14;
                                                return j11;
                                            }
                                            i14 = i11 + 10;
                                            if (bArr[i15] >= 0) {
                                                j11 = j16;
                                                this.f67554e = i14;
                                                return j11;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    j11 = j15 ^ j13;
                    i14 = i15;
                    this.f67554e = i14;
                    return j11;
                }
                j12 = -128;
                j11 = j14 ^ j12;
                this.f67554e = i14;
                return j11;
            }
        }
        return D();
    }

    public long D() throws IOException {
        long j11 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            j11 |= (r3 & Byte.MAX_VALUE) << i11;
            if ((w() & 128) == 0) {
                return j11;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public int E() throws IOException {
        return y();
    }

    public long F() throws IOException {
        return z();
    }

    public int G() throws IOException {
        return b(A());
    }

    public long H() throws IOException {
        return c(C());
    }

    public String I() throws IOException {
        int A = A();
        int i11 = this.f67552c;
        int i12 = this.f67554e;
        if (A > i11 - i12 || A <= 0) {
            return A == 0 ? "" : new String(x(A), "UTF-8");
        }
        String str = new String(this.f67550a, i12, A, "UTF-8");
        this.f67554e += A;
        return str;
    }

    public String J() throws IOException {
        byte[] x11;
        int A = A();
        int i11 = this.f67554e;
        if (A <= this.f67552c - i11 && A > 0) {
            x11 = this.f67550a;
            this.f67554e = i11 + A;
        } else {
            if (A == 0) {
                return "";
            }
            x11 = x(A);
            i11 = 0;
        }
        if (u.f(x11, i11, i11 + A)) {
            return new String(x11, i11, A, "UTF-8");
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    public int K() throws IOException {
        if (f()) {
            this.f67556g = 0;
            return 0;
        }
        int A = A();
        this.f67556g = A;
        if (WireFormat.a(A) != 0) {
            return this.f67556g;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    public int L() throws IOException {
        return A();
    }

    public long M() throws IOException {
        return C();
    }

    public final void N() {
        int i11 = this.f67552c + this.f67553d;
        this.f67552c = i11;
        int i12 = this.f67558i + i11;
        int i13 = this.f67559j;
        if (i12 <= i13) {
            this.f67553d = 0;
            return;
        }
        int i14 = i12 - i13;
        this.f67553d = i14;
        this.f67552c = i11 - i14;
    }

    public final void O(int i11) throws IOException {
        if (!T(i11)) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public boolean P(int i11, CodedOutputStream codedOutputStream) throws IOException {
        int b11 = WireFormat.b(i11);
        if (b11 == 0) {
            long t11 = t();
            codedOutputStream.o0(i11);
            codedOutputStream.z0(t11);
            return true;
        }
        if (b11 == 1) {
            long z11 = z();
            codedOutputStream.o0(i11);
            codedOutputStream.V(z11);
            return true;
        }
        if (b11 == 2) {
            d l11 = l();
            codedOutputStream.o0(i11);
            codedOutputStream.P(l11);
            return true;
        }
        if (b11 == 3) {
            codedOutputStream.o0(i11);
            Q(codedOutputStream);
            int c11 = WireFormat.c(WireFormat.a(i11), 4);
            a(c11);
            codedOutputStream.o0(c11);
            return true;
        }
        if (b11 == 4) {
            return false;
        }
        if (b11 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int y11 = y();
        codedOutputStream.o0(i11);
        codedOutputStream.U(y11);
        return true;
    }

    public void Q(CodedOutputStream codedOutputStream) throws IOException {
        int K;
        do {
            K = K();
            if (K == 0) {
                return;
            }
        } while (P(K, codedOutputStream));
    }

    public void R(int i11) throws IOException {
        int i12 = this.f67552c;
        int i13 = this.f67554e;
        if (i11 > i12 - i13 || i11 < 0) {
            S(i11);
        } else {
            this.f67554e = i13 + i11;
        }
    }

    public final void S(int i11) throws IOException {
        if (i11 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i12 = this.f67558i;
        int i13 = this.f67554e;
        int i14 = i12 + i13 + i11;
        int i15 = this.f67559j;
        if (i14 > i15) {
            R((i15 - i12) - i13);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i16 = this.f67552c;
        int i17 = i16 - i13;
        this.f67554e = i16;
        O(1);
        while (true) {
            int i18 = i11 - i17;
            int i19 = this.f67552c;
            if (i18 <= i19) {
                this.f67554e = i18;
                return;
            } else {
                i17 += i19;
                this.f67554e = i19;
                O(1);
            }
        }
    }

    public final boolean T(int i11) throws IOException {
        int i12 = this.f67554e;
        if (i12 + i11 <= this.f67552c) {
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("refillBuffer() called when ");
            sb2.append(i11);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
        if (this.f67558i + i12 + i11 > this.f67559j) {
            return false;
        }
        a aVar = this.f67563n;
        if (aVar != null) {
            aVar.onRefill();
        }
        if (this.f67555f != null) {
            int i13 = this.f67554e;
            if (i13 > 0) {
                int i14 = this.f67552c;
                if (i14 > i13) {
                    byte[] bArr = this.f67550a;
                    System.arraycopy(bArr, i13, bArr, 0, i14 - i13);
                }
                this.f67558i += i13;
                this.f67552c -= i13;
                this.f67554e = 0;
            }
            InputStream inputStream = this.f67555f;
            byte[] bArr2 = this.f67550a;
            int i15 = this.f67552c;
            int read = inputStream.read(bArr2, i15, bArr2.length - i15);
            if (read == 0 || read < -1 || read > this.f67550a.length) {
                StringBuilder sb3 = new StringBuilder(102);
                sb3.append("InputStream#read(byte[]) returned invalid result: ");
                sb3.append(read);
                sb3.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb3.toString());
            }
            if (read > 0) {
                this.f67552c += read;
                if ((this.f67558i + i11) - this.f67562m > 0) {
                    throw InvalidProtocolBufferException.sizeLimitExceeded();
                }
                N();
                if (this.f67552c >= i11) {
                    return true;
                }
                return T(i11);
            }
        }
        return false;
    }

    public void a(int i11) throws InvalidProtocolBufferException {
        if (this.f67556g != i11) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    public final void d(int i11) throws IOException {
        if (this.f67552c - this.f67554e < i11) {
            O(i11);
        }
    }

    public int e() {
        int i11 = this.f67559j;
        if (i11 == Integer.MAX_VALUE) {
            return -1;
        }
        return i11 - (this.f67558i + this.f67554e);
    }

    public boolean f() throws IOException {
        return this.f67554e == this.f67552c && !T(1);
    }

    public void i(int i11) {
        this.f67559j = i11;
        N();
    }

    public int j(int i11) throws InvalidProtocolBufferException {
        if (i11 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i12 = i11 + this.f67558i + this.f67554e;
        int i13 = this.f67559j;
        if (i12 > i13) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        this.f67559j = i12;
        N();
        return i13;
    }

    public boolean k() throws IOException {
        return C() != 0;
    }

    public d l() throws IOException {
        int A = A();
        int i11 = this.f67552c;
        int i12 = this.f67554e;
        if (A > i11 - i12 || A <= 0) {
            return A == 0 ? d.f67542a : new m(x(A));
        }
        d cVar = (this.f67551b && this.f67557h) ? new c(this.f67550a, this.f67554e, A) : d.g(this.f67550a, i12, A);
        this.f67554e += A;
        return cVar;
    }

    public double m() throws IOException {
        return Double.longBitsToDouble(z());
    }

    public int n() throws IOException {
        return A();
    }

    public int o() throws IOException {
        return y();
    }

    public long p() throws IOException {
        return z();
    }

    public float q() throws IOException {
        return Float.intBitsToFloat(y());
    }

    public void r(int i11, n.a aVar, f fVar) throws IOException {
        int i12 = this.f67560k;
        if (i12 >= this.f67561l) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        this.f67560k = i12 + 1;
        aVar.r(this, fVar);
        a(WireFormat.c(i11, 4));
        this.f67560k--;
    }

    public int s() throws IOException {
        return A();
    }

    public long t() throws IOException {
        return C();
    }

    public <T extends n> T u(p<T> pVar, f fVar) throws IOException {
        int A = A();
        if (this.f67560k >= this.f67561l) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int j11 = j(A);
        this.f67560k++;
        T d11 = pVar.d(this, fVar);
        a(0);
        this.f67560k--;
        i(j11);
        return d11;
    }

    public void v(n.a aVar, f fVar) throws IOException {
        int A = A();
        if (this.f67560k >= this.f67561l) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int j11 = j(A);
        this.f67560k++;
        aVar.r(this, fVar);
        a(0);
        this.f67560k--;
        i(j11);
    }

    public byte w() throws IOException {
        if (this.f67554e == this.f67552c) {
            O(1);
        }
        byte[] bArr = this.f67550a;
        int i11 = this.f67554e;
        this.f67554e = i11 + 1;
        return bArr[i11];
    }

    public final byte[] x(int i11) throws IOException {
        if (i11 <= 0) {
            if (i11 == 0) {
                return h.f67575a;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i12 = this.f67558i;
        int i13 = this.f67554e;
        int i14 = i12 + i13 + i11;
        int i15 = this.f67559j;
        if (i14 > i15) {
            R((i15 - i12) - i13);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        if (i11 < 4096) {
            byte[] bArr = new byte[i11];
            int i16 = this.f67552c - i13;
            System.arraycopy(this.f67550a, i13, bArr, 0, i16);
            this.f67554e = this.f67552c;
            int i17 = i11 - i16;
            d(i17);
            System.arraycopy(this.f67550a, 0, bArr, i16, i17);
            this.f67554e = i17;
            return bArr;
        }
        int i18 = this.f67552c;
        this.f67558i = i12 + i18;
        this.f67554e = 0;
        this.f67552c = 0;
        int i19 = i18 - i13;
        int i21 = i11 - i19;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i21 > 0) {
            int min = Math.min(i21, 4096);
            byte[] bArr2 = new byte[min];
            int i22 = 0;
            while (i22 < min) {
                InputStream inputStream = this.f67555f;
                int read = inputStream == null ? -1 : inputStream.read(bArr2, i22, min - i22);
                if (read == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f67558i += read;
                i22 += read;
            }
            i21 -= min;
            arrayList.add(bArr2);
        }
        byte[] bArr3 = new byte[i11];
        System.arraycopy(this.f67550a, i13, bArr3, 0, i19);
        for (byte[] bArr4 : arrayList) {
            System.arraycopy(bArr4, 0, bArr3, i19, bArr4.length);
            i19 += bArr4.length;
        }
        return bArr3;
    }

    public int y() throws IOException {
        int i11 = this.f67554e;
        if (this.f67552c - i11 < 4) {
            O(4);
            i11 = this.f67554e;
        }
        byte[] bArr = this.f67550a;
        this.f67554e = i11 + 4;
        return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
    }

    public long z() throws IOException {
        int i11 = this.f67554e;
        if (this.f67552c - i11 < 8) {
            O(8);
            i11 = this.f67554e;
        }
        byte[] bArr = this.f67550a;
        this.f67554e = i11 + 8;
        return ((bArr[i11 + 7] & 255) << 56) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48);
    }

    public e(m mVar) {
        this.f67557h = false;
        this.f67559j = Integer.MAX_VALUE;
        this.f67561l = 64;
        this.f67562m = 67108864;
        this.f67563n = null;
        this.f67550a = mVar.f67586c;
        int B = mVar.B();
        this.f67554e = B;
        this.f67552c = B + mVar.size();
        this.f67558i = -this.f67554e;
        this.f67555f = null;
        this.f67551b = true;
    }
}
