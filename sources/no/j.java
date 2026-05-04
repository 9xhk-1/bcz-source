package no;

import com.google.common.base.Preconditions;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@i
/* loaded from: classes7.dex */
public final class j extends e {

    /* renamed from: a, reason: collision with root package name */
    public static final n f75317a = new j();

    /* renamed from: b, reason: collision with root package name */
    public static final long f75318b = -4348849565147123417L;

    /* renamed from: c, reason: collision with root package name */
    public static final long f75319c = -5435081209227447693L;

    /* renamed from: d, reason: collision with root package name */
    public static final long f75320d = -7286425919675154353L;

    @go.e
    public static long l(byte[] bytes, int offset, int length) {
        return length <= 32 ? length <= 16 ? m(bytes, offset, length) : o(bytes, offset, length) : length <= 64 ? p(bytes, offset, length) : q(bytes, offset, length);
    }

    public static long m(byte[] bytes, int offset, int length) {
        if (length >= 8) {
            long j11 = (length * 2) + f75320d;
            long b11 = v.b(bytes, offset) + f75320d;
            long b12 = v.b(bytes, (offset + length) - 8);
            return n((Long.rotateRight(b12, 37) * j11) + b11, (Long.rotateRight(b11, 25) + b12) * j11, j11);
        }
        if (length >= 4) {
            return n(length + ((v.a(bytes, offset) & 4294967295L) << 3), v.a(bytes, (offset + length) - 4) & 4294967295L, (length * 2) + f75320d);
        }
        if (length <= 0) {
            return f75320d;
        }
        return r((((bytes[offset] & 255) + ((bytes[(length >> 1) + offset] & 255) << 8)) * f75320d) ^ ((length + ((bytes[offset + (length - 1)] & 255) << 2)) * f75318b)) * f75320d;
    }

    public static long n(long u11, long v11, long mul) {
        long j11 = (u11 ^ v11) * mul;
        long j12 = ((j11 ^ (j11 >>> 47)) ^ v11) * mul;
        return (j12 ^ (j12 >>> 47)) * mul;
    }

    public static long o(byte[] bytes, int offset, int length) {
        long j11 = (length * 2) + f75320d;
        long b11 = v.b(bytes, offset) * f75319c;
        long b12 = v.b(bytes, offset + 8);
        int i11 = offset + length;
        long b13 = v.b(bytes, i11 - 8) * j11;
        return n(Long.rotateRight(b11 + b12, 43) + Long.rotateRight(b13, 30) + (v.b(bytes, i11 - 16) * f75320d), b13 + b11 + Long.rotateRight(b12 + f75320d, 18), j11);
    }

    public static long p(byte[] bytes, int offset, int length) {
        long j11 = (length * 2) + f75320d;
        long b11 = v.b(bytes, offset) * f75320d;
        long b12 = v.b(bytes, offset + 8);
        int i11 = offset + length;
        long b13 = v.b(bytes, i11 - 8) * j11;
        long rotateRight = Long.rotateRight(b11 + b12, 43) + Long.rotateRight(b13, 30) + (v.b(bytes, i11 - 16) * f75320d);
        long n11 = n(rotateRight, b13 + Long.rotateRight(b12 + f75320d, 18) + b11, j11);
        long b14 = v.b(bytes, offset + 16) * j11;
        long b15 = v.b(bytes, offset + 24);
        long b16 = (rotateRight + v.b(bytes, i11 - 32)) * j11;
        return n(Long.rotateRight(b14 + b15, 43) + Long.rotateRight(b16, 30) + ((n11 + v.b(bytes, i11 - 24)) * j11), b14 + Long.rotateRight(b11 + b15, 18) + b16, j11);
    }

    public static long q(byte[] bytes, int offset, int length) {
        byte[] bArr = bytes;
        long j11 = 81;
        long j12 = f75319c;
        long j13 = (j11 * f75319c) + 113;
        long r11 = r((j13 * f75320d) + 113) * f75320d;
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        char c11 = 1;
        int i11 = length - 1;
        int i12 = offset + ((i11 / 64) * 64);
        int i13 = i11 & 63;
        int i14 = i12 + i13;
        int i15 = i14 - 63;
        long j14 = j13;
        long b11 = (j11 * f75320d) + v.b(bytes, offset);
        int i16 = offset;
        while (true) {
            long j15 = j12;
            long rotateRight = Long.rotateRight(b11 + j14 + jArr[0] + v.b(bArr, i16 + 8), 37) * j15;
            long rotateRight2 = Long.rotateRight(j14 + jArr[c11] + v.b(bArr, i16 + 48), 42) * j15;
            long j16 = rotateRight ^ jArr2[c11];
            char c12 = c11;
            long b12 = rotateRight2 + jArr[0] + v.b(bArr, i16 + 40);
            long rotateRight3 = Long.rotateRight(r11 + jArr2[0], 33) * j15;
            s(bArr, i16, jArr[c12] * j15, j16 + jArr2[0], jArr);
            int i17 = i16;
            long[] jArr3 = jArr;
            s(bArr, i17 + 32, jArr2[c12] + rotateRight3, b12 + v.b(bArr, i17 + 16), jArr2);
            i16 = i17 + 64;
            if (i16 == i12) {
                long j17 = ((j16 & 255) << c12) + j15;
                long j18 = jArr2[0] + i13;
                jArr2[0] = j18;
                long j19 = jArr3[0] + j18;
                jArr3[0] = j19;
                jArr2[0] = jArr2[0] + j19;
                long rotateRight4 = Long.rotateRight(rotateRight3 + b12 + jArr3[0] + v.b(bArr, i14 - 55), 37) * j17;
                long rotateRight5 = Long.rotateRight(b12 + jArr3[c12] + v.b(bArr, i14 - 15), 42) * j17;
                long j21 = rotateRight4 ^ (jArr2[c12] * 9);
                long b13 = rotateRight5 + (jArr3[0] * 9) + v.b(bArr, i14 - 23);
                long rotateRight6 = Long.rotateRight(j16 + jArr2[0], 33) * j17;
                s(bArr, i15, jArr3[c12] * j17, jArr2[0] + j21, jArr3);
                s(bArr, i14 - 31, jArr2[c12] + rotateRight6, v.b(bArr, i14 - 47) + b13, jArr2);
                return n(n(jArr3[0], jArr2[0], j17) + (r(b13) * f75318b) + j21, n(jArr3[c12], jArr2[c12], j17) + rotateRight6, j17);
            }
            bArr = bytes;
            b11 = rotateRight3;
            j12 = j15;
            r11 = j16;
            c11 = c12;
            j14 = b12;
            jArr = jArr3;
        }
    }

    public static long r(long val) {
        return val ^ (val >>> 47);
    }

    public static void s(byte[] bytes, int offset, long seedA, long seedB, long[] output) {
        long b11 = v.b(bytes, offset);
        long b12 = v.b(bytes, offset + 8);
        long b13 = v.b(bytes, offset + 16);
        long b14 = v.b(bytes, offset + 24);
        long j11 = seedA + b11;
        long j12 = b12 + j11 + b13;
        long rotateRight = Long.rotateRight(seedB + j11 + b14, 21) + Long.rotateRight(j12, 44);
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
        return "Hashing.farmHashFingerprint64()";
    }
}
