package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.Emitter;
import rx.c;
import rx.exceptions.MissingBackpressureException;
import rx.internal.subscriptions.CancellableSubscription;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class a0<T> implements c.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final wb0.b<Emitter<T>> f85043a;

    /* renamed from: b, reason: collision with root package name */
    public final Emitter.BackpressureMode f85044b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f85045a;

        static {
            int[] iArr = new int[Emitter.BackpressureMode.values().length];
            f85045a = iArr;
            try {
                iArr[Emitter.BackpressureMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f85045a[Emitter.BackpressureMode.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f85045a[Emitter.BackpressureMode.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f85045a[Emitter.BackpressureMode.LATEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<T> extends b<T> {
        private static final long serialVersionUID = 2427151001689639875L;

        /* renamed from: c, reason: collision with root package name */
        public final Queue<Object> f85048c;

        /* renamed from: d, reason: collision with root package name */
        public Throwable f85049d;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f85050e;

        /* renamed from: f, reason: collision with root package name */
        public final AtomicInteger f85051f;

        public c(qb0.g<? super T> gVar, int i11) {
            super(gVar);
            this.f85048c = rx.internal.util.unsafe.n0.f() ? new rx.internal.util.unsafe.h0<>(i11) : new rx.internal.util.atomic.g<>(i11);
            this.f85051f = new AtomicInteger();
        }

        @Override // rx.internal.operators.a0.b
        public void c() {
            e();
        }

        @Override // rx.internal.operators.a0.b
        public void d() {
            if (this.f85051f.getAndIncrement() == 0) {
                this.f85048c.clear();
            }
        }

        public void e() {
            if (this.f85051f.getAndIncrement() != 0) {
                return;
            }
            qb0.g<? super T> gVar = this.f85046a;
            Queue<Object> queue = this.f85048c;
            int i11 = 1;
            do {
                long j11 = get();
                long j12 = 0;
                while (j12 != j11) {
                    if (gVar.isUnsubscribed()) {
                        queue.clear();
                        return;
                    }
                    boolean z11 = this.f85050e;
                    Object poll = queue.poll();
                    boolean z12 = poll == null;
                    if (z11 && z12) {
                        Throwable th2 = this.f85049d;
                        if (th2 != null) {
                            super.onError(th2);
                            return;
                        } else {
                            super.onCompleted();
                            return;
                        }
                    }
                    if (z12) {
                        break;
                    }
                    gVar.onNext((Object) v.e(poll));
                    j12++;
                }
                if (j12 == j11) {
                    if (gVar.isUnsubscribed()) {
                        queue.clear();
                        return;
                    }
                    boolean z13 = this.f85050e;
                    boolean isEmpty = queue.isEmpty();
                    if (z13 && isEmpty) {
                        Throwable th3 = this.f85049d;
                        if (th3 != null) {
                            super.onError(th3);
                            return;
                        } else {
                            super.onCompleted();
                            return;
                        }
                    }
                }
                if (j12 != 0) {
                    rx.internal.operators.a.i(this, j12);
                }
                i11 = this.f85051f.addAndGet(-i11);
            } while (i11 != 0);
        }

        @Override // rx.internal.operators.a0.b, qb0.c
        public void onCompleted() {
            this.f85050e = true;
            e();
        }

        @Override // rx.internal.operators.a0.b, qb0.c
        public void onError(Throwable th2) {
            this.f85049d = th2;
            this.f85050e = true;
            e();
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f85048c.offer(v.j(t11));
            e();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e<T> extends g<T> {
        private static final long serialVersionUID = 338953216916120960L;

        /* renamed from: c, reason: collision with root package name */
        public boolean f85052c;

        public e(qb0.g<? super T> gVar) {
            super(gVar);
        }

        @Override // rx.internal.operators.a0.g
        public void e() {
            onError(new MissingBackpressureException("create: could not emit value due to lack of requests"));
        }

        @Override // rx.internal.operators.a0.b, qb0.c
        public void onCompleted() {
            if (this.f85052c) {
                return;
            }
            this.f85052c = true;
            super.onCompleted();
        }

        @Override // rx.internal.operators.a0.b, qb0.c
        public void onError(Throwable th2) {
            if (this.f85052c) {
                ac0.c.I(th2);
            } else {
                this.f85052c = true;
                super.onError(th2);
            }
        }

        @Override // rx.internal.operators.a0.g, qb0.c
        public void onNext(T t11) {
            if (this.f85052c) {
                return;
            }
            super.onNext(t11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f<T> extends b<T> {
        private static final long serialVersionUID = 4023437720691792495L;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReference<Object> f85053c;

        /* renamed from: d, reason: collision with root package name */
        public Throwable f85054d;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f85055e;

        /* renamed from: f, reason: collision with root package name */
        public final AtomicInteger f85056f;

        public f(qb0.g<? super T> gVar) {
            super(gVar);
            this.f85053c = new AtomicReference<>();
            this.f85056f = new AtomicInteger();
        }

        @Override // rx.internal.operators.a0.b
        public void c() {
            e();
        }

        @Override // rx.internal.operators.a0.b
        public void d() {
            if (this.f85056f.getAndIncrement() == 0) {
                this.f85053c.lazySet(null);
            }
        }

        public void e() {
            if (this.f85056f.getAndIncrement() != 0) {
                return;
            }
            qb0.g<? super T> gVar = this.f85046a;
            AtomicReference<Object> atomicReference = this.f85053c;
            int i11 = 1;
            do {
                long j11 = get();
                long j12 = 0;
                while (true) {
                    if (j12 == j11) {
                        break;
                    }
                    if (gVar.isUnsubscribed()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z11 = this.f85055e;
                    Object andSet = atomicReference.getAndSet(null);
                    boolean z12 = andSet == null;
                    if (z11 && z12) {
                        Throwable th2 = this.f85054d;
                        if (th2 != null) {
                            super.onError(th2);
                            return;
                        } else {
                            super.onCompleted();
                            return;
                        }
                    }
                    if (z12) {
                        break;
                    }
                    gVar.onNext((Object) v.e(andSet));
                    j12++;
                }
                if (j12 == j11) {
                    if (gVar.isUnsubscribed()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z13 = this.f85055e;
                    boolean z14 = atomicReference.get() == null;
                    if (z13 && z14) {
                        Throwable th3 = this.f85054d;
                        if (th3 != null) {
                            super.onError(th3);
                            return;
                        } else {
                            super.onCompleted();
                            return;
                        }
                    }
                }
                if (j12 != 0) {
                    rx.internal.operators.a.i(this, j12);
                }
                i11 = this.f85056f.addAndGet(-i11);
            } while (i11 != 0);
        }

        @Override // rx.internal.operators.a0.b, qb0.c
        public void onCompleted() {
            this.f85055e = true;
            e();
        }

        @Override // rx.internal.operators.a0.b, qb0.c
        public void onError(Throwable th2) {
            this.f85054d = th2;
            this.f85055e = true;
            e();
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f85053c.set(v.j(t11));
            e();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class g<T> extends b<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        public g(qb0.g<? super T> gVar) {
            super(gVar);
        }

        public abstract void e();

        public void onNext(T t11) {
            if (this.f85046a.isUnsubscribed()) {
                return;
            }
            if (get() == 0) {
                e();
            } else {
                this.f85046a.onNext(t11);
                rx.internal.operators.a.i(this, 1L);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h<T> extends b<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        public h(qb0.g<? super T> gVar) {
            super(gVar);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            long j11;
            if (this.f85046a.isUnsubscribed()) {
                return;
            }
            this.f85046a.onNext(t11);
            do {
                j11 = get();
                if (j11 == 0) {
                    return;
                }
            } while (!compareAndSet(j11, j11 - 1));
        }
    }

    public a0(wb0.b<Emitter<T>> bVar, Emitter.BackpressureMode backpressureMode) {
        this.f85043a = bVar;
        this.f85044b = backpressureMode;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super T> gVar) {
        int i11 = a.f85045a[this.f85044b.ordinal()];
        b cVar = i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? new c(gVar, rx.internal.util.j.f86718d) : new f(gVar) : new d(gVar) : new e(gVar) : new h(gVar);
        gVar.add(cVar);
        gVar.setProducer(cVar);
        this.f85043a.call(cVar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b<T> extends AtomicLong implements Emitter<T>, qb0.d, qb0.h {
        private static final long serialVersionUID = 7326289992464377023L;

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f85046a;

        /* renamed from: b, reason: collision with root package name */
        public final ec0.e f85047b = new ec0.e();

        public b(qb0.g<? super T> gVar) {
            this.f85046a = gVar;
        }

        @Override // rx.Emitter
        public final void a(qb0.h hVar) {
            this.f85047b.b(hVar);
        }

        @Override // rx.Emitter
        public final void b(wb0.n nVar) {
            a(new CancellableSubscription(nVar));
        }

        @Override // qb0.h
        public final boolean isUnsubscribed() {
            return this.f85047b.isUnsubscribed();
        }

        @Override // rx.Emitter
        public final long j() {
            return get();
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f85046a.isUnsubscribed()) {
                return;
            }
            try {
                this.f85046a.onCompleted();
            } finally {
                this.f85047b.unsubscribe();
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f85046a.isUnsubscribed()) {
                return;
            }
            try {
                this.f85046a.onError(th2);
            } finally {
                this.f85047b.unsubscribe();
            }
        }

        @Override // qb0.d
        public final void request(long j11) {
            if (rx.internal.operators.a.j(j11)) {
                rx.internal.operators.a.b(this, j11);
                c();
            }
        }

        @Override // qb0.h
        public final void unsubscribe() {
            this.f85047b.unsubscribe();
            d();
        }

        public void c() {
        }

        public void d() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d<T> extends g<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        public d(qb0.g<? super T> gVar) {
            super(gVar);
        }

        @Override // rx.internal.operators.a0.g
        public void e() {
        }
    }
}
