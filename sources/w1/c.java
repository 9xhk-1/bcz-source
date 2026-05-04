package w1;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c {
    public static final int A = 3;
    public static final int B = 4;
    public static final int C = 5;
    public static final int D = 6;
    public static final int E = 7;
    public static final int F = 8;
    public static final com.badlogic.gdx.graphics.b G = new com.badlogic.gdx.graphics.b();

    /* renamed from: x, reason: collision with root package name */
    public static final int f94451x = 0;

    /* renamed from: y, reason: collision with root package name */
    public static final int f94452y = 1;

    /* renamed from: z, reason: collision with root package name */
    public static final int f94453z = 2;

    /* renamed from: a, reason: collision with root package name */
    public Texture f94454a;

    /* renamed from: b, reason: collision with root package name */
    public int f94455b;

    /* renamed from: c, reason: collision with root package name */
    public int f94456c;

    /* renamed from: d, reason: collision with root package name */
    public int f94457d;

    /* renamed from: e, reason: collision with root package name */
    public int f94458e;

    /* renamed from: f, reason: collision with root package name */
    public int f94459f;

    /* renamed from: g, reason: collision with root package name */
    public int f94460g;

    /* renamed from: h, reason: collision with root package name */
    public int f94461h;

    /* renamed from: i, reason: collision with root package name */
    public int f94462i;

    /* renamed from: j, reason: collision with root package name */
    public int f94463j;

    /* renamed from: k, reason: collision with root package name */
    public float f94464k;

    /* renamed from: l, reason: collision with root package name */
    public float f94465l;

    /* renamed from: m, reason: collision with root package name */
    public float f94466m;

    /* renamed from: n, reason: collision with root package name */
    public float f94467n;

    /* renamed from: o, reason: collision with root package name */
    public float f94468o;

    /* renamed from: p, reason: collision with root package name */
    public float f94469p;

    /* renamed from: q, reason: collision with root package name */
    public float[] f94470q;

    /* renamed from: r, reason: collision with root package name */
    public int f94471r;

    /* renamed from: s, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.b f94472s;

    /* renamed from: t, reason: collision with root package name */
    public float f94473t;

    /* renamed from: u, reason: collision with root package name */
    public float f94474u;

    /* renamed from: v, reason: collision with root package name */
    public float f94475v;

    /* renamed from: w, reason: collision with root package name */
    public float f94476w;

    public c(Texture texture, int i11, int i12, int i13, int i14) {
        this(new o(texture), i11, i12, i13, i14);
    }

    public void A(float f11) {
        this.f94476w = f11;
    }

    public void B(float f11) {
        this.f94473t = f11;
    }

    public void C(float f11) {
        this.f94474u = f11;
    }

    public void D(float f11) {
        this.f94475v = f11;
    }

    public void E(float f11, float f12, float f13, float f14) {
        this.f94473t = f11;
        this.f94474u = f12;
        this.f94475v = f13;
        this.f94476w = f14;
    }

    public void F(float f11) {
        this.f94465l = f11;
    }

    public void G(float f11) {
        this.f94468o = f11;
    }

    public final int a(o oVar, boolean z11, boolean z12) {
        Texture texture = this.f94454a;
        if (texture == null) {
            this.f94454a = oVar.f();
        } else if (texture != oVar.f()) {
            throw new IllegalArgumentException("All regions must be from the same texture.");
        }
        float f11 = oVar.f94612b;
        float f12 = oVar.f94615e;
        float f13 = oVar.f94614d;
        float f14 = oVar.f94613c;
        Texture.TextureFilter R = this.f94454a.R();
        Texture.TextureFilter textureFilter = Texture.TextureFilter.Linear;
        if (R == textureFilter || this.f94454a.Z() == textureFilter) {
            if (z11) {
                float C0 = 0.5f / this.f94454a.C0();
                f11 += C0;
                f13 -= C0;
            }
            if (z12) {
                float I = 0.5f / this.f94454a.I();
                f12 -= I;
                f14 += I;
            }
        }
        float[] fArr = this.f94470q;
        int i11 = this.f94471r;
        fArr[i11 + 3] = f11;
        fArr[i11 + 4] = f12;
        fArr[i11 + 8] = f11;
        fArr[i11 + 9] = f14;
        fArr[i11 + 13] = f13;
        fArr[i11 + 14] = f14;
        fArr[i11 + 18] = f13;
        fArr[i11 + 19] = f12;
        this.f94471r = i11 + 20;
        return i11;
    }

    public void b(a aVar, float f11, float f12, float f13, float f14) {
        s(aVar, f11, f12, f13, f14);
        aVar.t0(this.f94454a, this.f94470q, 0, this.f94471r);
    }

    public void c(a aVar, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        s(aVar, f11, f12, f15, f16);
        float f21 = f11 + f13;
        float f22 = f12 + f14;
        int i11 = this.f94471r;
        float[] fArr = this.f94470q;
        if (f19 != 0.0f) {
            for (int i12 = 0; i12 < i11; i12 += 5) {
                float f23 = (fArr[i12] - f21) * f17;
                int i13 = i12 + 1;
                float f24 = (fArr[i13] - f22) * f18;
                float t11 = com.badlogic.gdx.math.n.t(f19);
                float a02 = com.badlogic.gdx.math.n.a0(f19);
                fArr[i12] = ((t11 * f23) - (a02 * f24)) + f21;
                fArr[i13] = (a02 * f23) + (t11 * f24) + f22;
            }
        } else if (f17 != 1.0f || f18 != 1.0f) {
            for (int i14 = 0; i14 < i11; i14 += 5) {
                fArr[i14] = ((fArr[i14] - f21) * f17) + f21;
                int i15 = i14 + 1;
                fArr[i15] = ((fArr[i15] - f22) * f18) + f22;
            }
        }
        aVar.t0(this.f94454a, fArr, 0, i11);
    }

    public float d() {
        return this.f94469p;
    }

    public com.badlogic.gdx.graphics.b e() {
        return this.f94472s;
    }

    public float f() {
        return this.f94464k;
    }

    public float g() {
        return this.f94467n;
    }

    public float h() {
        return this.f94466m;
    }

    public float i() {
        float f11 = this.f94476w;
        return f11 == -1.0f ? d() : f11;
    }

    public float j() {
        float f11 = this.f94473t;
        return f11 == -1.0f ? f() : f11;
    }

    public float k() {
        float f11 = this.f94474u;
        return f11 == -1.0f ? m() : f11;
    }

    public float l() {
        float f11 = this.f94475v;
        return f11 == -1.0f ? o() : f11;
    }

    public float m() {
        return this.f94465l;
    }

    public Texture n() {
        return this.f94454a;
    }

    public float o() {
        return this.f94468o;
    }

    public float p() {
        return this.f94468o + this.f94467n + this.f94469p;
    }

    public float q() {
        return this.f94464k + this.f94466m + this.f94465l;
    }

    public final void r(o[] oVarArr) {
        o oVar = oVarArr[6];
        if (oVar != null) {
            this.f94455b = a(oVar, false, false);
            this.f94464k = oVarArr[6].c();
            this.f94469p = oVarArr[6].b();
        } else {
            this.f94455b = -1;
        }
        o oVar2 = oVarArr[7];
        if (oVar2 != null) {
            this.f94456c = a(oVar2, (oVarArr[6] == null && oVarArr[8] == null) ? false : true, false);
            this.f94466m = Math.max(this.f94466m, oVarArr[7].c());
            this.f94469p = Math.max(this.f94469p, oVarArr[7].b());
        } else {
            this.f94456c = -1;
        }
        o oVar3 = oVarArr[8];
        if (oVar3 != null) {
            this.f94457d = a(oVar3, false, false);
            this.f94465l = Math.max(this.f94465l, oVarArr[8].c());
            this.f94469p = Math.max(this.f94469p, oVarArr[8].b());
        } else {
            this.f94457d = -1;
        }
        o oVar4 = oVarArr[3];
        if (oVar4 != null) {
            this.f94458e = a(oVar4, false, (oVarArr[0] == null && oVarArr[6] == null) ? false : true);
            this.f94464k = Math.max(this.f94464k, oVarArr[3].c());
            this.f94467n = Math.max(this.f94467n, oVarArr[3].b());
        } else {
            this.f94458e = -1;
        }
        o oVar5 = oVarArr[4];
        if (oVar5 != null) {
            this.f94459f = a(oVar5, (oVarArr[3] == null && oVarArr[5] == null) ? false : true, (oVarArr[1] == null && oVarArr[7] == null) ? false : true);
            this.f94466m = Math.max(this.f94466m, oVarArr[4].c());
            this.f94467n = Math.max(this.f94467n, oVarArr[4].b());
        } else {
            this.f94459f = -1;
        }
        o oVar6 = oVarArr[5];
        if (oVar6 != null) {
            this.f94460g = a(oVar6, false, (oVarArr[2] == null && oVarArr[8] == null) ? false : true);
            this.f94465l = Math.max(this.f94465l, oVarArr[5].c());
            this.f94467n = Math.max(this.f94467n, oVarArr[5].b());
        } else {
            this.f94460g = -1;
        }
        o oVar7 = oVarArr[0];
        if (oVar7 != null) {
            this.f94461h = a(oVar7, false, false);
            this.f94464k = Math.max(this.f94464k, oVarArr[0].c());
            this.f94468o = Math.max(this.f94468o, oVarArr[0].b());
        } else {
            this.f94461h = -1;
        }
        o oVar8 = oVarArr[1];
        if (oVar8 != null) {
            this.f94462i = a(oVar8, (oVarArr[0] == null && oVarArr[2] == null) ? false : true, false);
            this.f94466m = Math.max(this.f94466m, oVarArr[1].c());
            this.f94468o = Math.max(this.f94468o, oVarArr[1].b());
        } else {
            this.f94462i = -1;
        }
        o oVar9 = oVarArr[2];
        if (oVar9 != null) {
            this.f94463j = a(oVar9, false, false);
            this.f94465l = Math.max(this.f94465l, oVarArr[2].c());
            this.f94468o = Math.max(this.f94468o, oVarArr[2].b());
        } else {
            this.f94463j = -1;
        }
        int i11 = this.f94471r;
        float[] fArr = this.f94470q;
        if (i11 < fArr.length) {
            float[] fArr2 = new float[i11];
            System.arraycopy(fArr, 0, fArr2, 0, i11);
            this.f94470q = fArr2;
        }
    }

    public final void s(a aVar, float f11, float f12, float f13, float f14) {
        float f15;
        float f16;
        float f17;
        float f18 = this.f94464k;
        float f19 = f11 + f18;
        float f21 = this.f94469p;
        float f22 = f12 + f21;
        float f23 = this.f94465l;
        float f24 = (f13 - f23) - f18;
        float f25 = this.f94468o;
        float f26 = (f14 - f25) - f21;
        float f27 = (f11 + f13) - f23;
        float f28 = (f12 + f14) - f25;
        float L = G.H(this.f94472s).r(aVar.e()).L();
        int i11 = this.f94455b;
        if (i11 != -1) {
            u(i11, f11, f12, this.f94464k, this.f94469p, L);
        }
        int i12 = this.f94456c;
        if (i12 != -1) {
            u(i12, f19, f12, f24, this.f94469p, L);
        }
        int i13 = this.f94457d;
        if (i13 != -1) {
            u(i13, f27, f12, this.f94465l, this.f94469p, L);
        }
        int i14 = this.f94458e;
        if (i14 != -1) {
            f15 = f22;
            f16 = f26;
            u(i14, f11, f15, this.f94464k, f16, L);
        } else {
            f15 = f22;
            f16 = f26;
        }
        int i15 = this.f94459f;
        if (i15 != -1) {
            u(i15, f19, f15, f24, f16, L);
        }
        int i16 = this.f94460g;
        if (i16 != -1) {
            u(i16, f27, f15, this.f94465l, f16, L);
        }
        int i17 = this.f94461h;
        if (i17 != -1) {
            f17 = f28;
            u(i17, f11, f17, this.f94464k, this.f94468o, L);
        } else {
            f17 = f28;
        }
        int i18 = this.f94462i;
        if (i18 != -1) {
            u(i18, f19, f17, f24, this.f94468o, L);
        }
        int i19 = this.f94463j;
        if (i19 != -1) {
            u(i19, f27, f17, this.f94465l, this.f94468o, L);
        }
    }

    public void t(float f11, float f12) {
        this.f94464k *= f11;
        this.f94465l *= f11;
        this.f94468o *= f12;
        this.f94469p *= f12;
        this.f94466m *= f11;
        this.f94467n *= f12;
        float f13 = this.f94473t;
        if (f13 != -1.0f) {
            this.f94473t = f13 * f11;
        }
        float f14 = this.f94474u;
        if (f14 != -1.0f) {
            this.f94474u = f14 * f11;
        }
        float f15 = this.f94475v;
        if (f15 != -1.0f) {
            this.f94475v = f15 * f12;
        }
        float f16 = this.f94476w;
        if (f16 != -1.0f) {
            this.f94476w = f16 * f12;
        }
    }

    public final void u(int i11, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f13 + f11;
        float f17 = f14 + f12;
        float[] fArr = this.f94470q;
        fArr[i11] = f11;
        fArr[i11 + 1] = f12;
        fArr[i11 + 2] = f15;
        fArr[i11 + 5] = f11;
        fArr[i11 + 6] = f17;
        fArr[i11 + 7] = f15;
        fArr[i11 + 10] = f16;
        fArr[i11 + 11] = f17;
        fArr[i11 + 12] = f15;
        fArr[i11 + 15] = f16;
        fArr[i11 + 16] = f12;
        fArr[i11 + 17] = f15;
    }

    public void v(float f11) {
        this.f94469p = f11;
    }

    public void w(com.badlogic.gdx.graphics.b bVar) {
        this.f94472s.H(bVar);
    }

    public void x(float f11) {
        this.f94464k = f11;
    }

    public void y(float f11) {
        this.f94467n = f11;
    }

    public void z(float f11) {
        this.f94466m = f11;
    }

    public c(o oVar, int i11, int i12, int i13, int i14) {
        this.f94470q = new float[180];
        this.f94472s = new com.badlogic.gdx.graphics.b(com.badlogic.gdx.graphics.b.f11522e);
        this.f94473t = -1.0f;
        this.f94474u = -1.0f;
        this.f94475v = -1.0f;
        this.f94476w = -1.0f;
        if (oVar == null) {
            throw new IllegalArgumentException("region cannot be null.");
        }
        int c11 = (oVar.c() - i11) - i12;
        int b11 = (oVar.b() - i13) - i14;
        o[] oVarArr = new o[9];
        if (i13 > 0) {
            if (i11 > 0) {
                oVarArr[0] = new o(oVar, 0, 0, i11, i13);
            }
            if (c11 > 0) {
                oVarArr[1] = new o(oVar, i11, 0, c11, i13);
            }
            if (i12 > 0) {
                oVarArr[2] = new o(oVar, i11 + c11, 0, i12, i13);
            }
        }
        if (b11 > 0) {
            if (i11 > 0) {
                oVarArr[3] = new o(oVar, 0, i13, i11, b11);
            }
            if (c11 > 0) {
                oVarArr[4] = new o(oVar, i11, i13, c11, b11);
            }
            if (i12 > 0) {
                oVarArr[5] = new o(oVar, i11 + c11, i13, i12, b11);
            }
        }
        if (i14 > 0) {
            if (i11 > 0) {
                oVarArr[6] = new o(oVar, 0, i13 + b11, i11, i14);
            }
            if (c11 > 0) {
                oVarArr[7] = new o(oVar, i11, i13 + b11, c11, i14);
            }
            if (i12 > 0) {
                oVarArr[8] = new o(oVar, i11 + c11, i13 + b11, i12, i14);
            }
        }
        if (i11 == 0 && c11 == 0) {
            oVarArr[1] = oVarArr[2];
            oVarArr[4] = oVarArr[5];
            oVarArr[7] = oVarArr[8];
            oVarArr[2] = null;
            oVarArr[5] = null;
            oVarArr[8] = null;
        }
        if (i13 == 0 && b11 == 0) {
            oVarArr[3] = oVarArr[6];
            oVarArr[4] = oVarArr[7];
            oVarArr[5] = oVarArr[8];
            oVarArr[6] = null;
            oVarArr[7] = null;
            oVarArr[8] = null;
        }
        r(oVarArr);
    }

    public c(Texture texture, com.badlogic.gdx.graphics.b bVar) {
        this(texture);
        w(bVar);
    }

    public c(Texture texture) {
        this(new o(texture));
    }

    public c(o oVar, com.badlogic.gdx.graphics.b bVar) {
        this(oVar);
        w(bVar);
    }

    public c(o oVar) {
        this.f94470q = new float[180];
        this.f94472s = new com.badlogic.gdx.graphics.b(com.badlogic.gdx.graphics.b.f11522e);
        this.f94473t = -1.0f;
        this.f94474u = -1.0f;
        this.f94475v = -1.0f;
        this.f94476w = -1.0f;
        r(new o[]{null, null, null, null, oVar, null, null, null, null});
    }

    public c(o... oVarArr) {
        o oVar;
        o oVar2;
        o oVar3;
        o oVar4;
        o oVar5;
        o oVar6;
        o oVar7;
        o oVar8;
        this.f94470q = new float[180];
        this.f94472s = new com.badlogic.gdx.graphics.b(com.badlogic.gdx.graphics.b.f11522e);
        this.f94473t = -1.0f;
        this.f94474u = -1.0f;
        this.f94475v = -1.0f;
        this.f94476w = -1.0f;
        if (oVarArr != null && oVarArr.length == 9) {
            r(oVarArr);
            if ((oVarArr[0] != null && r1.c() != this.f94464k) || (((oVar = oVarArr[3]) != null && oVar.c() != this.f94464k) || ((oVar2 = oVarArr[6]) != null && oVar2.c() != this.f94464k))) {
                throw new GdxRuntimeException("Left side patches must have the same width");
            }
            if ((oVarArr[2] != null && r3.c() != this.f94465l) || (((oVar3 = oVarArr[5]) != null && oVar3.c() != this.f94465l) || ((oVar4 = oVarArr[8]) != null && oVar4.c() != this.f94465l))) {
                throw new GdxRuntimeException("Right side patches must have the same width");
            }
            if ((oVarArr[6] != null && r1.b() != this.f94469p) || (((oVar5 = oVarArr[7]) != null && oVar5.b() != this.f94469p) || ((oVar6 = oVarArr[8]) != null && oVar6.b() != this.f94469p))) {
                throw new GdxRuntimeException("Bottom side patches must have the same height");
            }
            if ((oVarArr[0] != null && r0.b() != this.f94468o) || (((oVar7 = oVarArr[1]) != null && oVar7.b() != this.f94468o) || ((oVar8 = oVarArr[2]) != null && oVar8.b() != this.f94468o))) {
                throw new GdxRuntimeException("Top side patches must have the same height");
            }
            return;
        }
        throw new IllegalArgumentException("NinePatch needs nine TextureRegions");
    }

    public c(c cVar) {
        this(cVar, cVar.f94472s);
    }

    public c(c cVar, com.badlogic.gdx.graphics.b bVar) {
        this.f94470q = new float[180];
        com.badlogic.gdx.graphics.b bVar2 = new com.badlogic.gdx.graphics.b(com.badlogic.gdx.graphics.b.f11522e);
        this.f94472s = bVar2;
        this.f94473t = -1.0f;
        this.f94474u = -1.0f;
        this.f94475v = -1.0f;
        this.f94476w = -1.0f;
        this.f94454a = cVar.f94454a;
        this.f94455b = cVar.f94455b;
        this.f94456c = cVar.f94456c;
        this.f94457d = cVar.f94457d;
        this.f94458e = cVar.f94458e;
        this.f94459f = cVar.f94459f;
        this.f94460g = cVar.f94460g;
        this.f94461h = cVar.f94461h;
        this.f94462i = cVar.f94462i;
        this.f94463j = cVar.f94463j;
        this.f94464k = cVar.f94464k;
        this.f94465l = cVar.f94465l;
        this.f94466m = cVar.f94466m;
        this.f94467n = cVar.f94467n;
        this.f94468o = cVar.f94468o;
        this.f94469p = cVar.f94469p;
        this.f94473t = cVar.f94473t;
        this.f94475v = cVar.f94475v;
        this.f94476w = cVar.f94476w;
        this.f94474u = cVar.f94474u;
        float[] fArr = new float[cVar.f94470q.length];
        this.f94470q = fArr;
        float[] fArr2 = cVar.f94470q;
        System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
        this.f94471r = cVar.f94471r;
        bVar2.H(bVar);
    }
}
