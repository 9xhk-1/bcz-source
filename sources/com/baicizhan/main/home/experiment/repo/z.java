package com.baicizhan.main.home.experiment.repo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w
@tv.x
@tv.e
/* loaded from: classes4.dex */
public final class z implements tv.h<x> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<s> f21637a;

    /* renamed from: b, reason: collision with root package name */
    public final tv.t<aa.a> f21638b;

    /* renamed from: c, reason: collision with root package name */
    public final tv.t<com.baicizhan.client.business.managers.winningstreak.a> f21639c;

    /* renamed from: d, reason: collision with root package name */
    public final tv.t<q9.x> f21640d;

    /* renamed from: e, reason: collision with root package name */
    public final tv.t<t> f21641e;

    public z(tv.t<s> iGameHomeRepoProvider, tv.t<aa.a> serverTimeProvider, tv.t<com.baicizhan.client.business.managers.winningstreak.a> winProvider, tv.t<q9.x> studyMgrProvider, tv.t<t> iTmpRepoProvider) {
        this.f21637a = iGameHomeRepoProvider;
        this.f21638b = serverTimeProvider;
        this.f21639c = winProvider;
        this.f21640d = studyMgrProvider;
        this.f21641e = iTmpRepoProvider;
    }

    public static z a(tv.t<s> iGameHomeRepoProvider, tv.t<aa.a> serverTimeProvider, tv.t<com.baicizhan.client.business.managers.winningstreak.a> winProvider, tv.t<q9.x> studyMgrProvider, tv.t<t> iTmpRepoProvider) {
        return new z(iGameHomeRepoProvider, serverTimeProvider, winProvider, studyMgrProvider, iTmpRepoProvider);
    }

    public static x c(s iGameHomeRepo, aa.a serverTime, com.baicizhan.client.business.managers.winningstreak.a win, q9.x studyMgr, t iTmpRepo) {
        return new x(iGameHomeRepo, serverTime, win, studyMgr, iTmpRepo);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c(this.f21637a.get(), this.f21638b.get(), this.f21639c.get(), this.f21640d.get(), this.f21641e.get());
    }
}
