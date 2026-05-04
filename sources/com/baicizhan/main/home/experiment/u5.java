package com.baicizhan.main.home.experiment;

import com.baicizhan.main.home.experiment.s5;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
@tv.x
@tv.e
/* loaded from: classes4.dex */
public final class u5 implements tv.h<Boolean> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final u5 f21694a = new u5();
    }

    public static u5 a() {
        return a.f21694a;
    }

    public static boolean c() {
        return s5.b.a();
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean get() {
        return Boolean.valueOf(c());
    }
}
