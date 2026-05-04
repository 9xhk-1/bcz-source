package com.badlogic.gdx.math;

import a3.t0;
import a3.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e {

    /* renamed from: b, reason: collision with root package name */
    public float[] f12569b;

    /* renamed from: a, reason: collision with root package name */
    public final v f12568a = new v();

    /* renamed from: c, reason: collision with root package name */
    public final a3.r f12570c = new a3.r();

    /* renamed from: d, reason: collision with root package name */
    public final v f12571d = new v();

    /* renamed from: e, reason: collision with root package name */
    public final t0 f12572e = new t0(false, 0);

    public final float a(float f11, float f12) {
        a3.r rVar = this.f12570c;
        int i11 = rVar.f1626b;
        float n11 = rVar.n(i11 - 4);
        float n12 = rVar.n(i11 - 3);
        return ((rVar.n(i11 - 2) - n11) * (f12 - n12)) - ((rVar.y() - n12) * (f11 - n11));
    }

    public v b(a3.r rVar, boolean z11, boolean z12) {
        return c(rVar.f1625a, 0, rVar.f1626b, z11, z12);
    }

    public v c(float[] fArr, int i11, int i12, boolean z11, boolean z12) {
        if (i12 > 32767) {
            throw new IllegalArgumentException("count must be <= 32767");
        }
        int i13 = i11 + i12;
        if (z11) {
            i12 = i13;
        } else {
            float[] fArr2 = this.f12569b;
            if (fArr2 == null || fArr2.length < i12) {
                this.f12569b = new float[i12];
            }
            System.arraycopy(fArr, i11, this.f12569b, 0, i12);
            fArr = this.f12569b;
            k(fArr, i12, z12);
            i11 = 0;
        }
        v vVar = this.f12571d;
        vVar.i();
        a3.r rVar = this.f12570c;
        rVar.i();
        int i14 = i11 / 2;
        int i15 = i11;
        while (i15 < i12) {
            float f11 = fArr[i15];
            float f12 = fArr[i15 + 1];
            while (rVar.f1626b >= 4 && a(f11, f12) <= 0.0f) {
                rVar.f1626b -= 2;
                vVar.f1640b--;
            }
            rVar.a(f11);
            rVar.a(f12);
            vVar.a(i14);
            i15 += 2;
            i14++;
        }
        int i16 = i12 - 4;
        int i17 = i16 / 2;
        int i18 = rVar.f1626b + 2;
        while (i16 >= i11) {
            float f13 = fArr[i16];
            float f14 = fArr[i16 + 1];
            while (rVar.f1626b >= i18 && a(f13, f14) <= 0.0f) {
                rVar.f1626b -= 2;
                vVar.f1640b--;
            }
            rVar.a(f13);
            rVar.a(f14);
            vVar.a(i17);
            i16 -= 2;
            i17--;
        }
        if (!z11) {
            short[] sArr = this.f12572e.f1633a;
            int[] iArr = vVar.f1639a;
            int i19 = vVar.f1640b;
            for (int i21 = 0; i21 < i19; i21++) {
                iArr[i21] = sArr[iArr[i21]];
            }
        }
        return vVar;
    }

    public v d(float[] fArr, boolean z11, boolean z12) {
        return c(fArr, 0, fArr.length, z11, z12);
    }

    public a3.r e(a3.r rVar, boolean z11) {
        return f(rVar.f1625a, 0, rVar.f1626b, z11);
    }

    public a3.r f(float[] fArr, int i11, int i12, boolean z11) {
        int i13 = i11 + i12;
        if (z11) {
            i12 = i13;
        } else {
            float[] fArr2 = this.f12569b;
            if (fArr2 == null || fArr2.length < i12) {
                this.f12569b = new float[i12];
            }
            System.arraycopy(fArr, i11, this.f12569b, 0, i12);
            fArr = this.f12569b;
            j(fArr, i12);
            i11 = 0;
        }
        a3.r rVar = this.f12570c;
        rVar.i();
        for (int i14 = i11; i14 < i12; i14 += 2) {
            float f11 = fArr[i14];
            float f12 = fArr[i14 + 1];
            while (rVar.f1626b >= 4 && a(f11, f12) <= 0.0f) {
                rVar.f1626b -= 2;
            }
            rVar.a(f11);
            rVar.a(f12);
        }
        int i15 = rVar.f1626b + 2;
        for (int i16 = i12 - 4; i16 >= i11; i16 -= 2) {
            float f13 = fArr[i16];
            float f14 = fArr[i16 + 1];
            while (rVar.f1626b >= i15 && a(f13, f14) <= 0.0f) {
                rVar.f1626b -= 2;
            }
            rVar.a(f13);
            rVar.a(f14);
        }
        return rVar;
    }

    public a3.r g(float[] fArr, boolean z11) {
        return f(fArr, 0, fArr.length, z11);
    }

    public final int h(float[] fArr, int i11, int i12) {
        float f11;
        float f12 = fArr[i11];
        int i13 = i11 + 1;
        float f13 = fArr[i13];
        int i14 = i11;
        while (i14 < i12) {
            while (i14 < i12 && fArr[i14] <= f12) {
                i14 += 2;
            }
            while (true) {
                f11 = fArr[i12];
                if (f11 > f12 || (f11 == f12 && fArr[i12 + 1] < f13)) {
                    i12 -= 2;
                }
            }
            if (i14 < i12) {
                float f14 = fArr[i14];
                fArr[i14] = f11;
                fArr[i12] = f14;
                int i15 = i14 + 1;
                float f15 = fArr[i15];
                int i16 = i12 + 1;
                fArr[i15] = fArr[i16];
                fArr[i16] = f15;
            }
        }
        float f16 = fArr[i12];
        if (f12 <= f16 && (f12 != f16 || f13 >= fArr[i12 + 1])) {
            return i12;
        }
        fArr[i11] = f16;
        fArr[i12] = f12;
        int i17 = i12 + 1;
        fArr[i13] = fArr[i17];
        fArr[i17] = f13;
        return i12;
    }

    public final int i(float[] fArr, int i11, int i12, boolean z11, short[] sArr) {
        float f11 = fArr[i11];
        int i13 = i11 + 1;
        float f12 = fArr[i13];
        int i14 = i11;
        while (i14 < i12) {
            while (i14 < i12 && fArr[i14] <= f11) {
                i14 += 2;
            }
            if (!z11) {
                while (true) {
                    float f13 = fArr[i12];
                    if (f13 <= f11 && (f13 != f11 || fArr[i12 + 1] <= f12)) {
                        break;
                    }
                    i12 -= 2;
                }
            } else {
                while (true) {
                    float f14 = fArr[i12];
                    if (f14 <= f11 && (f14 != f11 || fArr[i12 + 1] >= f12)) {
                        break;
                    }
                    i12 -= 2;
                }
            }
            if (i14 < i12) {
                float f15 = fArr[i14];
                fArr[i14] = fArr[i12];
                fArr[i12] = f15;
                int i15 = i14 + 1;
                float f16 = fArr[i15];
                int i16 = i12 + 1;
                fArr[i15] = fArr[i16];
                fArr[i16] = f16;
                int i17 = i14 / 2;
                short s11 = sArr[i17];
                int i18 = i12 / 2;
                sArr[i17] = sArr[i18];
                sArr[i18] = s11;
            }
        }
        float f17 = fArr[i12];
        if (f11 <= f17 && (f11 != f17 || (!z11 ? f12 > fArr[i12 + 1] : f12 < fArr[i12 + 1]))) {
            return i12;
        }
        fArr[i11] = f17;
        fArr[i12] = f11;
        int i19 = i12 + 1;
        fArr[i13] = fArr[i19];
        fArr[i19] = f12;
        int i21 = i11 / 2;
        short s12 = sArr[i21];
        int i22 = i12 / 2;
        sArr[i21] = sArr[i22];
        sArr[i22] = s12;
        return i12;
    }

    public final void j(float[] fArr, int i11) {
        v vVar = this.f12568a;
        vVar.a(0);
        vVar.a(i11 - 2);
        while (vVar.f1640b > 0) {
            int y11 = vVar.y();
            int y12 = vVar.y();
            if (y11 > y12) {
                int h11 = h(fArr, y12, y11);
                int i12 = h11 - y12;
                int i13 = y11 - h11;
                if (i12 > i13) {
                    vVar.a(y12);
                    vVar.a(h11 - 2);
                }
                vVar.a(h11 + 2);
                vVar.a(y11);
                if (i13 >= i12) {
                    vVar.a(y12);
                    vVar.a(h11 - 2);
                }
            }
        }
    }

    public final void k(float[] fArr, int i11, boolean z11) {
        int i12 = i11 / 2;
        this.f12572e.j();
        this.f12572e.l(i12);
        short[] sArr = this.f12572e.f1633a;
        for (short s11 = 0; s11 < i12; s11 = (short) (s11 + 1)) {
            sArr[s11] = s11;
        }
        v vVar = this.f12568a;
        vVar.a(0);
        vVar.a(i11 - 2);
        while (vVar.f1640b > 0) {
            int y11 = vVar.y();
            int y12 = vVar.y();
            if (y11 > y12) {
                float[] fArr2 = fArr;
                boolean z12 = z11;
                int i13 = i(fArr2, y12, y11, z12, sArr);
                int i14 = i13 - y12;
                int i15 = y11 - i13;
                if (i14 > i15) {
                    vVar.a(y12);
                    vVar.a(i13 - 2);
                }
                vVar.a(i13 + 2);
                vVar.a(y11);
                if (i15 >= i14) {
                    vVar.a(y12);
                    vVar.a(i13 - 2);
                }
                fArr = fArr2;
                z11 = z12;
            }
        }
    }
}
