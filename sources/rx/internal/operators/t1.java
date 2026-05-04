package rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import rx.c;
import rx.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class t1<T> implements c.b<List<T>, T> {

    /* renamed from: a, reason: collision with root package name */
    public final long f86078a;

    /* renamed from: b, reason: collision with root package name */
    public final long f86079b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f86080c;

    /* renamed from: d, reason: collision with root package name */
    public final int f86081d;

    /* renamed from: e, reason: collision with root package name */
    public final rx.d f86082e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super List<T>> f86083a;

        /* renamed from: b, reason: collision with root package name */
        public final d.a f86084b;

        /* renamed from: c, reason: collision with root package name */
        public List<T> f86085c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public boolean f86086d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.operators.t1$a$a, reason: collision with other inner class name */
        public class C1100a implements wb0.a {
            public C1100a() {
            }

            @Override // wb0.a
            public void call() {
                a.this.q();
            }
        }

        public a(qb0.g<? super List<T>> gVar, d.a aVar) {
            this.f86083a = gVar;
            this.f86084b = aVar;
        }

        public void C() {
            d.a aVar = this.f86084b;
            C1100a c1100a = new C1100a();
            t1 t1Var = t1.this;
            long j11 = t1Var.f86078a;
            aVar.n(c1100a, j11, j11, t1Var.f86080c);
        }

        @Override // qb0.c
        public void onCompleted() {
            try {
                this.f86084b.unsubscribe();
                synchronized (this) {
                    try {
                        if (this.f86086d) {
                            return;
                        }
                        this.f86086d = true;
                        List<T> list = this.f86085c;
                        this.f86085c = null;
                        this.f86083a.onNext(list);
                        this.f86083a.onCompleted();
                        unsubscribe();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                vb0.a.f(th3, this.f86083a);
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            synchronized (this) {
                try {
                    if (this.f86086d) {
                        return;
                    }
                    this.f86086d = true;
                    this.f86085c = null;
                    this.f86083a.onError(th2);
                    unsubscribe();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            List<T> list;
            synchronized (this) {
                try {
                    if (this.f86086d) {
                        return;
                    }
                    this.f86085c.add(t11);
                    if (this.f86085c.size() == t1.this.f86081d) {
                        list = this.f86085c;
                        this.f86085c = new ArrayList();
                    } else {
                        list = null;
                    }
                    if (list != null) {
                        this.f86083a.onNext(list);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void q() {
            synchronized (this) {
                try {
                    if (this.f86086d) {
                        return;
                    }
                    List<T> list = this.f86085c;
                    this.f86085c = new ArrayList();
                    try {
                        this.f86083a.onNext(list);
                    } catch (Throwable th2) {
                        vb0.a.f(th2, this);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super List<T>> f86089a;

        /* renamed from: b, reason: collision with root package name */
        public final d.a f86090b;

        /* renamed from: c, reason: collision with root package name */
        public final List<List<T>> f86091c = new LinkedList();

        /* renamed from: d, reason: collision with root package name */
        public boolean f86092d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements wb0.a {
            public a() {
            }

            @Override // wb0.a
            public void call() {
                b.this.D();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.operators.t1$b$b, reason: collision with other inner class name */
        public class C1101b implements wb0.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ List f86095a;

            public C1101b(List list) {
                this.f86095a = list;
            }

            @Override // wb0.a
            public void call() {
                b.this.q(this.f86095a);
            }
        }

        public b(qb0.g<? super List<T>> gVar, d.a aVar) {
            this.f86089a = gVar;
            this.f86090b = aVar;
        }

        public void C() {
            d.a aVar = this.f86090b;
            a aVar2 = new a();
            t1 t1Var = t1.this;
            long j11 = t1Var.f86079b;
            aVar.n(aVar2, j11, j11, t1Var.f86080c);
        }

        public void D() {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                try {
                    if (this.f86092d) {
                        return;
                    }
                    this.f86091c.add(arrayList);
                    d.a aVar = this.f86090b;
                    C1101b c1101b = new C1101b(arrayList);
                    t1 t1Var = t1.this;
                    aVar.j(c1101b, t1Var.f86078a, t1Var.f86080c);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // qb0.c
        public void onCompleted() {
            try {
                synchronized (this) {
                    try {
                        if (this.f86092d) {
                            return;
                        }
                        this.f86092d = true;
                        LinkedList linkedList = new LinkedList(this.f86091c);
                        this.f86091c.clear();
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            this.f86089a.onNext((List) it.next());
                        }
                        this.f86089a.onCompleted();
                        unsubscribe();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                vb0.a.f(th3, this.f86089a);
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            synchronized (this) {
                try {
                    if (this.f86092d) {
                        return;
                    }
                    this.f86092d = true;
                    this.f86091c.clear();
                    this.f86089a.onError(th2);
                    unsubscribe();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            synchronized (this) {
                try {
                    if (this.f86092d) {
                        return;
                    }
                    Iterator<List<T>> it = this.f86091c.iterator();
                    LinkedList linkedList = null;
                    while (it.hasNext()) {
                        List<T> next = it.next();
                        next.add(t11);
                        if (next.size() == t1.this.f86081d) {
                            it.remove();
                            if (linkedList == null) {
                                linkedList = new LinkedList();
                            }
                            linkedList.add(next);
                        }
                    }
                    if (linkedList != null) {
                        Iterator it2 = linkedList.iterator();
                        while (it2.hasNext()) {
                            this.f86089a.onNext((List) it2.next());
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void q(List<T> list) {
            boolean z11;
            synchronized (this) {
                try {
                    if (this.f86092d) {
                        return;
                    }
                    Iterator<List<T>> it = this.f86091c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z11 = false;
                            break;
                        } else if (it.next() == list) {
                            it.remove();
                            z11 = true;
                            break;
                        }
                    }
                    if (z11) {
                        try {
                            this.f86089a.onNext(list);
                        } catch (Throwable th2) {
                            vb0.a.f(th2, this);
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public t1(long j11, long j12, TimeUnit timeUnit, int i11, rx.d dVar) {
        this.f86078a = j11;
        this.f86079b = j12;
        this.f86080c = timeUnit;
        this.f86081d = i11;
        this.f86082e = dVar;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super List<T>> gVar) {
        d.a a11 = this.f86082e.a();
        zb0.g gVar2 = new zb0.g(gVar);
        if (this.f86078a == this.f86079b) {
            a aVar = new a(gVar2, a11);
            aVar.add(a11);
            gVar.add(aVar);
            aVar.C();
            return aVar;
        }
        b bVar = new b(gVar2, a11);
        bVar.add(a11);
        gVar.add(bVar);
        bVar.D();
        bVar.C();
        return bVar;
    }
}
