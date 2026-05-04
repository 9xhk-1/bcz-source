package ta;

import android.app.Application;
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
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final t<Application> f90405a;

    public c(t<Application> applicationProvider) {
        this.f90405a = applicationProvider;
    }

    public static c a(t<Application> applicationProvider) {
        return new c(applicationProvider);
    }

    public static b c(Application application) {
        return new b(application);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f90405a.get());
    }
}
