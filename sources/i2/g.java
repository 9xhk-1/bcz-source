package i2;

import f2.d;
import i2.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class g<D extends f, T extends f2.d<D>> extends e2.d {

    /* renamed from: l, reason: collision with root package name */
    public T f60128l;

    /* renamed from: m, reason: collision with root package name */
    public D f60129m;

    public g() {
    }

    @Override // e2.d
    public void C0() {
        this.f60128l.I(this.f60129m);
    }

    public abstract boolean J0(f2.d<?> dVar);

    /* JADX WARN: Multi-variable type inference failed */
    public boolean Q0(f2.d<?> dVar) {
        if (!J0(dVar)) {
            return false;
        }
        this.f60128l = dVar;
        return true;
    }

    @Override // e2.d
    public void n0(e2.c cVar) {
        super.n0(cVar);
        D d11 = this.f60129m;
        if (d11 != null) {
            d11.f60126a = this.f48397a;
        }
    }

    public g(D d11) {
        this.f60129m = d11;
    }
}
