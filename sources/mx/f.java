package mx;

import ix.g1;
import mx.v;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f extends v.f {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.p<io.ktor.utils.io.m, j00.c<? super g2>, Object> f73784b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final ix.k f73785c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final g1 f73786d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final Long f73787e;

    public /* synthetic */ f(x00.p pVar, ix.k kVar, g1 g1Var, Long l11, int i11, kotlin.jvm.internal.v vVar) {
        this(pVar, kVar, (i11 & 4) != 0 ? null : g1Var, (i11 & 8) != 0 ? null : l11);
    }

    @Override // mx.v
    @m80.l
    public Long a() {
        return this.f73787e;
    }

    @Override // mx.v
    @m80.l
    public ix.k b() {
        return this.f73785c;
    }

    @Override // mx.v
    @m80.l
    public g1 h() {
        return this.f73786d;
    }

    @Override // mx.v.f
    @m80.l
    public Object m(@m80.k io.ktor.utils.io.m mVar, @m80.k j00.c<? super g2> cVar) {
        Object invoke = this.f73784b.invoke(mVar, cVar);
        return invoke == kotlin.coroutines.intrinsics.b.l() ? invoke : g2.f100423a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@m80.k x00.p<? super io.ktor.utils.io.m, ? super j00.c<? super g2>, ? extends Object> body, @m80.l ix.k kVar, @m80.l g1 g1Var, @m80.l Long l11) {
        kotlin.jvm.internal.g0.p(body, "body");
        this.f73784b = body;
        this.f73785c = kVar;
        this.f73786d = g1Var;
        this.f73787e = l11;
    }
}
