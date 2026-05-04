package rx.internal.operators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import rx.c;
import rx.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class c4<T> implements c.b<rx.c<T>, T> {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f85195f = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final long f85196a;

    /* renamed from: b, reason: collision with root package name */
    public final long f85197b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f85198c;

    /* renamed from: d, reason: collision with root package name */
    public final rx.d f85199d;

    /* renamed from: e, reason: collision with root package name */
    public final int f85200e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.c<T> f85201a;

        /* renamed from: b, reason: collision with root package name */
        public final rx.c<T> f85202b;

        /* renamed from: c, reason: collision with root package name */
        public int f85203c;

        public a(qb0.c<T> cVar, rx.c<T> cVar2) {
            this.f85201a = new zb0.f(cVar);
            this.f85202b = cVar2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super rx.c<T>> f85204a;

        /* renamed from: b, reason: collision with root package name */
        public final d.a f85205b;

        /* renamed from: d, reason: collision with root package name */
        public List<Object> f85207d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f85208e;

        /* renamed from: c, reason: collision with root package name */
        public final Object f85206c = new Object();

        /* renamed from: f, reason: collision with root package name */
        public volatile d<T> f85209f = d.c();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements wb0.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c4 f85211a;

            public a(c4 c4Var) {
                this.f85211a = c4Var;
            }

            @Override // wb0.a
            public void call() {
                if (b.this.f85209f.f85224a == null) {
                    b.this.unsubscribe();
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.operators.c4$b$b, reason: collision with other inner class name */
        public class C1081b implements wb0.a {
            public C1081b() {
            }

            @Override // wb0.a
            public void call() {
                b.this.H();
            }
        }

        public b(qb0.g<? super rx.c<T>> gVar, d.a aVar) {
            this.f85204a = new zb0.g(gVar);
            this.f85205b = aVar;
            gVar.add(ec0.f.a(new a(c4.this)));
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
        
            return true;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean C(java.util.List<java.lang.Object> r5) {
            /*
                r4 = this;
                r0 = 1
                if (r5 != 0) goto L4
                return r0
            L4:
                java.util.Iterator r5 = r5.iterator()
            L8:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L3d
                java.lang.Object r1 = r5.next()
                java.lang.Object r2 = rx.internal.operators.c4.f85195f
                r3 = 0
                if (r1 != r2) goto L1e
                boolean r1 = r4.I()
                if (r1 != 0) goto L8
                return r3
            L1e:
                boolean r2 = rx.internal.operators.v.g(r1)
                if (r2 == 0) goto L2c
                java.lang.Throwable r5 = rx.internal.operators.v.d(r1)
                r4.E(r5)
                goto L3d
            L2c:
                boolean r2 = rx.internal.operators.v.f(r1)
                if (r2 == 0) goto L36
                r4.q()
                goto L3d
            L36:
                boolean r1 = r4.D(r1)
                if (r1 != 0) goto L8
                return r3
            L3d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.c4.b.C(java.util.List):boolean");
        }

        public boolean D(T t11) {
            d<T> d11;
            d<T> dVar = this.f85209f;
            if (dVar.f85224a == null) {
                if (!I()) {
                    return false;
                }
                dVar = this.f85209f;
            }
            dVar.f85224a.onNext(t11);
            if (dVar.f85226c == c4.this.f85200e - 1) {
                dVar.f85224a.onCompleted();
                d11 = dVar.a();
            } else {
                d11 = dVar.d();
            }
            this.f85209f = d11;
            return true;
        }

        public void E(Throwable th2) {
            qb0.c<T> cVar = this.f85209f.f85224a;
            this.f85209f = this.f85209f.a();
            if (cVar != null) {
                cVar.onError(th2);
            }
            this.f85204a.onError(th2);
            unsubscribe();
        }

        public void H() {
            boolean z11;
            List<Object> list;
            synchronized (this.f85206c) {
                try {
                    if (this.f85208e) {
                        if (this.f85207d == null) {
                            this.f85207d = new ArrayList();
                        }
                        this.f85207d.add(c4.f85195f);
                        return;
                    }
                    boolean z12 = true;
                    this.f85208e = true;
                    try {
                        if (!I()) {
                            synchronized (this.f85206c) {
                                this.f85208e = false;
                            }
                            return;
                        }
                        do {
                            try {
                                synchronized (this.f85206c) {
                                    try {
                                        list = this.f85207d;
                                        if (list == null) {
                                            this.f85208e = false;
                                            return;
                                        }
                                        this.f85207d = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z12 = false;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                z11 = z12;
                                th = th4;
                                if (z11) {
                                    throw th;
                                }
                                synchronized (this.f85206c) {
                                    this.f85208e = false;
                                }
                                throw th;
                            }
                        } while (C(list));
                        synchronized (this.f85206c) {
                            this.f85208e = false;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        z11 = false;
                    }
                } finally {
                }
            }
        }

        public boolean I() {
            qb0.c<T> cVar = this.f85209f.f85224a;
            if (cVar != null) {
                cVar.onCompleted();
            }
            if (this.f85204a.isUnsubscribed()) {
                this.f85209f = this.f85209f.a();
                unsubscribe();
                return false;
            }
            dc0.i y72 = dc0.i.y7();
            this.f85209f = this.f85209f.b(y72, y72);
            this.f85204a.onNext(y72);
            return true;
        }

        public void L() {
            d.a aVar = this.f85205b;
            C1081b c1081b = new C1081b();
            c4 c4Var = c4.this;
            aVar.n(c1081b, 0L, c4Var.f85196a, c4Var.f85198c);
        }

        @Override // qb0.c
        public void onCompleted() {
            synchronized (this.f85206c) {
                try {
                    if (this.f85208e) {
                        if (this.f85207d == null) {
                            this.f85207d = new ArrayList();
                        }
                        this.f85207d.add(v.b());
                        return;
                    }
                    List<Object> list = this.f85207d;
                    this.f85207d = null;
                    this.f85208e = true;
                    try {
                        C(list);
                        q();
                    } catch (Throwable th2) {
                        E(th2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            synchronized (this.f85206c) {
                try {
                    if (this.f85208e) {
                        this.f85207d = Collections.singletonList(v.c(th2));
                        return;
                    }
                    this.f85207d = null;
                    this.f85208e = true;
                    E(th2);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            List<Object> list;
            synchronized (this.f85206c) {
                try {
                    if (this.f85208e) {
                        if (this.f85207d == null) {
                            this.f85207d = new ArrayList();
                        }
                        this.f85207d.add(t11);
                        return;
                    }
                    boolean z11 = true;
                    this.f85208e = true;
                    try {
                        if (!D(t11)) {
                            synchronized (this.f85206c) {
                                this.f85208e = false;
                            }
                            return;
                        }
                        do {
                            try {
                                synchronized (this.f85206c) {
                                    try {
                                        list = this.f85207d;
                                        if (list == null) {
                                            this.f85208e = false;
                                            return;
                                        }
                                        this.f85207d = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z11 = false;
                                        try {
                                            throw th;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            if (!z11) {
                                                synchronized (this.f85206c) {
                                                    this.f85208e = false;
                                                }
                                            }
                                            throw th;
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } while (C(list));
                        synchronized (this.f85206c) {
                            this.f85208e = false;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        z11 = false;
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
            qb0.c<T> cVar = this.f85209f.f85224a;
            this.f85209f = this.f85209f.a();
            if (cVar != null) {
                cVar.onCompleted();
            }
            this.f85204a.onCompleted();
            unsubscribe();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class c extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super rx.c<T>> f85214a;

        /* renamed from: b, reason: collision with root package name */
        public final d.a f85215b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f85216c;

        /* renamed from: d, reason: collision with root package name */
        public final List<a<T>> f85217d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f85218e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements wb0.a {
            public a() {
            }

            @Override // wb0.a
            public void call() {
                c.this.D();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b implements wb0.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a f85221a;

            public b(a aVar) {
                this.f85221a = aVar;
            }

            @Override // wb0.a
            public void call() {
                c.this.E(this.f85221a);
            }
        }

        public c(qb0.g<? super rx.c<T>> gVar, d.a aVar) {
            super(gVar);
            this.f85214a = gVar;
            this.f85215b = aVar;
            this.f85216c = new Object();
            this.f85217d = new LinkedList();
        }

        public void C() {
            d.a aVar = this.f85215b;
            a aVar2 = new a();
            c4 c4Var = c4.this;
            long j11 = c4Var.f85197b;
            aVar.n(aVar2, j11, j11, c4Var.f85198c);
        }

        public void D() {
            a<T> q11 = q();
            synchronized (this.f85216c) {
                try {
                    if (this.f85218e) {
                        return;
                    }
                    this.f85217d.add(q11);
                    try {
                        this.f85214a.onNext(q11.f85202b);
                        d.a aVar = this.f85215b;
                        b bVar = new b(q11);
                        c4 c4Var = c4.this;
                        aVar.j(bVar, c4Var.f85196a, c4Var.f85198c);
                    } catch (Throwable th2) {
                        onError(th2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public void E(a<T> aVar) {
            boolean z11;
            synchronized (this.f85216c) {
                try {
                    if (this.f85218e) {
                        return;
                    }
                    Iterator<a<T>> it = this.f85217d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z11 = false;
                            break;
                        } else if (it.next() == aVar) {
                            it.remove();
                            z11 = true;
                            break;
                        }
                    }
                    if (z11) {
                        aVar.f85201a.onCompleted();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // qb0.c
        public void onCompleted() {
            synchronized (this.f85216c) {
                try {
                    if (this.f85218e) {
                        return;
                    }
                    this.f85218e = true;
                    ArrayList arrayList = new ArrayList(this.f85217d);
                    this.f85217d.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).f85201a.onCompleted();
                    }
                    this.f85214a.onCompleted();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            synchronized (this.f85216c) {
                try {
                    if (this.f85218e) {
                        return;
                    }
                    this.f85218e = true;
                    ArrayList arrayList = new ArrayList(this.f85217d);
                    this.f85217d.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).f85201a.onError(th2);
                    }
                    this.f85214a.onError(th2);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            synchronized (this.f85216c) {
                try {
                    if (this.f85218e) {
                        return;
                    }
                    ArrayList<a> arrayList = new ArrayList(this.f85217d);
                    Iterator<a<T>> it = this.f85217d.iterator();
                    while (it.hasNext()) {
                        a<T> next = it.next();
                        int i11 = next.f85203c + 1;
                        next.f85203c = i11;
                        if (i11 == c4.this.f85200e) {
                            it.remove();
                        }
                    }
                    for (a aVar : arrayList) {
                        aVar.f85201a.onNext(t11);
                        if (aVar.f85203c == c4.this.f85200e) {
                            aVar.f85201a.onCompleted();
                        }
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

        public a<T> q() {
            dc0.i y72 = dc0.i.y7();
            return new a<>(y72, y72);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d<T> {

        /* renamed from: d, reason: collision with root package name */
        public static final d<Object> f85223d = new d<>(null, null, 0);

        /* renamed from: a, reason: collision with root package name */
        public final qb0.c<T> f85224a;

        /* renamed from: b, reason: collision with root package name */
        public final rx.c<T> f85225b;

        /* renamed from: c, reason: collision with root package name */
        public final int f85226c;

        public d(qb0.c<T> cVar, rx.c<T> cVar2, int i11) {
            this.f85224a = cVar;
            this.f85225b = cVar2;
            this.f85226c = i11;
        }

        public static <T> d<T> c() {
            return (d<T>) f85223d;
        }

        public d<T> a() {
            return c();
        }

        public d<T> b(qb0.c<T> cVar, rx.c<T> cVar2) {
            return new d<>(cVar, cVar2, 0);
        }

        public d<T> d() {
            return new d<>(this.f85224a, this.f85225b, this.f85226c + 1);
        }
    }

    public c4(long j11, long j12, TimeUnit timeUnit, int i11, rx.d dVar) {
        this.f85196a = j11;
        this.f85197b = j12;
        this.f85198c = timeUnit;
        this.f85200e = i11;
        this.f85199d = dVar;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super rx.c<T>> gVar) {
        d.a a11 = this.f85199d.a();
        if (this.f85196a == this.f85197b) {
            b bVar = new b(gVar, a11);
            bVar.add(a11);
            bVar.L();
            return bVar;
        }
        c cVar = new c(gVar, a11);
        cVar.add(a11);
        cVar.D();
        cVar.C();
        return cVar;
    }
}
