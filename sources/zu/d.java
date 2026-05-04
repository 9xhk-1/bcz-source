package zu;

import android.app.Application;
import tv.h;
import tv.s;
import tv.w;
import tv.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w
@x
@tv.e
/* loaded from: classes8.dex */
public final class d implements h<Application> {

    /* renamed from: a, reason: collision with root package name */
    public final c f102902a;

    public d(c module) {
        this.f102902a = module;
    }

    public static d a(c module) {
        return new d(module);
    }

    public static Application c(c instance) {
        return (Application) s.f(instance.a());
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Application get() {
        return c(this.f102902a);
    }
}
