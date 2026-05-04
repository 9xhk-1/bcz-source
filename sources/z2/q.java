package z2;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class q extends c implements s {

    /* renamed from: h, reason: collision with root package name */
    public w1.o f100739h;

    public q() {
    }

    @Override // z2.s
    public void a(w1.a aVar, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        aVar.s(this.f100739h, f11, f12, f13, f14, f15, f16, f17, f18, f19);
    }

    public w1.o g() {
        return this.f100739h;
    }

    public void h(w1.o oVar) {
        this.f100739h = oVar;
        if (oVar != null) {
            x(oVar.c());
            v(oVar.b());
        }
    }

    public k i(com.badlogic.gdx.graphics.b bVar) {
        w1.o oVar = this.f100739h;
        w1.l bVar2 = oVar instanceof e.a ? new e.b((e.a) oVar) : new w1.l(oVar);
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
        aVar.v0(this.f100739h, f11, f12, f13, f14);
    }

    public q(Texture texture) {
        h(new w1.o(texture));
    }

    public q(w1.o oVar) {
        h(oVar);
    }

    public q(q qVar) {
        super(qVar);
        h(qVar.f100739h);
    }
}
