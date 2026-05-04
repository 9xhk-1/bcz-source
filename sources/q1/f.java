package q1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class f implements c {

    /* renamed from: a, reason: collision with root package name */
    public n f81377a;

    @Override // q1.c
    public void a() {
        n nVar = this.f81377a;
        if (nVar != null) {
            nVar.a();
        }
    }

    @Override // q1.c
    public void b() {
        n nVar = this.f81377a;
        if (nVar != null) {
            nVar.d0(g.f81379b.S());
        }
    }

    public n c() {
        return this.f81377a;
    }

    public void d(n nVar) {
        n nVar2 = this.f81377a;
        if (nVar2 != null) {
            nVar2.hide();
        }
        this.f81377a = nVar;
        if (nVar != null) {
            nVar.show();
            this.f81377a.j(g.f81379b.getWidth(), g.f81379b.getHeight());
        }
    }

    @Override // q1.c
    public void dispose() {
        n nVar = this.f81377a;
        if (nVar != null) {
            nVar.hide();
        }
    }

    @Override // q1.c
    public void j(int i11, int i12) {
        n nVar = this.f81377a;
        if (nVar != null) {
            nVar.j(i11, i12);
        }
    }

    @Override // q1.c
    public void pause() {
        n nVar = this.f81377a;
        if (nVar != null) {
            nVar.pause();
        }
    }
}
