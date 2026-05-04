package x1;

import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c extends b {

    /* renamed from: d, reason: collision with root package name */
    public a2.f f97007d;

    public c B(a2.b bVar) {
        if (bVar instanceof a2.c) {
            C((a2.c) bVar);
            return this;
        }
        if (bVar instanceof a2.e) {
            D((a2.e) bVar);
            return this;
        }
        if (!(bVar instanceof a2.h)) {
            throw new GdxRuntimeException("Unknown light type");
        }
        E((a2.h) bVar);
        return this;
    }

    public c C(a2.c cVar) {
        y1.e eVar = (y1.e) l(y1.e.f98974g);
        if (eVar == null) {
            eVar = new y1.e();
            v(eVar);
        }
        eVar.f98975e.a(cVar);
        return this;
    }

    public c D(a2.e eVar) {
        y1.h hVar = (y1.h) l(y1.h.f98985g);
        if (hVar == null) {
            hVar = new y1.h();
            v(hVar);
        }
        hVar.f98986e.a(eVar);
        return this;
    }

    public c E(a2.h hVar) {
        y1.i iVar = (y1.i) l(y1.i.f98988g);
        if (iVar == null) {
            iVar = new y1.i();
            v(iVar);
        }
        iVar.f98989e.a(hVar);
        return this;
    }

    public c F(com.badlogic.gdx.utils.a<a2.b> aVar) {
        a.b<a2.b> it = aVar.iterator();
        while (it.hasNext()) {
            B(it.next());
        }
        return this;
    }

    public c G(a2.b... bVarArr) {
        for (a2.b bVar : bVarArr) {
            B(bVar);
        }
        return this;
    }

    public c H(a2.b bVar) {
        if (bVar instanceof a2.c) {
            I((a2.c) bVar);
            return this;
        }
        if (bVar instanceof a2.e) {
            J((a2.e) bVar);
            return this;
        }
        if (!(bVar instanceof a2.h)) {
            throw new GdxRuntimeException("Unknown light type");
        }
        K((a2.h) bVar);
        return this;
    }

    public c I(a2.c cVar) {
        long j11 = y1.e.f98974g;
        if (p(j11)) {
            y1.e eVar = (y1.e) l(j11);
            eVar.f98975e.C(cVar, false);
            if (eVar.f98975e.f13179b == 0) {
                r(j11);
            }
        }
        return this;
    }

    public c J(a2.e eVar) {
        long j11 = y1.h.f98985g;
        if (p(j11)) {
            y1.h hVar = (y1.h) l(j11);
            hVar.f98986e.C(eVar, false);
            if (hVar.f98986e.f13179b == 0) {
                r(j11);
            }
        }
        return this;
    }

    public c K(a2.h hVar) {
        long j11 = y1.i.f98988g;
        if (p(j11)) {
            y1.i iVar = (y1.i) l(j11);
            iVar.f98989e.C(hVar, false);
            if (iVar.f98989e.f13179b == 0) {
                r(j11);
            }
        }
        return this;
    }

    public c L(com.badlogic.gdx.utils.a<a2.b> aVar) {
        a.b<a2.b> it = aVar.iterator();
        while (it.hasNext()) {
            H(it.next());
        }
        return this;
    }

    public c M(a2.b... bVarArr) {
        for (a2.b bVar : bVarArr) {
            H(bVar);
        }
        return this;
    }
}
