package l5;

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
    public final com.baicizhan.app.preferences.a f69908a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.baicizhan.app.biz.auth.r f69909b;

    public a(@k com.baicizhan.app.preferences.a factory, @k com.baicizhan.app.biz.auth.r tokenProvider) {
        g0.p(factory, "factory");
        g0.p(tokenProvider, "tokenProvider");
        this.f69908a = factory;
        this.f69909b = tokenProvider;
    }

    @Override // l5.c
    @l
    public Object a(long j11, @k j00.c<? super Integer> cVar) {
        return c().d(b.f69911b + j11, -1, cVar);
    }

    @Override // l5.c
    @l
    public Object b(long j11, int i11, @k j00.c<? super g2> cVar) {
        Object f11 = c().f(b.f69911b + j11, i11, cVar);
        return f11 == kotlin.coroutines.intrinsics.b.l() ? f11 : g2.f100423a;
    }

    public final g c() {
        com.baicizhan.app.preferences.a aVar = this.f69908a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("cake_study_scope-");
        Long b11 = this.f69909b.b();
        g0.m(b11);
        sb2.append(b11.longValue());
        return aVar.a(sb2.toString());
    }
}
