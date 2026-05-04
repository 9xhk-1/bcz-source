package com.baicizhan.client.business.webview.ui;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w
@tv.e
/* loaded from: classes4.dex */
public final class BczWebFragment_MembersInjector implements nu.g<BczWebFragment> {
    private final tv.t<z9.a> mDakaRepoProvider;
    private final tv.t<u9.d> mIExperienceRepoProvider;
    private final tv.t<z9.b> mStudyCommitterProvider;
    private final tv.t<com.baicizhan.client.business.managers.winningstreak.a> mWinningStreakProvider;

    public BczWebFragment_MembersInjector(tv.t<z9.b> mStudyCommitterProvider, tv.t<z9.a> mDakaRepoProvider, tv.t<com.baicizhan.client.business.managers.winningstreak.a> mWinningStreakProvider, tv.t<u9.d> mIExperienceRepoProvider) {
        this.mStudyCommitterProvider = mStudyCommitterProvider;
        this.mDakaRepoProvider = mDakaRepoProvider;
        this.mWinningStreakProvider = mWinningStreakProvider;
        this.mIExperienceRepoProvider = mIExperienceRepoProvider;
    }

    public static nu.g<BczWebFragment> create(tv.t<z9.b> mStudyCommitterProvider, tv.t<z9.a> mDakaRepoProvider, tv.t<com.baicizhan.client.business.managers.winningstreak.a> mWinningStreakProvider, tv.t<u9.d> mIExperienceRepoProvider) {
        return new BczWebFragment_MembersInjector(mStudyCommitterProvider, mDakaRepoProvider, mWinningStreakProvider, mIExperienceRepoProvider);
    }

    @tv.k("com.baicizhan.client.business.webview.ui.BczWebFragment.mDakaRepo")
    public static void injectMDakaRepo(BczWebFragment instance, z9.a mDakaRepo) {
        instance.mDakaRepo = mDakaRepo;
    }

    @tv.k("com.baicizhan.client.business.webview.ui.BczWebFragment.mIExperienceRepo")
    public static void injectMIExperienceRepo(BczWebFragment instance, u9.d mIExperienceRepo) {
        instance.mIExperienceRepo = mIExperienceRepo;
    }

    @tv.k("com.baicizhan.client.business.webview.ui.BczWebFragment.mStudyCommitter")
    public static void injectMStudyCommitter(BczWebFragment instance, z9.b mStudyCommitter) {
        instance.mStudyCommitter = mStudyCommitter;
    }

    @tv.k("com.baicizhan.client.business.webview.ui.BczWebFragment.mWinningStreak")
    public static void injectMWinningStreak(BczWebFragment instance, com.baicizhan.client.business.managers.winningstreak.a mWinningStreak) {
        instance.mWinningStreak = mWinningStreak;
    }

    @Override // nu.g
    public void injectMembers(BczWebFragment instance) {
        injectMStudyCommitter(instance, this.mStudyCommitterProvider.get());
        injectMDakaRepo(instance, this.mDakaRepoProvider.get());
        injectMWinningStreak(instance, this.mWinningStreakProvider.get());
        injectMIExperienceRepo(instance, this.mIExperienceRepoProvider.get());
    }
}
