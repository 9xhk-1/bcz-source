package kk;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import gl.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kk.h;
import kk.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class l<R> implements h.b<R>, a.f {

    /* renamed from: z, reason: collision with root package name */
    public static final c f66754z = new c();

    /* renamed from: a, reason: collision with root package name */
    public final e f66755a;

    /* renamed from: b, reason: collision with root package name */
    public final gl.c f66756b;

    /* renamed from: c, reason: collision with root package name */
    public final p.a f66757c;

    /* renamed from: d, reason: collision with root package name */
    public final Pools.Pool<l<?>> f66758d;

    /* renamed from: e, reason: collision with root package name */
    public final c f66759e;

    /* renamed from: f, reason: collision with root package name */
    public final m f66760f;

    /* renamed from: g, reason: collision with root package name */
    public final nk.a f66761g;

    /* renamed from: h, reason: collision with root package name */
    public final nk.a f66762h;

    /* renamed from: i, reason: collision with root package name */
    public final nk.a f66763i;

    /* renamed from: j, reason: collision with root package name */
    public final nk.a f66764j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f66765k;

    /* renamed from: l, reason: collision with root package name */
    public ik.b f66766l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f66767m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f66768n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f66769o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f66770p;

    /* renamed from: q, reason: collision with root package name */
    public u<?> f66771q;

    /* renamed from: r, reason: collision with root package name */
    public DataSource f66772r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f66773s;

    /* renamed from: t, reason: collision with root package name */
    public GlideException f66774t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f66775u;

    /* renamed from: v, reason: collision with root package name */
    public p<?> f66776v;

    /* renamed from: w, reason: collision with root package name */
    public h<R> f66777w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f66778x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f66779y;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final bl.h f66780a;

        public a(bl.h hVar) {
            this.f66780a = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f66780a.h()) {
                synchronized (l.this) {
                    try {
                        if (l.this.f66755a.b(this.f66780a)) {
                            l.this.f(this.f66780a);
                        }
                        l.this.i();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final bl.h f66782a;

        public b(bl.h hVar) {
            this.f66782a = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f66782a.h()) {
                synchronized (l.this) {
                    try {
                        if (l.this.f66755a.b(this.f66782a)) {
                            l.this.f66776v.b();
                            l.this.g(this.f66782a);
                            l.this.s(this.f66782a);
                        }
                        l.this.i();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @VisibleForTesting
    public static class c {
        public <R> p<R> a(u<R> uVar, boolean z11, ik.b bVar, p.a aVar) {
            return new p<>(uVar, z11, true, bVar, aVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final bl.h f66784a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f66785b;

        public d(bl.h hVar, Executor executor) {
            this.f66784a = hVar;
            this.f66785b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f66784a.equals(((d) obj).f66784a);
            }
            return false;
        }

        public int hashCode() {
            return this.f66784a.hashCode();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e implements Iterable<d> {

        /* renamed from: a, reason: collision with root package name */
        public final List<d> f66786a;

        public e() {
            this(new ArrayList(2));
        }

        public static d f(bl.h hVar) {
            return new d(hVar, fl.f.a());
        }

        public void a(bl.h hVar, Executor executor) {
            this.f66786a.add(new d(hVar, executor));
        }

        public boolean b(bl.h hVar) {
            return this.f66786a.contains(f(hVar));
        }

        public void clear() {
            this.f66786a.clear();
        }

        public e d() {
            return new e(new ArrayList(this.f66786a));
        }

        public void g(bl.h hVar) {
            this.f66786a.remove(f(hVar));
        }

        public boolean isEmpty() {
            return this.f66786a.isEmpty();
        }

        @Override // java.lang.Iterable
        @NonNull
        public Iterator<d> iterator() {
            return this.f66786a.iterator();
        }

        public int size() {
            return this.f66786a.size();
        }

        public e(List<d> list) {
            this.f66786a = list;
        }
    }

    public l(nk.a aVar, nk.a aVar2, nk.a aVar3, nk.a aVar4, m mVar, p.a aVar5, Pools.Pool<l<?>> pool) {
        this(aVar, aVar2, aVar3, aVar4, mVar, aVar5, pool, f66754z);
    }

    private synchronized void r() {
        if (this.f66766l == null) {
            throw new IllegalArgumentException();
        }
        this.f66755a.clear();
        this.f66766l = null;
        this.f66776v = null;
        this.f66771q = null;
        this.f66775u = false;
        this.f66778x = false;
        this.f66773s = false;
        this.f66779y = false;
        this.f66777w.z(false);
        this.f66777w = null;
        this.f66774t = null;
        this.f66772r = null;
        this.f66758d.release(this);
    }

    @Override // kk.h.b
    public void a(GlideException glideException) {
        synchronized (this) {
            this.f66774t = glideException;
        }
        o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kk.h.b
    public void b(u<R> uVar, DataSource dataSource, boolean z11) {
        synchronized (this) {
            this.f66771q = uVar;
            this.f66772r = dataSource;
            this.f66779y = z11;
        }
        p();
    }

    @Override // kk.h.b
    public void c(h<?> hVar) {
        j().execute(hVar);
    }

    @Override // gl.a.f
    @NonNull
    public gl.c d() {
        return this.f66756b;
    }

    public synchronized void e(bl.h hVar, Executor executor) {
        try {
            this.f66756b.c();
            this.f66755a.a(hVar, executor);
            if (this.f66773s) {
                k(1);
                executor.execute(new b(hVar));
            } else if (this.f66775u) {
                k(1);
                executor.execute(new a(hVar));
            } else {
                fl.m.b(!this.f66778x, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @GuardedBy("this")
    public void f(bl.h hVar) {
        try {
            hVar.a(this.f66774t);
        } catch (Throwable th2) {
            throw new kk.b(th2);
        }
    }

    @GuardedBy("this")
    public void g(bl.h hVar) {
        try {
            hVar.b(this.f66776v, this.f66772r, this.f66779y);
        } catch (Throwable th2) {
            throw new kk.b(th2);
        }
    }

    public void h() {
        if (n()) {
            return;
        }
        this.f66778x = true;
        this.f66777w.a();
        this.f66760f.d(this, this.f66766l);
    }

    public void i() {
        p<?> pVar;
        synchronized (this) {
            try {
                this.f66756b.c();
                fl.m.b(n(), "Not yet complete!");
                int decrementAndGet = this.f66765k.decrementAndGet();
                fl.m.b(decrementAndGet >= 0, "Can't decrement below 0");
                if (decrementAndGet == 0) {
                    pVar = this.f66776v;
                    r();
                } else {
                    pVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (pVar != null) {
            pVar.e();
        }
    }

    public final nk.a j() {
        return this.f66768n ? this.f66763i : this.f66769o ? this.f66764j : this.f66762h;
    }

    public synchronized void k(int i11) {
        p<?> pVar;
        fl.m.b(n(), "Not yet complete!");
        if (this.f66765k.getAndAdd(i11) == 0 && (pVar = this.f66776v) != null) {
            pVar.b();
        }
    }

    @VisibleForTesting
    public synchronized l<R> l(ik.b bVar, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f66766l = bVar;
        this.f66767m = z11;
        this.f66768n = z12;
        this.f66769o = z13;
        this.f66770p = z14;
        return this;
    }

    public synchronized boolean m() {
        return this.f66778x;
    }

    public final boolean n() {
        return this.f66775u || this.f66773s || this.f66778x;
    }

    public void o() {
        synchronized (this) {
            try {
                this.f66756b.c();
                if (this.f66778x) {
                    r();
                    return;
                }
                if (this.f66755a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f66775u) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f66775u = true;
                ik.b bVar = this.f66766l;
                e d11 = this.f66755a.d();
                k(d11.size() + 1);
                this.f66760f.a(this, bVar, null);
                Iterator<d> it = d11.iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    next.f66785b.execute(new a(next.f66784a));
                }
                i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void p() {
        synchronized (this) {
            try {
                this.f66756b.c();
                if (this.f66778x) {
                    this.f66771q.recycle();
                    r();
                    return;
                }
                if (this.f66755a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f66773s) {
                    throw new IllegalStateException("Already have resource");
                }
                this.f66776v = this.f66759e.a(this.f66771q, this.f66767m, this.f66766l, this.f66757c);
                this.f66773s = true;
                e d11 = this.f66755a.d();
                k(d11.size() + 1);
                this.f66760f.a(this, this.f66766l, this.f66776v);
                Iterator<d> it = d11.iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    next.f66785b.execute(new b(next.f66784a));
                }
                i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean q() {
        return this.f66770p;
    }

    public synchronized void s(bl.h hVar) {
        try {
            this.f66756b.c();
            this.f66755a.g(hVar);
            if (this.f66755a.isEmpty()) {
                h();
                if (!this.f66773s) {
                    if (this.f66775u) {
                    }
                }
                if (this.f66765k.get() == 0) {
                    r();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void t(h<R> hVar) {
        try {
            this.f66777w = hVar;
            (hVar.H() ? this.f66761g : j()).execute(hVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @VisibleForTesting
    public l(nk.a aVar, nk.a aVar2, nk.a aVar3, nk.a aVar4, m mVar, p.a aVar5, Pools.Pool<l<?>> pool, c cVar) {
        this.f66755a = new e();
        this.f66756b = gl.c.a();
        this.f66765k = new AtomicInteger();
        this.f66761g = aVar;
        this.f66762h = aVar2;
        this.f66763i = aVar3;
        this.f66764j = aVar4;
        this.f66760f = mVar;
        this.f66757c = aVar5;
        this.f66758d = pool;
        this.f66759e = cVar;
    }
}
