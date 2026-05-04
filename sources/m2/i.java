package m2;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.GdxRuntimeException;
import l2.k;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class i extends b {
    public static void d(l2.k kVar, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23, float f24, float f25, float f26, int i11, int i12) {
        f(kVar, b.f71780o.c(null).h(f11, f12, f13).f(f24, f25, f26).j(0.0f, 1.0f), b.f71781p.c(null).h(f14, f15, f16).f(f24, f25, f26).j(1.0f, 1.0f), b.f71782q.c(null).h(f17, f18, f19).f(f24, f25, f26).j(1.0f, 0.0f), b.f71783r.c(null).h(f21, f22, f23).f(f24, f25, f26).j(0.0f, 0.0f), i11, i12);
    }

    public static void e(l2.k kVar, Vector3 vector3, Vector3 vector32, Vector3 vector33, Vector3 vector34, Vector3 vector35, int i11, int i12) {
        f(kVar, b.f71780o.b(vector3, vector35, null, null).j(0.0f, 1.0f), b.f71781p.b(vector32, vector35, null, null).j(1.0f, 1.0f), b.f71782q.b(vector33, vector35, null, null).j(1.0f, 0.0f), b.f71783r.b(vector34, vector35, null, null).j(0.0f, 0.0f), i11, i12);
    }

    public static void f(l2.k kVar, k.a aVar, k.a aVar2, k.a aVar3, k.a aVar4, int i11, int i12) {
        if (i11 < 1 || i12 < 1) {
            throw new GdxRuntimeException("divisionsU and divisionV must be > 0, u,v: " + i11 + j2.O + i12);
        }
        kVar.y((i12 + 1) * (i11 + 1));
        kVar.a0(i12 * i11);
        for (int i13 = 0; i13 <= i11; i13++) {
            float f11 = i13 / i11;
            b.f71784s.c(aVar).a(aVar2, f11);
            b.f71785t.c(aVar4).a(aVar3, f11);
            for (int i14 = 0; i14 <= i12; i14++) {
                short L0 = kVar.L0(b.f71786u.c(b.f71784s).a(b.f71785t, i14 / i12));
                if (i13 > 0 && i14 > 0) {
                    int i15 = L0 - i12;
                    kVar.A((short) (i15 - 2), (short) (L0 - 1), L0, (short) (i15 - 1));
                }
            }
        }
    }
}
