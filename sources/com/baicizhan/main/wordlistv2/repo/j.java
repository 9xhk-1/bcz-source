package com.baicizhan.main.wordlistv2.repo;

import android.content.Context;
import tv.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w({"dagger.hilt.android.qualifiers.ApplicationContext"})
@x
@tv.e
/* loaded from: classes5.dex */
public final class j implements tv.h<RemoteImpl> {

    /* renamed from: a, reason: collision with root package name */
    public final tv.t<Context> f27970a;

    public j(tv.t<Context> contextProvider) {
        this.f27970a = contextProvider;
    }

    public static j a(tv.t<Context> contextProvider) {
        return new j(contextProvider);
    }

    public static RemoteImpl c(Context context) {
        return new RemoteImpl(context);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RemoteImpl get() {
        return c(this.f27970a.get());
    }
}
