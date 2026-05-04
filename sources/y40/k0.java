package y40;

import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\n-Util.kt\nKotlin\n*S Kotlin\n*F\n+ 1 -Util.kt\nkotlinx/io/_UtilKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,184:1\n89#1:186\n95#1:187\n1#2:185\n*S KotlinDebug\n*F\n+ 1 -Util.kt\nkotlinx/io/_UtilKt\n*L\n114#1:186\n115#1:187\n*E\n"})
/* loaded from: classes8.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final char[] f99301a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', io.ktor.util.date.b.f62000f, 'e', 'f'};

    public static final int a(byte b11, int i11) {
        return b11 & i11;
    }

    public static final long b(byte b11, long j11) {
        return b11 & j11;
    }

    public static final long c(int i11, long j11) {
        return i11 & j11;
    }

    public static final void d(int i11, int i12, int i13) {
        e(i11, i12, i13);
    }

    public static final void e(long j11, long j12, long j13) {
        if (j12 < 0 || j13 > j11) {
            throw new IndexOutOfBoundsException("startIndex (" + j12 + ") and endIndex (" + j13 + ") are not within the range [0..size(" + j11 + dp.a.f48058d);
        }
        if (j12 <= j13) {
            return;
        }
        throw new IllegalArgumentException("startIndex (" + j12 + ") > endIndex (" + j13 + ')');
    }

    public static final void f(long j11) {
        if (j11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("byteCount (" + j11 + ") < 0").toString());
    }

    public static final void g(long j11, long j12, long j13) {
        if (j12 < 0 || j12 > j11 || j11 - j12 < j13 || j13 < 0) {
            throw new IllegalArgumentException("offset (" + j12 + ") and byteCount (" + j13 + ") are not within the range [0..size(" + j11 + dp.a.f48058d);
        }
    }

    @m80.k
    public static final char[] h() {
        return f99301a;
    }

    public static final int i(long j11) {
        if (j11 == 0) {
            return 1;
        }
        return (67 - Long.numberOfLeadingZeros(j11)) / 4;
    }

    public static final long j(int i11, long j11) {
        return Math.min(i11, j11);
    }

    public static final long k(long j11, int i11) {
        return Math.min(j11, i11);
    }

    public static final int l(int i11) {
        return ((i11 & 255) << 24) | (((-16777216) & i11) >>> 24) | ((16711680 & i11) >>> 8) | ((65280 & i11) << 8);
    }

    public static final long m(long j11) {
        return ((j11 & 255) << 56) | (((-72057594037927936L) & j11) >>> 56) | ((71776119061217280L & j11) >>> 40) | ((280375465082880L & j11) >>> 24) | ((1095216660480L & j11) >>> 8) | ((4278190080L & j11) << 8) | ((16711680 & j11) << 24) | ((65280 & j11) << 40);
    }

    public static final short n(short s11) {
        return (short) (((s11 & 255) << 8) | ((65280 & s11) >>> 8));
    }

    public static final int o(byte b11, int i11) {
        return b11 << i11;
    }

    public static final int p(byte b11, int i11) {
        return b11 >> i11;
    }

    @m80.k
    public static final String q(byte b11) {
        char[] cArr = f99301a;
        return u30.f0.L1(new char[]{cArr[(b11 >> 4) & 15], cArr[b11 & 15]});
    }

    @m80.k
    public static final String r(int i11) {
        if (i11 == 0) {
            return "0";
        }
        char[] cArr = f99301a;
        int i12 = 0;
        char[] cArr2 = {cArr[(i11 >> 28) & 15], cArr[(i11 >> 24) & 15], cArr[(i11 >> 20) & 15], cArr[(i11 >> 16) & 15], cArr[(i11 >> 12) & 15], cArr[(i11 >> 8) & 15], cArr[(i11 >> 4) & 15], cArr[i11 & 15]};
        while (i12 < 8 && cArr2[i12] == '0') {
            i12++;
        }
        return u30.f0.M1(cArr2, i12, 8);
    }

    @m80.k
    public static final String s(long j11) {
        if (j11 == 0) {
            return "0";
        }
        char[] cArr = f99301a;
        int i11 = 0;
        char[] cArr2 = {cArr[(int) ((j11 >> 60) & 15)], cArr[(int) ((j11 >> 56) & 15)], cArr[(int) ((j11 >> 52) & 15)], cArr[(int) ((j11 >> 48) & 15)], cArr[(int) ((j11 >> 44) & 15)], cArr[(int) ((j11 >> 40) & 15)], cArr[(int) ((j11 >> 36) & 15)], cArr[(int) ((j11 >> 32) & 15)], cArr[(int) ((j11 >> 28) & 15)], cArr[(int) ((j11 >> 24) & 15)], cArr[(int) ((j11 >> 20) & 15)], cArr[(int) ((j11 >> 16) & 15)], cArr[(int) ((j11 >> 12) & 15)], cArr[(int) ((j11 >> 8) & 15)], cArr[(int) ((j11 >> 4) & 15)], cArr[(int) (j11 & 15)]};
        while (i11 < 16 && cArr2[i11] == '0') {
            i11++;
        }
        return u30.f0.M1(cArr2, i11, 16);
    }

    public static final byte t(byte b11, byte b12) {
        return (byte) (b11 ^ b12);
    }
}
