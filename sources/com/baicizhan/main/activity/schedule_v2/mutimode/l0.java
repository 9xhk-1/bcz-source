package com.baicizhan.main.activity.schedule_v2.mutimode;

import com.baicizhan.main.activity.schedule_v2.mutimode.domain.GetSelectModeListUC;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w
@tv.x
@tv.e
/* loaded from: classes4.dex */
public final class l0 implements tv.h<j0> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<GetSelectModeListUC> f19392a;

    /* renamed from: b, reason: collision with root package name */
    public final tv.t<com.baicizhan.main.activity.schedule_v2.mutimode.data.b> f19393b;

    /* renamed from: c, reason: collision with root package name */
    public final tv.t<ta.b> f19394c;

    public l0(tv.t<GetSelectModeListUC> getModeListUcProvider, tv.t<com.baicizhan.main.activity.schedule_v2.mutimode.data.b> multiModeRepoProvider, tv.t<ta.b> loadingViewModelProvider) {
        this.f19392a = getModeListUcProvider;
        this.f19393b = multiModeRepoProvider;
        this.f19394c = loadingViewModelProvider;
    }

    public static l0 a(tv.t<GetSelectModeListUC> getModeListUcProvider, tv.t<com.baicizhan.main.activity.schedule_v2.mutimode.data.b> multiModeRepoProvider, tv.t<ta.b> loadingViewModelProvider) {
        return new l0(getModeListUcProvider, multiModeRepoProvider, loadingViewModelProvider);
    }

    public static j0 c(GetSelectModeListUC getModeListUc, com.baicizhan.main.activity.schedule_v2.mutimode.data.b multiModeRepo, ta.b loadingViewModel) {
        return new j0(getModeListUc, multiModeRepo, loadingViewModel);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j0 get() {
        return c(this.f19392a.get(), this.f19393b.get(), this.f19394c.get());
    }
}
