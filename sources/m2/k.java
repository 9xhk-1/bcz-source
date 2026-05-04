package m2;

import a3.t0;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.n;
import l2.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class k extends b {

    /* renamed from: z, reason: collision with root package name */
    public static final t0 f71792z = new t0();
    public static final Matrix3 A = new Matrix3();

    public static void d(l2.k kVar, float f11, float f12, float f13, int i11, int i12) {
        e(kVar, f11, f12, f13, i11, i12, 0.0f, 360.0f, 0.0f, 180.0f);
    }

    public static void e(l2.k kVar, float f11, float f12, float f13, int i11, int i12, float f14, float f15, float f16, float f17) {
        g(kVar, b.f71788w.idt(), f11, f12, f13, i11, i12, f14, f15, f16, f17);
    }

    @Deprecated
    public static void f(l2.k kVar, Matrix4 matrix4, float f11, float f12, float f13, int i11, int i12) {
        g(kVar, matrix4, f11, f12, f13, i11, i12, 0.0f, 360.0f, 0.0f, 180.0f);
    }

    @Deprecated
    public static void g(l2.k kVar, Matrix4 matrix4, float f11, float f12, float f13, int i11, int i12, float f14, float f15, float f16, float f17) {
        Matrix4 matrix42 = matrix4;
        int i13 = i11;
        boolean w11 = n.w(f16, 0.0f);
        boolean w12 = n.w(f17, 180.0f);
        float f18 = f11 * 0.5f;
        float f19 = f12 * 0.5f;
        float f21 = f13 * 0.5f;
        float f22 = f14 * 0.017453292f;
        float f23 = i13;
        float f24 = ((f15 - f14) * 0.017453292f) / f23;
        float f25 = f16 * 0.017453292f;
        float f26 = i12;
        float f27 = ((f17 - f16) * 0.017453292f) / f26;
        float f28 = 1.0f / f23;
        float f29 = 1.0f / f26;
        k.a b11 = b.f71782q.b(null, null, null, null);
        b11.f69227d = true;
        b11.f69225b = true;
        b11.f69231h = true;
        A.set(matrix42);
        int i14 = i13 + 3;
        t0 t0Var = f71792z;
        t0Var.j();
        t0Var.l(i13 * 2);
        t0Var.f1634b = i14;
        int i15 = i13 + 1;
        kVar.y((i12 + 1) * i15);
        kVar.a0(i13);
        int i16 = 0;
        int i17 = 0;
        while (i16 <= i12) {
            int i18 = i15;
            float f31 = i16;
            float f32 = f25 + (f27 * f31);
            float f33 = f31 * f29;
            float Z = n.Z(f32);
            boolean z11 = w11;
            float s11 = n.s(f32) * f19;
            boolean z12 = w12;
            int i19 = i17;
            float f34 = f18;
            int i21 = 0;
            while (i21 <= i13) {
                float f35 = i21;
                float f36 = f22 + (f24 * f35);
                if ((i16 == 0 && z11) || (i16 == i12 && z12)) {
                    f35 -= 0.5f;
                }
                int i22 = i21;
                float f37 = f19;
                float f38 = f21;
                b11.f69224a.set(n.s(f36) * f34 * Z, s11, n.Z(f36) * f21 * Z);
                b11.f69226c.set(b11.f69224a).mul(A).nor();
                b11.f69224a.mul(matrix42);
                b11.f69230g.set(1.0f - (f35 * f28), f33);
                t0 t0Var2 = f71792z;
                t0Var2.H(i19, kVar.L0(b11));
                int i23 = i19 + i14;
                if (i16 > 0 && i22 > 0) {
                    if (i16 == 1 && z11) {
                        kVar.g0(t0Var2.n(i19), t0Var2.n((i23 - 1) % i14), t0Var2.n((i23 - i18) % i14));
                    } else if (i16 == i12 && z12) {
                        kVar.g0(t0Var2.n(i19), t0Var2.n((i23 - (i11 + 2)) % i14), t0Var2.n((i23 - i18) % i14));
                    } else {
                        kVar.A(t0Var2.n(i19), t0Var2.n((i23 - 1) % i14), t0Var2.n((i23 - (i11 + 2)) % i14), t0Var2.n((i23 - i18) % i14));
                    }
                }
                i19 = (i19 + 1) % t0Var2.f1634b;
                i21 = i22 + 1;
                matrix42 = matrix4;
                i13 = i11;
                f21 = f38;
                f19 = f37;
            }
            i16++;
            matrix42 = matrix4;
            i13 = i11;
            i15 = i18;
            f18 = f34;
            w11 = z11;
            i17 = i19;
            w12 = z12;
        }
    }
}
