package com.baicizhan.main.activity.schedule_v2.adjustschedule;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w
@tv.e
/* loaded from: classes4.dex */
public final class y1 implements nu.g<GamingPlanFragment> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<oe.b1> f19221a;

    public y1(tv.t<oe.b1> shareModelProvider) {
        this.f19221a = shareModelProvider;
    }

    public static nu.g<GamingPlanFragment> a(tv.t<oe.b1> shareModelProvider) {
        return new y1(shareModelProvider);
    }

    @tv.k("com.baicizhan.main.activity.schedule_v2.adjustschedule.GamingPlanFragment.shareModel")
    public static void c(GamingPlanFragment instance, oe.b1 shareModel) {
        instance.f18978f = shareModel;
    }

    @Override // nu.g
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(GamingPlanFragment instance) {
        c(instance, this.f19221a.get());
    }
}
