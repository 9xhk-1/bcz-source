package z2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class m extends c implements s {

    /* renamed from: h, reason: collision with root package name */
    public w1.c f100725h;

    public m() {
    }

    @Override // z2.s
    public void a(w1.a aVar, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        this.f100725h.c(aVar, f11, f12, f13, f14, f15, f16, f17, f18, f19);
    }

    public w1.c g() {
        return this.f100725h;
    }

    public void h(w1.c cVar) {
        this.f100725h = cVar;
        if (cVar != null) {
            x(cVar.q());
            v(cVar.p());
            t(cVar.l());
            q(cVar.k());
            r(cVar.i());
            p(cVar.j());
        }
    }

    public m i(com.badlogic.gdx.graphics.b bVar) {
        m mVar = new m(this);
        mVar.f100725h = new w1.c(mVar.g(), bVar);
        return mVar;
    }

    @Override // z2.c, z2.k
    public void y(w1.a aVar, float f11, float f12, float f13, float f14) {
        this.f100725h.b(aVar, f11, f12, f13, f14);
    }

    public m(w1.c cVar) {
        h(cVar);
    }

    public m(m mVar) {
        super(mVar);
        this.f100725h = mVar.f100725h;
    }
}
