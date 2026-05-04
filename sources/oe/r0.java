package oe;

import com.baicizhan.main.activity.schedule_v2.EditScheduleActivity;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w
@tv.e
/* loaded from: classes4.dex */
public final class r0 implements nu.g<EditScheduleActivity> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<b1> f76905a;

    public r0(tv.t<b1> modelProvider) {
        this.f76905a = modelProvider;
    }

    public static nu.g<EditScheduleActivity> a(tv.t<b1> modelProvider) {
        return new r0(modelProvider);
    }

    @tv.k("com.baicizhan.main.activity.schedule_v2.EditScheduleActivity.model")
    public static void c(EditScheduleActivity instance, b1 model) {
        instance.f18921f = model;
    }

    @Override // nu.g
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(EditScheduleActivity instance) {
        c(instance, this.f76905a.get());
    }
}
