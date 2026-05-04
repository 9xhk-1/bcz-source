package rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class b4<T, U, V> implements c.b<rx.c<T>, T> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<? extends U> f85146a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.p<? super U, ? extends rx.c<? extends V>> f85147b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<U> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f85148a;

        public a(c cVar) {
            this.f85148a = cVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85148a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85148a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(U u11) {
            this.f85148a.q(u11);
        }

        @Override // qb0.g
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.c<T> f85150a;

        /* renamed from: b, reason: collision with root package name */
        public final rx.c<T> f85151b;

        public b(qb0.c<T> cVar, rx.c<T> cVar2) {
            this.f85150a = new zb0.f(cVar);
            this.f85151b = cVar2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class c extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super rx.c<T>> f85152a;

        /* renamed from: b, reason: collision with root package name */
        public final ec0.b f85153b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f85154c = new Object();

        /* renamed from: d, reason: collision with root package name */
        public final List<b<T>> f85155d = new LinkedList();

        /* renamed from: e, reason: collision with root package name */
        public boolean f85156e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends qb0.g<V> {

            /* renamed from: a, reason: collision with root package name */
            public boolean f85158a = true;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f85159b;

            public a(b bVar) {
                this.f85159b = bVar;
            }

            @Override // qb0.c
            public void onCompleted() {
                if (this.f85158a) {
                    this.f85158a = false;
                    c.this.D(this.f85159b);
                    c.this.f85153b.e(this);
                }
            }

            @Override // qb0.c
            public void onError(Throwable th2) {
                c.this.onError(th2);
            }

            @Override // qb0.c
            public void onNext(V v11) {
                onCompleted();
            }
        }

        public c(qb0.g<? super rx.c<T>> gVar, ec0.b bVar) {
            this.f85152a = new zb0.g(gVar);
            this.f85153b = bVar;
        }

        public b<T> C() {
            dc0.i y72 = dc0.i.y7();
            return new b<>(y72, y72);
        }

        public void D(b<T> bVar) {
            boolean z11;
            synchronized (this.f85154c) {
                try {
                    if (this.f85156e) {
                        return;
                    }
                    Iterator<b<T>> it = this.f85155d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z11 = false;
                            break;
                        } else if (it.next() == bVar) {
                            it.remove();
                            z11 = true;
                            break;
                        }
                    }
                    if (z11) {
                        bVar.f85150a.onCompleted();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // qb0.c
        public void onCompleted() {
            try {
                synchronized (this.f85154c) {
                    if (!this.f85156e) {
                        this.f85156e = true;
                        ArrayList arrayList = new ArrayList(this.f85155d);
                        this.f85155d.clear();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((b) it.next()).f85150a.onCompleted();
                        }
                        this.f85152a.onCompleted();
                    }
                }
                this.f85153b.unsubscribe();
            } catch (Throwable th2) {
                this.f85153b.unsubscribe();
                throw th2;
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            try {
                synchronized (this.f85154c) {
                    if (!this.f85156e) {
                        this.f85156e = true;
                        ArrayList arrayList = new ArrayList(this.f85155d);
                        this.f85155d.clear();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((b) it.next()).f85150a.onError(th2);
                        }
                        this.f85152a.onError(th2);
                    }
                }
                this.f85153b.unsubscribe();
            } catch (Throwable th3) {
                this.f85153b.unsubscribe();
                throw th3;
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            synchronized (this.f85154c) {
                try {
                    if (this.f85156e) {
                        return;
                    }
                    Iterator it = new ArrayList(this.f85155d).iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).f85150a.onNext(t11);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // qb0.g
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        public void q(U u11) {
            b<T> C = C();
            synchronized (this.f85154c) {
                try {
                    if (this.f85156e) {
                        return;
                    }
                    this.f85155d.add(C);
                    this.f85152a.onNext(C.f85151b);
                    try {
                        rx.c<? extends V> call = b4.this.f85147b.call(u11);
                        a aVar = new a(C);
                        this.f85153b.a(aVar);
                        call.J6(aVar);
                    } catch (Throwable th2) {
                        onError(th2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public b4(rx.c<? extends U> cVar, wb0.p<? super U, ? extends rx.c<? extends V>> pVar) {
        this.f85146a = cVar;
        this.f85147b = pVar;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super rx.c<T>> gVar) {
        ec0.b bVar = new ec0.b();
        gVar.add(bVar);
        c cVar = new c(gVar, bVar);
        a aVar = new a(cVar);
        bVar.a(cVar);
        bVar.a(aVar);
        this.f85146a.J6(aVar);
        return cVar;
    }
}
