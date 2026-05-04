package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.d;
import rx.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class c5<T> implements e.t<T> {

    /* renamed from: a, reason: collision with root package name */
    public final e.t<T> f85227a;

    /* renamed from: b, reason: collision with root package name */
    public final long f85228b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f85229c;

    /* renamed from: d, reason: collision with root package name */
    public final rx.d f85230d;

    /* renamed from: e, reason: collision with root package name */
    public final e.t<? extends T> f85231e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends qb0.f<T> implements wb0.a {

        /* renamed from: b, reason: collision with root package name */
        public final qb0.f<? super T> f85232b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f85233c = new AtomicBoolean();

        /* renamed from: d, reason: collision with root package name */
        public final e.t<? extends T> f85234d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.operators.c5$a$a, reason: collision with other inner class name */
        public static final class C1082a<T> extends qb0.f<T> {

            /* renamed from: b, reason: collision with root package name */
            public final qb0.f<? super T> f85235b;

            public C1082a(qb0.f<? super T> fVar) {
                this.f85235b = fVar;
            }

            @Override // qb0.f
            public void h(T t11) {
                this.f85235b.h(t11);
            }

            @Override // qb0.f
            public void onError(Throwable th2) {
                this.f85235b.onError(th2);
            }
        }

        public a(qb0.f<? super T> fVar, e.t<? extends T> tVar) {
            this.f85232b = fVar;
            this.f85234d = tVar;
        }

        @Override // wb0.a
        public void call() {
            if (this.f85233c.compareAndSet(false, true)) {
                try {
                    e.t<? extends T> tVar = this.f85234d;
                    if (tVar == null) {
                        this.f85232b.onError(new TimeoutException());
                    } else {
                        C1082a c1082a = new C1082a(this.f85232b);
                        this.f85232b.b(c1082a);
                        tVar.call(c1082a);
                    }
                    unsubscribe();
                } catch (Throwable th2) {
                    unsubscribe();
                    throw th2;
                }
            }
        }

        @Override // qb0.f
        public void h(T t11) {
            if (this.f85233c.compareAndSet(false, true)) {
                try {
                    this.f85232b.h(t11);
                } finally {
                    unsubscribe();
                }
            }
        }

        @Override // qb0.f
        public void onError(Throwable th2) {
            if (!this.f85233c.compareAndSet(false, true)) {
                ac0.c.I(th2);
                return;
            }
            try {
                this.f85232b.onError(th2);
            } finally {
                unsubscribe();
            }
        }
    }

    public c5(e.t<T> tVar, long j11, TimeUnit timeUnit, rx.d dVar, e.t<? extends T> tVar2) {
        this.f85227a = tVar;
        this.f85228b = j11;
        this.f85229c = timeUnit;
        this.f85230d = dVar;
        this.f85231e = tVar2;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.f<? super T> fVar) {
        a aVar = new a(fVar, this.f85231e);
        d.a a11 = this.f85230d.a();
        aVar.b(a11);
        fVar.b(aVar);
        a11.j(aVar, this.f85228b, this.f85229c);
        this.f85227a.call(aVar);
    }
}
