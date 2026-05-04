package a3;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Files;
import com.badlogic.gdx.utils.GdxRuntimeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c1 {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f1471c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static b f1472d;

    /* renamed from: a, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<a> f1473a = new com.badlogic.gdx.utils.a<>(false, 8);

    /* renamed from: b, reason: collision with root package name */
    public long f1474b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final Application f1475a;

        /* renamed from: b, reason: collision with root package name */
        public long f1476b;

        /* renamed from: c, reason: collision with root package name */
        public long f1477c;

        /* renamed from: d, reason: collision with root package name */
        public int f1478d;

        /* renamed from: e, reason: collision with root package name */
        public volatile c1 f1479e;

        public a() {
            Application application = q1.g.f81378a;
            this.f1475a = application;
            if (application == null) {
                throw new IllegalStateException("Gdx.app not available.");
            }
        }

        public void a() {
            synchronized (c1.f1471c) {
                try {
                    c1.p().c(this);
                    c1 c1Var = this.f1479e;
                    if (c1Var != null) {
                        synchronized (c1Var) {
                            c1Var.f1473a.C(this, true);
                            d();
                        }
                    } else {
                        d();
                    }
                } finally {
                }
            }
        }

        public synchronized long b() {
            return this.f1476b;
        }

        public boolean c() {
            return this.f1479e != null;
        }

        public synchronized void d() {
            this.f1476b = 0L;
            this.f1479e = null;
        }

        @Override // java.lang.Runnable
        public abstract void run();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements Runnable, q1.l {

        /* renamed from: b, reason: collision with root package name */
        public final Application f1481b;

        /* renamed from: d, reason: collision with root package name */
        public c1 f1483d;

        /* renamed from: e, reason: collision with root package name */
        public long f1484e;

        /* renamed from: c, reason: collision with root package name */
        public final com.badlogic.gdx.utils.a<c1> f1482c = new com.badlogic.gdx.utils.a<>(1);

        /* renamed from: f, reason: collision with root package name */
        public final com.badlogic.gdx.utils.a<a> f1485f = new com.badlogic.gdx.utils.a<>(2);

        /* renamed from: g, reason: collision with root package name */
        public final com.badlogic.gdx.utils.a<a> f1486g = new com.badlogic.gdx.utils.a<>(2);

        /* renamed from: h, reason: collision with root package name */
        public final Runnable f1487h = new a();

        /* renamed from: a, reason: collision with root package name */
        public final Files f1480a = q1.g.f81382e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.d();
            }
        }

        public b() {
            Application application = q1.g.f81378a;
            this.f1481b = application;
            application.m(this);
            a();
            Thread thread = new Thread(this, "Timer");
            thread.setDaemon(true);
            thread.start();
        }

        @Override // q1.l
        public void a() {
            synchronized (c1.f1471c) {
                try {
                    long nanoTime = (System.nanoTime() / 1000000) - this.f1484e;
                    int i11 = this.f1482c.f13179b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        this.f1482c.get(i12).c(nanoTime);
                    }
                    this.f1484e = 0L;
                    c1.f1471c.notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void b(a aVar) {
            synchronized (this.f1485f) {
                try {
                    if (this.f1485f.isEmpty()) {
                        aVar.f1475a.q(this.f1487h);
                    }
                    this.f1485f.a(aVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void c(a aVar) {
            synchronized (this.f1485f) {
                try {
                    com.badlogic.gdx.utils.a<a> aVar2 = this.f1485f;
                    a[] aVarArr = aVar2.f13178a;
                    for (int i11 = aVar2.f13179b - 1; i11 >= 0; i11--) {
                        if (aVarArr[i11] == aVar) {
                            this.f1485f.A(i11);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void d() {
            synchronized (this.f1485f) {
                this.f1486g.g(this.f1485f);
                this.f1485f.clear();
            }
            com.badlogic.gdx.utils.a<a> aVar = this.f1486g;
            a[] aVarArr = aVar.f13178a;
            int i11 = aVar.f13179b;
            for (int i12 = 0; i12 < i11; i12++) {
                aVarArr[i12].run();
            }
            this.f1486g.clear();
        }

        @Override // q1.l
        public void dispose() {
            Object obj = c1.f1471c;
            synchronized (obj) {
                try {
                    synchronized (this.f1485f) {
                        this.f1485f.clear();
                    }
                    if (c1.f1472d == this) {
                        c1.f1472d = null;
                    }
                    this.f1482c.clear();
                    obj.notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f1481b.l(this);
        }

        @Override // q1.l
        public void pause() {
            Object obj = c1.f1471c;
            synchronized (obj) {
                this.f1484e = System.nanoTime() / 1000000;
                obj.notifyAll();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                synchronized (c1.f1471c) {
                    try {
                        if (c1.f1472d != this || this.f1480a != q1.g.f81382e) {
                            break;
                        }
                        long j11 = 5000;
                        if (this.f1484e == 0) {
                            long nanoTime = System.nanoTime() / 1000000;
                            int i11 = this.f1482c.f13179b;
                            int i12 = 0;
                            while (i12 < i11) {
                                try {
                                    long j12 = nanoTime;
                                    long q11 = this.f1482c.get(i12).q(this, j12, j11);
                                    i12++;
                                    nanoTime = j12;
                                    j11 = q11;
                                } catch (Throwable th2) {
                                    throw new GdxRuntimeException("Task failed: " + this.f1482c.get(i12).getClass().getName(), th2);
                                }
                            }
                        }
                        if (c1.f1472d != this || this.f1480a != q1.g.f81382e) {
                            break;
                        } else if (j11 > 0) {
                            try {
                                c1.f1471c.wait(j11);
                            } catch (InterruptedException unused) {
                            }
                        }
                    } finally {
                    }
                }
            }
            dispose();
        }
    }

    public c1() {
        n();
    }

    public static c1 d() {
        c1 c1Var;
        synchronized (f1471c) {
            try {
                b p11 = p();
                if (p11.f1483d == null) {
                    p11.f1483d = new c1();
                }
                c1Var = p11.f1483d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c1Var;
    }

    public static a f(a aVar) {
        return d().g(aVar);
    }

    public static a h(a aVar, float f11) {
        return d().k(aVar, f11);
    }

    public static a i(a aVar, float f11, float f12) {
        return d().l(aVar, f11, f12);
    }

    public static a j(a aVar, float f11, float f12, int i11) {
        return d().m(aVar, f11, f12, i11);
    }

    public static b p() {
        b bVar;
        synchronized (f1471c) {
            try {
                b bVar2 = f1472d;
                if (bVar2 != null) {
                    if (bVar2.f1480a != q1.g.f81382e) {
                    }
                    bVar = f1472d;
                }
                if (bVar2 != null) {
                    bVar2.dispose();
                }
                f1472d = new b();
                bVar = f1472d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public void b() {
        synchronized (f1471c) {
            b p11 = p();
            synchronized (this) {
                synchronized (p11.f1485f) {
                    try {
                        int i11 = this.f1473a.f13179b;
                        for (int i12 = 0; i12 < i11; i12++) {
                            a aVar = this.f1473a.get(i12);
                            p11.c(aVar);
                            aVar.d();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f1473a.clear();
            }
        }
    }

    public synchronized void c(long j11) {
        int i11 = this.f1473a.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            a aVar = this.f1473a.get(i12);
            synchronized (aVar) {
                aVar.f1476b += j11;
            }
        }
    }

    public synchronized boolean e() {
        return this.f1473a.f13179b == 0;
    }

    public a g(a aVar) {
        return m(aVar, 0.0f, 0.0f, 0);
    }

    public a k(a aVar, float f11) {
        return m(aVar, f11, 0.0f, 0);
    }

    public a l(a aVar, float f11, float f12) {
        return m(aVar, f11, f12, -1);
    }

    public a m(a aVar, float f11, float f12, int i11) {
        Object obj = f1471c;
        synchronized (obj) {
            synchronized (this) {
                synchronized (aVar) {
                    if (aVar.f1479e != null) {
                        throw new IllegalArgumentException("The same task may not be scheduled twice.");
                    }
                    aVar.f1479e = this;
                    long nanoTime = System.nanoTime() / 1000000;
                    long j11 = ((long) (f11 * 1000.0f)) + nanoTime;
                    long j12 = f1472d.f1484e;
                    if (j12 > 0) {
                        j11 -= nanoTime - j12;
                    }
                    aVar.f1476b = j11;
                    aVar.f1477c = (long) (f12 * 1000.0f);
                    aVar.f1478d = i11;
                    this.f1473a.a(aVar);
                }
            }
            obj.notifyAll();
        }
        return aVar;
    }

    public void n() {
        Object obj = f1471c;
        synchronized (obj) {
            try {
                com.badlogic.gdx.utils.a<c1> aVar = p().f1482c;
                if (aVar.l(this, true)) {
                    return;
                }
                aVar.a(this);
                if (this.f1474b > 0) {
                    c((System.nanoTime() / 1000000) - this.f1474b);
                    this.f1474b = 0L;
                }
                obj.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void o() {
        synchronized (f1471c) {
            try {
                if (p().f1482c.C(this, true)) {
                    this.f1474b = System.nanoTime() / 1000000;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized long q(b bVar, long j11, long j12) {
        int i11 = this.f1473a.f13179b;
        int i12 = 0;
        while (i12 < i11) {
            a aVar = this.f1473a.get(i12);
            synchronized (aVar) {
                try {
                    long j13 = aVar.f1476b;
                    if (j13 > j11) {
                        j12 = Math.min(j12, j13 - j11);
                    } else {
                        if (aVar.f1478d == 0) {
                            aVar.f1479e = null;
                            this.f1473a.A(i12);
                            i12--;
                            i11--;
                        } else {
                            long j14 = aVar.f1477c;
                            aVar.f1476b = j11 + j14;
                            j12 = Math.min(j12, j14);
                            int i13 = aVar.f1478d;
                            if (i13 > 0) {
                                aVar.f1478d = i13 - 1;
                            }
                        }
                        bVar.b(aVar);
                    }
                } finally {
                }
            }
            i12++;
        }
        return j12;
    }
}
