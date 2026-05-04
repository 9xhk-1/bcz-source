package jl;

import a3.d0;
import a3.j0;
import a3.r;
import com.esotericsoftware.spine.Skeleton;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public float f64350a;

    /* renamed from: b, reason: collision with root package name */
    public float f64351b;

    /* renamed from: c, reason: collision with root package name */
    public float f64352c;

    /* renamed from: d, reason: collision with root package name */
    public float f64353d;

    /* renamed from: e, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<ol.d> f64354e = new com.badlogic.gdx.utils.a<>();

    /* renamed from: f, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<r> f64355f = new com.badlogic.gdx.utils.a<>();

    /* renamed from: g, reason: collision with root package name */
    public j0<r> f64356g = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends j0 {
        public a() {
        }

        @Override // a3.j0
        public Object g() {
            return new r();
        }
    }

    public final void a() {
        com.badlogic.gdx.utils.a<r> aVar = this.f64355f;
        r[] rVarArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        float f11 = 2.14748365E9f;
        float f12 = -2.14748365E9f;
        float f13 = -2.14748365E9f;
        float f14 = 2.14748365E9f;
        for (int i12 = 0; i12 < i11; i12++) {
            r rVar = rVarArr[i12];
            float[] fArr = rVar.f1625a;
            int i13 = rVar.f1626b;
            for (int i14 = 0; i14 < i13; i14 += 2) {
                float f15 = fArr[i14];
                float f16 = fArr[i14 + 1];
                f11 = Math.min(f11, f15);
                f14 = Math.min(f14, f16);
                f12 = Math.max(f12, f15);
                f13 = Math.max(f13, f16);
            }
        }
        this.f64350a = f11;
        this.f64351b = f14;
        this.f64352c = f12;
        this.f64353d = f13;
    }

    public boolean b(float f11, float f12) {
        return f11 >= this.f64350a && f11 <= this.f64352c && f12 >= this.f64351b && f12 <= this.f64353d;
    }

    public boolean c(float f11, float f12, float f13, float f14) {
        float f15 = this.f64350a;
        float f16 = this.f64351b;
        float f17 = this.f64352c;
        float f18 = this.f64353d;
        if ((f11 <= f15 && f13 <= f15) || ((f12 <= f16 && f14 <= f16) || ((f11 >= f17 && f13 >= f17) || (f12 >= f18 && f14 >= f18)))) {
            return false;
        }
        float f19 = (f14 - f12) / (f13 - f11);
        float f21 = ((f15 - f11) * f19) + f12;
        if (f21 > f16 && f21 < f18) {
            return true;
        }
        float f22 = ((f17 - f11) * f19) + f12;
        if (f22 > f16 && f22 < f18) {
            return true;
        }
        float f23 = ((f16 - f12) / f19) + f11;
        if (f23 > f15 && f23 < f17) {
            return true;
        }
        float f24 = ((f18 - f12) / f19) + f11;
        return f24 > f15 && f24 < f17;
    }

    public boolean d(h hVar) {
        if (hVar != null) {
            return this.f64350a < hVar.f64352c && this.f64352c > hVar.f64350a && this.f64351b < hVar.f64353d && this.f64353d > hVar.f64351b;
        }
        throw new IllegalArgumentException("bounds cannot be null.");
    }

    @d0
    public ol.d e(float f11, float f12) {
        com.badlogic.gdx.utils.a<r> aVar = this.f64355f;
        r[] rVarArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            if (f(rVarArr[i12], f11, f12)) {
                return this.f64354e.get(i12);
            }
        }
        return null;
    }

    public boolean f(r rVar, float f11, float f12) {
        if (rVar == null) {
            throw new IllegalArgumentException("polygon cannot be null.");
        }
        float[] fArr = rVar.f1625a;
        int i11 = rVar.f1626b;
        boolean z11 = false;
        int i12 = i11 - 2;
        for (int i13 = 0; i13 < i11; i13 += 2) {
            float f13 = fArr[i13 + 1];
            float f14 = fArr[i12 + 1];
            if ((f13 < f12 && f14 >= f12) || (f14 < f12 && f13 >= f12)) {
                float f15 = fArr[i13];
                if (f15 + (((f12 - f13) / (f14 - f13)) * (fArr[i12] - f15)) < f11) {
                    z11 = !z11;
                }
            }
            i12 = i13;
        }
        return z11;
    }

    public com.badlogic.gdx.utils.a<ol.d> g() {
        return this.f64354e;
    }

    public float h() {
        return this.f64353d - this.f64351b;
    }

    public float i() {
        return this.f64352c;
    }

    public float j() {
        return this.f64353d;
    }

    public float k() {
        return this.f64350a;
    }

    public float l() {
        return this.f64351b;
    }

    @d0
    public r m(ol.d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("boundingBox cannot be null.");
        }
        int q11 = this.f64354e.q(dVar, true);
        if (q11 == -1) {
            return null;
        }
        return this.f64355f.get(q11);
    }

    public com.badlogic.gdx.utils.a<r> n() {
        return this.f64355f;
    }

    public float o() {
        return this.f64352c - this.f64350a;
    }

    @d0
    public ol.d p(float f11, float f12, float f13, float f14) {
        com.badlogic.gdx.utils.a<r> aVar = this.f64355f;
        r[] rVarArr = aVar.f13178a;
        int i11 = aVar.f13179b;
        int i12 = 0;
        while (i12 < i11) {
            float f15 = f11;
            float f16 = f12;
            float f17 = f13;
            float f18 = f14;
            if (q(rVarArr[i12], f15, f16, f17, f18)) {
                return this.f64354e.get(i12);
            }
            i12++;
            f11 = f15;
            f12 = f16;
            f13 = f17;
            f14 = f18;
        }
        return null;
    }

    public boolean q(r rVar, float f11, float f12, float f13, float f14) {
        if (rVar == null) {
            throw new IllegalArgumentException("polygon cannot be null.");
        }
        float[] fArr = rVar.f1625a;
        int i11 = rVar.f1626b;
        float f15 = f11 - f13;
        float f16 = f12 - f14;
        float f17 = (f11 * f14) - (f12 * f13);
        float f18 = fArr[i11 - 2];
        float f19 = fArr[i11 - 1];
        int i12 = 0;
        while (i12 < i11) {
            float f21 = fArr[i12];
            float f22 = fArr[i12 + 1];
            float f23 = (f18 * f22) - (f19 * f21);
            float f24 = f18 - f21;
            float f25 = f19 - f22;
            float f26 = (f15 * f25) - (f16 * f24);
            float f27 = ((f24 * f17) - (f15 * f23)) / f26;
            if (((f27 >= f18 && f27 <= f21) || (f27 >= f21 && f27 <= f18)) && ((f27 >= f11 && f27 <= f13) || (f27 >= f13 && f27 <= f11))) {
                float f28 = ((f25 * f17) - (f23 * f16)) / f26;
                if ((f28 >= f19 && f28 <= f22) || (f28 >= f22 && f28 <= f19)) {
                    if (f28 >= f12 && f28 <= f14) {
                        return true;
                    }
                    if (f28 >= f14 && f28 <= f12) {
                        return true;
                    }
                }
            }
            i12 += 2;
            f18 = f21;
            f19 = f22;
        }
        return false;
    }

    public void r(Skeleton skeleton, boolean z11) {
        if (skeleton == null) {
            throw new IllegalArgumentException("skeleton cannot be null.");
        }
        com.badlogic.gdx.utils.a<ol.d> aVar = this.f64354e;
        com.badlogic.gdx.utils.a<r> aVar2 = this.f64355f;
        com.badlogic.gdx.utils.a<m> aVar3 = skeleton.f29194c;
        m[] mVarArr = aVar3.f13178a;
        int i11 = aVar3.f13179b;
        aVar.clear();
        this.f64356g.e(aVar2);
        aVar2.clear();
        for (int i12 = 0; i12 < i11; i12++) {
            m mVar = mVarArr[i12];
            if (mVar.f64408b.A) {
                ol.b bVar = mVar.f64411e;
                if (bVar instanceof ol.d) {
                    ol.d dVar = (ol.d) bVar;
                    aVar.a(dVar);
                    r h11 = this.f64356g.h();
                    aVar2.a(h11);
                    dVar.j(mVar, 0, dVar.o(), h11.I(dVar.o()), 0, 2);
                }
            }
        }
        if (z11) {
            a();
            return;
        }
        this.f64350a = -2.14748365E9f;
        this.f64351b = -2.14748365E9f;
        this.f64352c = 2.14748365E9f;
        this.f64353d = 2.14748365E9f;
    }
}
