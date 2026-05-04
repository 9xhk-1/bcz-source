package m2;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.collision.BoundingBox;
import l2.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c extends b {
    public static void d(l2.k kVar, float f11, float f12, float f13) {
        e(kVar, 0.0f, 0.0f, 0.0f, f11, f12, f13);
    }

    public static void e(l2.k kVar, float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17 = f14 * 0.5f;
        float f18 = f15 * 0.5f;
        float f19 = 0.5f * f16;
        float f21 = f11 - f17;
        float f22 = f12 - f18;
        float f23 = f13 - f19;
        float f24 = f11 + f17;
        float f25 = f12 + f18;
        float f26 = f13 + f19;
        g(kVar, b.c().set(f21, f22, f23), b.c().set(f21, f25, f23), b.c().set(f24, f22, f23), b.c().set(f24, f25, f23), b.c().set(f21, f22, f26), b.c().set(f21, f25, f26), b.c().set(f24, f22, f26), b.c().set(f24, f25, f26));
        b.a();
    }

    public static void f(l2.k kVar, Matrix4 matrix4) {
        g(kVar, b.c().set(-0.5f, -0.5f, -0.5f).mul(matrix4), b.c().set(-0.5f, 0.5f, -0.5f).mul(matrix4), b.c().set(0.5f, -0.5f, -0.5f).mul(matrix4), b.c().set(0.5f, 0.5f, -0.5f).mul(matrix4), b.c().set(-0.5f, -0.5f, 0.5f).mul(matrix4), b.c().set(-0.5f, 0.5f, 0.5f).mul(matrix4), b.c().set(0.5f, -0.5f, 0.5f).mul(matrix4), b.c().set(0.5f, 0.5f, 0.5f).mul(matrix4));
        b.a();
    }

    public static void g(l2.k kVar, Vector3 vector3, Vector3 vector32, Vector3 vector33, Vector3 vector34, Vector3 vector35, Vector3 vector36, Vector3 vector37, Vector3 vector38) {
        if ((kVar.getAttributes().k() & 408) == 0) {
            i(kVar, b.f71780o.b(vector3, null, null, null), b.f71781p.b(vector32, null, null, null), b.f71782q.b(vector33, null, null, null), b.f71783r.b(vector34, null, null, null), b.f71784s.b(vector35, null, null, null), b.f71785t.b(vector36, null, null, null), b.f71786u.b(vector37, null, null, null), b.f71787v.b(vector38, null, null, null));
            return;
        }
        kVar.y(24);
        kVar.a0(6);
        Vector3 vector39 = b.f71772g;
        Vector3 lerp = vector39.set(vector3).lerp(vector34, 0.5f);
        Vector3 vector310 = b.f71773h;
        Vector3 nor = lerp.sub(vector310.set(vector35).lerp(vector38, 0.5f)).nor();
        kVar.c0(vector3, vector32, vector34, vector33, nor);
        kVar.c0(vector36, vector35, vector37, vector38, nor.scl(-1.0f));
        Vector3 nor2 = vector39.set(vector3).lerp(vector37, 0.5f).sub(vector310.set(vector32).lerp(vector38, 0.5f)).nor();
        kVar.c0(vector35, vector3, vector33, vector37, nor2);
        kVar.c0(vector32, vector36, vector38, vector34, nor2.scl(-1.0f));
        Vector3 nor3 = vector39.set(vector3).lerp(vector36, 0.5f).sub(vector310.set(vector33).lerp(vector38, 0.5f)).nor();
        kVar.c0(vector35, vector36, vector32, vector3, nor3);
        kVar.c0(vector33, vector34, vector38, vector37, nor3.scl(-1.0f));
    }

    public static void h(l2.k kVar, BoundingBox boundingBox) {
        kVar.U(boundingBox.getCorner000(b.c()), boundingBox.getCorner010(b.c()), boundingBox.getCorner100(b.c()), boundingBox.getCorner110(b.c()), boundingBox.getCorner001(b.c()), boundingBox.getCorner011(b.c()), boundingBox.getCorner101(b.c()), boundingBox.getCorner111(b.c()));
        b.a();
    }

    public static void i(l2.k kVar, k.a aVar, k.a aVar2, k.a aVar3, k.a aVar4, k.a aVar5, k.a aVar6, k.a aVar7, k.a aVar8) {
        kVar.y(8);
        short L0 = kVar.L0(aVar);
        short L02 = kVar.L0(aVar3);
        short L03 = kVar.L0(aVar4);
        short L04 = kVar.L0(aVar2);
        short L05 = kVar.L0(aVar5);
        short L06 = kVar.L0(aVar7);
        short L07 = kVar.L0(aVar8);
        short L08 = kVar.L0(aVar6);
        int b02 = kVar.b0();
        if (b02 == 1) {
            kVar.x0(24);
            kVar.A(L0, L02, L03, L04);
            kVar.A(L06, L05, L08, L07);
            kVar.R(L0, L05, L04, L08, L03, L07, L02, L06);
            return;
        }
        if (b02 == 0) {
            kVar.a0(2);
            kVar.A(L0, L02, L03, L04);
            kVar.A(L06, L05, L08, L07);
            return;
        }
        kVar.a0(6);
        kVar.A(L0, L02, L03, L04);
        kVar.A(L06, L05, L08, L07);
        kVar.A(L0, L04, L08, L05);
        kVar.A(L06, L07, L03, L02);
        kVar.A(L06, L02, L0, L05);
        kVar.A(L03, L07, L08, L04);
    }
}
