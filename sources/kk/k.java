package kk;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import gl.a;
import java.util.Map;
import java.util.concurrent.Executor;
import kk.h;
import kk.p;
import mk.a;
import mk.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class k implements m, j.a, p.a {

    /* renamed from: j, reason: collision with root package name */
    public static final int f66727j = 150;

    /* renamed from: a, reason: collision with root package name */
    public final r f66729a;

    /* renamed from: b, reason: collision with root package name */
    public final o f66730b;

    /* renamed from: c, reason: collision with root package name */
    public final mk.j f66731c;

    /* renamed from: d, reason: collision with root package name */
    public final b f66732d;

    /* renamed from: e, reason: collision with root package name */
    public final x f66733e;

    /* renamed from: f, reason: collision with root package name */
    public final c f66734f;

    /* renamed from: g, reason: collision with root package name */
    public final a f66735g;

    /* renamed from: h, reason: collision with root package name */
    public final kk.a f66736h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f66726i = "Engine";

    /* renamed from: k, reason: collision with root package name */
    public static final boolean f66728k = Log.isLoggable(f66726i, 2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @VisibleForTesting
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final h.e f66737a;

        /* renamed from: b, reason: collision with root package name */
        public final Pools.Pool<h<?>> f66738b = gl.a.e(150, new C0777a());

        /* renamed from: c, reason: collision with root package name */
        public int f66739c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: kk.k$a$a, reason: collision with other inner class name */
        public class C0777a implements a.d<h<?>> {
            public C0777a() {
            }

            @Override // gl.a.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h<?> create() {
                a aVar = a.this;
                return new h<>(aVar.f66737a, aVar.f66738b);
            }
        }

        public a(h.e eVar) {
            this.f66737a = eVar;
        }

        public <R> h<R> a(com.bumptech.glide.e eVar, Object obj, n nVar, ik.b bVar, int i11, int i12, Class<?> cls, Class<R> cls2, Priority priority, j jVar, Map<Class<?>, ik.h<?>> map, boolean z11, boolean z12, boolean z13, ik.e eVar2, h.b<R> bVar2) {
            h hVar = (h) fl.m.e(this.f66738b.acquire());
            int i13 = this.f66739c;
            this.f66739c = i13 + 1;
            return hVar.q(eVar, obj, nVar, bVar, i11, i12, cls, cls2, priority, jVar, map, z11, z12, z13, eVar2, bVar2, i13);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @VisibleForTesting
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final nk.a f66741a;

        /* renamed from: b, reason: collision with root package name */
        public final nk.a f66742b;

        /* renamed from: c, reason: collision with root package name */
        public final nk.a f66743c;

        /* renamed from: d, reason: collision with root package name */
        public final nk.a f66744d;

        /* renamed from: e, reason: collision with root package name */
        public final m f66745e;

        /* renamed from: f, reason: collision with root package name */
        public final p.a f66746f;

        /* renamed from: g, reason: collision with root package name */
        public final Pools.Pool<l<?>> f66747g = gl.a.e(150, new a());

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements a.d<l<?>> {
            public a() {
            }

            @Override // gl.a.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public l<?> create() {
                b bVar = b.this;
                return new l<>(bVar.f66741a, bVar.f66742b, bVar.f66743c, bVar.f66744d, bVar.f66745e, bVar.f66746f, bVar.f66747g);
            }
        }

        public b(nk.a aVar, nk.a aVar2, nk.a aVar3, nk.a aVar4, m mVar, p.a aVar5) {
            this.f66741a = aVar;
            this.f66742b = aVar2;
            this.f66743c = aVar3;
            this.f66744d = aVar4;
            this.f66745e = mVar;
            this.f66746f = aVar5;
        }

        public <R> l<R> a(ik.b bVar, boolean z11, boolean z12, boolean z13, boolean z14) {
            return ((l) fl.m.e(this.f66747g.acquire())).l(bVar, z11, z12, z13, z14);
        }

        @VisibleForTesting
        public void b() {
            fl.f.d(this.f66741a);
            fl.f.d(this.f66742b);
            fl.f.d(this.f66743c);
            fl.f.d(this.f66744d);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements h.e {

        /* renamed from: a, reason: collision with root package name */
        public final a.InterfaceC0886a f66749a;

        /* renamed from: b, reason: collision with root package name */
        public volatile mk.a f66750b;

        public c(a.InterfaceC0886a interfaceC0886a) {
            this.f66749a = interfaceC0886a;
        }

        @Override // kk.h.e
        public mk.a a() {
            if (this.f66750b == null) {
                synchronized (this) {
                    try {
                        if (this.f66750b == null) {
                            this.f66750b = this.f66749a.build();
                        }
                        if (this.f66750b == null) {
                            this.f66750b = new mk.b();
                        }
                    } finally {
                    }
                }
            }
            return this.f66750b;
        }

        @VisibleForTesting
        public synchronized void b() {
            if (this.f66750b == null) {
                return;
            }
            this.f66750b.clear();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d {

        /* renamed from: a, reason: collision with root package name */
        public final l<?> f66751a;

        /* renamed from: b, reason: collision with root package name */
        public final bl.h f66752b;

        public d(bl.h hVar, l<?> lVar) {
            this.f66752b = hVar;
            this.f66751a = lVar;
        }

        public void a() {
            synchronized (k.this) {
                this.f66751a.s(this.f66752b);
            }
        }
    }

    public k(mk.j jVar, a.InterfaceC0886a interfaceC0886a, nk.a aVar, nk.a aVar2, nk.a aVar3, nk.a aVar4, boolean z11) {
        this(jVar, interfaceC0886a, aVar, aVar2, aVar3, aVar4, null, null, null, null, null, null, z11);
    }

    public static void k(String str, long j11, ik.b bVar) {
        Log.v(f66726i, str + " in " + fl.i.a(j11) + "ms, key: " + bVar);
    }

    @Override // kk.m
    public synchronized void a(l<?> lVar, ik.b bVar, p<?> pVar) {
        if (pVar != null) {
            try {
                if (pVar.d()) {
                    this.f66736h.a(bVar, pVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f66729a.e(bVar, lVar);
    }

    @Override // mk.j.a
    public void b(@NonNull u<?> uVar) {
        this.f66733e.a(uVar, true);
    }

    @Override // kk.p.a
    public void c(ik.b bVar, p<?> pVar) {
        this.f66736h.d(bVar);
        if (pVar.d()) {
            this.f66731c.e(bVar, pVar);
        } else {
            this.f66733e.a(pVar, false);
        }
    }

    @Override // kk.m
    public synchronized void d(l<?> lVar, ik.b bVar) {
        this.f66729a.e(bVar, lVar);
    }

    public void e() {
        this.f66734f.a().clear();
    }

    public final p<?> f(ik.b bVar) {
        u<?> f11 = this.f66731c.f(bVar);
        if (f11 == null) {
            return null;
        }
        return f11 instanceof p ? (p) f11 : new p<>(f11, true, true, bVar, this);
    }

    public <R> d g(com.bumptech.glide.e eVar, Object obj, ik.b bVar, int i11, int i12, Class<?> cls, Class<R> cls2, Priority priority, j jVar, Map<Class<?>, ik.h<?>> map, boolean z11, boolean z12, ik.e eVar2, boolean z13, boolean z14, boolean z15, boolean z16, bl.h hVar, Executor executor) {
        long b11 = f66728k ? fl.i.b() : 0L;
        n a11 = this.f66730b.a(obj, bVar, i11, i12, map, cls, cls2, eVar2);
        synchronized (this) {
            try {
                p<?> j11 = j(a11, z13, b11);
                if (j11 == null) {
                    return n(eVar, obj, bVar, i11, i12, cls, cls2, priority, jVar, map, z11, z12, eVar2, z13, z14, z15, z16, hVar, executor, a11, b11);
                }
                hVar.b(j11, DataSource.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    public final p<?> h(ik.b bVar) {
        p<?> e11 = this.f66736h.e(bVar);
        if (e11 != null) {
            e11.b();
        }
        return e11;
    }

    public final p<?> i(ik.b bVar) {
        p<?> f11 = f(bVar);
        if (f11 != null) {
            f11.b();
            this.f66736h.a(bVar, f11);
        }
        return f11;
    }

    @Nullable
    public final p<?> j(n nVar, boolean z11, long j11) {
        if (!z11) {
            return null;
        }
        p<?> h11 = h(nVar);
        if (h11 != null) {
            if (f66728k) {
                k("Loaded resource from active resources", j11, nVar);
            }
            return h11;
        }
        p<?> i11 = i(nVar);
        if (i11 == null) {
            return null;
        }
        if (f66728k) {
            k("Loaded resource from cache", j11, nVar);
        }
        return i11;
    }

    public void l(u<?> uVar) {
        if (!(uVar instanceof p)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((p) uVar).e();
    }

    @VisibleForTesting
    public void m() {
        this.f66732d.b();
        this.f66734f.b();
        this.f66736h.h();
    }

    public final <R> d n(com.bumptech.glide.e eVar, Object obj, ik.b bVar, int i11, int i12, Class<?> cls, Class<R> cls2, Priority priority, j jVar, Map<Class<?>, ik.h<?>> map, boolean z11, boolean z12, ik.e eVar2, boolean z13, boolean z14, boolean z15, boolean z16, bl.h hVar, Executor executor, n nVar, long j11) {
        l<?> a11 = this.f66729a.a(nVar, z16);
        if (a11 != null) {
            a11.e(hVar, executor);
            if (f66728k) {
                k("Added to existing load", j11, nVar);
            }
            return new d(hVar, a11);
        }
        l<R> a12 = this.f66732d.a(nVar, z13, z14, z15, z16);
        h<R> a13 = this.f66735g.a(eVar, obj, nVar, bVar, i11, i12, cls, cls2, priority, jVar, map, z11, z12, z16, eVar2, a12);
        this.f66729a.d(nVar, a12);
        a12.e(hVar, executor);
        a12.t(a13);
        if (f66728k) {
            k("Started new load", j11, nVar);
        }
        return new d(hVar, a12);
    }

    @VisibleForTesting
    public k(mk.j jVar, a.InterfaceC0886a interfaceC0886a, nk.a aVar, nk.a aVar2, nk.a aVar3, nk.a aVar4, r rVar, o oVar, kk.a aVar5, b bVar, a aVar6, x xVar, boolean z11) {
        this.f66731c = jVar;
        c cVar = new c(interfaceC0886a);
        this.f66734f = cVar;
        kk.a aVar7 = aVar5 == null ? new kk.a(z11) : aVar5;
        this.f66736h = aVar7;
        aVar7.g(this);
        this.f66730b = oVar == null ? new o() : oVar;
        this.f66729a = rVar == null ? new r() : rVar;
        this.f66732d = bVar == null ? new b(aVar, aVar2, aVar3, aVar4, this, this) : bVar;
        this.f66735g = aVar6 == null ? new a(cVar) : aVar6;
        this.f66733e = xVar == null ? new x() : xVar;
        jVar.g(this);
    }
}
