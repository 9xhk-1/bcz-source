package fd;

import com.baicizhan.main.activity.FastTestActivity;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w
@tv.e
/* loaded from: classes4.dex */
public final class z0 implements nu.g<FastTestActivity> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<u9.f> f51808a;

    public z0(tv.t<u9.f> taskRepoProvider) {
        this.f51808a = taskRepoProvider;
    }

    public static nu.g<FastTestActivity> a(tv.t<u9.f> taskRepoProvider) {
        return new z0(taskRepoProvider);
    }

    @tv.k("com.baicizhan.main.activity.FastTestActivity.taskRepo")
    public static void c(FastTestActivity instance, u9.f taskRepo) {
        instance.f17892g = taskRepo;
    }

    @Override // nu.g
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(FastTestActivity instance) {
        c(instance, this.f51808a.get());
    }
}
