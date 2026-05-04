package rx.internal.operators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.c;
import rx.exceptions.CompositeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class y<T, R> implements c.a<R> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<? extends T>[] f86376a;

    /* renamed from: b, reason: collision with root package name */
    public final Iterable<? extends rx.c<? extends T>> f86377b;

    /* renamed from: c, reason: collision with root package name */
    public final wb0.y<? extends R> f86378c;

    /* renamed from: d, reason: collision with root package name */
    public final int f86379d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f86380e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T, R> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final b<T, R> f86381a;

        /* renamed from: b, reason: collision with root package name */
        public final int f86382b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f86383c;

        public a(b<T, R> bVar, int i11) {
            this.f86381a = bVar;
            this.f86382b = i11;
            request(bVar.f86388d);
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f86383c) {
                return;
            }
            this.f86383c = true;
            this.f86381a.c(null, this.f86382b);
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f86383c) {
                ac0.c.I(th2);
                return;
            }
            this.f86381a.e(th2);
            this.f86383c = true;
            this.f86381a.c(null, this.f86382b);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            if (this.f86383c) {
                return;
            }
            this.f86381a.c(v.j(t11), this.f86382b);
        }

        public void q(long j11) {
            request(j11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T, R> extends AtomicInteger implements qb0.d, qb0.h {

        /* renamed from: n, reason: collision with root package name */
        public static final Object f86384n = new Object();
        private static final long serialVersionUID = 8567835998786448817L;

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super R> f86385a;

        /* renamed from: b, reason: collision with root package name */
        public final wb0.y<? extends R> f86386b;

        /* renamed from: c, reason: collision with root package name */
        public final a<T, R>[] f86387c;

        /* renamed from: d, reason: collision with root package name */
        public final int f86388d;

        /* renamed from: e, reason: collision with root package name */
        public final Object[] f86389e;

        /* renamed from: f, reason: collision with root package name */
        public final rx.internal.util.atomic.e<Object> f86390f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f86391g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f86392h;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f86393i;

        /* renamed from: j, reason: collision with root package name */
        public final AtomicLong f86394j;

        /* renamed from: k, reason: collision with root package name */
        public final AtomicReference<Throwable> f86395k;

        /* renamed from: l, reason: collision with root package name */
        public int f86396l;

        /* renamed from: m, reason: collision with root package name */
        public int f86397m;

        public b(qb0.g<? super R> gVar, wb0.y<? extends R> yVar, int i11, int i12, boolean z11) {
            this.f86385a = gVar;
            this.f86386b = yVar;
            this.f86388d = i12;
            this.f86391g = z11;
            Object[] objArr = new Object[i11];
            this.f86389e = objArr;
            Arrays.fill(objArr, f86384n);
            this.f86387c = new a[i11];
            this.f86390f = new rx.internal.util.atomic.e<>(i12);
            this.f86394j = new AtomicLong();
            this.f86395k = new AtomicReference<>();
        }

        public void a(Queue<?> queue) {
            queue.clear();
            for (a<T, R> aVar : this.f86387c) {
                aVar.unsubscribe();
            }
        }

        public boolean b(boolean z11, boolean z12, qb0.g<?> gVar, Queue<?> queue, boolean z13) {
            if (this.f86392h) {
                a(queue);
                return true;
            }
            if (!z11) {
                return false;
            }
            if (z13) {
                if (!z12) {
                    return false;
                }
                Throwable th2 = this.f86395k.get();
                if (th2 != null) {
                    gVar.onError(th2);
                } else {
                    gVar.onCompleted();
                }
                return true;
            }
            Throwable th3 = this.f86395k.get();
            if (th3 != null) {
                a(queue);
                gVar.onError(th3);
                return true;
            }
            if (!z12) {
                return false;
            }
            gVar.onCompleted();
            return true;
        }

        public void c(Object obj, int i11) {
            boolean z11;
            a<T, R> aVar = this.f86387c[i11];
            synchronized (this) {
                try {
                    Object[] objArr = this.f86389e;
                    int length = objArr.length;
                    Object obj2 = objArr[i11];
                    int i12 = this.f86396l;
                    Object obj3 = f86384n;
                    if (obj2 == obj3) {
                        i12++;
                        this.f86396l = i12;
                    }
                    int i13 = this.f86397m;
                    if (obj == null) {
                        i13++;
                        this.f86397m = i13;
                    } else {
                        objArr[i11] = v.e(obj);
                    }
                    z11 = i12 == length;
                    if (i13 != length && (obj != null || obj2 != obj3)) {
                        if (obj != null && z11) {
                            this.f86390f.o(aVar, this.f86389e.clone());
                        } else if (obj == null && this.f86395k.get() != null && (obj2 == obj3 || !this.f86391g)) {
                            this.f86393i = true;
                        }
                    }
                    this.f86393i = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z11 || obj == null) {
                d();
            } else {
                aVar.q(1L);
            }
        }

        public void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            rx.internal.util.atomic.e<Object> eVar = this.f86390f;
            qb0.g<? super R> gVar = this.f86385a;
            boolean z11 = this.f86391g;
            AtomicLong atomicLong = this.f86394j;
            int i11 = 1;
            while (!b(this.f86393i, eVar.isEmpty(), gVar, eVar, z11)) {
                long j11 = atomicLong.get();
                long j12 = 0;
                while (j12 != j11) {
                    boolean z12 = this.f86393i;
                    a aVar = (a) eVar.peek();
                    boolean z13 = aVar == null;
                    if (b(z12, z13, gVar, eVar, z11)) {
                        return;
                    }
                    if (z13) {
                        break;
                    }
                    eVar.poll();
                    Object[] objArr = (Object[]) eVar.poll();
                    if (objArr == null) {
                        this.f86392h = true;
                        a(eVar);
                        gVar.onError(new IllegalStateException("Broken queue?! Sender received but not the array."));
                        return;
                    }
                    try {
                        gVar.onNext(this.f86386b.call(objArr));
                        aVar.q(1L);
                        j12++;
                    } catch (Throwable th2) {
                        this.f86392h = true;
                        a(eVar);
                        gVar.onError(th2);
                        return;
                    }
                }
                if (j12 != 0 && j11 != Long.MAX_VALUE) {
                    rx.internal.operators.a.i(atomicLong, j12);
                }
                i11 = addAndGet(-i11);
                if (i11 == 0) {
                    return;
                }
            }
        }

        public void e(Throwable th2) {
            Throwable th3;
            Throwable th4;
            AtomicReference<Throwable> atomicReference = this.f86395k;
            do {
                th3 = atomicReference.get();
                if (th3 == null) {
                    th4 = th2;
                } else if (th3 instanceof CompositeException) {
                    ArrayList arrayList = new ArrayList(((CompositeException) th3).getExceptions());
                    arrayList.add(th2);
                    th4 = new CompositeException(arrayList);
                } else {
                    th4 = new CompositeException(Arrays.asList(th3, th2));
                }
            } while (!androidx.camera.view.q.a(atomicReference, th3, th4));
        }

        public void f(rx.c<? extends T>[] cVarArr) {
            a<T, R>[] aVarArr = this.f86387c;
            int length = aVarArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                aVarArr[i11] = new a<>(this, i11);
            }
            lazySet(0);
            this.f86385a.add(this);
            this.f86385a.setProducer(this);
            for (int i12 = 0; i12 < length && !this.f86392h; i12++) {
                cVarArr[i12].r5(aVarArr[i12]);
            }
        }

        @Override // qb0.h
        public boolean isUnsubscribed() {
            return this.f86392h;
        }

        @Override // qb0.d
        public void request(long j11) {
            if (j11 < 0) {
                throw new IllegalArgumentException("n >= required but it was " + j11);
            }
            if (j11 != 0) {
                rx.internal.operators.a.b(this.f86394j, j11);
                d();
            }
        }

        @Override // qb0.h
        public void unsubscribe() {
            if (this.f86392h) {
                return;
            }
            this.f86392h = true;
            if (getAndIncrement() == 0) {
                a(this.f86390f);
            }
        }
    }

    public y(Iterable<? extends rx.c<? extends T>> iterable, wb0.y<? extends R> yVar) {
        this(null, iterable, yVar, rx.internal.util.j.f86718d, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void call(qb0.g<? super R> r8) {
        /*
            r7 = this;
            rx.c<? extends T>[] r0 = r7.f86376a
            if (r0 != 0) goto L46
            java.lang.Iterable<? extends rx.c<? extends T>> r0 = r7.f86377b
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L1b
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            rx.c[] r1 = new rx.c[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            rx.c[] r0 = (rx.c[]) r0
            int r1 = r0.length
        L19:
            r4 = r1
            goto L48
        L1b:
            r1 = 8
            rx.c[] r1 = new rx.c[r1]
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = r2
        L25:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L43
            java.lang.Object r4 = r0.next()
            rx.c r4 = (rx.c) r4
            int r5 = r1.length
            if (r3 != r5) goto L3d
            int r5 = r3 >> 2
            int r5 = r5 + r3
            rx.c[] r5 = new rx.c[r5]
            java.lang.System.arraycopy(r1, r2, r5, r2, r3)
            r1 = r5
        L3d:
            int r5 = r3 + 1
            r1[r3] = r4
            r3 = r5
            goto L25
        L43:
            r0 = r1
            r4 = r3
            goto L48
        L46:
            int r1 = r0.length
            goto L19
        L48:
            if (r4 != 0) goto L4e
            r8.onCompleted()
            return
        L4e:
            rx.internal.operators.y$b r1 = new rx.internal.operators.y$b
            wb0.y<? extends R> r3 = r7.f86378c
            int r5 = r7.f86379d
            boolean r6 = r7.f86380e
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r1.f(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.y.call(qb0.g):void");
    }

    public y(rx.c<? extends T>[] cVarArr, Iterable<? extends rx.c<? extends T>> iterable, wb0.y<? extends R> yVar, int i11, boolean z11) {
        this.f86376a = cVarArr;
        this.f86377b = iterable;
        this.f86378c = yVar;
        this.f86379d = i11;
        this.f86380e = z11;
    }
}
