package com.baicizhan.main.activity.schedule_v2.mutimode.domain;

import com.baicizhan.main.activity.schedule_v2.mutimode.data.b;
import tv.e;
import tv.h;
import tv.t;
import tv.w;
import tv.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w
@x
@e
/* loaded from: classes4.dex */
public final class a implements h<GetSelectModeListUC> {

    /* renamed from: a, reason: collision with root package name */
    public final t<b> f19328a;

    public a(t<b> modeRepoProvider) {
        this.f19328a = modeRepoProvider;
    }

    public static a a(t<b> modeRepoProvider) {
        return new a(modeRepoProvider);
    }

    public static GetSelectModeListUC c(b modeRepo) {
        return new GetSelectModeListUC(modeRepo);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public GetSelectModeListUC get() {
        return c(this.f19328a.get());
    }
}
