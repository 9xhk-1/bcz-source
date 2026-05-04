package e30;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d0 extends i0 implements i30.d {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final r1 f48563d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d0(@m80.k n10.j r3, @m80.k e30.r1 r4) {
        /*
            r2 = this;
            java.lang.String r0 = "builtIns"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "attributes"
            kotlin.jvm.internal.g0.p(r4, r0)
            e30.c1 r0 = r3.H()
            java.lang.String r1 = "getNothingType(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            e30.c1 r3 = r3.I()
            java.lang.String r1 = "getNullableAnyType(...)"
            kotlin.jvm.internal.g0.o(r3, r1)
            r2.<init>(r0, r3)
            r2.f48563d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e30.d0.<init>(n10.j, e30.r1):void");
    }

    @Override // e30.i0, e30.r0
    @m80.k
    public r1 H0() {
        return this.f48563d;
    }

    @Override // e30.i0, e30.r0
    public boolean J0() {
        return false;
    }

    @Override // e30.i0
    @m80.k
    public c1 P0() {
        return R0();
    }

    @Override // e30.i0
    @m80.k
    public String S0(@m80.k p20.m renderer, @m80.k p20.u options) {
        kotlin.jvm.internal.g0.p(renderer, "renderer");
        kotlin.jvm.internal.g0.p(options, "options");
        return "dynamic";
    }

    @Override // e30.k2
    @m80.k
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public d0 S0(@m80.k f30.g kotlinTypeRefiner) {
        kotlin.jvm.internal.g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // e30.k2
    @m80.k
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public d0 O0(@m80.k r1 newAttributes) {
        kotlin.jvm.internal.g0.p(newAttributes, "newAttributes");
        return new d0(j30.e.o(P0()), newAttributes);
    }

    @Override // e30.k2
    @m80.k
    /* renamed from: T0, reason: merged with bridge method [inline-methods] */
    public d0 M0(boolean z11) {
        return this;
    }
}
