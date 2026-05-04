package com.baicizhan.main.activity.schedule_v2.adjustschedule;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w
@tv.e
/* loaded from: classes4.dex */
public final class x0 implements nu.g<AdjustScheduleClassicFragment> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<oe.b1> f19213a;

    public x0(tv.t<oe.b1> shareModelProvider) {
        this.f19213a = shareModelProvider;
    }

    public static nu.g<AdjustScheduleClassicFragment> a(tv.t<oe.b1> shareModelProvider) {
        return new x0(shareModelProvider);
    }

    @tv.k("com.baicizhan.main.activity.schedule_v2.adjustschedule.AdjustScheduleClassicFragment.shareModel")
    public static void c(AdjustScheduleClassicFragment instance, oe.b1 shareModel) {
        instance.f18960i = shareModel;
    }

    @Override // nu.g
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(AdjustScheduleClassicFragment instance) {
        c(instance, this.f19213a.get());
    }
}
