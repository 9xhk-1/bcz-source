package com.baicizhan.main.activity.schedule_v2.adjustschedule;

import android.app.Application;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w
@tv.x
@tv.e
/* loaded from: classes4.dex */
public final class d2 implements tv.h<b2> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<oe.b1> f19068a;

    /* renamed from: b, reason: collision with root package name */
    public final tv.t<Application> f19069b;

    /* renamed from: c, reason: collision with root package name */
    public final tv.t<ta.b> f19070c;

    public d2(tv.t<oe.b1> shareVMProvider, tv.t<Application> applicationProvider, tv.t<ta.b> loadingViewModelProvider) {
        this.f19068a = shareVMProvider;
        this.f19069b = applicationProvider;
        this.f19070c = loadingViewModelProvider;
    }

    public static d2 a(tv.t<oe.b1> shareVMProvider, tv.t<Application> applicationProvider, tv.t<ta.b> loadingViewModelProvider) {
        return new d2(shareVMProvider, applicationProvider, loadingViewModelProvider);
    }

    public static b2 c(oe.b1 shareVM, Application application, ta.b loadingViewModel) {
        return new b2(shareVM, application, loadingViewModel);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b2 get() {
        return c(this.f19068a.get(), this.f19069b.get(), this.f19070c.get());
    }
}
