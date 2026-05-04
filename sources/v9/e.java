package v9;

import com.baicizhan.client.business.managers.experience.data.db.EXPDb;
import tv.h;
import tv.s;
import tv.t;
import tv.w;
import tv.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w
@x
@tv.e
/* loaded from: classes4.dex */
public final class e implements h<wc.a> {

    /* renamed from: a, reason: collision with root package name */
    public final t<EXPDb> f93682a;

    public e(t<EXPDb> dbProvider) {
        this.f93682a = dbProvider;
    }

    public static e a(t<EXPDb> dbProvider) {
        return new e(dbProvider);
    }

    public static wc.a c(EXPDb db2) {
        return (wc.a) s.f(a.f93677a.d(db2));
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public wc.a get() {
        return c(this.f93682a.get());
    }
}
