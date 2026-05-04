package x1;

import a3.j0;
import a3.q;
import a3.s;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.a;
import java.util.Comparator;
import java.util.Iterator;
import l2.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class g implements q, j {

    /* renamed from: a, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<i> f97024a;

    /* renamed from: b, reason: collision with root package name */
    public s<i> f97025b;

    /* renamed from: c, reason: collision with root package name */
    public s<c2.b> f97026c;

    /* renamed from: d, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<i> f97027d;

    /* renamed from: e, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<i> f97028e;

    /* renamed from: f, reason: collision with root package name */
    public l2.j f97029f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f97030g;

    /* renamed from: h, reason: collision with root package name */
    public n f97031h;

    /* renamed from: i, reason: collision with root package name */
    public c f97032i;

    /* renamed from: j, reason: collision with root package name */
    public com.badlogic.gdx.graphics.a f97033j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends s<i> {
        public a() {
        }

        @Override // a3.j0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public i g() {
            return new i();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends s<c2.b> {
        public b() {
        }

        @Override // a3.j0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public c2.b g() {
            return new c2.b();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c extends q {
        Mesh G0(com.badlogic.gdx.graphics.s sVar, int i11, int i12);

        void flush();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements c {

        /* renamed from: a, reason: collision with root package name */
        public com.badlogic.gdx.utils.a<Mesh> f97036a = new com.badlogic.gdx.utils.a<>();

        /* renamed from: b, reason: collision with root package name */
        public com.badlogic.gdx.utils.a<Mesh> f97037b = new com.badlogic.gdx.utils.a<>();

        @Override // x1.g.c
        public Mesh G0(com.badlogic.gdx.graphics.s sVar, int i11, int i12) {
            int i13 = this.f97036a.f13179b;
            for (int i14 = 0; i14 < i13; i14++) {
                Mesh mesh = this.f97036a.get(i14);
                if (mesh.r1().equals(sVar) && mesh.p1() >= i11 && mesh.o1() >= i12) {
                    this.f97036a.A(i14);
                    this.f97037b.a(mesh);
                    return mesh;
                }
            }
            Mesh mesh2 = new Mesh(false, 65536, Math.max(65536, 1 << (32 - Integer.numberOfLeadingZeros(i12 - 1))), sVar);
            this.f97037b.a(mesh2);
            return mesh2;
        }

        @Override // a3.q
        public void dispose() {
            a.b<Mesh> it = this.f97037b.iterator();
            while (it.hasNext()) {
                it.next().dispose();
            }
            this.f97037b.clear();
            a.b<Mesh> it2 = this.f97036a.iterator();
            while (it2.hasNext()) {
                it2.next().dispose();
            }
            this.f97036a.clear();
        }

        @Override // x1.g.c
        public void flush() {
            this.f97036a.g(this.f97037b);
            this.f97037b.clear();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e implements n, Comparator<i> {
        @Override // l2.n
        public void a(com.badlogic.gdx.graphics.a aVar, com.badlogic.gdx.utils.a<i> aVar2) {
            aVar2.sort(this);
        }

        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            int compareTo = iVar.f97048b.f7490e.r1().compareTo(iVar2.f97048b.f7490e.r1());
            return (compareTo == 0 && (compareTo = iVar.f97049c.compareTo(iVar2.f97049c)) == 0) ? iVar.f97048b.f7487b - iVar2.f97048b.f7487b : compareTo;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f implements c {

        /* renamed from: a, reason: collision with root package name */
        public com.badlogic.gdx.utils.a<Mesh> f97038a = new com.badlogic.gdx.utils.a<>();

        /* renamed from: b, reason: collision with root package name */
        public com.badlogic.gdx.utils.a<Mesh> f97039b = new com.badlogic.gdx.utils.a<>();

        @Override // x1.g.c
        public Mesh G0(com.badlogic.gdx.graphics.s sVar, int i11, int i12) {
            int i13 = this.f97038a.f13179b;
            for (int i14 = 0; i14 < i13; i14++) {
                Mesh mesh = this.f97038a.get(i14);
                if (mesh.r1().equals(sVar) && mesh.p1() == i11 && mesh.o1() == i12) {
                    this.f97038a.A(i14);
                    this.f97039b.a(mesh);
                    return mesh;
                }
            }
            Mesh mesh2 = new Mesh(true, i11, i12, sVar);
            this.f97039b.a(mesh2);
            return mesh2;
        }

        @Override // a3.q
        public void dispose() {
            a.b<Mesh> it = this.f97039b.iterator();
            while (it.hasNext()) {
                it.next().dispose();
            }
            this.f97039b.clear();
            a.b<Mesh> it2 = this.f97038a.iterator();
            while (it2.hasNext()) {
                it2.next().dispose();
            }
            this.f97038a.clear();
        }

        @Override // x1.g.c
        public void flush() {
            this.f97038a.g(this.f97039b);
            this.f97039b.clear();
        }
    }

    public g() {
        this(new e(), new d());
    }

    public <T extends j> void D(Iterable<T> iterable) {
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            X(it.next());
        }
    }

    public void R(i iVar) {
        if (!this.f97030g) {
            throw new GdxRuntimeException("Can only add items to the ModelCache in between .begin() and .end()");
        }
        if (iVar.f97051e == null) {
            this.f97027d.a(iVar);
        } else {
            this.f97024a.a(iVar);
        }
    }

    public void X(j jVar) {
        jVar.z(this.f97028e, this.f97025b);
        int i11 = this.f97028e.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            R(this.f97028e.get(i12));
        }
        this.f97028e.clear();
    }

    public void Z(com.badlogic.gdx.graphics.a aVar) {
        if (this.f97030g) {
            throw new GdxRuntimeException("Call end() after calling begin()");
        }
        this.f97030g = true;
        this.f97033j = aVar;
        this.f97025b.j();
        this.f97024a.clear();
        this.f97027d.clear();
        this.f97026c.j();
        this.f97032i.flush();
    }

    public void c() {
        Z(null);
    }

    @Override // a3.q
    public void dispose() {
        if (this.f97030g) {
            throw new GdxRuntimeException("Cannot dispose a ModelCache in between .begin() and .end()");
        }
        this.f97032i.dispose();
    }

    public void end() {
        if (!this.f97030g) {
            throw new GdxRuntimeException("Call begin() prior to calling end()");
        }
        this.f97030g = false;
        com.badlogic.gdx.utils.a<i> aVar = this.f97027d;
        if (aVar.f13179b == 0) {
            return;
        }
        this.f97031h.a(this.f97033j, aVar);
        com.badlogic.gdx.utils.a<i> aVar2 = this.f97027d;
        int i11 = aVar2.f13179b;
        int i12 = this.f97024a.f13179b;
        i iVar = aVar2.get(0);
        com.badlogic.gdx.graphics.s r12 = iVar.f97048b.f7490e.r1();
        x1.d dVar = iVar.f97049c;
        int i13 = iVar.f97048b.f7487b;
        int i14 = this.f97024a.f13179b;
        this.f97029f.d(r12);
        c2.b a12 = this.f97029f.a1("", i13, this.f97026c.h());
        this.f97024a.a(i0(dVar, i13));
        int i15 = this.f97027d.f13179b;
        for (int i16 = 0; i16 < i15; i16++) {
            i iVar2 = this.f97027d.get(i16);
            com.badlogic.gdx.graphics.s r13 = iVar2.f97048b.f7490e.r1();
            x1.d dVar2 = iVar2.f97049c;
            int i17 = iVar2.f97048b.f7487b;
            boolean z11 = r13.equals(r12) && (this.f97029f.W0() + (iVar2.f97048b.f7490e.D0() > 0 ? iVar2.f97048b.f7490e.m() : iVar2.f97048b.f7489d) <= 65536);
            if (!z11 || i17 != i13 || !dVar2.t(dVar, true)) {
                if (!z11) {
                    l2.j jVar = this.f97029f;
                    Mesh j11 = jVar.j(this.f97032i.G0(r12, jVar.W0(), this.f97029f.V0()));
                    while (true) {
                        com.badlogic.gdx.utils.a<i> aVar3 = this.f97024a;
                        if (i14 >= aVar3.f13179b) {
                            break;
                        }
                        aVar3.get(i14).f97048b.f7490e = j11;
                        i14++;
                    }
                    this.f97029f.d(r13);
                    r12 = r13;
                }
                c2.b a13 = this.f97029f.a1("", i17, this.f97026c.h());
                c2.b bVar = this.f97024a.get(r2.f13179b - 1).f97048b;
                bVar.f7488c = a12.f7488c;
                bVar.f7489d = a12.f7489d;
                this.f97024a.a(i0(dVar2, i17));
                a12 = a13;
                dVar = dVar2;
                i13 = i17;
            }
            this.f97029f.K0(iVar2.f97047a);
            l2.j jVar2 = this.f97029f;
            c2.b bVar2 = iVar2.f97048b;
            jVar2.d0(bVar2.f7490e, bVar2.f7488c, bVar2.f7489d);
        }
        l2.j jVar3 = this.f97029f;
        Mesh j12 = jVar3.j(this.f97032i.G0(r12, jVar3.W0(), this.f97029f.V0()));
        while (true) {
            com.badlogic.gdx.utils.a<i> aVar4 = this.f97024a;
            int i18 = aVar4.f13179b;
            if (i14 >= i18) {
                c2.b bVar3 = aVar4.get(i18 - 1).f97048b;
                bVar3.f7488c = a12.f7488c;
                bVar3.f7489d = a12.f7489d;
                return;
            }
            aVar4.get(i14).f97048b.f7490e = j12;
            i14++;
        }
    }

    public final i i0(x1.d dVar, int i11) {
        i h11 = this.f97025b.h();
        h11.f97051e = null;
        h11.f97050d = null;
        h11.f97049c = dVar;
        c2.b bVar = h11.f97048b;
        bVar.f7490e = null;
        bVar.f7488c = 0;
        bVar.f7489d = 0;
        bVar.f7487b = i11;
        bVar.f7491f.set(0.0f, 0.0f, 0.0f);
        h11.f97048b.f7492g.set(0.0f, 0.0f, 0.0f);
        h11.f97048b.f7493h = -1.0f;
        h11.f97052f = null;
        h11.f97053g = null;
        h11.f97047a.idt();
        return h11;
    }

    @Override // x1.j
    public void z(com.badlogic.gdx.utils.a<i> aVar, j0<i> j0Var) {
        if (this.f97030g) {
            throw new GdxRuntimeException("Cannot render a ModelCache in between .begin() and .end()");
        }
        a.b<i> it = this.f97024a.iterator();
        while (it.hasNext()) {
            i next = it.next();
            next.f97052f = null;
            next.f97050d = null;
        }
        aVar.g(this.f97024a);
    }

    public g(n nVar, c cVar) {
        this.f97024a = new com.badlogic.gdx.utils.a<>();
        this.f97025b = new a();
        this.f97026c = new b();
        this.f97027d = new com.badlogic.gdx.utils.a<>();
        this.f97028e = new com.badlogic.gdx.utils.a<>();
        this.f97031h = nVar;
        this.f97032i = cVar;
        this.f97029f = new l2.j();
    }
}
