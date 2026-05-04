package j2;

import com.badlogic.gdx.graphics.s;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.n;
import j2.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class m extends d {

    /* renamed from: g, reason: collision with root package name */
    public com.badlogic.gdx.math.f<d.a> f63162g;

    public m(m mVar) {
        super(mVar);
        this.f63162g = new com.badlogic.gdx.math.f<>();
        d(mVar);
    }

    @Override // j2.k
    public k f() {
        return new m(this);
    }

    @Override // j2.k
    public void g() {
        m();
    }

    @Override // j2.k
    public void i(Vector3 vector3, float f11) {
        d.a l11 = this.f63162g.l();
        float J = n.J();
        float J2 = n.J();
        float f12 = l11.f63135a;
        float f13 = ((l11.f63138d - f12) * J) + f12 + ((l11.f63141g - f12) * J2);
        float f14 = l11.f63136b;
        float f15 = ((l11.f63139e - f14) * J) + f14 + ((l11.f63142h - f14) * J2);
        float f16 = l11.f63137c;
        vector3.set(f13, f15, (J * (l11.f63140f - f16)) + f16 + (J2 * (l11.f63143i - f16)));
    }

    public void m() {
        this.f63162g.c();
        s r12 = this.f63133e.r1();
        int D0 = this.f63133e.D0();
        int m11 = this.f63133e.m();
        short s11 = (short) (r12.f12497b / 4);
        short s12 = (short) (r12.d(1).f12492e / 4);
        float[] fArr = new float[m11 * s11];
        this.f63133e.w1(fArr);
        int i11 = 0;
        if (D0 > 0) {
            short[] sArr = new short[D0];
            this.f63133e.i1(sArr);
            while (i11 < D0) {
                int i12 = (sArr[i11] * s11) + s12;
                int i13 = (sArr[i11 + 1] * s11) + s12;
                int i14 = (sArr[i11 + 2] * s11) + s12;
                float f11 = fArr[i12];
                float f12 = fArr[i12 + 1];
                float f13 = fArr[i12 + 2];
                float f14 = fArr[i13];
                float f15 = fArr[i13 + 1];
                float f16 = fArr[i13 + 2];
                float f17 = fArr[i14];
                float f18 = fArr[i14 + 1];
                float f19 = fArr[i14 + 2];
                this.f63162g.b(new d.a(f11, f12, f13, f14, f15, f16, f17, f18, f19), Math.abs(((((f15 - f18) * f11) + ((f18 - f12) * f14)) + ((f12 - f15) * f17)) / 2.0f));
                i11 += 3;
            }
        } else {
            while (i11 < m11) {
                int i15 = i11 + s12;
                int i16 = i15 + s11;
                int i17 = i16 + s11;
                float f21 = fArr[i15];
                float f22 = fArr[i15 + 1];
                float f23 = fArr[i15 + 2];
                float f24 = fArr[i16];
                float f25 = fArr[i16 + 1];
                float f26 = fArr[i16 + 2];
                float f27 = fArr[i17];
                float f28 = fArr[i17 + 1];
                float f29 = fArr[i17 + 2];
                this.f63162g.b(new d.a(f21, f22, f23, f24, f25, f26, f27, f28, f29), Math.abs(((((f25 - f28) * f21) + ((f28 - f22) * f24)) + ((f22 - f25) * f27)) / 2.0f));
                i11 += s11;
            }
        }
        this.f63162g.e();
    }

    public m() {
        this.f63162g = new com.badlogic.gdx.math.f<>();
    }
}
