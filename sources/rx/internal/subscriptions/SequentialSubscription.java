package rx.internal.subscriptions;

import ec0.f;
import java.util.concurrent.atomic.AtomicReference;
import qb0.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class SequentialSubscription extends AtomicReference<h> implements h {
    private static final long serialVersionUID = 995205034283130269L;

    public SequentialSubscription() {
    }

    public h current() {
        h hVar = (h) super.get();
        return hVar == Unsubscribed.INSTANCE ? f.e() : hVar;
    }

    @Override // qb0.h
    public boolean isUnsubscribed() {
        return get() == Unsubscribed.INSTANCE;
    }

    public boolean replace(h hVar) {
        h hVar2;
        do {
            hVar2 = get();
            if (hVar2 == Unsubscribed.INSTANCE) {
                if (hVar == null) {
                    return false;
                }
                hVar.unsubscribe();
                return false;
            }
        } while (!compareAndSet(hVar2, hVar));
        return true;
    }

    public boolean replaceWeak(h hVar) {
        h hVar2 = get();
        Unsubscribed unsubscribed = Unsubscribed.INSTANCE;
        if (hVar2 == unsubscribed) {
            if (hVar != null) {
                hVar.unsubscribe();
            }
            return false;
        }
        if (compareAndSet(hVar2, hVar) || get() != unsubscribed) {
            return true;
        }
        if (hVar != null) {
            hVar.unsubscribe();
        }
        return false;
    }

    @Override // qb0.h
    public void unsubscribe() {
        h andSet;
        h hVar = get();
        Unsubscribed unsubscribed = Unsubscribed.INSTANCE;
        if (hVar == unsubscribed || (andSet = getAndSet(unsubscribed)) == null || andSet == unsubscribed) {
            return;
        }
        andSet.unsubscribe();
    }

    public boolean update(h hVar) {
        h hVar2;
        do {
            hVar2 = get();
            if (hVar2 == Unsubscribed.INSTANCE) {
                if (hVar == null) {
                    return false;
                }
                hVar.unsubscribe();
                return false;
            }
        } while (!compareAndSet(hVar2, hVar));
        if (hVar2 == null) {
            return true;
        }
        hVar2.unsubscribe();
        return true;
    }

    public boolean updateWeak(h hVar) {
        h hVar2 = get();
        Unsubscribed unsubscribed = Unsubscribed.INSTANCE;
        if (hVar2 == unsubscribed) {
            if (hVar != null) {
                hVar.unsubscribe();
            }
            return false;
        }
        if (compareAndSet(hVar2, hVar)) {
            return true;
        }
        h hVar3 = get();
        if (hVar != null) {
            hVar.unsubscribe();
        }
        return hVar3 == unsubscribed;
    }

    public SequentialSubscription(h hVar) {
        lazySet(hVar);
    }
}
