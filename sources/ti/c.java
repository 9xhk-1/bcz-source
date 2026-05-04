package ti;

import android.app.Application;
import k3.j3;
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
public final class c implements h<j3> {

    /* renamed from: a, reason: collision with root package name */
    public final t<Application> f90649a;

    public c(t<Application> applicationProvider) {
        this.f90649a = applicationProvider;
    }

    public static c a(t<Application> applicationProvider) {
        return new c(applicationProvider);
    }

    public static j3 c(Application application) {
        return (j3) s.f(a.f90646a.b(application));
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j3 get() {
        return c(this.f90649a.get());
    }
}
