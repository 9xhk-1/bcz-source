package com.baicizhan.main.wikiv2.lookup.wikiv2;

import android.app.Application;
import k3.j3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w
@tv.x
@tv.e
/* loaded from: classes3.dex */
public final class p0 implements tv.h<o0> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<Application> f25715a;

    /* renamed from: b, reason: collision with root package name */
    public final tv.t<k3.s0> f25716b;

    /* renamed from: c, reason: collision with root package name */
    public final tv.t<j3> f25717c;

    public p0(tv.t<Application> applicationProvider, tv.t<k3.s0> gameServiceProvider, tv.t<j3> topicResourceServiceProvider) {
        this.f25715a = applicationProvider;
        this.f25716b = gameServiceProvider;
        this.f25717c = topicResourceServiceProvider;
    }

    public static p0 a(tv.t<Application> applicationProvider, tv.t<k3.s0> gameServiceProvider, tv.t<j3> topicResourceServiceProvider) {
        return new p0(applicationProvider, gameServiceProvider, topicResourceServiceProvider);
    }

    public static o0 c(Application application, k3.s0 gameService, j3 topicResourceService) {
        return new o0(application, gameService, topicResourceService);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public o0 get() {
        return c(this.f25715a.get(), this.f25716b.get(), this.f25717c.get());
    }
}
