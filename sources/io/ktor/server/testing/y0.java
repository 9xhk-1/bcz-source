package io.ktor.server.testing;

import io.ktor.server.testing.TestApplicationEngine;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class y0 implements io.ktor.server.engine.b<TestApplicationEngine, TestApplicationEngine.b> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final y0 f61979a = new y0();

    @Override // io.ktor.server.engine.b
    @m80.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public TestApplicationEngine.b a(@m80.k x00.l<? super TestApplicationEngine.b, g2> configure) {
        kotlin.jvm.internal.g0.p(configure, "configure");
        TestApplicationEngine.b bVar = new TestApplicationEngine.b();
        configure.invoke(bVar);
        return bVar;
    }

    @Override // io.ktor.server.engine.b
    @m80.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public TestApplicationEngine b(@m80.k zx.f environment, @m80.k hx.c monitor, boolean z11, @m80.k TestApplicationEngine.b configuration, @m80.k x00.a<zx.a> applicationProvider) {
        kotlin.jvm.internal.g0.p(environment, "environment");
        kotlin.jvm.internal.g0.p(monitor, "monitor");
        kotlin.jvm.internal.g0.p(configuration, "configuration");
        kotlin.jvm.internal.g0.p(applicationProvider, "applicationProvider");
        return new TestApplicationEngine(environment, monitor, z11, applicationProvider, configuration);
    }
}
