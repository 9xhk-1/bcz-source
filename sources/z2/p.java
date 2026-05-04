package z2;

import com.badlogic.gdx.graphics.g2d.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class p extends c implements s {

    /* renamed from: h, reason: collision with root package name */
    public w1.l f100738h;

    public p() {
    }

    @Override // z2.s
    public void a(w1.a aVar, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        com.badlogic.gdx.graphics.b G = this.f100738h.G();
        float K = this.f100738h.K();
        this.f100738h.c0(G.r(aVar.e()));
        this.f100738h.e0(f13, f14);
        this.f100738h.j0(f19);
        this.f100738h.l0(f17, f18);
        this.f100738h.X(f11, f12, f15, f16);
        this.f100738h.D(aVar);
        this.f100738h.h0(K);
    }

    public w1.l g() {
        return this.f100738h;
    }

    public void h(w1.l lVar) {
        this.f100738h = lVar;
        x(lVar.P());
        v(lVar.H());
    }

    public p i(com.badlogic.gdx.graphics.b bVar) {
        w1.l lVar = this.f100738h;
        w1.l bVar2 = lVar instanceof e.b ? new e.b((e.b) lVar) : new w1.l(lVar);
        bVar2.c0(bVar);
        bVar2.m0(b(), o());
        p pVar = new p(bVar2);
        pVar.p(z());
        pVar.q(u());
        pVar.t(w());
        pVar.r(s());
        return pVar;
    }

    @Override // z2.c, z2.k
    public void y(w1.a aVar, float f11, float f12, float f13, float f14) {
        com.badlogic.gdx.graphics.b G = this.f100738h.G();
        float K = this.f100738h.K();
        this.f100738h.c0(G.r(aVar.e()));
        this.f100738h.j0(0.0f);
        this.f100738h.l0(1.0f, 1.0f);
        this.f100738h.X(f11, f12, f13, f14);
        this.f100738h.D(aVar);
        this.f100738h.h0(K);
    }

    public p(w1.l lVar) {
        h(lVar);
    }

    public p(p pVar) {
        super(pVar);
        h(pVar.f100738h);
    }
}
