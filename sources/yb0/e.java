package yb0;

import java.util.concurrent.atomic.AtomicLong;
import qb0.h;
import rx.c;
import wb0.o;
import wb0.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class e<S, T> implements c.a<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements q<S, qb0.c<? super T>, S> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.c f99857a;

        public a(wb0.c cVar) {
            this.f99857a = cVar;
        }

        @Override // wb0.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public S call(S s11, qb0.c<? super T> cVar) {
            this.f99857a.call(s11, cVar);
            return s11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements q<S, qb0.c<? super T>, S> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.c f99858a;

        public b(wb0.c cVar) {
            this.f99858a = cVar;
        }

        @Override // wb0.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public S call(S s11, qb0.c<? super T> cVar) {
            this.f99858a.call(s11, cVar);
            return s11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements q<Void, qb0.c<? super T>, Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.b f99859a;

        public c(wb0.b bVar) {
            this.f99859a = bVar;
        }

        @Override // wb0.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call(Void r22, qb0.c<? super T> cVar) {
            this.f99859a.call(cVar);
            return r22;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements q<Void, qb0.c<? super T>, Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.b f99860a;

        public d(wb0.b bVar) {
            this.f99860a = bVar;
        }

        @Override // wb0.q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call(Void r12, qb0.c<? super T> cVar) {
            this.f99860a.call(cVar);
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: yb0.e$e, reason: collision with other inner class name */
    public static class C1358e implements wb0.b<Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.a f99861a;

        public C1358e(wb0.a aVar) {
            this.f99861a = aVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Void r12) {
            this.f99861a.call();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f<S, T> extends AtomicLong implements qb0.d, h, qb0.c<T> {
        private static final long serialVersionUID = -3736864024352728072L;

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f99862a;

        /* renamed from: b, reason: collision with root package name */
        public final e<S, T> f99863b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f99864c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f99865d;

        /* renamed from: e, reason: collision with root package name */
        public S f99866e;

        public f(qb0.g<? super T> gVar, e<S, T> eVar, S s11) {
            this.f99862a = gVar;
            this.f99863b = eVar;
            this.f99866e = s11;
        }

        private void d() {
            e<S, T> eVar = this.f99863b;
            qb0.g<? super T> gVar = this.f99862a;
            do {
                try {
                    this.f99864c = false;
                    f(eVar);
                } catch (Throwable th2) {
                    e(gVar, th2);
                    return;
                }
            } while (!h());
        }

        private void g(long j11) {
            e<S, T> eVar = this.f99863b;
            qb0.g<? super T> gVar = this.f99862a;
            do {
                long j12 = j11;
                do {
                    try {
                        this.f99864c = false;
                        f(eVar);
                        if (h()) {
                            return;
                        }
                        if (this.f99864c) {
                            j12--;
                        }
                    } catch (Throwable th2) {
                        e(gVar, th2);
                        return;
                    }
                } while (j12 != 0);
                j11 = addAndGet(-j11);
            } while (j11 > 0);
            h();
        }

        public final void c() {
            try {
                this.f99863b.q(this.f99866e);
            } catch (Throwable th2) {
                vb0.a.e(th2);
                ac0.c.I(th2);
            }
        }

        public final void e(qb0.g<? super T> gVar, Throwable th2) {
            if (this.f99865d) {
                ac0.c.I(th2);
                return;
            }
            this.f99865d = true;
            gVar.onError(th2);
            unsubscribe();
        }

        public final void f(e<S, T> eVar) {
            this.f99866e = eVar.p(this.f99866e, this);
        }

        public final boolean h() {
            if (!this.f99865d && get() >= -1) {
                return false;
            }
            set(-1L);
            c();
            return true;
        }

        @Override // qb0.h
        public boolean isUnsubscribed() {
            return get() < 0;
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f99865d) {
                throw new IllegalStateException("Terminal event already emitted.");
            }
            this.f99865d = true;
            if (this.f99862a.isUnsubscribed()) {
                return;
            }
            this.f99862a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f99865d) {
                throw new IllegalStateException("Terminal event already emitted.");
            }
            this.f99865d = true;
            if (this.f99862a.isUnsubscribed()) {
                return;
            }
            this.f99862a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            if (this.f99864c) {
                throw new IllegalStateException("onNext called multiple times!");
            }
            this.f99864c = true;
            this.f99862a.onNext(t11);
        }

        @Override // qb0.d
        public void request(long j11) {
            if (j11 <= 0 || rx.internal.operators.a.b(this, j11) != 0) {
                return;
            }
            if (j11 == Long.MAX_VALUE) {
                d();
            } else {
                g(j11);
            }
        }

        @Override // qb0.h
        public void unsubscribe() {
            long j11;
            do {
                j11 = get();
                if (compareAndSet(0L, -1L)) {
                    c();
                    return;
                }
            } while (!compareAndSet(j11, -2L));
        }
    }

    public static <S, T> e<S, T> b(o<? extends S> oVar, wb0.c<? super S, ? super qb0.c<? super T>> cVar) {
        return new g(oVar, new a(cVar));
    }

    public static <S, T> e<S, T> h(o<? extends S> oVar, wb0.c<? super S, ? super qb0.c<? super T>> cVar, wb0.b<? super S> bVar) {
        return new g(oVar, new b(cVar), bVar);
    }

    public static <S, T> e<S, T> j(o<? extends S> oVar, q<? super S, ? super qb0.c<? super T>, ? extends S> qVar) {
        return new g(oVar, qVar);
    }

    public static <S, T> e<S, T> l(o<? extends S> oVar, q<? super S, ? super qb0.c<? super T>, ? extends S> qVar, wb0.b<? super S> bVar) {
        return new g(oVar, qVar, bVar);
    }

    public static <T> e<Void, T> m(wb0.b<? super qb0.c<? super T>> bVar) {
        return new g(new c(bVar));
    }

    public static <T> e<Void, T> n(wb0.b<? super qb0.c<? super T>> bVar, wb0.a aVar) {
        return new g(new d(bVar), new C1358e(aVar));
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void call(qb0.g<? super T> gVar) {
        try {
            f fVar = new f(gVar, this, o());
            gVar.add(fVar);
            gVar.setProducer(fVar);
        } catch (Throwable th2) {
            vb0.a.e(th2);
            gVar.onError(th2);
        }
    }

    public abstract S o();

    public abstract S p(S s11, qb0.c<? super T> cVar);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g<S, T> extends e<S, T> {

        /* renamed from: a, reason: collision with root package name */
        public final o<? extends S> f99867a;

        /* renamed from: b, reason: collision with root package name */
        public final q<? super S, ? super qb0.c<? super T>, ? extends S> f99868b;

        /* renamed from: c, reason: collision with root package name */
        public final wb0.b<? super S> f99869c;

        public g(o<? extends S> oVar, q<? super S, ? super qb0.c<? super T>, ? extends S> qVar, wb0.b<? super S> bVar) {
            this.f99867a = oVar;
            this.f99868b = qVar;
            this.f99869c = bVar;
        }

        @Override // yb0.e, wb0.b
        public /* bridge */ /* synthetic */ void call(Object obj) {
            super.call((qb0.g) obj);
        }

        @Override // yb0.e
        public S o() {
            o<? extends S> oVar = this.f99867a;
            if (oVar == null) {
                return null;
            }
            return oVar.call();
        }

        @Override // yb0.e
        public S p(S s11, qb0.c<? super T> cVar) {
            return this.f99868b.call(s11, cVar);
        }

        @Override // yb0.e
        public void q(S s11) {
            wb0.b<? super S> bVar = this.f99869c;
            if (bVar != null) {
                bVar.call(s11);
            }
        }

        public g(o<? extends S> oVar, q<? super S, ? super qb0.c<? super T>, ? extends S> qVar) {
            this(oVar, qVar, null);
        }

        public g(q<S, qb0.c<? super T>, S> qVar, wb0.b<? super S> bVar) {
            this(null, qVar, bVar);
        }

        public g(q<S, qb0.c<? super T>, S> qVar) {
            this(null, qVar, null);
        }
    }

    public void q(S s11) {
    }
}
