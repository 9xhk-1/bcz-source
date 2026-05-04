package h2;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.e;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.a;
import e2.a;
import e2.i;
import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class h extends h2.d {

    /* renamed from: o, reason: collision with root package name */
    public static final String f58021o = "atlasAssetData";

    /* renamed from: l, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<b> f58022l;

    /* renamed from: m, reason: collision with root package name */
    public a.d f58023m;

    /* renamed from: n, reason: collision with root package name */
    public String f58024n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends h {

        /* renamed from: p, reason: collision with root package name */
        public a.d f58025p;

        public a() {
        }

        @Override // e2.d
        public void C0() {
            int i11 = this.f48397a.f48380e.f48329c * this.f58023m.f48332c;
            int i12 = 0;
            int i13 = 2;
            while (i12 < i11) {
                b bVar = this.f58022l.get((int) (this.f58025p.f48337e[i13] * (r3.f13179b - 1)));
                a.d dVar = this.f58023m;
                float[] fArr = dVar.f48337e;
                fArr[i12] = bVar.f58026a;
                fArr[i12 + 1] = bVar.f58027b;
                fArr[i12 + 2] = bVar.f58028c;
                fArr[i12 + 3] = bVar.f58029d;
                fArr[i12 + 4] = 0.5f;
                fArr[i12 + 5] = bVar.f58030e;
                i12 += dVar.f48332c;
                i13 += this.f58025p.f48332c;
            }
        }

        @Override // h2.h, e2.d
        public void X() {
            super.X();
            this.f58025p = (a.d) this.f48397a.f48380e.a(e2.b.f48345c);
        }

        @Override // e2.d
        /* renamed from: a1, reason: merged with bridge method [inline-methods] */
        public a Z() {
            return new a(this);
        }

        public a(a aVar) {
            super(aVar);
        }

        public a(o oVar) {
            super(oVar);
        }

        public a(Texture texture) {
            super(texture);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public float f58026a;

        /* renamed from: b, reason: collision with root package name */
        public float f58027b;

        /* renamed from: c, reason: collision with root package name */
        public float f58028c;

        /* renamed from: d, reason: collision with root package name */
        public float f58029d;

        /* renamed from: e, reason: collision with root package name */
        public float f58030e;

        /* renamed from: f, reason: collision with root package name */
        public String f58031f;

        public b() {
        }

        public void a(b bVar) {
            this.f58026a = bVar.f58026a;
            this.f58027b = bVar.f58027b;
            this.f58028c = bVar.f58028c;
            this.f58029d = bVar.f58029d;
            this.f58030e = bVar.f58030e;
            this.f58031f = bVar.f58031f;
        }

        public void b(o oVar) {
            this.f58026a = oVar.g();
            this.f58027b = oVar.i();
            this.f58028c = oVar.h();
            this.f58029d = oVar.j();
            this.f58030e = (oVar.b() / oVar.c()) * 0.5f;
            if (oVar instanceof e.a) {
                this.f58031f = ((e.a) oVar).f12072i;
            }
        }

        public void c(com.badlogic.gdx.graphics.g2d.e eVar) {
            String str = this.f58031f;
            if (str == null) {
                return;
            }
            e.a Z = eVar.Z(str);
            this.f58026a = Z.g();
            this.f58027b = Z.i();
            this.f58028c = Z.h();
            this.f58029d = Z.j();
            this.f58030e = (Z.b() / Z.c()) * 0.5f;
        }

        public b(b bVar) {
            a(bVar);
        }

        public b(o oVar) {
            b(oVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends h {
        public c() {
        }

        @Override // e2.d
        public void R(int i11, int i12) {
            int i13 = this.f58023m.f48332c;
            int i14 = i11 * i13;
            int i15 = (i12 * i13) + i14;
            while (i14 < i15) {
                b y11 = this.f58022l.y();
                a.d dVar = this.f58023m;
                float[] fArr = dVar.f48337e;
                fArr[i14] = y11.f58026a;
                fArr[i14 + 1] = y11.f58027b;
                fArr[i14 + 2] = y11.f58028c;
                fArr[i14 + 3] = y11.f58029d;
                fArr[i14 + 4] = 0.5f;
                fArr[i14 + 5] = y11.f58030e;
                i14 += dVar.f48332c;
            }
        }

        @Override // e2.d
        /* renamed from: a1, reason: merged with bridge method [inline-methods] */
        public c Z() {
            return new c(this);
        }

        public c(c cVar) {
            super(cVar);
        }

        public c(o oVar) {
            super(oVar);
        }

        public c(Texture texture) {
            super(texture);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d extends h {
        public d() {
        }

        @Override // e2.d
        /* renamed from: a1, reason: merged with bridge method [inline-methods] */
        public d Z() {
            return new d(this);
        }

        @Override // e2.d
        public void init() {
            int i11 = 0;
            b bVar = this.f58022l.f13178a[0];
            int i12 = this.f48397a.f48377b.f52561m * this.f58023m.f48332c;
            while (i11 < i12) {
                a.d dVar = this.f58023m;
                float[] fArr = dVar.f48337e;
                fArr[i11] = bVar.f58026a;
                fArr[i11 + 1] = bVar.f58027b;
                fArr[i11 + 2] = bVar.f58028c;
                fArr[i11 + 3] = bVar.f58029d;
                fArr[i11 + 4] = 0.5f;
                fArr[i11 + 5] = bVar.f58030e;
                i11 += dVar.f48332c;
            }
        }

        public d(d dVar) {
            super(dVar);
        }

        public d(o oVar) {
            super(oVar);
        }

        public d(Texture texture) {
            super(texture);
        }
    }

    public h(int i11) {
        this.f58022l = new com.badlogic.gdx.utils.a<>(false, i11, b.class);
    }

    @Override // e2.d, com.badlogic.gdx.utils.f.c
    public void D(com.badlogic.gdx.utils.f fVar, JsonValue jsonValue) {
        this.f58022l.clear();
        this.f58022l.g((com.badlogic.gdx.utils.a) fVar.N("regions", com.badlogic.gdx.utils.a.class, b.class, jsonValue));
    }

    public void J0(o... oVarArr) {
        this.f58022l.o(oVarArr.length);
        for (o oVar : oVarArr) {
            this.f58022l.a(new b(oVar));
        }
    }

    public void Q0() {
        this.f58024n = null;
        this.f58022l.clear();
    }

    public void V0(String str) {
        this.f58024n = str;
    }

    @Override // e2.d
    public void X() {
        this.f58023m = (a.d) this.f48397a.f48380e.a(e2.b.f48349g);
    }

    @Override // e2.d, e2.i.b
    public void b(r1.e eVar, e2.i iVar) {
        super.b(eVar, iVar);
        i.c g11 = iVar.g(f58021o);
        if (g11 == null) {
            return;
        }
        com.badlogic.gdx.graphics.g2d.e eVar2 = (com.badlogic.gdx.graphics.g2d.e) eVar.Q0(g11.b());
        a.b<b> it = this.f58022l.iterator();
        while (it.hasNext()) {
            it.next().c(eVar2);
        }
    }

    @Override // e2.d, e2.i.b
    public void o(r1.e eVar, e2.i iVar) {
        super.o(eVar, iVar);
        if (this.f58024n != null) {
            i.c g11 = iVar.g(f58021o);
            if (g11 == null) {
                g11 = iVar.b(f58021o);
            }
            g11.d(this.f58024n, com.badlogic.gdx.graphics.g2d.e.class);
        }
    }

    @Override // e2.d, com.badlogic.gdx.utils.f.c
    public void z(com.badlogic.gdx.utils.f fVar) {
        fVar.H0("regions", this.f58022l, com.badlogic.gdx.utils.a.class, b.class);
    }

    public h() {
        this(1);
        b bVar = new b();
        bVar.f58027b = 0.0f;
        bVar.f58026a = 0.0f;
        bVar.f58029d = 1.0f;
        bVar.f58028c = 1.0f;
        bVar.f58030e = 0.5f;
        this.f58022l.a(bVar);
    }

    public h(o... oVarArr) {
        V0(null);
        this.f58022l = new com.badlogic.gdx.utils.a<>(false, oVarArr.length, b.class);
        J0(oVarArr);
    }

    public h(Texture texture) {
        this(new o(texture));
    }

    public h(h hVar) {
        this(hVar.f58022l.f13179b);
        this.f58022l.o(hVar.f58022l.f13179b);
        int i11 = 0;
        while (true) {
            com.badlogic.gdx.utils.a<b> aVar = hVar.f58022l;
            if (i11 >= aVar.f13179b) {
                return;
            }
            this.f58022l.a(new b(aVar.get(i11)));
            i11++;
        }
    }
}
