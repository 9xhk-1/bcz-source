package rx.internal.util;

import java.util.concurrent.atomic.AtomicBoolean;
import org.junit.jupiter.api.j2;
import rx.c;
import rx.d;
import rx.internal.producers.SingleProducer;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class k<T> extends rx.c<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f86722c = Boolean.valueOf(System.getProperty("rx.just.strong-mode", "false")).booleanValue();

    /* renamed from: b, reason: collision with root package name */
    public final T f86723b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements p<wb0.a, qb0.h> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rx.internal.schedulers.b f86724a;

        public a(rx.internal.schedulers.b bVar) {
            this.f86724a = bVar;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public qb0.h call(wb0.a aVar) {
            return this.f86724a.d(aVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements p<wb0.a, qb0.h> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rx.d f86726a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements wb0.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ wb0.a f86728a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d.a f86729b;

            public a(wb0.a aVar, d.a aVar2) {
                this.f86728a = aVar;
                this.f86729b = aVar2;
            }

            @Override // wb0.a
            public void call() {
                try {
                    this.f86728a.call();
                } finally {
                    this.f86729b.unsubscribe();
                }
            }
        }

        public b(rx.d dVar) {
            this.f86726a = dVar;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public qb0.h call(wb0.a aVar) {
            d.a a11 = this.f86726a.a();
            a11.h(new a(aVar, a11));
            return a11;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c<R> implements c.a<R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f86731a;

        public c(p pVar) {
            this.f86731a = pVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super R> gVar) {
            rx.c cVar = (rx.c) this.f86731a.call(k.this.f86723b);
            if (cVar instanceof k) {
                gVar.setProducer(k.x7(gVar, ((k) cVar).f86723b));
            } else {
                cVar.J6(zb0.h.f(gVar));
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d<T> implements c.a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f86733a;

        public d(T t11) {
            this.f86733a = t11;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super T> gVar) {
            gVar.setProducer(k.x7(gVar, this.f86733a));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e<T> implements c.a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f86734a;

        /* renamed from: b, reason: collision with root package name */
        public final p<wb0.a, qb0.h> f86735b;

        public e(T t11, p<wb0.a, qb0.h> pVar) {
            this.f86734a = t11;
            this.f86735b = pVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super T> gVar) {
            gVar.setProducer(new f(gVar, this.f86734a, this.f86735b));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f<T> extends AtomicBoolean implements qb0.d, wb0.a {
        private static final long serialVersionUID = -2466317989629281651L;

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f86736a;

        /* renamed from: b, reason: collision with root package name */
        public final T f86737b;

        /* renamed from: c, reason: collision with root package name */
        public final p<wb0.a, qb0.h> f86738c;

        public f(qb0.g<? super T> gVar, T t11, p<wb0.a, qb0.h> pVar) {
            this.f86736a = gVar;
            this.f86737b = t11;
            this.f86738c = pVar;
        }

        @Override // wb0.a
        public void call() {
            qb0.g<? super T> gVar = this.f86736a;
            if (gVar.isUnsubscribed()) {
                return;
            }
            T t11 = this.f86737b;
            try {
                gVar.onNext(t11);
                if (gVar.isUnsubscribed()) {
                    return;
                }
                gVar.onCompleted();
            } catch (Throwable th2) {
                vb0.a.g(th2, gVar, t11);
            }
        }

        @Override // qb0.d
        public void request(long j11) {
            if (j11 < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j11);
            }
            if (j11 == 0 || !compareAndSet(false, true)) {
                return;
            }
            this.f86736a.add(this.f86738c.call(this));
        }

        @Override // java.util.concurrent.atomic.AtomicBoolean
        public String toString() {
            return "ScalarAsyncProducer[" + this.f86737b + j2.O + get() + "]";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g<T> implements qb0.d {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f86739a;

        /* renamed from: b, reason: collision with root package name */
        public final T f86740b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f86741c;

        public g(qb0.g<? super T> gVar, T t11) {
            this.f86739a = gVar;
            this.f86740b = t11;
        }

        @Override // qb0.d
        public void request(long j11) {
            if (this.f86741c) {
                return;
            }
            if (j11 < 0) {
                throw new IllegalStateException("n >= required but it was " + j11);
            }
            if (j11 == 0) {
                return;
            }
            this.f86741c = true;
            qb0.g<? super T> gVar = this.f86739a;
            if (gVar.isUnsubscribed()) {
                return;
            }
            T t11 = this.f86740b;
            try {
                gVar.onNext(t11);
                if (gVar.isUnsubscribed()) {
                    return;
                }
                gVar.onCompleted();
            } catch (Throwable th2) {
                vb0.a.g(th2, gVar, t11);
            }
        }
    }

    public k(T t11) {
        super(ac0.c.G(new d(t11)));
        this.f86723b = t11;
    }

    public static <T> k<T> w7(T t11) {
        return new k<>(t11);
    }

    public static <T> qb0.d x7(qb0.g<? super T> gVar, T t11) {
        return f86722c ? new SingleProducer(gVar, t11) : new g(gVar, t11);
    }

    public rx.c<T> A7(rx.d dVar) {
        return rx.c.I6(new e(this.f86723b, dVar instanceof rx.internal.schedulers.b ? new a((rx.internal.schedulers.b) dVar) : new b(dVar)));
    }

    public T y7() {
        return this.f86723b;
    }

    public <R> rx.c<R> z7(p<? super T, ? extends rx.c<? extends R>> pVar) {
        return rx.c.I6(new c(pVar));
    }
}
