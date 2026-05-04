package zx;

import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f0<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final io.ktor.util.pipeline.h f103038a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.l<io.ktor.util.pipeline.c<T, k0>, g2> f103039b;

    /* JADX WARN: Multi-variable type inference failed */
    public f0(@m80.k io.ktor.util.pipeline.h phase, @m80.k x00.l<? super io.ktor.util.pipeline.c<T, k0>, g2> action) {
        kotlin.jvm.internal.g0.p(phase, "phase");
        kotlin.jvm.internal.g0.p(action, "action");
        this.f103038a = phase;
        this.f103039b = action;
    }

    @m80.k
    public final x00.l<io.ktor.util.pipeline.c<T, k0>, g2> a() {
        return this.f103039b;
    }

    @m80.k
    public final io.ktor.util.pipeline.h b() {
        return this.f103038a;
    }
}
