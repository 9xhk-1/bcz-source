package com.baicizhan.main.activity.schedule_v2.mutimode.data;

import tv.t;
import tv.w;
import tv.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w({"com.baicizhan.client.business.managers.DefaultKv"})
@x
@tv.e
/* loaded from: classes4.dex */
public final class g implements tv.h<RemoteMultiModeRepo> {

    /* renamed from: a, reason: collision with root package name */
    public final t<nc.a> f19318a;

    public g(t<nc.a> kvProvider) {
        this.f19318a = kvProvider;
    }

    public static g a(t<nc.a> kvProvider) {
        return new g(kvProvider);
    }

    public static RemoteMultiModeRepo c(nc.a kv2) {
        return new RemoteMultiModeRepo(kv2);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RemoteMultiModeRepo get() {
        return c(this.f19318a.get());
    }
}
