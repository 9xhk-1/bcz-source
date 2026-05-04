package bb;

import tv.k;
import tv.t;
import tv.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w
@tv.e
/* loaded from: classes4.dex */
public final class g implements nu.g<d> {

    /* renamed from: a, reason: collision with root package name */
    public final t<u9.f> f6679a;

    public g(t<u9.f> mITaskRepoProvider) {
        this.f6679a = mITaskRepoProvider;
    }

    public static nu.g<d> a(t<u9.f> mITaskRepoProvider) {
        return new g(mITaskRepoProvider);
    }

    @k("com.baicizhan.client.fm.activity.fragment.FmFragment.mITaskRepo")
    public static void b(d instance, u9.f mITaskRepo) {
        instance.R = mITaskRepo;
    }

    @Override // nu.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(d instance) {
        b(instance, this.f6679a.get());
    }
}
