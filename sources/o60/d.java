package o60;

import java.math.BigInteger;
import kx.a0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d extends g {
    public static final byte[] A = {13, 10};
    public static final byte[] B = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    public static final byte[] C = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, a0.f68904b, s60.b.f88049h};
    public static final byte[] D = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, ho.c.f59556u, 19, 20, ho.c.f59560y, ho.c.f59561z, ho.c.A, ho.c.B, ho.c.C, -1, -1, -1, -1, 63, -1, ho.c.D, ho.c.E, 28, ho.c.G, ho.c.H, 31, 32, 33, 34, 35, 36, s60.e.f88061c, 38, 39, 40, 41, 42, 43, 44, a0.f68904b, 46, 47, 48, 49, 50, 51};
    public static final int E = 63;

    /* renamed from: x, reason: collision with root package name */
    public static final int f76286x = 6;

    /* renamed from: y, reason: collision with root package name */
    public static final int f76287y = 3;

    /* renamed from: z, reason: collision with root package name */
    public static final int f76288z = 4;

    /* renamed from: r, reason: collision with root package name */
    public final byte[] f76289r;

    /* renamed from: s, reason: collision with root package name */
    public final byte[] f76290s;

    /* renamed from: t, reason: collision with root package name */
    public final byte[] f76291t;

    /* renamed from: u, reason: collision with root package name */
    public final int f76292u;

    /* renamed from: v, reason: collision with root package name */
    public final int f76293v;

    /* renamed from: w, reason: collision with root package name */
    public int f76294w;

    public d() {
        this(0);
    }

    public static byte[] A(byte[] bArr, boolean z11, boolean z12, int i11) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        d dVar = z11 ? new d(z12) : new d(0, A, z12);
        long l11 = dVar.l(bArr);
        if (l11 <= i11) {
            return dVar.encode(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + l11 + ") than the specified maximum size of " + i11);
    }

    public static byte[] B(byte[] bArr) {
        return y(bArr, true);
    }

    public static String C(byte[] bArr) {
        return l.o(y(bArr, false));
    }

    public static byte[] D(byte[] bArr) {
        return z(bArr, false, true);
    }

    public static String E(byte[] bArr) {
        return l.o(z(bArr, false, true));
    }

    public static byte[] F(BigInteger bigInteger) {
        if (bigInteger != null) {
            return y(L(bigInteger), false);
        }
        throw new NullPointerException("encodeInteger called with null parameter");
    }

    public static boolean G(byte[] bArr) {
        return J(bArr);
    }

    public static boolean H(byte b11) {
        if (b11 == 61) {
            return true;
        }
        if (b11 < 0) {
            return false;
        }
        byte[] bArr = D;
        return b11 < bArr.length && bArr[b11] != -1;
    }

    public static boolean I(String str) {
        return J(l.g(str));
    }

    public static boolean J(byte[] bArr) {
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if (!H(bArr[i11]) && !g.q(bArr[i11])) {
                return false;
            }
        }
        return true;
    }

    public static byte[] L(BigInteger bigInteger) {
        int bitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        int i11 = 1;
        if (bigInteger.bitLength() % 8 != 0 && (bigInteger.bitLength() / 8) + 1 == bitLength / 8) {
            return byteArray;
        }
        int length = byteArray.length;
        if (bigInteger.bitLength() % 8 == 0) {
            length--;
        } else {
            i11 = 0;
        }
        int i12 = bitLength / 8;
        int i13 = i12 - length;
        byte[] bArr = new byte[i12];
        System.arraycopy(byteArray, i11, bArr, i13, length);
        return bArr;
    }

    public static byte[] u(String str) {
        return new d().f(str);
    }

    public static byte[] v(byte[] bArr) {
        return new d().decode(bArr);
    }

    public static BigInteger w(byte[] bArr) {
        return new BigInteger(1, v(bArr));
    }

    public static byte[] x(byte[] bArr) {
        return y(bArr, false);
    }

    public static byte[] y(byte[] bArr, boolean z11) {
        return z(bArr, z11, false);
    }

    public static byte[] z(byte[] bArr, boolean z11, boolean z12) {
        return A(bArr, z11, z12, Integer.MAX_VALUE);
    }

    public boolean K() {
        return this.f76289r == C;
    }

    @Override // o60.g
    public void e(byte[] bArr, int i11, int i12) {
        byte b11;
        if (this.f76309i) {
            return;
        }
        if (i12 < 0) {
            this.f76309i = true;
        }
        int i13 = 0;
        while (true) {
            if (i13 >= i12) {
                break;
            }
            j(this.f76292u);
            int i14 = i11 + 1;
            byte b12 = bArr[i11];
            if (b12 == 61) {
                this.f76309i = true;
                break;
            }
            if (b12 >= 0) {
                byte[] bArr2 = D;
                if (b12 < bArr2.length && (b11 = bArr2[b12]) >= 0) {
                    int i15 = (this.f76311k + 1) % 4;
                    this.f76311k = i15;
                    int i16 = (this.f76294w << 6) + b11;
                    this.f76294w = i16;
                    if (i15 == 0) {
                        byte[] bArr3 = this.f76306f;
                        int i17 = this.f76307g;
                        int i18 = i17 + 1;
                        this.f76307g = i18;
                        bArr3[i17] = (byte) ((i16 >> 16) & 255);
                        int i19 = i17 + 2;
                        this.f76307g = i19;
                        bArr3[i18] = (byte) ((i16 >> 8) & 255);
                        this.f76307g = i17 + 3;
                        bArr3[i19] = (byte) (i16 & 255);
                    }
                }
            }
            i13++;
            i11 = i14;
        }
        if (!this.f76309i || this.f76311k == 0) {
            return;
        }
        j(this.f76292u);
        int i21 = this.f76311k;
        if (i21 == 2) {
            int i22 = this.f76294w >> 4;
            this.f76294w = i22;
            byte[] bArr4 = this.f76306f;
            int i23 = this.f76307g;
            this.f76307g = i23 + 1;
            bArr4[i23] = (byte) (i22 & 255);
            return;
        }
        if (i21 != 3) {
            return;
        }
        int i24 = this.f76294w;
        int i25 = i24 >> 2;
        this.f76294w = i25;
        byte[] bArr5 = this.f76306f;
        int i26 = this.f76307g;
        int i27 = i26 + 1;
        this.f76307g = i27;
        bArr5[i26] = (byte) ((i24 >> 10) & 255);
        this.f76307g = i26 + 2;
        bArr5[i27] = (byte) (i25 & 255);
    }

    @Override // o60.g
    public void g(byte[] bArr, int i11, int i12) {
        if (this.f76309i) {
            return;
        }
        if (i12 >= 0) {
            int i13 = 0;
            while (i13 < i12) {
                j(this.f76293v);
                int i14 = (this.f76311k + 1) % 3;
                this.f76311k = i14;
                int i15 = i11 + 1;
                int i16 = bArr[i11];
                if (i16 < 0) {
                    i16 += 256;
                }
                int i17 = (this.f76294w << 8) + i16;
                this.f76294w = i17;
                if (i14 == 0) {
                    byte[] bArr2 = this.f76306f;
                    int i18 = this.f76307g;
                    int i19 = i18 + 1;
                    this.f76307g = i19;
                    byte[] bArr3 = this.f76289r;
                    bArr2[i18] = bArr3[(i17 >> 18) & 63];
                    int i21 = i18 + 2;
                    this.f76307g = i21;
                    bArr2[i19] = bArr3[(i17 >> 12) & 63];
                    int i22 = i18 + 3;
                    this.f76307g = i22;
                    bArr2[i21] = bArr3[(i17 >> 6) & 63];
                    int i23 = i18 + 4;
                    this.f76307g = i23;
                    bArr2[i22] = bArr3[i17 & 63];
                    int i24 = this.f76310j + 4;
                    this.f76310j = i24;
                    int i25 = this.f76304d;
                    if (i25 > 0 && i25 <= i24) {
                        byte[] bArr4 = this.f76291t;
                        System.arraycopy(bArr4, 0, bArr2, i23, bArr4.length);
                        this.f76307g += this.f76291t.length;
                        this.f76310j = 0;
                    }
                }
                i13++;
                i11 = i15;
            }
            return;
        }
        this.f76309i = true;
        if (this.f76311k == 0 && this.f76304d == 0) {
            return;
        }
        j(this.f76293v);
        int i26 = this.f76307g;
        int i27 = this.f76311k;
        if (i27 == 1) {
            byte[] bArr5 = this.f76306f;
            int i28 = i26 + 1;
            this.f76307g = i28;
            byte[] bArr6 = this.f76289r;
            int i29 = this.f76294w;
            bArr5[i26] = bArr6[(i29 >> 2) & 63];
            int i31 = i26 + 2;
            this.f76307g = i31;
            bArr5[i28] = bArr6[(i29 << 4) & 63];
            if (bArr6 == B) {
                int i32 = i26 + 3;
                this.f76307g = i32;
                bArr5[i31] = 61;
                this.f76307g = i26 + 4;
                bArr5[i32] = 61;
            }
        } else if (i27 == 2) {
            byte[] bArr7 = this.f76306f;
            int i33 = i26 + 1;
            this.f76307g = i33;
            byte[] bArr8 = this.f76289r;
            int i34 = this.f76294w;
            bArr7[i26] = bArr8[(i34 >> 10) & 63];
            int i35 = i26 + 2;
            this.f76307g = i35;
            bArr7[i33] = bArr8[(i34 >> 4) & 63];
            int i36 = i26 + 3;
            this.f76307g = i36;
            bArr7[i35] = bArr8[(i34 << 2) & 63];
            if (bArr8 == B) {
                this.f76307g = i26 + 4;
                bArr7[i36] = 61;
            }
        }
        int i37 = this.f76310j;
        int i38 = this.f76307g;
        int i39 = i37 + (i38 - i26);
        this.f76310j = i39;
        if (this.f76304d <= 0 || i39 <= 0) {
            return;
        }
        byte[] bArr9 = this.f76291t;
        System.arraycopy(bArr9, 0, this.f76306f, i38, bArr9.length);
        this.f76307g += this.f76291t.length;
    }

    @Override // o60.g
    public boolean n(byte b11) {
        if (b11 < 0) {
            return false;
        }
        byte[] bArr = this.f76290s;
        return b11 < bArr.length && bArr[b11] != -1;
    }

    public d(boolean z11) {
        this(76, A, z11);
    }

    public d(int i11) {
        this(i11, A);
    }

    public d(int i11, byte[] bArr) {
        this(i11, bArr, false);
    }

    public d(int i11, byte[] bArr, boolean z11) {
        super(3, 4, i11, bArr == null ? 0 : bArr.length);
        this.f76290s = D;
        if (bArr != null) {
            if (d(bArr)) {
                throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + l.o(bArr) + "]");
            }
            if (i11 > 0) {
                this.f76293v = bArr.length + 4;
                byte[] bArr2 = new byte[bArr.length];
                this.f76291t = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                this.f76293v = 4;
                this.f76291t = null;
            }
        } else {
            this.f76293v = 4;
            this.f76291t = null;
        }
        this.f76292u = this.f76293v - 1;
        this.f76289r = z11 ? C : B;
    }
}
