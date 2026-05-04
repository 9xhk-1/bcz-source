package v9;

import android.content.Context;
import com.baicizhan.client.business.managers.experience.data.db.EXPDb;
import tv.h;
import tv.s;
import tv.t;
import tv.w;
import tv.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w({"dagger.hilt.android.qualifiers.ApplicationContext"})
@x("javax.inject.Singleton")
@tv.e
/* loaded from: classes4.dex */
public final class c implements h<EXPDb> {

    /* renamed from: a, reason: collision with root package name */
    public final t<Context> f93680a;

    public c(t<Context> appProvider) {
        this.f93680a = appProvider;
    }

    public static c a(t<Context> appProvider) {
        return new c(appProvider);
    }

    public static EXPDb b(Context app2) {
        return (EXPDb) s.f(a.f93677a.b(app2));
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public EXPDb get() {
        return b(this.f93680a.get());
    }
}
