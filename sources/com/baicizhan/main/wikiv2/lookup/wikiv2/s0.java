package com.baicizhan.main.wikiv2.lookup.wikiv2;

import com.baicizhan.main.wikiv2.lookup.wikiv2.q0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
@tv.x
@tv.e
/* loaded from: classes3.dex */
public final class s0 implements tv.h<Boolean> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final s0 f25724a = new s0();
    }

    public static s0 a() {
        return a.f25724a;
    }

    public static boolean c() {
        return q0.b.a();
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean get() {
        return Boolean.valueOf(c());
    }
}
