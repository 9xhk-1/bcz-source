package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import rx.c;
import rx.d;
import rx.internal.subscriptions.SequentialSubscription;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class g1<T> implements c.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<T> f85367a;

    /* renamed from: b, reason: collision with root package name */
    public final long f85368b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f85369c;

    /* renamed from: d, reason: collision with root package name */
    public final rx.d f85370d;

    /* renamed from: e, reason: collision with root package name */
    public final rx.c<? extends T> f85371e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f85372a;

        /* renamed from: b, reason: collision with root package name */
        public final rx.internal.producers.a f85373b;

        public a(qb0.g<? super T> gVar, rx.internal.producers.a aVar) {
            this.f85372a = gVar;
            this.f85373b = aVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85372a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85372a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f85372a.onNext(t11);
        }

        @Override // qb0.g
        public void setProducer(qb0.d dVar) {
            this.f85373b.c(dVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f85374a;

        /* renamed from: b, reason: collision with root package name */
        public final long f85375b;

        /* renamed from: c, reason: collision with root package name */
        public final TimeUnit f85376c;

        /* renamed from: d, reason: collision with root package name */
        public final d.a f85377d;

        /* renamed from: e, reason: collision with root package name */
        public final rx.c<? extends T> f85378e;

        /* renamed from: f, reason: collision with root package name */
        public final rx.internal.producers.a f85379f = new rx.internal.producers.a();

        /* renamed from: g, reason: collision with root package name */
        public final AtomicLong f85380g = new AtomicLong();

        /* renamed from: h, reason: collision with root package name */
        public final SequentialSubscription f85381h;

        /* renamed from: i, reason: collision with root package name */
        public final SequentialSubscription f85382i;

        /* renamed from: j, reason: collision with root package name */
        public long f85383j;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public final class a implements wb0.a {

            /* renamed from: a, reason: collision with root package name */
            public final long f85384a;

            public a(long j11) {
                this.f85384a = j11;
            }

            @Override // wb0.a
            public void call() {
                b.this.q(this.f85384a);
            }
        }

        public b(qb0.g<? super T> gVar, long j11, TimeUnit timeUnit, d.a aVar, rx.c<? extends T> cVar) {
            this.f85374a = gVar;
            this.f85375b = j11;
            this.f85376c = timeUnit;
            this.f85377d = aVar;
            this.f85378e = cVar;
            SequentialSubscription sequentialSubscription = new SequentialSubscription();
            this.f85381h = sequentialSubscription;
            this.f85382i = new SequentialSubscription(this);
            add(aVar);
            add(sequentialSubscription);
        }

        public void C(long j11) {
            this.f85381h.replace(this.f85377d.j(new a(j11), this.f85375b, this.f85376c));
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f85380g.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f85381h.unsubscribe();
                this.f85374a.onCompleted();
                this.f85377d.unsubscribe();
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f85380g.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                ac0.c.I(th2);
                return;
            }
            this.f85381h.unsubscribe();
            this.f85374a.onError(th2);
            this.f85377d.unsubscribe();
        }

        @Override // qb0.c
        public void onNext(T t11) {
            long j11 = this.f85380g.get();
            if (j11 != Long.MAX_VALUE) {
                long j12 = j11 + 1;
                if (this.f85380g.compareAndSet(j11, j12)) {
                    qb0.h hVar = this.f85381h.get();
                    if (hVar != null) {
                        hVar.unsubscribe();
                    }
                    this.f85383j++;
                    this.f85374a.onNext(t11);
                    C(j12);
                }
            }
        }

        public void q(long j11) {
            if (this.f85380g.compareAndSet(j11, Long.MAX_VALUE)) {
                unsubscribe();
                if (this.f85378e == null) {
                    this.f85374a.onError(new TimeoutException());
                    return;
                }
                long j12 = this.f85383j;
                if (j12 != 0) {
                    this.f85379f.b(j12);
                }
                a aVar = new a(this.f85374a, this.f85379f);
                if (this.f85382i.replace(aVar)) {
                    this.f85378e.r5(aVar);
                }
            }
        }

        @Override // qb0.g
        public void setProducer(qb0.d dVar) {
            this.f85379f.c(dVar);
        }
    }

    public g1(rx.c<T> cVar, long j11, TimeUnit timeUnit, rx.d dVar, rx.c<? extends T> cVar2) {
        this.f85367a = cVar;
        this.f85368b = j11;
        this.f85369c = timeUnit;
        this.f85370d = dVar;
        this.f85371e = cVar2;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super T> gVar) {
        b bVar = new b(gVar, this.f85368b, this.f85369c, this.f85370d.a(), this.f85371e);
        gVar.add(bVar.f85382i);
        gVar.setProducer(bVar.f85379f);
        bVar.C(0L);
        this.f85367a.r5(bVar);
    }
}
