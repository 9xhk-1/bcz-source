package rx.internal.operators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class o0<T1, T2, D1, D2, R> implements c.a<R> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<T1> f85797a;

    /* renamed from: b, reason: collision with root package name */
    public final rx.c<T2> f85798b;

    /* renamed from: c, reason: collision with root package name */
    public final wb0.p<? super T1, ? extends rx.c<D1>> f85799c;

    /* renamed from: d, reason: collision with root package name */
    public final wb0.p<? super T2, ? extends rx.c<D2>> f85800d;

    /* renamed from: e, reason: collision with root package name */
    public final wb0.q<? super T1, ? super rx.c<T2>, ? extends R> f85801e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> implements c.a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final ec0.d f85819a;

        /* renamed from: b, reason: collision with root package name */
        public final rx.c<T> f85820b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public final class a extends qb0.g<T> {

            /* renamed from: a, reason: collision with root package name */
            public final qb0.g<? super T> f85821a;

            /* renamed from: b, reason: collision with root package name */
            public final qb0.h f85822b;

            public a(qb0.g<? super T> gVar, qb0.h hVar) {
                super(gVar);
                this.f85821a = gVar;
                this.f85822b = hVar;
            }

            @Override // qb0.c
            public void onCompleted() {
                this.f85821a.onCompleted();
                this.f85822b.unsubscribe();
            }

            @Override // qb0.c
            public void onError(Throwable th2) {
                this.f85821a.onError(th2);
                this.f85822b.unsubscribe();
            }

            @Override // qb0.c
            public void onNext(T t11) {
                this.f85821a.onNext(t11);
            }
        }

        public b(rx.c<T> cVar, ec0.d dVar) {
            this.f85819a = dVar;
            this.f85820b = cVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super T> gVar) {
            qb0.h a11 = this.f85819a.a();
            a aVar = new a(gVar, a11);
            aVar.add(a11);
            this.f85820b.J6(aVar);
        }
    }

    public o0(rx.c<T1> cVar, rx.c<T2> cVar2, wb0.p<? super T1, ? extends rx.c<D1>> pVar, wb0.p<? super T2, ? extends rx.c<D2>> pVar2, wb0.q<? super T1, ? super rx.c<T2>, ? extends R> qVar) {
        this.f85797a = cVar;
        this.f85798b = cVar2;
        this.f85799c = pVar;
        this.f85800d = pVar2;
        this.f85801e = qVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super R> gVar) {
        a aVar = new a(new zb0.g(gVar));
        gVar.add(aVar);
        aVar.h();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends HashMap<Integer, qb0.c<T2>> implements qb0.h {
        private static final long serialVersionUID = -3035156013812425335L;

        /* renamed from: a, reason: collision with root package name */
        public final ec0.d f85802a;

        /* renamed from: b, reason: collision with root package name */
        public final qb0.g<? super R> f85803b;

        /* renamed from: c, reason: collision with root package name */
        public final ec0.b f85804c;

        /* renamed from: d, reason: collision with root package name */
        public int f85805d;

        /* renamed from: e, reason: collision with root package name */
        public int f85806e;

        /* renamed from: f, reason: collision with root package name */
        public final Map<Integer, T2> f85807f = new HashMap();

        /* renamed from: g, reason: collision with root package name */
        public boolean f85808g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f85809h;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.operators.o0$a$a, reason: collision with other inner class name */
        public final class C1094a extends qb0.g<D1> {

            /* renamed from: a, reason: collision with root package name */
            public final int f85811a;

            /* renamed from: b, reason: collision with root package name */
            public boolean f85812b = true;

            public C1094a(int i11) {
                this.f85811a = i11;
            }

            @Override // qb0.c
            public void onCompleted() {
                qb0.c<T2> remove;
                if (this.f85812b) {
                    this.f85812b = false;
                    synchronized (a.this) {
                        remove = a.this.i().remove(Integer.valueOf(this.f85811a));
                    }
                    if (remove != null) {
                        remove.onCompleted();
                    }
                    a.this.f85804c.e(this);
                }
            }

            @Override // qb0.c
            public void onError(Throwable th2) {
                a.this.g(th2);
            }

            @Override // qb0.c
            public void onNext(D1 d12) {
                onCompleted();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public final class b extends qb0.g<T1> {
            public b() {
            }

            @Override // qb0.c
            public void onCompleted() {
                ArrayList arrayList;
                synchronized (a.this) {
                    try {
                        a aVar = a.this;
                        aVar.f85808g = true;
                        if (aVar.f85809h) {
                            arrayList = new ArrayList(a.this.i().values());
                            a.this.i().clear();
                            a.this.f85807f.clear();
                        } else {
                            arrayList = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                a.this.b(arrayList);
            }

            @Override // qb0.c
            public void onError(Throwable th2) {
                a.this.d(th2);
            }

            @Override // qb0.c
            public void onNext(T1 t12) {
                int i11;
                ArrayList arrayList;
                try {
                    dc0.c y72 = dc0.c.y7();
                    zb0.f fVar = new zb0.f(y72);
                    synchronized (a.this) {
                        a aVar = a.this;
                        i11 = aVar.f85805d;
                        aVar.f85805d = i11 + 1;
                        aVar.i().put(Integer.valueOf(i11), fVar);
                    }
                    rx.c I6 = rx.c.I6(new b(y72, a.this.f85802a));
                    rx.c<D1> call = o0.this.f85799c.call(t12);
                    C1094a c1094a = a.this.new C1094a(i11);
                    a.this.f85804c.a(c1094a);
                    call.J6(c1094a);
                    R call2 = o0.this.f85801e.call(t12, I6);
                    synchronized (a.this) {
                        arrayList = new ArrayList(a.this.f85807f.values());
                    }
                    a.this.f85803b.onNext(call2);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        fVar.onNext(it.next());
                    }
                } catch (Throwable th2) {
                    vb0.a.f(th2, this);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public final class c extends qb0.g<D2> {

            /* renamed from: a, reason: collision with root package name */
            public final int f85815a;

            /* renamed from: b, reason: collision with root package name */
            public boolean f85816b = true;

            public c(int i11) {
                this.f85815a = i11;
            }

            @Override // qb0.c
            public void onCompleted() {
                if (this.f85816b) {
                    this.f85816b = false;
                    synchronized (a.this) {
                        a.this.f85807f.remove(Integer.valueOf(this.f85815a));
                    }
                    a.this.f85804c.e(this);
                }
            }

            @Override // qb0.c
            public void onError(Throwable th2) {
                a.this.g(th2);
            }

            @Override // qb0.c
            public void onNext(D2 d22) {
                onCompleted();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public final class d extends qb0.g<T2> {
            public d() {
            }

            @Override // qb0.c
            public void onCompleted() {
                ArrayList arrayList;
                synchronized (a.this) {
                    try {
                        a aVar = a.this;
                        aVar.f85809h = true;
                        if (aVar.f85808g) {
                            arrayList = new ArrayList(a.this.i().values());
                            a.this.i().clear();
                            a.this.f85807f.clear();
                        } else {
                            arrayList = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                a.this.b(arrayList);
            }

            @Override // qb0.c
            public void onError(Throwable th2) {
                a.this.d(th2);
            }

            @Override // qb0.c
            public void onNext(T2 t22) {
                int i11;
                ArrayList arrayList;
                try {
                    synchronized (a.this) {
                        a aVar = a.this;
                        i11 = aVar.f85806e;
                        aVar.f85806e = i11 + 1;
                        aVar.f85807f.put(Integer.valueOf(i11), t22);
                    }
                    rx.c<D2> call = o0.this.f85800d.call(t22);
                    c cVar = a.this.new c(i11);
                    a.this.f85804c.a(cVar);
                    call.J6(cVar);
                    synchronized (a.this) {
                        arrayList = new ArrayList(a.this.i().values());
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((qb0.c) it.next()).onNext(t22);
                    }
                } catch (Throwable th2) {
                    vb0.a.f(th2, this);
                }
            }
        }

        public a(qb0.g<? super R> gVar) {
            this.f85803b = gVar;
            ec0.b bVar = new ec0.b();
            this.f85804c = bVar;
            this.f85802a = new ec0.d(bVar);
        }

        public void b(List<qb0.c<T2>> list) {
            if (list != null) {
                Iterator<qb0.c<T2>> it = list.iterator();
                while (it.hasNext()) {
                    it.next().onCompleted();
                }
                this.f85803b.onCompleted();
                this.f85802a.unsubscribe();
            }
        }

        public void d(Throwable th2) {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(i().values());
                i().clear();
                this.f85807f.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((qb0.c) it.next()).onError(th2);
            }
            this.f85803b.onError(th2);
            this.f85802a.unsubscribe();
        }

        public void g(Throwable th2) {
            synchronized (this) {
                i().clear();
                this.f85807f.clear();
            }
            this.f85803b.onError(th2);
            this.f85802a.unsubscribe();
        }

        public void h() {
            b bVar = new b();
            d dVar = new d();
            this.f85804c.a(bVar);
            this.f85804c.a(dVar);
            o0.this.f85797a.J6(bVar);
            o0.this.f85798b.J6(dVar);
        }

        @Override // qb0.h
        public boolean isUnsubscribed() {
            return this.f85802a.isUnsubscribed();
        }

        @Override // qb0.h
        public void unsubscribe() {
            this.f85802a.unsubscribe();
        }

        public Map<Integer, qb0.c<T2>> i() {
            return this;
        }
    }
}
