package n7;

import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.c(binds = {j7.a.class})
/* loaded from: classes3.dex */
public final class d implements j7.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f74609a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f74610b;

    public d(@k g repo) {
        g0.p(repo, "repo");
        this.f74609a = repo;
        this.f74610b = "check_info_task";
    }

    @Override // j7.a
    @l
    public Object a(@k j00.c<? super g2> cVar) {
        Object b11 = this.f74609a.b(cVar);
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
    }

    @Override // j7.a
    @k
    public String getKey() {
        return this.f74610b;
    }
}
