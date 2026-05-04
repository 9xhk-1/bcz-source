package c40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class q2 extends h40.d0 implements k1, e2 {

    /* renamed from: d, reason: collision with root package name */
    public r2 f7926d;

    @m80.k
    public final r2 B() {
        r2 r2Var = this.f7926d;
        if (r2Var != null) {
            return r2Var;
        }
        kotlin.jvm.internal.g0.S("job");
        return null;
    }

    public abstract boolean C();

    public abstract void D(@m80.l Throwable th2);

    public final void E(@m80.k r2 r2Var) {
        this.f7926d = r2Var;
    }

    @Override // c40.e2
    @m80.l
    public w2 a() {
        return null;
    }

    @Override // c40.k1
    public void dispose() {
        B().K1(this);
    }

    @Override // c40.e2
    public boolean isActive() {
        return true;
    }

    @Override // h40.d0
    @m80.k
    public String toString() {
        return u0.a(this) + '@' + u0.b(this) + "[job@" + u0.b(B()) + l50.b.f69930l;
    }
}
