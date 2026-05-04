package r5;

import com.baicizhan.app.biz.game.repo.migrate.MigrateResourceId;
import com.baicizhan.app.preferences.g;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import oa0.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {a.class})
/* loaded from: classes3.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.baicizhan.app.preferences.a f83069a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.baicizhan.app.biz.auth.r f83070b;

    public b(@k com.baicizhan.app.preferences.a factory, @k com.baicizhan.app.biz.auth.r tokenProvider) {
        g0.p(factory, "factory");
        g0.p(tokenProvider, "tokenProvider");
        this.f83069a = factory;
        this.f83070b = tokenProvider;
    }

    @Override // r5.a
    @l
    public Object a(@k MigrateResourceId migrateResourceId, int i11, @k j00.c<? super g2> cVar) {
        Object f11 = c().f(migrateResourceId.getKey(), i11, cVar);
        return f11 == kotlin.coroutines.intrinsics.b.l() ? f11 : g2.f100423a;
    }

    @Override // r5.a
    @l
    public Object b(@k MigrateResourceId migrateResourceId, @k j00.c<? super Integer> cVar) {
        return c().d(migrateResourceId.getKey(), 0, cVar);
    }

    public final g c() {
        com.baicizhan.app.preferences.a aVar = this.f83069a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("sdk_migrate_scope-");
        Long b11 = this.f83070b.b();
        g0.m(b11);
        sb2.append(b11.longValue());
        return aVar.a(sb2.toString());
    }
}
