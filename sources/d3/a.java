package d3;

import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a extends b {
    public static final int A = 1;
    public static final int B = 1024;
    public static final int C = 0;
    public static final int D = 1073741823;
    public static final int[] E = new int[256];

    /* renamed from: x, reason: collision with root package name */
    public static final int f47089x = 1024;

    /* renamed from: y, reason: collision with root package name */
    public static final int f47090y = 65536;

    /* renamed from: z, reason: collision with root package name */
    public static final int f47091z = 65536;

    /* renamed from: l, reason: collision with root package name */
    public int f47092l;

    /* renamed from: n, reason: collision with root package name */
    public int f47094n;

    /* renamed from: o, reason: collision with root package name */
    public int[] f47095o;

    /* renamed from: p, reason: collision with root package name */
    public int[] f47096p;

    /* renamed from: r, reason: collision with root package name */
    public int f47098r;

    /* renamed from: m, reason: collision with root package name */
    public int f47093m = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f47097q = 255;

    /* renamed from: s, reason: collision with root package name */
    public int f47099s = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f47100t = true;

    /* renamed from: u, reason: collision with root package name */
    public int f47101u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f47102v = 4;

    /* renamed from: w, reason: collision with root package name */
    public int f47103w = 66560;

    static {
        for (int i11 = 0; i11 < 256; i11++) {
            int i12 = i11;
            for (int i13 = 0; i13 < 8; i13++) {
                i12 = (i12 & 1) != 0 ? (i12 >>> 1) ^ (-306674912) : i12 >>> 1;
            }
            E[i11] = i12;
        }
    }

    @Override // d3.b
    public void f() throws IOException {
        super.f();
        for (int i11 = 0; i11 < this.f47099s; i11++) {
            this.f47096p[i11] = 0;
        }
        this.f47092l = 0;
        j(-1);
    }

    @Override // d3.b
    public void h() throws IOException {
        int i11 = this.f47092l + 1;
        this.f47092l = i11;
        if (i11 >= this.f47093m) {
            this.f47092l = 0;
        }
        super.h();
        if (this.f47111h == 1073741823) {
            o();
        }
    }

    public boolean m(int i11, int i12, int i13, int i14) {
        int i15;
        if (i11 > 1073741567) {
            return false;
        }
        this.f47097q = (i13 >> 1) + 16;
        int i16 = i12 + i11;
        super.a(i16, i14 + i13, (((i16 + i13) + i14) / 2) + 256);
        this.f47094n = i13;
        int i17 = i11 + 1;
        if (this.f47093m != i17) {
            this.f47093m = i17;
            this.f47095o = new int[i17 * 2];
        }
        if (this.f47100t) {
            int i18 = i11 - 1;
            int i19 = i18 | (i18 >> 1);
            int i21 = i19 | (i19 >> 2);
            int i22 = i21 | (i21 >> 4);
            int i23 = ((i22 | (i22 >> 8)) >> 1) | 65535;
            if (i23 > 16777216) {
                i23 >>= 1;
            }
            this.f47098r = i23;
            i15 = i23 + 1 + this.f47103w;
        } else {
            i15 = 65536;
        }
        if (i15 != this.f47099s) {
            this.f47099s = i15;
            this.f47096p = new int[i15];
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int n(int[] r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.a.n(int[]):int");
    }

    public void o() {
        int i11 = this.f47111h;
        int i12 = this.f47093m;
        int i13 = i11 - i12;
        p(this.f47095o, i12 * 2, i13);
        p(this.f47096p, this.f47099s, i13);
        j(i13);
    }

    public void p(int[] iArr, int i11, int i12) {
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = iArr[i13];
            iArr[i13] = i14 <= i12 ? 0 : i14 - i12;
        }
    }

    public void q(int i11) {
        this.f47097q = i11;
    }

    public void r(int i11) {
        boolean z11 = i11 > 2;
        this.f47100t = z11;
        if (z11) {
            this.f47101u = 0;
            this.f47102v = 4;
            this.f47103w = 66560;
        } else {
            this.f47101u = 2;
            this.f47102v = 3;
            this.f47103w = 0;
        }
    }

    public void s(int i11) throws IOException {
        int i12;
        byte[] bArr;
        int i13 = i11;
        do {
            int i14 = this.f47111h;
            int i15 = this.f47094n;
            int i16 = i14 + i15;
            int i17 = this.f47114k;
            if (i16 > i17 && (i15 = i17 - i14) < this.f47102v) {
                h();
            } else {
                int i18 = this.f47093m;
                int i19 = i14 > i18 ? i14 - i18 : 0;
                int i21 = this.f47109f + i14;
                if (this.f47100t) {
                    int[] iArr = E;
                    byte[] bArr2 = this.f47104a;
                    int i22 = iArr[bArr2[i21] & 255] ^ (bArr2[i21 + 1] & 255);
                    int[] iArr2 = this.f47096p;
                    iArr2[i22 & 1023] = i14;
                    int i23 = i22 ^ ((bArr2[i21 + 2] & 255) << 8);
                    iArr2[(65535 & i23) + 1024] = i14;
                    i12 = ((iArr[bArr2[i21 + 3] & 255] << 5) ^ i23) & this.f47098r;
                } else {
                    byte[] bArr3 = this.f47104a;
                    i12 = ((bArr3[i21 + 1] & 255) << 8) ^ (bArr3[i21] & 255);
                }
                int[] iArr3 = this.f47096p;
                int i24 = this.f47103w;
                int i25 = iArr3[i24 + i12];
                iArr3[i24 + i12] = i14;
                int i26 = this.f47092l;
                int i27 = (i26 << 1) + 1;
                int i28 = i26 << 1;
                int i29 = this.f47101u;
                int i31 = i25;
                int i32 = this.f47097q;
                int i33 = i29;
                while (i31 > i19) {
                    int i34 = i32 - 1;
                    if (i32 == 0) {
                        break;
                    }
                    int i35 = this.f47111h - i31;
                    int i36 = this.f47092l;
                    int i37 = (i35 <= i36 ? i36 - i35 : (i36 - i35) + this.f47093m) << 1;
                    int i38 = this.f47109f + i31;
                    int min = Math.min(i29, i33);
                    byte[] bArr4 = this.f47104a;
                    if (bArr4[i38 + min] == bArr4[i21 + min]) {
                        do {
                            min++;
                            if (min == i15) {
                                break;
                            } else {
                                bArr = this.f47104a;
                            }
                        } while (bArr[i38 + min] == bArr[i21 + min]);
                        if (min == i15) {
                            int[] iArr4 = this.f47095o;
                            iArr4[i28] = iArr4[i37];
                            iArr4[i27] = iArr4[i37 + 1];
                            break;
                        }
                    }
                    byte[] bArr5 = this.f47104a;
                    if ((bArr5[i38 + min] & 255) < (bArr5[i21 + min] & 255)) {
                        int[] iArr5 = this.f47095o;
                        iArr5[i28] = i31;
                        int i39 = i37 + 1;
                        i31 = iArr5[i39];
                        i28 = i39;
                        i33 = min;
                    } else {
                        int[] iArr6 = this.f47095o;
                        iArr6[i27] = i31;
                        i31 = iArr6[i37];
                        i27 = i37;
                        i29 = min;
                    }
                    i32 = i34;
                }
                int[] iArr7 = this.f47095o;
                iArr7[i28] = 0;
                iArr7[i27] = 0;
                h();
            }
            i13--;
        } while (i13 != 0);
    }
}
