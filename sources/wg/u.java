package wg;

import wg.s;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@tv.w({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
@tv.x
@tv.e
/* loaded from: classes4.dex */
public final class u implements tv.h<Boolean> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final u f96355a = new u();
    }

    public static u a() {
        return a.f96355a;
    }

    public static boolean c() {
        return s.b.a();
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean get() {
        return Boolean.valueOf(c());
    }
}
