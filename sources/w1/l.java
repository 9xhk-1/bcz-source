package w1;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class l extends o {

    /* renamed from: v, reason: collision with root package name */
    public static final int f94547v = 5;

    /* renamed from: w, reason: collision with root package name */
    public static final int f94548w = 20;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f94549h;

    /* renamed from: i, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.b f94550i;

    /* renamed from: j, reason: collision with root package name */
    public float f94551j;

    /* renamed from: k, reason: collision with root package name */
    public float f94552k;

    /* renamed from: l, reason: collision with root package name */
    public float f94553l;

    /* renamed from: m, reason: collision with root package name */
    public float f94554m;

    /* renamed from: n, reason: collision with root package name */
    public float f94555n;

    /* renamed from: o, reason: collision with root package name */
    public float f94556o;

    /* renamed from: p, reason: collision with root package name */
    public float f94557p;

    /* renamed from: q, reason: collision with root package name */
    public float f94558q;

    /* renamed from: r, reason: collision with root package name */
    public float f94559r;

    /* renamed from: s, reason: collision with root package name */
    public float f94560s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f94561t;

    /* renamed from: u, reason: collision with root package name */
    public Rectangle f94562u;

    public l() {
        this.f94549h = new float[20];
        this.f94550i = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);
        this.f94551j = com.badlogic.gdx.graphics.b.f11527j;
        this.f94559r = 1.0f;
        this.f94560s = 1.0f;
        this.f94561t = true;
        b0(1.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override // w1.o
    public void A(float f11) {
        super.A(f11);
        float[] fArr = this.f94549h;
        fArr[4] = f11;
        fArr[19] = f11;
    }

    public void D(a aVar) {
        aVar.t0(this.f94611a, O(), 0, 20);
    }

    public void E(a aVar, float f11) {
        float f12 = G().f11547d;
        W(f11 * f12);
        D(aVar);
        W(f12);
    }

    public Rectangle F() {
        float[] O = O();
        float f11 = O[0];
        float f12 = O[1];
        float f13 = O[5];
        float f14 = f11 > f13 ? f13 : f11;
        float f15 = O[10];
        if (f14 > f15) {
            f14 = f15;
        }
        float f16 = O[15];
        if (f14 > f16) {
            f14 = f16;
        }
        if (f11 < f13) {
            f11 = f13;
        }
        if (f11 >= f15) {
            f15 = f11;
        }
        if (f15 >= f16) {
            f16 = f15;
        }
        float f17 = O[6];
        float f18 = f12 > f17 ? f17 : f12;
        float f19 = O[11];
        if (f18 > f19) {
            f18 = f19;
        }
        float f21 = O[16];
        if (f18 > f21) {
            f18 = f21;
        }
        if (f12 < f17) {
            f12 = f17;
        }
        if (f12 >= f19) {
            f19 = f12;
        }
        if (f19 >= f21) {
            f21 = f19;
        }
        if (this.f94562u == null) {
            this.f94562u = new Rectangle();
        }
        Rectangle rectangle = this.f94562u;
        rectangle.f12533x = f14;
        rectangle.f12534y = f18;
        rectangle.width = f16 - f14;
        rectangle.height = f21 - f18;
        return rectangle;
    }

    public com.badlogic.gdx.graphics.b G() {
        return this.f94550i;
    }

    public float H() {
        return this.f94555n;
    }

    public float I() {
        return this.f94556o;
    }

    public float J() {
        return this.f94557p;
    }

    public float K() {
        return this.f94551j;
    }

    public float L() {
        return this.f94558q;
    }

    public float M() {
        return this.f94559r;
    }

    public float N() {
        return this.f94560s;
    }

    public float[] O() {
        if (this.f94561t) {
            this.f94561t = false;
            float[] fArr = this.f94549h;
            float f11 = -this.f94556o;
            float f12 = -this.f94557p;
            float f13 = this.f94554m + f11;
            float f14 = this.f94555n + f12;
            float f15 = this.f94552k - f11;
            float f16 = this.f94553l - f12;
            float f17 = this.f94559r;
            if (f17 != 1.0f || this.f94560s != 1.0f) {
                f11 *= f17;
                float f18 = this.f94560s;
                f12 *= f18;
                f13 *= f17;
                f14 *= f18;
            }
            float f19 = this.f94558q;
            if (f19 != 0.0f) {
                float t11 = com.badlogic.gdx.math.n.t(f19);
                float a02 = com.badlogic.gdx.math.n.a0(this.f94558q);
                float f21 = f11 * t11;
                float f22 = f11 * a02;
                float f23 = f12 * t11;
                float f24 = f13 * t11;
                float f25 = t11 * f14;
                float f26 = f14 * a02;
                float f27 = (f21 - (f12 * a02)) + f15;
                float f28 = f23 + f22 + f16;
                fArr[0] = f27;
                fArr[1] = f28;
                float f29 = (f21 - f26) + f15;
                float f31 = f22 + f25 + f16;
                fArr[5] = f29;
                fArr[6] = f31;
                float f32 = (f24 - f26) + f15;
                float f33 = f25 + (f13 * a02) + f16;
                fArr[10] = f32;
                fArr[11] = f33;
                fArr[15] = f27 + (f32 - f29);
                fArr[16] = f33 - (f31 - f28);
            } else {
                float f34 = f11 + f15;
                float f35 = f12 + f16;
                float f36 = f13 + f15;
                float f37 = f14 + f16;
                fArr[0] = f34;
                fArr[1] = f35;
                fArr[5] = f34;
                fArr[6] = f37;
                fArr[10] = f36;
                fArr[11] = f37;
                fArr[15] = f36;
                fArr[16] = f35;
            }
        }
        return this.f94549h;
    }

    public float P() {
        return this.f94554m;
    }

    public float Q() {
        return this.f94552k;
    }

    public float R() {
        return this.f94553l;
    }

    public void S(float f11) {
        if (f11 == 0.0f) {
            return;
        }
        this.f94558q += f11;
        this.f94561t = true;
    }

    public void T(boolean z11) {
        float[] fArr = this.f94549h;
        if (z11) {
            float f11 = fArr[4];
            fArr[4] = fArr[19];
            fArr[19] = fArr[14];
            fArr[14] = fArr[9];
            fArr[9] = f11;
            float f12 = fArr[3];
            fArr[3] = fArr[18];
            fArr[18] = fArr[13];
            fArr[13] = fArr[8];
            fArr[8] = f12;
            return;
        }
        float f13 = fArr[4];
        fArr[4] = fArr[9];
        fArr[9] = fArr[14];
        fArr[14] = fArr[19];
        fArr[19] = f13;
        float f14 = fArr[3];
        fArr[3] = fArr[8];
        fArr[8] = fArr[13];
        fArr[13] = fArr[18];
        fArr[18] = f14;
    }

    public void U(float f11) {
        this.f94559r += f11;
        this.f94560s += f11;
        this.f94561t = true;
    }

    public void V(l lVar) {
        if (lVar == null) {
            throw new IllegalArgumentException("sprite cannot be null.");
        }
        System.arraycopy(lVar.f94549h, 0, this.f94549h, 0, 20);
        this.f94611a = lVar.f94611a;
        this.f94612b = lVar.f94612b;
        this.f94613c = lVar.f94613c;
        this.f94614d = lVar.f94614d;
        this.f94615e = lVar.f94615e;
        this.f94552k = lVar.f94552k;
        this.f94553l = lVar.f94553l;
        this.f94554m = lVar.f94554m;
        this.f94555n = lVar.f94555n;
        this.f94616f = lVar.f94616f;
        this.f94617g = lVar.f94617g;
        this.f94556o = lVar.f94556o;
        this.f94557p = lVar.f94557p;
        this.f94558q = lVar.f94558q;
        this.f94559r = lVar.f94559r;
        this.f94560s = lVar.f94560s;
        this.f94550i.H(lVar.f94550i);
        this.f94561t = lVar.f94561t;
    }

    public void W(float f11) {
        com.badlogic.gdx.graphics.b bVar = this.f94550i;
        if (bVar.f11547d != f11) {
            bVar.f11547d = f11;
            float L = bVar.L();
            this.f94551j = L;
            float[] fArr = this.f94549h;
            fArr[2] = L;
            fArr[7] = L;
            fArr[12] = L;
            fArr[17] = L;
        }
    }

    public void X(float f11, float f12, float f13, float f14) {
        this.f94552k = f11;
        this.f94553l = f12;
        this.f94554m = f13;
        this.f94555n = f14;
        if (this.f94561t) {
            return;
        }
        if (this.f94558q != 0.0f || this.f94559r != 1.0f || this.f94560s != 1.0f) {
            this.f94561t = true;
            return;
        }
        float f15 = f13 + f11;
        float f16 = f14 + f12;
        float[] fArr = this.f94549h;
        fArr[0] = f11;
        fArr[1] = f12;
        fArr[5] = f11;
        fArr[6] = f16;
        fArr[10] = f15;
        fArr[11] = f16;
        fArr[15] = f15;
        fArr[16] = f12;
    }

    public void Y(float f11, float f12) {
        i0(f11 - (this.f94554m / 2.0f), f12 - (this.f94555n / 2.0f));
    }

    public void Z(float f11) {
        n0(f11 - (this.f94554m / 2.0f));
    }

    @Override // w1.o
    public void a(boolean z11, boolean z12) {
        super.a(z11, z12);
        float[] fArr = this.f94549h;
        if (z11) {
            float f11 = fArr[3];
            fArr[3] = fArr[13];
            fArr[13] = f11;
            float f12 = fArr[8];
            fArr[8] = fArr[18];
            fArr[18] = f12;
        }
        if (z12) {
            float f13 = fArr[4];
            fArr[4] = fArr[14];
            fArr[14] = f13;
            float f14 = fArr[9];
            fArr[9] = fArr[19];
            fArr[19] = f14;
        }
    }

    public void a0(float f11) {
        o0(f11 - (this.f94555n / 2.0f));
    }

    public void b0(float f11, float f12, float f13, float f14) {
        this.f94550i.F(f11, f12, f13, f14);
        float L = this.f94550i.L();
        this.f94551j = L;
        float[] fArr = this.f94549h;
        fArr[2] = L;
        fArr[7] = L;
        fArr[12] = L;
        fArr[17] = L;
    }

    public void c0(com.badlogic.gdx.graphics.b bVar) {
        this.f94550i.H(bVar);
        float L = bVar.L();
        this.f94551j = L;
        float[] fArr = this.f94549h;
        fArr[2] = L;
        fArr[7] = L;
        fArr[12] = L;
        fArr[17] = L;
    }

    public void d0(boolean z11, boolean z12) {
        a(k() != z11, l() != z12);
    }

    public void e0(float f11, float f12) {
        this.f94556o = f11;
        this.f94557p = f12;
        this.f94561t = true;
    }

    public void f0(float f11, float f12) {
        i0(f11 - this.f94556o, f12 - this.f94557p);
    }

    public void g0() {
        this.f94556o = this.f94554m / 2.0f;
        this.f94557p = this.f94555n / 2.0f;
        this.f94561t = true;
    }

    public void h0(float f11) {
        float f12 = this.f94551j;
        if (f11 != f12 || (f11 == 0.0f && f12 == 0.0f && Float.floatToIntBits(f11) != Float.floatToIntBits(this.f94551j))) {
            this.f94551j = f11;
            com.badlogic.gdx.graphics.b.a(this.f94550i, f11);
            float[] fArr = this.f94549h;
            fArr[2] = f11;
            fArr[7] = f11;
            fArr[12] = f11;
            fArr[17] = f11;
        }
    }

    public void i0(float f11, float f12) {
        this.f94552k = f11;
        this.f94553l = f12;
        if (this.f94561t) {
            return;
        }
        if (this.f94558q != 0.0f || this.f94559r != 1.0f || this.f94560s != 1.0f) {
            this.f94561t = true;
            return;
        }
        float f13 = this.f94554m + f11;
        float f14 = this.f94555n + f12;
        float[] fArr = this.f94549h;
        fArr[0] = f11;
        fArr[1] = f12;
        fArr[5] = f11;
        fArr[6] = f14;
        fArr[10] = f13;
        fArr[11] = f14;
        fArr[15] = f13;
        fArr[16] = f12;
    }

    public void j0(float f11) {
        this.f94558q = f11;
        this.f94561t = true;
    }

    public void k0(float f11) {
        this.f94559r = f11;
        this.f94560s = f11;
        this.f94561t = true;
    }

    public void l0(float f11, float f12) {
        this.f94559r = f11;
        this.f94560s = f12;
        this.f94561t = true;
    }

    @Override // w1.o
    public void m(float f11, float f12) {
        float[] fArr = this.f94549h;
        if (f11 != 0.0f) {
            float f13 = (fArr[3] + f11) % 1.0f;
            float C0 = (this.f94554m / this.f94611a.C0()) + f13;
            this.f94612b = f13;
            this.f94614d = C0;
            fArr[3] = f13;
            fArr[8] = f13;
            fArr[13] = C0;
            fArr[18] = C0;
        }
        if (f12 != 0.0f) {
            float f14 = (fArr[9] + f12) % 1.0f;
            float I = (this.f94555n / this.f94611a.I()) + f14;
            this.f94613c = f14;
            this.f94615e = I;
            fArr[4] = I;
            fArr[9] = f14;
            fArr[14] = f14;
            fArr[19] = I;
        }
    }

    public void m0(float f11, float f12) {
        this.f94554m = f11;
        this.f94555n = f12;
        if (this.f94561t) {
            return;
        }
        if (this.f94558q != 0.0f || this.f94559r != 1.0f || this.f94560s != 1.0f) {
            this.f94561t = true;
            return;
        }
        float f13 = this.f94552k;
        float f14 = f11 + f13;
        float f15 = this.f94553l;
        float f16 = f12 + f15;
        float[] fArr = this.f94549h;
        fArr[0] = f13;
        fArr[1] = f15;
        fArr[5] = f13;
        fArr[6] = f16;
        fArr[10] = f14;
        fArr[11] = f16;
        fArr[15] = f14;
        fArr[16] = f15;
    }

    @Override // w1.o
    public void n(float f11, float f12, float f13, float f14) {
        super.n(f11, f12, f13, f14);
        float[] fArr = this.f94549h;
        fArr[3] = f11;
        fArr[4] = f14;
        fArr[8] = f11;
        fArr[9] = f12;
        fArr[13] = f13;
        fArr[14] = f12;
        fArr[18] = f13;
        fArr[19] = f14;
    }

    public void n0(float f11) {
        this.f94552k = f11;
        if (this.f94561t) {
            return;
        }
        if (this.f94558q != 0.0f || this.f94559r != 1.0f || this.f94560s != 1.0f) {
            this.f94561t = true;
            return;
        }
        float f12 = this.f94554m + f11;
        float[] fArr = this.f94549h;
        fArr[0] = f11;
        fArr[5] = f11;
        fArr[10] = f12;
        fArr[15] = f12;
    }

    public void o0(float f11) {
        this.f94553l = f11;
        if (this.f94561t) {
            return;
        }
        if (this.f94558q != 0.0f || this.f94559r != 1.0f || this.f94560s != 1.0f) {
            this.f94561t = true;
            return;
        }
        float f12 = this.f94555n + f11;
        float[] fArr = this.f94549h;
        fArr[1] = f11;
        fArr[6] = f12;
        fArr[11] = f12;
        fArr[16] = f11;
    }

    public void p0(float f11, float f12) {
        this.f94552k += f11;
        this.f94553l += f12;
        if (this.f94561t) {
            return;
        }
        if (this.f94558q != 0.0f || this.f94559r != 1.0f || this.f94560s != 1.0f) {
            this.f94561t = true;
            return;
        }
        float[] fArr = this.f94549h;
        fArr[0] = fArr[0] + f11;
        fArr[1] = fArr[1] + f12;
        fArr[5] = fArr[5] + f11;
        fArr[6] = fArr[6] + f12;
        fArr[10] = fArr[10] + f11;
        fArr[11] = fArr[11] + f12;
        fArr[15] = fArr[15] + f11;
        fArr[16] = fArr[16] + f12;
    }

    public void q0(float f11) {
        this.f94552k += f11;
        if (this.f94561t) {
            return;
        }
        if (this.f94558q != 0.0f || this.f94559r != 1.0f || this.f94560s != 1.0f) {
            this.f94561t = true;
            return;
        }
        float[] fArr = this.f94549h;
        fArr[0] = fArr[0] + f11;
        fArr[5] = fArr[5] + f11;
        fArr[10] = fArr[10] + f11;
        fArr[15] = fArr[15] + f11;
    }

    public void r0(float f11) {
        this.f94553l += f11;
        if (this.f94561t) {
            return;
        }
        if (this.f94558q != 0.0f || this.f94559r != 1.0f || this.f94560s != 1.0f) {
            this.f94561t = true;
            return;
        }
        float[] fArr = this.f94549h;
        fArr[1] = fArr[1] + f11;
        fArr[6] = fArr[6] + f11;
        fArr[11] = fArr[11] + f11;
        fArr[16] = fArr[16] + f11;
    }

    @Override // w1.o
    public void x(float f11) {
        super.x(f11);
        float[] fArr = this.f94549h;
        fArr[3] = f11;
        fArr[8] = f11;
    }

    @Override // w1.o
    public void y(float f11) {
        super.y(f11);
        float[] fArr = this.f94549h;
        fArr[13] = f11;
        fArr[18] = f11;
    }

    @Override // w1.o
    public void z(float f11) {
        super.z(f11);
        float[] fArr = this.f94549h;
        fArr[9] = f11;
        fArr[14] = f11;
    }

    public l(Texture texture) {
        this(texture, 0, 0, texture.C0(), texture.I());
    }

    public l(Texture texture, int i11, int i12) {
        this(texture, 0, 0, i11, i12);
    }

    public l(Texture texture, int i11, int i12, int i13, int i14) {
        this.f94549h = new float[20];
        this.f94550i = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);
        this.f94551j = com.badlogic.gdx.graphics.b.f11527j;
        this.f94559r = 1.0f;
        this.f94560s = 1.0f;
        this.f94561t = true;
        if (texture != null) {
            this.f94611a = texture;
            o(i11, i12, i13, i14);
            b0(1.0f, 1.0f, 1.0f, 1.0f);
            m0(Math.abs(i13), Math.abs(i14));
            e0(this.f94554m / 2.0f, this.f94555n / 2.0f);
            return;
        }
        throw new IllegalArgumentException("texture cannot be null.");
    }

    public l(o oVar) {
        this.f94549h = new float[20];
        this.f94550i = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);
        this.f94551j = com.badlogic.gdx.graphics.b.f11527j;
        this.f94559r = 1.0f;
        this.f94560s = 1.0f;
        this.f94561t = true;
        q(oVar);
        b0(1.0f, 1.0f, 1.0f, 1.0f);
        m0(oVar.c(), oVar.b());
        e0(this.f94554m / 2.0f, this.f94555n / 2.0f);
    }

    public l(o oVar, int i11, int i12, int i13, int i14) {
        this.f94549h = new float[20];
        this.f94550i = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);
        this.f94551j = com.badlogic.gdx.graphics.b.f11527j;
        this.f94559r = 1.0f;
        this.f94560s = 1.0f;
        this.f94561t = true;
        r(oVar, i11, i12, i13, i14);
        b0(1.0f, 1.0f, 1.0f, 1.0f);
        m0(Math.abs(i13), Math.abs(i14));
        e0(this.f94554m / 2.0f, this.f94555n / 2.0f);
    }

    public l(l lVar) {
        this.f94549h = new float[20];
        this.f94550i = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);
        this.f94551j = com.badlogic.gdx.graphics.b.f11527j;
        this.f94559r = 1.0f;
        this.f94560s = 1.0f;
        this.f94561t = true;
        V(lVar);
    }
}
