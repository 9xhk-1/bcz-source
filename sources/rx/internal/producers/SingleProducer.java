package rx.internal.producers;

import java.util.concurrent.atomic.AtomicBoolean;
import qb0.d;
import qb0.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class SingleProducer<T> extends AtomicBoolean implements d {
    private static final long serialVersionUID = -3353584923995471404L;
    final g<? super T> child;
    final T value;

    public SingleProducer(g<? super T> gVar, T t11) {
        this.child = gVar;
        this.value = t11;
    }

    @Override // qb0.d
    public void request(long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j11 != 0 && compareAndSet(false, true)) {
            g<? super T> gVar = this.child;
            if (gVar.isUnsubscribed()) {
                return;
            }
            T t11 = this.value;
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
    }
}
