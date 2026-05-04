package rx.internal.producers;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import qb0.c;
import qb0.d;
import qb0.g;
import rx.exceptions.MissingBackpressureException;
import rx.internal.util.atomic.f;
import rx.internal.util.unsafe.g0;
import rx.internal.util.unsafe.n0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class QueuedProducer<T> extends AtomicLong implements d, c<T> {
    static final Object NULL_SENTINEL = new Object();
    private static final long serialVersionUID = 7277121710709137047L;
    final g<? super T> child;
    volatile boolean done;
    Throwable error;
    final Queue<Object> queue;
    final AtomicInteger wip;

    public QueuedProducer(g<? super T> gVar) {
        this(gVar, n0.f() ? new g0() : new f());
    }

    private boolean checkTerminated(boolean z11, boolean z12) {
        if (this.child.isUnsubscribed()) {
            return true;
        }
        if (!z11) {
            return false;
        }
        Throwable th2 = this.error;
        if (th2 != null) {
            this.queue.clear();
            this.child.onError(th2);
            return true;
        }
        if (!z12) {
            return false;
        }
        this.child.onCompleted();
        return true;
    }

    private void drain() {
        if (this.wip.getAndIncrement() == 0) {
            g<? super T> gVar = this.child;
            Queue<Object> queue = this.queue;
            while (!checkTerminated(this.done, queue.isEmpty())) {
                this.wip.lazySet(1);
                long j11 = get();
                long j12 = 0;
                while (j11 != 0) {
                    boolean z11 = this.done;
                    Object poll = queue.poll();
                    if (checkTerminated(z11, poll == null)) {
                        return;
                    }
                    if (poll == null) {
                        break;
                    }
                    try {
                        if (poll == NULL_SENTINEL) {
                            gVar.onNext(null);
                        } else {
                            gVar.onNext(poll);
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

    @Override // qb0.c
    public void onCompleted() {
        this.done = true;
        drain();
    }

    @Override // qb0.c
    public void onError(Throwable th2) {
        this.error = th2;
        this.done = true;
        drain();
    }

    @Override // qb0.c
    public void onNext(T t11) {
        if (offer(t11)) {
            return;
        }
        onError(new MissingBackpressureException());
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

    public QueuedProducer(g<? super T> gVar, Queue<Object> queue) {
        this.child = gVar;
        this.queue = queue;
        this.wip = new AtomicInteger();
    }
}
