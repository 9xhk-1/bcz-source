package n6;

import h5.m0;
import kotlin.jvm.internal.g0;
import oa0.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final y5.a f74521a;

    public k(@m80.k y5.a settingRepo) {
        g0.p(settingRepo, "settingRepo");
        this.f74521a = settingRepo;
    }

    @m80.l
    public final <T> Object a(@m80.k m0<T> m0Var, T t11, @m80.k j00.c<? super g2> cVar) {
        Object b11 = this.f74521a.b(m0Var.getKey(), m0Var.a(t11), cVar);
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
    }
}
