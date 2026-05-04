package yf;

import com.baicizhan.main.collectreview.ui.CollectReviewActivity;
import tv.k;
import tv.t;
import tv.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w
@tv.e
/* loaded from: classes4.dex */
public final class f implements nu.g<CollectReviewActivity> {

    /* renamed from: a, reason: collision with root package name */
    public final t<u9.d> f99934a;

    public f(t<u9.d> mIExperienceRepoProvider) {
        this.f99934a = mIExperienceRepoProvider;
    }

    public static nu.g<CollectReviewActivity> a(t<u9.d> mIExperienceRepoProvider) {
        return new f(mIExperienceRepoProvider);
    }

    @k("com.baicizhan.main.collectreview.ui.CollectReviewActivity.mIExperienceRepo")
    public static void b(CollectReviewActivity instance, u9.d mIExperienceRepo) {
        instance.f19958e = mIExperienceRepo;
    }

    @Override // nu.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(CollectReviewActivity instance) {
        b(instance, this.f99934a.get());
    }
}
