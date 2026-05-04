package m2;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.n;
import com.badlogic.gdx.utils.GdxRuntimeException;
import l2.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class g extends b {
    public static void d(l2.k kVar, float f11, float f12, float f13, float f14, int i11, float f15, float f16, float f17, float f18, float f19, float f21) {
        e(kVar, f11, f12, f13, f14, i11, f15, f16, f17, f18, f19, f21, 0.0f, 360.0f);
    }

    public static void e(l2.k kVar, float f11, float f12, float f13, float f14, int i11, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23) {
        Vector3 vector3 = b.f71772g;
        vector3.set(f18, f19, f21).crs(0.0f, 0.0f, 1.0f);
        Vector3 vector32 = b.f71773h;
        vector32.set(f18, f19, f21).crs(0.0f, 1.0f, 0.0f);
        if (vector32.len2() > vector3.len2()) {
            vector3.set(vector32);
        }
        vector32.set(vector3.nor()).crs(f18, f19, f21).nor();
        f(kVar, f11, f12, f13, f14, i11, f15, f16, f17, f18, f19, f21, vector3.f12537x, vector3.f12538y, vector3.f12539z, vector32.f12537x, vector32.f12538y, vector32.f12539z, f22, f23);
    }

    public static void f(l2.k kVar, float f11, float f12, float f13, float f14, int i11, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23, float f24, float f25, float f26, float f27, float f28, float f29) {
        int i12;
        short s11;
        short s12;
        int i13 = i11;
        float f31 = f15;
        int i14 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
        if (i14 <= 0 || f14 <= 0.0f) {
            i12 = i14;
            kVar.y(i13 + 2);
            kVar.u0(i13);
        } else if (f13 == f11 && f14 == f12) {
            int i15 = i13 + 1;
            kVar.y(i15);
            kVar.x0(i15);
            i12 = i14;
            if (kVar.b0() != 1) {
                throw new GdxRuntimeException("Incorrect primitive type : expect GL_LINES because innerWidth == width && innerHeight == height");
            }
        } else {
            i12 = i14;
            int i16 = i13 + 1;
            kVar.y(i16 * 2);
            kVar.a0(i16);
        }
        float f32 = f28 * 0.017453292f;
        float f33 = ((f29 - f28) * 0.017453292f) / i13;
        Vector3 scl = b.f71772g.set(f22, f23, f24).scl(f11 * 0.5f);
        Vector3 scl2 = b.f71773h.set(f25, f26, f27).scl(f12 * 0.5f);
        Vector3 scl3 = b.f71774i.set(f22, f23, f24).scl(f13 * 0.5f);
        Vector3 scl4 = b.f71775j.set(f25, f26, f27).scl(f14 * 0.5f);
        k.a b11 = b.f71782q.b(null, null, null, null);
        b11.f69227d = true;
        b11.f69225b = true;
        b11.f69231h = true;
        b11.f69230g.set(0.5f, 0.5f);
        b11.f69224a.set(f31, f16, f17);
        b11.f69226c.set(f18, f19, f21);
        k.a b12 = b.f71783r.b(null, null, null, null);
        b12.f69227d = true;
        b12.f69225b = true;
        b12.f69231h = true;
        b12.f69230g.set(0.5f, 0.5f);
        b12.f69224a.set(f31, f16, f17);
        b12.f69226c.set(f18, f19, f21);
        short L0 = kVar.L0(b12);
        float f34 = (f13 / f11) * 0.5f;
        float f35 = (f14 / f12) * 0.5f;
        int i17 = 0;
        short s13 = 0;
        short s14 = 0;
        short s15 = 0;
        while (i17 <= i13) {
            float f36 = f32 + (i17 * f33);
            float s16 = n.s(f36);
            float Z = n.Z(f36);
            float f37 = f35;
            int i18 = i17;
            Vector3 vector3 = scl;
            short s17 = L0;
            short s18 = s13;
            b12.f69224a.set(f31, f16, f17).add((vector3.f12537x * s16) + (scl2.f12537x * Z), (vector3.f12538y * s16) + (scl2.f12538y * Z), (vector3.f12539z * s16) + (scl2.f12539z * Z));
            b12.f69230g.set((s16 * 0.5f) + 0.5f, (Z * 0.5f) + 0.5f);
            short L02 = kVar.L0(b12);
            if (i12 <= 0 || f14 <= 0.0f) {
                s11 = s18;
                s12 = s17;
                if (i18 != 0) {
                    kVar.g0(L02, s14, s12);
                }
            } else if (f13 == f11 && f14 == f12) {
                if (i18 != 0) {
                    kVar.v(L02, s14);
                }
                s12 = s17;
                s11 = s18;
            } else {
                b11.f69224a.set(f31, f16, f17).add((scl3.f12537x * s16) + (scl4.f12537x * Z), (scl3.f12538y * s16) + (scl4.f12538y * Z), (scl3.f12539z * s16) + (scl4.f12539z * Z));
                b11.f69230g.set((f34 * s16) + 0.5f, (f37 * Z) + 0.5f);
                short L03 = kVar.L0(b11);
                if (i18 != 0) {
                    kVar.A(L03, L02, s18, s15);
                }
                s15 = L03;
                s13 = L02;
                s12 = s17;
                L0 = s12;
                scl = vector3;
                s14 = L02;
                i13 = i11;
                f35 = f37;
                i17 = i18 + 1;
                f31 = f15;
            }
            s13 = s11;
            L0 = s12;
            scl = vector3;
            s14 = L02;
            i13 = i11;
            f35 = f37;
            i17 = i18 + 1;
            f31 = f15;
        }
    }

    public static void g(l2.k kVar, float f11, float f12, float f13, float f14, int i11, Vector3 vector3, Vector3 vector32) {
        e(kVar, f11, f12, f13, f14, i11, vector3.f12537x, vector3.f12538y, vector3.f12539z, vector32.f12537x, vector32.f12538y, vector32.f12539z, 0.0f, 360.0f);
    }

    public static void h(l2.k kVar, float f11, float f12, int i11, float f13, float f14, float f15, float f16, float f17, float f18) {
        i(kVar, f11, f12, i11, f13, f14, f15, f16, f17, f18, 0.0f, 360.0f);
    }

    public static void i(l2.k kVar, float f11, float f12, int i11, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21) {
        e(kVar, f11, f12, 0.0f, 0.0f, i11, f13, f14, f15, f16, f17, f18, f19, f21);
    }

    public static void j(l2.k kVar, float f11, float f12, int i11, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23, float f24, float f25) {
        k(kVar, f11, f12, i11, f13, f14, f15, f16, f17, f18, f19, f21, f22, f23, f24, f25, 0.0f, 360.0f);
    }

    public static void k(l2.k kVar, float f11, float f12, int i11, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23, float f24, float f25, float f26, float f27) {
        f(kVar, f11, f12, 0.0f, 0.0f, i11, f13, f14, f15, f16, f17, f18, f19, f21, f22, f23, f24, f25, f26, f27);
    }

    public static void l(l2.k kVar, float f11, float f12, int i11, Vector3 vector3, Vector3 vector32) {
        h(kVar, f11, f12, i11, vector3.f12537x, vector3.f12538y, vector3.f12539z, vector32.f12537x, vector32.f12538y, vector32.f12539z);
    }

    public static void m(l2.k kVar, float f11, float f12, int i11, Vector3 vector3, Vector3 vector32, float f13, float f14) {
        e(kVar, f11, f12, 0.0f, 0.0f, i11, vector3.f12537x, vector3.f12538y, vector3.f12539z, vector32.f12537x, vector32.f12538y, vector32.f12539z, f13, f14);
    }

    public static void n(l2.k kVar, float f11, float f12, int i11, Vector3 vector3, Vector3 vector32, Vector3 vector33, Vector3 vector34) {
        j(kVar, f11, f12, i11, vector3.f12537x, vector3.f12538y, vector3.f12539z, vector32.f12537x, vector32.f12538y, vector32.f12539z, vector33.f12537x, vector33.f12538y, vector33.f12539z, vector34.f12537x, vector34.f12538y, vector34.f12539z);
    }

    public static void o(l2.k kVar, float f11, float f12, int i11, Vector3 vector3, Vector3 vector32, Vector3 vector33, Vector3 vector34, float f13, float f14) {
        f(kVar, f11, f12, 0.0f, 0.0f, i11, vector3.f12537x, vector3.f12538y, vector3.f12539z, vector32.f12537x, vector32.f12538y, vector32.f12539z, vector33.f12537x, vector33.f12538y, vector33.f12539z, vector34.f12537x, vector34.f12538y, vector34.f12539z, f13, f14);
    }

    public static void p(l2.k kVar, float f11, int i11, float f12, float f13, float f14, float f15, float f16, float f17) {
        q(kVar, f11, i11, f12, f13, f14, f15, f16, f17, 0.0f, 360.0f);
    }

    public static void q(l2.k kVar, float f11, int i11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        float f21 = f11 * 2.0f;
        i(kVar, f21, f21, i11, f12, f13, f14, f15, f16, f17, f18, f19);
    }

    public static void r(l2.k kVar, float f11, int i11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23, float f24) {
        s(kVar, f11, i11, f12, f13, f14, f15, f16, f17, f18, f19, f21, f22, f23, f24, 0.0f, 360.0f);
    }

    public static void s(l2.k kVar, float f11, int i11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23, float f24, float f25, float f26) {
        float f27 = f11 * 2.0f;
        f(kVar, f27, f27, 0.0f, 0.0f, i11, f12, f13, f14, f15, f16, f17, f18, f19, f21, f22, f23, f24, f25, f26);
    }

    public static void t(l2.k kVar, float f11, int i11, Vector3 vector3, Vector3 vector32) {
        p(kVar, f11, i11, vector3.f12537x, vector3.f12538y, vector3.f12539z, vector32.f12537x, vector32.f12538y, vector32.f12539z);
    }

    public static void u(l2.k kVar, float f11, int i11, Vector3 vector3, Vector3 vector32, float f12, float f13) {
        q(kVar, f11, i11, vector3.f12537x, vector3.f12538y, vector3.f12539z, vector32.f12537x, vector32.f12538y, vector32.f12539z, f12, f13);
    }

    public static void v(l2.k kVar, float f11, int i11, Vector3 vector3, Vector3 vector32, Vector3 vector33, Vector3 vector34) {
        r(kVar, f11, i11, vector3.f12537x, vector3.f12538y, vector3.f12539z, vector32.f12537x, vector32.f12538y, vector32.f12539z, vector33.f12537x, vector33.f12538y, vector33.f12539z, vector34.f12537x, vector34.f12538y, vector34.f12539z);
    }

    public static void w(l2.k kVar, float f11, int i11, Vector3 vector3, Vector3 vector32, Vector3 vector33, Vector3 vector34, float f12, float f13) {
        s(kVar, f11, i11, vector3.f12537x, vector3.f12538y, vector3.f12539z, vector32.f12537x, vector32.f12538y, vector32.f12539z, vector33.f12537x, vector33.f12538y, vector33.f12539z, vector34.f12537x, vector34.f12538y, vector34.f12539z, f12, f13);
    }
}
