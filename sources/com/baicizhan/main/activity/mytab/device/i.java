package com.baicizhan.main.activity.mytab.device;

import com.baicizhan.main.activity.mytab.device.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
@tv.x
@tv.e
/* loaded from: classes4.dex */
public final class i implements tv.h<Boolean> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final i f18634a = new i();
    }

    public static i a() {
        return a.f18634a;
    }

    public static boolean c() {
        return g.b.a();
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean get() {
        return Boolean.valueOf(c());
    }
}
