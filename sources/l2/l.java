package l2;

import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.a;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public x1.e f69232a;

    /* renamed from: b, reason: collision with root package name */
    public c2.c f69233b;

    /* renamed from: c, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<j> f69234c = new com.badlogic.gdx.utils.a<>();

    /* renamed from: d, reason: collision with root package name */
    public Matrix4 f69235d = new Matrix4();

    public static void K(x1.e eVar) {
        eVar.f97010a.clear();
        eVar.f97013d.clear();
        eVar.f97014e.clear();
        a.b<c2.c> it = eVar.f97011b.iterator();
        while (it.hasNext()) {
            L(eVar, it.next());
        }
    }

    public static void L(x1.e eVar, c2.c cVar) {
        a.b<c2.f> it = cVar.f7502i.iterator();
        while (it.hasNext()) {
            c2.f next = it.next();
            if (!eVar.f97010a.l(next.f7512b, true)) {
                eVar.f97010a.a(next.f7512b);
            }
            if (!eVar.f97014e.l(next.f7511a, true)) {
                eVar.f97014e.a(next.f7511a);
                if (!eVar.f97013d.l(next.f7511a.f7490e, true)) {
                    eVar.f97013d.a(next.f7511a.f7490e);
                }
                eVar.e1(next.f7511a.f7490e);
            }
        }
        Iterator<c2.c> it2 = cVar.q().iterator();
        while (it2.hasNext()) {
            L(eVar, it2.next());
        }
    }

    public final j A(com.badlogic.gdx.graphics.s sVar) {
        a.b<j> it = this.f69234c.iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (next.getAttributes().equals(sVar) && next.w() < 32768) {
                return next;
            }
        }
        j jVar = new j();
        jVar.d(sVar);
        this.f69234c.a(jVar);
        return jVar;
    }

    public void B(a3.q qVar) {
        x1.e eVar = this.f69232a;
        if (eVar == null) {
            throw new GdxRuntimeException("Call begin() first");
        }
        eVar.e1(qVar);
    }

    public c2.c C() {
        c2.c cVar = new c2.c();
        D(cVar);
        cVar.f7494a = "node" + this.f69232a.f97011b.f13179b;
        return cVar;
    }

    public c2.c D(c2.c cVar) {
        if (this.f69232a == null) {
            throw new GdxRuntimeException("Call begin() first");
        }
        z();
        this.f69232a.f97011b.a(cVar);
        this.f69233b = cVar;
        return cVar;
    }

    public c2.c E(String str, x1.e eVar) {
        c2.c cVar = new c2.c();
        cVar.f7494a = str;
        cVar.b(eVar.f97011b);
        D(cVar);
        Iterator<a3.q> it = eVar.Z().iterator();
        while (it.hasNext()) {
            B(it.next());
        }
        return cVar;
    }

    public c2.b F(String str, Mesh mesh, int i11, int i12, int i13, x1.d dVar) {
        c2.b bVar = new c2.b();
        bVar.f7486a = str;
        bVar.f7487b = i11;
        bVar.f7490e = mesh;
        bVar.f7488c = i12;
        bVar.f7489d = i13;
        J(bVar, dVar);
        return bVar;
    }

    public c2.b G(String str, Mesh mesh, int i11, x1.d dVar) {
        return F(str, mesh, i11, 0, mesh.D0(), dVar);
    }

    public k H(String str, int i11, long j11, x1.d dVar) {
        return I(str, i11, j.g(j11), dVar);
    }

    public k I(String str, int i11, com.badlogic.gdx.graphics.s sVar, x1.d dVar) {
        j A = A(sVar);
        J(A.Z0(str, i11), dVar);
        return A;
    }

    public void J(c2.b bVar, x1.d dVar) {
        if (this.f69233b == null) {
            C();
        }
        this.f69233b.f7502i.a(new c2.f(bVar, dVar));
    }

    public void a() {
        if (this.f69232a != null) {
            throw new GdxRuntimeException("Call end() first");
        }
        this.f69233b = null;
        this.f69232a = new x1.e();
        this.f69234c.clear();
    }

    public x1.e b(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, int i11, int i12, x1.d dVar, long j11) {
        a();
        H("arrow", i12, j11, dVar).K(f11, f12, f13, f14, f15, f16, f17, f18, i11);
        return y();
    }

    public x1.e c(Vector3 vector3, Vector3 vector32, x1.d dVar, long j11) {
        return b(vector3.f12537x, vector3.f12538y, vector3.f12539z, vector32.f12537x, vector32.f12538y, vector32.f12539z, 0.1f, 0.1f, 5, 4, dVar, j11);
    }

    public x1.e d(float f11, float f12, float f13, int i11, x1.d dVar, long j11) {
        a();
        H("box", i11, j11, dVar).z(f11, f12, f13);
        return y();
    }

    public x1.e e(float f11, float f12, float f13, x1.d dVar, long j11) {
        return d(f11, f12, f13, 4, dVar, j11);
    }

    public x1.e f(float f11, float f12, int i11, int i12, x1.d dVar, long j11) {
        a();
        H("capsule", i12, j11, dVar).z0(f11, f12, i11);
        return y();
    }

    public x1.e g(float f11, float f12, int i11, x1.d dVar, long j11) {
        return f(f11, f12, i11, 4, dVar, j11);
    }

    public x1.e h(float f11, float f12, float f13, int i11, int i12, x1.d dVar, long j11) {
        return i(f11, f12, f13, i11, i12, dVar, j11, 0.0f, 360.0f);
    }

    public x1.e i(float f11, float f12, float f13, int i11, int i12, x1.d dVar, long j11, float f14, float f15) {
        a();
        H("cone", i12, j11, dVar).o(f11, f12, f13, i11, f14, f15);
        return y();
    }

    public x1.e j(float f11, float f12, float f13, int i11, x1.d dVar, long j11) {
        return h(f11, f12, f13, i11, 4, dVar, j11);
    }

    public x1.e k(float f11, float f12, float f13, int i11, x1.d dVar, long j11, float f14, float f15) {
        return i(f11, f12, f13, i11, 4, dVar, j11, f14, f15);
    }

    public x1.e l(float f11, float f12, float f13, int i11, int i12, x1.d dVar, long j11) {
        return m(f11, f12, f13, i11, i12, dVar, j11, 0.0f, 360.0f);
    }

    public x1.e m(float f11, float f12, float f13, int i11, int i12, x1.d dVar, long j11, float f14, float f15) {
        a();
        H("cylinder", i12, j11, dVar).Z(f11, f12, f13, i11, f14, f15);
        return y();
    }

    public x1.e n(float f11, float f12, float f13, int i11, x1.d dVar, long j11) {
        return l(f11, f12, f13, i11, 4, dVar, j11);
    }

    public x1.e o(float f11, float f12, float f13, int i11, x1.d dVar, long j11, float f14, float f15) {
        return m(f11, f12, f13, i11, 4, dVar, j11, f14, f15);
    }

    public x1.e p(int i11, int i12, float f11, float f12, x1.d dVar, long j11) {
        a();
        k H = H("lines", 1, j11, dVar);
        float f13 = (i11 * f11) / 2.0f;
        float f14 = (i12 * f12) / 2.0f;
        float f15 = -f13;
        float f16 = -f14;
        float f17 = f15;
        float f18 = f17;
        for (int i13 = 0; i13 <= i11; i13++) {
            H.G(f17, 0.0f, f14, f18, 0.0f, f16);
            f17 += f11;
            f18 += f11;
        }
        float f19 = f16;
        for (int i14 = 0; i14 <= i12; i14++) {
            H.G(f15, 0.0f, f19, f13, 0.0f, f16);
            f19 += f12;
            f16 += f12;
        }
        return y();
    }

    public x1.e q(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23, float f24, float f25, float f26, int i11, x1.d dVar, long j11) {
        a();
        H("rect", i11, j11, dVar).w0(f11, f12, f13, f14, f15, f16, f17, f18, f19, f21, f22, f23, f24, f25, f26);
        return y();
    }

    public x1.e r(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f21, float f22, float f23, float f24, float f25, float f26, x1.d dVar, long j11) {
        return q(f11, f12, f13, f14, f15, f16, f17, f18, f19, f21, f22, f23, f24, f25, f26, 4, dVar, j11);
    }

    public x1.e s(float f11, float f12, float f13, int i11, int i12, int i13, x1.d dVar, long j11) {
        return t(f11, f12, f13, i11, i12, i13, dVar, j11, 0.0f, 360.0f, 0.0f, 180.0f);
    }

    public x1.e t(float f11, float f12, float f13, int i11, int i12, int i13, x1.d dVar, long j11, float f14, float f15, float f16, float f17) {
        a();
        H("sphere", i13, j11, dVar).T(f11, f12, f13, i11, i12, f14, f15, f16, f17);
        return y();
    }

    public x1.e u(float f11, float f12, float f13, int i11, int i12, x1.d dVar, long j11) {
        return s(f11, f12, f13, i11, i12, 4, dVar, j11);
    }

    public x1.e v(float f11, float f12, float f13, int i11, int i12, x1.d dVar, long j11, float f14, float f15, float f16, float f17) {
        return t(f11, f12, f13, i11, i12, 4, dVar, j11, f14, f15, f16, f17);
    }

    public x1.e w(float f11, float f12, float f13, int i11, int i12, x1.d dVar, long j11) {
        a();
        C();
        k H = H("xyz", i12, j11, dVar);
        H.h(com.badlogic.gdx.graphics.b.F);
        H.K(0.0f, 0.0f, 0.0f, f11, 0.0f, 0.0f, f12, f13, i11);
        H.h(com.badlogic.gdx.graphics.b.f11537t);
        H.K(0.0f, 0.0f, 0.0f, 0.0f, f11, 0.0f, f12, f13, i11);
        H.h(com.badlogic.gdx.graphics.b.f11530m);
        H.K(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f11, f12, f13, i11);
        return y();
    }

    public x1.e x(float f11, x1.d dVar, long j11) {
        return w(f11, 0.1f, 0.1f, 5, 4, dVar, j11);
    }

    public x1.e y() {
        x1.e eVar = this.f69232a;
        if (eVar == null) {
            throw new GdxRuntimeException("Call begin() first");
        }
        z();
        this.f69232a = null;
        a.b<j> it = this.f69234c.iterator();
        while (it.hasNext()) {
            it.next().i();
        }
        this.f69234c.clear();
        K(eVar);
        return eVar;
    }

    public final void z() {
        if (this.f69233b != null) {
            this.f69233b = null;
        }
    }
}
