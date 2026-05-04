package rx.internal.operators;

import a00.a0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import rx.c;
import rx.exceptions.CompositeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class k3<T> implements c.b<T, rx.c<? extends T>> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f85658a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final k3<Object> f85659a = new k3<>(false);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final k3<Object> f85660a = new k3<>(true);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<T> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final long f85661a;

        /* renamed from: b, reason: collision with root package name */
        public final d<T> f85662b;

        public c(long j11, d<T> dVar) {
            this.f85661a = j11;
            this.f85662b = dVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85662b.E(this.f85661a);
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85662b.L(th2, this.f85661a);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f85662b.I(t11, this);
        }

        @Override // qb0.g
        public void setProducer(qb0.d dVar) {
            this.f85662b.S(dVar, this.f85661a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d<T> extends qb0.g<rx.c<? extends T>> {

        /* renamed from: m, reason: collision with root package name */
        public static final Throwable f85663m = new Throwable("Terminal error");

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f85664a;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f85666c;

        /* renamed from: f, reason: collision with root package name */
        public boolean f85669f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f85670g;

        /* renamed from: h, reason: collision with root package name */
        public long f85671h;

        /* renamed from: i, reason: collision with root package name */
        public qb0.d f85672i;

        /* renamed from: j, reason: collision with root package name */
        public volatile boolean f85673j;

        /* renamed from: k, reason: collision with root package name */
        public Throwable f85674k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f85675l;

        /* renamed from: b, reason: collision with root package name */
        public final ec0.e f85665b = new ec0.e();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicLong f85667d = new AtomicLong();

        /* renamed from: e, reason: collision with root package name */
        public final rx.internal.util.atomic.e<Object> f85668e = new rx.internal.util.atomic.e<>(rx.internal.util.j.f86718d);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements wb0.a {
            public a() {
            }

            @Override // wb0.a
            public void call() {
                d.this.D();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b implements qb0.d {
            public b() {
            }

            @Override // qb0.d
            public void request(long j11) {
                if (j11 > 0) {
                    d.this.C(j11);
                } else {
                    if (j11 >= 0) {
                        return;
                    }
                    throw new IllegalArgumentException("n >= 0 expected but it was " + j11);
                }
            }
        }

        public d(qb0.g<? super T> gVar, boolean z11) {
            this.f85664a = gVar;
            this.f85666c = z11;
        }

        public void C(long j11) {
            qb0.d dVar;
            synchronized (this) {
                dVar = this.f85672i;
                this.f85671h = rx.internal.operators.a.a(this.f85671h, j11);
            }
            if (dVar != null) {
                dVar.request(j11);
            }
            H();
        }

        public void D() {
            synchronized (this) {
                this.f85672i = null;
            }
        }

        public void E(long j11) {
            synchronized (this) {
                try {
                    if (this.f85667d.get() != j11) {
                        return;
                    }
                    this.f85675l = false;
                    this.f85672i = null;
                    H();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void H() {
            Throwable th2;
            Throwable th3;
            synchronized (this) {
                try {
                    if (this.f85669f) {
                        this.f85670g = true;
                        return;
                    }
                    this.f85669f = true;
                    boolean z11 = this.f85675l;
                    long j11 = this.f85671h;
                    Throwable th4 = this.f85674k;
                    if (th4 != null && th4 != (th3 = f85663m) && !this.f85666c) {
                        this.f85674k = th3;
                    }
                    rx.internal.util.atomic.e<Object> eVar = this.f85668e;
                    AtomicLong atomicLong = this.f85667d;
                    qb0.g<? super T> gVar = this.f85664a;
                    long j12 = j11;
                    boolean z12 = this.f85673j;
                    boolean z13 = z11;
                    while (true) {
                        long j13 = 0;
                        while (j13 != j12) {
                            if (gVar.isUnsubscribed()) {
                                return;
                            }
                            boolean isEmpty = eVar.isEmpty();
                            if (q(z12, z13, th4, eVar, gVar, isEmpty)) {
                                return;
                            }
                            if (isEmpty) {
                                break;
                            }
                            c cVar = (c) eVar.poll();
                            a0.e eVar2 = (Object) v.e(eVar.poll());
                            if (atomicLong.get() == cVar.f85661a) {
                                gVar.onNext(eVar2);
                                j13++;
                            }
                        }
                        if (j13 == j12 && (gVar.isUnsubscribed() || q(this.f85673j, z13, th4, eVar, gVar, eVar.isEmpty()))) {
                            return;
                        }
                        synchronized (this) {
                            try {
                                long j14 = this.f85671h;
                                if (j14 != Long.MAX_VALUE) {
                                    j14 -= j13;
                                    this.f85671h = j14;
                                }
                                j12 = j14;
                                if (!this.f85670g) {
                                    this.f85669f = false;
                                    return;
                                }
                                this.f85670g = false;
                                z12 = this.f85673j;
                                z13 = this.f85675l;
                                th4 = this.f85674k;
                                if (th4 != null && th4 != (th2 = f85663m) && !this.f85666c) {
                                    this.f85674k = th2;
                                }
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public void I(T t11, c<T> cVar) {
            synchronized (this) {
                try {
                    if (this.f85667d.get() != cVar.f85661a) {
                        return;
                    }
                    this.f85668e.o(cVar, v.j(t11));
                    H();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void L(Throwable th2, long j11) {
            boolean z11;
            synchronized (this) {
                try {
                    if (this.f85667d.get() == j11) {
                        z11 = Z(th2);
                        this.f85675l = false;
                        this.f85672i = null;
                    } else {
                        z11 = true;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (z11) {
                H();
            } else {
                V(th2);
            }
        }

        public void Q() {
            this.f85664a.add(this.f85665b);
            this.f85664a.add(ec0.f.a(new a()));
            this.f85664a.setProducer(new b());
        }

        public void S(qb0.d dVar, long j11) {
            synchronized (this) {
                try {
                    if (this.f85667d.get() != j11) {
                        return;
                    }
                    long j12 = this.f85671h;
                    this.f85672i = dVar;
                    dVar.request(j12);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // qb0.c
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public void onNext(rx.c<? extends T> cVar) {
            c cVar2;
            long incrementAndGet = this.f85667d.incrementAndGet();
            qb0.h a11 = this.f85665b.a();
            if (a11 != null) {
                a11.unsubscribe();
            }
            synchronized (this) {
                cVar2 = new c(incrementAndGet, this);
                this.f85675l = true;
                this.f85672i = null;
            }
            this.f85665b.b(cVar2);
            cVar.J6(cVar2);
        }

        public void V(Throwable th2) {
            ac0.c.I(th2);
        }

        public boolean Z(Throwable th2) {
            Throwable th3 = this.f85674k;
            if (th3 == f85663m) {
                return false;
            }
            if (th3 == null) {
                this.f85674k = th2;
                return true;
            }
            if (!(th3 instanceof CompositeException)) {
                this.f85674k = new CompositeException(th3, th2);
                return true;
            }
            ArrayList arrayList = new ArrayList(((CompositeException) th3).getExceptions());
            arrayList.add(th2);
            this.f85674k = new CompositeException(arrayList);
            return true;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85673j = true;
            H();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            boolean Z;
            synchronized (this) {
                Z = Z(th2);
            }
            if (!Z) {
                V(th2);
            } else {
                this.f85673j = true;
                H();
            }
        }

        public boolean q(boolean z11, boolean z12, Throwable th2, rx.internal.util.atomic.e<Object> eVar, qb0.g<? super T> gVar, boolean z13) {
            if (this.f85666c) {
                if (!z11 || z12 || !z13) {
                    return false;
                }
                if (th2 != null) {
                    gVar.onError(th2);
                } else {
                    gVar.onCompleted();
                }
                return true;
            }
            if (th2 != null) {
                eVar.clear();
                gVar.onError(th2);
                return true;
            }
            if (!z11 || z12 || !z13) {
                return false;
            }
            gVar.onCompleted();
            return true;
        }
    }

    public k3(boolean z11) {
        this.f85658a = z11;
    }

    public static <T> k3<T> b(boolean z11) {
        return z11 ? (k3<T>) b.f85660a : (k3<T>) a.f85659a;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super rx.c<? extends T>> call(qb0.g<? super T> gVar) {
        d dVar = new d(gVar, this.f85658a);
        gVar.add(dVar);
        dVar.Q();
        return dVar;
    }
}
