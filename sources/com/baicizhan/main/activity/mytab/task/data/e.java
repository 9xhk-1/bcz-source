package com.baicizhan.main.activity.mytab.task.data;

import tv.t;
import tv.w;
import tv.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w({"com.baicizhan.client.business.managers.ThriftKv", "com.baicizhan.client.business.managers.DefaultKv"})
@x
@tv.e
/* loaded from: classes4.dex */
public final class e implements tv.h<CachedTasksRepository> {

    /* renamed from: a, reason: collision with root package name */
    public final t<nc.a> f18778a;

    /* renamed from: b, reason: collision with root package name */
    public final t<nc.a> f18779b;

    public e(t<nc.a> memProvider, t<nc.a> kvProvider) {
        this.f18778a = memProvider;
        this.f18779b = kvProvider;
    }

    public static e a(t<nc.a> memProvider, t<nc.a> kvProvider) {
        return new e(memProvider, kvProvider);
    }

    public static CachedTasksRepository c(nc.a mem, nc.a kv2) {
        return new CachedTasksRepository(mem, kv2);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CachedTasksRepository get() {
        return c(this.f18778a.get(), this.f18779b.get());
    }
}
