package h40;

import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class b0 extends d0 {
    public final void B(@m80.k x00.l<? super d0, g2> lVar) {
        Object j11 = j();
        kotlin.jvm.internal.g0.n(j11, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        for (d0 d0Var = (d0) j11; !kotlin.jvm.internal.g0.g(d0Var, this); d0Var = d0Var.k()) {
            lVar.invoke(d0Var);
        }
    }

    @m80.k
    public final Void C() {
        throw new IllegalStateException("head cannot be removed");
    }

    @Override // h40.d0
    public boolean s() {
        return false;
    }

    @Override // h40.d0
    public /* bridge */ /* synthetic */ boolean u() {
        return ((Boolean) C()).booleanValue();
    }
}
