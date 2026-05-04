package e2;

import a3.j0;
import com.badlogic.gdx.utils.a;
import x1.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class h implements j {

    /* renamed from: c, reason: collision with root package name */
    public static h f48415c;

    /* renamed from: a, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<f2.d<?>> f48416a = new com.badlogic.gdx.utils.a<>();

    /* renamed from: b, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<e> f48417b = new com.badlogic.gdx.utils.a<>();

    @Deprecated
    public static h f() {
        if (f48415c == null) {
            f48415c = new h();
        }
        return f48415c;
    }

    public void a(e eVar) {
        this.f48417b.a(eVar);
    }

    public void c() {
        a.b<f2.d<?>> it = this.f48416a.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    public void d(f2.d<?> dVar) {
        this.f48416a.a(dVar);
    }

    public void e() {
        a.b<e> it = this.f48417b.iterator();
        while (it.hasNext()) {
            it.next().D();
        }
    }

    public void end() {
        a.b<f2.d<?>> it = this.f48416a.iterator();
        while (it.hasNext()) {
            it.next().end();
        }
    }

    public com.badlogic.gdx.utils.a<f2.d<?>> g() {
        return this.f48416a;
    }

    public void h(e eVar) {
        this.f48417b.C(eVar, true);
    }

    public void i() {
        this.f48417b.clear();
    }

    public void j() {
        a.b<e> it = this.f48417b.iterator();
        while (it.hasNext()) {
            it.next().d1();
        }
    }

    public void k(float f11) {
        a.b<e> it = this.f48417b.iterator();
        while (it.hasNext()) {
            it.next().e1(f11);
        }
    }

    public void l() {
        a.b<e> it = this.f48417b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            next.d1();
            next.D();
        }
    }

    public void m(float f11) {
        a.b<e> it = this.f48417b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            next.e1(f11);
            next.D();
        }
    }

    @Override // x1.j
    public void z(com.badlogic.gdx.utils.a<x1.i> aVar, j0<x1.i> j0Var) {
        a.b<f2.d<?>> it = this.f48416a.iterator();
        while (it.hasNext()) {
            it.next().z(aVar, j0Var);
        }
    }
}
