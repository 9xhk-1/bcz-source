package e30;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class x0 extends l2 {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final d30.n f48685b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final x00.a<r0> f48686c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final d30.i<r0> f48687d;

    /* JADX WARN: Multi-variable type inference failed */
    public x0(@m80.k d30.n storageManager, @m80.k x00.a<? extends r0> computation) {
        kotlin.jvm.internal.g0.p(storageManager, "storageManager");
        kotlin.jvm.internal.g0.p(computation, "computation");
        this.f48685b = storageManager;
        this.f48686c = computation;
        this.f48687d = storageManager.f(computation);
    }

    public static final r0 Q0(f30.g gVar, x0 x0Var) {
        return gVar.a(x0Var.f48686c.invoke());
    }

    @Override // e30.l2
    @m80.k
    public r0 M0() {
        return this.f48687d.invoke();
    }

    @Override // e30.l2
    public boolean N0() {
        return this.f48687d.g();
    }

    @Override // e30.r0
    @m80.k
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public x0 S0(@m80.k f30.g kotlinTypeRefiner) {
        kotlin.jvm.internal.g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new x0(this.f48685b, new w0(kotlinTypeRefiner, this));
    }
}
