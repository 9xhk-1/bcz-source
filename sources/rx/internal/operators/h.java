package rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.c;
import rx.exceptions.OnErrorThrowable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class h<T> extends rx.c<T> {

    /* renamed from: b, reason: collision with root package name */
    public final a<T> f85415b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends rx.internal.util.f implements qb0.c<T> {

        /* renamed from: k, reason: collision with root package name */
        public static final c<?>[] f85416k = new c[0];

        /* renamed from: f, reason: collision with root package name */
        public final rx.c<? extends T> f85417f;

        /* renamed from: g, reason: collision with root package name */
        public final ec0.e f85418g;

        /* renamed from: h, reason: collision with root package name */
        public volatile c<?>[] f85419h;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f85420i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f85421j;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.operators.h$a$a, reason: collision with other inner class name */
        public class C1085a extends qb0.g<T> {
            public C1085a() {
            }

            @Override // qb0.c
            public void onCompleted() {
                a.this.onCompleted();
            }

            @Override // qb0.c
            public void onError(Throwable th2) {
                a.this.onError(th2);
            }

            @Override // qb0.c
            public void onNext(T t11) {
                a.this.onNext(t11);
            }
        }

        public a(rx.c<? extends T> cVar, int i11) {
            super(i11);
            this.f85417f = cVar;
            this.f85419h = f85416k;
            this.f85418g = new ec0.e();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void k(c<T> cVar) {
            synchronized (this.f85418g) {
                c<?>[] cVarArr = this.f85419h;
                int length = cVarArr.length;
                c<?>[] cVarArr2 = new c[length + 1];
                System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                cVarArr2[length] = cVar;
                this.f85419h = cVarArr2;
            }
        }

        public void n() {
            C1085a c1085a = new C1085a();
            this.f85418g.b(c1085a);
            this.f85417f.J6(c1085a);
            this.f85420i = true;
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f85421j) {
                return;
            }
            this.f85421j = true;
            c(v.b());
            this.f85418g.unsubscribe();
            q();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f85421j) {
                return;
            }
            this.f85421j = true;
            c(v.c(th2));
            this.f85418g.unsubscribe();
            q();
        }

        @Override // qb0.c
        public void onNext(T t11) {
            if (this.f85421j) {
                return;
            }
            c(v.j(t11));
            q();
        }

        public void q() {
            for (c<?> cVar : this.f85419h) {
                cVar.b();
            }
        }

        public void r(c<T> cVar) {
            synchronized (this.f85418g) {
                try {
                    c<?>[] cVarArr = this.f85419h;
                    int length = cVarArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            i11 = -1;
                            break;
                        } else if (!cVarArr[i11].equals(cVar)) {
                            i11++;
                        }
                    }
                    if (i11 < 0) {
                        return;
                    }
                    if (length == 1) {
                        this.f85419h = f85416k;
                        return;
                    }
                    c<?>[] cVarArr2 = new c[length - 1];
                    System.arraycopy(cVarArr, 0, cVarArr2, 0, i11);
                    System.arraycopy(cVarArr, i11 + 1, cVarArr2, i11, (length - i11) - 1);
                    this.f85419h = cVarArr2;
                } finally {
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> extends AtomicBoolean implements c.a<T> {
        private static final long serialVersionUID = -2817751667698696782L;

        /* renamed from: a, reason: collision with root package name */
        public final a<T> f85423a;

        public b(a<T> aVar) {
            this.f85423a = aVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super T> gVar) {
            c<T> cVar = new c<>(gVar, this.f85423a);
            this.f85423a.k(cVar);
            gVar.add(cVar);
            gVar.setProducer(cVar);
            if (get() || !compareAndSet(false, true)) {
                return;
            }
            this.f85423a.n();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<T> extends AtomicLong implements qb0.d, qb0.h {
        private static final long serialVersionUID = -2557562030197141021L;

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f85424a;

        /* renamed from: b, reason: collision with root package name */
        public final a<T> f85425b;

        /* renamed from: c, reason: collision with root package name */
        public Object[] f85426c;

        /* renamed from: d, reason: collision with root package name */
        public int f85427d;

        /* renamed from: e, reason: collision with root package name */
        public int f85428e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f85429f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f85430g;

        public c(qb0.g<? super T> gVar, a<T> aVar) {
            this.f85424a = gVar;
            this.f85425b = aVar;
        }

        public long a(long j11) {
            return addAndGet(-j11);
        }

        public void b() {
            boolean z11;
            synchronized (this) {
                try {
                    if (this.f85429f) {
                        this.f85430g = true;
                        return;
                    }
                    this.f85429f = true;
                    try {
                        qb0.g<? super T> gVar = this.f85424a;
                        while (true) {
                            long j11 = get();
                            if (j11 < 0) {
                                return;
                            }
                            int g11 = this.f85425b.g();
                            try {
                                if (g11 != 0) {
                                    Object[] objArr = this.f85426c;
                                    if (objArr == null) {
                                        objArr = this.f85425b.e();
                                        this.f85426c = objArr;
                                    }
                                    int length = objArr.length - 1;
                                    int i11 = this.f85428e;
                                    int i12 = this.f85427d;
                                    if (j11 == 0) {
                                        Object obj = objArr[i12];
                                        if (v.f(obj)) {
                                            gVar.onCompleted();
                                            unsubscribe();
                                            return;
                                        } else if (v.g(obj)) {
                                            gVar.onError(v.d(obj));
                                            unsubscribe();
                                            return;
                                        }
                                    } else if (j11 > 0) {
                                        int i13 = 0;
                                        while (i11 < g11 && j11 > 0) {
                                            if (gVar.isUnsubscribed()) {
                                                return;
                                            }
                                            if (i12 == length) {
                                                objArr = (Object[]) objArr[length];
                                                i12 = 0;
                                            }
                                            Object obj2 = objArr[i12];
                                            try {
                                                if (v.a(gVar, obj2)) {
                                                    try {
                                                        unsubscribe();
                                                        return;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        z11 = true;
                                                        try {
                                                            vb0.a.e(th);
                                                            unsubscribe();
                                                            if (v.g(obj2) || v.f(obj2)) {
                                                                return;
                                                            }
                                                            gVar.onError(OnErrorThrowable.addValueAsLastCause(th, v.e(obj2)));
                                                            return;
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            if (!z11) {
                                                                synchronized (this) {
                                                                    this.f85429f = false;
                                                                }
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                }
                                                i12++;
                                                i11++;
                                                j11--;
                                                i13++;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                z11 = false;
                                            }
                                        }
                                        if (gVar.isUnsubscribed()) {
                                            return;
                                        }
                                        this.f85428e = i11;
                                        this.f85427d = i12;
                                        this.f85426c = objArr;
                                        a(i13);
                                    }
                                }
                                try {
                                    synchronized (this) {
                                        try {
                                            if (!this.f85430g) {
                                                this.f85429f = false;
                                                return;
                                            }
                                            this.f85430g = false;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                            } catch (Throwable th7) {
                                z11 = true;
                                th = th7;
                            }
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        z11 = false;
                    }
                } finally {
                }
            }
        }

        @Override // qb0.h
        public boolean isUnsubscribed() {
            return get() < 0;
        }

        @Override // qb0.d
        public void request(long j11) {
            long j12;
            long j13;
            do {
                j12 = get();
                if (j12 < 0) {
                    return;
                }
                j13 = j12 + j11;
                if (j13 < 0) {
                    j13 = Long.MAX_VALUE;
                }
            } while (!compareAndSet(j12, j13));
            b();
        }

        @Override // qb0.h
        public void unsubscribe() {
            if (get() < 0 || getAndSet(-1L) < 0) {
                return;
            }
            this.f85425b.r(this);
        }
    }

    public h(c.a<T> aVar, a<T> aVar2) {
        super(aVar);
        this.f85415b = aVar2;
    }

    public static <T> h<T> w7(rx.c<? extends T> cVar) {
        return x7(cVar, 16);
    }

    public static <T> h<T> x7(rx.c<? extends T> cVar, int i11) {
        if (i11 < 1) {
            throw new IllegalArgumentException("capacityHint > 0 required");
        }
        a aVar = new a(cVar, i11);
        return new h<>(new b(aVar), aVar);
    }

    public boolean y7() {
        return this.f85415b.f85419h.length != 0;
    }

    public boolean z7() {
        return this.f85415b.f85420i;
    }
}
