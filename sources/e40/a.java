package e40;

import c40.l2;
import c40.o0;
import c40.t1;
import c40.u0;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class a<E> extends p<E> implements c<E> {
    public a(@m80.k kotlin.coroutines.d dVar, @m80.k o<E> oVar, boolean z11) {
        super(dVar, oVar, false, z11);
        m1((l2) dVar.get(l2.f7886e0));
    }

    @Override // c40.r2
    public void E1(@m80.l Throwable th2) {
        o<E> e22 = e2();
        if (th2 != null) {
            r1 = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            if (r1 == null) {
                r1 = t1.a(u0.a(this) + " was cancelled", th2);
            }
        }
        e22.cancel(r1);
    }

    @Override // c40.r2
    public boolean k1(@m80.k Throwable th2) {
        o0.b(getContext(), th2);
        return true;
    }
}
