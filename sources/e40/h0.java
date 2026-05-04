package e40;

import c40.o0;
import e40.l0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h0<E> extends p<E> implements i0<E> {
    public h0(@m80.k kotlin.coroutines.d dVar, @m80.k o<E> oVar) {
        super(dVar, oVar, true, true);
    }

    @Override // c40.a
    public void b2(@m80.k Throwable th2, boolean z11) {
        if (e2().z(th2) || z11) {
            return;
        }
        o0.b(getContext(), th2);
    }

    @Override // c40.a
    /* renamed from: f2, reason: merged with bridge method [inline-methods] */
    public void c2(@m80.k g2 g2Var) {
        l0.a.a(e2(), null, 1, null);
    }

    @Override // e40.i0
    public /* bridge */ /* synthetic */ l0 getChannel() {
        return getChannel();
    }

    @Override // c40.a, c40.r2, c40.l2
    public boolean isActive() {
        return super.isActive();
    }
}
