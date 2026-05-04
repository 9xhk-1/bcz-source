package yb0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.c;
import wb0.o;
import wb0.p;
import wb0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@ub0.a
/* loaded from: classes9.dex */
public abstract class a<S, T> implements c.a<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: yb0.a$a, reason: collision with other inner class name */
    public static class C1354a implements r<S, Long, qb0.c<rx.c<? extends T>>, S> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.d f99793a;

        public C1354a(wb0.d dVar) {
            this.f99793a = dVar;
        }

        @Override // wb0.r
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public S i(S s11, Long l11, qb0.c<rx.c<? extends T>> cVar) {
            this.f99793a.i(s11, l11, cVar);
            return s11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements r<S, Long, qb0.c<rx.c<? extends T>>, S> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.d f99794a;

        public b(wb0.d dVar) {
            this.f99794a = dVar;
        }

        @Override // wb0.r
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public S i(S s11, Long l11, qb0.c<rx.c<? extends T>> cVar) {
            this.f99794a.i(s11, l11, cVar);
            return s11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements r<Void, Long, qb0.c<rx.c<? extends T>>, Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.c f99795a;

        public c(wb0.c cVar) {
            this.f99795a = cVar;
        }

        @Override // wb0.r
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void i(Void r22, Long l11, qb0.c<rx.c<? extends T>> cVar) {
            this.f99795a.call(l11, cVar);
            return r22;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements r<Void, Long, qb0.c<rx.c<? extends T>>, Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.c f99796a;

        public d(wb0.c cVar) {
            this.f99796a = cVar;
        }

        @Override // wb0.r
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void i(Void r12, Long l11, qb0.c<rx.c<? extends T>> cVar) {
            this.f99796a.call(l11, cVar);
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e implements wb0.b<Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.a f99797a;

        public e(wb0.a aVar) {
            this.f99797a = aVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Void r12) {
            this.f99797a.call();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ qb0.g f99798a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f99799b;

        public f(qb0.g gVar, i iVar) {
            this.f99798a = gVar;
            this.f99799b = iVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f99798a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f99798a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f99798a.onNext(t11);
        }

        @Override // qb0.g
        public void setProducer(qb0.d dVar) {
            this.f99799b.h(dVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g implements p<rx.c<T>, rx.c<T>> {
        public g() {
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<T> call(rx.c<T> cVar) {
            return cVar.N3();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i<S, T> implements qb0.d, qb0.h, qb0.c<rx.c<? extends T>> {

        /* renamed from: b, reason: collision with root package name */
        public final a<S, T> f99806b;

        /* renamed from: e, reason: collision with root package name */
        public boolean f99809e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f99810f;

        /* renamed from: g, reason: collision with root package name */
        public S f99811g;

        /* renamed from: h, reason: collision with root package name */
        public final j<rx.c<T>> f99812h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f99813i;

        /* renamed from: j, reason: collision with root package name */
        public List<Long> f99814j;

        /* renamed from: k, reason: collision with root package name */
        public qb0.d f99815k;

        /* renamed from: l, reason: collision with root package name */
        public long f99816l;

        /* renamed from: d, reason: collision with root package name */
        public final ec0.b f99808d = new ec0.b();

        /* renamed from: c, reason: collision with root package name */
        public final zb0.f<rx.c<? extends T>> f99807c = new zb0.f<>(this);

        /* renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f99805a = new AtomicBoolean();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: yb0.a$i$a, reason: collision with other inner class name */
        public class C1355a extends qb0.g<T> {

            /* renamed from: a, reason: collision with root package name */
            public long f99817a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f99818b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ rx.internal.operators.g f99819c;

            public C1355a(long j11, rx.internal.operators.g gVar) {
                this.f99818b = j11;
                this.f99819c = gVar;
                this.f99817a = j11;
            }

            @Override // qb0.c
            public void onCompleted() {
                this.f99819c.onCompleted();
                long j11 = this.f99817a;
                if (j11 > 0) {
                    i.this.g(j11);
                }
            }

            @Override // qb0.c
            public void onError(Throwable th2) {
                this.f99819c.onError(th2);
            }

            @Override // qb0.c
            public void onNext(T t11) {
                this.f99817a--;
                this.f99819c.onNext(t11);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b implements wb0.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ qb0.g f99821a;

            public b(qb0.g gVar) {
                this.f99821a = gVar;
            }

            @Override // wb0.a
            public void call() {
                i.this.f99808d.e(this.f99821a);
            }
        }

        public i(a<S, T> aVar, S s11, j<rx.c<T>> jVar) {
            this.f99806b = aVar;
            this.f99811g = s11;
            this.f99812h = jVar;
        }

        public void c() {
            this.f99808d.unsubscribe();
            try {
                this.f99806b.q(this.f99811g);
            } catch (Throwable th2) {
                d(th2);
            }
        }

        public final void d(Throwable th2) {
            if (this.f99809e) {
                ac0.c.I(th2);
                return;
            }
            this.f99809e = true;
            this.f99812h.onError(th2);
            c();
        }

        public void e(long j11) {
            this.f99811g = this.f99806b.p(this.f99811g, j11, this.f99807c);
        }

        @Override // qb0.c
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onNext(rx.c<? extends T> cVar) {
            if (this.f99810f) {
                throw new IllegalStateException("onNext called multiple times!");
            }
            this.f99810f = true;
            if (this.f99809e) {
                return;
            }
            i(cVar);
        }

        public void g(long j11) {
            if (j11 == 0) {
                return;
            }
            if (j11 < 0) {
                throw new IllegalStateException("Request can't be negative! " + j11);
            }
            synchronized (this) {
                try {
                    if (this.f99813i) {
                        List list = this.f99814j;
                        if (list == null) {
                            list = new ArrayList();
                            this.f99814j = list;
                        }
                        list.add(Long.valueOf(j11));
                        return;
                    }
                    this.f99813i = true;
                    if (k(j11)) {
                        return;
                    }
                    while (true) {
                        synchronized (this) {
                            try {
                                List<Long> list2 = this.f99814j;
                                if (list2 == null) {
                                    this.f99813i = false;
                                    return;
                                }
                                this.f99814j = null;
                                Iterator<Long> it = list2.iterator();
                                while (it.hasNext()) {
                                    if (k(it.next().longValue())) {
                                        return;
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public void h(qb0.d dVar) {
            if (this.f99815k != null) {
                throw new IllegalStateException("setConcatProducer may be called at most once!");
            }
            this.f99815k = dVar;
        }

        public final void i(rx.c<? extends T> cVar) {
            rx.internal.operators.g y72 = rx.internal.operators.g.y7();
            C1355a c1355a = new C1355a(this.f99816l, y72);
            this.f99808d.a(c1355a);
            cVar.O1(new b(c1355a)).r5(c1355a);
            this.f99812h.onNext(y72);
        }

        @Override // qb0.h
        public boolean isUnsubscribed() {
            return this.f99805a.get();
        }

        public boolean k(long j11) {
            if (isUnsubscribed()) {
                c();
                return true;
            }
            try {
                this.f99810f = false;
                this.f99816l = j11;
                e(j11);
                if (this.f99809e) {
                    if (this.f99808d.d()) {
                    }
                    c();
                    return true;
                }
                if (!isUnsubscribed()) {
                    if (this.f99810f) {
                        return false;
                    }
                    d(new IllegalStateException("No events emitted!"));
                    return true;
                }
                c();
                return true;
            } catch (Throwable th2) {
                d(th2);
                return true;
            }
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f99809e) {
                throw new IllegalStateException("Terminal event already emitted.");
            }
            this.f99809e = true;
            this.f99812h.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f99809e) {
                throw new IllegalStateException("Terminal event already emitted.");
            }
            this.f99809e = true;
            this.f99812h.onError(th2);
        }

        @Override // qb0.d
        public void request(long j11) {
            boolean z11;
            if (j11 == 0) {
                return;
            }
            if (j11 < 0) {
                throw new IllegalStateException("Request can't be negative! " + j11);
            }
            synchronized (this) {
                try {
                    z11 = true;
                    if (this.f99813i) {
                        List list = this.f99814j;
                        if (list == null) {
                            list = new ArrayList();
                            this.f99814j = list;
                        }
                        list.add(Long.valueOf(j11));
                    } else {
                        this.f99813i = true;
                        z11 = false;
                    }
                } finally {
                }
            }
            this.f99815k.request(j11);
            if (z11 || k(j11)) {
                return;
            }
            while (true) {
                synchronized (this) {
                    try {
                        List<Long> list2 = this.f99814j;
                        if (list2 == null) {
                            this.f99813i = false;
                            return;
                        }
                        this.f99814j = null;
                        Iterator<Long> it = list2.iterator();
                        while (it.hasNext()) {
                            if (k(it.next().longValue())) {
                                return;
                            }
                        }
                    } finally {
                    }
                }
            }
        }

        @Override // qb0.h
        public void unsubscribe() {
            if (this.f99805a.compareAndSet(false, true)) {
                synchronized (this) {
                    try {
                        if (!this.f99813i) {
                            this.f99813i = true;
                            c();
                        } else {
                            ArrayList arrayList = new ArrayList();
                            this.f99814j = arrayList;
                            arrayList.add(0L);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j<T> extends rx.c<T> implements qb0.c<T> {

        /* renamed from: b, reason: collision with root package name */
        public final C1356a<T> f99823b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: yb0.a$j$a, reason: collision with other inner class name */
        public static final class C1356a<T> implements c.a<T> {

            /* renamed from: a, reason: collision with root package name */
            public qb0.g<? super T> f99824a;

            @Override // wb0.b
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void call(qb0.g<? super T> gVar) {
                synchronized (this) {
                    try {
                        if (this.f99824a == null) {
                            this.f99824a = gVar;
                        } else {
                            gVar.onError(new IllegalStateException("There can be only one subscriber"));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public j(C1356a<T> c1356a) {
            super(c1356a);
            this.f99823b = c1356a;
        }

        public static <T> j<T> w7() {
            return new j<>(new C1356a());
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f99823b.f99824a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f99823b.f99824a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f99823b.f99824a.onNext(t11);
        }
    }

    public static <S, T> a<S, T> b(o<? extends S> oVar, wb0.d<? super S, Long, ? super qb0.c<rx.c<? extends T>>> dVar) {
        return new h(oVar, new C1354a(dVar));
    }

    public static <S, T> a<S, T> h(o<? extends S> oVar, wb0.d<? super S, Long, ? super qb0.c<rx.c<? extends T>>> dVar, wb0.b<? super S> bVar) {
        return new h(oVar, new b(dVar), bVar);
    }

    public static <S, T> a<S, T> j(o<? extends S> oVar, r<? super S, Long, ? super qb0.c<rx.c<? extends T>>, ? extends S> rVar) {
        return new h(oVar, rVar);
    }

    public static <S, T> a<S, T> l(o<? extends S> oVar, r<? super S, Long, ? super qb0.c<rx.c<? extends T>>, ? extends S> rVar, wb0.b<? super S> bVar) {
        return new h(oVar, rVar, bVar);
    }

    public static <T> a<Void, T> m(wb0.c<Long, ? super qb0.c<rx.c<? extends T>>> cVar) {
        return new h(new c(cVar));
    }

    public static <T> a<Void, T> n(wb0.c<Long, ? super qb0.c<rx.c<? extends T>>> cVar, wb0.a aVar) {
        return new h(new d(cVar), new e(aVar));
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void call(qb0.g<? super T> gVar) {
        try {
            S o11 = o();
            j w72 = j.w7();
            i iVar = new i(this, o11, w72);
            f fVar = new f(gVar, iVar);
            w72.N3().Z0(new g()).J6(fVar);
            gVar.add(fVar);
            gVar.add(iVar);
            gVar.setProducer(iVar);
        } catch (Throwable th2) {
            gVar.onError(th2);
        }
    }

    public abstract S o();

    public abstract S p(S s11, long j11, qb0.c<rx.c<? extends T>> cVar);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h<S, T> extends a<S, T> {

        /* renamed from: a, reason: collision with root package name */
        public final o<? extends S> f99802a;

        /* renamed from: b, reason: collision with root package name */
        public final r<? super S, Long, ? super qb0.c<rx.c<? extends T>>, ? extends S> f99803b;

        /* renamed from: c, reason: collision with root package name */
        public final wb0.b<? super S> f99804c;

        public h(o<? extends S> oVar, r<? super S, Long, ? super qb0.c<rx.c<? extends T>>, ? extends S> rVar, wb0.b<? super S> bVar) {
            this.f99802a = oVar;
            this.f99803b = rVar;
            this.f99804c = bVar;
        }

        @Override // yb0.a, wb0.b
        public /* bridge */ /* synthetic */ void call(Object obj) {
            super.call((qb0.g) obj);
        }

        @Override // yb0.a
        public S o() {
            o<? extends S> oVar = this.f99802a;
            if (oVar == null) {
                return null;
            }
            return oVar.call();
        }

        @Override // yb0.a
        public S p(S s11, long j11, qb0.c<rx.c<? extends T>> cVar) {
            return this.f99803b.i(s11, Long.valueOf(j11), cVar);
        }

        @Override // yb0.a
        public void q(S s11) {
            wb0.b<? super S> bVar = this.f99804c;
            if (bVar != null) {
                bVar.call(s11);
            }
        }

        public h(o<? extends S> oVar, r<? super S, Long, ? super qb0.c<rx.c<? extends T>>, ? extends S> rVar) {
            this(oVar, rVar, null);
        }

        public h(r<S, Long, qb0.c<rx.c<? extends T>>, S> rVar, wb0.b<? super S> bVar) {
            this(null, rVar, bVar);
        }

        public h(r<S, Long, qb0.c<rx.c<? extends T>>, S> rVar) {
            this(null, rVar, null);
        }
    }

    public void q(S s11) {
    }
}
