package rx.internal.producers;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import qb0.d;
import qb0.g;
import rx.internal.util.atomic.f;
import rx.internal.util.unsafe.g0;
import rx.internal.util.unsafe.n0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class QueuedValueProducer<T> extends AtomicLong implements d {
    static final Object NULL_SENTINEL = new Object();
    private static final long serialVersionUID = 7277121710709137047L;
    final g<? super T> child;
    final Queue<Object> queue;
    final AtomicInteger wip;

    public QueuedValueProducer(g<? super T> gVar) {
        this(gVar, n0.f() ? new g0() : new f());
    }

    private void drain() {
        Object poll;
        if (this.wip.getAndIncrement() == 0) {
            g<? super T> gVar = this.child;
            Queue<Object> queue = this.queue;
            while (!gVar.isUnsubscribed()) {
                this.wip.lazySet(1);
                long j11 = get();
                long j12 = 0;
                while (j11 != 0 && (poll = queue.poll()) != null) {
                    try {
                        if (poll == NULL_SENTINEL) {
                            gVar.onNext(null);
                        } else {
                            gVar.onNext(poll);
                        }
                        if (gVar.isUnsubscribed()) {
                            return;
                        }
                        j11--;
                        j12++;
                    } catch (Throwable th2) {
                        if (poll == NULL_SENTINEL) {
                            poll = null;
                        }
                        vb0.a.g(th2, gVar, poll);
                        return;
                    }
                }
                if (j12 != 0 && get() != Long.MAX_VALUE) {
                    addAndGet(-j12);
                }
                if (this.wip.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public boolean offer(T t11) {
        if (t11 == null) {
            if (!this.queue.offer(NULL_SENTINEL)) {
                return false;
            }
        } else if (!this.queue.offer(t11)) {
            return false;
        }
        drain();
        return true;
    }

    @Override // qb0.d
    public void request(long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        }
        if (j11 > 0) {
            rx.internal.operators.a.b(this, j11);
            drain();
        }
    }

    public QueuedValueProducer(g<? super T> gVar, Queue<Object> queue) {
        this.child = gVar;
        this.queue = queue;
        this.wip = new AtomicInteger();
    }
}
