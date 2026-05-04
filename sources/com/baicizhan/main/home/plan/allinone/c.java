package com.baicizhan.main.home.plan.allinone;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w
@tv.x
@tv.e
/* loaded from: classes4.dex */
public final class c implements tv.h<AllInOneVM> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<g1> f22132a;

    /* renamed from: b, reason: collision with root package name */
    public final tv.t<q9.x> f22133b;

    /* renamed from: c, reason: collision with root package name */
    public final tv.t<e1> f22134c;

    public c(tv.t<g1> showReviewProvider, tv.t<q9.x> studyMgrProvider, tv.t<e1> homeRepoProvider) {
        this.f22132a = showReviewProvider;
        this.f22133b = studyMgrProvider;
        this.f22134c = homeRepoProvider;
    }

    public static c a(tv.t<g1> showReviewProvider, tv.t<q9.x> studyMgrProvider, tv.t<e1> homeRepoProvider) {
        return new c(showReviewProvider, studyMgrProvider, homeRepoProvider);
    }

    public static AllInOneVM c(g1 showReview, q9.x studyMgr, e1 homeRepo) {
        return new AllInOneVM(showReview, studyMgr, homeRepo);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AllInOneVM get() {
        return c(this.f22132a.get(), this.f22133b.get(), this.f22134c.get());
    }
}
