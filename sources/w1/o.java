package w1;

import com.badlogic.gdx.graphics.Texture;
import java.lang.reflect.Array;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public Texture f94611a;

    /* renamed from: b, reason: collision with root package name */
    public float f94612b;

    /* renamed from: c, reason: collision with root package name */
    public float f94613c;

    /* renamed from: d, reason: collision with root package name */
    public float f94614d;

    /* renamed from: e, reason: collision with root package name */
    public float f94615e;

    /* renamed from: f, reason: collision with root package name */
    public int f94616f;

    /* renamed from: g, reason: collision with root package name */
    public int f94617g;

    public o() {
    }

    public static o[][] C(Texture texture, int i11, int i12) {
        return new o(texture).B(i11, i12);
    }

    public void A(float f11) {
        this.f94615e = f11;
        this.f94617g = Math.round(Math.abs(f11 - this.f94613c) * this.f94611a.I());
    }

    public o[][] B(int i11, int i12) {
        int d11 = d();
        int e11 = e();
        int i13 = this.f94616f;
        int i14 = this.f94617g / i12;
        int i15 = i13 / i11;
        o[][] oVarArr = (o[][]) Array.newInstance((Class<?>) o.class, i14, i15);
        int i16 = e11;
        int i17 = 0;
        while (i17 < i14) {
            int i18 = d11;
            int i19 = 0;
            while (i19 < i15) {
                oVarArr[i17][i19] = new o(this.f94611a, i18, i16, i11, i12);
                i19++;
                i18 += i11;
            }
            i17++;
            i16 += i12;
        }
        return oVarArr;
    }

    public void a(boolean z11, boolean z12) {
        if (z11) {
            float f11 = this.f94612b;
            this.f94612b = this.f94614d;
            this.f94614d = f11;
        }
        if (z12) {
            float f12 = this.f94613c;
            this.f94613c = this.f94615e;
            this.f94615e = f12;
        }
    }

    public int b() {
        return this.f94617g;
    }

    public int c() {
        return this.f94616f;
    }

    public int d() {
        return Math.round(this.f94612b * this.f94611a.C0());
    }

    public int e() {
        return Math.round(this.f94613c * this.f94611a.I());
    }

    public Texture f() {
        return this.f94611a;
    }

    public float g() {
        return this.f94612b;
    }

    public float h() {
        return this.f94614d;
    }

    public float i() {
        return this.f94613c;
    }

    public float j() {
        return this.f94615e;
    }

    public boolean k() {
        return this.f94612b > this.f94614d;
    }

    public boolean l() {
        return this.f94613c > this.f94615e;
    }

    public void m(float f11, float f12) {
        if (f11 != 0.0f) {
            float C0 = (this.f94614d - this.f94612b) * this.f94611a.C0();
            float f13 = (this.f94612b + f11) % 1.0f;
            this.f94612b = f13;
            this.f94614d = f13 + (C0 / this.f94611a.C0());
        }
        if (f12 != 0.0f) {
            float I = (this.f94615e - this.f94613c) * this.f94611a.I();
            float f14 = (this.f94613c + f12) % 1.0f;
            this.f94613c = f14;
            this.f94615e = f14 + (I / this.f94611a.I());
        }
    }

    public void n(float f11, float f12, float f13, float f14) {
        int C0 = this.f94611a.C0();
        int I = this.f94611a.I();
        float f15 = C0;
        this.f94616f = Math.round(Math.abs(f13 - f11) * f15);
        float f16 = I;
        int round = Math.round(Math.abs(f14 - f12) * f16);
        this.f94617g = round;
        if (this.f94616f == 1 && round == 1) {
            float f17 = 0.25f / f15;
            f11 += f17;
            f13 -= f17;
            float f18 = 0.25f / f16;
            f12 += f18;
            f14 -= f18;
        }
        this.f94612b = f11;
        this.f94613c = f12;
        this.f94614d = f13;
        this.f94615e = f14;
    }

    public void o(int i11, int i12, int i13, int i14) {
        float C0 = 1.0f / this.f94611a.C0();
        float I = 1.0f / this.f94611a.I();
        n(i11 * C0, i12 * I, (i11 + i13) * C0, (i12 + i14) * I);
        this.f94616f = Math.abs(i13);
        this.f94617g = Math.abs(i14);
    }

    public void p(Texture texture) {
        this.f94611a = texture;
        o(0, 0, texture.C0(), texture.I());
    }

    public void q(o oVar) {
        this.f94611a = oVar.f94611a;
        n(oVar.f94612b, oVar.f94613c, oVar.f94614d, oVar.f94615e);
    }

    public void r(o oVar, int i11, int i12, int i13, int i14) {
        this.f94611a = oVar.f94611a;
        o(oVar.d() + i11, oVar.e() + i12, i13, i14);
    }

    public void s(int i11) {
        if (l()) {
            z(this.f94615e + (i11 / this.f94611a.I()));
        } else {
            A(this.f94613c + (i11 / this.f94611a.I()));
        }
    }

    public void t(int i11) {
        if (k()) {
            x(this.f94614d + (i11 / this.f94611a.C0()));
        } else {
            y(this.f94612b + (i11 / this.f94611a.C0()));
        }
    }

    public void u(int i11) {
        x(i11 / this.f94611a.C0());
    }

    public void v(int i11) {
        z(i11 / this.f94611a.I());
    }

    public void w(Texture texture) {
        this.f94611a = texture;
    }

    public void x(float f11) {
        this.f94612b = f11;
        this.f94616f = Math.round(Math.abs(this.f94614d - f11) * this.f94611a.C0());
    }

    public void y(float f11) {
        this.f94614d = f11;
        this.f94616f = Math.round(Math.abs(f11 - this.f94612b) * this.f94611a.C0());
    }

    public void z(float f11) {
        this.f94613c = f11;
        this.f94617g = Math.round(Math.abs(this.f94615e - f11) * this.f94611a.I());
    }

    public o(Texture texture) {
        if (texture == null) {
            throw new IllegalArgumentException("texture cannot be null.");
        }
        this.f94611a = texture;
        o(0, 0, texture.C0(), texture.I());
    }

    public o(Texture texture, int i11, int i12) {
        this.f94611a = texture;
        o(0, 0, i11, i12);
    }

    public o(Texture texture, int i11, int i12, int i13, int i14) {
        this.f94611a = texture;
        o(i11, i12, i13, i14);
    }

    public o(Texture texture, float f11, float f12, float f13, float f14) {
        this.f94611a = texture;
        n(f11, f12, f13, f14);
    }

    public o(o oVar) {
        q(oVar);
    }

    public o(o oVar, int i11, int i12, int i13, int i14) {
        r(oVar, i11, i12, i13, i14);
    }
}
