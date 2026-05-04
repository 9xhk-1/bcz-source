package b80;

import b80.e;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.pool.PoolStats;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.SAFE_CONDITIONAL)
/* loaded from: classes9.dex */
public abstract class a<T, C, E extends e<T, C>> implements b80.c<T, E>, b80.d<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Lock f6415a;

    /* renamed from: b, reason: collision with root package name */
    public final Condition f6416b;

    /* renamed from: c, reason: collision with root package name */
    public final b80.b<T, C> f6417c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<T, g<T, C, E>> f6418d;

    /* renamed from: e, reason: collision with root package name */
    public final Set<E> f6419e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedList<E> f6420f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedList<Future<E>> f6421g;

    /* renamed from: h, reason: collision with root package name */
    public final Map<T, Integer> f6422h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f6423i;

    /* renamed from: j, reason: collision with root package name */
    public volatile int f6424j;

    /* renamed from: k, reason: collision with root package name */
    public volatile int f6425k;

    /* renamed from: l, reason: collision with root package name */
    public volatile int f6426l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: b80.a$a, reason: collision with other inner class name */
    public class C0111a extends g<T, C, E> {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f6427e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0111a(Object obj, Object obj2) {
            super(obj);
            this.f6427e = obj2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // b80.g
        public E b(C c11) {
            return (E) a.this.r(this.f6427e, c11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Future<E> {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f6429a = new AtomicBoolean(false);

        /* renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f6430b = new AtomicBoolean(false);

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReference<E> f6431c = new AtomicReference<>(null);

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ u60.b f6432d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f6433e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Object f6434f;

        public b(u60.b bVar, Object obj, Object obj2) {
            this.f6432d = bVar;
            this.f6433e = obj;
            this.f6434f = obj2;
        }

        @Override // java.util.concurrent.Future
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public E get() throws InterruptedException, ExecutionException {
            try {
                return (E) get(0L, TimeUnit.MILLISECONDS);
            } catch (TimeoutException e11) {
                throw new ExecutionException(e11);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
        
            if (r9.f6430b.compareAndSet(false, true) == false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
        
            r9.f6431c.set(r11);
            r9.f6430b.set(true);
            r9.f6435g.B(r11);
            r12 = r9.f6432d;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
        
            if (r12 == null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
        
            r12.c(r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
        
            return r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
        
            r9.f6435g.G(r11, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
        
            throw new java.util.concurrent.ExecutionException(b80.a.E());
         */
        @Override // java.util.concurrent.Future
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public E get(long r11, java.util.concurrent.TimeUnit r13) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
            /*
                r10 = this;
            L0:
                monitor-enter(r10)
                r1 = 0
                r2 = 1
                java.util.concurrent.atomic.AtomicReference<E extends b80.e<T, C>> r0 = r10.f6431c     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
                java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
                b80.e r0 = (b80.e) r0     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
                if (r0 == 0) goto L14
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lf
                return r0
            Lf:
                r0 = move-exception
                r11 = r0
                r9 = r10
                goto Lb4
            L14:
                java.util.concurrent.atomic.AtomicBoolean r0 = r10.f6430b     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
                boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
                if (r0 != 0) goto L94
                b80.a r3 = b80.a.this     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
                java.lang.Object r4 = r10.f6433e     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
                java.lang.Object r5 = r10.f6434f     // Catch: java.lang.Throwable -> L8e java.io.IOException -> L91
                r9 = r10
                r6 = r11
                r8 = r13
                b80.e r11 = b80.a.j(r3, r4, r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
                b80.a r12 = b80.a.this     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
                int r12 = b80.a.l(r12)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
                if (r12 <= 0) goto L5f
                long r12 = r11.h()     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
                b80.a r0 = b80.a.this     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
                int r0 = b80.a.l(r0)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
                long r3 = (long) r0     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
                long r12 = r12 + r3
                long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
                int r12 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
                if (r12 > 0) goto L5f
                b80.a r12 = b80.a.this     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
                boolean r12 = r12.J(r11)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
                if (r12 != 0) goto L5f
                r11.a()     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
                b80.a r12 = b80.a.this     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
                r12.a(r11, r1)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L59
                r11 = r6
                r13 = r8
                goto L0
            L59:
                r0 = move-exception
            L5a:
                r11 = r0
                goto Lb4
            L5c:
                r0 = move-exception
            L5d:
                r11 = r0
                goto L9f
            L5f:
                java.util.concurrent.atomic.AtomicBoolean r12 = r9.f6430b     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
                boolean r12 = r12.compareAndSet(r1, r2)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
                if (r12 == 0) goto L7f
                java.util.concurrent.atomic.AtomicReference<E extends b80.e<T, C>> r12 = r9.f6431c     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
                r12.set(r11)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
                java.util.concurrent.atomic.AtomicBoolean r12 = r9.f6430b     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
                r12.set(r2)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
                b80.a r12 = b80.a.this     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
                r12.B(r11)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
                u60.b r12 = r9.f6432d     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
                if (r12 == 0) goto L7d
                r12.c(r11)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
            L7d:
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L59
                return r11
            L7f:
                b80.a r12 = b80.a.this     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
                r12.a(r11, r2)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
                java.util.concurrent.ExecutionException r11 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
                java.lang.Exception r12 = b80.a.i()     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
                r11.<init>(r12)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
                throw r11     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
            L8e:
                r0 = move-exception
                r9 = r10
                goto L5a
            L91:
                r0 = move-exception
                r9 = r10
                goto L5d
            L94:
                r9 = r10
                java.util.concurrent.ExecutionException r11 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
                java.lang.Exception r12 = b80.a.i()     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
                r11.<init>(r12)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
                throw r11     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5c
            L9f:
                java.util.concurrent.atomic.AtomicBoolean r12 = r9.f6430b     // Catch: java.lang.Throwable -> L59
                boolean r12 = r12.compareAndSet(r1, r2)     // Catch: java.lang.Throwable -> L59
                if (r12 == 0) goto Lae
                u60.b r12 = r9.f6432d     // Catch: java.lang.Throwable -> L59
                if (r12 == 0) goto Lae
                r12.b(r11)     // Catch: java.lang.Throwable -> L59
            Lae:
                java.util.concurrent.ExecutionException r12 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L59
                r12.<init>(r11)     // Catch: java.lang.Throwable -> L59
                throw r12     // Catch: java.lang.Throwable -> L59
            Lb4:
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L59
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: b80.a.b.get(long, java.util.concurrent.TimeUnit):b80.e");
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z11) {
            if (!this.f6430b.compareAndSet(false, true)) {
                return false;
            }
            this.f6429a.set(true);
            a.this.f6415a.lock();
            try {
                a.this.f6416b.signalAll();
                a.this.f6415a.unlock();
                u60.b bVar = this.f6432d;
                if (bVar != null) {
                    bVar.a();
                }
                return true;
            } catch (Throwable th2) {
                a.this.f6415a.unlock();
                throw th2;
            }
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f6429a.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f6430b.get();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements f<T, C> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f6436a;

        public c(long j11) {
            this.f6436a = j11;
        }

        @Override // b80.f
        public void a(e<T, C> eVar) {
            if (eVar.h() <= this.f6436a) {
                eVar.a();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements f<T, C> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f6438a;

        public d(long j11) {
            this.f6438a = j11;
        }

        @Override // b80.f
        public void a(e<T, C> eVar) {
            if (eVar.l(this.f6438a)) {
                eVar.a();
            }
        }
    }

    public a(b80.b<T, C> bVar, int i11, int i12) {
        this.f6417c = (b80.b) e80.a.j(bVar, "Connection factory");
        this.f6424j = e80.a.k(i11, "Max per route value");
        this.f6425k = e80.a.k(i12, "Max total value");
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f6415a = reentrantLock;
        this.f6416b = reentrantLock.newCondition();
        this.f6418d = new HashMap();
        this.f6419e = new HashSet();
        this.f6420f = new LinkedList<>();
        this.f6421g = new LinkedList<>();
        this.f6422h = new HashMap();
    }

    public static Exception E() {
        return new CancellationException("Operation aborted");
    }

    private void F() {
        Iterator<Map.Entry<T, g<T, C, E>>> it = this.f6418d.entrySet().iterator();
        while (it.hasNext()) {
            g<T, C, E> value = it.next().getValue();
            if (value.i() + value.d() == 0) {
                it.remove();
            }
        }
    }

    private int u(T t11) {
        Integer num = this.f6422h.get(t11);
        return num != null ? num.intValue() : this.f6424j;
    }

    public Future<E> A(T t11, Object obj) {
        return b(t11, obj, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b80.c
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void a(E e11, boolean z11) {
        this.f6415a.lock();
        try {
            if (this.f6419e.remove(e11)) {
                g v11 = v(e11.f());
                v11.c(e11, z11);
                if (!z11 || this.f6423i) {
                    e11.a();
                } else {
                    this.f6420f.addFirst(e11);
                }
                C(e11);
                Future<E> k11 = v11.k();
                if (k11 != null) {
                    this.f6421g.remove(k11);
                } else {
                    k11 = this.f6421g.poll();
                }
                if (k11 != null) {
                    this.f6416b.signalAll();
                }
            }
            this.f6415a.unlock();
        } catch (Throwable th2) {
            this.f6415a.unlock();
            throw th2;
        }
    }

    public void H(int i11) {
        this.f6426l = i11;
    }

    public void I() throws IOException {
        if (this.f6423i) {
            return;
        }
        this.f6423i = true;
        this.f6415a.lock();
        try {
            Iterator<E> it = this.f6420f.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            Iterator<E> it2 = this.f6419e.iterator();
            while (it2.hasNext()) {
                it2.next().a();
            }
            Iterator<g<T, C, E>> it3 = this.f6418d.values().iterator();
            while (it3.hasNext()) {
                it3.next().n();
            }
            this.f6418d.clear();
            this.f6419e.clear();
            this.f6420f.clear();
            this.f6415a.unlock();
        } catch (Throwable th2) {
            this.f6415a.unlock();
            throw th2;
        }
    }

    public boolean J(E e11) {
        return true;
    }

    @Override // b80.c
    public Future<E> b(T t11, Object obj, u60.b<E> bVar) {
        e80.a.j(t11, "Route");
        e80.b.a(!this.f6423i, "Connection pool shut down");
        return new b(bVar, t11, obj);
    }

    @Override // b80.d
    public int e() {
        this.f6415a.lock();
        try {
            return this.f6424j;
        } finally {
            this.f6415a.unlock();
        }
    }

    @Override // b80.d
    public void f(int i11) {
        e80.a.k(i11, "Max per route value");
        this.f6415a.lock();
        try {
            this.f6424j = i11;
        } finally {
            this.f6415a.unlock();
        }
    }

    @Override // b80.d
    public int g() {
        this.f6415a.lock();
        try {
            return this.f6425k;
        } finally {
            this.f6415a.unlock();
        }
    }

    @Override // b80.d
    public PoolStats h() {
        this.f6415a.lock();
        try {
            return new PoolStats(this.f6419e.size(), this.f6421g.size(), this.f6420f.size(), this.f6425k);
        } finally {
            this.f6415a.unlock();
        }
    }

    @Override // b80.d
    public int k(T t11) {
        e80.a.j(t11, "Route");
        this.f6415a.lock();
        try {
            return u(t11);
        } finally {
            this.f6415a.unlock();
        }
    }

    @Override // b80.d
    public void m(T t11, int i11) {
        e80.a.j(t11, "Route");
        this.f6415a.lock();
        try {
            if (i11 > -1) {
                this.f6422h.put(t11, Integer.valueOf(i11));
            } else {
                this.f6422h.remove(t11);
            }
            this.f6415a.unlock();
        } catch (Throwable th2) {
            this.f6415a.unlock();
            throw th2;
        }
    }

    @Override // b80.d
    public PoolStats n(T t11) {
        e80.a.j(t11, "Route");
        this.f6415a.lock();
        try {
            g<T, C, E> v11 = v(t11);
            return new PoolStats(v11.h(), v11.i(), v11.e(), u(t11));
        } finally {
            this.f6415a.unlock();
        }
    }

    @Override // b80.d
    public void o(int i11) {
        e80.a.k(i11, "Max value");
        this.f6415a.lock();
        try {
            this.f6425k = i11;
        } finally {
            this.f6415a.unlock();
        }
    }

    public void p() {
        s(new d(System.currentTimeMillis()));
    }

    public void q(long j11, TimeUnit timeUnit) {
        e80.a.j(timeUnit, "Time unit");
        long millis = timeUnit.toMillis(j11);
        if (millis < 0) {
            millis = 0;
        }
        s(new c(System.currentTimeMillis() - millis));
    }

    public abstract E r(T t11, C c11);

    public void s(f<T, C> fVar) {
        this.f6415a.lock();
        try {
            Iterator<E> it = this.f6420f.iterator();
            while (it.hasNext()) {
                E next = it.next();
                fVar.a(next);
                if (next.k()) {
                    v(next.f()).m(next);
                    it.remove();
                }
            }
            F();
            this.f6415a.unlock();
        } catch (Throwable th2) {
            this.f6415a.unlock();
            throw th2;
        }
    }

    public void t(f<T, C> fVar) {
        this.f6415a.lock();
        try {
            Iterator<E> it = this.f6419e.iterator();
            while (it.hasNext()) {
                fVar.a(it.next());
            }
        } finally {
            this.f6415a.unlock();
        }
    }

    public String toString() {
        this.f6415a.lock();
        try {
            return "[leased: " + this.f6419e + "][available: " + this.f6420f + "][pending: " + this.f6421g + "]";
        } finally {
            this.f6415a.unlock();
        }
    }

    public final g<T, C, E> v(T t11) {
        g<T, C, E> gVar = this.f6418d.get(t11);
        if (gVar != null) {
            return gVar;
        }
        C0111a c0111a = new C0111a(t11, t11);
        this.f6418d.put(t11, c0111a);
        return c0111a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final E w(T t11, Object obj, long j11, TimeUnit timeUnit, Future<E> future) throws IOException, InterruptedException, ExecutionException, TimeoutException {
        E e11;
        Date date = j11 > 0 ? new Date(System.currentTimeMillis() + timeUnit.toMillis(j11)) : null;
        this.f6415a.lock();
        while (true) {
            try {
                boolean z11 = true;
                e80.b.a(!this.f6423i, "Connection pool shut down");
                if (future.isCancelled()) {
                    throw new ExecutionException(E());
                }
                g v11 = v(t11);
                while (true) {
                    e11 = (E) v11.f(obj);
                    if (e11 == null) {
                        break;
                    }
                    if (e11.l(System.currentTimeMillis())) {
                        e11.a();
                    }
                    if (!e11.k()) {
                        break;
                    }
                    this.f6420f.remove(e11);
                    v11.c(e11, false);
                }
                if (e11 != null) {
                    this.f6420f.remove(e11);
                    this.f6419e.add(e11);
                    D(e11);
                    this.f6415a.unlock();
                    return e11;
                }
                int u11 = u(t11);
                int max = Math.max(0, (v11.d() + 1) - u11);
                if (max > 0) {
                    for (int i11 = 0; i11 < max; i11++) {
                        e g11 = v11.g();
                        if (g11 == null) {
                            break;
                        }
                        g11.a();
                        this.f6420f.remove(g11);
                        v11.m(g11);
                    }
                }
                if (v11.d() < u11) {
                    int max2 = Math.max(this.f6425k - this.f6419e.size(), 0);
                    if (max2 > 0) {
                        if (this.f6420f.size() > max2 - 1 && !this.f6420f.isEmpty()) {
                            E removeLast = this.f6420f.removeLast();
                            removeLast.a();
                            v(removeLast.f()).m(removeLast);
                        }
                        E e12 = (E) v11.a(this.f6417c.a(t11));
                        this.f6419e.add(e12);
                        this.f6415a.unlock();
                        return e12;
                    }
                }
                try {
                    v11.l(future);
                    this.f6421g.add(future);
                    if (date != null) {
                        z11 = this.f6416b.awaitUntil(date);
                    } else {
                        this.f6416b.await();
                    }
                    if (future.isCancelled()) {
                        throw new ExecutionException(E());
                    }
                    v11.o(future);
                    this.f6421g.remove(future);
                    if (!z11 && date != null && date.getTime() <= System.currentTimeMillis()) {
                        throw new TimeoutException("Timeout waiting for connection");
                    }
                } finally {
                    v11.o(future);
                    this.f6421g.remove(future);
                }
            } catch (Throwable th2) {
                this.f6415a.unlock();
                throw th2;
            }
        }
    }

    public Set<T> x() {
        this.f6415a.lock();
        try {
            return new HashSet(this.f6418d.keySet());
        } finally {
            this.f6415a.unlock();
        }
    }

    public int y() {
        return this.f6426l;
    }

    public boolean z() {
        return this.f6423i;
    }

    public void B(E e11) {
    }

    public void C(E e11) {
    }

    public void D(E e11) {
    }
}
