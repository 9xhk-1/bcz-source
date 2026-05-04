package rx.internal.producers;

import java.util.concurrent.atomic.AtomicInteger;
import qb0.d;
import qb0.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class SingleDelayedProducer<T> extends AtomicInteger implements d {
    static final int HAS_REQUEST_HAS_VALUE = 3;
    static final int HAS_REQUEST_NO_VALUE = 2;
    static final int NO_REQUEST_HAS_VALUE = 1;
    static final int NO_REQUEST_NO_VALUE = 0;
    private static final long serialVersionUID = -2873467947112093874L;
    final g<? super T> child;
    T value;

    public SingleDelayedProducer(g<? super T> gVar) {
        this.child = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void emit(g<? super T> gVar, T t11) {
        if (gVar.isUnsubscribed()) {
            return;
        }
        try {
            gVar.onNext(t11);
            if (gVar.isUnsubscribed()) {
                return;
            }
            gVar.onCompleted();
        } catch (Throwable th2) {
            vb0.a.g(th2, gVar, t11);
        }
    }

    @Override // qb0.d
    public void request(long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j11 == 0) {
            return;
        }
        do {
            int i11 = get();
            if (i11 != 0) {
                if (i11 == 1 && compareAndSet(1, 3)) {
                    emit(this.child, this.value);
                    return;
                }
                return;
            }
        } while (!compareAndSet(0, 2));
    }

    public void setValue(T t11) {
        do {
            int i11 = get();
            if (i11 != 0) {
                if (i11 == 2 && compareAndSet(2, 3)) {
                    emit(this.child, t11);
                    return;
                }
                return;
            }
            this.value = t11;
        } while (!compareAndSet(0, 1));
    }
}
