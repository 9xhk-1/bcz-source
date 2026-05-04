package rx.internal.schedulers;

import androidx.camera.view.q;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import rx.d;
import rx.internal.util.RxThreadFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class a extends rx.d implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final long f86522c;

    /* renamed from: d, reason: collision with root package name */
    public static final TimeUnit f86523d = TimeUnit.SECONDS;

    /* renamed from: e, reason: collision with root package name */
    public static final c f86524e;

    /* renamed from: f, reason: collision with root package name */
    public static final C1111a f86525f;

    /* renamed from: a, reason: collision with root package name */
    public final ThreadFactory f86526a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<C1111a> f86527b = new AtomicReference<>(f86525f);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: rx.internal.schedulers.a$a, reason: collision with other inner class name */
    public static final class C1111a {

        /* renamed from: a, reason: collision with root package name */
        public final ThreadFactory f86528a;

        /* renamed from: b, reason: collision with root package name */
        public final long f86529b;

        /* renamed from: c, reason: collision with root package name */
        public final ConcurrentLinkedQueue<c> f86530c;

        /* renamed from: d, reason: collision with root package name */
        public final ec0.b f86531d;

        /* renamed from: e, reason: collision with root package name */
        public final ScheduledExecutorService f86532e;

        /* renamed from: f, reason: collision with root package name */
        public final Future<?> f86533f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.schedulers.a$a$a, reason: collision with other inner class name */
        public class ThreadFactoryC1112a implements ThreadFactory {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ThreadFactory f86534a;

            public ThreadFactoryC1112a(ThreadFactory threadFactory) {
                this.f86534a = threadFactory;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread newThread = this.f86534a.newThread(runnable);
                newThread.setName(newThread.getName() + " (Evictor)");
                return newThread;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.schedulers.a$a$b */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C1111a.this.a();
            }
        }

        public C1111a(ThreadFactory threadFactory, long j11, TimeUnit timeUnit) {
            ScheduledExecutorService scheduledExecutorService;
            ScheduledFuture<?> scheduledFuture;
            this.f86528a = threadFactory;
            long nanos = timeUnit != null ? timeUnit.toNanos(j11) : 0L;
            this.f86529b = nanos;
            this.f86530c = new ConcurrentLinkedQueue<>();
            this.f86531d = new ec0.b();
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, new ThreadFactoryC1112a(threadFactory));
                h.L(scheduledExecutorService);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(new b(), nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorService = null;
                scheduledFuture = null;
            }
            this.f86532e = scheduledExecutorService;
            this.f86533f = scheduledFuture;
        }

        public void a() {
            if (this.f86530c.isEmpty()) {
                return;
            }
            long c11 = c();
            Iterator<c> it = this.f86530c.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next.Q() > c11) {
                    return;
                }
                if (this.f86530c.remove(next)) {
                    this.f86531d.e(next);
                }
            }
        }

        public c b() {
            if (this.f86531d.isUnsubscribed()) {
                return a.f86524e;
            }
            while (!this.f86530c.isEmpty()) {
                c poll = this.f86530c.poll();
                if (poll != null) {
                    return poll;
                }
            }
            c cVar = new c(this.f86528a);
            this.f86531d.a(cVar);
            return cVar;
        }

        public long c() {
            return System.nanoTime();
        }

        public void d(c cVar) {
            cVar.S(c() + this.f86529b);
            this.f86530c.offer(cVar);
        }

        public void e() {
            try {
                Future<?> future = this.f86533f;
                if (future != null) {
                    future.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = this.f86532e;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                }
                this.f86531d.unsubscribe();
            } catch (Throwable th2) {
                this.f86531d.unsubscribe();
                throw th2;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends d.a implements wb0.a {

        /* renamed from: b, reason: collision with root package name */
        public final C1111a f86538b;

        /* renamed from: c, reason: collision with root package name */
        public final c f86539c;

        /* renamed from: a, reason: collision with root package name */
        public final ec0.b f86537a = new ec0.b();

        /* renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f86540d = new AtomicBoolean();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.schedulers.a$b$a, reason: collision with other inner class name */
        public class C1113a implements wb0.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ wb0.a f86541a;

            public C1113a(wb0.a aVar) {
                this.f86541a = aVar;
            }

            @Override // wb0.a
            public void call() {
                if (b.this.isUnsubscribed()) {
                    return;
                }
                this.f86541a.call();
            }
        }

        public b(C1111a c1111a) {
            this.f86538b = c1111a;
            this.f86539c = c1111a.b();
        }

        @Override // wb0.a
        public void call() {
            this.f86538b.d(this.f86539c);
        }

        @Override // rx.d.a
        public qb0.h h(wb0.a aVar) {
            return j(aVar, 0L, null);
        }

        @Override // qb0.h
        public boolean isUnsubscribed() {
            return this.f86537a.isUnsubscribed();
        }

        @Override // rx.d.a
        public qb0.h j(wb0.a aVar, long j11, TimeUnit timeUnit) {
            if (this.f86537a.isUnsubscribed()) {
                return ec0.f.e();
            }
            ScheduledAction E = this.f86539c.E(new C1113a(aVar), j11, timeUnit);
            this.f86537a.a(E);
            E.addParent(this.f86537a);
            return E;
        }

        @Override // qb0.h
        public void unsubscribe() {
            if (this.f86540d.compareAndSet(false, true)) {
                this.f86539c.h(this);
            }
            this.f86537a.unsubscribe();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends h {

        /* renamed from: l, reason: collision with root package name */
        public long f86543l;

        public c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f86543l = 0L;
        }

        public long Q() {
            return this.f86543l;
        }

        public void S(long j11) {
            this.f86543l = j11;
        }
    }

    static {
        c cVar = new c(RxThreadFactory.NONE);
        f86524e = cVar;
        cVar.unsubscribe();
        C1111a c1111a = new C1111a(null, 0L, null);
        f86525f = c1111a;
        c1111a.e();
        f86522c = Integer.getInteger("rx.io-scheduler.keepalive", 60).intValue();
    }

    public a(ThreadFactory threadFactory) {
        this.f86526a = threadFactory;
        start();
    }

    @Override // rx.d
    public d.a a() {
        return new b(this.f86527b.get());
    }

    @Override // rx.internal.schedulers.j
    public void shutdown() {
        C1111a c1111a;
        C1111a c1111a2;
        do {
            c1111a = this.f86527b.get();
            c1111a2 = f86525f;
            if (c1111a == c1111a2) {
                return;
            }
        } while (!q.a(this.f86527b, c1111a, c1111a2));
        c1111a.e();
    }

    @Override // rx.internal.schedulers.j
    public void start() {
        C1111a c1111a = new C1111a(this.f86526a, f86522c, f86523d);
        if (q.a(this.f86527b, f86525f, c1111a)) {
            return;
        }
        c1111a.e();
    }
}
