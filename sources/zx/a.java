package zx;

import c40.l2;
import c40.l3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@io.ktor.utils.io.c0
/* loaded from: classes8.dex */
public final class a extends c implements c40.r0 {

    /* renamed from: r, reason: collision with root package name */
    @m80.k
    public String f103005r;

    /* renamed from: s, reason: collision with root package name */
    @m80.k
    public final hx.c f103006s;

    /* renamed from: t, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f103007t;

    /* renamed from: u, reason: collision with root package name */
    @m80.k
    public final x00.a<io.ktor.server.engine.a> f103008u;

    /* renamed from: v, reason: collision with root package name */
    @m80.k
    public final c40.a0 f103009v;

    /* renamed from: w, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f103010w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(@m80.k f environment, boolean z11, @m80.k String rootPath, @m80.k hx.c monitor, @m80.k kotlin.coroutines.d parentCoroutineContext, @m80.k x00.a<? extends io.ktor.server.engine.a> engineProvider) {
        super(z11, environment);
        kotlin.jvm.internal.g0.p(environment, "environment");
        kotlin.jvm.internal.g0.p(rootPath, "rootPath");
        kotlin.jvm.internal.g0.p(monitor, "monitor");
        kotlin.jvm.internal.g0.p(parentCoroutineContext, "parentCoroutineContext");
        kotlin.jvm.internal.g0.p(engineProvider, "engineProvider");
        this.f103005r = rootPath;
        this.f103006s = monitor;
        this.f103007t = parentCoroutineContext;
        this.f103008u = engineProvider;
        c40.a0 a11 = l3.a((l2) parentCoroutineContext.get(l2.f7886e0));
        this.f103009v = a11;
        this.f103010w = parentCoroutineContext.plus(a11);
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f103010w;
    }

    public final void l0() {
        l2.a.b(this.f103009v, null, 1, null);
        q.u(this);
    }

    @m80.k
    public final io.ktor.server.engine.a m0() {
        return this.f103008u.invoke();
    }

    @m80.k
    public final hx.c n0() {
        return this.f103006s;
    }

    @m80.k
    public final kotlin.coroutines.d o0() {
        return this.f103007t;
    }

    @m80.k
    public final String p0() {
        return this.f103005r;
    }

    public final void q0(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<set-?>");
        this.f103005r = str;
    }
}
