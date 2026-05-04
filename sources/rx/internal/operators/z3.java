package rx.internal.operators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class z3<T, U> implements c.b<rx.c<T>, T> {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f86483b = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final wb0.o<? extends rx.c<? extends U>> f86484a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T, U> extends qb0.g<U> {

        /* renamed from: a, reason: collision with root package name */
        public final b<T, U> f86485a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f86486b;

        public a(b<T, U> bVar) {
            this.f86485a = bVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f86486b) {
                return;
            }
            this.f86486b = true;
            this.f86485a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f86485a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(U u11) {
            if (this.f86486b) {
                return;
            }
            this.f86486b = true;
            this.f86485a.L();
        }

        @Override // qb0.g
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T, U> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super rx.c<T>> f86487a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f86488b = new Object();

        /* renamed from: c, reason: collision with root package name */
        public qb0.c<T> f86489c;

        /* renamed from: d, reason: collision with root package name */
        public rx.c<T> f86490d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f86491e;

        /* renamed from: f, reason: collision with root package name */
        public List<Object> f86492f;

        /* renamed from: g, reason: collision with root package name */
        public final ec0.e f86493g;

        /* renamed from: h, reason: collision with root package name */
        public final wb0.o<? extends rx.c<? extends U>> f86494h;

        public b(qb0.g<? super rx.c<T>> gVar, wb0.o<? extends rx.c<? extends U>> oVar) {
            this.f86487a = new zb0.g(gVar);
            ec0.e eVar = new ec0.e();
            this.f86493g = eVar;
            this.f86494h = oVar;
            add(eVar);
        }

        public void C() {
            dc0.i y72 = dc0.i.y7();
            this.f86489c = y72;
            this.f86490d = y72;
            try {
                rx.c<? extends U> call = this.f86494h.call();
                a aVar = new a(this);
                this.f86493g.b(aVar);
                call.J6(aVar);
            } catch (Throwable th2) {
                this.f86487a.onError(th2);
                unsubscribe();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void D(List<Object> list) {
            if (list == null) {
                return;
            }
            for (Object obj : list) {
                if (obj == z3.f86483b) {
                    I();
                } else if (v.g(obj)) {
                    H(v.d(obj));
                    return;
                } else {
                    if (v.f(obj)) {
                        q();
                        return;
                    }
                    E(obj);
                }
            }
        }

        public void E(T t11) {
            qb0.c<T> cVar = this.f86489c;
            if (cVar != null) {
                cVar.onNext(t11);
            }
        }

        public void H(Throwable th2) {
            qb0.c<T> cVar = this.f86489c;
            this.f86489c = null;
            this.f86490d = null;
            if (cVar != null) {
                cVar.onError(th2);
            }
            this.f86487a.onError(th2);
            unsubscribe();
        }

        public void I() {
            qb0.c<T> cVar = this.f86489c;
            if (cVar != null) {
                cVar.onCompleted();
            }
            C();
            this.f86487a.onNext(this.f86490d);
        }

        public void L() {
            synchronized (this.f86488b) {
                try {
                    if (this.f86491e) {
                        if (this.f86492f == null) {
                            this.f86492f = new ArrayList();
                        }
                        this.f86492f.add(z3.f86483b);
                        return;
                    }
                    List<Object> list = this.f86492f;
                    this.f86492f = null;
                    boolean z11 = true;
                    this.f86491e = true;
                    boolean z12 = true;
                    while (true) {
                        try {
                            D(list);
                            if (z12) {
                                I();
                                z12 = false;
                            }
                            try {
                                synchronized (this.f86488b) {
                                    try {
                                        List<Object> list2 = this.f86492f;
                                        this.f86492f = null;
                                        if (list2 == null) {
                                            this.f86491e = false;
                                            return;
                                        } else {
                                            if (this.f86487a.isUnsubscribed()) {
                                                synchronized (this.f86488b) {
                                                    this.f86491e = false;
                                                }
                                                return;
                                            }
                                            list = list2;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z11 = false;
                                        try {
                                            throw th;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            if (!z11) {
                                                synchronized (this.f86488b) {
                                                    this.f86491e = false;
                                                }
                                            }
                                            throw th;
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            z11 = false;
                        }
                    }
                } finally {
                }
            }
        }

        @Override // qb0.c
        public void onCompleted() {
            synchronized (this.f86488b) {
                try {
                    if (this.f86491e) {
                        if (this.f86492f == null) {
                            this.f86492f = new ArrayList();
                        }
                        this.f86492f.add(v.b());
                        return;
                    }
                    List<Object> list = this.f86492f;
                    this.f86492f = null;
                    this.f86491e = true;
                    try {
                        D(list);
                        q();
                    } catch (Throwable th2) {
                        H(th2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            synchronized (this.f86488b) {
                try {
                    if (this.f86491e) {
                        this.f86492f = Collections.singletonList(v.c(th2));
                        return;
                    }
                    this.f86492f = null;
                    this.f86491e = true;
                    H(th2);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            synchronized (this.f86488b) {
                try {
                    if (this.f86491e) {
                        if (this.f86492f == null) {
                            this.f86492f = new ArrayList();
                        }
                        this.f86492f.add(t11);
                        return;
                    }
                    List<Object> list = this.f86492f;
                    this.f86492f = null;
                    boolean z11 = true;
                    this.f86491e = true;
                    boolean z12 = true;
                    while (true) {
                        try {
                            D(list);
                            if (z12) {
                                E(t11);
                                z12 = false;
                            }
                            try {
                                synchronized (this.f86488b) {
                                    try {
                                        List<Object> list2 = this.f86492f;
                                        this.f86492f = null;
                                        if (list2 == null) {
                                            this.f86491e = false;
                                            return;
                                        } else {
                                            if (this.f86487a.isUnsubscribed()) {
                                                synchronized (this.f86488b) {
                                                    this.f86491e = false;
                                                }
                                                return;
                                            }
                                            list = list2;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z11 = false;
                                        try {
                                            throw th;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            if (!z11) {
                                                synchronized (this.f86488b) {
                                                    this.f86491e = false;
                                                }
                                            }
                                            throw th;
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            z11 = false;
                        }
                    }
                } finally {
                }
            }
        }

        @Override // qb0.g
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        public void q() {
            qb0.c<T> cVar = this.f86489c;
            this.f86489c = null;
            this.f86490d = null;
            if (cVar != null) {
                cVar.onCompleted();
            }
            this.f86487a.onCompleted();
            unsubscribe();
        }
    }

    public z3(wb0.o<? extends rx.c<? extends U>> oVar) {
        this.f86484a = oVar;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super rx.c<T>> gVar) {
        b bVar = new b(gVar, this.f86484a);
        gVar.add(bVar);
        bVar.L();
        return bVar;
    }
}
