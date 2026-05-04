package com.baicizhan.main.activity.schedule_v2.switchschedule;

import android.app.Application;
import com.baicizhan.main.home.plan.allinone.e1;
import qg.q0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w
@tv.x
@tv.e
/* loaded from: classes4.dex */
public final class g0 implements tv.h<f0> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<Application> f19508a;

    /* renamed from: b, reason: collision with root package name */
    public final tv.t<ta.b> f19509b;

    /* renamed from: c, reason: collision with root package name */
    public final tv.t<q0> f19510c;

    /* renamed from: d, reason: collision with root package name */
    public final tv.t<e1> f19511d;

    /* renamed from: e, reason: collision with root package name */
    public final tv.t<com.baicizhan.main.home.experiment.repo.s> f19512e;

    public g0(tv.t<Application> appProvider, tv.t<ta.b> loadingVmProvider, tv.t<q0> getStatusProvider, tv.t<e1> homeRepoProvider, tv.t<com.baicizhan.main.home.experiment.repo.s> gameHomeRepoProvider) {
        this.f19508a = appProvider;
        this.f19509b = loadingVmProvider;
        this.f19510c = getStatusProvider;
        this.f19511d = homeRepoProvider;
        this.f19512e = gameHomeRepoProvider;
    }

    public static g0 a(tv.t<Application> appProvider, tv.t<ta.b> loadingVmProvider, tv.t<q0> getStatusProvider, tv.t<e1> homeRepoProvider, tv.t<com.baicizhan.main.home.experiment.repo.s> gameHomeRepoProvider) {
        return new g0(appProvider, loadingVmProvider, getStatusProvider, homeRepoProvider, gameHomeRepoProvider);
    }

    public static f0 c(Application app2, ta.b loadingVm, q0 getStatus, e1 homeRepo, com.baicizhan.main.home.experiment.repo.s gameHomeRepo) {
        return new f0(app2, loadingVm, getStatus, homeRepo, gameHomeRepo);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f0 get() {
        return c(this.f19508a.get(), this.f19509b.get(), this.f19510c.get(), this.f19511d.get(), this.f19512e.get());
    }
}
