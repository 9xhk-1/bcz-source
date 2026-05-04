package rx.internal.schedulers;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.b;
import rx.d;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class k extends rx.d implements qb0.h {

    /* renamed from: d, reason: collision with root package name */
    public static final qb0.h f86607d = new c();

    /* renamed from: e, reason: collision with root package name */
    public static final qb0.h f86608e = ec0.f.e();

    /* renamed from: a, reason: collision with root package name */
    public final rx.d f86609a;

    /* renamed from: b, reason: collision with root package name */
    public final qb0.c<rx.c<rx.b>> f86610b;

    /* renamed from: c, reason: collision with root package name */
    public final qb0.h f86611c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements p<g, rx.b> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d.a f86612a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.schedulers.k$a$a, reason: collision with other inner class name */
        public class C1118a implements b.j0 {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g f86614a;

            public C1118a(g gVar) {
                this.f86614a = gVar;
            }

            @Override // wb0.b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(qb0.b bVar) {
                bVar.a(this.f86614a);
                this.f86614a.b(a.this.f86612a, bVar);
            }
        }

        public a(d.a aVar) {
            this.f86612a = aVar;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.b call(g gVar) {
            return rx.b.p(new C1118a(gVar));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f86616a = new AtomicBoolean();

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d.a f86617b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ qb0.c f86618c;

        public b(d.a aVar, qb0.c cVar) {
            this.f86617b = aVar;
            this.f86618c = cVar;
        }

        @Override // rx.d.a
        public qb0.h h(wb0.a aVar) {
            e eVar = new e(aVar);
            this.f86618c.onNext(eVar);
            return eVar;
        }

        @Override // qb0.h
        public boolean isUnsubscribed() {
            return this.f86616a.get();
        }

        @Override // rx.d.a
        public qb0.h j(wb0.a aVar, long j11, TimeUnit timeUnit) {
            d dVar = new d(aVar, j11, timeUnit);
            this.f86618c.onNext(dVar);
            return dVar;
        }

        @Override // qb0.h
        public void unsubscribe() {
            if (this.f86616a.compareAndSet(false, true)) {
                this.f86617b.unsubscribe();
                this.f86618c.onCompleted();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d extends g {

        /* renamed from: a, reason: collision with root package name */
        public final wb0.a f86620a;

        /* renamed from: b, reason: collision with root package name */
        public final long f86621b;

        /* renamed from: c, reason: collision with root package name */
        public final TimeUnit f86622c;

        public d(wb0.a aVar, long j11, TimeUnit timeUnit) {
            this.f86620a = aVar;
            this.f86621b = j11;
            this.f86622c = timeUnit;
        }

        @Override // rx.internal.schedulers.k.g
        public qb0.h c(d.a aVar, qb0.b bVar) {
            return aVar.j(new f(this.f86620a, bVar), this.f86621b, this.f86622c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e extends g {

        /* renamed from: a, reason: collision with root package name */
        public final wb0.a f86623a;

        public e(wb0.a aVar) {
            this.f86623a = aVar;
        }

        @Override // rx.internal.schedulers.k.g
        public qb0.h c(d.a aVar, qb0.b bVar) {
            return aVar.h(new f(this.f86623a, bVar));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f implements wb0.a {

        /* renamed from: a, reason: collision with root package name */
        public qb0.b f86624a;

        /* renamed from: b, reason: collision with root package name */
        public wb0.a f86625b;

        public f(wb0.a aVar, qb0.b bVar) {
            this.f86625b = aVar;
            this.f86624a = bVar;
        }

        @Override // wb0.a
        public void call() {
            try {
                this.f86625b.call();
            } finally {
                this.f86624a.onCompleted();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class g extends AtomicReference<qb0.h> implements qb0.h {
        public g() {
            super(k.f86607d);
        }

        public final void b(d.a aVar, qb0.b bVar) {
            qb0.h hVar;
            qb0.h hVar2 = get();
            if (hVar2 != k.f86608e && hVar2 == (hVar = k.f86607d)) {
                qb0.h c11 = c(aVar, bVar);
                if (compareAndSet(hVar, c11)) {
                    return;
                }
                c11.unsubscribe();
            }
        }

        public abstract qb0.h c(d.a aVar, qb0.b bVar);

        @Override // qb0.h
        public boolean isUnsubscribed() {
            return get().isUnsubscribed();
        }

        @Override // qb0.h
        public void unsubscribe() {
            qb0.h hVar;
            qb0.h hVar2 = k.f86608e;
            do {
                hVar = get();
                if (hVar == k.f86608e) {
                    return;
                }
            } while (!compareAndSet(hVar, hVar2));
            if (hVar != k.f86607d) {
                hVar.unsubscribe();
            }
        }
    }

    public k(p<rx.c<rx.c<rx.b>>, rx.b> pVar, rx.d dVar) {
        this.f86609a = dVar;
        dc0.c y72 = dc0.c.y7();
        this.f86610b = new zb0.f(y72);
        this.f86611c = pVar.call(y72.N3()).n0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // rx.d
    public d.a a() {
        d.a a11 = this.f86609a.a();
        rx.internal.operators.g y72 = rx.internal.operators.g.y7();
        zb0.f fVar = new zb0.f(y72);
        Object c32 = y72.c3(new a(a11));
        b bVar = new b(a11, fVar);
        this.f86610b.onNext(c32);
        return bVar;
    }

    @Override // qb0.h
    public boolean isUnsubscribed() {
        return this.f86611c.isUnsubscribed();
    }

    @Override // qb0.h
    public void unsubscribe() {
        this.f86611c.unsubscribe();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements qb0.h {
        @Override // qb0.h
        public boolean isUnsubscribed() {
            return false;
        }

        @Override // qb0.h
        public void unsubscribe() {
        }
    }
}
