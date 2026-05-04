package od;

import od.p;
import tv.w;
import tv.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
@x
@tv.e
/* loaded from: classes4.dex */
public final class r implements tv.h<Boolean> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final r f76836a = new r();
    }

    public static r a() {
        return a.f76836a;
    }

    public static boolean c() {
        return p.b.a();
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean get() {
        return Boolean.valueOf(c());
    }
}
