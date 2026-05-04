package m2;

import com.badlogic.gdx.math.n;
import l2.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f extends b {
    public static void d(l2.k kVar, float f11, float f12, float f13, int i11) {
        e(kVar, f11, f12, f13, i11, 0.0f, 360.0f);
    }

    public static void e(l2.k kVar, float f11, float f12, float f13, int i11, float f14, float f15) {
        f(kVar, f11, f12, f13, i11, f14, f15, true);
    }

    public static void f(l2.k kVar, float f11, float f12, float f13, int i11, float f14, float f15, boolean z11) {
        float f16 = f11 * 0.5f;
        float f17 = f12 * 0.5f;
        float f18 = 0.5f * f13;
        float f19 = f14 * 0.017453292f;
        float f21 = i11;
        float f22 = ((f15 - f14) * 0.017453292f) / f21;
        float f23 = 1.0f;
        float f24 = 1.0f / f21;
        k.a b11 = b.f71782q.b(null, null, null, null);
        b11.f69227d = true;
        b11.f69225b = true;
        b11.f69231h = true;
        k.a b12 = b.f71783r.b(null, null, null, null);
        b12.f69227d = true;
        b12.f69225b = true;
        b12.f69231h = true;
        kVar.y((i11 + 1) * 2);
        kVar.a0(i11);
        int i12 = 0;
        short s11 = 0;
        short s12 = 0;
        while (i12 <= i11) {
            float f25 = i12;
            float f26 = (f22 * f25) + f19;
            float f27 = f23 - (f25 * f24);
            float f28 = f18;
            float f29 = f16;
            b11.f69224a.set(n.s(f26) * f16, 0.0f, n.Z(f26) * f28);
            b11.f69226c.set(b11.f69224a).nor();
            b11.f69224a.f12538y = -f17;
            f23 = 1.0f;
            b11.f69230g.set(f27, 1.0f);
            b12.f69224a.set(b11.f69224a);
            b12.f69226c.set(b11.f69226c);
            b12.f69224a.f12538y = f17;
            b12.f69230g.set(f27, 0.0f);
            short L0 = kVar.L0(b11);
            short L02 = kVar.L0(b12);
            if (i12 != 0) {
                kVar.A(s11, L02, L0, s12);
            }
            i12++;
            s12 = L0;
            s11 = L02;
            f16 = f29;
            f18 = f28;
        }
        if (z11) {
            g.f(kVar, f11, f13, 0.0f, 0.0f, i11, 0.0f, f17, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, f14, f15);
            g.f(kVar, f11, f13, 0.0f, 0.0f, i11, 0.0f, -f17, 0.0f, 0.0f, -1.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 180.0f - f15, 180.0f - f14);
        }
    }
}
