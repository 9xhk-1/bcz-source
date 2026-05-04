package rx.internal.operators;

import rx.c;
import rx.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class j3<T> implements c.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.d f85601a;

    /* renamed from: b, reason: collision with root package name */
    public final rx.c<T> f85602b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f85603c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends qb0.g<T> implements wb0.a {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f85604a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f85605b;

        /* renamed from: c, reason: collision with root package name */
        public final d.a f85606c;

        /* renamed from: d, reason: collision with root package name */
        public rx.c<T> f85607d;

        /* renamed from: e, reason: collision with root package name */
        public Thread f85608e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.operators.j3$a$a, reason: collision with other inner class name */
        public class C1088a implements qb0.d {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ qb0.d f85609a;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: rx.internal.operators.j3$a$a$a, reason: collision with other inner class name */
            public class C1089a implements wb0.a {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ long f85611a;

                public C1089a(long j11) {
                    this.f85611a = j11;
                }

                @Override // wb0.a
                public void call() {
                    C1088a.this.f85609a.request(this.f85611a);
                }
            }

            public C1088a(qb0.d dVar) {
                this.f85609a = dVar;
            }

            @Override // qb0.d
            public void request(long j11) {
                if (a.this.f85608e != Thread.currentThread()) {
                    a aVar = a.this;
                    if (aVar.f85605b) {
                        aVar.f85606c.h(new C1089a(j11));
                        return;
                    }
                }
                this.f85609a.request(j11);
            }
        }

        public a(qb0.g<? super T> gVar, boolean z11, d.a aVar, rx.c<T> cVar) {
            this.f85604a = gVar;
            this.f85605b = z11;
            this.f85606c = aVar;
            this.f85607d = cVar;
        }

        @Override // wb0.a
        public void call() {
            rx.c<T> cVar = this.f85607d;
            this.f85607d = null;
            this.f85608e = Thread.currentThread();
            cVar.J6(this);
        }

        @Override // qb0.c
        public void onCompleted() {
            try {
                this.f85604a.onCompleted();
            } finally {
                this.f85606c.unsubscribe();
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            try {
                this.f85604a.onError(th2);
            } finally {
                this.f85606c.unsubscribe();
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f85604a.onNext(t11);
        }

        @Override // qb0.g
        public void setProducer(qb0.d dVar) {
            this.f85604a.setProducer(new C1088a(dVar));
        }
    }

    public j3(rx.c<T> cVar, rx.d dVar, boolean z11) {
        this.f85601a = dVar;
        this.f85602b = cVar;
        this.f85603c = z11;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super T> gVar) {
        d.a a11 = this.f85601a.a();
        a aVar = new a(gVar, this.f85603c, a11, this.f85602b);
        gVar.add(aVar);
        gVar.add(a11);
        a11.h(aVar);
    }
}
