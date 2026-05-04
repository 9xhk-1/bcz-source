package op;

import com.google.zxing.FormatException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final kp.b f77605a;

    /* renamed from: b, reason: collision with root package name */
    public final kp.b f77606b;

    /* renamed from: c, reason: collision with root package name */
    public final e f77607c;

    public a(kp.b bVar) throws FormatException {
        int h11 = bVar.h();
        if (h11 < 8 || h11 > 144 || (h11 & 1) != 0) {
            throw FormatException.getFormatInstance();
        }
        this.f77607c = j(bVar);
        kp.b a11 = a(bVar);
        this.f77605a = a11;
        this.f77606b = new kp.b(a11.m(), a11.h());
    }

    public static e j(kp.b bVar) throws FormatException {
        return e.h(bVar.h(), bVar.m());
    }

    public final kp.b a(kp.b bVar) {
        int f11 = this.f77607c.f();
        int e11 = this.f77607c.e();
        if (bVar.h() != f11) {
            throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
        }
        int c11 = this.f77607c.c();
        int b11 = this.f77607c.b();
        int i11 = f11 / c11;
        int i12 = e11 / b11;
        kp.b bVar2 = new kp.b(i12 * b11, i11 * c11);
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = i13 * c11;
            for (int i15 = 0; i15 < i12; i15++) {
                int i16 = i15 * b11;
                for (int i17 = 0; i17 < c11; i17++) {
                    int i18 = ((c11 + 2) * i13) + 1 + i17;
                    int i19 = i14 + i17;
                    for (int i21 = 0; i21 < b11; i21++) {
                        if (bVar.e(((b11 + 2) * i15) + 1 + i21, i18)) {
                            bVar2.q(i16 + i21, i19);
                        }
                    }
                }
            }
        }
        return bVar2;
    }

    public e b() {
        return this.f77607c;
    }

    public byte[] c() throws FormatException {
        byte[] bArr = new byte[this.f77607c.g()];
        int h11 = this.f77605a.h();
        int m11 = this.f77605a.m();
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        int i13 = 4;
        while (true) {
            if (i13 == h11 && i11 == 0 && !z11) {
                bArr[i12] = (byte) d(h11, m11);
                i13 -= 2;
                i11 += 2;
                i12++;
                z11 = true;
            } else {
                int i14 = h11 - 2;
                if (i13 == i14 && i11 == 0 && (m11 & 3) != 0 && !z12) {
                    bArr[i12] = (byte) e(h11, m11);
                    i13 -= 2;
                    i11 += 2;
                    i12++;
                    z12 = true;
                } else if (i13 == h11 + 4 && i11 == 2 && (m11 & 7) == 0 && !z13) {
                    bArr[i12] = (byte) f(h11, m11);
                    i13 -= 2;
                    i11 += 2;
                    i12++;
                    z13 = true;
                } else if (i13 == i14 && i11 == 0 && (m11 & 7) == 4 && !z14) {
                    bArr[i12] = (byte) g(h11, m11);
                    i13 -= 2;
                    i11 += 2;
                    i12++;
                    z14 = true;
                } else {
                    while (true) {
                        if (i13 < h11 && i11 >= 0 && !this.f77606b.e(i11, i13)) {
                            bArr[i12] = (byte) i(i13, i11, h11, m11);
                            i12++;
                        }
                        int i15 = i13 - 2;
                        int i16 = i11 + 2;
                        if (i15 < 0 || i16 >= m11) {
                            break;
                        }
                        i13 = i15;
                        i11 = i16;
                    }
                    int i17 = i13 - 1;
                    int i18 = i11 + 5;
                    while (true) {
                        if (i17 >= 0 && i18 < m11 && !this.f77606b.e(i18, i17)) {
                            bArr[i12] = (byte) i(i17, i18, h11, m11);
                            i12++;
                        }
                        int i19 = i17 + 2;
                        int i21 = i18 - 2;
                        if (i19 >= h11 || i21 < 0) {
                            break;
                        }
                        i17 = i19;
                        i18 = i21;
                    }
                    i13 = i17 + 5;
                    i11 = i18 - 1;
                }
            }
            if (i13 >= h11 && i11 >= m11) {
                break;
            }
        }
        if (i12 == this.f77607c.g()) {
            return bArr;
        }
        throw FormatException.getFormatInstance();
    }

    public final int d(int i11, int i12) {
        int i13 = i11 - 1;
        int i14 = (h(i13, 0, i11, i12) ? 1 : 0) << 1;
        if (h(i13, 1, i11, i12)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (h(i13, 2, i11, i12)) {
            i15 |= 1;
        }
        int i16 = i15 << 1;
        if (h(0, i12 - 2, i11, i12)) {
            i16 |= 1;
        }
        int i17 = i16 << 1;
        int i18 = i12 - 1;
        if (h(0, i18, i11, i12)) {
            i17 |= 1;
        }
        int i19 = i17 << 1;
        if (h(1, i18, i11, i12)) {
            i19 |= 1;
        }
        int i21 = i19 << 1;
        if (h(2, i18, i11, i12)) {
            i21 |= 1;
        }
        int i22 = i21 << 1;
        return h(3, i18, i11, i12) ? i22 | 1 : i22;
    }

    public final int e(int i11, int i12) {
        int i13 = (h(i11 + (-3), 0, i11, i12) ? 1 : 0) << 1;
        if (h(i11 - 2, 0, i11, i12)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (h(i11 - 1, 0, i11, i12)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (h(0, i12 - 4, i11, i12)) {
            i15 |= 1;
        }
        int i16 = i15 << 1;
        if (h(0, i12 - 3, i11, i12)) {
            i16 |= 1;
        }
        int i17 = i16 << 1;
        if (h(0, i12 - 2, i11, i12)) {
            i17 |= 1;
        }
        int i18 = i17 << 1;
        int i19 = i12 - 1;
        if (h(0, i19, i11, i12)) {
            i18 |= 1;
        }
        int i21 = i18 << 1;
        return h(1, i19, i11, i12) ? i21 | 1 : i21;
    }

    public final int f(int i11, int i12) {
        int i13 = i11 - 1;
        int i14 = (h(i13, 0, i11, i12) ? 1 : 0) << 1;
        int i15 = i12 - 1;
        if (h(i13, i15, i11, i12)) {
            i14 |= 1;
        }
        int i16 = i14 << 1;
        int i17 = i12 - 3;
        if (h(0, i17, i11, i12)) {
            i16 |= 1;
        }
        int i18 = i16 << 1;
        int i19 = i12 - 2;
        if (h(0, i19, i11, i12)) {
            i18 |= 1;
        }
        int i21 = i18 << 1;
        if (h(0, i15, i11, i12)) {
            i21 |= 1;
        }
        int i22 = i21 << 1;
        if (h(1, i17, i11, i12)) {
            i22 |= 1;
        }
        int i23 = i22 << 1;
        if (h(1, i19, i11, i12)) {
            i23 |= 1;
        }
        int i24 = i23 << 1;
        return h(1, i15, i11, i12) ? i24 | 1 : i24;
    }

    public final int g(int i11, int i12) {
        int i13 = (h(i11 + (-3), 0, i11, i12) ? 1 : 0) << 1;
        if (h(i11 - 2, 0, i11, i12)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (h(i11 - 1, 0, i11, i12)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (h(0, i12 - 2, i11, i12)) {
            i15 |= 1;
        }
        int i16 = i15 << 1;
        int i17 = i12 - 1;
        if (h(0, i17, i11, i12)) {
            i16 |= 1;
        }
        int i18 = i16 << 1;
        if (h(1, i17, i11, i12)) {
            i18 |= 1;
        }
        int i19 = i18 << 1;
        if (h(2, i17, i11, i12)) {
            i19 |= 1;
        }
        int i21 = i19 << 1;
        return h(3, i17, i11, i12) ? i21 | 1 : i21;
    }

    public final boolean h(int i11, int i12, int i13, int i14) {
        if (i11 < 0) {
            i11 += i13;
            i12 += 4 - ((i13 + 4) & 7);
        }
        if (i12 < 0) {
            i12 += i14;
            i11 += 4 - ((i14 + 4) & 7);
        }
        this.f77606b.q(i12, i11);
        return this.f77605a.e(i12, i11);
    }

    public final int i(int i11, int i12, int i13, int i14) {
        int i15 = i11 - 2;
        int i16 = i12 - 2;
        int i17 = (h(i15, i16, i13, i14) ? 1 : 0) << 1;
        int i18 = i12 - 1;
        if (h(i15, i18, i13, i14)) {
            i17 |= 1;
        }
        int i19 = i17 << 1;
        int i21 = i11 - 1;
        if (h(i21, i16, i13, i14)) {
            i19 |= 1;
        }
        int i22 = i19 << 1;
        if (h(i21, i18, i13, i14)) {
            i22 |= 1;
        }
        int i23 = i22 << 1;
        if (h(i21, i12, i13, i14)) {
            i23 |= 1;
        }
        int i24 = i23 << 1;
        if (h(i11, i16, i13, i14)) {
            i24 |= 1;
        }
        int i25 = i24 << 1;
        if (h(i11, i18, i13, i14)) {
            i25 |= 1;
        }
        int i26 = i25 << 1;
        return h(i11, i12, i13, i14) ? i26 | 1 : i26;
    }
}
