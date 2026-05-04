package e30;

import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class y extends d2 {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final d2 f48689c;

    public y(@m80.k d2 substitution) {
        kotlin.jvm.internal.g0.p(substitution, "substitution");
        this.f48689c = substitution;
    }

    @Override // e30.d2
    public boolean a() {
        return this.f48689c.a();
    }

    @Override // e30.d2
    public boolean b() {
        return this.f48689c.b();
    }

    @Override // e30.d2
    @m80.k
    public q10.g d(@m80.k q10.g annotations) {
        kotlin.jvm.internal.g0.p(annotations, "annotations");
        return this.f48689c.d(annotations);
    }

    @Override // e30.d2
    @m80.l
    public a2 e(@m80.k r0 key) {
        kotlin.jvm.internal.g0.p(key, "key");
        return this.f48689c.e(key);
    }

    @Override // e30.d2
    public boolean f() {
        return this.f48689c.f();
    }

    @Override // e30.d2
    @m80.k
    public r0 g(@m80.k r0 topLevelType, @m80.k Variance position) {
        kotlin.jvm.internal.g0.p(topLevelType, "topLevelType");
        kotlin.jvm.internal.g0.p(position, "position");
        return this.f48689c.g(topLevelType, position);
    }
}
