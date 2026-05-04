package io.ktor.server.plugins.calllogging;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f61539a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.l<zx.b, String> f61540b;

    /* JADX WARN: Multi-variable type inference failed */
    public j(@m80.k String name, @m80.k x00.l<? super zx.b, String> provider) {
        g0.p(name, "name");
        g0.p(provider, "provider");
        this.f61539a = name;
        this.f61540b = provider;
    }

    @m80.k
    public final String a() {
        return this.f61539a;
    }

    @m80.k
    public final x00.l<zx.b, String> b() {
        return this.f61540b;
    }
}
