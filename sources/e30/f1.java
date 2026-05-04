package e30;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f1 extends z implements i2 {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c1 f48581b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final r0 f48582c;

    public f1(@m80.k c1 delegate, @m80.k r0 enhancement) {
        kotlin.jvm.internal.g0.p(delegate, "delegate");
        kotlin.jvm.internal.g0.p(enhancement, "enhancement");
        this.f48581b = delegate;
        this.f48582c = enhancement;
    }

    @Override // e30.k2
    @m80.k
    /* renamed from: P0 */
    public c1 M0(boolean z11) {
        k2 d11 = j2.d(V().M0(z11), p0().L0().M0(z11));
        kotlin.jvm.internal.g0.n(d11, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (c1) d11;
    }

    @Override // e30.k2
    @m80.k
    /* renamed from: Q0 */
    public c1 O0(@m80.k r1 newAttributes) {
        kotlin.jvm.internal.g0.p(newAttributes, "newAttributes");
        k2 d11 = j2.d(V().O0(newAttributes), p0());
        kotlin.jvm.internal.g0.n(d11, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (c1) d11;
    }

    @Override // e30.z
    @m80.k
    public c1 R0() {
        return this.f48581b;
    }

    @Override // e30.i2
    @m80.k
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public c1 V() {
        return R0();
    }

    @Override // e30.z
    @m80.k
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public f1 S0(@m80.k f30.g kotlinTypeRefiner) {
        kotlin.jvm.internal.g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        r0 a11 = kotlinTypeRefiner.a(R0());
        kotlin.jvm.internal.g0.n(a11, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new f1((c1) a11, kotlinTypeRefiner.a(p0()));
    }

    @Override // e30.z
    @m80.k
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public f1 T0(@m80.k c1 delegate) {
        kotlin.jvm.internal.g0.p(delegate, "delegate");
        return new f1(delegate, p0());
    }

    @Override // e30.i2
    @m80.k
    public r0 p0() {
        return this.f48582c;
    }

    @Override // e30.c1
    @m80.k
    public String toString() {
        return "[@EnhancedForWarnings(" + p0() + ")] " + V();
    }
}
