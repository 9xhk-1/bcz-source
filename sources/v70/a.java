package v70;

import androidx.collection.SieveCacheKt;
import b80.e;
import e80.g;
import java.io.IOException;
import java.net.SocketAddress;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.nio.reactor.IOReactorStatus;
import org.apache.http.pool.PoolStats;
import x70.l;
import x70.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@t60.a(threading = ThreadingBehavior.SAFE_CONDITIONAL)
/* loaded from: classes9.dex */
public abstract class a<T, C, E extends b80.e<T, C>> implements b80.c<T, E>, b80.d<T> {

    /* renamed from: a, reason: collision with root package name */
    public final x70.a f93191a;

    /* renamed from: b, reason: collision with root package name */
    public final v70.c<T, C> f93192b;

    /* renamed from: c, reason: collision with root package name */
    public final v70.e<T> f93193c;

    /* renamed from: d, reason: collision with root package name */
    public final m f93194d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<T, v70.d<T, C, E>> f93195e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedList<v70.b<T, C, E>> f93196f;

    /* renamed from: g, reason: collision with root package name */
    public final Set<l> f93197g;

    /* renamed from: h, reason: collision with root package name */
    public final Set<E> f93198h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedList<E> f93199i;

    /* renamed from: j, reason: collision with root package name */
    public final ConcurrentLinkedQueue<v70.b<T, C, E>> f93200j;

    /* renamed from: k, reason: collision with root package name */
    public final Map<T, Integer> f93201k;

    /* renamed from: l, reason: collision with root package name */
    public final Lock f93202l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f93203m;

    /* renamed from: n, reason: collision with root package name */
    public volatile int f93204n;

    /* renamed from: o, reason: collision with root package name */
    public volatile int f93205o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: v70.a$a, reason: collision with other inner class name */
    public class C1254a implements v70.e<T> {
        public C1254a() {
        }

        @Override // v70.e
        public SocketAddress a(T t11) throws IOException {
            return a.this.K(t11);
        }

