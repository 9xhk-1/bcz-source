package com.baicizhan.main.home.experiment.repo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w
@tv.x
@tv.e
/* loaded from: classes4.dex */
public final class v implements tv.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<s> f21592a;

    /* renamed from: b, reason: collision with root package name */
    public final tv.t<com.baicizhan.client.business.managers.winningstreak.a> f21593b;

    public v(tv.t<s> iGameHomeRepoProvider, tv.t<com.baicizhan.client.business.managers.winningstreak.a> winProvider) {
        this.f21592a = iGameHomeRepoProvider;
        this.f21593b = winProvider;
    }

    public static v a(tv.t<s> iGameHomeRepoProvider, tv.t<com.baicizhan.client.business.managers.winningstreak.a> winProvider) {
        return new v(iGameHomeRepoProvider, winProvider);
    }

    public static u c(s iGameHomeRepo, com.baicizhan.client.business.managers.winningstreak.a win) {
        return new u(iGameHomeRepo, win);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c(this.f21592a.get(), this.f21593b.get());
    }
}
