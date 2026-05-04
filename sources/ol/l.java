package ol;

import a3.d0;
import a3.r;
import jl.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class l extends b {

    /* renamed from: g, reason: collision with root package name */
    public static int f77595g;

    /* renamed from: b, reason: collision with root package name */
    public final int f77596b;

    /* renamed from: c, reason: collision with root package name */
    @d0
    public b f77597c;

    /* renamed from: d, reason: collision with root package name */
    @d0
    public int[] f77598d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f77599e;

    /* renamed from: f, reason: collision with root package name */
    public int f77600f;

    public l(String str) {
        super(str);
        this.f77596b = p();
        this.f77597c = this;
    }

    public static synchronized int p() {
        int i11;
        synchronized (l.class) {
            i11 = f77595g;
            f77595g = i11 + 1;
        }
        return i11;
    }

    public void j(m mVar, int i11, int i12, float[] fArr, int i13, int i14) {
        int i15 = i13 + ((i12 >> 1) * i14);
        r f11 = mVar.f();
        float[] fArr2 = this.f77599e;
        int[] iArr = this.f77598d;
        if (iArr == null) {
            if (f11.f1626b > 0) {
                fArr2 = f11.f1625a;
            }
            com.esotericsoftware.spine.b b11 = mVar.b();
            float B = b11.B();
            float C = b11.C();
            float b12 = b11.b();
            float j11 = b11.j();
            float k11 = b11.k();
            float m11 = b11.m();
            int i16 = i11;
            int i17 = i13;
            while (i17 < i15) {
                float f12 = fArr2[i16];
                float f13 = fArr2[i16 + 1];
                fArr[i17] = (f12 * b12) + (f13 * j11) + B;
                fArr[i17 + 1] = (f12 * k11) + (f13 * m11) + C;
                i16 += 2;
                i17 += i14;
            }
            return;
        }
        int i18 = 0;
        int i19 = 0;
        for (int i21 = 0; i21 < i11; i21 += 2) {
            int i22 = iArr[i18];
            i18 += i22 + 1;
            i19 += i22;
        }
        com.esotericsoftware.spine.b[] bVarArr = mVar.h().i().f13178a;
        if (f11.f1626b == 0) {
            int i23 = i19 * 3;
            int i24 = i13;
            while (i24 < i15) {
                int i25 = i18 + 1;
                int i26 = iArr[i18] + i25;
                float f14 = 0.0f;
                float f15 = 0.0f;
                while (i25 < i26) {
                    com.esotericsoftware.spine.b bVar = bVarArr[iArr[i25]];
                    float f16 = fArr2[i23];
                    float f17 = fArr2[i23 + 1];
                    float f18 = fArr2[i23 + 2];
                    f14 += ((bVar.b() * f16) + (bVar.j() * f17) + bVar.B()) * f18;
                    f15 += ((f16 * bVar.k()) + (f17 * bVar.m()) + bVar.C()) * f18;
                    i25++;
                    i23 += 3;
                }
                fArr[i24] = f14;
                fArr[i24 + 1] = f15;
                i24 += i14;
                i18 = i25;
            }
            return;
        }
        float[] fArr3 = f11.f1625a;
        int i27 = i19 * 3;
        int i28 = i19 << 1;
        int i29 = i18;
        int i31 = i13;
        while (i31 < i15) {
            int i32 = i29 + 1;
            int i33 = iArr[i29] + i32;
            float f19 = 0.0f;
            float f21 = 0.0f;
            while (i32 < i33) {
                com.esotericsoftware.spine.b bVar2 = bVarArr[iArr[i32]];
                float f22 = fArr2[i27] + fArr3[i28];
                float f23 = fArr2[i27 + 1] + fArr3[i28 + 1];
                float f24 = fArr2[i27 + 2];
                f19 += ((bVar2.b() * f22) + (bVar2.j() * f23) + bVar2.B()) * f24;
                f21 += ((f22 * bVar2.k()) + (f23 * bVar2.m()) + bVar2.C()) * f24;
                i32++;
                i27 += 3;
                i28 += 2;
            }
            fArr[i31] = f19;
            fArr[i31 + 1] = f21;
            i31 += i14;
            i29 = i32;
        }
    }

    @d0
    public int[] k() {
        return this.f77598d;
    }

    public int l() {
        return this.f77596b;
    }

    @d0
    public b m() {
        return this.f77597c;
    }

    public float[] n() {
        return this.f77599e;
    }

    public int o() {
        return this.f77600f;
    }

    public void q(@d0 int[] iArr) {
        this.f77598d = iArr;
    }

    public void r(b bVar) {
        this.f77597c = bVar;
    }

    public void s(float[] fArr) {
        this.f77599e = fArr;
    }

    public void t(int i11) {
        this.f77600f = i11;
    }

    public l(l lVar) {
        super(lVar);
        this.f77596b = p();
        this.f77597c = this;
        this.f77597c = lVar.f77597c;
        int[] iArr = lVar.f77598d;
        if (iArr != null) {
            int[] iArr2 = new int[iArr.length];
            this.f77598d = iArr2;
            pl.g.a(lVar.f77598d, 0, iArr2, 0, iArr2.length);
        } else {
            this.f77598d = null;
        }
        float[] fArr = lVar.f77599e;
        if (fArr != null) {
            float[] fArr2 = new float[fArr.length];
            this.f77599e = fArr2;
            pl.g.a(lVar.f77599e, 0, fArr2, 0, fArr2.length);
        } else {
            this.f77599e = null;
        }
        this.f77600f = lVar.f77600f;
    }
}
