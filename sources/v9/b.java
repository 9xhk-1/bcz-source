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
public final class b implements h<w9.a> {

    /* renamed from: a, reason: collision with root package name */
    public final t<EXPDb> f93679a;

    public b(t<EXPDb> dbProvider) {
        this.f93679a = dbProvider;
    }

    public static w9.a a(EXPDb db2) {
        return (w9.a) s.f(a.f93677a.a(db2));
    }

    public static b b(t<EXPDb> dbProvider) {
        return new b(dbProvider);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public w9.a get() {
        return a(this.f93679a.get());
    }
}