        @Override // v70.e
        public SocketAddress b(T t11) throws IOException {
            return a.this.L(t11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends v70.d<T, C, E> {
        public b(Object obj) {
            super(obj);
        }

        @Override // v70.d
        public E d(T t11, C c11) {
            return (E) a.this.i(t11, c11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Future<E> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u60.a f93208a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ v70.b f93209b;

        public c(u60.a aVar, v70.b bVar) {
            this.f93208a = aVar;
            this.f93209b = bVar;
        }

        @Override // java.util.concurrent.Future
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public E get() throws InterruptedException, ExecutionException {
            return (E) this.f93208a.get();
        }

        @Override // java.util.concurrent.Future
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public E get(long j11, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return (E) this.f93208a.get(j11, timeUnit);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z11) {
            try {
                this.f93209b.cancel();
            } catch (Throwable unused) {
            }
            return this.f93208a.cancel(z11);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f93208a.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f93208a.isDone();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements b80.f<T, C> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f93211a;

        public d(long j11) {
            this.f93211a = j11;
        }

        @Override // b80.f
        public void a(b80.e<T, C> eVar) {
            if (eVar.h() <= this.f93211a) {
                eVar.a();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements b80.f<T, C> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f93213a;

        public e(long j11) {
            this.f93213a = j11;
        }

        @Override // b80.f
        public void a(b80.e<T, C> eVar) {
            if (eVar.l(this.f93213a)) {
                eVar.a();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements m {
        public f() {
        }

        @Override // x70.m
        public void a(l lVar) {
            a.this.J(lVar);
        }

        @Override // x70.m
        public void b(l lVar) {
            a.this.H(lVar);
        }

        @Override // x70.m
        public void c(l lVar) {
            a.this.I(lVar);
        }

        @Override // x70.m
        public void d(l lVar) {
            a.this.G(lVar);
        }
    }

    @Deprecated
    public a(x70.a aVar, v70.c<T, C> cVar, int i11, int i12) {
        e80.a.j(aVar, "I/O reactor");
        e80.a.j(cVar, "Connection factory");
        e80.a.k(i11, "Max per route value");
        e80.a.k(i12, "Max total value");
        this.f93191a = aVar;
        this.f93192b = cVar;
        this.f93193c = new C1254a();
        this.f93194d = new f();
        this.f93195e = new HashMap();
        this.f93196f = new LinkedList<>();
        this.f93197g = new HashSet();
        this.f93198h = new HashSet();
        this.f93199i = new LinkedList<>();
        this.f93201k = new HashMap();
        this.f93200j = new ConcurrentLinkedQueue<>();
        this.f93202l = new ReentrantLock();
        this.f93203m = new AtomicBoolean(false);
        this.f93204n = i11;
        this.f93205o = i12;
    }

    public final void B() {
        ListIterator<v70.b<T, C, E>> listIterator = this.f93196f.listIterator();
        while (listIterator.hasNext()) {
            v70.b<T, C, E> next = listIterator.next();
            if (next.g().isCancelled()) {
                listIterator.remove();
            } else {
                boolean C = C(next);
                if (next.isDone() || C) {
                    listIterator.remove();
                }
                if (next.isDone()) {
                    this.f93200j.add(next);
                }
                if (C) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean C(v70.b<T, C, E> bVar) {
        b80.e j11;
        T j12 = bVar.j();
        Object k11 = bVar.k();
        if (System.currentTimeMillis() > bVar.f()) {
            bVar.b(new TimeoutException("Connection lease request time out"));
            return false;
        }
        v70.d s11 = s(j12);
        while (true) {
            j11 = s11.j(k11);
            if (j11 != null && (j11.k() || j11.l(System.currentTimeMillis()))) {
                j11.a();
                this.f93199i.remove(j11);
                s11.g(j11, false);
            }
        }
        if (j11 != null) {
            this.f93199i.remove(j11);
            this.f93198h.add(j11);
            bVar.c(j11);
            A(j11);
            y(j11);
            return true;
        }
        int r11 = r(j12);
        int max = Math.max(0, (s11.h() + 1) - r11);
        if (max > 0) {
            for (int i11 = 0; i11 < max; i11++) {
                b80.e k12 = s11.k();
                if (k12 == null) {
                    break;
                }
                k12.a();
                this.f93199i.remove(k12);
                s11.o(k12);
            }
        }
        if (s11.h() < r11) {
            int max2 = Math.max(this.f93205o - (this.f93197g.size() + this.f93198h.size()), 0);
            if (max2 == 0) {
                return false;
            }
            if (this.f93199i.size() > max2 - 1 && !this.f93199i.isEmpty()) {
                E removeLast = this.f93199i.removeLast();
                removeLast.a();
                s(removeLast.f()).o(removeLast);
            }
            try {
                l j13 = this.f93191a.j(this.f93193c.b(j12), this.f93193c.a(j12), j12, this.f93194d);
                bVar.a(j13);
                long e11 = bVar.e();
                if (e11 >= 0) {
                    j13.d(e11 < SieveCacheKt.NodeLinkMask ? (int) e11 : Integer.MAX_VALUE);
                }
                this.f93197g.add(j13);
                s11.a(j13, bVar.g());
                return true;
            } catch (IOException e12) {
                bVar.b(e12);
            }
        }
        return false;
    }

    public final void D() {
        ListIterator<v70.b<T, C, E>> listIterator = this.f93196f.listIterator();
        while (listIterator.hasNext()) {
            v70.b<T, C, E> next = listIterator.next();
            if (next.g().isCancelled()) {
                listIterator.remove();
            } else {
                boolean C = C(next);
                if (next.isDone() || C) {
                    listIterator.remove();
                }
                if (next.isDone()) {
                    this.f93200j.add(next);
                }
            }
        }
    }

    public final void E() {
        Iterator<Map.Entry<T, v70.d<T, C, E>>> it = this.f93195e.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().h() == 0) {
                it.remove();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b80.c
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void a(E e11, boolean z11) {
        if (e11 == null || this.f93203m.get()) {
            return;
        }
        this.f93202l.lock();
        try {
            if (this.f93198h.remove(e11)) {
                s(e11.f()).g(e11, z11);
                if (z11) {
                    this.f93199i.addFirst(e11);
                    z(e11);
                } else {
                    e11.a();
                }
                B();
            }
            this.f93202l.unlock();
            q();
        } catch (Throwable th2) {
            this.f93202l.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void G(l lVar) {
        if (this.f93203m.get()) {
            return;
        }
        Object f11 = lVar.f();
        this.f93202l.lock();
        try {
            this.f93197g.remove(lVar);
            s(f11).b(lVar);
            if (this.f93191a.getStatus().compareTo(IOReactorStatus.ACTIVE) <= 0) {
                B();
            }
            this.f93202l.unlock();
            q();
        } catch (Throwable th2) {
            this.f93202l.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void H(l lVar) {
        if (this.f93203m.get()) {
            x70.f b11 = lVar.b();
            if (b11 != null) {
                b11.close();
                return;
            }
            return;
        }
        Object f11 = lVar.f();
        this.f93202l.lock();
        try {
            this.f93197g.remove(lVar);
            v70.d s11 = s(f11);
            try {
                b80.e e11 = s11.e(lVar, this.f93192b.a(f11, lVar.b()));
                if (s11.c(lVar, e11)) {
                    this.f93198h.add(e11);
                    y(e11);
                } else {
                    this.f93199i.add(e11);
                    if (this.f93191a.getStatus().compareTo(IOReactorStatus.ACTIVE) <= 0) {
                        B();
                    }
                }
            } catch (IOException e12) {
                s11.f(lVar, e12);
            }
            this.f93202l.unlock();
            q();
        } catch (Throwable th2) {
            this.f93202l.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void I(l lVar) {
        if (this.f93203m.get()) {
            return;
        }
        Object f11 = lVar.f();
        this.f93202l.lock();
        try {
            this.f93197g.remove(lVar);
            s(f11).f(lVar, lVar.m());
            B();
            this.f93202l.unlock();
            q();
        } catch (Throwable th2) {
            this.f93202l.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void J(l lVar) {
        if (this.f93203m.get()) {
            return;
        }
        Object f11 = lVar.f();
        this.f93202l.lock();
        try {
            this.f93197g.remove(lVar);
            s(f11).r(lVar);
            B();
            this.f93202l.unlock();
            q();
        } catch (Throwable th2) {
            this.f93202l.unlock();
            throw th2;
        }
    }

    @Deprecated
    public SocketAddress K(T t11) {
        return null;
    }

    @Deprecated
    public SocketAddress L(T t11) {
        return null;
    }

    public void M(long j11) throws IOException {
        if (this.f93203m.compareAndSet(false, true)) {
            q();
            this.f93202l.lock();
            try {
                Iterator<l> it = this.f93197g.iterator();
                while (it.hasNext()) {
                    it.next().cancel();
                }
                Iterator<E> it2 = this.f93199i.iterator();
                while (it2.hasNext()) {
                    it2.next().a();
                }
                Iterator<E> it3 = this.f93198h.iterator();
                while (it3.hasNext()) {
                    it3.next().a();
                }
                Iterator<v70.d<T, C, E>> it4 = this.f93195e.values().iterator();
                while (it4.hasNext()) {
                    it4.next().q();
                }
                this.f93195e.clear();
                this.f93198h.clear();
                this.f93197g.clear();
                this.f93199i.clear();
                this.f93196f.clear();
                this.f93191a.i(j11);
                this.f93202l.unlock();
            } catch (Throwable th2) {
                this.f93202l.unlock();
                throw th2;
            }
        }
    }

    public void N() {
        this.f93202l.lock();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            ListIterator<v70.b<T, C, E>> listIterator = this.f93196f.listIterator();
            while (listIterator.hasNext()) {
                v70.b<T, C, E> next = listIterator.next();
                if (!next.g().isCancelled() || next.isDone()) {
                    if (currentTimeMillis > next.f()) {
                        next.b(new TimeoutException("Connection lease request time out"));
                    }
                    if (next.isDone()) {
                        listIterator.remove();
                        this.f93200j.add(next);
                    }
                } else {
                    listIterator.remove();
                }
            }
            this.f93202l.unlock();
            q();
        } catch (Throwable th2) {
            this.f93202l.unlock();
            throw th2;
        }
    }

    @Override // b80.c
    public Future<E> b(T t11, Object obj, u60.b<E> bVar) {
        return x(t11, obj, -1L, TimeUnit.MICROSECONDS, bVar);
    }

    public void c() {
        j(new e(System.currentTimeMillis()));
    }

    public void d(long j11, TimeUnit timeUnit) {
        e80.a.j(timeUnit, "Time unit");
        long millis = timeUnit.toMillis(j11);
        if (millis < 0) {
            millis = 0;
        }
        j(new d(System.currentTimeMillis() - millis));
    }

    @Override // b80.d
    public int e() {
        this.f93202l.lock();
        try {
            return this.f93204n;
        } finally {
            this.f93202l.unlock();
        }
    }

    @Override // b80.d
    public void f(int i11) {
        e80.a.k(i11, "Max value");
        this.f93202l.lock();
        try {
            this.f93204n = i11;
        } finally {
            this.f93202l.unlock();
        }
    }

    @Override // b80.d
    public int g() {
        this.f93202l.lock();
        try {
            return this.f93205o;
        } finally {
            this.f93202l.unlock();
        }
    }

    @Override // b80.d
    public PoolStats h() {
        this.f93202l.lock();
        try {
            return new PoolStats(this.f93198h.size(), this.f93197g.size(), this.f93199i.size(), this.f93205o);
        } finally {
            this.f93202l.unlock();
        }
    }

    public abstract E i(T t11, C c11);

    public void j(b80.f<T, C> fVar) {
        this.f93202l.lock();
        try {
            Iterator<E> it = this.f93199i.iterator();
            while (it.hasNext()) {
                E next = it.next();
                fVar.a(next);
                if (next.k()) {
                    s(next.f()).o(next);
                    it.remove();
                }
            }
            D();
            E();
            this.f93202l.unlock();
        } catch (Throwable th2) {
            this.f93202l.unlock();
            throw th2;
        }
    }

    @Override // b80.d
    public int k(T t11) {
        e80.a.j(t11, "Route");
        this.f93202l.lock();
        try {
            return r(t11);
        } finally {
            this.f93202l.unlock();
        }
    }

    @Deprecated
    public void l(Iterator<E> it, b80.f<T, C> fVar) {
        while (it.hasNext()) {
            fVar.a(it.next());
        }
        D();
    }

    @Override // b80.d
    public void m(T t11, int i11) {
        e80.a.j(t11, "Route");
        this.f93202l.lock();
        try {
            if (i11 > -1) {
                this.f93201k.put(t11, Integer.valueOf(i11));
            } else {
                this.f93201k.remove(t11);
            }
            this.f93202l.unlock();
        } catch (Throwable th2) {
            this.f93202l.unlock();
            throw th2;
        }
    }

    @Override // b80.d
    public PoolStats n(T t11) {
        e80.a.j(t11, "Route");
        this.f93202l.lock();
        try {
            v70.d<T, C, E> s11 = s(t11);
            Iterator<v70.b<T, C, E>> it = this.f93196f.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                if (g.a(t11, it.next().j())) {
                    i11++;
                }
            }
            PoolStats poolStats = new PoolStats(s11.l(), i11 + s11.m(), s11.i(), r(t11));
            this.f93202l.unlock();
            return poolStats;
        } catch (Throwable th2) {
            this.f93202l.unlock();
            throw th2;
        }
    }

    @Override // b80.d
    public void o(int i11) {
        e80.a.k(i11, "Max value");
        this.f93202l.lock();
        try {
            this.f93205o = i11;
        } finally {
            this.f93202l.unlock();
        }
    }

    public void p(b80.f<T, C> fVar) {
        this.f93202l.lock();
        try {
            Iterator<E> it = this.f93198h.iterator();
            while (it.hasNext()) {
                fVar.a(it.next());
            }
            D();
            this.f93202l.unlock();
        } catch (Throwable th2) {
            this.f93202l.unlock();
            throw th2;
        }
    }

    public final void q() {
        while (true) {
            v70.b<T, C, E> poll = this.f93200j.poll();
            if (poll == null) {
                return;
            }
            u60.a<E> g11 = poll.g();
            Exception m11 = poll.m();
            E i11 = poll.i();
            if (m11 != null) {
                g11.c(m11);
            } else if (i11 == null) {
                g11.cancel();
            } else if (g11.a(i11)) {
            }
            a(i11, true);
        }
    }

    public final int r(T t11) {
        Integer num = this.f93201k.get(t11);
        return num != null ? num.intValue() : this.f93204n;
    }

    public final v70.d<T, C, E> s(T t11) {
        v70.d<T, C, E> dVar = this.f93195e.get(t11);
        if (dVar != null) {
            return dVar;
        }
        b bVar = new b(t11);
        this.f93195e.put(t11, bVar);
        return bVar;
    }

    public Set<T> t() {
        this.f93202l.lock();
        try {
            return new HashSet(this.f93195e.keySet());
        } finally {
            this.f93202l.unlock();
        }
    }

    public String toString() {
        return "[leased: " + this.f93198h + "][available: " + this.f93199i + "][pending: " + this.f93197g + "]";
    }

    public boolean u() {
        return this.f93203m.get();
    }

    public Future<E> v(T t11, Object obj) {
        return x(t11, obj, -1L, TimeUnit.MICROSECONDS, null);
    }

    public Future<E> w(T t11, Object obj, long j11, long j12, TimeUnit timeUnit, u60.b<E> bVar) {
        e80.a.j(t11, "Route");
        e80.a.j(timeUnit, "Time unit");
        e80.b.a(!this.f93203m.get(), "Connection pool shut down");
        u60.a aVar = new u60.a(bVar);
        v70.b<T, C, E> bVar2 = new v70.b<>(t11, obj, j11 >= 0 ? timeUnit.toMillis(j11) : -1L, j12 > 0 ? timeUnit.toMillis(j12) : 0L, aVar);
        this.f93202l.lock();
        try {
            boolean C = C(bVar2);
            if (!bVar2.isDone() && !C) {
                this.f93196f.add(bVar2);
            }
            if (bVar2.isDone()) {
                this.f93200j.add(bVar2);
            }
            this.f93202l.unlock();
            q();
            return new c(aVar, bVar2);
        } catch (Throwable th2) {
            this.f93202l.unlock();
            throw th2;
        }
    }

    public Future<E> x(T t11, Object obj, long j11, TimeUnit timeUnit, u60.b<E> bVar) {
        return w(t11, obj, j11, j11, timeUnit, bVar);
    }

    public a(x70.a aVar, v70.c<T, C> cVar, v70.e<T> eVar, int i11, int i12) {
        e80.a.j(aVar, "I/O reactor");
        e80.a.j(cVar, "Connection factory");
        e80.a.j(eVar, "Address resolver");
        e80.a.k(i11, "Max per route value");
        e80.a.k(i12, "Max total value");
        this.f93191a = aVar;
        this.f93192b = cVar;
        this.f93193c = eVar;
        this.f93194d = new f();
        this.f93195e = new HashMap();
        this.f93196f = new LinkedList<>();
        this.f93197g = new HashSet();
        this.f93198h = new HashSet();
        this.f93199i = new LinkedList<>();
        this.f93200j = new ConcurrentLinkedQueue<>();
        this.f93201k = new HashMap();
        this.f93202l = new ReentrantLock();
        this.f93203m = new AtomicBoolean(false);
        this.f93204n = i11;
        this.f93205o = i12;
    }

    public void A(E e11) {
    }

    public void y(E e11) {
    }

    public void z(E e11) {
    }
}
