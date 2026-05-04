package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.f;
import com.google.common.util.concurrent.x0;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l0
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class w1 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BlockingQueue f34888a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1 f34889b;

        public a(final BlockingQueue val$queue, final p1 val$future) {
            this.f34888a = val$queue;
            this.f34889b = val$future;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34888a.add(this.f34889b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Executor {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Executor f34890a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ho.p0 f34891b;

        public b(final Executor val$executor, final ho.p0 val$nameSupplier) {
            this.f34890a = val$executor;
            this.f34891b = val$nameSupplier;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            this.f34890a.execute(d0.g(command, this.f34891b));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends a3 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ho.p0 f34892b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ExecutorService delegate, final ho.p0 val$nameSupplier) {
            super(delegate);
            this.f34892b = val$nameSupplier;
        }

        @Override // com.google.common.util.concurrent.a3
        public Runnable b(Runnable command) {
            return d0.g(command, this.f34892b);
        }

        @Override // com.google.common.util.concurrent.a3
        public <T> Callable<T> c(Callable<T> callable) {
            return d0.h(callable, this.f34892b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends b3 {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ho.p0 f34893c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ScheduledExecutorService delegate, final ho.p0 val$nameSupplier) {
            super(delegate);
            this.f34893c = val$nameSupplier;
        }

        @Override // com.google.common.util.concurrent.a3
        public Runnable b(Runnable command) {
            return d0.g(command, this.f34893c);
        }

        @Override // com.google.common.util.concurrent.a3
        public <T> Callable<T> c(Callable<T> callable) {
            return d0.h(callable, this.f34893c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements Executor {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Executor f34894a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.google.common.util.concurrent.f f34895b;

        public e(final Executor val$delegate, final com.google.common.util.concurrent.f val$future) {
            this.f34894a = val$delegate;
            this.f34895b = val$future;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            try {
                this.f34894a.execute(command);
            } catch (RejectedExecutionException e11) {
                this.f34895b.C(e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.d
    @go.c
    @go.e
    public static class f {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ExecutorService f34896a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f34897b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TimeUnit f34898c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ f f34899d;

            public a(final f this$0, final ExecutorService val$service, final long val$terminationTimeout, final TimeUnit val$timeUnit) {
                this.f34896a = val$service;
                this.f34897b = val$terminationTimeout;
                this.f34898c = val$timeUnit;
                this.f34899d = this$0;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f34896a.shutdown();
                    this.f34896a.awaitTermination(this.f34897b, this.f34898c);
                } catch (InterruptedException unused) {
                }
            }
        }

        public final void a(final ExecutorService service, final long terminationTimeout, final TimeUnit timeUnit) {
            Preconditions.checkNotNull(service);
            Preconditions.checkNotNull(timeUnit);
            b(w1.n("DelayedShutdownHook-for-" + service, new a(this, service, terminationTimeout, timeUnit)));
        }

        @go.e
        public void b(Thread hook) {
            Runtime.getRuntime().addShutdownHook(hook);
        }

        public final ExecutorService c(ThreadPoolExecutor executor) {
            return d(executor, 120L, TimeUnit.SECONDS);
        }

        public final ExecutorService d(ThreadPoolExecutor executor, long terminationTimeout, TimeUnit timeUnit) {
            w1.v(executor);
            ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(executor);
            a(executor, terminationTimeout, timeUnit);
            return unconfigurableExecutorService;
        }

        public final ScheduledExecutorService e(ScheduledThreadPoolExecutor executor) {
            return f(executor, 120L, TimeUnit.SECONDS);
        }

        public final ScheduledExecutorService f(ScheduledThreadPoolExecutor executor, long terminationTimeout, TimeUnit timeUnit) {
            w1.v(executor);
            ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(executor);
            a(executor, terminationTimeout, timeUnit);
            return unconfigurableScheduledExecutorService;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.d
    @go.c
    public static class g extends l {

        /* renamed from: a, reason: collision with root package name */
        public final ExecutorService f34900a;

        public g(ExecutorService delegate) {
            this.f34900a = (ExecutorService) Preconditions.checkNotNull(delegate);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
            return this.f34900a.awaitTermination(timeout, unit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable command) {
            this.f34900a.execute(command);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.f34900a.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.f34900a.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.f34900a.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return this.f34900a.shutdownNow();
        }

        public final String toString() {
            return super.toString() + "[" + this.f34900a + "]";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.d
    @go.c
    public static final class h extends g implements u1 {

        /* renamed from: b, reason: collision with root package name */
        public final ScheduledExecutorService f34901b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a<V> extends x0.a<V> implements r1<V> {

            /* renamed from: b, reason: collision with root package name */
            public final ScheduledFuture<?> f34902b;

            public a(p1<V> listenableDelegate, ScheduledFuture<?> scheduledDelegate) {
                super(listenableDelegate);
                this.f34902b = scheduledDelegate;
            }

            @Override // com.google.common.util.concurrent.w0, java.util.concurrent.Future
            public boolean cancel(boolean mayInterruptIfRunning) {
                boolean cancel = super.cancel(mayInterruptIfRunning);
                if (cancel) {
                    this.f34902b.cancel(mayInterruptIfRunning);
                }
                return cancel;
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit unit) {
                return this.f34902b.getDelay(unit);
            }

            @Override // java.lang.Comparable
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            public int compareTo(Delayed other) {
                return this.f34902b.compareTo(other);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @go.d
        @go.c
        public static final class b extends f.j<Void> implements Runnable {

            /* renamed from: i, reason: collision with root package name */
            public final Runnable f34903i;

            public b(Runnable delegate) {
                this.f34903i = (Runnable) Preconditions.checkNotNull(delegate);
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f34903i.run();
                } catch (Throwable th2) {
                    C(th2);
                    throw th2;
                }
            }

            @Override // com.google.common.util.concurrent.f
            public String y() {
                return "task=[" + this.f34903i + "]";
            }
        }

        public h(ScheduledExecutorService delegate) {
            super(delegate);
            this.f34901b = (ScheduledExecutorService) Preconditions.checkNotNull(delegate);
        }

        @Override // com.google.common.util.concurrent.u1, java.util.concurrent.ScheduledExecutorService
        public r1<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit) {
            b bVar = new b(command);
            return new a(bVar, this.f34901b.scheduleAtFixedRate(bVar, initialDelay, period, unit));
        }

        @Override // com.google.common.util.concurrent.u1, java.util.concurrent.ScheduledExecutorService
        public r1<?> scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit) {
            b bVar = new b(command);
            return new a(bVar, this.f34901b.scheduleWithFixedDelay(bVar, initialDelay, delay, unit));
        }

        @Override // com.google.common.util.concurrent.u1, java.util.concurrent.ScheduledExecutorService
        public r1<?> schedule(Runnable command, long delay, TimeUnit unit) {
            w2 O = w2.O(command, null);
            return new a(O, this.f34901b.schedule(O, delay, unit));
        }

        @Override // com.google.common.util.concurrent.u1, java.util.concurrent.ScheduledExecutorService
        public <V> r1<V> schedule(Callable<V> callable, long delay, TimeUnit unit) {
            w2 P = w2.P(callable);
            return new a(P, this.f34901b.schedule(P, delay, unit));
        }
    }

    @go.d
    @go.c
    public static void b(ExecutorService service, long terminationTimeout, TimeUnit timeUnit) {
        new f().a(service, terminationTimeout, timeUnit);
    }

    public static Executor c() {
        return j0.INSTANCE;
    }

    @go.d
    @go.c
    public static ExecutorService d(ThreadPoolExecutor executor) {
        return new f().c(executor);
    }

    @go.d
    @go.c
    public static ExecutorService e(ThreadPoolExecutor executor, long terminationTimeout, TimeUnit timeUnit) {
        return new f().d(executor, terminationTimeout, timeUnit);
    }

    @go.d
    @go.c
    public static ScheduledExecutorService f(ScheduledThreadPoolExecutor executor) {
        return new f().e(executor);
    }

    @go.d
    @go.c
    public static ScheduledExecutorService g(ScheduledThreadPoolExecutor executor, long terminationTimeout, TimeUnit timeUnit) {
        return new f().f(executor, terminationTimeout, timeUnit);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b9 A[SYNTHETIC] */
    @com.google.common.util.concurrent.z1
    @go.d
    @go.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> T h(com.google.common.util.concurrent.t1 r16, java.util.Collection<? extends java.util.concurrent.Callable<T>> r17, boolean r18, long r19, java.util.concurrent.TimeUnit r21) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
        /*
            r1 = r16
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r21)
            int r0 = r17.size()
            r2 = 1
            if (r0 <= 0) goto L11
            r3 = r2
            goto L12
        L11:
            r3 = 0
        L12:
            com.google.common.base.Preconditions.checkArgument(r3)
            java.util.ArrayList r3 = com.google.common.collect.q6.u(r0)
            java.util.concurrent.LinkedBlockingQueue r4 = com.google.common.collect.w7.k()
            r5 = r19
            r7 = r21
            long r5 = r7.toNanos(r5)
            if (r18 == 0) goto L2f
            long r7 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L2c
            goto L31
        L2c:
            r0 = move-exception
            goto Lbd
        L2f:
            r7 = 0
        L31:
            java.util.Iterator r9 = r17.iterator()     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.Callable r10 = (java.util.concurrent.Callable) r10     // Catch: java.lang.Throwable -> L2c
            com.google.common.util.concurrent.p1 r10 = u(r1, r10, r4)     // Catch: java.lang.Throwable -> L2c
            r3.add(r10)     // Catch: java.lang.Throwable -> L2c
            int r0 = r0 + (-1)
            r10 = 0
            r11 = r2
            r12 = r10
        L47:
            java.lang.Object r13 = r4.poll()     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.Future r13 = (java.util.concurrent.Future) r13     // Catch: java.lang.Throwable -> L2c
            if (r13 != 0) goto L62
            if (r0 <= 0) goto L66
            int r0 = r0 + (-1)
            java.lang.Object r14 = r9.next()     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.Callable r14 = (java.util.concurrent.Callable) r14     // Catch: java.lang.Throwable -> L2c
            com.google.common.util.concurrent.p1 r14 = u(r1, r14, r4)     // Catch: java.lang.Throwable -> L2c
            r3.add(r14)     // Catch: java.lang.Throwable -> L2c
            int r11 = r11 + 1
        L62:
            r14 = r7
        L63:
            r6 = r5
            r5 = r0
            goto L91
        L66:
            if (r11 != 0) goto L70
            if (r12 != 0) goto L6f
            java.util.concurrent.ExecutionException r12 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L2c
            r12.<init>(r10)     // Catch: java.lang.Throwable -> L2c
        L6f:
            throw r12     // Catch: java.lang.Throwable -> L2c
        L70:
            if (r18 == 0) goto L8a
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r13 = r4.poll(r5, r13)     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.Future r13 = (java.util.concurrent.Future) r13     // Catch: java.lang.Throwable -> L2c
            if (r13 == 0) goto L84
            long r14 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L2c
            long r7 = r14 - r7
            long r5 = r5 - r7
            goto L63
        L84:
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException     // Catch: java.lang.Throwable -> L2c
            r0.<init>()     // Catch: java.lang.Throwable -> L2c
            throw r0     // Catch: java.lang.Throwable -> L2c
        L8a:
            java.lang.Object r13 = r4.take()     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.Future r13 = (java.util.concurrent.Future) r13     // Catch: java.lang.Throwable -> L2c
            goto L62
        L91:
            if (r13 == 0) goto Lb9
            int r11 = r11 + (-1)
            java.lang.Object r0 = r13.get()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> Lae java.lang.InterruptedException -> Lb5 java.util.concurrent.ExecutionException -> Lb7
            java.util.Iterator r1 = r3.iterator()
        L9d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lad
            java.lang.Object r3 = r1.next()
            java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3
            r3.cancel(r2)
            goto L9d
        Lad:
            return r0
        Lae:
            r0 = move-exception
            java.util.concurrent.ExecutionException r12 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L2c
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L2c
            goto Lb9
        Lb5:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L2c
        Lb7:
            r0 = move-exception
            r12 = r0
        Lb9:
            r0 = r5
            r5 = r6
            r7 = r14
            goto L47
        Lbd:
            java.util.Iterator r1 = r3.iterator()
        Lc1:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Ld1
            java.lang.Object r3 = r1.next()
            java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3
            r3.cancel(r2)
            goto Lc1
        Ld1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.w1.h(com.google.common.util.concurrent.t1, java.util.Collection, boolean, long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @go.d
    @go.c
    public static boolean i() {
        if (System.getProperty("com.google.appengine.runtime.environment") == null) {
            return false;
        }
        try {
            Class.forName("com.google.appengine.api.utils.SystemProperty");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return Class.forName("com.google.apphosting.api.ApiProxy").getMethod("getCurrentEnvironment", null).invoke(null, null) != null;
    }

    @go.d
    @go.c
    public static t1 j(ExecutorService delegate) {
        return delegate instanceof t1 ? (t1) delegate : delegate instanceof ScheduledExecutorService ? new h((ScheduledExecutorService) delegate) : new g(delegate);
    }

    @go.d
    @go.c
    public static u1 k(ScheduledExecutorService delegate) {
        return delegate instanceof u1 ? (u1) delegate : new h(delegate);
    }

    @go.c
    public static t1 l() {
        return new k0();
    }

    @go.c
    public static Executor m(Executor delegate) {
        return new e2(delegate);
    }

    @go.d
    @go.c
    public static Thread n(String name, Runnable runnable) {
        Preconditions.checkNotNull(name);
        Preconditions.checkNotNull(runnable);
        Thread newThread = o().newThread(runnable);
        Objects.requireNonNull(newThread);
        try {
            newThread.setName(name);
        } catch (SecurityException unused) {
        }
        return newThread;
    }

    @go.d
    @go.c
    public static ThreadFactory o() {
        if (!i()) {
            return Executors.defaultThreadFactory();
        }
        try {
            return (ThreadFactory) Class.forName("com.google.appengine.api.ThreadManager").getMethod("currentRequestThreadFactory", null).invoke(null, null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException e11) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e11);
        } catch (InvocationTargetException e12) {
            throw ho.t0.q(e12.getCause());
        }
    }

    public static Executor p(final Executor delegate, final com.google.common.util.concurrent.f<?> future) {
        Preconditions.checkNotNull(delegate);
        Preconditions.checkNotNull(future);
        return delegate == c() ? delegate : new e(delegate, future);
    }

    @go.d
    @go.c
    public static Executor q(final Executor executor, final ho.p0<String> nameSupplier) {
        Preconditions.checkNotNull(executor);
        Preconditions.checkNotNull(nameSupplier);
        return new b(executor, nameSupplier);
    }

    @go.d
    @go.c
    public static ExecutorService r(final ExecutorService service, final ho.p0<String> nameSupplier) {
        Preconditions.checkNotNull(service);
        Preconditions.checkNotNull(nameSupplier);
        return new c(service, nameSupplier);
    }

    @go.d
    @go.c
    public static ScheduledExecutorService s(final ScheduledExecutorService service, final ho.p0<String> nameSupplier) {
        Preconditions.checkNotNull(service);
        Preconditions.checkNotNull(nameSupplier);
        return new d(service, nameSupplier);
    }

    @go.d
    @go.c
    @uo.a
    public static boolean t(ExecutorService service, long timeout, TimeUnit unit) {
        long nanos = unit.toNanos(timeout) / 2;
        service.shutdown();
        try {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (!service.awaitTermination(nanos, timeUnit)) {
                service.shutdownNow();
                service.awaitTermination(nanos, timeUnit);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            service.shutdownNow();
        }
        return service.isTerminated();
    }

    @go.d
    @go.c
    public static <T> p1<T> u(t1 executorService, Callable<T> task, final BlockingQueue<Future<T>> queue) {
        p1<T> submit = executorService.submit((Callable) task);
        submit.addListener(new a(queue, submit), c());
        return submit;
    }

    @go.d
    @go.c
    public static void v(ThreadPoolExecutor executor) {
        executor.setThreadFactory(new t2().e(true).h(executor.getThreadFactory()).b());
    }
}
