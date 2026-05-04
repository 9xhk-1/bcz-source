package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.Notification;
import rx.c;
import rx.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class w0<T> implements c.a<T> {

    /* renamed from: f, reason: collision with root package name */
    public static final wb0.p<rx.c<? extends Notification<?>>, rx.c<?>> f86210f = new a();

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<T> f86211a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.p<? super rx.c<? extends Notification<?>>, ? extends rx.c<?>> f86212b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f86213c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f86214d;

    /* renamed from: e, reason: collision with root package name */
    public final rx.d f86215e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements wb0.p<rx.c<? extends Notification<?>>, rx.c<?>> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.operators.w0$a$a, reason: collision with other inner class name */
        public class C1103a implements wb0.p<Notification<?>, Notification<?>> {
            public C1103a() {
            }

            @Override // wb0.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Notification<?> call(Notification<?> notification) {
                return Notification.e(null);
            }
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<?> call(rx.c<? extends Notification<?>> cVar) {
            return cVar.c3(new C1103a());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements wb0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ qb0.g f86217a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ dc0.f f86218b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ rx.internal.producers.a f86219c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AtomicLong f86220d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ec0.e f86221e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends qb0.g<T> {

            /* renamed from: a, reason: collision with root package name */
            public boolean f86223a;

            public a() {
            }

            @Override // qb0.c
            public void onCompleted() {
                if (this.f86223a) {
                    return;
                }
                this.f86223a = true;
                unsubscribe();
                b.this.f86218b.onNext(Notification.b());
            }

            @Override // qb0.c
            public void onError(Throwable th2) {
                if (this.f86223a) {
                    return;
                }
                this.f86223a = true;
                unsubscribe();
                b.this.f86218b.onNext(Notification.d(th2));
            }

            @Override // qb0.c
            public void onNext(T t11) {
                if (this.f86223a) {
                    return;
                }
                b.this.f86217a.onNext(t11);
                q();
                b.this.f86219c.b(1L);
            }

            public final void q() {
                long j11;
                do {
                    j11 = b.this.f86220d.get();
                    if (j11 == Long.MAX_VALUE) {
                        return;
                    }
                } while (!b.this.f86220d.compareAndSet(j11, j11 - 1));
            }

            @Override // qb0.g
            public void setProducer(qb0.d dVar) {
                b.this.f86219c.c(dVar);
            }
        }

        public b(qb0.g gVar, dc0.f fVar, rx.internal.producers.a aVar, AtomicLong atomicLong, ec0.e eVar) {
            this.f86217a = gVar;
            this.f86218b = fVar;
            this.f86219c = aVar;
            this.f86220d = atomicLong;
            this.f86221e = eVar;
        }

        @Override // wb0.a
        public void call() {
            if (this.f86217a.isUnsubscribed()) {
                return;
            }
            a aVar = new a();
            this.f86221e.b(aVar);
            w0.this.f86211a.J6(aVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements c.b<Notification<?>, Notification<?>> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends qb0.g<Notification<?>> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ qb0.g f86226a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(qb0.g gVar, qb0.g gVar2) {
                super(gVar);
                this.f86226a = gVar2;
            }

            @Override // qb0.c
            public void onCompleted() {
                this.f86226a.onCompleted();
            }

            @Override // qb0.c
            public void onError(Throwable th2) {
                this.f86226a.onError(th2);
            }

            @Override // qb0.c
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public void onNext(Notification<?> notification) {
                if (notification.k() && w0.this.f86213c) {
                    this.f86226a.onCompleted();
                } else if (notification.l() && w0.this.f86214d) {
                    this.f86226a.onError(notification.g());
                } else {
                    this.f86226a.onNext(notification);
                }
            }

            @Override // qb0.g
            public void setProducer(qb0.d dVar) {
                dVar.request(Long.MAX_VALUE);
            }
        }

        public c() {
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public qb0.g<? super Notification<?>> call(qb0.g<? super Notification<?>> gVar) {
            return new a(gVar, gVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements wb0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rx.c f86228a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qb0.g f86229b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AtomicLong f86230c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d.a f86231d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ wb0.a f86232e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f86233f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends qb0.g<Object> {
            public a(qb0.g gVar) {
                super(gVar);
            }

            @Override // qb0.c
            public void onCompleted() {
                d.this.f86229b.onCompleted();
            }

            @Override // qb0.c
            public void onError(Throwable th2) {
                d.this.f86229b.onError(th2);
            }

            @Override // qb0.c
            public void onNext(Object obj) {
                if (d.this.f86229b.isUnsubscribed()) {
                    return;
                }
                if (d.this.f86230c.get() <= 0) {
                    d.this.f86233f.compareAndSet(false, true);
                } else {
                    d dVar = d.this;
                    dVar.f86231d.h(dVar.f86232e);
                }
            }

            @Override // qb0.g
            public void setProducer(qb0.d dVar) {
                dVar.request(Long.MAX_VALUE);
            }
        }

        public d(rx.c cVar, qb0.g gVar, AtomicLong atomicLong, d.a aVar, wb0.a aVar2, AtomicBoolean atomicBoolean) {
            this.f86228a = cVar;
            this.f86229b = gVar;
            this.f86230c = atomicLong;
            this.f86231d = aVar;
            this.f86232e = aVar2;
            this.f86233f = atomicBoolean;
        }

        @Override // wb0.a
        public void call() {
            this.f86228a.J6(new a(this.f86229b));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements qb0.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicLong f86236a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ rx.internal.producers.a f86237b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f86238c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d.a f86239d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ wb0.a f86240e;

        public e(AtomicLong atomicLong, rx.internal.producers.a aVar, AtomicBoolean atomicBoolean, d.a aVar2, wb0.a aVar3) {
            this.f86236a = atomicLong;
            this.f86237b = aVar;
            this.f86238c = atomicBoolean;
            this.f86239d = aVar2;
            this.f86240e = aVar3;
        }

        @Override // qb0.d
        public void request(long j11) {
            if (j11 > 0) {
                rx.internal.operators.a.b(this.f86236a, j11);
                this.f86237b.request(j11);
                if (this.f86238c.compareAndSet(true, false)) {
                    this.f86239d.h(this.f86240e);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f implements wb0.p<rx.c<? extends Notification<?>>, rx.c<?>> {

        /* renamed from: a, reason: collision with root package name */
        public final long f86242a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements wb0.p<Notification<?>, Notification<?>> {

            /* renamed from: a, reason: collision with root package name */
            public int f86243a;

            public a() {
            }

            @Override // wb0.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Notification<?> call(Notification<?> notification) {
                long j11 = f.this.f86242a;
                if (j11 == 0) {
                    return notification;
                }
                int i11 = this.f86243a + 1;
                this.f86243a = i11;
                return ((long) i11) <= j11 ? Notification.e(Integer.valueOf(i11)) : notification;
            }
        }

        public f(long j11) {
            this.f86242a = j11;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<?> call(rx.c<? extends Notification<?>> cVar) {
            return cVar.c3(new a()).A1();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g implements wb0.p<rx.c<? extends Notification<?>>, rx.c<? extends Notification<?>>> {

        /* renamed from: a, reason: collision with root package name */
        public final wb0.q<Integer, Throwable, Boolean> f86245a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements wb0.q<Notification<Integer>, Notification<?>, Notification<Integer>> {
            public a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // wb0.q
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Notification<Integer> call(Notification<Integer> notification, Notification<?> notification2) {
                Integer h11 = notification.h();
                return g.this.f86245a.call(h11, notification2.g()).booleanValue() ? Notification.e(Integer.valueOf(h11.intValue() + 1)) : notification2;
            }
        }

        public g(wb0.q<Integer, Throwable, Boolean> qVar) {
            this.f86245a = qVar;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<? extends Notification<?>> call(rx.c<? extends Notification<?>> cVar) {
            return cVar.K4(Notification.e(0), new a());
        }
    }

    public w0(rx.c<T> cVar, wb0.p<? super rx.c<? extends Notification<?>>, ? extends rx.c<?>> pVar, boolean z11, boolean z12, rx.d dVar) {
        this.f86211a = cVar;
        this.f86212b = pVar;
        this.f86213c = z11;
        this.f86214d = z12;
        this.f86215e = dVar;
    }

    public static <T> rx.c<T> b(rx.c<T> cVar, wb0.p<? super rx.c<? extends Notification<?>>, ? extends rx.c<?>> pVar, rx.d dVar) {
        return rx.c.I6(new w0(cVar, pVar, false, false, dVar));
    }

    public static <T> rx.c<T> h(rx.c<T> cVar) {
        return m(cVar, bc0.c.m());
    }

    public static <T> rx.c<T> j(rx.c<T> cVar, long j11) {
        return l(cVar, j11, bc0.c.m());
    }

    public static <T> rx.c<T> l(rx.c<T> cVar, long j11, rx.d dVar) {
        if (j11 == 0) {
            return rx.c.S1();
        }
        if (j11 >= 0) {
            return o(cVar, new f(j11 - 1), dVar);
        }
        throw new IllegalArgumentException("count >= 0 expected");
    }

    public static <T> rx.c<T> m(rx.c<T> cVar, rx.d dVar) {
        return o(cVar, f86210f, dVar);
    }

    public static <T> rx.c<T> n(rx.c<T> cVar, wb0.p<? super rx.c<? extends Notification<?>>, ? extends rx.c<?>> pVar) {
        return rx.c.I6(new w0(cVar, pVar, false, true, bc0.c.m()));
    }

    public static <T> rx.c<T> o(rx.c<T> cVar, wb0.p<? super rx.c<? extends Notification<?>>, ? extends rx.c<?>> pVar, rx.d dVar) {
        return rx.c.I6(new w0(cVar, pVar, false, true, dVar));
    }

    public static <T> rx.c<T> p(rx.c<T> cVar) {
        return r(cVar, f86210f);
    }

    public static <T> rx.c<T> q(rx.c<T> cVar, long j11) {
        if (j11 >= 0) {
            return j11 == 0 ? cVar : r(cVar, new f(j11));
        }
        throw new IllegalArgumentException("count >= 0 expected");
    }

    public static <T> rx.c<T> r(rx.c<T> cVar, wb0.p<? super rx.c<? extends Notification<?>>, ? extends rx.c<?>> pVar) {
        return rx.c.I6(new w0(cVar, pVar, true, false, bc0.c.m()));
    }

    public static <T> rx.c<T> s(rx.c<T> cVar, wb0.p<? super rx.c<? extends Notification<?>>, ? extends rx.c<?>> pVar, rx.d dVar) {
        return rx.c.I6(new w0(cVar, pVar, true, false, dVar));
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super T> gVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        AtomicLong atomicLong = new AtomicLong();
        d.a a11 = this.f86215e.a();
        gVar.add(a11);
        ec0.e eVar = new ec0.e();
        gVar.add(eVar);
        dc0.e<T, T> x72 = dc0.b.y7().x7();
        x72.r5(zb0.h.d());
        rx.internal.producers.a aVar = new rx.internal.producers.a();
        b bVar = new b(gVar, x72, aVar, atomicLong, eVar);
        a11.h(new d(this.f86212b.call(x72.a3(new c())), gVar, atomicLong, a11, bVar, atomicBoolean));
        gVar.setProducer(new e(atomicLong, aVar, atomicBoolean, a11, bVar));
    }
}
