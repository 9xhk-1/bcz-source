package n5;

import com.baicizhan.app.preferences.g;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import oa0.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {c.class})
/* loaded from: classes3.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.baicizhan.app.preferences.a f74467a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.baicizhan.app.biz.auth.r f74468b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final k50.a f74469c;

    public a(@k com.baicizhan.app.preferences.a factory, @k com.baicizhan.app.biz.auth.r tokenProvider, @k k50.a json) {
        g0.p(factory, "factory");
        g0.p(tokenProvider, "tokenProvider");
        g0.p(json, "json");
        this.f74467a = factory;
        this.f74468b = tokenProvider;
        this.f74469c = json;
    }

    @Override // n5.c
    @l
    public Object a(@k j00.c<? super Long> cVar) {
        return c().h(b.f74471b, 0L, cVar);
    }

    @Override // n5.c
    @l
    public Object b(long j11, @k j00.c<? super g2> cVar) {
        Object i11 = c().i(b.f74471b, j11, cVar);
        return i11 == kotlin.coroutines.intrinsics.b.l() ? i11 : g2.f100423a;
    }

    public final g c() {
        com.baicizhan.app.preferences.a aVar = this.f74467a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("recharge_scope-");
        Long b11 = this.f74468b.b();
        g0.m(b11);
        sb2.append(b11.longValue());
        return aVar.a(sb2.toString());
    }
}
