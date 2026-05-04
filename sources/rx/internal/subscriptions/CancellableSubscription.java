package rx.internal.subscriptions;

import ac0.c;
import java.util.concurrent.atomic.AtomicReference;
import qb0.h;
import vb0.a;
import wb0.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class CancellableSubscription extends AtomicReference<n> implements h {
    private static final long serialVersionUID = 5718521705281392066L;

    public CancellableSubscription(n nVar) {
        super(nVar);
    }

    @Override // qb0.h
    public boolean isUnsubscribed() {
        return get() == null;
    }

    @Override // qb0.h
    public void unsubscribe() {
        n andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.cancel();
        } catch (Exception e11) {
            a.e(e11);
            c.I(e11);
        }
    }
}
