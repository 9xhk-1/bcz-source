package zu;

import android.content.Context;
import tv.h;
import tv.s;
import tv.w;
import tv.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w({"dagger.hilt.android.qualifiers.ApplicationContext"})
@x
@tv.e
/* loaded from: classes8.dex */
public final class e implements h<Context> {

    /* renamed from: a, reason: collision with root package name */
    public final c f102903a;

    public e(c module) {
        this.f102903a = module;
    }

    public static e a(c module) {
        return new e(module);
    }

    public static Context c(c instance) {
        return (Context) s.f(instance.b());
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return c(this.f102903a);
    }
}
