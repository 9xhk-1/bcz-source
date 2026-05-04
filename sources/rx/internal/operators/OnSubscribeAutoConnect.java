package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class OnSubscribeAutoConnect<T> extends AtomicInteger implements c.a<T> {
    final wb0.b<? super qb0.h> connection;
    final int numberOfSubscribers;
    final yb0.c<? extends T> source;

    public OnSubscribeAutoConnect(yb0.c<? extends T> cVar, int i11, wb0.b<? super qb0.h> bVar) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("numberOfSubscribers > 0 required");
        }
        this.source = cVar;
        this.numberOfSubscribers = i11;
        this.connection = bVar;
    }

    @Override // wb0.b
    public void call(qb0.g<? super T> gVar) {
        this.source.J6(zb0.h.f(gVar));
        if (incrementAndGet() == this.numberOfSubscribers) {
            this.source.A7(this.connection);
        }
    }
}
