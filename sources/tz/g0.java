package tz;

import java.util.Arrays;

/* loaded from: classes8.dex */
public class g0 {

    public static class a {

        /* renamed from: g, reason: collision with root package name */
        public static final byte[] f91275g;

        /* renamed from: j, reason: collision with root package name */
        public static final a f91278j;

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f91279a;

        /* renamed from: b, reason: collision with root package name */
        public final int f91280b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f91281c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f91282d;

        /* renamed from: e, reason: collision with root package name */
        public static final char[] f91273e = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', io.ktor.util.date.b.f62001g, 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', io.ktor.util.date.b.f62002h, 'Z', 'a', 'b', 'c', io.ktor.util.date.b.f62000f, 'e', 'f', 'g', io.ktor.util.date.b.f61999e, 'i', 'j', 'k', 'l', io.ktor.util.date.b.f61998d, 'n', 'o', 'p', 'q', 'r', io.ktor.util.date.b.f61997c, 't', l50.b.f69934p, 'v', 'w', 'x', 'y', io.ktor.util.date.b.f62003i, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

        /* renamed from: f, reason: collision with root package name */
        public static final char[] f91274f = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', io.ktor.util.date.b.f62001g, 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', io.ktor.util.date.b.f62002h, 'Z', 'a', 'b', 'c', io.ktor.util.date.b.f62000f, 'e', 'f', 'g', io.ktor.util.date.b.f61999e, 'i', 'j', 'k', 'l', io.ktor.util.date.b.f61998d, 'n', 'o', 'p', 'q', 'r', io.ktor.util.date.b.f61997c, 't', l50.b.f69934p, 'v', 'w', 'x', 'y', io.ktor.util.date.b.f62003i, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'};

        /* renamed from: h, reason: collision with root package name */
        public static final a f91276h = new a(false, null, -1, true);

        /* renamed from: i, reason: collision with root package name */
        public static final a f91277i = new a(true, null, -1, true);

        static {
            byte[] bArr = {13, 10};
            f91275g = bArr;
            f91278j = new a(false, bArr, 76, true);
        }

        public a(boolean z11, byte[] bArr, int i11, boolean z12) {
            this.f91281c = z11;
            this.f91279a = bArr;
            this.f91280b = i11;
            this.f91282d = z12;
        }

        public final int a(int i11) {
            int i12;
            if (this.f91282d) {
                i12 = ((i11 + 2) / 3) * 4;
            } else {
                int i13 = i11 % 3;
                i12 = ((i11 / 3) * 4) + (i13 == 0 ? 0 : i13 + 1);
            }
            int i14 = this.f91280b;
            return i14 > 0 ? i12 + (((i12 - 1) / i14) * this.f91279a.length) : i12;
        }

        public final int b(byte[] bArr, int i11, int i12, byte[] bArr2) {
            char[] cArr = this.f91281c ? f91274f : f91273e;
            int i13 = ((i12 - i11) / 3) * 3;
            int i14 = i11 + i13;
            int i15 = this.f91280b;
            if (i15 > 0 && i13 > (i15 / 4) * 3) {
                i13 = (i15 / 4) * 3;
            }
            int i16 = i11;
            int i17 = 0;
            while (i16 < i14) {
                int min = Math.min(i16 + i13, i14);
                int i18 = i16;
                int i19 = i17;
                while (i18 < min) {
                    int i21 = i18 + 2;
                    int i22 = ((bArr[i18 + 1] & 255) << 8) | ((bArr[i18] & 255) << 16);
                    i18 += 3;
                    int i23 = i22 | (bArr[i21] & 255);
                    bArr2[i19] = (byte) cArr[(i23 >>> 18) & 63];
                    bArr2[i19 + 1] = (byte) cArr[(i23 >>> 12) & 63];
                    int i24 = i19 + 3;
                    bArr2[i19 + 2] = (byte) cArr[(i23 >>> 6) & 63];
                    i19 += 4;
                    bArr2[i24] = (byte) cArr[i23 & 63];
                }
                int i25 = ((min - i16) / 3) * 4;
                i17 += i25;
                if (i25 == this.f91280b && min < i12) {
                    byte[] bArr3 = this.f91279a;
                    int length = bArr3.length;
                    int i26 = 0;
                    while (i26 < length) {
                        bArr2[i17] = bArr3[i26];
                        i26++;
                        i17++;
                    }
                }
                i16 = min;
            }
            if (i16 >= i12) {
                return i17;
            }
            int i27 = i16 + 1;
            int i28 = bArr[i16] & 255;
            int i29 = i17 + 1;
            bArr2[i17] = (byte) cArr[i28 >> 2];
            if (i27 == i12) {
                int i31 = i17 + 2;
                bArr2[i29] = (byte) cArr[(i28 << 4) & 63];
                if (!this.f91282d) {
                    return i31;
                }
                int i32 = i17 + 3;
                bArr2[i31] = 61;
                int i33 = i17 + 4;
                bArr2[i32] = 61;
                return i33;
            }
            int i34 = bArr[i27] & 255;
            bArr2[i29] = (byte) cArr[((i28 << 4) & 63) | (i34 >> 4)];
            int i35 = i17 + 3;
            bArr2[i17 + 2] = (byte) cArr[(i34 << 2) & 63];
            if (!this.f91282d) {
                return i35;
            }
            int i36 = i17 + 4;
            bArr2[i35] = 61;
            return i36;
        }

        public a c() {
            return !this.f91282d ? this : new a(this.f91281c, this.f91279a, this.f91280b, false);
        }

        public byte[] d(byte[] bArr) {
            int a11 = a(bArr.length);
            byte[] bArr2 = new byte[a11];
            int b11 = b(bArr, 0, bArr.length, bArr2);
            return b11 != a11 ? Arrays.copyOf(bArr2, b11) : bArr2;
        }

        public String e(byte[] bArr) {
            byte[] d11 = d(bArr);
            return new String(d11, 0, 0, d11.length);
        }
    }

    public static a a() {
        return a.f91277i;
    }
}
