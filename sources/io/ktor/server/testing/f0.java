package io.ktor.server.testing;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f0 extends io.ktor.server.engine.h implements c40.r0 {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f61876c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final u0 f61877d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final w0 f61878e;

    public /* synthetic */ f0(zx.a aVar, boolean z11, boolean z12, kotlin.coroutines.d dVar, int i11, kotlin.jvm.internal.v vVar) {
        this(aVar, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? true : z12, dVar);
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f61876c;
    }

    @Override // zx.k0, zx.b
    @m80.k
    /* renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public u0 f() {
        return this.f61877d;
    }

    @Override // zx.k0, zx.b
    @m80.k
    /* renamed from: i, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public w0 k() {
        return this.f61878e;
    }

    @m80.k
    public String toString() {
        return "TestApplicationCall(uri=" + a().B() + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(@m80.k zx.a application, boolean z11, boolean z12, @m80.k kotlin.coroutines.d coroutineContext) {
        super(application);
        kotlin.jvm.internal.g0.p(application, "application");
        kotlin.jvm.internal.g0.p(coroutineContext, "coroutineContext");
        this.f61876c = coroutineContext;
        this.f61877d = new u0(this, z12, null, null, null, null, 60, null);
        this.f61878e = new w0(this, z11);
        io.ktor.server.engine.h.e(this, null, 1, null);
    }
}
