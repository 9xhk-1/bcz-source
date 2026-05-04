package com.baicizhan.main.activity.daka.datasource;

import android.content.Context;
import tv.t;
import tv.w;
import tv.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w({"dagger.hilt.android.qualifiers.ApplicationContext"})
@x
@tv.e
/* loaded from: classes4.dex */
public final class h implements tv.h<DakaRepoImpl> {

    /* renamed from: a, reason: collision with root package name */
    public final t<Context> f18382a;

    public h(t<Context> contextProvider) {
        this.f18382a = contextProvider;
    }

    public static h a(t<Context> contextProvider) {
        return new h(contextProvider);
    }

    public static DakaRepoImpl c(Context context) {
        return new DakaRepoImpl(context);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DakaRepoImpl get() {
        return c(this.f18382a.get());
    }
}
