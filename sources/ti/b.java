package ti;

import android.app.Application;
import k3.s0;
import tv.e;
import tv.h;
import tv.s;
import tv.t;
import tv.w;
import tv.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w
@x("javax.inject.Singleton")
@e
/* loaded from: classes3.dex */
public final class b implements h<s0> {

    /* renamed from: a, reason: collision with root package name */
    public final t<Application> f90648a;

    public b(t<Application> applicationProvider) {
        this.f90648a = applicationProvider;
    }

    public static b a(t<Application> applicationProvider) {
        return new b(applicationProvider);
    }

    public static s0 c(Application application) {
        return (s0) s.f(a.f90646a.a(application));
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public s0 get() {
        return c(this.f90648a.get());
    }
}
