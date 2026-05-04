package lb0;

import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import l60.g1;
import l60.i1;
import l60.r0;
import t50.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class m<T> implements lb0.b<T> {

    /* renamed from: a, reason: collision with root package name */
    public final x f70902a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f70903b;

    /* renamed from: c, reason: collision with root package name */
    public final b.a f70904c;

    /* renamed from: d, reason: collision with root package name */
    public final f<okhttp3.o, T> f70905d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f70906e;

    /* renamed from: f, reason: collision with root package name */
    @GuardedBy("this")
    @Nullable
    public t50.b f70907f;

    /* renamed from: g, reason: collision with root package name */
    @GuardedBy("this")
    @Nullable
    public Throwable f70908g;

    /* renamed from: h, reason: collision with root package name */
    @GuardedBy("this")
    public boolean f70909h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements t50.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f70910a;

        public a(d dVar) {
            this.f70910a = dVar;
        }

        public final void a(Throwable th2) {
            try {
                this.f70910a.b(m.this, th2);
            } catch (Throwable th3) {
                d0.s(th3);
                th3.printStackTrace();
            }
        }

        @Override // t50.c
        public void c(t50.b bVar, okhttp3.n nVar) {
            try {
                try {
                    this.f70910a.a(m.this, m.this.d(nVar));
                } catch (Throwable th2) {
                    d0.s(th2);
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                d0.s(th3);
                a(th3);
            }
        }

        @Override // t50.c
        public void d(t50.b bVar, IOException iOException) {
            a(iOException);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends okhttp3.o {

        /* renamed from: c, reason: collision with root package name */
        public final okhttp3.o f70912c;

        /* renamed from: d, reason: collision with root package name */
        public final l60.m f70913d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        public IOException f70914e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends l60.w {
            public a(g1 g1Var) {
                super(g1Var);
            }

            @Override // l60.w, l60.g1
            public long L3(l60.k kVar, long j11) throws IOException {
                try {
                    return super.L3(kVar, j11);
                } catch (IOException e11) {
                    b.this.f70914e = e11;
                    throw e11;
                }
            }
        }

        public b(okhttp3.o oVar) {
            this.f70912c = oVar;
            this.f70913d = r0.e(new a(oVar.V()));
        }

        @Override // okhttp3.o
        public l60.m V() {
            return this.f70913d;
        }

        public void a0() throws IOException {
            IOException iOException = this.f70914e;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // okhttp3.o, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f70912c.close();
        }

        @Override // okhttp3.o
        public long q() {
            return this.f70912c.q();
        }

        @Override // okhttp3.o
        public okhttp3.j r() {
            return this.f70912c.r();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends okhttp3.o {

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        public final okhttp3.j f70916c;

        /* renamed from: d, reason: collision with root package name */
        public final long f70917d;

        public c(@Nullable okhttp3.j jVar, long j11) {
            this.f70916c = jVar;
            this.f70917d = j11;
        }

        @Override // okhttp3.o
        public l60.m V() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }

        @Override // okhttp3.o
        public long q() {
            return this.f70917d;
        }

        @Override // okhttp3.o
        public okhttp3.j r() {
            return this.f70916c;
        }
    }

    public m(x xVar, Object[] objArr, b.a aVar, f<okhttp3.o, T> fVar) {
        this.f70902a = xVar;
        this.f70903b = objArr;
        this.f70904c = aVar;
        this.f70905d = fVar;
    }

    @Override // lb0.b
    public synchronized i1 D() {
        try {
        } catch (IOException e11) {
            throw new RuntimeException("Unable to create call.", e11);
        }
        return c().D();
    }

    @Override // lb0.b
    public void K0(d<T> dVar) {
        t50.b bVar;
        Throwable th2;
        Objects.requireNonNull(dVar, "callback == null");
        synchronized (this) {
            try {
                if (this.f70909h) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f70909h = true;
                bVar = this.f70907f;
                th2 = this.f70908g;
                if (bVar == null && th2 == null) {
                    try {
                        t50.b b11 = b();
                        this.f70907f = b11;
                        bVar = b11;
                    } catch (Throwable th3) {
                        th2 = th3;
                        d0.s(th2);
                        this.f70908g = th2;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (th2 != null) {
            dVar.b(this, th2);
            return;
        }
        if (this.f70906e) {
            bVar.cancel();
        }
        bVar.U(new a(dVar));
    }

    @Override // lb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public m<T> clone() {
        return new m<>(this.f70902a, this.f70903b, this.f70904c, this.f70905d);
    }

    public final t50.b b() throws IOException {
        t50.b b11 = this.f70904c.b(this.f70902a.a(this.f70903b));
        if (b11 != null) {
            return b11;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    @GuardedBy("this")
    public final t50.b c() throws IOException {
        t50.b bVar = this.f70907f;
        if (bVar != null) {
            return bVar;
        }
        Throwable th2 = this.f70908g;
        if (th2 != null) {
            if (th2 instanceof IOException) {
                throw ((IOException) th2);
            }
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            throw ((Error) th2);
        }
        try {
            t50.b b11 = b();
            this.f70907f = b11;
            return b11;
        } catch (IOException | Error | RuntimeException e11) {
            d0.s(e11);
            this.f70908g = e11;
            throw e11;
        }
    }

    @Override // lb0.b
    public void cancel() {
        t50.b bVar;
        this.f70906e = true;
        synchronized (this) {
            bVar = this.f70907f;
        }
        if (bVar != null) {
            bVar.cancel();
        }
    }

    public y<T> d(okhttp3.n nVar) throws IOException {
        okhttp3.o L = nVar.L();
        okhttp3.n c11 = nVar.v0().b(new c(L.r(), L.q())).c();
        int Z = c11.Z();
        if (Z < 200 || Z >= 300) {
            try {
                return y.d(d0.a(L), c11);
            } finally {
                L.close();
            }
        }
        if (Z == 204 || Z == 205) {
            L.close();
            return y.m(null, c11);
        }
        b bVar = new b(L);
        try {
            return y.m(this.f70905d.convert(bVar), c11);
        } catch (RuntimeException e11) {
            bVar.a0();
            throw e11;
        }
    }

    @Override // lb0.b
    public y<T> execute() throws IOException {
        t50.b c11;
        synchronized (this) {
            if (this.f70909h) {
                throw new IllegalStateException("Already executed.");
            }
            this.f70909h = true;
            c11 = c();
        }
        if (this.f70906e) {
            c11.cancel();
        }
        return d(c11.execute());
    }

    @Override // lb0.b
    public boolean isCanceled() {
        boolean z11 = true;
        if (this.f70906e) {
            return true;
        }
        synchronized (this) {
            try {
                t50.b bVar = this.f70907f;
                if (bVar == null || !bVar.isCanceled()) {
                    z11 = false;
                }
            } finally {
            }
        }
        return z11;
    }

    @Override // lb0.b
    public synchronized boolean isExecuted() {
        return this.f70909h;
    }

    @Override // lb0.b
    public synchronized okhttp3.l request() {
        try {
        } catch (IOException e11) {
            throw new RuntimeException("Unable to create request.", e11);
        }
        return c().request();
    }
}
