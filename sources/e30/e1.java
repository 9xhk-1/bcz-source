package e30;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e1 extends a0 {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final r1 f48576c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(@m80.k c1 delegate, @m80.k r1 attributes) {
        super(delegate);
        kotlin.jvm.internal.g0.p(delegate, "delegate");
        kotlin.jvm.internal.g0.p(attributes, "attributes");
        this.f48576c = attributes;
    }

    @Override // e30.z, e30.r0
    @m80.k
    public r1 H0() {
        return this.f48576c;
    }

    @Override // e30.z
    @m80.k
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public e1 T0(@m80.k c1 delegate) {
        kotlin.jvm.internal.g0.p(delegate, "delegate");
        return new e1(delegate, H0());
    }
}
