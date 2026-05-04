package e30;

import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h1 extends b2 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final r0 f48596a;

    public h1(@m80.k n10.j kotlinBuiltIns) {
        kotlin.jvm.internal.g0.p(kotlinBuiltIns, "kotlinBuiltIns");
        c1 I = kotlinBuiltIns.I();
        kotlin.jvm.internal.g0.o(I, "getNullableAnyType(...)");
        this.f48596a = I;
    }

    @Override // e30.a2
    public boolean a() {
        return true;
    }

    @Override // e30.a2
    @m80.k
    public Variance b() {
        return Variance.OUT_VARIANCE;
    }

    @Override // e30.a2
    @m80.k
    public a2 d(@m80.k f30.g kotlinTypeRefiner) {
        kotlin.jvm.internal.g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // e30.a2
    @m80.k
    public r0 getType() {
        return this.f48596a;
    }
}
