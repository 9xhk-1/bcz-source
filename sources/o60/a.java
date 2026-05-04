package o60;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a extends g {
    public static final byte[] A = {13, 10};
    public static final byte[] B = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 63, -1, -1, ho.c.D, ho.c.E, 28, ho.c.G, ho.c.H, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, ho.c.f59556u, 19, 20, ho.c.f59560y, ho.c.f59561z, ho.c.A, ho.c.B, ho.c.C};
    public static final byte[] C = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 50, 51, 52, 53, 54, 55};
    public static final byte[] D = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 63, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, ho.c.f59556u, 19, 20, ho.c.f59560y, ho.c.f59561z, ho.c.A, ho.c.B, ho.c.C, ho.c.D, ho.c.E, 28, ho.c.G, ho.c.H, 31, 32};
    public static final byte[] E = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86};
    public static final int F = 31;

    /* renamed from: x, reason: collision with root package name */
    public static final int f76277x = 5;

    /* renamed from: y, reason: collision with root package name */
    public static final int f76278y = 8;

    /* renamed from: z, reason: collision with root package name */
    public static final int f76279z = 5;

    /* renamed from: r, reason: collision with root package name */
    public long f76280r;

    /* renamed from: s, reason: collision with root package name */
    public final int f76281s;

    /* renamed from: t, reason: collision with root package name */
    public final byte[] f76282t;

    /* renamed from: u, reason: collision with root package name */
    public final int f76283u;

    /* renamed from: v, reason: collision with root package name */
    public final byte[] f76284v;

    /* renamed from: w, reason: collision with root package name */
    public final byte[] f76285w;

    public a() {
        this(false);
    }

    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    @Override // o60.g
    public void e(byte[] bArr, int i11, int i12) {
        boolean z11;
        byte b11;
        if (this.f76309i) {
            return;
        }
        ?? r22 = 1;
        if (i12 < 0) {
            this.f76309i = true;
        }
        int i13 = 0;
        int i14 = i11;
        while (true) {
            if (i13 >= i12) {
                break;
            }
            int i15 = i14 + 1;
            byte b12 = bArr[i14];
            if (b12 == 61) {
                this.f76309i = r22;
                break;
            }
            j(this.f76281s);
            if (b12 >= 0) {
                byte[] bArr2 = this.f76282t;
                if (b12 < bArr2.length && (b11 = bArr2[b12]) >= 0) {
                    int i16 = (this.f76311k + r22) % 8;
                    this.f76311k = i16;
                    this.f76280r = (this.f76280r << 5) + b11;
                    if (i16 == 0) {
                        byte[] bArr3 = this.f76306f;
                        int i17 = this.f76307g;
                        int i18 = i17 + 1;
                        this.f76307g = i18;
                        bArr3[i17] = (byte) ((r10 >> 32) & 255);
                        int i19 = i17 + 2;
                        this.f76307g = i19;
                        z11 = r22;
                        bArr3[i18] = (byte) ((r10 >> 24) & 255);
                        int i21 = i17 + 3;
                        this.f76307g = i21;
                        bArr3[i19] = (byte) ((r10 >> 16) & 255);
                        int i22 = i17 + 4;
                        this.f76307g = i22;
                        bArr3[i21] = (byte) ((r10 >> 8) & 255);
                        this.f76307g = i17 + 5;
                        bArr3[i22] = (byte) (r10 & 255);
                        i13++;
                        i14 = i15;
                        r22 = z11;
                    }
                }
            }
            z11 = r22;
            i13++;
            i14 = i15;
            r22 = z11;
        }
        char c11 = r22;
        if (!this.f76309i || this.f76311k < 2) {
            return;
        }
        j(this.f76281s);
        switch (this.f76311k) {
            case 2:
                byte[] bArr4 = this.f76306f;
                int i23 = this.f76307g;
                this.f76307g = i23 + 1;
                bArr4[i23] = (byte) ((this.f76280r >> 2) & 255);
                break;
            case 3:
                byte[] bArr5 = this.f76306f;
                int i24 = this.f76307g;
                this.f76307g = i24 + 1;
                bArr5[i24] = (byte) ((this.f76280r >> 7) & 255);
                break;
            case 4:
                this.f76280r = this.f76280r >> 4;
                byte[] bArr6 = this.f76306f;
                int i25 = this.f76307g;
                int i26 = i25 + 1;
                this.f76307g = i26;
                bArr6[i25] = (byte) ((r4 >> 12) & 255);
                this.f76307g = i25 + 2;
                bArr6[i26] = (byte) (r6 & 255);
                break;
            case 5:
                this.f76280r = this.f76280r >> c11;
                byte[] bArr7 = this.f76306f;
                int i27 = this.f76307g;
                int i28 = i27 + 1;
                this.f76307g = i28;
                bArr7[i27] = (byte) ((r1 >> 17) & 255);
                int i29 = i27 + 2;
                this.f76307g = i29;
                bArr7[i28] = (byte) ((r1 >> 9) & 255);
                this.f76307g = i27 + 3;
                bArr7[i29] = (byte) (r5 & 255);
                break;
            case 6:
                this.f76280r = this.f76280r >> 6;
                byte[] bArr8 = this.f76306f;
                int i31 = this.f76307g;
                int i32 = i31 + 1;
                this.f76307g = i32;
                bArr8[i31] = (byte) ((r1 >> 22) & 255);
                int i33 = i31 + 2;
                this.f76307g = i33;
                bArr8[i32] = (byte) ((r1 >> 14) & 255);
                this.f76307g = i31 + 3;
                bArr8[i33] = (byte) (r5 & 255);
                break;
            case 7:
                this.f76280r = this.f76280r >> 3;
                byte[] bArr9 = this.f76306f;
                int i34 = this.f76307g;
                int i35 = i34 + 1;
                this.f76307g = i35;
                bArr9[i34] = (byte) ((r1 >> 27) & 255);
                int i36 = i34 + 2;
                this.f76307g = i36;
                bArr9[i35] = (byte) ((r1 >> 19) & 255);
                int i37 = i34 + 3;
                this.f76307g = i37;
                bArr9[i36] = (byte) ((r1 >> 11) & 255);
                this.f76307g = i34 + 4;
                bArr9[i37] = (byte) (r4 & 255);
                break;
        }
    }

    @Override // o60.g
    public void g(byte[] bArr, int i11, int i12) {
        int i13;
        if (this.f76309i) {
            return;
        }
        if (i12 >= 0) {
            int i14 = i11;
            int i15 = 0;
            while (i15 < i12) {
                j(this.f76283u);
                int i16 = (this.f76311k + 1) % 5;
                this.f76311k = i16;
                int i17 = i14 + 1;
                int i18 = bArr[i14];
                if (i18 < 0) {
                    i18 += 256;
                }
                long j11 = (this.f76280r << 8) + i18;
                this.f76280r = j11;
                if (i16 == 0) {
                    byte[] bArr2 = this.f76306f;
                    int i19 = this.f76307g;
                    int i21 = i19 + 1;
                    this.f76307g = i21;
                    byte[] bArr3 = this.f76284v;
                    bArr2[i19] = bArr3[((int) (j11 >> 35)) & 31];
                    int i22 = i19 + 2;
                    this.f76307g = i22;
                    i13 = i17;
                    bArr2[i21] = bArr3[((int) (j11 >> 30)) & 31];
                    int i23 = i19 + 3;
                    this.f76307g = i23;
                    bArr2[i22] = bArr3[((int) (j11 >> 25)) & 31];
                    int i24 = i19 + 4;
                    this.f76307g = i24;
                    bArr2[i23] = bArr3[((int) (j11 >> 20)) & 31];
                    int i25 = i19 + 5;
                    this.f76307g = i25;
                    bArr2[i24] = bArr3[((int) (j11 >> 15)) & 31];
                    int i26 = i19 + 6;
                    this.f76307g = i26;
                    bArr2[i25] = bArr3[((int) (j11 >> 10)) & 31];
                    int i27 = i19 + 7;
                    this.f76307g = i27;
                    bArr2[i26] = bArr3[((int) (j11 >> 5)) & 31];
                    int i28 = i19 + 8;
                    this.f76307g = i28;
                    bArr2[i27] = bArr3[((int) j11) & 31];
                    int i29 = this.f76310j + 8;
                    this.f76310j = i29;
                    int i31 = this.f76304d;
                    if (i31 > 0 && i31 <= i29) {
                        byte[] bArr4 = this.f76285w;
                        System.arraycopy(bArr4, 0, bArr2, i28, bArr4.length);
                        this.f76307g += this.f76285w.length;
                        this.f76310j = 0;
                    }
                } else {
                    i13 = i17;
                }
                i15++;
                i14 = i13;
            }
            return;
        }
        this.f76309i = true;
        if (this.f76311k == 0 && this.f76304d == 0) {
            return;
        }
        j(this.f76283u);
        int i32 = this.f76307g;
        int i33 = this.f76311k;
        if (i33 == 1) {
            byte[] bArr5 = this.f76306f;
            int i34 = i32 + 1;
            this.f76307g = i34;
            byte[] bArr6 = this.f76284v;
            long j12 = this.f76280r;
            bArr5[i32] = bArr6[((int) (j12 >> 3)) & 31];
            int i35 = i32 + 2;
            this.f76307g = i35;
            bArr5[i34] = bArr6[((int) (j12 << 2)) & 31];
            int i36 = i32 + 3;
            this.f76307g = i36;
            bArr5[i35] = 61;
            int i37 = i32 + 4;
            this.f76307g = i37;
            bArr5[i36] = 61;
            int i38 = i32 + 5;
            this.f76307g = i38;
            bArr5[i37] = 61;
            int i39 = i32 + 6;
            this.f76307g = i39;
            bArr5[i38] = 61;
            int i41 = i32 + 7;
            this.f76307g = i41;
            bArr5[i39] = 61;
            this.f76307g = i32 + 8;
            bArr5[i41] = 61;
        } else if (i33 == 2) {
            byte[] bArr7 = this.f76306f;
            int i42 = i32 + 1;
            this.f76307g = i42;
            byte[] bArr8 = this.f76284v;
            long j13 = this.f76280r;
            bArr7[i32] = bArr8[((int) (j13 >> 11)) & 31];
            int i43 = i32 + 2;
            this.f76307g = i43;
            bArr7[i42] = bArr8[((int) (j13 >> 6)) & 31];
            int i44 = i32 + 3;
            this.f76307g = i44;
            bArr7[i43] = bArr8[((int) (j13 >> 1)) & 31];
            int i45 = i32 + 4;
            this.f76307g = i45;
            bArr7[i44] = bArr8[((int) (j13 << 4)) & 31];
            int i46 = i32 + 5;
            this.f76307g = i46;
            bArr7[i45] = 61;
            int i47 = i32 + 6;
            this.f76307g = i47;
            bArr7[i46] = 61;
            int i48 = i32 + 7;
            this.f76307g = i48;
            bArr7[i47] = 61;
            this.f76307g = i32 + 8;
            bArr7[i48] = 61;
        } else if (i33 == 3) {
            byte[] bArr9 = this.f76306f;
            int i49 = i32 + 1;
            this.f76307g = i49;
            byte[] bArr10 = this.f76284v;
            long j14 = this.f76280r;
            bArr9[i32] = bArr10[((int) (j14 >> 19)) & 31];
            int i51 = i32 + 2;
            this.f76307g = i51;
            bArr9[i49] = bArr10[((int) (j14 >> 14)) & 31];
            int i52 = i32 + 3;
            this.f76307g = i52;
            bArr9[i51] = bArr10[((int) (j14 >> 9)) & 31];
            int i53 = i32 + 4;
            this.f76307g = i53;
            bArr9[i52] = bArr10[((int) (j14 >> 4)) & 31];
            int i54 = i32 + 5;
            this.f76307g = i54;
            bArr9[i53] = bArr10[((int) (j14 << 1)) & 31];
            int i55 = i32 + 6;
            this.f76307g = i55;
            bArr9[i54] = 61;
            int i56 = i32 + 7;
            this.f76307g = i56;
            bArr9[i55] = 61;
            this.f76307g = i32 + 8;
            bArr9[i56] = 61;
        } else if (i33 == 4) {
            byte[] bArr11 = this.f76306f;
            int i57 = i32 + 1;
            this.f76307g = i57;
            byte[] bArr12 = this.f76284v;
            long j15 = this.f76280r;
            bArr11[i32] = bArr12[((int) (j15 >> 27)) & 31];
            int i58 = i32 + 2;
            this.f76307g = i58;
            bArr11[i57] = bArr12[((int) (j15 >> 22)) & 31];
            int i59 = i32 + 3;
            this.f76307g = i59;
            bArr11[i58] = bArr12[((int) (j15 >> 17)) & 31];
            int i61 = i32 + 4;
            this.f76307g = i61;
            bArr11[i59] = bArr12[((int) (j15 >> 12)) & 31];
            int i62 = i32 + 5;
            this.f76307g = i62;
            bArr11[i61] = bArr12[((int) (j15 >> 7)) & 31];
            int i63 = i32 + 6;
            this.f76307g = i63;
            bArr11[i62] = bArr12[((int) (j15 >> 2)) & 31];
            int i64 = i32 + 7;
            this.f76307g = i64;
            bArr11[i63] = bArr12[((int) (j15 << 3)) & 31];
            this.f76307g = i32 + 8;
            bArr11[i64] = 61;
        }
        int i65 = this.f76310j;
        int i66 = this.f76307g;
        int i67 = i65 + (i66 - i32);
        this.f76310j = i67;
        if (this.f76304d <= 0 || i67 <= 0) {
            return;
        }
        byte[] bArr13 = this.f76285w;
        System.arraycopy(bArr13, 0, this.f76306f, i66, bArr13.length);
        this.f76307g += this.f76285w.length;
    }

    @Override // o60.g
    public boolean n(byte b11) {
        if (b11 < 0) {
            return false;
        }
        byte[] bArr = this.f76282t;
        return b11 < bArr.length && bArr[b11] != -1;
    }

    public a(boolean z11) {
        this(0, null, z11);
    }

    public a(int i11) {
        this(i11, A);
    }

    public a(int i11, byte[] bArr) {
        this(i11, bArr, false);
    }

    public a(int i11, byte[] bArr, boolean z11) {
        super(5, 8, i11, bArr == null ? 0 : bArr.length);
        if (z11) {
            this.f76284v = E;
            this.f76282t = D;
        } else {
            this.f76284v = C;
            this.f76282t = B;
        }
        if (i11 <= 0) {
            this.f76283u = 8;
            this.f76285w = null;
        } else if (bArr != null) {
            if (!d(bArr)) {
                this.f76283u = bArr.length + 8;
                byte[] bArr2 = new byte[bArr.length];
                this.f76285w = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                throw new IllegalArgumentException("lineSeparator must not contain Base32 characters: [" + l.o(bArr) + "]");
            }
        } else {
            throw new IllegalArgumentException("lineLength " + i11 + " > 0, but lineSeparator is null");
        }
        this.f76281s = this.f76283u - 1;
    }
}
