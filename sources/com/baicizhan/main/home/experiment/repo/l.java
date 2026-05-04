package com.baicizhan.main.home.experiment.repo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w
@tv.x
@tv.e
/* loaded from: classes4.dex */
public final class l implements tv.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<s> f21550a;

    public l(tv.t<s> iGameHomeRepoProvider) {
        this.f21550a = iGameHomeRepoProvider;
    }

    public static l a(tv.t<s> iGameHomeRepoProvider) {
        return new l(iGameHomeRepoProvider);
    }

    public static j c(s iGameHomeRepo) {
        return new j(iGameHomeRepo);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c(this.f21550a.get());
    }
}
