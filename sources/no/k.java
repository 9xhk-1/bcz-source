package no;

import com.google.common.base.Preconditions;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@i
/* loaded from: classes7.dex */
public final class k extends e {

    /* renamed from: a, reason: collision with root package name */
    public static final n f75321a = new k();

    /* renamed from: b, reason: collision with root package name */
    public static final long f75322b = -6505348102511208375L;

    /* renamed from: c, reason: collision with root package name */
    public static final long f75323c = -8261664234251669945L;

    /* renamed from: d, reason: collision with root package name */
    public static final long f75324d = -4288712594273399085L;

    /* renamed from: e, reason: collision with root package name */
    public static final long f75325e = -4132994306676758123L;

    @go.e
    public static long l(byte[] bytes, int offset, int length) {
        long p11 = length <= 32 ? p(bytes, offset, length, -1397348546323613475L) : length <= 64 ? o(bytes, offset, length) : m(bytes, offset, length);
        long j11 = f75322b;
        long b11 = length >= 8 ? v.b(bytes, offset) : -6505348102511208375L;
        if (length >= 9) {
            j11 = v.b(bytes, (offset + length) - 8);
        }
        long n11 = n(p11 + j11, b11);
        return (n11 == 0 || n11 == 1) ? n11 - 2 : n11;
    }

    public static long m(byte[] bytes, int offset, int length) {
        byte[] bArr = bytes;
        long b11 = v.b(bytes, offset);
        int i11 = offset + length;
        long b12 = v.b(bArr, i11 - 16) ^ f75323c;
        long b13 = f75322b ^ v.b(bArr, i11 - 56);
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long j11 = length;
        r(bArr, i11 - 64, j11, b12, jArr);
        r(bArr, i11 - 32, j11 * f75323c, f75322b, jArr2);
        long[] jArr3 = jArr2;
        long q11 = b13 + (q(jArr[1]) * f75323c);
        long rotateRight = Long.rotateRight(b11 + q11, 39) * f75323c;
        int i12 = (length - 1) & (-64);
        long rotateRight2 = Long.rotateRight(b12, 33) * f75323c;
        long j12 = rotateRight;
        int i13 = offset;
        while (true) {
            long rotateRight3 = Long.rotateRight(j12 + rotateRight2 + jArr[0] + v.b(bArr, i13 + 16), 37) * f75323c;
            long rotateRight4 = Long.rotateRight(rotateRight2 + jArr[1] + v.b(bArr, i13 + 48), 42) * f75323c;
            long j13 = jArr3[1] ^ rotateRight3;
            long j14 = rotateRight4 ^ jArr[0];
            long rotateRight5 = Long.rotateRight(jArr3[0] ^ q11, 33);
            r(bArr, i13, jArr[1] * f75323c, jArr3[0] + j13, jArr);
            int i14 = i13;
            long[] jArr4 = jArr3;
            rotateRight2 = j14;
            r(bytes, i14 + 32, jArr3[1] + rotateRight5, rotateRight2, jArr4);
            i13 = i14 + 64;
            i12 -= 64;
            if (i12 == 0) {
                return n(n(jArr[0], jArr4[0]) + (q(rotateRight2) * f75323c) + j13, n(jArr[1], jArr4[1]) + rotateRight5);
            }
            bArr = bytes;
            jArr3 = jArr4;
            j12 = rotateRight5;
            q11 = j13;
        }
    }

    @go.e
    public static long n(long high, long low) {
        long j11 = (low ^ high) * f75325e;
        long j12 = (high ^ (j11 ^ (j11 >>> 47))) * f75325e;
        return (j12 ^ (j12 >>> 47)) * f75325e;
    }

    private static long o(byte[] bytes, int offset, int length) {
        long b11 = v.b(bytes, offset + 24);
        int i11 = offset + length;
        int i12 = i11 - 16;
        long b12 = v.b(bytes, offset) + ((length + v.b(bytes, i12)) * f75322b);
        long rotateRight = Long.rotateRight(b12 + b11, 52);
        long rotateRight2 = Long.rotateRight(b12, 37);
        long b13 = b12 + v.b(bytes, offset + 8);
        long rotateRight3 = rotateRight2 + Long.rotateRight(b13, 7);
        int i13 = offset + 16;
        long b14 = b13 + v.b(bytes, i13);
        long j11 = b11 + b14;
        long rotateRight4 = rotateRight + Long.rotateRight(b14, 31) + rotateRight3;
        long b15 = v.b(bytes, i13) + v.b(bytes, i11 - 32);
        long b16 = v.b(bytes, i11 - 8);
        long rotateRight5 = Long.rotateRight(b15 + b16, 52);
        long rotateRight6 = Long.rotateRight(b15, 37);
        long b17 = b15 + v.b(bytes, i11 - 24);
        long rotateRight7 = rotateRight6 + Long.rotateRight(b17, 7);
        long b18 = b17 + v.b(bytes, i12);
        return q((q(((j11 + rotateRight5 + Long.rotateRight(b18, 31) + rotateRight7) * f75324d) + ((b16 + b18 + rotateRight4) * f75322b)) * f75322b) + rotateRight4) * f75324d;
    }

    @go.e
    public static long p(byte[] bytes, int offset, int length, long seed) {
        int i11 = length & (-8);
        int i12 = length & 7;
        long j11 = seed ^ (length * f75325e);
        for (int i13 = 0; i13 < i11; i13 += 8) {
            j11 = (j11 ^ (q(v.b(bytes, offset + i13) * f75325e) * f75325e)) * f75325e;
        }
        if (i12 != 0) {
            j11 = (v.c(bytes, offset + i11, i12) ^ j11) * f75325e;
        }
        return q(q(j11) * f75325e);
    }

    private static long q(long val) {
        return val ^ (val >>> 47);
    }

    private static void r(byte[] bytes, int offset, long seedA, long seedB, long[] output) {
        long b11 = v.b(bytes, offset);
        long b12 = v.b(bytes, offset + 8);
        long b13 = v.b(bytes, offset + 16);
        long b14 = v.b(bytes, offset + 24);
        long j11 = seedA + b11;
        long j12 = b12 + j11 + b13;
        long rotateRight = Long.rotateRight(seedB + j11 + b14, 51) + Long.rotateRight(j12, 23);
        output[0] = j12 + b14;
        output[1] = rotateRight + j11;
    }

    @Override // no.n
    public int h() {
        return 64;
    }

    @Override // no.e, no.c, no.n
    public m k(byte[] input, int off, int len) {
        Preconditions.checkPositionIndexes(off, off + len, input.length);
        return m.j(l(input, off, len));
    }

    public String toString() {
        return "Hashing.fingerprint2011()";
    }
}
