package dc0;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.c;
import rx.exceptions.MissingBackpressureException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class c<T> extends f<T, T> {

    /* renamed from: b, reason: collision with root package name */
    public final b<T> f47738b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends AtomicLong implements qb0.d, qb0.h, qb0.c<T> {
        private static final long serialVersionUID = 6451806817170721536L;

        /* renamed from: a, reason: collision with root package name */
        public final b<T> f47739a;

        /* renamed from: b, reason: collision with root package name */
        public final qb0.g<? super T> f47740b;

        /* renamed from: c, reason: collision with root package name */
        public long f47741c;

        public a(b<T> bVar, qb0.g<? super T> gVar) {
            this.f47739a = bVar;
            this.f47740b = gVar;
        }

        @Override // qb0.h
        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // qb0.c
        public void onCompleted() {
            if (get() != Long.MIN_VALUE) {
                this.f47740b.onCompleted();
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (get() != Long.MIN_VALUE) {
                this.f47740b.onError(th2);
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            long j11 = get();
            if (j11 != Long.MIN_VALUE) {
                long j12 = this.f47741c;
                if (j11 != j12) {
                    this.f47741c = j12 + 1;
                    this.f47740b.onNext(t11);
                } else {
                    unsubscribe();
                    this.f47740b.onError(new MissingBackpressureException("PublishSubject: could not emit value due to lack of requests"));
                }
            }
        }

        @Override // qb0.d
        public void request(long j11) {
            long j12;
            if (rx.internal.operators.a.j(j11)) {
                do {
                    j12 = get();
                    if (j12 == Long.MIN_VALUE) {
                        return;
                    }
                } while (!compareAndSet(j12, rx.internal.operators.a.a(j12, j11)));
            }
        }

        @Override // qb0.h
        public void unsubscribe() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f47739a.q(this);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> extends AtomicReference<a<T>[]> implements c.a<T>, qb0.c<T> {

        /* renamed from: b, reason: collision with root package name */
        public static final a[] f47742b = new a[0];

        /* renamed from: c, reason: collision with root package name */
        public static final a[] f47743c = new a[0];
        private static final long serialVersionUID = -7568940796666027140L;

        /* renamed from: a, reason: collision with root package name */
        public Throwable f47744a;

        public b() {
            lazySet(f47742b);
        }

        public boolean h(a<T> aVar) {
            a<T>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = get();
                if (aVarArr == f47743c) {
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        @Override // wb0.b
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super T> gVar) {
            a<T> aVar = new a<>(this, gVar);
            gVar.add(aVar);
            gVar.setProducer(aVar);
            if (h(aVar)) {
                if (aVar.isUnsubscribed()) {
                    q(aVar);
                }
            } else {
                Throwable th2 = this.f47744a;
                if (th2 != null) {
                    gVar.onError(th2);
                } else {
                    gVar.onCompleted();
                }
            }
        }

        @Override // qb0.c
        public void onCompleted() {
            for (a<T> aVar : getAndSet(f47743c)) {
                aVar.onCompleted();
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f47744a = th2;
            ArrayList arrayList = null;
            for (a<T> aVar : getAndSet(f47743c)) {
                try {
                    aVar.onError(th2);
                } catch (Throwable th3) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                    }
                    arrayList.add(th3);
                }
            }
            vb0.a.d(arrayList);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            for (a<T> aVar : get()) {
                aVar.onNext(t11);
            }
        }

        public void q(a<T> aVar) {
            a<T>[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = get();
                if (aVarArr == f47743c || aVarArr == f47742b) {
                    return;
                }
                int length = aVarArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        i11 = -1;
                        break;
                    } else if (aVarArr[i11] == aVar) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr2 = f47742b;
                } else {
                    a[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i11);
                    System.arraycopy(aVarArr, i11 + 1, aVarArr3, i11, (length - i11) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!compareAndSet(aVarArr, aVarArr2));
        }
    }

    public c(b<T> bVar) {
        super(bVar);
        this.f47738b = bVar;
    }

    public static <T> c<T> y7() {
        return new c<>(new b());
    }

    public boolean A7() {
        return this.f47738b.get() == b.f47743c && this.f47738b.f47744a == null;
    }

    public boolean B7() {
        return this.f47738b.get() == b.f47743c && this.f47738b.f47744a != null;
    }

    @Override // qb0.c
    public void onCompleted() {
        this.f47738b.onCompleted();
    }

    @Override // qb0.c
    public void onError(Throwable th2) {
        this.f47738b.onError(th2);
    }

    @Override // qb0.c
    public void onNext(T t11) {
        this.f47738b.onNext(t11);
    }

    @Override // dc0.f
    public boolean w7() {
        return this.f47738b.get().length != 0;
    }

    public Throwable z7() {
        if (this.f47738b.get() == b.f47743c) {
            return this.f47738b.f47744a;
        }
        return null;
    }
}
