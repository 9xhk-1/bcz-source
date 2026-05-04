package e30;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a extends z {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c1 f48550b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final c1 f48551c;

    public a(@m80.k c1 delegate, @m80.k c1 abbreviation) {
        kotlin.jvm.internal.g0.p(delegate, "delegate");
        kotlin.jvm.internal.g0.p(abbreviation, "abbreviation");
        this.f48550b = delegate;
        this.f48551c = abbreviation;
    }

    @Override // e30.k2
    @m80.k
    /* renamed from: Q0 */
    public c1 O0(@m80.k r1 newAttributes) {
        kotlin.jvm.internal.g0.p(newAttributes, "newAttributes");
        return new a(R0().O0(newAttributes), this.f48551c);
    }

    @Override // e30.z
    @m80.k
    public c1 R0() {
        return this.f48550b;
    }

    @m80.k
    public final c1 U0() {
        return this.f48551c;
    }

    @Override // e30.c1
    @m80.k
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public a M0(boolean z11) {
        return new a(R0().M0(z11), this.f48551c.M0(z11));
    }

    @Override // e30.z
    @m80.k
    /* renamed from: W0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a S0(@m80.k f30.g kotlinTypeRefiner) {
        kotlin.jvm.internal.g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        r0 a11 = kotlinTypeRefiner.a(R0());
        kotlin.jvm.internal.g0.n(a11, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        r0 a12 = kotlinTypeRefiner.a(this.f48551c);
        kotlin.jvm.internal.g0.n(a12, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new a((c1) a11, (c1) a12);
    }

    @Override // e30.z
    @m80.k
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public a T0(@m80.k c1 delegate) {
        kotlin.jvm.internal.g0.p(delegate, "delegate");
        return new a(delegate, this.f48551c);
    }

    @m80.k
    public final c1 a0() {
        return R0();
    }
}
