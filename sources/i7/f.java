package i7;

import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.c(binds = {a.class})
@oa0.j(c.f60214b)
/* loaded from: classes3.dex */
public final class f implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final n7.e f60221b;

    public f(@k n7.e basicInfoRepo) {
        g0.p(basicInfoRepo, "basicInfoRepo");
        this.f60221b = basicInfoRepo;
    }

    @Override // i7.a
    @l
    public Object a(@k j00.c<? super g2> cVar) {
        z6.b.j(z6.b.f101032b, h.f60242a, "SynNormal", null, 4, null);
        Object u22 = this.f60221b.u2(true, cVar);
        return u22 == kotlin.coroutines.intrinsics.b.l() ? u22 : g2.f100423a;
    }
}
