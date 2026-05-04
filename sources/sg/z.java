package sg;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w
@tv.x
@tv.e
/* loaded from: classes4.dex */
public final class z implements tv.h<com.baicizhan.main.home.plan.winningStreak.e> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<com.baicizhan.client.business.managers.winningstreak.a> f88507a;

    /* renamed from: b, reason: collision with root package name */
    public final tv.t<aa.a> f88508b;

    /* renamed from: c, reason: collision with root package name */
    public final tv.t<u9.d> f88509c;

    /* renamed from: d, reason: collision with root package name */
    public final tv.t<u9.f> f88510d;

    public z(tv.t<com.baicizhan.client.business.managers.winningstreak.a> repoProvider, tv.t<aa.a> serverTimeProvider, tv.t<u9.d> expRepoProvider, tv.t<u9.f> taskRepoProvider) {
        this.f88507a = repoProvider;
        this.f88508b = serverTimeProvider;
        this.f88509c = expRepoProvider;
        this.f88510d = taskRepoProvider;
    }

    public static z a(tv.t<com.baicizhan.client.business.managers.winningstreak.a> repoProvider, tv.t<aa.a> serverTimeProvider, tv.t<u9.d> expRepoProvider, tv.t<u9.f> taskRepoProvider) {
        return new z(repoProvider, serverTimeProvider, expRepoProvider, taskRepoProvider);
    }

    public static com.baicizhan.main.home.plan.winningStreak.e c(com.baicizhan.client.business.managers.winningstreak.a repo, aa.a serverTime, u9.d expRepo, u9.f taskRepo) {
        return new com.baicizhan.main.home.plan.winningStreak.e(repo, serverTime, expRepo, taskRepo);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.baicizhan.main.home.plan.winningStreak.e get() {
        return c(this.f88507a.get(), this.f88508b.get(), this.f88509c.get(), this.f88510d.get());
    }
}
