package vh;

import com.baicizhan.main.selftest.activity.WalkListenActivity;
import tv.t;
import tv.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w
@tv.e
/* loaded from: classes4.dex */
public final class k implements nu.g<WalkListenActivity> {

    /* renamed from: a, reason: collision with root package name */
    public final t<u9.f> f93943a;

    public k(t<u9.f> mITaskRepoProvider) {
        this.f93943a = mITaskRepoProvider;
    }

    public static nu.g<WalkListenActivity> a(t<u9.f> mITaskRepoProvider) {
        return new k(mITaskRepoProvider);
    }

    @tv.k("com.baicizhan.main.selftest.activity.WalkListenActivity.mITaskRepo")
    public static void b(WalkListenActivity instance, u9.f mITaskRepo) {
        instance.f24990e = mITaskRepo;
    }

    @Override // nu.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(WalkListenActivity instance) {
        b(instance, this.f93943a.get());
    }
}
