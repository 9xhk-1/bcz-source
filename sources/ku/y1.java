package ku;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class y1 implements ju.c {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f68882a;

    /* renamed from: b, reason: collision with root package name */
    public final ju.o f68883b;

    public y1(r0 r0Var) {
        this.f68882a = r0Var;
        this.f68883b = z1.f(r0Var.options());
    }

    @Override // ju.c
    public ju.p a(String str) {
        if (p.N()) {
            p.M("Looking for '" + str + "' relative to " + this.f68882a);
        }
        r0 r0Var = this.f68882a;
        if (r0Var != null) {
            return r0Var.a(str);
        }
        return null;
    }

    @Override // ju.c
    public ju.o b() {
        return this.f68883b;
    }

    @Override // ju.c
    public ju.c c(ju.o oVar) {
        return new y1(this.f68882a, oVar.m(null).l(null));
    }

    public y1 d(r0 r0Var) {
        return r0Var == this.f68882a ? this : new y1(r0Var);
    }

    public y1(r0 r0Var, ju.o oVar) {
        this.f68882a = r0Var;
        this.f68883b = oVar;
    }
}
