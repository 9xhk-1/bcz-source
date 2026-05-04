package com.baicizhan.main.activity.schedule_v2.switchschedule;

import oe.b1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w
@tv.e
/* loaded from: classes4.dex */
public final class q implements nu.g<SwitchScheduleFragment> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<b1> f19526a;

    public q(tv.t<b1> shareModelProvider) {
        this.f19526a = shareModelProvider;
    }

    public static nu.g<SwitchScheduleFragment> a(tv.t<b1> shareModelProvider) {
        return new q(shareModelProvider);
    }

    @tv.k("com.baicizhan.main.activity.schedule_v2.switchschedule.SwitchScheduleFragment.shareModel")
    public static void c(SwitchScheduleFragment instance, b1 shareModel) {
        instance.f19454g = shareModel;
    }

    @Override // nu.g
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(SwitchScheduleFragment instance) {
        c(instance, this.f19526a.get());
    }
}
