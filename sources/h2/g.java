package h2;

import a3.j0;
import a3.v;
import com.badlogic.gdx.utils.a;
import e2.a;
import e2.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class g extends d {

    /* renamed from: l, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<e2.c> f58017l;

    /* renamed from: m, reason: collision with root package name */
    public a.f<e2.c> f58018m;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends g {
        public b(e2.c... cVarArr) {
            super(cVarArr);
        }

        @Override // e2.d
        /* renamed from: J0, reason: merged with bridge method [inline-methods] */
        public b Z() {
            return new b(this);
        }

        @Override // e2.d
        public void R(int i11, int i12) {
            int i13 = i12 + i11;
            while (i11 < i13) {
                this.f58018m.f48342f[i11].F();
                i11++;
            }
        }

        @Override // e2.d
        public void i0(int i11, int i12) {
            int i13 = i12 + i11;
            while (i11 < i13) {
                this.f58018m.f48342f[i11].end();
                i11++;
            }
        }

        @Override // e2.d
        public void init() {
            e2.c first = this.f58017l.first();
            int i11 = this.f48397a.f48380e.f48328b;
            for (int i12 = 0; i12 < i11; i12++) {
                e2.c g11 = first.g();
                g11.n();
                this.f58018m.f48342f[i12] = g11;
            }
        }

        public b() {
        }

        public b(b bVar) {
            super(bVar);
        }
    }

    public g() {
        this.f58017l = new com.badlogic.gdx.utils.a<>(true, 1, e2.c.class);
    }

    @Override // e2.d
    public void X() {
        this.f58018m = (a.f) this.f48397a.f48380e.a(e2.b.f48354l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e2.d, e2.i.b
    public void b(r1.e eVar, e2.i iVar) {
        i.c f11 = iVar.f();
        a.b it = ((com.badlogic.gdx.utils.a) f11.a("indices")).iterator();
        while (true) {
            r1.a b11 = f11.b();
            if (b11 == null) {
                return;
            }
            e2.e eVar2 = (e2.e) eVar.Q0(b11);
            if (eVar2 == null) {
                throw new RuntimeException("Template is null");
            }
            com.badlogic.gdx.utils.a<e2.c> Z = eVar2.Z();
            v vVar = (v) it.next();
            int i11 = vVar.f1640b;
            for (int i12 = 0; i12 < i11; i12++) {
                this.f58017l.a(Z.get(vVar.m(i12)));
            }
        }
    }

    @Override // e2.d, a3.q
    public void dispose() {
        if (this.f48397a != null) {
            for (int i11 = 0; i11 < this.f48397a.f48380e.f48329c; i11++) {
                e2.c cVar = this.f58018m.f48342f[i11];
                if (cVar != null) {
                    cVar.h();
                    this.f58018m.f48342f[i11] = null;
                }
            }
        }
    }

    @Override // e2.d
    public void end() {
        for (int i11 = 0; i11 < this.f48397a.f48380e.f48329c; i11++) {
            this.f58018m.f48342f[i11].end();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e2.d, e2.i.b
    public void o(r1.e eVar, e2.i iVar) {
        i.c a11 = iVar.a();
        com.badlogic.gdx.utils.a V0 = eVar.V0(e2.e.class, new com.badlogic.gdx.utils.a());
        com.badlogic.gdx.utils.a aVar = new com.badlogic.gdx.utils.a(this.f58017l);
        com.badlogic.gdx.utils.a aVar2 = new com.badlogic.gdx.utils.a();
        for (int i11 = 0; i11 < V0.f13179b && aVar.f13179b > 0; i11++) {
            e2.e eVar2 = (e2.e) V0.get(i11);
            com.badlogic.gdx.utils.a<e2.c> Z = eVar2.Z();
            a.b it = aVar.iterator();
            v vVar = null;
            while (it.hasNext()) {
                int q11 = Z.q((e2.c) it.next(), true);
                if (q11 > -1) {
                    if (vVar == null) {
                        vVar = new v();
                    }
                    it.remove();
                    vVar.a(q11);
                }
            }
            if (vVar != null) {
                a11.d(eVar.a1(eVar2), e2.e.class);
                aVar2.a(vVar);
            }
        }
        a11.c("indices", aVar2);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends g {

        /* renamed from: n, reason: collision with root package name */
        public C0650a f58019n;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: h2.g$a$a, reason: collision with other inner class name */
        public class C0650a extends j0<e2.c> {
            public C0650a() {
            }

            @Override // a3.j0
            public void a() {
                int f11 = a.this.f58019n.f();
                for (int i11 = 0; i11 < f11; i11++) {
                    a.this.f58019n.h().h();
                }
                super.a();
            }

            @Override // a3.j0
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public e2.c g() {
                e2.c g11 = a.this.f58017l.y().g();
                g11.n();
                return g11;
            }
        }

        public a() {
            this.f58019n = new C0650a();
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
                e2.c h11 = this.f58019n.h();
                h11.F();
                this.f58018m.f48342f[i11] = h11;
                i11++;
            }
        }

        @Override // h2.g, e2.d, a3.q
        public void dispose() {
            this.f58019n.a();
            super.dispose();
        }

        @Override // e2.d
        public void i0(int i11, int i12) {
            int i13 = i12 + i11;
            while (i11 < i13) {
                e2.c cVar = this.f58018m.f48342f[i11];
                cVar.end();
                this.f58019n.d(cVar);
                this.f58018m.f48342f[i11] = null;
                i11++;
            }
        }

        @Override // e2.d
        public void init() {
            this.f58019n.a();
            for (int i11 = 0; i11 < this.f48397a.f48377b.f52561m; i11++) {
                C0650a c0650a = this.f58019n;
                c0650a.d(c0650a.g());
            }
        }

        public a(e2.c... cVarArr) {
            super(cVarArr);
            this.f58019n = new C0650a();
        }

        public a(a aVar) {
            super(aVar);
            this.f58019n = new C0650a();
        }
    }

    public g(e2.c... cVarArr) {
        this.f58017l = new com.badlogic.gdx.utils.a<>(cVarArr);
    }

    public g(g gVar) {
        this(gVar.f58017l.f13178a);
    }
}
