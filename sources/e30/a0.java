package e30;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class a0 extends z {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c1 f48552b;

    public a0(@m80.k c1 delegate) {
        kotlin.jvm.internal.g0.p(delegate, "delegate");
        this.f48552b = delegate;
    }

    @Override // e30.k2
    @m80.k
    /* renamed from: P0 */
    public c1 M0(boolean z11) {
        return z11 == J0() ? this : R0().M0(z11).O0(H0());
    }

    @Override // e30.k2
    @m80.k
    /* renamed from: Q0 */
    public c1 O0(@m80.k r1 newAttributes) {
        kotlin.jvm.internal.g0.p(newAttributes, "newAttributes");
        return newAttributes != H0() ? new e1(this, newAttributes) : this;
    }

    @Override // e30.z
    @m80.k
    public c1 R0() {
        return this.f48552b;
    }
}
