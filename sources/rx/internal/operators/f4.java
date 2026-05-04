package rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import rx.c;
import rx.exceptions.MissingBackpressureException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class f4<R> implements c.b<R, rx.c<?>[]> {

    /* renamed from: a, reason: collision with root package name */
    public final wb0.y<? extends R> f85338a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<R> extends AtomicLong {

        /* renamed from: g, reason: collision with root package name */
        public static final int f85339g = (int) (rx.internal.util.j.f86718d * 0.7d);
        private static final long serialVersionUID = 5995274816189928317L;

        /* renamed from: a, reason: collision with root package name */
        public final qb0.c<? super R> f85340a;

        /* renamed from: b, reason: collision with root package name */
        public final wb0.y<? extends R> f85341b;

        /* renamed from: c, reason: collision with root package name */
        public final ec0.b f85342c;

        /* renamed from: d, reason: collision with root package name */
        public int f85343d;

        /* renamed from: e, reason: collision with root package name */
        public volatile Object[] f85344e;

        /* renamed from: f, reason: collision with root package name */
        public AtomicLong f85345f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.operators.f4$a$a, reason: collision with other inner class name */
        public final class C1084a extends qb0.g {

            /* renamed from: a, reason: collision with root package name */
            public final rx.internal.util.j f85346a = rx.internal.util.j.f();

            public C1084a() {
            }

            @Override // qb0.c
            public void onCompleted() {
                this.f85346a.n();
                a.this.b();
            }

            @Override // qb0.c
            public void onError(Throwable th2) {
                a.this.f85340a.onError(th2);
            }

            @Override // qb0.c
            public void onNext(Object obj) {
                try {
                    this.f85346a.r(obj);
                } catch (MissingBackpressureException e11) {
                    onError(e11);
                }
                a.this.b();
            }

            @Override // qb0.g
            public void onStart() {
                request(rx.internal.util.j.f86718d);
            }

            public void q(long j11) {
                request(j11);
            }
        }

        public a(qb0.g<? super R> gVar, wb0.y<? extends R> yVar) {
            ec0.b bVar = new ec0.b();
            this.f85342c = bVar;
            this.f85340a = gVar;
            this.f85341b = yVar;
            gVar.add(bVar);
        }

        public void a(rx.c[] cVarArr, AtomicLong atomicLong) {
            Object[] objArr = new Object[cVarArr.length];
            for (int i11 = 0; i11 < cVarArr.length; i11++) {
                C1084a c1084a = new C1084a();
                objArr[i11] = c1084a;
                this.f85342c.a(c1084a);
            }
            this.f85345f = atomicLong;
            this.f85344e = objArr;
            for (int i12 = 0; i12 < cVarArr.length; i12++) {
                cVarArr[i12].J6((C1084a) objArr[i12]);
            }
        }

        public void b() {
            Object[] objArr = this.f85344e;
            if (objArr == null || getAndIncrement() != 0) {
                return;
            }
            int length = objArr.length;
            qb0.c<? super R> cVar = this.f85340a;
            AtomicLong atomicLong = this.f85345f;
            while (true) {
                Object[] objArr2 = new Object[length];
                boolean z11 = true;
                for (int i11 = 0; i11 < length; i11++) {
                    rx.internal.util.j jVar = ((C1084a) objArr[i11]).f85346a;
                    Object C = jVar.C();
                    if (C == null) {
                        z11 = false;
                    } else {
                        if (jVar.i(C)) {
                            cVar.onCompleted();
                            this.f85342c.unsubscribe();
                            return;
                        }
                        objArr2[i11] = jVar.h(C);
                    }
                }
                if (z11 && atomicLong.get() > 0) {
                    try {
                        cVar.onNext(this.f85341b.call(objArr2));
                        atomicLong.decrementAndGet();
                        this.f85343d++;
                        for (Object obj : objArr) {
                            rx.internal.util.j jVar2 = ((C1084a) obj).f85346a;
                            jVar2.D();
                            if (jVar2.i(jVar2.C())) {
                                cVar.onCompleted();
                                this.f85342c.unsubscribe();
                                return;
                            }
                        }
                        if (this.f85343d > f85339g) {
                            for (Object obj2 : objArr) {
                                ((C1084a) obj2).q(this.f85343d);
                            }
                            this.f85343d = 0;
                        }
                    } catch (Throwable th2) {
                        vb0.a.g(th2, cVar, objArr2);
                        return;
                    }
                } else if (decrementAndGet() <= 0) {
                    return;
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<R> extends AtomicLong implements qb0.d {
        private static final long serialVersionUID = -1216676403723546796L;

        /* renamed from: a, reason: collision with root package name */
        public final a<R> f85348a;

        public b(a<R> aVar) {
            this.f85348a = aVar;
        }

        @Override // qb0.d
        public void request(long j11) {
            rx.internal.operators.a.b(this, j11);
            this.f85348a.b();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class c extends qb0.g<rx.c[]> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super R> f85349a;

        /* renamed from: b, reason: collision with root package name */
        public final a<R> f85350b;

        /* renamed from: c, reason: collision with root package name */
        public final b<R> f85351c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f85352d;

        public c(qb0.g<? super R> gVar, a<R> aVar, b<R> bVar) {
            this.f85349a = gVar;
            this.f85350b = aVar;
            this.f85351c = bVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f85352d) {
                return;
            }
            this.f85349a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85349a.onError(th2);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(rx.c[] cVarArr) {
            if (cVarArr == null || cVarArr.length == 0) {
                this.f85349a.onCompleted();
            } else {
                this.f85352d = true;
                this.f85350b.a(cVarArr, this.f85351c);
            }
        }
    }

    public f4(wb0.y<? extends R> yVar) {
        this.f85338a = yVar;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super rx.c[]> call(qb0.g<? super R> gVar) {
        a aVar = new a(gVar, this.f85338a);
        b bVar = new b(aVar);
        c cVar = new c(gVar, aVar, bVar);
        gVar.add(cVar);
        gVar.setProducer(bVar);
        return cVar;
    }

    public f4(wb0.q qVar) {
        this.f85338a = wb0.a0.g(qVar);
    }

    public f4(wb0.r rVar) {
        this.f85338a = wb0.a0.h(rVar);
    }

    public f4(wb0.s sVar) {
        this.f85338a = wb0.a0.i(sVar);
    }

    public f4(wb0.t tVar) {
        this.f85338a = wb0.a0.j(tVar);
    }

    public f4(wb0.u uVar) {
        this.f85338a = wb0.a0.k(uVar);
    }

    public f4(wb0.v vVar) {
        this.f85338a = wb0.a0.l(vVar);
    }

    public f4(wb0.w wVar) {
        this.f85338a = wb0.a0.m(wVar);
    }

    public f4(wb0.x xVar) {
        this.f85338a = wb0.a0.n(xVar);
    }
}
