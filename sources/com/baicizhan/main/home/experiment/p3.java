package com.baicizhan.main.home.experiment;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w
@tv.e
/* loaded from: classes4.dex */
public final class p3 implements nu.g<HomeActivity> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<com.baicizhan.main.home.experiment.repo.s> f21347a;

    public p3(tv.t<com.baicizhan.main.home.experiment.repo.s> gameHomeRepoProvider) {
        this.f21347a = gameHomeRepoProvider;
    }

    public static nu.g<HomeActivity> a(tv.t<com.baicizhan.main.home.experiment.repo.s> gameHomeRepoProvider) {
        return new p3(gameHomeRepoProvider);
    }

    @tv.k("com.baicizhan.main.home.experiment.HomeActivity.gameHomeRepo")
    public static void b(HomeActivity instance, com.baicizhan.main.home.experiment.repo.s gameHomeRepo) {
        instance.f21021f = gameHomeRepo;
    }

    @Override // nu.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(HomeActivity instance) {
        b(instance, this.f21347a.get());
    }
}
