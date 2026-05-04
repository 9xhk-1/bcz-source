package y2;

import a3.j0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class x extends x2.a {

    /* renamed from: d, reason: collision with root package name */
    public Runnable f99206d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f99207e;

    @Override // x2.a
    public boolean a(float f11) {
        if (!this.f99207e) {
            this.f99207e = true;
            j();
        }
        return true;
    }

    @Override // x2.a
    public void e() {
        this.f99207e = false;
    }

    public Runnable i() {
        return this.f99206d;
    }

    public void j() {
        j0 c11 = c();
        g(null);
        try {
            this.f99206d.run();
        } finally {
            g(c11);
        }
    }

    public void k(Runnable runnable) {
        this.f99206d = runnable;
    }

    @Override // x2.a, a3.j0.a
    public void reset() {
        super.reset();
        this.f99206d = null;
    }
}
