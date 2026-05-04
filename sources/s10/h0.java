package s10;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class h0 extends n implements p10.g0 {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final n20.c f87194e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final String f87195f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(@m80.k p10.a0 module, @m80.k n20.c fqName) {
        super(module, q10.g.A0.b(), fqName.h(), p10.x0.f78622a);
        kotlin.jvm.internal.g0.p(module, "module");
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        this.f87194e = fqName;
        this.f87195f = "package " + fqName + " of " + module;
    }

    @Override // p10.g0
    @m80.k
    public final n20.c d() {
        return this.f87194e;
    }

    @Override // s10.n, p10.k
    @m80.k
    public p10.x0 getSource() {
        p10.x0 NO_SOURCE = p10.x0.f78622a;
        kotlin.jvm.internal.g0.o(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // s10.m
    @m80.k
    public String toString() {
        return this.f87195f;
    }

    @Override // p10.h
    public <R, D> R y(@m80.k p10.j<R, D> visitor, D d11) {
        kotlin.jvm.internal.g0.p(visitor, "visitor");
        return visitor.c(this, d11);
    }

    @Override // s10.n, p10.h
    @m80.k
    public p10.a0 b() {
        p10.h b11 = super.b();
        kotlin.jvm.internal.g0.n(b11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (p10.a0) b11;
    }
}
