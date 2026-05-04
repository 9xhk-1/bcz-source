package w1;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public g f94494a;

    /* renamed from: b, reason: collision with root package name */
    public float f94495b;

    /* renamed from: c, reason: collision with root package name */
    public float f94496c;

    /* renamed from: d, reason: collision with root package name */
    public float f94497d;

    /* renamed from: e, reason: collision with root package name */
    public float f94498e;

    /* renamed from: h, reason: collision with root package name */
    public float f94501h;

    /* renamed from: i, reason: collision with root package name */
    public float f94502i;

    /* renamed from: j, reason: collision with root package name */
    public float f94503j;

    /* renamed from: k, reason: collision with root package name */
    public float[] f94504k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f94505l;

    /* renamed from: f, reason: collision with root package name */
    public float f94499f = 1.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f94500g = 1.0f;

    /* renamed from: m, reason: collision with root package name */
    public Rectangle f94506m = new Rectangle();

    /* renamed from: n, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.b f94507n = new com.badlogic.gdx.graphics.b(1.0f, 1.0f, 1.0f, 1.0f);

    public i(g gVar) {
        y(gVar);
        o oVar = gVar.f94488d;
        C(oVar.f94616f, oVar.f94617g);
        w(this.f94497d / 2.0f, this.f94498e / 2.0f);
    }

    public void A(float f11) {
        this.f94499f = f11;
        this.f94500g = f11;
        this.f94505l = true;
    }

    public void B(float f11, float f12) {
        this.f94499f = f11;
        this.f94500g = f12;
        this.f94505l = true;
    }

    public void C(float f11, float f12) {
        this.f94497d = f11;
        this.f94498e = f12;
        this.f94505l = true;
    }

    public void D(float f11) {
        G(f11 - this.f94495b);
    }

    public void E(float f11) {
        H(f11 - this.f94496c);
    }

    public void F(float f11, float f12) {
        this.f94495b += f11;
        this.f94496c += f12;
        if (this.f94505l) {
            return;
        }
        float[] fArr = this.f94504k;
        for (int i11 = 0; i11 < fArr.length; i11 += 5) {
            fArr[i11] = fArr[i11] + f11;
            int i12 = i11 + 1;
            fArr[i12] = fArr[i12] + f12;
        }
    }

    public void G(float f11) {
        this.f94495b += f11;
        if (this.f94505l) {
            return;
        }
        float[] fArr = this.f94504k;
        for (int i11 = 0; i11 < fArr.length; i11 += 5) {
            fArr[i11] = fArr[i11] + f11;
        }
    }

    public void H(float f11) {
        this.f94496c += f11;
        if (this.f94505l) {
            return;
        }
        float[] fArr = this.f94504k;
        for (int i11 = 1; i11 < fArr.length; i11 += 5) {
            fArr[i11] = fArr[i11] + f11;
        }
    }

    public void a(j jVar) {
        g gVar = this.f94494a;
        Texture texture = gVar.f94488d.f94611a;
        float[] m11 = m();
        int length = this.f94504k.length;
        short[] sArr = gVar.f94487c;
        jVar.L0(texture, m11, 0, length, sArr, 0, sArr.length);
    }

    public void b(j jVar, float f11) {
        com.badlogic.gdx.graphics.b d11 = d();
        float f12 = d11.f11547d;
        d11.f11547d = f11 * f12;
        v(d11);
        a(jVar);
        d11.f11547d = f12;
        v(d11);
    }

    public Rectangle c() {
        float[] m11 = m();
        float f11 = m11[0];
        float f12 = m11[1];
        float f13 = f11;
        float f14 = f12;
        for (int i11 = 5; i11 < m11.length; i11 += 5) {
            float f15 = m11[i11];
            float f16 = m11[i11 + 1];
            if (f11 > f15) {
                f11 = f15;
            }
            if (f13 < f15) {
                f13 = f15;
            }
            if (f14 > f16) {
                f14 = f16;
            }
            if (f12 < f16) {
                f12 = f16;
            }
        }
        Rectangle rectangle = this.f94506m;
        rectangle.f12533x = f11;
        rectangle.f12534y = f14;
        rectangle.width = f13 - f11;
        rectangle.height = f12 - f14;
        return rectangle;
    }

    public com.badlogic.gdx.graphics.b d() {
        return this.f94507n;
    }

    public float e() {
        return this.f94498e;
    }

    public float f() {
        return this.f94502i;
    }

    public float g() {
        return this.f94503j;
    }

    public com.badlogic.gdx.graphics.b h() {
        com.badlogic.gdx.graphics.b.a(this.f94507n, this.f94504k[2]);
        return this.f94507n;
    }

    public g i() {
        return this.f94494a;
    }

    public float j() {
        return this.f94501h;
    }

    public float k() {
        return this.f94499f;
    }

    public float l() {
        return this.f94500g;
    }

    public float[] m() {
        if (!this.f94505l) {
            return this.f94504k;
        }
        int i11 = 0;
        this.f94505l = false;
        float f11 = this.f94502i;
        float f12 = this.f94503j;
        float f13 = this.f94499f;
        float f14 = this.f94500g;
        g gVar = this.f94494a;
        float[] fArr = this.f94504k;
        float[] fArr2 = gVar.f94486b;
        float f15 = this.f94495b + f11;
        float f16 = this.f94496c + f12;
        float c11 = this.f94497d / gVar.f94488d.c();
        float b11 = this.f94498e / gVar.f94488d.b();
        float t11 = com.badlogic.gdx.math.n.t(this.f94501h);
        float a02 = com.badlogic.gdx.math.n.a0(this.f94501h);
        int length = fArr2.length;
        int i12 = 0;
        while (i11 < length) {
            float f17 = ((fArr2[i11] * c11) - f11) * f13;
            float f18 = ((fArr2[i11 + 1] * b11) - f12) * f14;
            fArr[i12] = ((t11 * f17) - (a02 * f18)) + f15;
            fArr[i12 + 1] = (f17 * a02) + (f18 * t11) + f16;
            i11 += 2;
            i12 += 5;
        }
        return fArr;
    }

    public float n() {
        return this.f94497d;
    }

    public float o() {
        return this.f94495b;
    }

    public float p() {
        return this.f94496c;
    }

    public void q(float f11) {
        this.f94501h += f11;
        this.f94505l = true;
    }

    public void r(float f11) {
        this.f94499f += f11;
        this.f94500g += f11;
        this.f94505l = true;
    }

    public void s(i iVar) {
        if (iVar == null) {
            throw new IllegalArgumentException("sprite cannot be null.");
        }
        y(iVar.f94494a);
        this.f94495b = iVar.f94495b;
        this.f94496c = iVar.f94496c;
        this.f94497d = iVar.f94497d;
        this.f94498e = iVar.f94498e;
        this.f94502i = iVar.f94502i;
        this.f94503j = iVar.f94503j;
        this.f94501h = iVar.f94501h;
        this.f94499f = iVar.f94499f;
        this.f94500g = iVar.f94500g;
        this.f94507n.H(iVar.f94507n);
    }

    public void t(float f11, float f12, float f13, float f14) {
        this.f94495b = f11;
        this.f94496c = f12;
        this.f94497d = f13;
        this.f94498e = f14;
        this.f94505l = true;
    }

    public void u(float f11, float f12, float f13, float f14) {
        this.f94507n.F(f11, f12, f13, f14);
        float L = this.f94507n.L();
        float[] fArr = this.f94504k;
        for (int i11 = 2; i11 < fArr.length; i11 += 5) {
            fArr[i11] = L;
        }
    }

    public void v(com.badlogic.gdx.graphics.b bVar) {
        this.f94507n.H(bVar);
        float L = bVar.L();
        float[] fArr = this.f94504k;
        for (int i11 = 2; i11 < fArr.length; i11 += 5) {
            fArr[i11] = L;
        }
    }

    public void w(float f11, float f12) {
        this.f94502i = f11;
        this.f94503j = f12;
        this.f94505l = true;
    }

    public void x(float f11, float f12) {
        F(f11 - this.f94495b, f12 - this.f94496c);
    }

    public void y(g gVar) {
        this.f94494a = gVar;
        float[] fArr = gVar.f94486b;
        float[] fArr2 = gVar.f94485a;
        int length = (fArr.length / 2) * 5;
        float[] fArr3 = this.f94504k;
        if (fArr3 == null || fArr3.length != length) {
            this.f94504k = new float[length];
        }
        float L = this.f94507n.L();
        float[] fArr4 = this.f94504k;
        int i11 = 0;
        for (int i12 = 2; i12 < length; i12 += 5) {
            fArr4[i12] = L;
            fArr4[i12 + 1] = fArr2[i11];
            fArr4[i12 + 2] = fArr2[i11 + 1];
            i11 += 2;
        }
        this.f94505l = true;
    }

    public void z(float f11) {
        this.f94501h = f11;
        this.f94505l = true;
    }

    public i(i iVar) {
        s(iVar);
    }
}
