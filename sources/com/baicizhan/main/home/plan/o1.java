package com.baicizhan.main.home.plan;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w
@tv.e
/* loaded from: classes4.dex */
public final class o1 implements nu.g<WordPlanFragment> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<u9.f> f22893a;

    public o1(tv.t<u9.f> taskRepoProvider) {
        this.f22893a = taskRepoProvider;
    }

    public static nu.g<WordPlanFragment> a(tv.t<u9.f> taskRepoProvider) {
        return new o1(taskRepoProvider);
    }

    @tv.k("com.baicizhan.main.home.plan.WordPlanFragment.taskRepo")
    public static void c(WordPlanFragment instance, u9.f taskRepo) {
        instance.f21837q = taskRepo;
    }

    @Override // nu.g
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(WordPlanFragment instance) {
        c(instance, this.f22893a.get());
    }
}
