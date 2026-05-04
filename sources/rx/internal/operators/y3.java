package rx.internal.operators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class y3<T, U> implements c.b<rx.c<T>, T> {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f86419b = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<U> f86420a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T, U> extends qb0.g<U> {

        /* renamed from: a, reason: collision with root package name */
        public final b<T> f86421a;

        public a(b<T> bVar) {
            this.f86421a = bVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f86421a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f86421a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(U u11) {
            this.f86421a.L();
        }

        @Override // qb0.g
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super rx.c<T>> f86422a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f86423b = new Object();

        /* renamed from: c, reason: collision with root package name */
        public qb0.c<T> f86424c;

        /* renamed from: d, reason: collision with root package name */
        public rx.c<T> f86425d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f86426e;

        /* renamed from: f, reason: collision with root package name */
        public List<Object> f86427f;

        public b(qb0.g<? super rx.c<T>> gVar) {
            this.f86422a = new zb0.g(gVar);
        }

        public void C() {
            dc0.i y72 = dc0.i.y7();
            this.f86424c = y72;
            this.f86425d = y72;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void D(List<Object> list) {
            if (list == null) {
                return;
            }
            for (Object obj : list) {
                if (obj == y3.f86419b) {
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
            qb0.c<T> cVar = this.f86424c;
            if (cVar != null) {
                cVar.onNext(t11);
            }
        }

        public void H(Throwable th2) {
            qb0.c<T> cVar = this.f86424c;
            this.f86424c = null;
            this.f86425d = null;
            if (cVar != null) {
                cVar.onError(th2);
            }
            this.f86422a.onError(th2);
            unsubscribe();
        }

        public void I() {
            qb0.c<T> cVar = this.f86424c;
            if (cVar != null) {
                cVar.onCompleted();
            }
            C();
            this.f86422a.onNext(this.f86425d);
        }

        public void L() {
            synchronized (this.f86423b) {
                try {
                    if (this.f86426e) {
                        if (this.f86427f == null) {
                            this.f86427f = new ArrayList();
                        }
                        this.f86427f.add(y3.f86419b);
                        return;
                    }
                    List<Object> list = this.f86427f;
                    this.f86427f = null;
                    boolean z11 = true;
                    this.f86426e = true;
                    boolean z12 = true;
                    while (true) {
                        try {
                            D(list);
                            if (z12) {
                                I();
                                z12 = false;
                            }
                            try {
                                synchronized (this.f86423b) {
                                    try {
                                        List<Object> list2 = this.f86427f;
                                        this.f86427f = null;
                                        if (list2 == null) {
                                            this.f86426e = false;
                                            return;
                                        } else {
                                            if (this.f86422a.isUnsubscribed()) {
                                                synchronized (this.f86423b) {
                                                    this.f86426e = false;
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
                                                synchronized (this.f86423b) {
                                                    this.f86426e = false;
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
            synchronized (this.f86423b) {
                try {
                    if (this.f86426e) {
                        if (this.f86427f == null) {
                            this.f86427f = new ArrayList();
                        }
                        this.f86427f.add(v.b());
                        return;
                    }
                    List<Object> list = this.f86427f;
                    this.f86427f = null;
                    this.f86426e = true;
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
            synchronized (this.f86423b) {
                try {
                    if (this.f86426e) {
                        this.f86427f = Collections.singletonList(v.c(th2));
                        return;
                    }
                    this.f86427f = null;
                    this.f86426e = true;
                    H(th2);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            synchronized (this.f86423b) {
                try {
                    if (this.f86426e) {
                        if (this.f86427f == null) {
                            this.f86427f = new ArrayList();
                        }
                        this.f86427f.add(t11);
                        return;
                    }
                    List<Object> list = this.f86427f;
                    this.f86427f = null;
                    boolean z11 = true;
                    this.f86426e = true;
                    boolean z12 = true;
                    while (true) {
                        try {
                            D(list);
                            if (z12) {
                                E(t11);
                                z12 = false;
                            }
                            try {
                                synchronized (this.f86423b) {
                                    try {
                                        List<Object> list2 = this.f86427f;
                                        this.f86427f = null;
                                        if (list2 == null) {
                                            this.f86426e = false;
                                            return;
                                        } else {
                                            if (this.f86422a.isUnsubscribed()) {
                                                synchronized (this.f86423b) {
                                                    this.f86426e = false;
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
                                                synchronized (this.f86423b) {
                                                    this.f86426e = false;
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
            qb0.c<T> cVar = this.f86424c;
            this.f86424c = null;
            this.f86425d = null;
            if (cVar != null) {
                cVar.onCompleted();
            }
            this.f86422a.onCompleted();
            unsubscribe();
        }
    }

    public y3(rx.c<U> cVar) {
        this.f86420a = cVar;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super rx.c<T>> gVar) {
        b bVar = new b(gVar);
        a aVar = new a(bVar);
        gVar.add(bVar);
        gVar.add(aVar);
        bVar.L();
        this.f86420a.J6(aVar);
        return bVar;
    }
}
