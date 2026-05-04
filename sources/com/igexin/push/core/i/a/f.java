package com.igexin.push.core.i.a;

/* loaded from: classes7.dex */
public final class f extends b<e> implements l {
    public f(e eVar) {
        super(eVar);
    }

    @Override // com.igexin.push.core.i.a.b, com.igexin.push.core.i.a.l
    public final void b() {
        ((e) this.f38191a).a().prepareToDraw();
    }

    @Override // com.igexin.push.core.i.a.m
    public final Class<e> d() {
        return e.class;
    }

    @Override // com.igexin.push.core.i.a.m
    public final int e() {
        h hVar = ((e) this.f38191a).f38202c.f38212a;
        return hVar.f38228a.m() + hVar.f38237j;
    }

    @Override // com.igexin.push.core.i.a.m
    public final void f() {
        ((e) this.f38191a).stop();
        e eVar = (e) this.f38191a;
        eVar.f38204e = true;
        h hVar = eVar.f38202c.f38212a;
        hVar.f38229b.clear();
        hVar.b();
        hVar.f38230c = false;
        if (hVar.f38232e != null) {
            hVar.f38232e = null;
        }
        if (hVar.f38234g != null) {
            hVar.f38234g = null;
        }
        if (hVar.f38236i != null) {
            hVar.f38236i = null;
        }
        hVar.f38228a.o();
        hVar.f38233f = true;
    }
}
