package rx.internal.operators;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class e4<T, R> implements c.a<R> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<T> f85295a;

    /* renamed from: b, reason: collision with root package name */
    public final rx.c<?>[] f85296b;

    /* renamed from: c, reason: collision with root package name */
    public final Iterable<rx.c<?>> f85297c;

    /* renamed from: d, reason: collision with root package name */
    public final wb0.y<R> f85298d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T, R> extends qb0.g<T> {

        /* renamed from: f, reason: collision with root package name */
        public static final Object f85299f = new Object();

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super R> f85300a;

        /* renamed from: b, reason: collision with root package name */
        public final wb0.y<R> f85301b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReferenceArray<Object> f85302c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicInteger f85303d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f85304e;

        public a(qb0.g<? super R> gVar, wb0.y<R> yVar, int i11) {
            this.f85300a = gVar;
            this.f85301b = yVar;
            AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(i11 + 1);
            for (int i12 = 0; i12 <= i11; i12++) {
                atomicReferenceArray.lazySet(i12, f85299f);
            }
            this.f85302c = atomicReferenceArray;
            this.f85303d = new AtomicInteger(i11);
            request(0L);
        }

        public void C(int i11, Throwable th2) {
            onError(th2);
        }

        public void D(int i11, Object obj) {
            if (this.f85302c.getAndSet(i11, obj) == f85299f) {
                this.f85303d.decrementAndGet();
            }
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f85304e) {
                return;
            }
            this.f85304e = true;
            unsubscribe();
            this.f85300a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f85304e) {
                ac0.c.I(th2);
                return;
            }
            this.f85304e = true;
            unsubscribe();
            this.f85300a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            if (this.f85304e) {
                return;
            }
            if (this.f85303d.get() != 0) {
                request(1L);
                return;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.f85302c;
            int length = atomicReferenceArray.length();
            atomicReferenceArray.lazySet(0, t11);
            Object[] objArr = new Object[atomicReferenceArray.length()];
            for (int i11 = 0; i11 < length; i11++) {
                objArr[i11] = atomicReferenceArray.get(i11);
            }
            try {
                this.f85300a.onNext(this.f85301b.call(objArr));
            } catch (Throwable th2) {
                vb0.a.e(th2);
                onError(th2);
            }
        }

        public void q(int i11) {
            if (this.f85302c.get(i11) == f85299f) {
                onCompleted();
            }
        }

        @Override // qb0.g
        public void setProducer(qb0.d dVar) {
            super.setProducer(dVar);
            this.f85300a.setProducer(dVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends qb0.g<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final a<?, ?> f85305a;

        /* renamed from: b, reason: collision with root package name */
        public final int f85306b;

        public b(a<?, ?> aVar, int i11) {
            this.f85305a = aVar;
            this.f85306b = i11;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85305a.q(this.f85306b);
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85305a.C(this.f85306b, th2);
        }

        @Override // qb0.c
        public void onNext(Object obj) {
            this.f85305a.D(this.f85306b, obj);
        }
    }

    public e4(rx.c<T> cVar, rx.c<?>[] cVarArr, Iterable<rx.c<?>> iterable, wb0.y<R> yVar) {
        this.f85295a = cVar;
        this.f85296b = cVarArr;
        this.f85297c = iterable;
        this.f85298d = yVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super R> gVar) {
        int i11;
        zb0.g gVar2 = new zb0.g(gVar);
        rx.c<?>[] cVarArr = this.f85296b;
        int i12 = 0;
        if (cVarArr != null) {
            i11 = cVarArr.length;
        } else {
            cVarArr = new rx.c[8];
            int i13 = 0;
            for (rx.c<?> cVar : this.f85297c) {
                if (i13 == cVarArr.length) {
                    cVarArr = (rx.c[]) Arrays.copyOf(cVarArr, (i13 >> 2) + i13);
                }
                cVarArr[i13] = cVar;
                i13++;
            }
            i11 = i13;
        }
        a aVar = new a(gVar, this.f85298d, i11);
        gVar2.add(aVar);
        while (i12 < i11) {
            if (gVar2.isUnsubscribed()) {
                return;
            }
            int i14 = i12 + 1;
            b bVar = new b(aVar, i14);
            aVar.add(bVar);
            cVarArr[i12].J6(bVar);
            i12 = i14;
        }
        this.f85295a.J6(aVar);
    }
}
