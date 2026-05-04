package e40;

import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e0<E> extends g<E> {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final j00.c<g2> f49040e;

    public e0(@m80.k kotlin.coroutines.d dVar, @m80.k d<E> dVar2, @m80.k x00.p<? super i0<? super E>, ? super j00.c<? super g2>, ? extends Object> pVar) {
        super(dVar, dVar2, false);
        this.f49040e = IntrinsicsKt__IntrinsicsJvmKt.c(pVar, this, this);
    }

    @Override // c40.r2
    public void G1() {
        i40.a.c(this.f49040e, this);
    }

    @Override // e40.g, e40.d
    @m80.k
    public k0<E> h() {
        k0<E> h11 = e2().h();
        start();
        return h11;
    }
}
