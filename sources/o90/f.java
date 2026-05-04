package o90;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.DataProcessingException;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class f<T extends org.junit.jupiter.params.shadow.com.univocity.parsers.common.i> implements z<T> {

    /* renamed from: a, reason: collision with root package name */
    public final z f76635a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f76636b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f76637c;

    /* renamed from: d, reason: collision with root package name */
    public volatile long f76638d;

    /* renamed from: e, reason: collision with root package name */
    public Future<Void> f76639e;

    /* renamed from: f, reason: collision with root package name */
    public T f76640f;

    /* renamed from: g, reason: collision with root package name */
    public b<T> f76641g;

    /* renamed from: h, reason: collision with root package name */
    public volatile b<T> f76642h;

    /* renamed from: i, reason: collision with root package name */
    public final int f76643i;

    /* renamed from: j, reason: collision with root package name */
    public volatile long f76644j;

    /* renamed from: k, reason: collision with root package name */
    public volatile long f76645k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f76646l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f76647m;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Callable<Void> {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            while (f.this.f76642h == null && !f.this.f76636b) {
                Thread.yield();
            }
            while (!f.this.f76636b) {
                f.d(f.this);
                f.this.f76635a.q(f.this.f76642h.f76650b, (org.junit.jupiter.params.shadow.com.univocity.parsers.common.i) f.this.f76642h.f76649a);
                while (f.this.f76642h.f76651c == null) {
                    if (f.this.f76636b && f.this.f76642h.f76651c == null) {
                        return null;
                    }
                    Thread.yield();
                }
                f fVar = f.this;
                fVar.f76642h = fVar.f76642h.f76651c;
                f.f(f.this);
                if (f.this.f76643i > 1) {
                    synchronized (f.this.f76646l) {
                        f.this.f76646l.notify();
                    }
                }
            }
            while (f.this.f76642h != null) {
                f.d(f.this);
                f.this.f76635a.q(f.this.f76642h.f76650b, (org.junit.jupiter.params.shadow.com.univocity.parsers.common.i) f.this.f76642h.f76649a);
                f fVar2 = f.this;
                fVar2.f76642h = fVar2.f76642h.f76651c;
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f76649a;

        /* renamed from: b, reason: collision with root package name */
        public final String[] f76650b;

        /* renamed from: c, reason: collision with root package name */
        public b f76651c;

        public b(String[] strArr, T t11) {
            this.f76650b = strArr;
            this.f76649a = t11;
        }
    }

    public f(z<T> zVar) {
        this(zVar, -1);
    }

    public static /* synthetic */ long d(f fVar) {
        long j11 = fVar.f76638d;
        fVar.f76638d = 1 + j11;
        return j11;
    }

    public static /* synthetic */ long f(f fVar) {
        long j11 = fVar.f76645k;
        fVar.f76645k = 1 + j11;
        return j11;
    }

    @Override // o90.z
    public final void h(T t11) {
        T u11 = u(t11);
        this.f76640f = u11;
        this.f76635a.h(u11);
        r();
    }

    @Override // o90.z
    public final void i(T t11) {
        this.f76636b = true;
        if (this.f76643i > 1) {
            synchronized (this.f76646l) {
                this.f76646l.notify();
            }
        }
        try {
            try {
                this.f76639e.get();
                try {
                    this.f76635a.i(n(t11));
                } finally {
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                try {
                    this.f76635a.i(n(t11));
                } finally {
                }
            } catch (ExecutionException e11) {
                throw new DataProcessingException("Error executing process", e11);
            }
        } catch (Throwable th2) {
            try {
                this.f76635a.i(n(t11));
                throw th2;
            } finally {
            }
        }
    }

    public abstract T l(T t11);

    public final long m() {
        return this.f76638d;
    }

    public final T n(T t11) {
        return this.f76647m ? l(t11) : this.f76640f;
    }

    public boolean o() {
        return this.f76647m;
    }

    public void p(boolean z11) {
        this.f76647m = z11;
    }

    @Override // o90.z
    public final void q(String[] strArr, T t11) {
        if (this.f76641g == null) {
            b<T> bVar = new b<>(strArr, n(t11));
            this.f76641g = bVar;
            this.f76642h = bVar;
        } else {
            if (this.f76643i > 1) {
                synchronized (this.f76646l) {
                    try {
                        if (this.f76644j - this.f76645k >= this.f76643i) {
                            this.f76646l.wait();
                        }
                    } catch (InterruptedException unused) {
                        this.f76636b = true;
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
            }
            this.f76641g.f76651c = new b(strArr, n(t11));
            this.f76641g = this.f76641g.f76651c;
        }
        this.f76644j++;
    }

    public final void r() {
        this.f76636b = false;
        this.f76638d = 0L;
        this.f76639e = this.f76637c.submit(new a());
    }

    public abstract T u(T t11);

    public f(z<T> zVar, int i11) {
        this.f76636b = false;
        this.f76637c = Executors.newSingleThreadExecutor();
        this.f76647m = false;
        if (zVar == null) {
            throw new IllegalArgumentException("Row processor cannot be null");
        }
        this.f76635a = zVar;
        this.f76644j = 0L;
        this.f76645k = 0L;
        this.f76646l = new Object();
        this.f76643i = i11;
    }
}
