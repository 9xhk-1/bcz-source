package com.baicizhan.main.home.experiment;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w({"com.baicizhan.client.business.managers.DefaultKv"})
@tv.x
@tv.e
/* loaded from: classes4.dex */
public final class r5 implements tv.h<p5> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<aa.a> f21439a;

    /* renamed from: b, reason: collision with root package name */
    public final tv.t<com.baicizhan.main.home.experiment.repo.s> f21440b;

    /* renamed from: c, reason: collision with root package name */
    public final tv.t<com.baicizhan.main.home.experiment.repo.x> f21441c;

    /* renamed from: d, reason: collision with root package name */
    public final tv.t<com.baicizhan.main.home.experiment.repo.j> f21442d;

    /* renamed from: e, reason: collision with root package name */
    public final tv.t<nc.a> f21443e;

    public r5(tv.t<aa.a> serverTimeProvider, tv.t<com.baicizhan.main.home.experiment.repo.s> gameHomeRepoProvider, tv.t<com.baicizhan.main.home.experiment.repo.x> refreshAllProvider, tv.t<com.baicizhan.main.home.experiment.repo.j> doRefreshPopProvider, tv.t<nc.a> kvProvider) {
        this.f21439a = serverTimeProvider;
        this.f21440b = gameHomeRepoProvider;
        this.f21441c = refreshAllProvider;
        this.f21442d = doRefreshPopProvider;
        this.f21443e = kvProvider;
    }

    public static r5 a(tv.t<aa.a> serverTimeProvider, tv.t<com.baicizhan.main.home.experiment.repo.s> gameHomeRepoProvider, tv.t<com.baicizhan.main.home.experiment.repo.x> refreshAllProvider, tv.t<com.baicizhan.main.home.experiment.repo.j> doRefreshPopProvider, tv.t<nc.a> kvProvider) {
        return new r5(serverTimeProvider, gameHomeRepoProvider, refreshAllProvider, doRefreshPopProvider, kvProvider);
    }

    public static p5 c(aa.a serverTime, com.baicizhan.main.home.experiment.repo.s gameHomeRepo, com.baicizhan.main.home.experiment.repo.x refreshAll, com.baicizhan.main.home.experiment.repo.j doRefreshPop, nc.a kv2) {
        return new p5(serverTime, gameHomeRepo, refreshAll, doRefreshPop, kv2);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public p5 get() {
        return c(this.f21439a.get(), this.f21440b.get(), this.f21441c.get(), this.f21442d.get(), this.f21443e.get());
    }
}
