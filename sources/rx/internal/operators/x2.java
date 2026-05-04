package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import rx.c;
import rx.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class x2<T> implements c.b<T, rx.c<T>> {

    /* renamed from: a, reason: collision with root package name */
    public final wb0.q<Integer, Throwable, Boolean> f86352a;

    public x2(wb0.q<Integer, Throwable, Boolean> qVar) {
        this.f86352a = qVar;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super rx.c<T>> call(qb0.g<? super T> gVar) {
        d.a a11 = bc0.c.m().a();
        gVar.add(a11);
        ec0.e eVar = new ec0.e();
        gVar.add(eVar);
        rx.internal.producers.a aVar = new rx.internal.producers.a();
        gVar.setProducer(aVar);
        return new a(gVar, this.f86352a, a11, eVar, aVar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends qb0.g<rx.c<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f86353a;

        /* renamed from: b, reason: collision with root package name */
        public final wb0.q<Integer, Throwable, Boolean> f86354b;

        /* renamed from: c, reason: collision with root package name */
        public final d.a f86355c;

        /* renamed from: d, reason: collision with root package name */
        public final ec0.e f86356d;

        /* renamed from: e, reason: collision with root package name */
        public final rx.internal.producers.a f86357e;

        /* renamed from: f, reason: collision with root package name */
        public final AtomicInteger f86358f = new AtomicInteger();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.operators.x2$a$a, reason: collision with other inner class name */
        public class C1106a implements wb0.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ rx.c f86359a;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: rx.internal.operators.x2$a$a$a, reason: collision with other inner class name */
            public class C1107a extends qb0.g<T> {

                /* renamed from: a, reason: collision with root package name */
                public boolean f86361a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ wb0.a f86362b;

                public C1107a(wb0.a aVar) {
                    this.f86362b = aVar;
                }

                @Override // qb0.c
                public void onCompleted() {
                    if (this.f86361a) {
                        return;
                    }
                    this.f86361a = true;
                    a.this.f86353a.onCompleted();
                }

                @Override // qb0.c
                public void onError(Throwable th2) {
                    if (this.f86361a) {
                        return;
                    }
                    this.f86361a = true;
                    a aVar = a.this;
                    if (!aVar.f86354b.call(Integer.valueOf(aVar.f86358f.get()), th2).booleanValue() || a.this.f86355c.isUnsubscribed()) {
                        a.this.f86353a.onError(th2);
                    } else {
                        a.this.f86355c.h(this.f86362b);
                    }
                }

                @Override // qb0.c
                public void onNext(T t11) {
                    if (this.f86361a) {
                        return;
                    }
                    a.this.f86353a.onNext(t11);
                    a.this.f86357e.b(1L);
                }

                @Override // qb0.g
                public void setProducer(qb0.d dVar) {
                    a.this.f86357e.c(dVar);
                }
            }

            public C1106a(rx.c cVar) {
                this.f86359a = cVar;
            }

            @Override // wb0.a
            public void call() {
                a.this.f86358f.incrementAndGet();
                C1107a c1107a = new C1107a(this);
                a.this.f86356d.b(c1107a);
                this.f86359a.J6(c1107a);
            }
        }

        public a(qb0.g<? super T> gVar, wb0.q<Integer, Throwable, Boolean> qVar, d.a aVar, ec0.e eVar, rx.internal.producers.a aVar2) {
            this.f86353a = gVar;
            this.f86354b = qVar;
            this.f86355c = aVar;
            this.f86356d = eVar;
            this.f86357e = aVar2;
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f86353a.onError(th2);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(rx.c<T> cVar) {
            this.f86355c.h(new C1106a(cVar));
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }
}
