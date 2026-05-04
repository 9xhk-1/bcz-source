package l60;

import l60.k;
import okio.ByteString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "-SegmentedByteString")
@kotlin.jvm.internal.u0({"SMAP\nUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,185:1\n67#1:186\n73#1:187\n*S KotlinDebug\n*F\n+ 1 Util.kt\nokio/-SegmentedByteString\n*L\n105#1:186\n106#1:187\n*E\n"})
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final k.a f70408a = new k.a();

    /* renamed from: b, reason: collision with root package name */
    public static final int f70409b = -1234567890;

    public static final int a(byte b11, int i11) {
        return b11 & i11;
    }

    public static final long b(byte b11, long j11) {
        return b11 & j11;
    }

    public static final long c(int i11, long j11) {
        return i11 & j11;
    }

    public static final boolean d(@m80.k byte[] a11, int i11, @m80.k byte[] b11, int i12, int i13) {
        kotlin.jvm.internal.g0.p(a11, "a");
        kotlin.jvm.internal.g0.p(b11, "b");
        for (int i14 = 0; i14 < i13; i14++) {
            if (a11[i14 + i11] != b11[i14 + i12]) {
                return false;
            }
        }
        return true;
    }

    public static final void e(long j11, long j12, long j13) {
        if ((j12 | j13) < 0 || j12 > j11 || j11 - j12 < j13) {
            throw new ArrayIndexOutOfBoundsException("size=" + j11 + " offset=" + j12 + " byteCount=" + j13);
        }
    }

    public static final int f() {
        return f70409b;
    }

    @m80.k
    public static final k.a g() {
        return f70408a;
    }

    public static final int h(int i11, int i12) {
        return (i11 >>> (32 - i12)) | (i11 << i12);
    }

    public static final long i(int i11, long j11) {
        return Math.min(i11, j11);
    }

    public static final long j(long j11, int i11) {
        return Math.min(j11, i11);
    }

    public static final int k(@m80.k ByteString byteString, int i11) {
        kotlin.jvm.internal.g0.p(byteString, "<this>");
        return i11 == f70409b ? byteString.size() : i11;
    }

    public static final int l(@m80.k byte[] bArr, int i11) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        return i11 == f70409b ? bArr.length : i11;
    }

    @m80.k
    public static final k.a m(@m80.k k.a unsafeCursor) {
        kotlin.jvm.internal.g0.p(unsafeCursor, "unsafeCursor");
        return unsafeCursor == f70408a ? new k.a() : unsafeCursor;
    }

    public static final int n(int i11) {
        return ((i11 & 255) << 24) | (((-16777216) & i11) >>> 24) | ((16711680 & i11) >>> 8) | ((65280 & i11) << 8);
    }

    public static final long o(long j11) {
        return ((j11 & 255) << 56) | (((-72057594037927936L) & j11) >>> 56) | ((71776119061217280L & j11) >>> 40) | ((280375465082880L & j11) >>> 24) | ((1095216660480L & j11) >>> 8) | ((4278190080L & j11) << 8) | ((16711680 & j11) << 24) | ((65280 & j11) << 40);
    }

    public static final short p(short s11) {
        return (short) (((s11 & 255) << 8) | ((65280 & s11) >>> 8));
    }

    public static final long q(long j11, int i11) {
        return (j11 << (64 - i11)) | (j11 >>> i11);
    }

    public static final int r(byte b11, int i11) {
        return b11 << i11;
    }

    public static final int s(byte b11, int i11) {
        return b11 >> i11;
    }

    @m80.k
    public static final String t(byte b11) {
        return u30.f0.L1(new char[]{m60.c.G()[(b11 >> 4) & 15], m60.c.G()[b11 & 15]});
    }

    @m80.k
    public static final String u(int i11) {
        if (i11 == 0) {
            return "0";
        }
        int i12 = 0;
        char[] cArr = {m60.c.G()[(i11 >> 28) & 15], m60.c.G()[(i11 >> 24) & 15], m60.c.G()[(i11 >> 20) & 15], m60.c.G()[(i11 >> 16) & 15], m60.c.G()[(i11 >> 12) & 15], m60.c.G()[(i11 >> 8) & 15], m60.c.G()[(i11 >> 4) & 15], m60.c.G()[i11 & 15]};
        while (i12 < 8 && cArr[i12] == '0') {
            i12++;
        }
        return u30.f0.M1(cArr, i12, 8);
    }

    @m80.k
    public static final String v(long j11) {
        if (j11 == 0) {
            return "0";
        }
        int i11 = 0;
        char[] cArr = {m60.c.G()[(int) ((j11 >> 60) & 15)], m60.c.G()[(int) ((j11 >> 56) & 15)], m60.c.G()[(int) ((j11 >> 52) & 15)], m60.c.G()[(int) ((j11 >> 48) & 15)], m60.c.G()[(int) ((j11 >> 44) & 15)], m60.c.G()[(int) ((j11 >> 40) & 15)], m60.c.G()[(int) ((j11 >> 36) & 15)], m60.c.G()[(int) ((j11 >> 32) & 15)], m60.c.G()[(int) ((j11 >> 28) & 15)], m60.c.G()[(int) ((j11 >> 24) & 15)], m60.c.G()[(int) ((j11 >> 20) & 15)], m60.c.G()[(int) ((j11 >> 16) & 15)], m60.c.G()[(int) ((j11 >> 12) & 15)], m60.c.G()[(int) ((j11 >> 8) & 15)], m60.c.G()[(int) ((j11 >> 4) & 15)], m60.c.G()[(int) (j11 & 15)]};
        while (i11 < 16 && cArr[i11] == '0') {
            i11++;
        }
        return u30.f0.M1(cArr, i11, 16);
    }

    public static final byte w(byte b11, byte b12) {
        return (byte) (b11 ^ b12);
    }
}
