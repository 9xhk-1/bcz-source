package e00;

import kotlin.jvm.internal.g0;
import yz.c2;
import yz.d2;
import yz.p1;
import yz.t1;
import yz.x1;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class n {
    @y0(version = "1.5")
    public static final short a(short s11, short s12) {
        return g0.t(s11 & c2.f100412d, 65535 & s12) >= 0 ? s11 : s12;
    }

    @y0(version = "1.5")
    public static int b(int i11, int i12) {
        int compare;
        compare = Integer.compare(i11 ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE);
        return compare >= 0 ? i11 : i12;
    }

    @y0(version = "1.5")
    public static final byte c(byte b11, byte b12) {
        return g0.t(b11 & 255, b12 & 255) >= 0 ? b11 : b12;
    }

    @y0(version = "1.4")
    @kotlin.d
    public static final int d(int i11, @m80.k int... iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-other$0");
        int o11 = t1.o(iArr);
        for (int i12 = 0; i12 < o11; i12++) {
            i11 = b(i11, t1.m(iArr, i12));
        }
        return i11;
    }

    @y0(version = "1.4")
    @kotlin.d
    public static final long e(long j11, @m80.k long... jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-other$0");
        int o11 = x1.o(jArr);
        for (int i11 = 0; i11 < o11; i11++) {
            j11 = j(j11, x1.m(jArr, i11));
        }
        return j11;
    }

    @y0(version = "1.5")
    @o00.f
    public static final short f(short s11, short s12, short s13) {
        return a(s11, a(s12, s13));
    }

    @y0(version = "1.5")
    @o00.f
    public static final int g(int i11, int i12, int i13) {
        return b(i11, b(i12, i13));
    }

    @y0(version = "1.4")
    @kotlin.d
    public static final byte h(byte b11, @m80.k byte... bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-other$0");
        int o11 = p1.o(bArr);
        for (int i11 = 0; i11 < o11; i11++) {
            b11 = c(b11, p1.m(bArr, i11));
        }
        return b11;
    }

    @y0(version = "1.5")
    @o00.f
    public static final byte i(byte b11, byte b12, byte b13) {
        return c(b11, c(b12, b13));
    }

    @y0(version = "1.5")
    public static long j(long j11, long j12) {
        int compare;
        compare = Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE);
        return compare >= 0 ? j11 : j12;
    }

    @y0(version = "1.5")
    @o00.f
    public static final long k(long j11, long j12, long j13) {
        return j(j11, j(j12, j13));
    }

    @y0(version = "1.4")
    @kotlin.d
    public static final short l(short s11, @m80.k short... sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-other$0");
        int o11 = d2.o(sArr);
        for (int i11 = 0; i11 < o11; i11++) {
            s11 = a(s11, d2.m(sArr, i11));
        }
        return s11;
    }

    @y0(version = "1.5")
    public static final short m(short s11, short s12) {
        return g0.t(s11 & c2.f100412d, 65535 & s12) <= 0 ? s11 : s12;
    }

    @y0(version = "1.5")
    public static int n(int i11, int i12) {
        int compare;
        compare = Integer.compare(i11 ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE);
        return compare <= 0 ? i11 : i12;
    }

    @y0(version = "1.5")
    public static final byte o(byte b11, byte b12) {
        return g0.t(b11 & 255, b12 & 255) <= 0 ? b11 : b12;
    }

    @y0(version = "1.4")
    @kotlin.d
    public static final int p(int i11, @m80.k int... iArr) {
        g0.p(iArr, "$v$c$kotlin-UIntArray$-other$0");
        int o11 = t1.o(iArr);
        for (int i12 = 0; i12 < o11; i12++) {
            i11 = n(i11, t1.m(iArr, i12));
        }
        return i11;
    }

    @y0(version = "1.4")
    @kotlin.d
    public static final long q(long j11, @m80.k long... jArr) {
        g0.p(jArr, "$v$c$kotlin-ULongArray$-other$0");
        int o11 = x1.o(jArr);
        for (int i11 = 0; i11 < o11; i11++) {
            j11 = v(j11, x1.m(jArr, i11));
        }
        return j11;
    }

    @y0(version = "1.5")
    @o00.f
    public static final short r(short s11, short s12, short s13) {
        return m(s11, m(s12, s13));
    }

    @y0(version = "1.5")
    @o00.f
    public static final int s(int i11, int i12, int i13) {
        return n(i11, n(i12, i13));
    }

    @y0(version = "1.4")
    @kotlin.d
    public static final byte t(byte b11, @m80.k byte... bArr) {
        g0.p(bArr, "$v$c$kotlin-UByteArray$-other$0");
        int o11 = p1.o(bArr);
        for (int i11 = 0; i11 < o11; i11++) {
            b11 = o(b11, p1.m(bArr, i11));
        }
        return b11;
    }

    @y0(version = "1.5")
    @o00.f
    public static final byte u(byte b11, byte b12, byte b13) {
        return o(b11, o(b12, b13));
    }

    @y0(version = "1.5")
    public static long v(long j11, long j12) {
        int compare;
        compare = Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE);
        return compare <= 0 ? j11 : j12;
    }

    @y0(version = "1.5")
    @o00.f
    public static final long w(long j11, long j12, long j13) {
        return v(j11, v(j12, j13));
    }

    @y0(version = "1.4")
    @kotlin.d
    public static final short x(short s11, @m80.k short... sArr) {
        g0.p(sArr, "$v$c$kotlin-UShortArray$-other$0");
        int o11 = d2.o(sArr);
        for (int i11 = 0; i11 < o11; i11++) {
            s11 = m(s11, d2.m(sArr, i11));
        }
        return s11;
    }
}
