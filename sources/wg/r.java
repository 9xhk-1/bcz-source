package wg;

import android.app.Application;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w
@tv.x
@tv.e
/* loaded from: classes4.dex */
public final class r implements tv.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<Application> f96350a;

    /* renamed from: b, reason: collision with root package name */
    public final tv.t<com.baicizhan.main.home.experiment.repo.s> f96351b;

    /* renamed from: c, reason: collision with root package name */
    public final tv.t<com.baicizhan.main.home.experiment.repo.t> f96352c;

    public r(tv.t<Application> applicationProvider, tv.t<com.baicizhan.main.home.experiment.repo.s> iGameHomeRepoProvider, tv.t<com.baicizhan.main.home.experiment.repo.t> iTmpRepoProvider) {
        this.f96350a = applicationProvider;
        this.f96351b = iGameHomeRepoProvider;
        this.f96352c = iTmpRepoProvider;
    }

    public static r a(tv.t<Application> applicationProvider, tv.t<com.baicizhan.main.home.experiment.repo.s> iGameHomeRepoProvider, tv.t<com.baicizhan.main.home.experiment.repo.t> iTmpRepoProvider) {
        return new r(applicationProvider, iGameHomeRepoProvider, iTmpRepoProvider);
    }

    public static q c(Application application, com.baicizhan.main.home.experiment.repo.s iGameHomeRepo, com.baicizhan.main.home.experiment.repo.t iTmpRepo) {
        return new q(application, iGameHomeRepo, iTmpRepo);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public q get() {
        return c(this.f96350a.get(), this.f96351b.get(), this.f96352c.get());
    }
}
