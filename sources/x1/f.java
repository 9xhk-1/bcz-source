package x1;

import a3.q;
import a3.s;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.util.Iterator;
import l2.m;
import l2.n;
import l2.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f implements q {

    /* renamed from: a, reason: collision with root package name */
    public com.badlogic.gdx.graphics.a f97017a;

    /* renamed from: b, reason: collision with root package name */
    public final a f97018b;

    /* renamed from: c, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<i> f97019c;

    /* renamed from: d, reason: collision with root package name */
    public final m f97020d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f97021e;

    /* renamed from: f, reason: collision with root package name */
    public final o f97022f;

    /* renamed from: g, reason: collision with root package name */
    public final n f97023g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends s<i> {
        @Override // a3.j0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public i g() {
            return new i();
        }

        @Override // a3.s, a3.j0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public i h() {
            i iVar = (i) super.h();
            iVar.f97050d = null;
            iVar.f97049c = null;
            iVar.f97048b.e("", null, 0, 0, 0);
            iVar.f97052f = null;
            iVar.f97053g = null;
            return iVar;
        }
    }

    public f(m mVar, o oVar, n nVar) {
        this.f97018b = new a();
        this.f97019c = new com.badlogic.gdx.utils.a<>();
        this.f97023g = nVar == null ? new l2.e() : nVar;
        this.f97021e = mVar == null;
        this.f97020d = mVar == null ? new m(new l2.g(1, 1)) : mVar;
        this.f97022f = oVar == null ? new l2.f() : oVar;
    }

    public void C0(j jVar, c cVar) {
        com.badlogic.gdx.utils.a<i> aVar = this.f97019c;
        int i11 = aVar.f13179b;
        jVar.z(aVar, this.f97018b);
        while (true) {
            com.badlogic.gdx.utils.a<i> aVar2 = this.f97019c;
            if (i11 >= aVar2.f13179b) {
                return;
            }
            i iVar = aVar2.get(i11);
            iVar.f97050d = cVar;
            iVar.f97052f = this.f97022f.r(iVar);
            i11++;
        }
    }

    public n D() {
        return this.f97023g;
    }

    public o I() {
        return this.f97022f;
    }

    public void J0(j jVar, c cVar, k kVar) {
        com.badlogic.gdx.utils.a<i> aVar = this.f97019c;
        int i11 = aVar.f13179b;
        jVar.z(aVar, this.f97018b);
        while (true) {
            com.badlogic.gdx.utils.a<i> aVar2 = this.f97019c;
            if (i11 >= aVar2.f13179b) {
                return;
            }
            i iVar = aVar2.get(i11);
            iVar.f97050d = cVar;
            iVar.f97052f = kVar;
            iVar.f97052f = this.f97022f.r(iVar);
            i11++;
        }
    }

    public void M(i iVar) {
        iVar.f97052f = this.f97022f.r(iVar);
        this.f97019c.a(iVar);
    }

    public void Q0(j jVar, k kVar) {
        com.badlogic.gdx.utils.a<i> aVar = this.f97019c;
        int i11 = aVar.f13179b;
        jVar.z(aVar, this.f97018b);
        while (true) {
            com.badlogic.gdx.utils.a<i> aVar2 = this.f97019c;
            if (i11 >= aVar2.f13179b) {
                return;
            }
            i iVar = aVar2.get(i11);
            iVar.f97052f = kVar;
            iVar.f97052f = this.f97022f.r(iVar);
            i11++;
        }
    }

    public boolean R() {
        return this.f97021e;
    }

    public void V0(com.badlogic.gdx.graphics.a aVar) {
        if (this.f97017a == null) {
            throw new GdxRuntimeException("Call begin() first.");
        }
        if (this.f97019c.f13179b > 0) {
            flush();
        }
        this.f97017a = aVar;
    }

    public <T extends j> void X(Iterable<T> iterable) {
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            w0(it.next());
        }
    }

    public <T extends j> void Z(Iterable<T> iterable, c cVar) {
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            C0(it.next(), cVar);
        }
    }

    public void b(com.badlogic.gdx.graphics.a aVar) {
        if (this.f97017a != null) {
            throw new GdxRuntimeException("Call end() first.");
        }
        this.f97017a = aVar;
        if (this.f97021e) {
            this.f97020d.a();
        }
    }

    @Override // a3.q
    public void dispose() {
        this.f97022f.dispose();
    }

    public void end() {
        flush();
        if (this.f97021e) {
            this.f97020d.b();
        }
        this.f97017a = null;
    }

    public void flush() {
        this.f97023g.a(this.f97017a, this.f97019c);
        k kVar = null;
        int i11 = 0;
        while (true) {
            com.badlogic.gdx.utils.a<i> aVar = this.f97019c;
            if (i11 >= aVar.f13179b) {
                break;
            }
            i iVar = aVar.get(i11);
            if (kVar != iVar.f97052f) {
                if (kVar != null) {
                    kVar.end();
                }
                kVar = iVar.f97052f;
                kVar.y0(this.f97017a, this.f97020d);
            }
            kVar.M(iVar);
            i11++;
        }
        if (kVar != null) {
            kVar.end();
        }
        this.f97018b.j();
        this.f97019c.clear();
    }

    public <T extends j> void i0(Iterable<T> iterable, c cVar, k kVar) {
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            J0(it.next(), cVar, kVar);
        }
    }

    public <T extends j> void n0(Iterable<T> iterable, k kVar) {
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            Q0(it.next(), kVar);
        }
    }

    public com.badlogic.gdx.graphics.a o() {
        return this.f97017a;
    }

    public void w0(j jVar) {
        com.badlogic.gdx.utils.a<i> aVar = this.f97019c;
        int i11 = aVar.f13179b;
        jVar.z(aVar, this.f97018b);
        while (true) {
            com.badlogic.gdx.utils.a<i> aVar2 = this.f97019c;
            if (i11 >= aVar2.f13179b) {
                return;
            }
            i iVar = aVar2.get(i11);
            iVar.f97052f = this.f97022f.r(iVar);
            i11++;
        }
    }

    public m z() {
        return this.f97020d;
    }

    public f(m mVar, o oVar) {
        this(mVar, oVar, null);
    }

    public f(m mVar, n nVar) {
        this(mVar, null, nVar);
    }

    public f(m mVar) {
        this(mVar, null, null);
    }

    public f(o oVar, n nVar) {
        this(null, oVar, nVar);
    }

    public f(n nVar) {
        this(null, null, nVar);
    }

    public f(o oVar) {
        this(null, oVar, null);
    }

    public f(v1.a aVar, v1.a aVar2) {
        this(null, new l2.f(aVar, aVar2), null);
    }

    public f(String str, String str2) {
        this(null, new l2.f(str, str2), null);
    }

    public f() {
        this(null, null, null);
    }
}
