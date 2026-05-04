package io.ktor.server.engine;

import kotlin.DeprecationLevel;
import org.slf4j.Logger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g implements zx.f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ClassLoader f61372a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Logger f61373b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final ey.a f61374c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final hx.c f61375d;

    public g(@m80.k ClassLoader classLoader, @m80.k Logger log, @m80.k ey.a config, @m80.k hx.c monitor) {
        kotlin.jvm.internal.g0.p(classLoader, "classLoader");
        kotlin.jvm.internal.g0.p(log, "log");
        kotlin.jvm.internal.g0.p(config, "config");
        kotlin.jvm.internal.g0.p(monitor, "monitor");
        this.f61372a = classLoader;
        this.f61373b = log;
        this.f61374c = config;
        this.f61375d = monitor;
    }

    @Override // zx.f
    @m80.k
    public hx.c a() {
        return this.f61375d;
    }

    @Override // zx.f
    @m80.k
    public ClassLoader b() {
        return this.f61372a;
    }

    @Override // zx.f
    @m80.k
    public Logger c() {
        return this.f61373b;
    }

    @Override // zx.f
    @m80.k
    public ey.a getConfig() {
        return this.f61374c;
    }

    public /* synthetic */ g(ClassLoader classLoader, Logger logger, ey.a aVar, hx.c cVar, int i11, kotlin.jvm.internal.v vVar) {
        this(classLoader, logger, aVar, (i11 & 8) != 0 ? new hx.c() : cVar);
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "Moved to Application", replaceWith = @yz.w0(expression = "EmbeddedServer.monitor", imports = {"io.ktor.server.engine.EmbeddedServer"}))
    public static /* synthetic */ void d() {
    }
}
