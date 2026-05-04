package xy;

import xy.z;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class p0 implements z, m0 {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final p0 f98628b = new p0();

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final String f98629c = "gzip";

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f98630a = n0.e();

    @Override // xy.m0
    @m80.k
    public io.ktor.utils.io.g a(@m80.k io.ktor.utils.io.g source, @m80.k kotlin.coroutines.d coroutineContext) {
        kotlin.jvm.internal.g0.p(source, "source");
        kotlin.jvm.internal.g0.p(coroutineContext, "coroutineContext");
        return this.f98630a.a(source, coroutineContext);
    }

    @Override // xy.m0
    @m80.k
    public io.ktor.utils.io.g b(@m80.k io.ktor.utils.io.g source, @m80.k kotlin.coroutines.d coroutineContext) {
        kotlin.jvm.internal.g0.p(source, "source");
        kotlin.jvm.internal.g0.p(coroutineContext, "coroutineContext");
        return this.f98630a.b(source, coroutineContext);
    }

    @Override // xy.m0
    @m80.k
    public io.ktor.utils.io.m c(@m80.k io.ktor.utils.io.m source, @m80.k kotlin.coroutines.d coroutineContext) {
        kotlin.jvm.internal.g0.p(source, "source");
        kotlin.jvm.internal.g0.p(coroutineContext, "coroutineContext");
        return this.f98630a.c(source, coroutineContext);
    }

    @Override // xy.z
    @m80.l
    public Long d(long j11) {
        return z.a.a(this, j11);
    }

    @Override // xy.z
    @m80.k
    public String getName() {
        return f98629c;
    }
}
