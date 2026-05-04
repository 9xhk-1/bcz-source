package x1;

import a3.j0;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.collision.BoundingBox;
import com.badlogic.gdx.utils.a;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h implements j {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f97040g = true;

    /* renamed from: a, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<d> f97041a;

    /* renamed from: b, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<c2.c> f97042b;

    /* renamed from: c, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<c2.a> f97043c;

    /* renamed from: d, reason: collision with root package name */
    public final e f97044d;

    /* renamed from: e, reason: collision with root package name */
    public Matrix4 f97045e;

    /* renamed from: f, reason: collision with root package name */
    public Object f97046f;

    public h(e eVar) {
        this(eVar, (String[]) null);
    }

    private void A() {
        int i11 = this.f97042b.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            B(this.f97042b.get(i12));
        }
    }

    public final void B(c2.c cVar) {
        int i11 = cVar.f7502i.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            c2.f fVar = cVar.f7502i.get(i12);
            com.badlogic.gdx.utils.b<c2.c, Matrix4> bVar = fVar.f7513c;
            if (bVar != null) {
                for (int i13 = 0; i13 < bVar.f13193c; i13++) {
                    c2.c[] cVarArr = bVar.f13191a;
                    cVarArr[i13] = s(cVarArr[i13].f7494a);
                }
            }
            if (!this.f97041a.l(fVar.f7512b, true)) {
                int q11 = this.f97041a.q(fVar.f7512b, false);
                if (q11 < 0) {
                    com.badlogic.gdx.utils.a<d> aVar = this.f97041a;
                    d B = fVar.f7512b.B();
                    fVar.f7512b = B;
                    aVar.a(B);
                } else {
                    fVar.f7512b = this.f97041a.get(q11);
                }
            }
        }
        int p11 = cVar.p();
        for (int i14 = 0; i14 < p11; i14++) {
            B(cVar.n(i14));
        }
    }

    public BoundingBox a(BoundingBox boundingBox) {
        boundingBox.inf();
        return m(boundingBox);
    }

    public void d() {
        int i11 = this.f97042b.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f97042b.get(i12).h(true);
        }
        for (int i13 = 0; i13 < i11; i13++) {
            this.f97042b.get(i13).d(true);
        }
    }

    public h e() {
        return new h(this);
    }

    public void f(c2.a aVar) {
        g(aVar, f97040g);
    }

    public void g(c2.a aVar, boolean z11) {
        c2.a aVar2 = new c2.a();
        aVar2.f7482a = aVar.f7482a;
        aVar2.f7483b = aVar.f7483b;
        a.b<c2.d> it = aVar.f7484c.iterator();
        while (it.hasNext()) {
            c2.d next = it.next();
            c2.c s11 = s(next.f7505a.f7494a);
            if (s11 != null) {
                c2.d dVar = new c2.d();
                dVar.f7505a = s11;
                if (z11) {
                    dVar.f7506b = next.f7506b;
                    dVar.f7507c = next.f7507c;
                    dVar.f7508d = next.f7508d;
                } else {
                    if (next.f7506b != null) {
                        dVar.f7506b = new com.badlogic.gdx.utils.a<>();
                        a.b<c2.e<Vector3>> it2 = next.f7506b.iterator();
                        while (it2.hasNext()) {
                            c2.e<Vector3> next2 = it2.next();
                            dVar.f7506b.a(new c2.e<>(next2.f7509a, next2.f7510b));
                        }
                    }
                    if (next.f7507c != null) {
                        dVar.f7507c = new com.badlogic.gdx.utils.a<>();
                        a.b<c2.e<Quaternion>> it3 = next.f7507c.iterator();
                        while (it3.hasNext()) {
                            c2.e<Quaternion> next3 = it3.next();
                            dVar.f7507c.a(new c2.e<>(next3.f7509a, next3.f7510b));
                        }
                    }
                    if (next.f7508d != null) {
                        dVar.f7508d = new com.badlogic.gdx.utils.a<>();
                        a.b<c2.e<Vector3>> it4 = next.f7508d.iterator();
                        while (it4.hasNext()) {
                            c2.e<Vector3> next4 = it4.next();
                            dVar.f7508d.a(new c2.e<>(next4.f7509a, next4.f7510b));
                        }
                    }
                }
                if (dVar.f7506b != null || dVar.f7507c != null || dVar.f7508d != null) {
                    aVar2.f7484c.a(dVar);
                }
            }
        }
        if (aVar2.f7484c.f13179b > 0) {
            this.f97043c.a(aVar2);
        }
    }

    public void h(Iterable<c2.a> iterable) {
        Iterator<c2.a> it = iterable.iterator();
        while (it.hasNext()) {
            g(it.next(), f97040g);
        }
    }

    public void i(Iterable<c2.a> iterable, boolean z11) {
        Iterator<c2.a> it = iterable.iterator();
        while (it.hasNext()) {
            g(it.next(), z11);
        }
    }

    public final void j(com.badlogic.gdx.utils.a<c2.c> aVar) {
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f97042b.a(aVar.get(i12).j());
        }
        A();
    }

    public final void k(com.badlogic.gdx.utils.a<c2.c> aVar, com.badlogic.gdx.utils.a<String> aVar2) {
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            c2.c cVar = aVar.get(i12);
            a.b<String> it = aVar2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().equals(cVar.f7494a)) {
                        this.f97042b.a(cVar.j());
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        A();
    }

    public final void l(com.badlogic.gdx.utils.a<c2.c> aVar, String... strArr) {
        int i11 = aVar.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            c2.c cVar = aVar.get(i12);
            int length = strArr.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    break;
                }
                if (strArr[i13].equals(cVar.f7494a)) {
                    this.f97042b.a(cVar.j());
                    break;
                }
                i13++;
            }
        }
        A();
    }

    public BoundingBox m(BoundingBox boundingBox) {
        int i11 = this.f97042b.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f97042b.get(i12).l(boundingBox);
        }
        return boundingBox;
    }

    public c2.a n(String str) {
        return p(str, false);
    }

    public c2.a p(String str, boolean z11) {
        int i11 = this.f97043c.f13179b;
        int i12 = 0;
        if (z11) {
            while (i12 < i11) {
                c2.a aVar = this.f97043c.get(i12);
                if (aVar.f7482a.equalsIgnoreCase(str)) {
                    return aVar;
                }
                i12++;
            }
            return null;
        }
        while (i12 < i11) {
            c2.a aVar2 = this.f97043c.get(i12);
            if (aVar2.f7482a.equals(str)) {
                return aVar2;
            }
            i12++;
        }
        return null;
    }

    public d q(String str) {
        return r(str, true);
    }

    public d r(String str, boolean z11) {
        int i11 = this.f97041a.f13179b;
        int i12 = 0;
        if (z11) {
            while (i12 < i11) {
                d dVar = this.f97041a.get(i12);
                if (dVar.f97009d.equalsIgnoreCase(str)) {
                    return dVar;
                }
                i12++;
            }
            return null;
        }
        while (i12 < i11) {
            d dVar2 = this.f97041a.get(i12);
            if (dVar2.f97009d.equals(str)) {
                return dVar2;
            }
            i12++;
        }
        return null;
    }

    public c2.c s(String str) {
        return t(str, true);
    }

    public c2.c t(String str, boolean z11) {
        return u(str, z11, false);
    }

    public c2.c u(String str, boolean z11, boolean z12) {
        return c2.c.r(this.f97042b, str, z11, z12);
    }

    public i v(i iVar) {
        return w(iVar, this.f97042b.get(0));
    }

    public i w(i iVar, c2.c cVar) {
        return x(iVar, cVar, cVar.f7502i.get(0));
    }

    public i x(i iVar, c2.c cVar, c2.f fVar) {
        Matrix4 matrix4;
        fVar.c(iVar);
        if (fVar.f7514d != null || (matrix4 = this.f97045e) == null) {
            Matrix4 matrix42 = this.f97045e;
            if (matrix42 != null) {
                iVar.f97047a.set(matrix42);
            } else {
                iVar.f97047a.idt();
            }
        } else {
            iVar.f97047a.set(matrix4).mul(cVar.f7501h);
        }
        iVar.f97053g = this.f97046f;
        return iVar;
    }

    public void y(c2.c cVar, com.badlogic.gdx.utils.a<i> aVar, j0<i> j0Var) {
        com.badlogic.gdx.utils.a<c2.f> aVar2 = cVar.f7502i;
        if (aVar2.f13179b > 0) {
            a.b<c2.f> it = aVar2.iterator();
            while (it.hasNext()) {
                c2.f next = it.next();
                if (next.f7515e) {
                    aVar.a(x(j0Var.h(), cVar, next));
                }
            }
        }
        Iterator<c2.c> it2 = cVar.q().iterator();
        while (it2.hasNext()) {
            y(it2.next(), aVar, j0Var);
        }
    }

    @Override // x1.j
    public void z(com.badlogic.gdx.utils.a<i> aVar, j0<i> j0Var) {
        a.b<c2.c> it = this.f97042b.iterator();
        while (it.hasNext()) {
            y(it.next(), aVar, j0Var);
        }
    }

    public h(e eVar, String str, boolean z11) {
        this(eVar, null, str, false, false, z11);
    }

    public h(e eVar, Matrix4 matrix4, String str, boolean z11) {
        this(eVar, matrix4, str, false, false, z11);
    }

    public h(e eVar, String str, boolean z11, boolean z12) {
        this(eVar, null, str, true, z11, z12);
    }

    public h(e eVar, Matrix4 matrix4, String str, boolean z11, boolean z12) {
        this(eVar, matrix4, str, true, z11, z12);
    }

    public h(e eVar, String str, boolean z11, boolean z12, boolean z13) {
        this(eVar, null, str, z11, z12, z13);
    }

    public h(e eVar, Matrix4 matrix4, String str, boolean z11, boolean z12, boolean z13) {
        this(eVar, matrix4, str, z11, z12, z13, f97040g);
    }

    public h(e eVar, Matrix4 matrix4, String str, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f97041a = new com.badlogic.gdx.utils.a<>();
        com.badlogic.gdx.utils.a<c2.c> aVar = new com.badlogic.gdx.utils.a<>();
        this.f97042b = aVar;
        this.f97043c = new com.badlogic.gdx.utils.a<>();
        this.f97044d = eVar;
        this.f97045e = matrix4 == null ? new Matrix4() : matrix4;
        c2.c C0 = eVar.C0(str, z11);
        c2.c j11 = C0.j();
        aVar.a(j11);
        if (z13) {
            this.f97045e.mul(z12 ? C0.f7501h : C0.f7500g);
            j11.f7497d.set(0.0f, 0.0f, 0.0f);
            j11.f7498e.idt();
            j11.f7499f.set(1.0f, 1.0f, 1.0f);
        } else if (z12 && j11.u()) {
            this.f97045e.mul(C0.s().f7501h);
        }
        A();
        i(eVar.f97012c, z14);
        d();
    }

    public h(e eVar, String... strArr) {
        this(eVar, (Matrix4) null, strArr);
    }

    public h(e eVar, Matrix4 matrix4, String... strArr) {
        this.f97041a = new com.badlogic.gdx.utils.a<>();
        this.f97042b = new com.badlogic.gdx.utils.a<>();
        this.f97043c = new com.badlogic.gdx.utils.a<>();
        this.f97044d = eVar;
        this.f97045e = matrix4 == null ? new Matrix4() : matrix4;
        if (strArr == null) {
            j(eVar.f97011b);
        } else {
            l(eVar.f97011b, strArr);
        }
        i(eVar.f97012c, f97040g);
        d();
    }

    public h(e eVar, com.badlogic.gdx.utils.a<String> aVar) {
        this(eVar, (Matrix4) null, aVar);
    }

    public h(e eVar, Matrix4 matrix4, com.badlogic.gdx.utils.a<String> aVar) {
        this(eVar, matrix4, aVar, f97040g);
    }

    public h(e eVar, Matrix4 matrix4, com.badlogic.gdx.utils.a<String> aVar, boolean z11) {
        this.f97041a = new com.badlogic.gdx.utils.a<>();
        this.f97042b = new com.badlogic.gdx.utils.a<>();
        this.f97043c = new com.badlogic.gdx.utils.a<>();
        this.f97044d = eVar;
        this.f97045e = matrix4 == null ? new Matrix4() : matrix4;
        k(eVar.f97011b, aVar);
        i(eVar.f97012c, z11);
        d();
    }

    public h(e eVar, Vector3 vector3) {
        this(eVar);
        this.f97045e.setToTranslation(vector3);
    }

    public h(e eVar, float f11, float f12, float f13) {
        this(eVar);
        this.f97045e.setToTranslation(f11, f12, f13);
    }

    public h(e eVar, Matrix4 matrix4) {
        this(eVar, matrix4, (String[]) null);
    }

    public h(h hVar) {
        this(hVar, hVar.f97045e.cpy());
    }

    public h(h hVar, Matrix4 matrix4) {
        this(hVar, matrix4, f97040g);
    }

    public h(h hVar, Matrix4 matrix4, boolean z11) {
        this.f97041a = new com.badlogic.gdx.utils.a<>();
        this.f97042b = new com.badlogic.gdx.utils.a<>();
        this.f97043c = new com.badlogic.gdx.utils.a<>();
        this.f97044d = hVar.f97044d;
        this.f97045e = matrix4 == null ? new Matrix4() : matrix4;
        j(hVar.f97042b);
        i(hVar.f97043c, z11);
        d();
    }
}
