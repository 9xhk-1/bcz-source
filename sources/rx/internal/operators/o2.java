package rx.internal.operators;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import rx.c;
import rx.exceptions.CompositeException;
import rx.exceptions.MissingBackpressureException;
import rx.exceptions.OnErrorThrowable;
import rx.internal.util.atomic.SpscExactAtomicArrayQueue;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class o2<T> implements c.b<T, rx.c<? extends T>> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f85831a;

    /* renamed from: b, reason: collision with root package name */
    public final int f85832b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final o2<Object> f85833a = new o2<>(true, Integer.MAX_VALUE);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final o2<Object> f85834a = new o2<>(false, Integer.MAX_VALUE);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<T> extends qb0.g<T> {

        /* renamed from: f, reason: collision with root package name */
        public static final int f85835f = rx.internal.util.j.f86718d / 4;

        /* renamed from: a, reason: collision with root package name */
        public final e<T> f85836a;

        /* renamed from: b, reason: collision with root package name */
        public final long f85837b;

        /* renamed from: c, reason: collision with root package name */
        public volatile boolean f85838c;

        /* renamed from: d, reason: collision with root package name */
        public volatile rx.internal.util.j f85839d;

        /* renamed from: e, reason: collision with root package name */
        public int f85840e;

        public c(e<T> eVar, long j11) {
            this.f85836a = eVar;
            this.f85837b = j11;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85838c = true;
            this.f85836a.D();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85836a.S().offer(th2);
            this.f85838c = true;
            this.f85836a.D();
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f85836a.e0(this, t11);
        }

        @Override // qb0.g
        public void onStart() {
            int i11 = rx.internal.util.j.f86718d;
            this.f85840e = i11;
            request(i11);
        }

        public void q(long j11) {
            int i11 = this.f85840e - ((int) j11);
            if (i11 > f85835f) {
                this.f85840e = i11;
                return;
            }
            int i12 = rx.internal.util.j.f86718d;
            this.f85840e = i12;
            int i13 = i12 - i11;
            if (i13 > 0) {
                request(i13);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d<T> extends AtomicLong implements qb0.d {
        private static final long serialVersionUID = -1214379189873595503L;

        /* renamed from: a, reason: collision with root package name */
        public final e<T> f85841a;

        public d(e<T> eVar) {
            this.f85841a = eVar;
        }

        public long a(int i11) {
            return addAndGet(-i11);
        }

        @Override // qb0.d
        public void request(long j11) {
            if (j11 <= 0) {
                if (j11 < 0) {
                    throw new IllegalArgumentException("n >= 0 required");
                }
            } else {
                if (get() == Long.MAX_VALUE) {
                    return;
                }
                rx.internal.operators.a.b(this, j11);
                this.f85841a.D();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e<T> extends qb0.g<rx.c<? extends T>> {

        /* renamed from: r, reason: collision with root package name */
        public static final c<?>[] f85842r = new c[0];

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f85843a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f85844b;

        /* renamed from: c, reason: collision with root package name */
        public final int f85845c;

        /* renamed from: d, reason: collision with root package name */
        public d<T> f85846d;

        /* renamed from: e, reason: collision with root package name */
        public volatile Queue<Object> f85847e;

        /* renamed from: f, reason: collision with root package name */
        public volatile ec0.b f85848f;

        /* renamed from: g, reason: collision with root package name */
        public volatile ConcurrentLinkedQueue<Throwable> f85849g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f85850h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f85851i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f85852j;

        /* renamed from: k, reason: collision with root package name */
        public final Object f85853k = new Object();

        /* renamed from: l, reason: collision with root package name */
        public volatile c<?>[] f85854l = f85842r;

        /* renamed from: m, reason: collision with root package name */
        public long f85855m;

        /* renamed from: n, reason: collision with root package name */
        public long f85856n;

        /* renamed from: o, reason: collision with root package name */
        public int f85857o;

        /* renamed from: p, reason: collision with root package name */
        public final int f85858p;

        /* renamed from: q, reason: collision with root package name */
        public int f85859q;

        public e(qb0.g<? super T> gVar, boolean z11, int i11) {
            this.f85843a = gVar;
            this.f85844b = z11;
            this.f85845c = i11;
            if (i11 == Integer.MAX_VALUE) {
                this.f85858p = Integer.MAX_VALUE;
                request(Long.MAX_VALUE);
            } else {
                this.f85858p = Math.max(1, i11 >> 1);
                request(i11);
            }
        }

        public boolean C() {
            if (this.f85843a.isUnsubscribed()) {
                return true;
            }
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue = this.f85849g;
            if (this.f85844b || concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
                return false;
            }
            try {
                b0();
                return true;
            } finally {
                unsubscribe();
            }
        }

        public void D() {
            synchronized (this) {
                try {
                    if (this.f85851i) {
                        this.f85852j = true;
                    } else {
                        this.f85851i = true;
                        H();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void E() {
            int i11 = this.f85859q + 1;
            if (i11 != this.f85858p) {
                this.f85859q = i11;
            } else {
                this.f85859q = 0;
                c0(i11);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x01a6  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x00f9 A[Catch: all -> 0x005c, TryCatch #9 {all -> 0x005c, blocks: (B:3:0x0003, B:4:0x0005, B:6:0x000c, B:15:0x0030, B:18:0x0040, B:23:0x0067, B:25:0x0049, B:30:0x004d, B:27:0x0060, B:52:0x007f, B:59:0x009a, B:62:0x00a5, B:66:0x00ad, B:68:0x00b1, B:71:0x00b8, B:73:0x00bc, B:76:0x00c2, B:78:0x00c9, B:85:0x00dc, B:87:0x00e5, B:91:0x00ea, B:95:0x00ed, B:99:0x00f9, B:101:0x0100, B:105:0x0108, B:107:0x010f, B:109:0x0114, B:111:0x011b, B:130:0x013b, B:131:0x0147, B:137:0x0151, B:140:0x0159, B:142:0x015f, B:144:0x0169, B:148:0x016f, B:152:0x0174, B:156:0x0177, B:158:0x0183, B:161:0x018b), top: B:2:0x0003 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void H() {
            /*
                Method dump skipped, instructions count: 431
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.o2.e.H():void");
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void I(T r5, long r6) {
            /*
                r4 = this;
                r0 = 1
                r1 = 0
                qb0.g<? super T> r2 = r4.f85843a     // Catch: java.lang.Throwable -> L8
                r2.onNext(r5)     // Catch: java.lang.Throwable -> L8
                goto L23
            L8:
                r5 = move-exception
                boolean r2 = r4.f85844b     // Catch: java.lang.Throwable -> L19
                if (r2 != 0) goto L1c
                vb0.a.e(r5)     // Catch: java.lang.Throwable -> L19
                r4.unsubscribe()     // Catch: java.lang.Throwable -> L17
                r4.onError(r5)     // Catch: java.lang.Throwable -> L17
                goto L49
            L17:
                r5 = move-exception
                goto L55
            L19:
                r5 = move-exception
                r0 = r1
                goto L55
            L1c:
                java.util.Queue r2 = r4.S()     // Catch: java.lang.Throwable -> L19
                r2.offer(r5)     // Catch: java.lang.Throwable -> L19
            L23:
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r5 == 0) goto L31
                rx.internal.operators.o2$d<T> r5 = r4.f85846d     // Catch: java.lang.Throwable -> L19
                r5.a(r0)     // Catch: java.lang.Throwable -> L19
            L31:
                int r5 = r4.f85859q     // Catch: java.lang.Throwable -> L19
                int r5 = r5 + r0
                int r6 = r4.f85858p     // Catch: java.lang.Throwable -> L19
                if (r5 != r6) goto L3f
                r4.f85859q = r1     // Catch: java.lang.Throwable -> L19
                long r5 = (long) r5     // Catch: java.lang.Throwable -> L19
                r4.c0(r5)     // Catch: java.lang.Throwable -> L19
                goto L41
            L3f:
                r4.f85859q = r5     // Catch: java.lang.Throwable -> L19
            L41:
                monitor-enter(r4)     // Catch: java.lang.Throwable -> L19
                boolean r5 = r4.f85852j     // Catch: java.lang.Throwable -> L4a
                if (r5 != 0) goto L4c
                r4.f85851i = r1     // Catch: java.lang.Throwable -> L4a
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L4a
            L49:
                return
            L4a:
                r5 = move-exception
                goto L53
            L4c:
                r4.f85852j = r1     // Catch: java.lang.Throwable -> L4a
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L4a
                r4.H()
                return
            L53:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L4a
                throw r5     // Catch: java.lang.Throwable -> L17
            L55:
                if (r0 != 0) goto L5f
                monitor-enter(r4)
                r4.f85851i = r1     // Catch: java.lang.Throwable -> L5c
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L5c
                goto L5f
            L5c:
                r5 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L5c
                throw r5
            L5f:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.o2.e.I(java.lang.Object, long):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void L(rx.internal.operators.o2.c<T> r5, T r6, long r7) {
            /*
                r4 = this;
                r0 = 1
                r1 = 0
                qb0.g<? super T> r2 = r4.f85843a     // Catch: java.lang.Throwable -> L8
                r2.onNext(r6)     // Catch: java.lang.Throwable -> L8
                goto L23
            L8:
                r6 = move-exception
                boolean r2 = r4.f85844b     // Catch: java.lang.Throwable -> L19
                if (r2 != 0) goto L1c
                vb0.a.e(r6)     // Catch: java.lang.Throwable -> L19
                r5.unsubscribe()     // Catch: java.lang.Throwable -> L17
                r5.onError(r6)     // Catch: java.lang.Throwable -> L17
                goto L3e
            L17:
                r5 = move-exception
                goto L4a
            L19:
                r5 = move-exception
                r0 = r1
                goto L4a
            L1c:
                java.util.Queue r2 = r4.S()     // Catch: java.lang.Throwable -> L19
                r2.offer(r6)     // Catch: java.lang.Throwable -> L19
            L23:
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r6 == 0) goto L31
                rx.internal.operators.o2$d<T> r6 = r4.f85846d     // Catch: java.lang.Throwable -> L19
                r6.a(r0)     // Catch: java.lang.Throwable -> L19
            L31:
                r6 = 1
                r5.q(r6)     // Catch: java.lang.Throwable -> L19
                monitor-enter(r4)     // Catch: java.lang.Throwable -> L19
                boolean r5 = r4.f85852j     // Catch: java.lang.Throwable -> L3f
                if (r5 != 0) goto L41
                r4.f85851i = r1     // Catch: java.lang.Throwable -> L3f
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L3f
            L3e:
                return
            L3f:
                r5 = move-exception
                goto L48
            L41:
                r4.f85852j = r1     // Catch: java.lang.Throwable -> L3f
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L3f
                r4.H()
                return
            L48:
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L3f
                throw r5     // Catch: java.lang.Throwable -> L17
            L4a:
                if (r0 != 0) goto L54
                monitor-enter(r4)
                r4.f85851i = r1     // Catch: java.lang.Throwable -> L51
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L51
                goto L54
            L51:
                r5 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L51
                throw r5
            L54:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: rx.internal.operators.o2.e.L(rx.internal.operators.o2$c, java.lang.Object, long):void");
        }

        public ec0.b Q() {
            ec0.b bVar;
            boolean z11;
            ec0.b bVar2 = this.f85848f;
            if (bVar2 != null) {
                return bVar2;
            }
            synchronized (this) {
                try {
                    bVar = this.f85848f;
                    if (bVar == null) {
                        bVar = new ec0.b();
                        this.f85848f = bVar;
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z11) {
                add(bVar);
            }
            return bVar;
        }

        public Queue<Throwable> S() {
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue;
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue2 = this.f85849g;
            if (concurrentLinkedQueue2 != null) {
                return concurrentLinkedQueue2;
            }
            synchronized (this) {
                try {
                    concurrentLinkedQueue = this.f85849g;
                    if (concurrentLinkedQueue == null) {
                        concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
                        this.f85849g = concurrentLinkedQueue;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return concurrentLinkedQueue;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qb0.c
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public void onNext(rx.c<? extends T> cVar) {
            if (cVar == null) {
                return;
            }
            if (cVar == rx.c.S1()) {
                E();
                return;
            }
            if (cVar instanceof rx.internal.util.k) {
                d0(((rx.internal.util.k) cVar).y7());
                return;
            }
            long j11 = this.f85855m;
            this.f85855m = 1 + j11;
            c cVar2 = new c(this, j11);
            q(cVar2);
            cVar.J6(cVar2);
            D();
        }

        public void V(T t11) {
            Queue<Object> queue = this.f85847e;
            if (queue == null) {
                int i11 = this.f85845c;
                if (i11 == Integer.MAX_VALUE) {
                    queue = new rx.internal.util.atomic.g<>(rx.internal.util.j.f86718d);
                } else {
                    queue = rx.internal.util.unsafe.p.a(i11) ? rx.internal.util.unsafe.n0.f() ? new rx.internal.util.unsafe.z<>(i11) : new rx.internal.util.atomic.d<>(i11) : new SpscExactAtomicArrayQueue<>(i11);
                }
                this.f85847e = queue;
            }
            if (queue.offer(v.j(t11))) {
                return;
            }
            unsubscribe();
            onError(OnErrorThrowable.addValueAsLastCause(new MissingBackpressureException(), t11));
        }

        public void Z(c<T> cVar, T t11) {
            rx.internal.util.j jVar = cVar.f85839d;
            if (jVar == null) {
                jVar = rx.internal.util.j.g();
                cVar.add(jVar);
                cVar.f85839d = jVar;
            }
            try {
                jVar.r(v.j(t11));
            } catch (IllegalStateException e11) {
                if (cVar.isUnsubscribed()) {
                    return;
                }
                cVar.unsubscribe();
                cVar.onError(e11);
            } catch (MissingBackpressureException e12) {
                cVar.unsubscribe();
                cVar.onError(e12);
            }
        }

        public void a0(c<T> cVar) {
            rx.internal.util.j jVar = cVar.f85839d;
            if (jVar != null) {
                jVar.E();
            }
            this.f85848f.e(cVar);
            synchronized (this.f85853k) {
                try {
                    c<?>[] cVarArr = this.f85854l;
                    int length = cVarArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            i11 = -1;
                            break;
                        } else if (!cVar.equals(cVarArr[i11])) {
                            i11++;
                        }
                    }
                    if (i11 < 0) {
                        return;
                    }
                    if (length == 1) {
                        this.f85854l = f85842r;
                        return;
                    }
                    c<?>[] cVarArr2 = new c[length - 1];
                    System.arraycopy(cVarArr, 0, cVarArr2, 0, i11);
                    System.arraycopy(cVarArr, i11 + 1, cVarArr2, i11, (length - i11) - 1);
                    this.f85854l = cVarArr2;
                } finally {
                }
            }
        }

        public final void b0() {
            ArrayList arrayList = new ArrayList(this.f85849g);
            if (arrayList.size() == 1) {
                this.f85843a.onError((Throwable) arrayList.get(0));
            } else {
                this.f85843a.onError(new CompositeException(arrayList));
            }
        }

        public void c0(long j11) {
            request(j11);
        }

        public void d0(T t11) {
            long j11 = this.f85846d.get();
            boolean z11 = false;
            if (j11 != 0) {
                synchronized (this) {
                    try {
                        j11 = this.f85846d.get();
                        if (!this.f85851i && j11 != 0) {
                            z11 = true;
                            this.f85851i = true;
                        }
                    } finally {
                    }
                }
            }
            if (!z11) {
                V(t11);
                D();
                return;
            }
            Queue<Object> queue = this.f85847e;
            if (queue == null || queue.isEmpty()) {
                I(t11, j11);
            } else {
                V(t11);
                H();
            }
        }

        public void e0(c<T> cVar, T t11) {
            long j11 = this.f85846d.get();
            boolean z11 = false;
            if (j11 != 0) {
                synchronized (this) {
                    try {
                        j11 = this.f85846d.get();
                        if (!this.f85851i && j11 != 0) {
                            z11 = true;
                            this.f85851i = true;
                        }
                    } finally {
                    }
                }
            }
            if (!z11) {
                Z(cVar, t11);
                D();
                return;
            }
            rx.internal.util.j jVar = cVar.f85839d;
            if (jVar == null || jVar.j()) {
                L(cVar, t11, j11);
            } else {
                Z(cVar, t11);
                H();
            }
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85850h = true;
            D();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            S().offer(th2);
            this.f85850h = true;
            D();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void q(c<T> cVar) {
            Q().a(cVar);
            synchronized (this.f85853k) {
                c<?>[] cVarArr = this.f85854l;
                int length = cVarArr.length;
                c<?>[] cVarArr2 = new c[length + 1];
                System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                cVarArr2[length] = cVar;
                this.f85854l = cVarArr2;
            }
        }
    }

    public o2(boolean z11, int i11) {
        this.f85831a = z11;
        this.f85832b = i11;
    }

    public static <T> o2<T> b(boolean z11) {
        return z11 ? (o2<T>) a.f85833a : (o2<T>) b.f85834a;
    }

    public static <T> o2<T> h(boolean z11, int i11) {
        if (i11 > 0) {
            return i11 == Integer.MAX_VALUE ? b(z11) : new o2<>(z11, i11);
        }
        throw new IllegalArgumentException("maxConcurrent > 0 required but it was " + i11);
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<rx.c<? extends T>> call(qb0.g<? super T> gVar) {
        e eVar = new e(gVar, this.f85831a, this.f85832b);
        d<T> dVar = new d<>(eVar);
        eVar.f85846d = dVar;
        gVar.add(eVar);
        gVar.setProducer(dVar);
        return eVar;
    }
}
