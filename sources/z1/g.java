package z1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public com.badlogic.gdx.utils.d<e> f100588a = new com.badlogic.gdx.utils.d<>();

    @Override // z1.f
    public void D(int i11, com.badlogic.gdx.utils.a<b> aVar) {
        this.f100588a.get(i11).a(aVar);
    }

    @Override // z1.f
    public void I(int i11) {
        this.f100588a.get(i11).b();
    }

    public void a(e eVar, int i11) {
        this.f100588a.p(i11, eVar);
    }

    public e c(int i11) {
        return this.f100588a.remove(i11);
    }
}
