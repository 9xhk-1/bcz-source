package com.baicizhan.main.activity.schedule_v2.adjustschedule;

import android.app.Application;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w
@tv.x
@tv.e
/* loaded from: classes4.dex */
public final class f implements tv.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<oe.b1> f19108a;

    /* renamed from: b, reason: collision with root package name */
    public final tv.t<Application> f19109b;

    /* renamed from: c, reason: collision with root package name */
    public final tv.t<qg.q0> f19110c;

    /* renamed from: d, reason: collision with root package name */
    public final tv.t<com.baicizhan.main.home.plan.allinone.e1> f19111d;

    /* renamed from: e, reason: collision with root package name */
    public final tv.t<com.baicizhan.main.home.experiment.repo.s> f19112e;

    public f(tv.t<oe.b1> shareVMProvider, tv.t<Application> applicationProvider, tv.t<qg.q0> getExamStatusProvider, tv.t<com.baicizhan.main.home.plan.allinone.e1> homeRepoProvider, tv.t<com.baicizhan.main.home.experiment.repo.s> gameHomeRepoProvider) {
        this.f19108a = shareVMProvider;
        this.f19109b = applicationProvider;
        this.f19110c = getExamStatusProvider;
        this.f19111d = homeRepoProvider;
        this.f19112e = gameHomeRepoProvider;
    }

    public static f a(tv.t<oe.b1> shareVMProvider, tv.t<Application> applicationProvider, tv.t<qg.q0> getExamStatusProvider, tv.t<com.baicizhan.main.home.plan.allinone.e1> homeRepoProvider, tv.t<com.baicizhan.main.home.experiment.repo.s> gameHomeRepoProvider) {
        return new f(shareVMProvider, applicationProvider, getExamStatusProvider, homeRepoProvider, gameHomeRepoProvider);
    }

    public static e c(oe.b1 shareVM, Application application, qg.q0 getExamStatus, com.baicizhan.main.home.plan.allinone.e1 homeRepo, com.baicizhan.main.home.experiment.repo.s gameHomeRepo) {
        return new e(shareVM, application, getExamStatus, homeRepo, gameHomeRepo);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c(this.f19108a.get(), this.f19109b.get(), this.f19110c.get(), this.f19111d.get(), this.f19112e.get());
    }
}
