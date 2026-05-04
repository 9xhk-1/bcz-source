package zx;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f103114a;

    public r(@m80.k v0 rootConfig, @m80.k kotlin.coroutines.d parentCoroutineContext) {
        kotlin.jvm.internal.g0.p(rootConfig, "rootConfig");
        kotlin.jvm.internal.g0.p(parentCoroutineContext, "parentCoroutineContext");
        if (rootConfig.a() && !rootConfig.f().isEmpty()) {
            parentCoroutineContext = parentCoroutineContext.plus(v.f103120a);
        }
        this.f103114a = parentCoroutineContext;
    }

    @m80.k
    public final kotlin.coroutines.d a() {
        return this.f103114a;
    }
}
