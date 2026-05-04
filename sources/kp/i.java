package kp;

import com.google.zxing.NotFoundException;
import java.lang.reflect.Array;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class i extends g {

    /* renamed from: i, reason: collision with root package name */
    public static final int f68565i = 3;

    /* renamed from: j, reason: collision with root package name */
    public static final int f68566j = 8;

    /* renamed from: k, reason: collision with root package name */
    public static final int f68567k = 7;

    /* renamed from: l, reason: collision with root package name */
    public static final int f68568l = 40;

    /* renamed from: m, reason: collision with root package name */
    public static final int f68569m = 24;

    /* renamed from: h, reason: collision with root package name */
    public b f68570h;

    public i(com.google.zxing.e eVar) {
        super(eVar);
    }

    public static int[][] i(byte[] bArr, int i11, int i12, int i13, int i14) {
        int i15 = 8;
        int i16 = i14 - 8;
        int i17 = i13 - 8;
        char c11 = 2;
        boolean z11 = true;
        int i18 = 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i12, i11);
        int i19 = 0;
        while (i19 < i12) {
            int i21 = i19 << 3;
            if (i21 > i16) {
                i21 = i16;
            }
            int i22 = i18;
            while (i22 < i11) {
                int i23 = i22 << 3;
                if (i23 > i17) {
                    i23 = i17;
                }
                int i24 = (i21 * i13) + i23;
                char c12 = c11;
                boolean z12 = z11;
                int i25 = i18;
                int i26 = i25;
                int i27 = i26;
                int i28 = 255;
                while (i25 < i15) {
                    int i29 = i18;
                    int i31 = i27;
                    while (i29 < i15) {
                        int i32 = bArr[i24 + i29] & 255;
                        i26 += i32;
                        if (i32 < i28) {
                            i28 = i32;
                        }
                        if (i32 > i31) {
                            i31 = i32;
                        }
                        i29++;
                        i15 = 8;
                    }
                    if (i31 - i28 > 24) {
                        while (true) {
                            i25++;
                            i24 += i13;
                            if (i25 < 8) {
                                int i33 = 0;
                                for (int i34 = 8; i33 < i34; i34 = 8) {
                                    i26 += bArr[i24 + i33] & 255;
                                    i33++;
                                }
                            }
                        }
                    }
                    i25++;
                    i24 += i13;
                    i27 = i31;
                    i15 = 8;
                    i18 = 0;
                }
                int i35 = i26 >> 6;
                if (i27 - i28 <= 24) {
                    i35 = i28 / 2;
                    if (i19 > 0 && i22 > 0) {
                        int[] iArr2 = iArr[i19 - 1];
                        int i36 = i22 - 1;
                        int i37 = ((iArr2[i22] + (iArr[i19][i36] * 2)) + iArr2[i36]) / 4;
                        if (i28 < i37) {
                            i35 = i37;
                        }
                    }
                }
                iArr[i19][i22] = i35;
                i22++;
                c11 = c12;
                z11 = z12;
                i15 = 8;
                i18 = 0;
            }
            i19++;
            i15 = 8;
            i18 = 0;
        }
        return iArr;
    }

    public static void j(byte[] bArr, int i11, int i12, int i13, int i14, int[][] iArr, b bVar) {
        int i15 = i14 - 8;
        int i16 = i13 - 8;
        for (int i17 = 0; i17 < i12; i17++) {
            int i18 = i17 << 3;
            int i19 = i18 > i15 ? i15 : i18;
            int k11 = k(i17, 2, i12 - 3);
            for (int i21 = 0; i21 < i11; i21++) {
                int i22 = i21 << 3;
                int i23 = i22 > i16 ? i16 : i22;
                int k12 = k(i21, 2, i11 - 3);
                int i24 = 0;
                for (int i25 = -2; i25 <= 2; i25++) {
                    int[] iArr2 = iArr[k11 + i25];
                    i24 += iArr2[k12 - 2] + iArr2[k12 - 1] + iArr2[k12] + iArr2[k12 + 1] + iArr2[k12 + 2];
                }
                l(bArr, i23, i19, i24 / 25, i13, bVar);
            }
        }
    }

    public static int k(int i11, int i12, int i13) {
        return i11 < i12 ? i12 : i11 > i13 ? i13 : i11;
    }

    public static void l(byte[] bArr, int i11, int i12, int i13, int i14, b bVar) {
        int i15 = (i12 * i14) + i11;
        int i16 = 0;
        while (i16 < 8) {
            for (int i17 = 0; i17 < 8; i17++) {
                if ((bArr[i15 + i17] & 255) <= i13) {
                    bVar.q(i11 + i17, i12 + i16);
                }
            }
            i16++;
            i15 += i14;
        }
    }

    @Override // kp.g, com.google.zxing.a
    public com.google.zxing.a a(com.google.zxing.e eVar) {
        return new i(eVar);
    }

    @Override // kp.g, com.google.zxing.a
    public b b() throws NotFoundException {
        b bVar = this.f68570h;
        if (bVar != null) {
            return bVar;
        }
        com.google.zxing.e e11 = e();
        int e12 = e11.e();
        int b11 = e11.b();
        if (e12 < 40 || b11 < 40) {
            this.f68570h = super.b();
        } else {
            byte[] c11 = e11.c();
            int i11 = e12 >> 3;
            if ((e12 & 7) != 0) {
                i11++;
            }
            int i12 = i11;
            int i13 = b11 >> 3;
            if ((b11 & 7) != 0) {
                i13++;
            }
            int i14 = i13;
            int[][] i15 = i(c11, i12, i14, e12, b11);
            b bVar2 = new b(e12, b11);
            j(c11, i12, i14, e12, b11, i15, bVar2);
            this.f68570h = bVar2;
        }
        return this.f68570h;
    }
}
