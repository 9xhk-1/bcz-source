package h2;

import a3.j0;
import com.badlogic.gdx.utils.a;
import e2.a;
import e2.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class e extends d {

    /* renamed from: l, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<x1.e> f58007l;

    /* renamed from: m, reason: collision with root package name */
    public a.f<x1.h> f58008m;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends e {
        public b() {
        }

        @Override // e2.d
        /* renamed from: J0, reason: merged with bridge method [inline-methods] */
        public b Z() {
            return new b(this);
        }

        @Override // e2.d
        public void init() {
            x1.e first = this.f58007l.first();
            int i11 = this.f48397a.f48377b.f52561m;
            for (int i12 = 0; i12 < i11; i12++) {
                this.f58008m.f48342f[i12] = new x1.h(first);
            }
        }

        public b(b bVar) {
            super(bVar);
        }

        public b(x1.e... eVarArr) {
            super(eVarArr);
        }
    }

    public e() {
        this.f58007l = new com.badlogic.gdx.utils.a<>(true, 1, x1.e.class);
    }

    @Override // e2.d
    public void X() {
        this.f58008m = (a.f) this.f48397a.f48380e.a(e2.b.f48353k);
    }

    @Override // e2.d, e2.i.b
    public void b(r1.e eVar, e2.i iVar) {
        i.c f11 = iVar.f();
        while (true) {
            r1.a b11 = f11.b();
            if (b11 == null) {
                return;
            }
            x1.e eVar2 = (x1.e) eVar.Q0(b11);
            if (eVar2 == null) {
                throw new RuntimeException("Model is null");
            }
            this.f58007l.a(eVar2);
        }
    }

    @Override // e2.d, e2.i.b
    public void o(r1.e eVar, e2.i iVar) {
        i.c a11 = iVar.a();
        a.b<x1.e> it = this.f58007l.iterator();
        while (it.hasNext()) {
            a11.d(eVar.a1(it.next()), x1.e.class);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends e {

        /* renamed from: n, reason: collision with root package name */
        public C0649a f58009n;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: h2.e$a$a, reason: collision with other inner class name */
        public class C0649a extends j0<x1.h> {
            public C0649a() {
            }

            @Override // a3.j0
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public x1.h g() {
                return new x1.h(a.this.f58007l.y());
            }
        }

        public a() {
            this.f58009n = new C0649a();
        }

        @Override // e2.d
        /* renamed from: J0, reason: merged with bridge method [inline-methods] */
        public a Z() {
            return new a(this);
        }

        @Override // e2.d
        public void R(int i11, int i12) {
            int i13 = i12 + i11;
            while (i11 < i13) {
                this.f58008m.f48342f[i11] = this.f58009n.h();
                i11++;
            }
        }

        @Override // e2.d
        public void i0(int i11, int i12) {
            int i13 = i12 + i11;
            while (i11 < i13) {
                this.f58009n.d(this.f58008m.f48342f[i11]);
                this.f58008m.f48342f[i11] = null;
                i11++;
            }
        }

        @Override // e2.d
        public void init() {
            this.f58009n.a();
        }

        public a(a aVar) {
            super(aVar);
            this.f58009n = new C0649a();
        }

        public a(x1.e... eVarArr) {
            super(eVarArr);
            this.f58009n = new C0649a();
        }
    }

    public e(x1.e... eVarArr) {
        this.f58007l = new com.badlogic.gdx.utils.a<>(eVarArr);
    }

    public e(e eVar) {
        this((x1.e[]) eVar.f58007l.Q(x1.e.class));
    }
}
