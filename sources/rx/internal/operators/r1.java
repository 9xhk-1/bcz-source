package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import rx.c;
import rx.exceptions.MissingBackpressureException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class r1<T> implements c.b<List<T>, T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f85974a;

    /* renamed from: b, reason: collision with root package name */
    public final int f85975b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super List<T>> f85976a;

        /* renamed from: b, reason: collision with root package name */
        public final int f85977b;

        /* renamed from: c, reason: collision with root package name */
        public List<T> f85978c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.operators.r1$a$a, reason: collision with other inner class name */
        public class C1098a implements qb0.d {
            public C1098a() {
            }

            @Override // qb0.d
            public void request(long j11) {
                if (j11 < 0) {
                    throw new IllegalArgumentException("n >= required but it was " + j11);
                }
                if (j11 != 0) {
                    a.this.request(rx.internal.operators.a.c(j11, a.this.f85977b));
                }
            }
        }

        public a(qb0.g<? super List<T>> gVar, int i11) {
            this.f85976a = gVar;
            this.f85977b = i11;
            request(0L);
        }

        public qb0.d C() {
            return new C1098a();
        }

        @Override // qb0.c
        public void onCompleted() {
            List<T> list = this.f85978c;
            if (list != null) {
                this.f85976a.onNext(list);
            }
            this.f85976a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85978c = null;
            this.f85976a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            List list = this.f85978c;
            if (list == null) {
                list = new ArrayList(this.f85977b);
                this.f85978c = list;
            }
            list.add(t11);
            if (list.size() == this.f85977b) {
                this.f85978c = null;
                this.f85976a.onNext(list);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super List<T>> f85980a;

        /* renamed from: b, reason: collision with root package name */
        public final int f85981b;

        /* renamed from: c, reason: collision with root package name */
        public final int f85982c;

        /* renamed from: d, reason: collision with root package name */
        public long f85983d;

        /* renamed from: e, reason: collision with root package name */
        public final ArrayDeque<List<T>> f85984e = new ArrayDeque<>();

        /* renamed from: f, reason: collision with root package name */
        public final AtomicLong f85985f = new AtomicLong();

        /* renamed from: g, reason: collision with root package name */
        public long f85986g;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public final class a extends AtomicBoolean implements qb0.d {
            private static final long serialVersionUID = -4015894850868853147L;

            public a() {
            }

            @Override // qb0.d
            public void request(long j11) {
                b bVar = b.this;
                if (!rx.internal.operators.a.g(bVar.f85985f, j11, bVar.f85984e, bVar.f85980a) || j11 == 0) {
                    return;
                }
                if (get() || !compareAndSet(false, true)) {
                    bVar.request(rx.internal.operators.a.c(bVar.f85982c, j11));
                } else {
                    bVar.request(rx.internal.operators.a.a(rx.internal.operators.a.c(bVar.f85982c, j11 - 1), bVar.f85981b));
                }
            }
        }

        public b(qb0.g<? super List<T>> gVar, int i11, int i12) {
            this.f85980a = gVar;
            this.f85981b = i11;
            this.f85982c = i12;
            request(0L);
        }

        public qb0.d D() {
            return new a();
        }

        @Override // qb0.c
        public void onCompleted() {
            long j11 = this.f85986g;
            if (j11 != 0) {
                if (j11 > this.f85985f.get()) {
                    this.f85980a.onError(new MissingBackpressureException("More produced than requested? " + j11));
                    return;
                }
                this.f85985f.addAndGet(-j11);
            }
            rx.internal.operators.a.d(this.f85985f, this.f85984e, this.f85980a);
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85984e.clear();
            this.f85980a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            long j11 = this.f85983d;
            if (j11 == 0) {
                this.f85984e.offer(new ArrayList(this.f85981b));
            }
            long j12 = j11 + 1;
            if (j12 == this.f85982c) {
                this.f85983d = 0L;
            } else {
                this.f85983d = j12;
            }
            Iterator<List<T>> it = this.f85984e.iterator();
            while (it.hasNext()) {
                it.next().add(t11);
            }
            List<T> peek = this.f85984e.peek();
            if (peek == null || peek.size() != this.f85981b) {
                return;
            }
            this.f85984e.poll();
            this.f85986g++;
            this.f85980a.onNext(peek);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<T> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super List<T>> f85988a;

        /* renamed from: b, reason: collision with root package name */
        public final int f85989b;

        /* renamed from: c, reason: collision with root package name */
        public final int f85990c;

        /* renamed from: d, reason: collision with root package name */
        public long f85991d;

        /* renamed from: e, reason: collision with root package name */
        public List<T> f85992e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public final class a extends AtomicBoolean implements qb0.d {
            private static final long serialVersionUID = 3428177408082367154L;

            public a() {
            }

            @Override // qb0.d
            public void request(long j11) {
                if (j11 < 0) {
                    throw new IllegalArgumentException("n >= 0 required but it was " + j11);
                }
                if (j11 != 0) {
                    c cVar = c.this;
                    if (get() || !compareAndSet(false, true)) {
                        cVar.request(rx.internal.operators.a.c(j11, cVar.f85990c));
                    } else {
                        cVar.request(rx.internal.operators.a.a(rx.internal.operators.a.c(j11, cVar.f85989b), rx.internal.operators.a.c(cVar.f85990c - cVar.f85989b, j11 - 1)));
                    }
                }
            }
        }

        public c(qb0.g<? super List<T>> gVar, int i11, int i12) {
            this.f85988a = gVar;
            this.f85989b = i11;
            this.f85990c = i12;
            request(0L);
        }

        public qb0.d D() {
            return new a();
        }

        @Override // qb0.c
        public void onCompleted() {
            List<T> list = this.f85992e;
            if (list != null) {
                this.f85992e = null;
                this.f85988a.onNext(list);
            }
            this.f85988a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85992e = null;
            this.f85988a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            long j11 = this.f85991d;
            List list = this.f85992e;
            if (j11 == 0) {
                list = new ArrayList(this.f85989b);
                this.f85992e = list;
            }
            long j12 = j11 + 1;
            if (j12 == this.f85990c) {
                this.f85991d = 0L;
            } else {
                this.f85991d = j12;
            }
            if (list != null) {
                list.add(t11);
                if (list.size() == this.f85989b) {
                    this.f85992e = null;
                    this.f85988a.onNext(list);
                }
            }
        }
    }

    public r1(int i11, int i12) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("count must be greater than 0");
        }
        if (i12 <= 0) {
            throw new IllegalArgumentException("skip must be greater than 0");
        }
        this.f85974a = i11;
        this.f85975b = i12;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super List<T>> gVar) {
        int i11 = this.f85975b;
        int i12 = this.f85974a;
        if (i11 == i12) {
            a aVar = new a(gVar, i12);
            gVar.add(aVar);
            gVar.setProducer(aVar.C());
            return aVar;
        }
        if (i11 > i12) {
            c cVar = new c(gVar, i12, i11);
            gVar.add(cVar);
            gVar.setProducer(cVar.D());
            return cVar;
        }
        b bVar = new b(gVar, i12, i11);
        gVar.add(bVar);
        gVar.setProducer(bVar.D());
        return bVar;
    }
}
