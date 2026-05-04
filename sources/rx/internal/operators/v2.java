package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.c;
import rx.exceptions.MissingBackpressureException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class v2<T> extends yb0.c<T> {

    /* renamed from: b, reason: collision with root package name */
    public final rx.c<? extends T> f86165b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference<d<T>> f86166c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements c.a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f86167a;

        public a(AtomicReference atomicReference) {
            this.f86167a = atomicReference;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super T> gVar) {
            while (true) {
                d dVar = (d) this.f86167a.get();
                if (dVar == null || dVar.isUnsubscribed()) {
                    d dVar2 = new d(this.f86167a);
                    dVar2.E();
                    if (androidx.camera.view.q.a(this.f86167a, dVar, dVar2)) {
                        dVar = dVar2;
                    } else {
                        continue;
                    }
                }
                c<T> cVar = new c<>(dVar, gVar);
                if (dVar.q(cVar)) {
                    gVar.add(cVar);
                    gVar.setProducer(cVar);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<R> implements c.a<R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f86168a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ wb0.p f86169b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ rx.c f86170c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends qb0.g<R> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ qb0.g f86171a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OnSubscribePublishMulticast f86172b;

            public a(qb0.g gVar, OnSubscribePublishMulticast onSubscribePublishMulticast) {
                this.f86171a = gVar;
                this.f86172b = onSubscribePublishMulticast;
            }

            @Override // qb0.c
            public void onCompleted() {
                this.f86172b.unsubscribe();
                this.f86171a.onCompleted();
            }

            @Override // qb0.c
            public void onError(Throwable th2) {
                this.f86172b.unsubscribe();
                this.f86171a.onError(th2);
            }

            @Override // qb0.c
            public void onNext(R r11) {
                this.f86171a.onNext(r11);
            }

            @Override // qb0.g
            public void setProducer(qb0.d dVar) {
                this.f86171a.setProducer(dVar);
            }
        }

        public b(boolean z11, wb0.p pVar, rx.c cVar) {
            this.f86168a = z11;
            this.f86169b = pVar;
            this.f86170c = cVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super R> gVar) {
            OnSubscribePublishMulticast onSubscribePublishMulticast = new OnSubscribePublishMulticast(rx.internal.util.j.f86718d, this.f86168a);
            a aVar = new a(gVar, onSubscribePublishMulticast);
            gVar.add(onSubscribePublishMulticast);
            gVar.add(aVar);
            ((rx.c) this.f86169b.call(rx.c.I6(onSubscribePublishMulticast))).J6(aVar);
            this.f86170c.J6(onSubscribePublishMulticast.subscriber());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<T> extends AtomicLong implements qb0.d, qb0.h {

        /* renamed from: c, reason: collision with root package name */
        public static final long f86174c = Long.MIN_VALUE;

        /* renamed from: d, reason: collision with root package name */
        public static final long f86175d = -4611686018427387904L;
        private static final long serialVersionUID = -4453897557930727610L;

        /* renamed from: a, reason: collision with root package name */
        public final d<T> f86176a;

        /* renamed from: b, reason: collision with root package name */
        public final qb0.g<? super T> f86177b;

        public c(d<T> dVar, qb0.g<? super T> gVar) {
            this.f86176a = dVar;
            this.f86177b = gVar;
            lazySet(-4611686018427387904L);
        }

        public long a(long j11) {
            long j12;
            long j13;
            if (j11 <= 0) {
                throw new IllegalArgumentException("Cant produce zero or less");
            }
            do {
                j12 = get();
                if (j12 == -4611686018427387904L) {
                    throw new IllegalStateException("Produced without request");
                }
                if (j12 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j13 = j12 - j11;
                if (j13 < 0) {
                    throw new IllegalStateException("More produced (" + j11 + ") than requested (" + j12 + pn.j.f81007d);
                }
            } while (!compareAndSet(j12, j13));
            return j13;
        }

        @Override // qb0.h
        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // qb0.d
        public void request(long j11) {
            long j12;
            long j13;
            if (j11 < 0) {
                return;
            }
            do {
                j12 = get();
                if (j12 == Long.MIN_VALUE) {
                    return;
                }
                if (j12 >= 0 && j11 == 0) {
                    return;
                }
                if (j12 == -4611686018427387904L) {
                    j13 = j11;
                } else {
                    j13 = j12 + j11;
                    if (j13 < 0) {
                        j13 = Long.MAX_VALUE;
                    }
                }
            } while (!compareAndSet(j12, j13));
            this.f86176a.D();
        }

        @Override // qb0.h
        public void unsubscribe() {
            if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE) {
                return;
            }
            this.f86176a.H(this);
            this.f86176a.D();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d<T> extends qb0.g<T> implements qb0.h {

        /* renamed from: h, reason: collision with root package name */
        public static final c[] f86178h = new c[0];

        /* renamed from: i, reason: collision with root package name */
        public static final c[] f86179i = new c[0];

        /* renamed from: a, reason: collision with root package name */
        public final Queue<Object> f86180a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReference<d<T>> f86181b;

        /* renamed from: c, reason: collision with root package name */
        public volatile Object f86182c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReference<c[]> f86183d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicBoolean f86184e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f86185f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f86186g;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements wb0.a {
            public a() {
            }

            @Override // wb0.a
            public void call() {
                d.this.f86183d.getAndSet(d.f86179i);
                d dVar = d.this;
                androidx.camera.view.q.a(dVar.f86181b, dVar, null);
            }
        }

        public d(AtomicReference<d<T>> atomicReference) {
            this.f86180a = rx.internal.util.unsafe.n0.f() ? new rx.internal.util.unsafe.z<>(rx.internal.util.j.f86718d) : new rx.internal.util.atomic.d<>(rx.internal.util.j.f86718d);
            this.f86183d = new AtomicReference<>(f86178h);
            this.f86181b = atomicReference;
            this.f86184e = new AtomicBoolean();
        }

        public boolean C(Object obj, boolean z11) {
            int i11 = 0;
            if (obj != null) {
                if (!v.f(obj)) {
                    Throwable d11 = v.d(obj);
                    androidx.camera.view.q.a(this.f86181b, this, null);
                    try {
                        c[] andSet = this.f86183d.getAndSet(f86179i);
                        int length = andSet.length;
                        while (i11 < length) {
                            andSet[i11].f86177b.onError(d11);
                            i11++;
                        }
                        return true;
                    } finally {
                    }
                }
                if (z11) {
                    androidx.camera.view.q.a(this.f86181b, this, null);
                    try {
                        c[] andSet2 = this.f86183d.getAndSet(f86179i);
                        int length2 = andSet2.length;
                        while (i11 < length2) {
                            andSet2[i11].f86177b.onCompleted();
                            i11++;
                        }
                        return true;
                    } finally {
                    }
                }
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:65:0x00ca, code lost:
        
            if (r4 == false) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00cc, code lost:
        
            r2 = true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void D() {
            /*
                Method dump skipped, instructions count: 245
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.v2.d.D():void");
        }

        public void E() {
            add(ec0.f.a(new a()));
        }

        public void H(c<T> cVar) {
            c[] cVarArr;
            c[] cVarArr2;
            do {
                cVarArr = this.f86183d.get();
                if (cVarArr == f86178h || cVarArr == f86179i) {
                    return;
                }
                int length = cVarArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        i11 = -1;
                        break;
                    } else if (cVarArr[i11].equals(cVar)) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 < 0) {
                    return;
                }
                if (length == 1) {
                    cVarArr2 = f86178h;
                } else {
                    c[] cVarArr3 = new c[length - 1];
                    System.arraycopy(cVarArr, 0, cVarArr3, 0, i11);
                    System.arraycopy(cVarArr, i11 + 1, cVarArr3, i11, (length - i11) - 1);
                    cVarArr2 = cVarArr3;
                }
            } while (!androidx.camera.view.q.a(this.f86183d, cVarArr, cVarArr2));
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f86182c == null) {
                this.f86182c = v.b();
                D();
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f86182c == null) {
                this.f86182c = v.c(th2);
                D();
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            if (this.f86180a.offer(v.j(t11))) {
                D();
            } else {
                onError(new MissingBackpressureException());
            }
        }

        @Override // qb0.g
        public void onStart() {
            request(rx.internal.util.j.f86718d);
        }

        public boolean q(c<T> cVar) {
            c[] cVarArr;
            c[] cVarArr2;
            cVar.getClass();
            do {
                cVarArr = this.f86183d.get();
                if (cVarArr == f86179i) {
                    return false;
                }
                int length = cVarArr.length;
                cVarArr2 = new c[length + 1];
                System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                cVarArr2[length] = cVar;
            } while (!androidx.camera.view.q.a(this.f86183d, cVarArr, cVarArr2));
            return true;
        }
    }

    public v2(c.a<T> aVar, rx.c<? extends T> cVar, AtomicReference<d<T>> atomicReference) {
        super(aVar);
        this.f86165b = cVar;
        this.f86166c = atomicReference;
    }

    public static <T, R> rx.c<R> C7(rx.c<? extends T> cVar, wb0.p<? super rx.c<T>, ? extends rx.c<R>> pVar) {
        return D7(cVar, pVar, false);
    }

    public static <T, R> rx.c<R> D7(rx.c<? extends T> cVar, wb0.p<? super rx.c<T>, ? extends rx.c<R>> pVar, boolean z11) {
        return rx.c.I6(new b(z11, pVar, cVar));
    }

    public static <T> yb0.c<T> E7(rx.c<? extends T> cVar) {
        AtomicReference atomicReference = new AtomicReference();
        return new v2(new a(atomicReference), cVar, atomicReference);
    }

    @Override // yb0.c
    public void A7(wb0.b<? super qb0.h> bVar) {
        d<T> dVar;
        while (true) {
            dVar = this.f86166c.get();
            if (dVar != null && !dVar.isUnsubscribed()) {
                break;
            }
            d<T> dVar2 = new d<>(this.f86166c);
            dVar2.E();
            if (androidx.camera.view.q.a(this.f86166c, dVar, dVar2)) {
                dVar = dVar2;
                break;
            }
        }
        boolean z11 = false;
        if (!dVar.f86184e.get() && dVar.f86184e.compareAndSet(false, true)) {
            z11 = true;
        }
        bVar.call(dVar);
        if (z11) {
            this.f86165b.J6(dVar);
        }
    }
}
