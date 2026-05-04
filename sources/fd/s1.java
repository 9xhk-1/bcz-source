package fd;

import com.baicizhan.main.activity.LearningActivity;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w
@tv.e
/* loaded from: classes4.dex */
public final class s1 implements nu.g<LearningActivity> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<com.baicizhan.client.business.managers.winningstreak.a> f51732a;

    /* renamed from: b, reason: collision with root package name */
    public final tv.t<u9.d> f51733b;

    public s1(tv.t<com.baicizhan.client.business.managers.winningstreak.a> mWinningStreakProvider, tv.t<u9.d> mIExperienceRepoProvider) {
        this.f51732a = mWinningStreakProvider;
        this.f51733b = mIExperienceRepoProvider;
    }

    public static nu.g<LearningActivity> a(tv.t<com.baicizhan.client.business.managers.winningstreak.a> mWinningStreakProvider, tv.t<u9.d> mIExperienceRepoProvider) {
        return new s1(mWinningStreakProvider, mIExperienceRepoProvider);
    }

    @tv.k("com.baicizhan.main.activity.LearningActivity.mIExperienceRepo")
    public static void b(LearningActivity instance, u9.d mIExperienceRepo) {
        instance.f17995l1 = mIExperienceRepo;
    }

    @tv.k("com.baicizhan.main.activity.LearningActivity.mWinningStreak")
    public static void c(LearningActivity instance, com.baicizhan.client.business.managers.winningstreak.a mWinningStreak) {
        instance.f17993k1 = mWinningStreak;
    }

    @Override // nu.g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void injectMembers(LearningActivity instance) {
        c(instance, this.f51732a.get());
        b(instance, this.f51733b.get());
    }
}
