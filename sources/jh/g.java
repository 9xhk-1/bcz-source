package jh;

import com.baicizhan.main.plusreview.activity.DefaultReviewActivity;
import tv.k;
import tv.t;
import tv.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w
@tv.e
/* loaded from: classes4.dex */
public final class g implements nu.g<DefaultReviewActivity> {

    /* renamed from: a, reason: collision with root package name */
    public final t<u9.d> f64093a;

    public g(t<u9.d> mIExperienceRepoProvider) {
        this.f64093a = mIExperienceRepoProvider;
    }

    public static nu.g<DefaultReviewActivity> a(t<u9.d> mIExperienceRepoProvider) {
        return new g(mIExperienceRepoProvider);
    }

    @k("com.baicizhan.main.plusreview.activity.DefaultReviewActivity.mIExperienceRepo")
    public static void b(DefaultReviewActivity instance, u9.d mIExperienceRepo) {
        instance.f24584e = mIExperienceRepo;
    }

    @Override // nu.g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void injectMembers(DefaultReviewActivity instance) {
        b(instance, this.f64093a.get());
    }
}
