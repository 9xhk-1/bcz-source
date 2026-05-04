package e30;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class k0 extends i0 implements i2 {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final i0 f48614d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final r0 f48615e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(@m80.k i0 origin, @m80.k r0 enhancement) {
        super(origin.Q0(), origin.R0());
        kotlin.jvm.internal.g0.p(origin, "origin");
        kotlin.jvm.internal.g0.p(enhancement, "enhancement");
        this.f48614d = origin;
        this.f48615e = enhancement;
    }

    @Override // e30.k2
    @m80.k
    public k2 M0(boolean z11) {
        return j2.d(V().M0(z11), p0().L0().M0(z11));
    }

    @Override // e30.k2
    @m80.k
    public k2 O0(@m80.k r1 newAttributes) {
        kotlin.jvm.internal.g0.p(newAttributes, "newAttributes");
        return j2.d(V().O0(newAttributes), p0());
    }

    @Override // e30.i0
    @m80.k
    public c1 P0() {
        return V().P0();
    }

    @Override // e30.i0
    @m80.k
    public String S0(@m80.k p20.m renderer, @m80.k p20.u options) {
        kotlin.jvm.internal.g0.p(renderer, "renderer");
        kotlin.jvm.internal.g0.p(options, "options");
        return options.b() ? renderer.W(p0()) : V().S0(renderer, options);
    }

    @Override // e30.i2
    @m80.k
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public i0 V() {
        return this.f48614d;
    }

    @Override // e30.k2
    @m80.k
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public k0 S0(@m80.k f30.g kotlinTypeRefiner) {
        kotlin.jvm.internal.g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        r0 a11 = kotlinTypeRefiner.a(V());
        kotlin.jvm.internal.g0.n(a11, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new k0((i0) a11, kotlinTypeRefiner.a(p0()));
    }

    @Override // e30.i2
    @m80.k
    public r0 p0() {
        return this.f48615e;
    }

    @Override // e30.i0
    @m80.k
    public String toString() {
        return "[@EnhancedForWarnings(" + p0() + ")] " + V();
    }
}
