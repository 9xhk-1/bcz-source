package l2;

import a3.j0;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.a;
import com.badlogic.gdx.utils.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    public static final com.badlogic.gdx.utils.l<c2.c, C0834b> f69149d = new com.badlogic.gdx.utils.l<>();

    /* renamed from: e, reason: collision with root package name */
    public static final C0834b f69150e = new C0834b();

    /* renamed from: a, reason: collision with root package name */
    public final j0<C0834b> f69151a = new a();

    /* renamed from: b, reason: collision with root package name */
    public boolean f69152b = false;

    /* renamed from: c, reason: collision with root package name */
    public final x1.h f69153c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends j0<C0834b> {
        public a() {
        }

        @Override // a3.j0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C0834b g() {
            return new C0834b();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: l2.b$b, reason: collision with other inner class name */
    public static final class C0834b implements j0.a {

        /* renamed from: a, reason: collision with root package name */
        public final Vector3 f69155a = new Vector3();

        /* renamed from: b, reason: collision with root package name */
        public final Quaternion f69156b = new Quaternion();

        /* renamed from: c, reason: collision with root package name */
        public final Vector3 f69157c = new Vector3(1.0f, 1.0f, 1.0f);

        public C0834b a() {
            this.f69155a.set(0.0f, 0.0f, 0.0f);
            this.f69156b.idt();
            this.f69157c.set(1.0f, 1.0f, 1.0f);
            return this;
        }

        public C0834b b(Vector3 vector3, Quaternion quaternion, Vector3 vector32, float f11) {
            this.f69155a.lerp(vector3, f11);
            this.f69156b.slerp(quaternion, f11);
            this.f69157c.lerp(vector32, f11);
            return this;
        }

        public C0834b c(C0834b c0834b, float f11) {
            return b(c0834b.f69155a, c0834b.f69156b, c0834b.f69157c, f11);
        }

        public C0834b d(Vector3 vector3, Quaternion quaternion, Vector3 vector32) {
            this.f69155a.set(vector3);
            this.f69156b.set(quaternion);
            this.f69157c.set(vector32);
            return this;
        }

        public C0834b e(C0834b c0834b) {
            return d(c0834b.f69155a, c0834b.f69156b, c0834b.f69157c);
        }

        public Matrix4 f(Matrix4 matrix4) {
            return matrix4.set(this.f69155a, this.f69156b, this.f69157c);
        }

        @Override // a3.j0.a
        public void reset() {
            a();
        }

        public String toString() {
            return this.f69155a.toString() + " - " + this.f69156b.toString() + " - " + this.f69157c.toString();
        }
    }

    public b(x1.h hVar) {
        this.f69153c = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(com.badlogic.gdx.utils.l<c2.c, C0834b> lVar, j0<C0834b> j0Var, float f11, c2.a aVar, float f12) {
        if (lVar == null) {
            a.b<c2.d> it = aVar.f7484c.iterator();
            while (it.hasNext()) {
                f(it.next(), f12);
            }
            return;
        }
        l.c<c2.c> it2 = lVar.n().iterator();
        while (it2.hasNext()) {
            it2.next().f7496c = false;
        }
        a.b<c2.d> it3 = aVar.f7484c.iterator();
        while (it3.hasNext()) {
            e(it3.next(), lVar, j0Var, f11, f12);
        }
        l.a<c2.c, C0834b> it4 = lVar.g().iterator();
        while (it4.hasNext()) {
            l.b next = it4.next();
            K k11 = next.f13394a;
            if (!((c2.c) k11).f7496c) {
                ((c2.c) k11).f7496c = true;
                ((C0834b) next.f13395b).b(((c2.c) k11).f7497d, ((c2.c) k11).f7498e, ((c2.c) k11).f7499f, f11);
            }
        }
    }

    public static final void e(c2.d dVar, com.badlogic.gdx.utils.l<c2.c, C0834b> lVar, j0<C0834b> j0Var, float f11, float f12) {
        c2.c cVar = dVar.f7505a;
        cVar.f7496c = true;
        C0834b j11 = j(dVar, f12);
        C0834b l11 = lVar.l(cVar, null);
        if (l11 != null) {
            if (f11 > 0.999999f) {
                l11.e(j11);
                return;
            } else {
                l11.c(j11, f11);
                return;
            }
        }
        if (f11 > 0.999999f) {
            lVar.r(cVar, j0Var.h().e(j11));
        } else {
            lVar.r(cVar, j0Var.h().d(cVar.f7497d, cVar.f7498e, cVar.f7499f).c(j11, f11));
        }
    }

    public static final void f(c2.d dVar, float f11) {
        c2.c cVar = dVar.f7505a;
        cVar.f7496c = true;
        j(dVar, f11).f(cVar.f7500g);
    }

    public static final <T> int i(com.badlogic.gdx.utils.a<c2.e<T>> aVar, float f11) {
        int i11 = aVar.f13179b - 1;
        int i12 = 0;
        if (i11 > 0 && f11 >= aVar.get(0).f7509a && f11 <= aVar.get(i11).f7509a) {
            while (i12 < i11) {
                int i13 = (i12 + i11) / 2;
                int i14 = i13 + 1;
                if (f11 > aVar.get(i14).f7509a) {
                    i12 = i14;
                } else {
                    if (f11 >= aVar.get(i13).f7509a) {
                        return i13;
                    }
                    i11 = i13 - 1;
                }
            }
        }
        return i12;
    }

    public static final C0834b j(c2.d dVar, float f11) {
        C0834b c0834b = f69150e;
        m(dVar, f11, c0834b.f69155a);
        k(dVar, f11, c0834b.f69156b);
        l(dVar, f11, c0834b.f69157c);
        return c0834b;
    }

    public static final Quaternion k(c2.d dVar, float f11, Quaternion quaternion) {
        com.badlogic.gdx.utils.a<c2.e<Quaternion>> aVar = dVar.f7507c;
        if (aVar == null) {
            return quaternion.set(dVar.f7505a.f7498e);
        }
        if (aVar.f13179b == 1) {
            return quaternion.set(aVar.get(0).f7510b);
        }
        int i11 = i(aVar, f11);
        c2.e<Quaternion> eVar = dVar.f7507c.get(i11);
        quaternion.set(eVar.f7510b);
        int i12 = i11 + 1;
        com.badlogic.gdx.utils.a<c2.e<Quaternion>> aVar2 = dVar.f7507c;
        if (i12 < aVar2.f13179b) {
            c2.e<Quaternion> eVar2 = aVar2.get(i12);
            float f12 = eVar.f7509a;
            quaternion.slerp(eVar2.f7510b, (f11 - f12) / (eVar2.f7509a - f12));
        }
        return quaternion;
    }

    public static final Vector3 l(c2.d dVar, float f11, Vector3 vector3) {
        com.badlogic.gdx.utils.a<c2.e<Vector3>> aVar = dVar.f7508d;
        if (aVar == null) {
            return vector3.set(dVar.f7505a.f7499f);
        }
        if (aVar.f13179b == 1) {
            return vector3.set(aVar.get(0).f7510b);
        }
        int i11 = i(aVar, f11);
        c2.e<Vector3> eVar = dVar.f7508d.get(i11);
        vector3.set(eVar.f7510b);
        int i12 = i11 + 1;
        com.badlogic.gdx.utils.a<c2.e<Vector3>> aVar2 = dVar.f7508d;
        if (i12 < aVar2.f13179b) {
            c2.e<Vector3> eVar2 = aVar2.get(i12);
            float f12 = eVar.f7509a;
            vector3.lerp(eVar2.f7510b, (f11 - f12) / (eVar2.f7509a - f12));
        }
        return vector3;
    }

    public static final Vector3 m(c2.d dVar, float f11, Vector3 vector3) {
        com.badlogic.gdx.utils.a<c2.e<Vector3>> aVar = dVar.f7506b;
        if (aVar == null) {
            return vector3.set(dVar.f7505a.f7497d);
        }
        if (aVar.f13179b == 1) {
            return vector3.set(aVar.get(0).f7510b);
        }
        int i11 = i(aVar, f11);
        c2.e<Vector3> eVar = dVar.f7506b.get(i11);
        vector3.set(eVar.f7510b);
        int i12 = i11 + 1;
        com.badlogic.gdx.utils.a<c2.e<Vector3>> aVar2 = dVar.f7506b;
        if (i12 < aVar2.f13179b) {
            c2.e<Vector3> eVar2 = aVar2.get(i12);
            float f12 = eVar.f7509a;
            vector3.lerp(eVar2.f7510b, (f11 - f12) / (eVar2.f7509a - f12));
        }
        return vector3;
    }

    public void a(c2.a aVar, float f11, float f12) {
        if (!this.f69152b) {
            throw new GdxRuntimeException("You must call begin() before adding an animation");
        }
        c(f69149d, this.f69151a, f12, aVar, f11);
    }

    public void b(c2.a aVar, float f11) {
        if (this.f69152b) {
            throw new GdxRuntimeException("Call end() first");
        }
        c(null, null, 1.0f, aVar, f11);
        this.f69153c.d();
    }

    public void d(c2.a aVar, float f11, c2.a aVar2, float f12, float f13) {
        if (aVar2 == null || f13 == 0.0f) {
            b(aVar, f11);
            return;
        }
        if (aVar == null || f13 == 1.0f) {
            b(aVar2, f12);
        } else {
            if (this.f69152b) {
                throw new GdxRuntimeException("Call end() first");
            }
            g();
            a(aVar, f11, 1.0f);
            a(aVar2, f12, f13);
            h();
        }
    }

    public void g() {
        if (this.f69152b) {
            throw new GdxRuntimeException("You must call end() after each call to being()");
        }
        this.f69152b = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void h() {
        if (!this.f69152b) {
            throw new GdxRuntimeException("You must call begin() first");
        }
        l.a<c2.c, C0834b> it = f69149d.g().iterator();
        while (it.hasNext()) {
            l.b next = it.next();
            ((C0834b) next.f13395b).f(((c2.c) next.f13394a).f7500g);
            this.f69151a.d(next.f13395b);
        }
        f69149d.clear();
        this.f69153c.d();
        this.f69152b = false;
    }

    public void n(c2.a aVar) {
        a.b<c2.d> it = aVar.f7484c.iterator();
        while (it.hasNext()) {
            it.next().f7505a.f7496c = false;
        }
    }
}
