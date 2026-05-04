package kp;

import com.google.zxing.NotFoundException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class g extends com.google.zxing.a {

    /* renamed from: d, reason: collision with root package name */
    public static final int f68558d = 5;

    /* renamed from: e, reason: collision with root package name */
    public static final int f68559e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f68560f = 32;

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f68561g = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public byte[] f68562b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f68563c;

    public g(com.google.zxing.e eVar) {
        super(eVar);
        this.f68562b = f68561g;
        this.f68563c = new int[32];
    }

    public static int g(int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = iArr[i14];
            if (i15 > i11) {
                i13 = i14;
                i11 = i15;
            }
            if (i15 > i12) {
                i12 = i15;
            }
        }
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < length; i18++) {
            int i19 = i18 - i13;
            int i21 = iArr[i18] * i19 * i19;
            if (i21 > i17) {
                i16 = i18;
                i17 = i21;
            }
        }
        if (i13 <= i16) {
            int i22 = i13;
            i13 = i16;
            i16 = i22;
        }
        if (i13 - i16 <= length / 16) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i23 = i13 - 1;
        int i24 = -1;
        int i25 = i23;
        while (i23 > i16) {
            int i26 = i23 - i16;
            int i27 = i26 * i26 * (i13 - i23) * (i12 - iArr[i23]);
            if (i27 > i24) {
                i25 = i23;
                i24 = i27;
            }
            i23--;
        }
        return i25 << 3;
    }

    @Override // com.google.zxing.a
    public com.google.zxing.a a(com.google.zxing.e eVar) {
        return new g(eVar);
    }

    @Override // com.google.zxing.a
    public b b() throws NotFoundException {
        com.google.zxing.e e11 = e();
        int e12 = e11.e();
        int b11 = e11.b();
        b bVar = new b(e12, b11);
        h(e12);
        int[] iArr = this.f68563c;
        for (int i11 = 1; i11 < 5; i11++) {
            byte[] d11 = e11.d((b11 * i11) / 5, this.f68562b);
            int i12 = (e12 << 2) / 5;
            for (int i13 = e12 / 5; i13 < i12; i13++) {
                int i14 = (d11[i13] & 255) >> 3;
                iArr[i14] = iArr[i14] + 1;
            }
        }
        int g11 = g(iArr);
        byte[] c11 = e11.c();
        for (int i15 = 0; i15 < b11; i15++) {
            int i16 = i15 * e12;
            for (int i17 = 0; i17 < e12; i17++) {
                if ((c11[i16 + i17] & 255) < g11) {
                    bVar.q(i17, i15);
                }
            }
        }
        return bVar;
    }

    @Override // com.google.zxing.a
    public a c(int i11, a aVar) throws NotFoundException {
        com.google.zxing.e e11 = e();
        int e12 = e11.e();
        if (aVar == null || aVar.m() < e12) {
            aVar = new a(e12);
        } else {
            aVar.d();
        }
        h(e12);
        byte[] d11 = e11.d(i11, this.f68562b);
        int[] iArr = this.f68563c;
        for (int i12 = 0; i12 < e12; i12++) {
            int i13 = (d11[i12] & 255) >> 3;
            iArr[i13] = iArr[i13] + 1;
        }
        int g11 = g(iArr);
        if (e12 < 3) {
            for (int i14 = 0; i14 < e12; i14++) {
                if ((d11[i14] & 255) < g11) {
                    aVar.s(i14);
                }
            }
        } else {
            int i15 = d11[0] & 255;
            int i16 = d11[1] & 255;
            int i17 = 1;
            while (i17 < e12 - 1) {
                int i18 = i17 + 1;
                int i19 = d11[i18] & 255;
                if ((((i16 << 2) - i15) - i19) / 2 < g11) {
                    aVar.s(i17);
                }
                i15 = i16;
                i17 = i18;
                i16 = i19;
            }
        }
        return aVar;
    }

    public final void h(int i11) {
        if (this.f68562b.length < i11) {
            this.f68562b = new byte[i11];
        }
        for (int i12 = 0; i12 < 32; i12++) {
            this.f68563c[i12] = 0;
        }
    }
}
