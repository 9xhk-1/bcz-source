package y2;

import x2.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class j<T extends x2.b> extends x2.a {

    /* renamed from: d, reason: collision with root package name */
    public final Class<? extends T> f99172d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f99173e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f99174f;

    /* renamed from: g, reason: collision with root package name */
    public final x2.c f99175g = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements x2.c {
        public a() {
        }

        @Override // x2.c
        public boolean a(x2.b bVar) {
            j jVar = j.this;
            if (!jVar.f99174f || !g3.c.A(jVar.f99172d, bVar)) {
                return false;
            }
            j jVar2 = j.this;
            jVar2.f99173e = jVar2.i(bVar);
            return j.this.f99173e;
        }
    }

    public j(Class<? extends T> cls) {
        this.f99172d = cls;
    }

    @Override // x2.a
    public boolean a(float f11) {
        this.f99174f = true;
        return this.f99173e;
    }

    @Override // x2.a
    public void e() {
        this.f99173e = false;
        this.f99174f = false;
    }

    @Override // x2.a
    public void h(com.badlogic.gdx.scenes.scene2d.a aVar) {
        com.badlogic.gdx.scenes.scene2d.a aVar2 = this.f97056b;
        if (aVar2 != null) {
            aVar2.m2(this.f99175g);
        }
        super.h(aVar);
        if (aVar != null) {
            aVar.d1(this.f99175g);
        }
    }

    public abstract boolean i(T t11);

    public boolean j() {
        return this.f99174f;
    }

    public void k(boolean z11) {
        this.f99174f = z11;
    }
}
