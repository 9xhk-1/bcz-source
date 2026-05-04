package m2;

import a3.s;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.a;
import kotlin.jvm.internal.s0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class j extends b {
    public static float[] A = null;
    public static final a B = new a();
    public static final com.badlogic.gdx.utils.a<x1.i> C = new com.badlogic.gdx.utils.a<>();
    public static final int D = 4;

    /* renamed from: z, reason: collision with root package name */
    public static short[] f71791z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends s<x1.i> {
        @Override // a3.j0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public x1.i g() {
            return new x1.i();
        }

        @Override // a3.s, a3.j0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public x1.i h() {
            x1.i iVar = (x1.i) super.h();
            iVar.f97050d = null;
            iVar.f97049c = null;
            iVar.f97048b.e("", null, 0, 0, 0);
            iVar.f97052f = null;
            iVar.f97053g = null;
            return iVar;
        }
    }

    public static void d(l2.k kVar, x1.i iVar, float f11, com.badlogic.gdx.graphics.b bVar, com.badlogic.gdx.graphics.b bVar2, com.badlogic.gdx.graphics.b bVar3) {
        int i11;
        int i12;
        int i13;
        Mesh mesh = iVar.f97048b.f7490e;
        int i14 = mesh.q1(1) != null ? mesh.q1(1).f12492e / 4 : -1;
        int i15 = mesh.q1(8) != null ? mesh.q1(8).f12492e / 4 : -1;
        int i16 = mesh.q1(128) != null ? mesh.q1(128).f12492e / 4 : -1;
        int i17 = mesh.q1(256) != null ? mesh.q1(256).f12492e / 4 : -1;
        int s12 = mesh.s1() / 4;
        if (mesh.D0() > 0) {
            g(mesh.D0());
            c2.b bVar4 = iVar.f97048b;
            mesh.g1(bVar4.f7488c, bVar4.f7489d, f71791z, 0);
            i12 = j();
            i11 = i() - i12;
        } else {
            c2.b bVar5 = iVar.f97048b;
            int i18 = bVar5.f7488c;
            i11 = bVar5.f7489d;
            i12 = i18;
        }
        int i19 = i11 * s12;
        h(i19);
        mesh.u1(i12 * s12, i19, A, 0);
        while (i12 < i11) {
            int i21 = i12 * s12;
            Vector3 vector3 = b.f71771f;
            float[] fArr = A;
            int i22 = i21 + i14;
            vector3.set(fArr[i22], fArr[i22 + 1], fArr[i22 + 2]);
            int i23 = -1;
            if (i15 != -1) {
                Vector3 vector32 = b.f71772g;
                float[] fArr2 = A;
                int i24 = i21 + i15;
                i13 = i21;
                vector32.set(fArr2[i24], fArr2[i24 + 1], fArr2[i24 + 2]);
                b.f71773h.set(vector3).add(vector32.scl(f11));
                i23 = -1;
            } else {
                i13 = i21;
            }
            if (i16 != i23) {
                Vector3 vector33 = b.f71774i;
                float[] fArr3 = A;
                int i25 = i13 + i16;
                vector33.set(fArr3[i25], fArr3[i25 + 1], fArr3[i25 + 2]);
                b.f71775j.set(vector3).add(vector33.scl(f11));
                i23 = -1;
            }
            if (i17 != i23) {
                Vector3 vector34 = b.f71776k;
                float[] fArr4 = A;
                int i26 = i13 + i17;
                vector34.set(fArr4[i26], fArr4[i26 + 1], fArr4[i26 + 2]);
                b.f71777l.set(vector3).add(vector34.scl(f11));
            }
            vector3.mul(iVar.f97047a);
            Vector3 vector35 = b.f71773h;
            vector35.mul(iVar.f97047a);
            Vector3 vector36 = b.f71775j;
            vector36.mul(iVar.f97047a);
            Vector3 vector37 = b.f71777l;
            vector37.mul(iVar.f97047a);
            if (i15 != -1) {
                kVar.h(bVar);
                kVar.v0(vector3, vector35);
            }
            if (i16 != -1) {
                kVar.h(bVar2);
                kVar.v0(vector3, vector36);
            }
            if (i17 != -1) {
                kVar.h(bVar3);
                kVar.v0(vector3, vector37);
            }
            i12++;
        }
    }

    public static void e(l2.k kVar, x1.j jVar, float f11) {
        f(kVar, jVar, f11, b.f71766a.F(0.0f, 0.0f, 1.0f, 1.0f), b.f71767b.F(1.0f, 0.0f, 0.0f, 1.0f), b.f71768c.F(0.0f, 1.0f, 0.0f, 1.0f));
    }

    public static void f(l2.k kVar, x1.j jVar, float f11, com.badlogic.gdx.graphics.b bVar, com.badlogic.gdx.graphics.b bVar2, com.badlogic.gdx.graphics.b bVar3) {
        com.badlogic.gdx.utils.a<x1.i> aVar = C;
        jVar.z(aVar, B);
        a.b<x1.i> it = aVar.iterator();
        while (it.hasNext()) {
            d(kVar, it.next(), f11, bVar, bVar2, bVar3);
        }
        B.j();
        C.clear();
    }

    public static void g(int i11) {
        short[] sArr = f71791z;
        if (sArr == null || sArr.length < i11) {
            f71791z = new short[i11];
        }
    }

    public static void h(int i11) {
        float[] fArr = A;
        if (fArr == null || fArr.length < i11) {
            A = new float[i11];
        }
    }

    public static short i() {
        short s11 = s0.f67031b;
        int i11 = 0;
        while (true) {
            short[] sArr = f71791z;
            if (i11 >= sArr.length) {
                return s11;
            }
            short s12 = sArr[i11];
            if (s12 > s11) {
                s11 = s12;
            }
            i11++;
        }
    }

    public static short j() {
        short s11 = s0.f67032c;
        int i11 = 0;
        while (true) {
            short[] sArr = f71791z;
            if (i11 >= sArr.length) {
                return s11;
            }
            short s12 = sArr[i11];
            if (s12 < s11) {
                s11 = s12;
            }
            i11++;
        }
    }
}
