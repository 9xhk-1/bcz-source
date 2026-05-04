package e30;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l1 extends d implements i30.i {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final u1 f48618f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final x20.k f48619g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(@m80.k f30.r originalTypeVariable, boolean z11, @m80.k u1 constructor) {
        super(originalTypeVariable, z11);
        kotlin.jvm.internal.g0.p(originalTypeVariable, "originalTypeVariable");
        kotlin.jvm.internal.g0.p(constructor, "constructor");
        this.f48618f = constructor;
        this.f48619g = originalTypeVariable.q().i().r();
    }

    @Override // e30.r0
    @m80.k
    public u1 I0() {
        return this.f48618f;
    }

    @Override // e30.d
    @m80.k
    public d S0(boolean z11) {
        return new l1(R0(), z11, I0());
    }

    @Override // e30.d, e30.r0
    @m80.k
    public x20.k r() {
        return this.f48619g;
    }

    @Override // e30.c1
    @m80.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Stub (BI): ");
        sb2.append(R0());
        sb2.append(J0() ? "?" : "");
        return sb2.toString();
    }
}
