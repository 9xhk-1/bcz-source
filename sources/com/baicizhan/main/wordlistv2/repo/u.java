package com.baicizhan.main.wordlistv2.repo;

import tv.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w
@x
@tv.e
/* loaded from: classes5.dex */
public final class u implements tv.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<d> f28049a;

    /* renamed from: b, reason: collision with root package name */
    public final tv.t<q9.x> f28050b;

    /* renamed from: c, reason: collision with root package name */
    public final tv.t<c> f28051c;

    public u(tv.t<d> resRepoProvider, tv.t<q9.x> studyMgrProvider, tv.t<c> remoteProvider) {
        this.f28049a = resRepoProvider;
        this.f28050b = studyMgrProvider;
        this.f28051c = remoteProvider;
    }

    public static u a(tv.t<d> resRepoProvider, tv.t<q9.x> studyMgrProvider, tv.t<c> remoteProvider) {
        return new u(resRepoProvider, studyMgrProvider, remoteProvider);
    }

    public static r c(d resRepo, q9.x studyMgr, c remote) {
        return new r(resRepo, studyMgr, remote);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f28049a.get(), this.f28050b.get(), this.f28051c.get());
    }
}
