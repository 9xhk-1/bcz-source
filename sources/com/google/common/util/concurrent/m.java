package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.Service;
import com.google.common.util.concurrent.m;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public abstract class m implements Service {

    /* renamed from: b, reason: collision with root package name */
    public static final o1 f34714b = new o1(m.class);

    /* renamed from: a, reason: collision with root package name */
    public final q f34715a = new g(this, null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends Service.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ScheduledExecutorService f34716a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f34717b;

        public a(final m this$0, final ScheduledExecutorService val$executor) {
            this.f34716a = val$executor;
            this.f34717b = this$0;
        }

        @Override // com.google.common.util.concurrent.Service.a
        public void a(Service.State from, Throwable failure) {
            this.f34716a.shutdown();
        }

        @Override // com.google.common.util.concurrent.Service.a
        public void e(Service.State from) {
            this.f34716a.shutdown();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements ThreadFactory {
        public b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return w1.n(m.this.o(), runnable);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void cancel(boolean mayInterruptIfRunning);

        boolean isCancelled();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class d extends f {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public final class a implements Callable<Void> {

            /* renamed from: a, reason: collision with root package name */
            public final Runnable f34719a;

            /* renamed from: b, reason: collision with root package name */
            public final ScheduledExecutorService f34720b;

            /* renamed from: c, reason: collision with root package name */
            public final q f34721c;

            /* renamed from: d, reason: collision with root package name */
            public final ReentrantLock f34722d = new ReentrantLock();

            /* renamed from: e, reason: collision with root package name */
            @CheckForNull
            @vo.a(vb.a.f93813p)
            public c f34723e;

            public a(q service, ScheduledExecutorService executor, Runnable runnable) {
                this.f34719a = runnable;
                this.f34720b = executor;
                this.f34721c = service;
            }

            @Override // java.util.concurrent.Callable
            @CheckForNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void call() throws Exception {
                this.f34719a.run();
                c();
                return null;
            }

            @vo.a(vb.a.f93813p)
            public final c b(b schedule) {
                c cVar = this.f34723e;
                if (cVar == null) {
                    c cVar2 = new c(this.f34722d, d(schedule));
                    this.f34723e = cVar2;
                    return cVar2;
                }
                if (!cVar.f34728b.isCancelled()) {
                    this.f34723e.f34728b = d(schedule);
                }
                return this.f34723e;
            }

            @uo.a
            public c c() {
                c eVar;
                try {
                    b d11 = d.this.d();
                    this.f34722d.lock();
                    try {
                        eVar = b(d11);
                        this.f34722d.unlock();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            eVar = new e(d1.m());
                        } finally {
                            this.f34722d.unlock();
                        }
                    }
                    if (th != null) {
                        this.f34721c.u(th);
                    }
                    return eVar;
                } catch (Throwable th3) {
                    b2.b(th3);
                    this.f34721c.u(th3);
                    return new e(d1.m());
                }
            }

            public final ScheduledFuture<Void> d(b schedule) {
                return this.f34720b.schedule(this, schedule.f34725a, schedule.f34726b);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            public final long f34725a;

            /* renamed from: b, reason: collision with root package name */
            public final TimeUnit f34726b;

            public b(long delay, TimeUnit unit) {
                this.f34725a = delay;
                this.f34726b = (TimeUnit) Preconditions.checkNotNull(unit);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class c implements c {

            /* renamed from: a, reason: collision with root package name */
            public final ReentrantLock f34727a;

            /* renamed from: b, reason: collision with root package name */
            @vo.a(vb.a.f93813p)
            public Future<Void> f34728b;

            public c(ReentrantLock lock, Future<Void> currentFuture) {
                this.f34727a = lock;
                this.f34728b = currentFuture;
            }

            @Override // com.google.common.util.concurrent.m.c
            public void cancel(boolean mayInterruptIfRunning) {
                this.f34727a.lock();
                try {
                    this.f34728b.cancel(mayInterruptIfRunning);
                } finally {
                    this.f34727a.unlock();
                }
            }

            @Override // com.google.common.util.concurrent.m.c
            public boolean isCancelled() {
                this.f34727a.lock();
                try {
                    return this.f34728b.isCancelled();
                } finally {
                    this.f34727a.unlock();
                }
            }
        }

        public d() {
            super(null);
        }

        @Override // com.google.common.util.concurrent.m.f
        public final c c(q service, ScheduledExecutorService executor, Runnable runnable) {
            return new a(service, executor, runnable).c();
        }

        public abstract b d() throws Exception;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        public final Future<?> f34729a;

        public e(Future<?> delegate) {
            this.f34729a = delegate;
        }

        @Override // com.google.common.util.concurrent.m.c
        public void cancel(boolean mayInterruptIfRunning) {
            this.f34729a.cancel(mayInterruptIfRunning);
        }

        @Override // com.google.common.util.concurrent.m.c
        public boolean isCancelled() {
            return this.f34729a.isCancelled();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class f {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends f {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ long f34730a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f34731b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TimeUnit f34732c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(final long val$initialDelay, final long val$delay, final TimeUnit val$unit) {
                super(null);
                this.f34730a = val$initialDelay;
                this.f34731b = val$delay;
                this.f34732c = val$unit;
            }

            @Override // com.google.common.util.concurrent.m.f
            public c c(q service, ScheduledExecutorService executor, Runnable task) {
                return new e(executor.scheduleWithFixedDelay(task, this.f34730a, this.f34731b, this.f34732c));
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends f {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ long f34733a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f34734b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TimeUnit f34735c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(final long val$initialDelay, final long val$period, final TimeUnit val$unit) {
                super(null);
                this.f34733a = val$initialDelay;
                this.f34734b = val$period;
                this.f34735c = val$unit;
            }

            @Override // com.google.common.util.concurrent.m.f
            public c c(q service, ScheduledExecutorService executor, Runnable task) {
                return new e(executor.scheduleAtFixedRate(task, this.f34733a, this.f34734b, this.f34735c));
            }
        }

        public /* synthetic */ f(a aVar) {
            this();
        }

        public static f a(final long initialDelay, final long delay, final TimeUnit unit) {
            Preconditions.checkNotNull(unit);
            Preconditions.checkArgument(delay > 0, "delay must be > 0, found %s", delay);
            return new a(initialDelay, delay, unit);
        }

        public static f b(final long initialDelay, final long period, final TimeUnit unit) {
            Preconditions.checkNotNull(unit);
            Preconditions.checkArgument(period > 0, "period must be > 0, found %s", period);
            return new b(initialDelay, period, unit);
        }

        public abstract c c(q service, ScheduledExecutorService executor, Runnable runnable);

        public f() {
        }
    }

    @Override // com.google.common.util.concurrent.Service
    public final void a(Service.a listener, Executor executor) {
        this.f34715a.a(listener, executor);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void b(long timeout, TimeUnit unit) throws TimeoutException {
        this.f34715a.b(timeout, unit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void c(long timeout, TimeUnit unit) throws TimeoutException {
        this.f34715a.c(timeout, unit);
    }

    @Override // com.google.common.util.concurrent.Service
    public final void d() {
        this.f34715a.d();
    }

    @Override // com.google.common.util.concurrent.Service
    public final Throwable e() {
        return this.f34715a.e();
    }

    @Override // com.google.common.util.concurrent.Service
    public final void f() {
        this.f34715a.f();
    }

    @Override // com.google.common.util.concurrent.Service
    @uo.a
    public final Service g() {
        this.f34715a.g();
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final Service.State h() {
        return this.f34715a.h();
    }

    @Override // com.google.common.util.concurrent.Service
    @uo.a
    public final Service i() {
        this.f34715a.i();
        return this;
    }

    @Override // com.google.common.util.concurrent.Service
    public final boolean isRunning() {
        return this.f34715a.isRunning();
    }

    public ScheduledExecutorService l() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new b());
        a(new a(this, newSingleThreadScheduledExecutor), w1.c());
        return newSingleThreadScheduledExecutor;
    }

    public abstract void m() throws Exception;

    public abstract f n();

    public String o() {
        return getClass().getSimpleName();
    }

    public String toString() {
        return o() + " [" + h() + "]";
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class g extends q {

        /* renamed from: p, reason: collision with root package name */
        @CheckForNull
        public volatile c f34736p;

        /* renamed from: q, reason: collision with root package name */
        @CheckForNull
        public volatile ScheduledExecutorService f34737q;

        /* renamed from: r, reason: collision with root package name */
        public final ReentrantLock f34738r;

        /* renamed from: s, reason: collision with root package name */
        public final Runnable f34739s;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.f34738r.lock();
                try {
                    c cVar = g.this.f34736p;
                    Objects.requireNonNull(cVar);
                    if (!cVar.isCancelled()) {
                        m.this.m();
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }

        public g() {
            this.f34738r = new ReentrantLock();
            this.f34739s = new a();
        }

        public static /* synthetic */ void A(g gVar) {
            gVar.f34738r.lock();
            try {
                m.this.q();
                Objects.requireNonNull(gVar.f34737q);
                gVar.f34736p = m.this.n().c(m.this.f34715a, gVar.f34737q, gVar.f34739s);
                gVar.v();
            } finally {
                try {
                } finally {
                }
            }
        }

        public static /* synthetic */ void B(g gVar) {
            gVar.getClass();
            try {
                gVar.f34738r.lock();
                try {
                    if (gVar.h() != Service.State.STOPPING) {
                        return;
                    }
                    m.this.p();
                    gVar.f34738r.unlock();
                    gVar.w();
                } finally {
                    gVar.f34738r.unlock();
                }
            } catch (Throwable th2) {
                b2.b(th2);
                gVar.u(th2);
            }
        }

        public static /* synthetic */ String z(g gVar) {
            return m.this.o() + " " + gVar.h();
        }

        @Override // com.google.common.util.concurrent.q
        public final void n() {
            this.f34737q = w1.s(m.this.l(), new ho.p0() { // from class: com.google.common.util.concurrent.n
                @Override // ho.p0
                public final Object get() {
                    return m.g.z(m.g.this);
                }
            });
            this.f34737q.execute(new Runnable() { // from class: com.google.common.util.concurrent.o
                @Override // java.lang.Runnable
                public final void run() {
                    m.g.A(m.g.this);
                }
            });
        }

        @Override // com.google.common.util.concurrent.q
        public final void o() {
            Objects.requireNonNull(this.f34736p);
            Objects.requireNonNull(this.f34737q);
            this.f34736p.cancel(false);
            this.f34737q.execute(new Runnable() { // from class: com.google.common.util.concurrent.p
                @Override // java.lang.Runnable
                public final void run() {
                    m.g.B(m.g.this);
                }
            });
        }

        @Override // com.google.common.util.concurrent.q
        public String toString() {
            return m.this.toString();
        }

        public /* synthetic */ g(m mVar, a aVar) {
            this();
        }
    }

    public void p() throws Exception {
    }

    public void q() throws Exception {
    }
}
