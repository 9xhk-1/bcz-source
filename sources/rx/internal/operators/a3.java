package rx.internal.operators;

import a00.a0;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class a3<R, T> implements c.b<R, T> {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f85068c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final wb0.o<R> f85069a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.q<R, ? super T, R> f85070b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements wb0.o<R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f85071a;

        public a(Object obj) {
            this.f85071a = obj;
        }

        @Override // wb0.o, java.util.concurrent.Callable
        public R call() {
            return (R) this.f85071a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f85072a;

        /* renamed from: b, reason: collision with root package name */
        public R f85073b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ qb0.g f85074c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(qb0.g gVar, qb0.g gVar2) {
            super(gVar);
            this.f85074c = gVar2;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85074c.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85074c.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            if (this.f85072a) {
                try {
                    t11 = a3.this.f85070b.call(this.f85073b, t11);
                } catch (Throwable th2) {
                    vb0.a.g(th2, this.f85074c, t11);
                    return;
                }
            } else {
                this.f85072a = true;
            }
            this.f85073b = (R) t11;
            this.f85074c.onNext(t11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public R f85076a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f85077b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f85078c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Object obj, d dVar) {
            this.f85077b = obj;
            this.f85078c = dVar;
            this.f85076a = obj;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85078c.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85078c.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            try {
                R call = a3.this.f85070b.call(this.f85076a, t11);
                this.f85076a = call;
                this.f85078c.onNext(call);
            } catch (Throwable th2) {
                vb0.a.g(th2, this, t11);
            }
        }

        @Override // qb0.g
        public void setProducer(qb0.d dVar) {
            this.f85078c.setProducer(dVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d<R> implements qb0.d, qb0.c<R> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super R> f85080a;

        /* renamed from: b, reason: collision with root package name */
        public final Queue<Object> f85081b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f85082c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f85083d;

        /* renamed from: e, reason: collision with root package name */
        public long f85084e;

        /* renamed from: f, reason: collision with root package name */
        public final AtomicLong f85085f;

        /* renamed from: g, reason: collision with root package name */
        public volatile qb0.d f85086g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f85087h;

        /* renamed from: i, reason: collision with root package name */
        public Throwable f85088i;

        public d(R r11, qb0.g<? super R> gVar) {
            this.f85080a = gVar;
            Queue<Object> g0Var = rx.internal.util.unsafe.n0.f() ? new rx.internal.util.unsafe.g0<>() : new rx.internal.util.atomic.f<>();
            this.f85081b = g0Var;
            g0Var.offer(v.j(r11));
            this.f85085f = new AtomicLong();
        }

        public boolean c(boolean z11, boolean z12, qb0.g<? super R> gVar) {
            if (gVar.isUnsubscribed()) {
                return true;
            }
            if (!z11) {
                return false;
            }
            Throwable th2 = this.f85088i;
            if (th2 != null) {
                gVar.onError(th2);
                return true;
            }
            if (!z12) {
                return false;
            }
            gVar.onCompleted();
            return true;
        }

        public void d() {
            synchronized (this) {
                try {
                    if (this.f85082c) {
                        this.f85083d = true;
                    } else {
                        this.f85082c = true;
                        e();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void e() {
            qb0.g<? super R> gVar = this.f85080a;
            Queue<Object> queue = this.f85081b;
            AtomicLong atomicLong = this.f85085f;
            long j11 = atomicLong.get();
            while (!c(this.f85087h, queue.isEmpty(), gVar)) {
                long j12 = 0;
                while (j12 != j11) {
                    boolean z11 = this.f85087h;
                    Object poll = queue.poll();
                    boolean z12 = poll == null;
                    if (c(z11, z12, gVar)) {
                        return;
                    }
                    if (z12) {
                        break;
                    }
                    a0.d dVar = (Object) v.e(poll);
                    try {
                        gVar.onNext(dVar);
                        j12++;
                    } catch (Throwable th2) {
                        vb0.a.g(th2, gVar, dVar);
                        return;
                    }
                }
                if (j12 != 0 && j11 != Long.MAX_VALUE) {
                    j11 = rx.internal.operators.a.i(atomicLong, j12);
                }
                synchronized (this) {
                    try {
                        if (!this.f85083d) {
                            this.f85082c = false;
                            return;
                        }
                        this.f85083d = false;
                    } finally {
                    }
                }
            }
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85087h = true;
            d();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85088i = th2;
            this.f85087h = true;
            d();
        }

        @Override // qb0.c
        public void onNext(R r11) {
            this.f85081b.offer(v.j(r11));
            d();
        }

        @Override // qb0.d
        public void request(long j11) {
            if (j11 < 0) {
                throw new IllegalArgumentException("n >= required but it was " + j11);
            }
            if (j11 != 0) {
                rx.internal.operators.a.b(this.f85085f, j11);
                qb0.d dVar = this.f85086g;
                if (dVar == null) {
                    synchronized (this.f85085f) {
                        try {
                            dVar = this.f85086g;
                            if (dVar == null) {
                                this.f85084e = rx.internal.operators.a.a(this.f85084e, j11);
                            }
                        } finally {
                        }
                    }
                }
                if (dVar != null) {
                    dVar.request(j11);
                }
                d();
            }
        }

        public void setProducer(qb0.d dVar) {
            long j11;
            dVar.getClass();
            synchronized (this.f85085f) {
                if (this.f85086g != null) {
                    throw new IllegalStateException("Can't set more than one Producer!");
                }
                j11 = this.f85084e;
                if (j11 != Long.MAX_VALUE) {
                    j11--;
                }
                this.f85084e = 0L;
                this.f85086g = dVar;
            }
            if (j11 > 0) {
                dVar.request(j11);
            }
            d();
        }
    }

    public a3(R r11, wb0.q<R, ? super T, R> qVar) {
        this((wb0.o) new a(r11), (wb0.q) qVar);
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super R> gVar) {
        R call = this.f85069a.call();
        if (call == f85068c) {
            return new b(gVar, gVar);
        }
        d dVar = new d(call, gVar);
        c cVar = new c(call, dVar);
        gVar.add(cVar);
        gVar.setProducer(dVar);
        return cVar;
    }

    public a3(wb0.o<R> oVar, wb0.q<R, ? super T, R> qVar) {
        this.f85069a = oVar;
        this.f85070b = qVar;
    }

    public a3(wb0.q<R, ? super T, R> qVar) {
        this(f85068c, qVar);
    }
}
