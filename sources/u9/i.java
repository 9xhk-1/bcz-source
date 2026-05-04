package u9;

import tv.t;
import tv.w;
import tv.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w
@x
@tv.e
/* loaded from: classes4.dex */
public final class i implements tv.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final t<wc.a> f92080a;

    /* renamed from: b, reason: collision with root package name */
    public final t<com.baicizhan.client.business.managers.experience.data.remote.c> f92081b;

    public i(t<wc.a> taskDaoProvider, t<com.baicizhan.client.business.managers.experience.data.remote.c> taskRemoteProvider) {
        this.f92080a = taskDaoProvider;
        this.f92081b = taskRemoteProvider;
    }

    public static i a(t<wc.a> taskDaoProvider, t<com.baicizhan.client.business.managers.experience.data.remote.c> taskRemoteProvider) {
        return new i(taskDaoProvider, taskRemoteProvider);
    }

    public static h c(wc.a taskDao, com.baicizhan.client.business.managers.experience.data.remote.c taskRemote) {
        return new h(taskDao, taskRemote);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public h get() {
        return c(this.f92080a.get(), this.f92081b.get());
    }
}
