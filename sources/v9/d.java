package v9;

import com.baicizhan.client.business.managers.experience.data.db.EXPDb;
import tv.h;
import tv.s;
import tv.t;
import tv.w;
import tv.x;
import w9.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w
@x
@tv.e
/* loaded from: classes4.dex */
public final class d implements h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final t<EXPDb> f93681a;

    public d(t<EXPDb> dbProvider) {
        this.f93681a = dbProvider;
    }

    public static d a(t<EXPDb> dbProvider) {
        return new d(dbProvider);
    }

    public static k c(EXPDb db2) {
        return (k) s.f(a.f93677a.c(db2));
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c(this.f93681a.get());
    }
}
