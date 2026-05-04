package e30;

import kotlin.LazyThreadSafetyMode;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j1 extends b2 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p10.c1 f48611a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final yz.c0 f48612b;

    public j1(@m80.k p10.c1 typeParameter) {
        kotlin.jvm.internal.g0.p(typeParameter, "typeParameter");
        this.f48611a = typeParameter;
        this.f48612b = yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new i1(this));
    }

    public static final r0 c(j1 j1Var) {
        return k1.b(j1Var.f48611a);
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

    public final r0 f() {
        return (r0) this.f48612b.getValue();
    }

    @Override // e30.a2
    @m80.k
    public r0 getType() {
        return f();
    }
}
