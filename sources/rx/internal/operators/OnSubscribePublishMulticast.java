package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import rx.c;
import rx.exceptions.MissingBackpressureException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class OnSubscribePublishMulticast<T> extends AtomicInteger implements c.a<T>, qb0.c<T>, qb0.h {
    static final b<?>[] EMPTY = new b[0];
    static final b<?>[] TERMINATED = new b[0];
    private static final long serialVersionUID = -3741892510772238743L;
    final boolean delayError;
    volatile boolean done;
    Throwable error;
    final a<T> parent;
    final int prefetch;
    volatile qb0.d producer;
    final Queue<T> queue;
    volatile b<T>[] subscribers;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final OnSubscribePublishMulticast<T> f85037a;

        public a(OnSubscribePublishMulticast<T> onSubscribePublishMulticast) {
            this.f85037a = onSubscribePublishMulticast;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85037a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85037a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f85037a.onNext(t11);
        }

        @Override // qb0.g
        public void setProducer(qb0.d dVar) {
            this.f85037a.setProducer(dVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> extends AtomicLong implements qb0.d, qb0.h {
        private static final long serialVersionUID = 960704844171597367L;

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f85038a;

        /* renamed from: b, reason: collision with root package name */
        public final OnSubscribePublishMulticast<T> f85039b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f85040c = new AtomicBoolean();

        public b(qb0.g<? super T> gVar, OnSubscribePublishMulticast<T> onSubscribePublishMulticast) {
            this.f85038a = gVar;
            this.f85039b = onSubscribePublishMulticast;
        }

        @Override // qb0.h
        public boolean isUnsubscribed() {
            return this.f85040c.get();
        }

        @Override // qb0.d
        public void request(long j11) {
            if (j11 < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j11);
            }
            if (j11 != 0) {
                rx.internal.operators.a.b(this, j11);
                this.f85039b.drain();
            }
        }

        @Override // qb0.h
        public void unsubscribe() {
            if (this.f85040c.compareAndSet(false, true)) {
                this.f85039b.remove(this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnSubscribePublishMulticast(int i11, boolean z11) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("prefetch > 0 required but it was " + i11);
        }
        this.prefetch = i11;
        this.delayError = z11;
        if (rx.internal.util.unsafe.n0.f()) {
            this.queue = new rx.internal.util.unsafe.z(i11);
        } else {
            this.queue = new rx.internal.util.atomic.d(i11);
        }
        this.subscribers = (b<T>[]) EMPTY;
        this.parent = new a<>(this);
    }

    public boolean add(b<T> bVar) {
        b<T>[] bVarArr = this.subscribers;
        b<?>[] bVarArr2 = TERMINATED;
        if (bVarArr == bVarArr2) {
            return false;
        }
        synchronized (this) {
            try {
                b<T>[] bVarArr3 = this.subscribers;
                if (bVarArr3 == bVarArr2) {
                    return false;
                }
                int length = bVarArr3.length;
                b<T>[] bVarArr4 = new b[length + 1];
                System.arraycopy(bVarArr3, 0, bVarArr4, 0, length);
                bVarArr4[length] = bVar;
                this.subscribers = bVarArr4;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean checkTerminated(boolean z11, boolean z12) {
        int i11 = 0;
        if (z11) {
            if (!this.delayError) {
                Throwable th2 = this.error;
                if (th2 != null) {
                    this.queue.clear();
                    b<T>[] terminate = terminate();
                    int length = terminate.length;
                    while (i11 < length) {
                        terminate[i11].f85038a.onError(th2);
                        i11++;
                    }
                    return true;
                }
                if (z12) {
                    b<T>[] terminate2 = terminate();
                    int length2 = terminate2.length;
                    while (i11 < length2) {
                        terminate2[i11].f85038a.onCompleted();
                        i11++;
                    }
                    return true;
                }
            } else if (z12) {
                b<T>[] terminate3 = terminate();
                Throwable th3 = this.error;
                if (th3 != null) {
                    int length3 = terminate3.length;
                    while (i11 < length3) {
                        terminate3[i11].f85038a.onError(th3);
                        i11++;
                    }
                } else {
                    int length4 = terminate3.length;
                    while (i11 < length4) {
                        terminate3[i11].f85038a.onCompleted();
                        i11++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        Queue<T> queue = this.queue;
        int i11 = 0;
        do {
            b<T>[] bVarArr = this.subscribers;
            int length = bVarArr.length;
            long j11 = Long.MAX_VALUE;
            for (b<T> bVar : bVarArr) {
                j11 = Math.min(j11, bVar.get());
            }
            if (length != 0) {
                long j12 = 0;
                while (j12 != j11) {
                    boolean z11 = this.done;
                    T poll = queue.poll();
                    boolean z12 = poll == null;
                    if (checkTerminated(z11, z12)) {
                        return;
                    }
                    if (z12) {
                        break;
                    }
                    for (b<T> bVar2 : bVarArr) {
                        bVar2.f85038a.onNext(poll);
                    }
                    j12++;
                }
                if (j12 == j11 && checkTerminated(this.done, queue.isEmpty())) {
                    return;
                }
                if (j12 != 0) {
                    qb0.d dVar = this.producer;
                    if (dVar != null) {
                        dVar.request(j12);
                    }
                    for (b<T> bVar3 : bVarArr) {
                        rx.internal.operators.a.i(bVar3, j12);
                    }
                }
            }
            i11 = addAndGet(-i11);
        } while (i11 != 0);
    }

    @Override // qb0.h
    public boolean isUnsubscribed() {
        return this.parent.isUnsubscribed();
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
        if (!this.queue.offer(t11)) {
            this.parent.unsubscribe();
            this.error = new MissingBackpressureException("Queue full?!");
            this.done = true;
        }
        drain();
    }

    public void remove(b<T> bVar) {
        b<?>[] bVarArr;
        b[] bVarArr2;
        b<T>[] bVarArr3 = this.subscribers;
        b<?>[] bVarArr4 = TERMINATED;
        if (bVarArr3 == bVarArr4 || bVarArr3 == (bVarArr = EMPTY)) {
            return;
        }
        synchronized (this) {
            try {
                b<T>[] bVarArr5 = this.subscribers;
                if (bVarArr5 != bVarArr4 && bVarArr5 != bVarArr) {
                    int length = bVarArr5.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            i11 = -1;
                            break;
                        } else if (bVarArr5[i11] != bVar) {
                            i11++;
                        }
                    }
                    if (i11 < 0) {
                        return;
                    }
                    if (length == 1) {
                        bVarArr2 = EMPTY;
                    } else {
                        b[] bVarArr6 = new b[length - 1];
                        System.arraycopy(bVarArr5, 0, bVarArr6, 0, i11);
                        System.arraycopy(bVarArr5, i11 + 1, bVarArr6, i11, (length - i11) - 1);
                        bVarArr2 = bVarArr6;
                    }
                    this.subscribers = bVarArr2;
                }
            } finally {
            }
        }
    }

    public void setProducer(qb0.d dVar) {
        this.producer = dVar;
        dVar.request(this.prefetch);
    }

    public qb0.g<T> subscriber() {
        return this.parent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b<T>[] terminate() {
        b<T>[] bVarArr;
        b<T>[] bVarArr2 = this.subscribers;
        b<T>[] bVarArr3 = (b<T>[]) TERMINATED;
        if (bVarArr2 == bVarArr3) {
            return bVarArr2;
        }
        synchronized (this) {
            try {
                bVarArr = this.subscribers;
                if (bVarArr != bVarArr3) {
                    this.subscribers = bVarArr3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVarArr;
    }

    @Override // qb0.h
    public void unsubscribe() {
        this.parent.unsubscribe();
    }

    @Override // wb0.b
    public void call(qb0.g<? super T> gVar) {
        b<T> bVar = new b<>(gVar, this);
        gVar.add(bVar);
        gVar.setProducer(bVar);
        if (add(bVar)) {
            if (bVar.isUnsubscribed()) {
                remove(bVar);
                return;
            } else {
                drain();
                return;
            }
        }
        Throwable th2 = this.error;
        if (th2 != null) {
            gVar.onError(th2);
        } else {
            gVar.onCompleted();
        }
    }
}
