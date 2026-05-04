package io.ktor.server.engine;

import io.ktor.server.engine.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final zx.v0 f61449a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final k.a f61450b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final zx.f f61451c;

    public u(@m80.k zx.v0 rootConfig, @m80.k k.a engineConfig) {
        kotlin.jvm.internal.g0.p(rootConfig, "rootConfig");
        kotlin.jvm.internal.g0.p(engineConfig, "engineConfig");
        this.f61449a = rootConfig;
        this.f61450b = engineConfig;
        this.f61451c = rootConfig.b();
    }

    @m80.k
    public final k.a a() {
        return this.f61450b;
    }

    @m80.k
    public final zx.f b() {
        return this.f61451c;
    }

    @m80.k
    public final zx.v0 c() {
        return this.f61449a;
    }
}
