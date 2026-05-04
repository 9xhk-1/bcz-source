package io.ktor.server.engine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@io.ktor.utils.io.c0
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public ClassLoader f61338a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public Logger f61339b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public ey.a f61340c;

    public d() {
        ClassLoader classLoader = d.class.getClassLoader();
        kotlin.jvm.internal.g0.o(classLoader, "getClassLoader(...)");
        this.f61338a = classLoader;
        Logger logger = LoggerFactory.getLogger("io.ktor.server.Application");
        kotlin.jvm.internal.g0.o(logger, "getLogger(...)");
        this.f61339b = logger;
        this.f61340c = new ey.i();
    }

    @m80.k
    public final zx.f a() {
        return new g(this.f61338a, this.f61339b, this.f61340c, null, 8, null);
    }

    @m80.k
    public final ClassLoader b() {
        return this.f61338a;
    }

    @m80.k
    public final ey.a c() {
        return this.f61340c;
    }

    @m80.k
    public final Logger d() {
        return this.f61339b;
    }

    public final void e(@m80.k ClassLoader classLoader) {
        kotlin.jvm.internal.g0.p(classLoader, "<set-?>");
        this.f61338a = classLoader;
    }

    public final void f(@m80.k ey.a aVar) {
        kotlin.jvm.internal.g0.p(aVar, "<set-?>");
        this.f61340c = aVar;
    }

    public final void g(@m80.k Logger logger) {
        kotlin.jvm.internal.g0.p(logger, "<set-?>");
        this.f61339b = logger;
    }
}
