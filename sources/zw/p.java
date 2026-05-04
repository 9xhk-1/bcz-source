package zw;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class p implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f102960a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final mw.a f102961b;

    public p(@m80.k mw.a call, @m80.k x delegate) {
        g0.p(call, "call");
        g0.p(delegate, "delegate");
        this.f102960a = delegate;
        this.f102961b = call;
    }

    @m80.k
    public final mw.a c() {
        return this.f102961b;
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f102960a.getCoroutineContext();
    }

    @Override // zw.x
    @m80.k
    public kotlinx.coroutines.flow.i<vy.a> j() {
        return this.f102960a.j();
    }
}
