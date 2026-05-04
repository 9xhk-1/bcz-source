package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class c1<T> implements c.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<? extends T> f85178a;

    /* renamed from: b, reason: collision with root package name */
    public final rx.c<? extends T> f85179b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final rx.internal.producers.a f85180a;

        /* renamed from: b, reason: collision with root package name */
        public final qb0.g<? super T> f85181b;

        public a(qb0.g<? super T> gVar, rx.internal.producers.a aVar) {
            this.f85181b = gVar;
            this.f85180a = aVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85181b.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85181b.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f85181b.onNext(t11);
            this.f85180a.b(1L);
        }

        @Override // qb0.g
        public void setProducer(qb0.d dVar) {
            this.f85180a.c(dVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> extends qb0.g<T> {

        /* renamed from: b, reason: collision with root package name */
        public final qb0.g<? super T> f85183b;

        /* renamed from: c, reason: collision with root package name */
        public final ec0.e f85184c;

        /* renamed from: d, reason: collision with root package name */
        public final rx.internal.producers.a f85185d;

        /* renamed from: e, reason: collision with root package name */
        public final rx.c<? extends T> f85186e;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f85188g;

        /* renamed from: a, reason: collision with root package name */
        public boolean f85182a = true;

        /* renamed from: f, reason: collision with root package name */
        public final AtomicInteger f85187f = new AtomicInteger();

        public b(qb0.g<? super T> gVar, ec0.e eVar, rx.internal.producers.a aVar, rx.c<? extends T> cVar) {
            this.f85183b = gVar;
            this.f85184c = eVar;
            this.f85185d = aVar;
            this.f85186e = cVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            if (!this.f85182a) {
                this.f85183b.onCompleted();
            } else {
                if (this.f85183b.isUnsubscribed()) {
                    return;
                }
                this.f85188g = false;
                q(null);
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85183b.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f85182a = false;
            this.f85183b.onNext(t11);
            this.f85185d.b(1L);
        }

        public void q(rx.c<? extends T> cVar) {
            if (this.f85187f.getAndIncrement() == 0) {
                while (!this.f85183b.isUnsubscribed()) {
                    if (!this.f85188g) {
                        if (cVar == null) {
                            a aVar = new a(this.f85183b, this.f85185d);
                            this.f85184c.b(aVar);
                            this.f85188g = true;
                            this.f85186e.J6(aVar);
                        } else {
                            this.f85188g = true;
                            cVar.J6(this);
                            cVar = null;
                        }
                    }
                    if (this.f85187f.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // qb0.g
        public void setProducer(qb0.d dVar) {
            this.f85185d.c(dVar);
        }
    }

    public c1(rx.c<? extends T> cVar, rx.c<? extends T> cVar2) {
        this.f85178a = cVar;
        this.f85179b = cVar2;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super T> gVar) {
        ec0.e eVar = new ec0.e();
        rx.internal.producers.a aVar = new rx.internal.producers.a();
        b bVar = new b(gVar, eVar, aVar, this.f85179b);
        eVar.b(bVar);
        gVar.add(eVar);
        gVar.setProducer(aVar);
        bVar.q(this.f85178a);
    }
}
