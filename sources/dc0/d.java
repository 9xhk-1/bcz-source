package dc0;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class d<T> extends dc0.f<T, T> {

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f47745c = new Object[0];

    /* renamed from: b, reason: collision with root package name */
    public final e<T> f47746b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a<T> {
        void complete();

        boolean isComplete();

        boolean isEmpty();

        T last();

        int size();

        T[] toArray(T[] tArr);

        Throwable v();

        void w(T t11);

        void x(Throwable th2);

        void y(b<T> bVar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> extends AtomicInteger implements qb0.d, qb0.h {
        private static final long serialVersionUID = -5006209596735204567L;

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f47747a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicLong f47748b = new AtomicLong();

        /* renamed from: c, reason: collision with root package name */
        public final e<T> f47749c;

        /* renamed from: d, reason: collision with root package name */
        public int f47750d;

        /* renamed from: e, reason: collision with root package name */
        public int f47751e;

        /* renamed from: f, reason: collision with root package name */
        public Object f47752f;

        public b(qb0.g<? super T> gVar, e<T> eVar) {
            this.f47747a = gVar;
            this.f47749c = eVar;
        }

        @Override // qb0.h
        public boolean isUnsubscribed() {
            return this.f47747a.isUnsubscribed();
        }

        @Override // qb0.d
        public void request(long j11) {
            if (j11 > 0) {
                rx.internal.operators.a.b(this.f47748b, j11);
                this.f47749c.f47772a.y(this);
            } else {
                if (j11 >= 0) {
                    return;
                }
                throw new IllegalArgumentException("n >= required but it was " + j11);
            }
        }

        @Override // qb0.h
        public void unsubscribe() {
            this.f47749c.r(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<T> implements a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final int f47753a;

        /* renamed from: b, reason: collision with root package name */
        public final long f47754b;

        /* renamed from: c, reason: collision with root package name */
        public final rx.d f47755c;

        /* renamed from: d, reason: collision with root package name */
        public volatile a<T> f47756d;

        /* renamed from: e, reason: collision with root package name */
        public a<T> f47757e;

        /* renamed from: f, reason: collision with root package name */
        public int f47758f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f47759g;

        /* renamed from: h, reason: collision with root package name */
        public Throwable f47760h;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a<T> extends AtomicReference<a<T>> {
            private static final long serialVersionUID = 3713592843205853725L;

            /* renamed from: a, reason: collision with root package name */
            public final T f47761a;

            /* renamed from: b, reason: collision with root package name */
            public final long f47762b;

            public a(T t11, long j11) {
                this.f47761a = t11;
                this.f47762b = j11;
            }
        }

        public c(int i11, long j11, rx.d dVar) {
            this.f47753a = i11;
            a<T> aVar = new a<>(null, 0L);
            this.f47757e = aVar;
            this.f47756d = aVar;
            this.f47754b = j11;
            this.f47755c = dVar;
        }

        public void a() {
            long b11 = this.f47755c.b() - this.f47754b;
            a<T> aVar = this.f47756d;
            a<T> aVar2 = aVar;
            while (true) {
                a<T> aVar3 = aVar2.get();
                if (aVar3 == null || aVar3.f47762b > b11) {
                    break;
                } else {
                    aVar2 = aVar3;
                }
            }
            if (aVar != aVar2) {
                this.f47756d = aVar2;
            }
        }

        public a<T> b() {
            long b11 = this.f47755c.b() - this.f47754b;
            a<T> aVar = this.f47756d;
            while (true) {
                a<T> aVar2 = aVar.get();
                if (aVar2 == null || aVar2.f47762b > b11) {
                    break;
                }
                aVar = aVar2;
            }
            return aVar;
        }

        @Override // dc0.d.a
        public void complete() {
            a();
            this.f47759g = true;
        }

        @Override // dc0.d.a
        public boolean isComplete() {
            return this.f47759g;
        }

        @Override // dc0.d.a
        public boolean isEmpty() {
            return b().get() == null;
        }

        @Override // dc0.d.a
        public T last() {
            a<T> b11 = b();
            while (true) {
                a<T> aVar = b11.get();
                if (aVar == null) {
                    return b11.f47761a;
                }
                b11 = aVar;
            }
        }

        @Override // dc0.d.a
        public int size() {
            a<T> aVar = b().get();
            int i11 = 0;
            while (aVar != null && i11 != Integer.MAX_VALUE) {
                aVar = aVar.get();
                i11++;
            }
            return i11;
        }

        @Override // dc0.d.a
        public T[] toArray(T[] tArr) {
            ArrayList arrayList = new ArrayList();
            for (a<T> aVar = b().get(); aVar != null; aVar = aVar.get()) {
                arrayList.add(aVar.f47761a);
            }
            return (T[]) arrayList.toArray(tArr);
        }

        @Override // dc0.d.a
        public Throwable v() {
            return this.f47760h;
        }

        @Override // dc0.d.a
        public void w(T t11) {
            a<T> aVar;
            long b11 = this.f47755c.b();
            a<T> aVar2 = new a<>(t11, b11);
            this.f47757e.set(aVar2);
            this.f47757e = aVar2;
            long j11 = b11 - this.f47754b;
            int i11 = this.f47758f;
            a<T> aVar3 = this.f47756d;
            if (i11 == this.f47753a) {
                aVar = aVar3.get();
            } else {
                i11++;
                aVar = aVar3;
            }
            while (true) {
                a<T> aVar4 = aVar.get();
                if (aVar4 == null || aVar4.f47762b > j11) {
                    break;
                }
                i11--;
                aVar = aVar4;
            }
            this.f47758f = i11;
            if (aVar != aVar3) {
                this.f47756d = aVar;
            }
        }

        @Override // dc0.d.a
        public void x(Throwable th2) {
            a();
            this.f47760h = th2;
            this.f47759g = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
        
            if (r10 != r5) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
        
            if (r2.isUnsubscribed() == false) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
        
            r3 = r17.f47759g;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
        
            if (r7.get() != null) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
        
            r13 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
        
            if (r3 == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
        
            if (r13 == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
        
            r18.f47752f = null;
            r1 = r17.f47760h;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
        
            if (r1 == null) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
        
            r2.onError(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0082, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:
        
            r2.onCompleted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0086, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0069, code lost:
        
            r18.f47752f = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x006b, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0089, code lost:
        
            if (r10 == 0) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0092, code lost:
        
            if (r5 == Long.MAX_VALUE) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0094, code lost:
        
            rx.internal.operators.a.i(r18.f47748b, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0099, code lost:
        
            r18.f47752f = r7;
            r4 = r18.addAndGet(-r4);
         */
        @Override // dc0.d.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void y(dc0.d.b<T> r18) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                int r2 = r1.getAndIncrement()
                if (r2 == 0) goto Lc
                goto La2
            Lc:
                qb0.g<? super T> r2 = r1.f47747a
                r4 = 1
            Lf:
                java.util.concurrent.atomic.AtomicLong r5 = r1.f47748b
                long r5 = r5.get()
                java.lang.Object r7 = r1.f47752f
                dc0.d$c$a r7 = (dc0.d.c.a) r7
                r8 = 0
                if (r7 != 0) goto L21
                dc0.d$c$a r7 = r0.b()
            L21:
                r10 = r8
            L22:
                int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
                r13 = 0
                r14 = 0
                if (r12 == 0) goto L61
                boolean r15 = r2.isUnsubscribed()
                if (r15 == 0) goto L31
                r1.f47752f = r14
                return
            L31:
                boolean r15 = r0.f47759g
                java.lang.Object r16 = r7.get()
                r3 = r16
                dc0.d$c$a r3 = (dc0.d.c.a) r3
                if (r3 != 0) goto L40
                r16 = 1
                goto L42
            L40:
                r16 = r13
            L42:
                if (r15 == 0) goto L54
                if (r16 == 0) goto L54
                r1.f47752f = r14
                java.lang.Throwable r1 = r0.f47760h
                if (r1 == 0) goto L50
                r2.onError(r1)
                return
            L50:
                r2.onCompleted()
                return
            L54:
                if (r16 == 0) goto L57
                goto L61
            L57:
                T r7 = r3.f47761a
                r2.onNext(r7)
                r12 = 1
                long r10 = r10 + r12
                r7 = r3
                goto L22
            L61:
                if (r12 != 0) goto L87
                boolean r3 = r2.isUnsubscribed()
                if (r3 == 0) goto L6c
                r1.f47752f = r14
                return
            L6c:
                boolean r3 = r0.f47759g
                java.lang.Object r12 = r7.get()
                if (r12 != 0) goto L75
                r13 = 1
            L75:
                if (r3 == 0) goto L87
                if (r13 == 0) goto L87
                r1.f47752f = r14
                java.lang.Throwable r1 = r0.f47760h
                if (r1 == 0) goto L83
                r2.onError(r1)
                return
            L83:
                r2.onCompleted()
                return
            L87:
                int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r3 == 0) goto L99
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
                if (r3 == 0) goto L99
                java.util.concurrent.atomic.AtomicLong r3 = r1.f47748b
                rx.internal.operators.a.i(r3, r10)
            L99:
                r1.f47752f = r7
                int r3 = -r4
                int r4 = r1.addAndGet(r3)
                if (r4 != 0) goto Lf
            La2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: dc0.d.c.y(dc0.d$b):void");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: dc0.d$d, reason: collision with other inner class name */
    public static final class C0564d<T> implements a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final int f47763a;

        /* renamed from: b, reason: collision with root package name */
        public volatile a<T> f47764b;

        /* renamed from: c, reason: collision with root package name */
        public a<T> f47765c;

        /* renamed from: d, reason: collision with root package name */
        public int f47766d;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f47767e;

        /* renamed from: f, reason: collision with root package name */
        public Throwable f47768f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: dc0.d$d$a */
        public static final class a<T> extends AtomicReference<a<T>> {
            private static final long serialVersionUID = 3713592843205853725L;

            /* renamed from: a, reason: collision with root package name */
            public final T f47769a;

            public a(T t11) {
                this.f47769a = t11;
            }
        }

        public C0564d(int i11) {
            this.f47763a = i11;
            a<T> aVar = new a<>(null);
            this.f47765c = aVar;
            this.f47764b = aVar;
        }

        @Override // dc0.d.a
        public void complete() {
            this.f47767e = true;
        }

        @Override // dc0.d.a
        public boolean isComplete() {
            return this.f47767e;
        }

        @Override // dc0.d.a
        public boolean isEmpty() {
            return this.f47764b.get() == null;
        }

        @Override // dc0.d.a
        public T last() {
            a<T> aVar = this.f47764b;
            while (true) {
                a<T> aVar2 = aVar.get();
                if (aVar2 == null) {
                    return aVar.f47769a;
                }
                aVar = aVar2;
            }
        }

        @Override // dc0.d.a
        public int size() {
            a<T> aVar = this.f47764b.get();
            int i11 = 0;
            while (aVar != null && i11 != Integer.MAX_VALUE) {
                aVar = aVar.get();
                i11++;
            }
            return i11;
        }

        @Override // dc0.d.a
        public T[] toArray(T[] tArr) {
            ArrayList arrayList = new ArrayList();
            for (a<T> aVar = this.f47764b.get(); aVar != null; aVar = aVar.get()) {
                arrayList.add(aVar.f47769a);
            }
            return (T[]) arrayList.toArray(tArr);
        }

        @Override // dc0.d.a
        public Throwable v() {
            return this.f47768f;
        }

        @Override // dc0.d.a
        public void w(T t11) {
            a<T> aVar = new a<>(t11);
            this.f47765c.set(aVar);
            this.f47765c = aVar;
            int i11 = this.f47766d;
            if (i11 == this.f47763a) {
                this.f47764b = this.f47764b.get();
            } else {
                this.f47766d = i11 + 1;
            }
        }

        @Override // dc0.d.a
        public void x(Throwable th2) {
            this.f47768f = th2;
            this.f47767e = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
        
            if (r10 != r5) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
        
            if (r2.isUnsubscribed() == false) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
        
            r3 = r17.f47767e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
        
            if (r7.get() != null) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
        
            r13 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
        
            if (r3 == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0075, code lost:
        
            if (r13 == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0077, code lost:
        
            r18.f47752f = null;
            r1 = r17.f47768f;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x007b, code lost:
        
            if (r1 == null) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x007d, code lost:
        
            r2.onError(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0080, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0081, code lost:
        
            r2.onCompleted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0084, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0067, code lost:
        
            r18.f47752f = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0069, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
        
            if (r10 == 0) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0090, code lost:
        
            if (r5 == Long.MAX_VALUE) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0092, code lost:
        
            rx.internal.operators.a.i(r18.f47748b, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0097, code lost:
        
            r18.f47752f = r7;
            r4 = r18.addAndGet(-r4);
         */
        @Override // dc0.d.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void y(dc0.d.b<T> r18) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                int r2 = r1.getAndIncrement()
                if (r2 == 0) goto Lc
                goto La0
            Lc:
                qb0.g<? super T> r2 = r1.f47747a
                r4 = 1
            Lf:
                java.util.concurrent.atomic.AtomicLong r5 = r1.f47748b
                long r5 = r5.get()
                java.lang.Object r7 = r1.f47752f
                dc0.d$d$a r7 = (dc0.d.C0564d.a) r7
                r8 = 0
                if (r7 != 0) goto L1f
                dc0.d$d$a<T> r7 = r0.f47764b
            L1f:
                r10 = r8
            L20:
                int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
                r13 = 0
                r14 = 0
                if (r12 == 0) goto L5f
                boolean r15 = r2.isUnsubscribed()
                if (r15 == 0) goto L2f
                r1.f47752f = r14
                return
            L2f:
                boolean r15 = r0.f47767e
                java.lang.Object r16 = r7.get()
                r3 = r16
                dc0.d$d$a r3 = (dc0.d.C0564d.a) r3
                if (r3 != 0) goto L3e
                r16 = 1
                goto L40
            L3e:
                r16 = r13
            L40:
                if (r15 == 0) goto L52
                if (r16 == 0) goto L52
                r1.f47752f = r14
                java.lang.Throwable r1 = r0.f47768f
                if (r1 == 0) goto L4e
                r2.onError(r1)
                return
            L4e:
                r2.onCompleted()
                return
            L52:
                if (r16 == 0) goto L55
                goto L5f
            L55:
                T r7 = r3.f47769a
                r2.onNext(r7)
                r12 = 1
                long r10 = r10 + r12
                r7 = r3
                goto L20
            L5f:
                if (r12 != 0) goto L85
                boolean r3 = r2.isUnsubscribed()
                if (r3 == 0) goto L6a
                r1.f47752f = r14
                return
            L6a:
                boolean r3 = r0.f47767e
                java.lang.Object r12 = r7.get()
                if (r12 != 0) goto L73
                r13 = 1
            L73:
                if (r3 == 0) goto L85
                if (r13 == 0) goto L85
                r1.f47752f = r14
                java.lang.Throwable r1 = r0.f47768f
                if (r1 == 0) goto L81
                r2.onError(r1)
                return
            L81:
                r2.onCompleted()
                return
            L85:
                int r3 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r3 == 0) goto L97
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
                if (r3 == 0) goto L97
                java.util.concurrent.atomic.AtomicLong r3 = r1.f47748b
                rx.internal.operators.a.i(r3, r10)
            L97:
                r1.f47752f = r7
                int r3 = -r4
                int r4 = r1.addAndGet(r3)
                if (r4 != 0) goto Lf
            La0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: dc0.d.C0564d.y(dc0.d$b):void");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e<T> extends AtomicReference<b<T>[]> implements c.a<T>, qb0.c<T> {

        /* renamed from: b, reason: collision with root package name */
        public static final b[] f47770b = new b[0];

        /* renamed from: c, reason: collision with root package name */
        public static final b[] f47771c = new b[0];
        private static final long serialVersionUID = 5952362471246910544L;

        /* renamed from: a, reason: collision with root package name */
        public final a<T> f47772a;

        public e(a<T> aVar) {
            this.f47772a = aVar;
            lazySet(f47770b);
        }

        public boolean h(b<T> bVar) {
            b<T>[] bVarArr;
            b[] bVarArr2;
            do {
                bVarArr = get();
                if (bVarArr == f47771c) {
                    return false;
                }
                int length = bVarArr.length;
                bVarArr2 = new b[length + 1];
                System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                bVarArr2[length] = bVar;
            } while (!compareAndSet(bVarArr, bVarArr2));
            return true;
        }

        @Override // wb0.b
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super T> gVar) {
            b<T> bVar = new b<>(gVar, this);
            gVar.add(bVar);
            gVar.setProducer(bVar);
            if (h(bVar) && bVar.isUnsubscribed()) {
                r(bVar);
            } else {
                this.f47772a.y(bVar);
            }
        }

        @Override // qb0.c
        public void onCompleted() {
            a<T> aVar = this.f47772a;
            aVar.complete();
            for (b<T> bVar : getAndSet(f47771c)) {
                aVar.y(bVar);
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            a<T> aVar = this.f47772a;
            aVar.x(th2);
            ArrayList arrayList = null;
            for (b<T> bVar : getAndSet(f47771c)) {
                try {
                    aVar.y(bVar);
                } catch (Throwable th3) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th3);
                }
            }
            vb0.a.d(arrayList);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            a<T> aVar = this.f47772a;
            aVar.w(t11);
            for (b<T> bVar : get()) {
                aVar.y(bVar);
            }
        }

        public boolean q() {
            return get() == f47771c;
        }

        public void r(b<T> bVar) {
            b<T>[] bVarArr;
            b[] bVarArr2;
            do {
                bVarArr = get();
                if (bVarArr == f47771c || bVarArr == f47770b) {
                    return;
                }
                int length = bVarArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        i11 = -1;
                        break;
                    } else if (bVarArr[i11] == bVar) {
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i11 < 0) {
                    return;
                }
                if (length == 1) {
                    bVarArr2 = f47770b;
                } else {
                    b[] bVarArr3 = new b[length - 1];
                    System.arraycopy(bVarArr, 0, bVarArr3, 0, i11);
                    System.arraycopy(bVarArr, i11 + 1, bVarArr3, i11, (length - i11) - 1);
                    bVarArr2 = bVarArr3;
                }
            } while (!compareAndSet(bVarArr, bVarArr2));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f<T> implements a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final int f47773a;

        /* renamed from: b, reason: collision with root package name */
        public volatile int f47774b;

        /* renamed from: c, reason: collision with root package name */
        public final Object[] f47775c;

        /* renamed from: d, reason: collision with root package name */
        public Object[] f47776d;

        /* renamed from: e, reason: collision with root package name */
        public int f47777e;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f47778f;

        /* renamed from: g, reason: collision with root package name */
        public Throwable f47779g;

        public f(int i11) {
            this.f47773a = i11;
            Object[] objArr = new Object[i11 + 1];
            this.f47775c = objArr;
            this.f47776d = objArr;
        }

        @Override // dc0.d.a
        public void complete() {
            this.f47778f = true;
        }

        @Override // dc0.d.a
        public boolean isComplete() {
            return this.f47778f;
        }

        @Override // dc0.d.a
        public boolean isEmpty() {
            return this.f47774b == 0;
        }

        @Override // dc0.d.a
        public T last() {
            int i11 = this.f47774b;
            if (i11 == 0) {
                return null;
            }
            Object[] objArr = this.f47775c;
            int i12 = this.f47773a;
            while (i11 >= i12) {
                objArr = (Object[]) objArr[i12];
                i11 -= i12;
            }
            return (T) objArr[i11 - 1];
        }

        @Override // dc0.d.a
        public int size() {
            return this.f47774b;
        }

        @Override // dc0.d.a
        public T[] toArray(T[] tArr) {
            int i11 = this.f47774b;
            if (tArr.length < i11) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i11));
            }
            Object[] objArr = this.f47775c;
            int i12 = this.f47773a;
            int i13 = 0;
            while (true) {
                int i14 = i13 + i12;
                if (i14 >= i11) {
                    break;
                }
                System.arraycopy(objArr, 0, tArr, i13, i12);
                objArr = objArr[i12];
                i13 = i14;
            }
            System.arraycopy(objArr, 0, tArr, i13, i11 - i13);
            if (tArr.length > i11) {
                tArr[i11] = null;
            }
            return tArr;
        }

        @Override // dc0.d.a
        public Throwable v() {
            return this.f47779g;
        }

        @Override // dc0.d.a
        public void w(T t11) {
            if (this.f47778f) {
                return;
            }
            int i11 = this.f47777e;
            Object[] objArr = this.f47776d;
            if (i11 == objArr.length - 1) {
                Object[] objArr2 = new Object[objArr.length];
                objArr2[0] = t11;
                this.f47777e = 1;
                objArr[i11] = objArr2;
                this.f47776d = objArr2;
            } else {
                objArr[i11] = t11;
                this.f47777e = i11 + 1;
            }
            this.f47774b++;
        }

        @Override // dc0.d.a
        public void x(Throwable th2) {
            if (this.f47778f) {
                ac0.c.I(th2);
            } else {
                this.f47779g = th2;
                this.f47778f = true;
            }
        }

        @Override // dc0.d.a
        public void y(b<T> bVar) {
            long j11;
            if (bVar.getAndIncrement() != 0) {
                return;
            }
            qb0.g<? super T> gVar = bVar.f47747a;
            int i11 = this.f47773a;
            int i12 = 1;
            do {
                long j12 = bVar.f47748b.get();
                Object[] objArr = (Object[]) bVar.f47752f;
                if (objArr == null) {
                    objArr = this.f47775c;
                }
                int i13 = bVar.f47751e;
                int i14 = bVar.f47750d;
                long j13 = 0;
                while (true) {
                    if (j13 == j12) {
                        j11 = 0;
                        break;
                    }
                    if (gVar.isUnsubscribed()) {
                        bVar.f47752f = null;
                        return;
                    }
                    j11 = 0;
                    boolean z11 = this.f47778f;
                    boolean z12 = i14 == this.f47774b;
                    if (z11 && z12) {
                        bVar.f47752f = null;
                        Throwable th2 = this.f47779g;
                        if (th2 != null) {
                            gVar.onError(th2);
                            return;
                        } else {
                            gVar.onCompleted();
                            return;
                        }
                    }
                    if (z12) {
                        break;
                    }
                    if (i13 == i11) {
                        objArr = (Object[]) objArr[i13];
                        i13 = 0;
                    }
                    gVar.onNext(objArr[i13]);
                    j13++;
                    i13++;
                    i14++;
                }
                if (j13 == j12) {
                    if (gVar.isUnsubscribed()) {
                        bVar.f47752f = null;
                        return;
                    }
                    boolean z13 = this.f47778f;
                    boolean z14 = i14 == this.f47774b;
                    if (z13 && z14) {
                        bVar.f47752f = null;
                        Throwable th3 = this.f47779g;
                        if (th3 != null) {
                            gVar.onError(th3);
                            return;
                        } else {
                            gVar.onCompleted();
                            return;
                        }
                    }
                }
                if (j13 != j11 && j12 != Long.MAX_VALUE) {
                    rx.internal.operators.a.i(bVar.f47748b, j13);
                }
                bVar.f47750d = i14;
                bVar.f47751e = i13;
                bVar.f47752f = objArr;
                i12 = bVar.addAndGet(-i12);
            } while (i12 != 0);
        }
    }

    public d(e<T> eVar) {
        super(eVar);
        this.f47746b = eVar;
    }

    public static <T> d<T> A7() {
        return new d<>(new e(new C0564d(Integer.MAX_VALUE)));
    }

    public static <T> d<T> B7() {
        return new d<>(new e(new c(Integer.MAX_VALUE, Long.MAX_VALUE, bc0.c.d())));
    }

    public static <T> d<T> C7(int i11) {
        return new d<>(new e(new C0564d(i11)));
    }

    public static <T> d<T> D7(long j11, TimeUnit timeUnit, rx.d dVar) {
        return E7(j11, timeUnit, Integer.MAX_VALUE, dVar);
    }

    public static <T> d<T> E7(long j11, TimeUnit timeUnit, int i11, rx.d dVar) {
        return new d<>(new e(new c(i11, timeUnit.toMillis(j11), dVar)));
    }

    public static <T> d<T> y7() {
        return z7(16);
    }

    public static <T> d<T> z7(int i11) {
        if (i11 > 0) {
            return new d<>(new e(new f(i11)));
        }
        throw new IllegalArgumentException("capacity > 0 required but it was " + i11);
    }

    public Throwable F7() {
        if (this.f47746b.q()) {
            return this.f47746b.f47772a.v();
        }
        return null;
    }

    public T G7() {
        return this.f47746b.f47772a.last();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object[] H7() {
        Object[] objArr = f47745c;
        Object[] I7 = I7(objArr);
        return I7 == objArr ? new Object[0] : I7;
    }

    public T[] I7(T[] tArr) {
        return this.f47746b.f47772a.toArray(tArr);
    }

    public boolean J7() {
        return !this.f47746b.f47772a.isEmpty();
    }

    public boolean K7() {
        return this.f47746b.q() && this.f47746b.f47772a.v() == null;
    }

    public boolean L7() {
        return this.f47746b.q() && this.f47746b.f47772a.v() != null;
    }

    public boolean M7() {
        return J7();
    }

    public int N7() {
        return this.f47746b.f47772a.size();
    }

    public int O7() {
        return this.f47746b.get().length;
    }

    @Override // qb0.c
    public void onCompleted() {
        this.f47746b.onCompleted();
    }

    @Override // qb0.c
    public void onError(Throwable th2) {
        this.f47746b.onError(th2);
    }

    @Override // qb0.c
    public void onNext(T t11) {
        this.f47746b.onNext(t11);
    }

    @Override // dc0.f
    public boolean w7() {
        return this.f47746b.get().length != 0;
    }
}
