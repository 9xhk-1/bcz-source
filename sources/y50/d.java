package y50;

import a00.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import u50.f;
import w00.g;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTaskRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner\n+ 2 Util.kt\nokhttp3/internal/Util\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n608#2,4:315\n608#2,4:319\n615#2,4:323\n608#2,4:327\n608#2,4:331\n1#3:335\n*S KotlinDebug\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner\n*L\n79#1:315,4\n97#1:319,4\n108#1:323,4\n126#1:327,4\n152#1:331,4\n*E\n"})
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final b f99390h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    @g
    @k
    public static final d f99391i = new d(new c(f.Y(f.f91854i + " TaskRunner", true)));

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final Logger f99392j;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final a f99393a;

    /* renamed from: b, reason: collision with root package name */
    public int f99394b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f99395c;

    /* renamed from: d, reason: collision with root package name */
    public long f99396d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<y50.c> f99397e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<y50.c> f99398f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Runnable f99399g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a(@k d dVar);

        void b(@k d dVar, long j11);

        void c(@k d dVar);

        void execute(@k Runnable runnable);

        long nanoTime();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        @k
        public final Logger a() {
            return d.f99392j;
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTaskRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner$RealBackend\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,314:1\n560#2:315\n*S KotlinDebug\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner$RealBackend\n*L\n281#1:315\n*E\n"})
    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ThreadPoolExecutor f99400a;

        public c(@k ThreadFactory threadFactory) {
            g0.p(threadFactory, "threadFactory");
            this.f99400a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // y50.d.a
        public void a(@k d taskRunner) {
            g0.p(taskRunner, "taskRunner");
        }

        @Override // y50.d.a
        public void b(@k d taskRunner, long j11) throws InterruptedException {
            g0.p(taskRunner, "taskRunner");
            long j12 = j11 / 1000000;
            long j13 = j11 - (1000000 * j12);
            if (j12 > 0 || j11 > 0) {
                taskRunner.wait(j12, (int) j13);
            }
        }

        @Override // y50.d.a
        public void c(@k d taskRunner) {
            g0.p(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        public final void d() {
            this.f99400a.shutdown();
        }

        @Override // y50.d.a
        public void execute(@k Runnable runnable) {
            g0.p(runnable, "runnable");
            this.f99400a.execute(runnable);
        }

        @Override // y50.d.a
        public long nanoTime() {
            return System.nanoTime();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTaskRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner$runnable$1\n+ 2 TaskLogger.kt\nokhttp3/internal/concurrent/TaskLoggerKt\n*L\n1#1,314:1\n35#2,19:315\n*S KotlinDebug\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner$runnable$1\n*L\n62#1:315,19\n*E\n"})
    /* renamed from: y50.d$d, reason: collision with other inner class name */
    public static final class RunnableC1346d implements Runnable {
        public RunnableC1346d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            y50.a e11;
            long j11;
            while (true) {
                d dVar = d.this;
                synchronized (dVar) {
                    e11 = dVar.e();
                }
                if (e11 == null) {
                    return;
                }
                y50.c d11 = e11.d();
                g0.m(d11);
                d dVar2 = d.this;
                boolean isLoggable = d.f99390h.a().isLoggable(Level.FINE);
                if (isLoggable) {
                    j11 = d11.k().h().nanoTime();
                    y50.b.c(e11, d11, "starting");
                } else {
                    j11 = -1;
                }
                try {
                    try {
                        dVar2.k(e11);
                        g2 g2Var = g2.f100423a;
                        if (isLoggable) {
                            y50.b.c(e11, d11, "finished run in " + y50.b.b(d11.k().h().nanoTime() - j11));
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    if (isLoggable) {
                        y50.b.c(e11, d11, "failed a run in " + y50.b.b(d11.k().h().nanoTime() - j11));
                    }
                    throw th2;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(d.class.getName());
        g0.o(logger, "getLogger(TaskRunner::class.java.name)");
        f99392j = logger;
    }

    public d(@k a backend) {
        g0.p(backend, "backend");
        this.f99393a = backend;
        this.f99394b = 10000;
        this.f99397e = new ArrayList();
        this.f99398f = new ArrayList();
        this.f99399g = new RunnableC1346d();
    }

    @k
    public final List<y50.c> c() {
        List<y50.c> I4;
        synchronized (this) {
            I4 = r0.I4(this.f99397e, this.f99398f);
        }
        return I4;
    }

    public final void d(y50.a aVar, long j11) {
        if (f.f91853h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        y50.c d11 = aVar.d();
        g0.m(d11);
        if (d11.e() != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean f11 = d11.f();
        d11.s(false);
        d11.r(null);
        this.f99397e.remove(d11);
        if (j11 != -1 && !f11 && !d11.j()) {
            d11.q(aVar, j11, true);
        }
        if (d11.g().isEmpty()) {
            return;
        }
        this.f99398f.add(d11);
    }

    @l
    public final y50.a e() {
        boolean z11;
        if (f.f91853h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.f99398f.isEmpty()) {
            long nanoTime = this.f99393a.nanoTime();
            Iterator<y50.c> it = this.f99398f.iterator();
            long j11 = Long.MAX_VALUE;
            y50.a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z11 = false;
                    break;
                }
                y50.a aVar2 = it.next().g().get(0);
                long max = Math.max(0L, aVar2.c() - nanoTime);
                if (max > 0) {
                    j11 = Math.min(max, j11);
                } else {
                    if (aVar != null) {
                        z11 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                f(aVar);
                if (z11 || (!this.f99395c && !this.f99398f.isEmpty())) {
                    this.f99393a.execute(this.f99399g);
                }
                return aVar;
            }
            if (this.f99395c) {
                if (j11 < this.f99396d - nanoTime) {
                    this.f99393a.c(this);
                }
                return null;
            }
            this.f99395c = true;
            this.f99396d = nanoTime + j11;
            try {
                try {
                    this.f99393a.b(this, j11);
                } catch (InterruptedException unused) {
                    g();
                }
            } finally {
                this.f99395c = false;
            }
        }
        return null;
    }

    public final void f(y50.a aVar) {
        if (f.f91853h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        aVar.g(-1L);
        y50.c d11 = aVar.d();
        g0.m(d11);
        d11.g().remove(aVar);
        this.f99398f.remove(d11);
        d11.r(aVar);
        this.f99397e.add(d11);
    }

    public final void g() {
        int size = this.f99397e.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                this.f99397e.get(size).b();
            }
        }
        for (int size2 = this.f99398f.size() - 1; -1 < size2; size2--) {
            y50.c cVar = this.f99398f.get(size2);
            cVar.b();
            if (cVar.g().isEmpty()) {
                this.f99398f.remove(size2);
            }
        }
    }

    @k
    public final a h() {
        return this.f99393a;
    }

    public final void i(@k y50.c taskQueue) {
        g0.p(taskQueue, "taskQueue");
        if (f.f91853h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (taskQueue.e() == null) {
            if (taskQueue.g().isEmpty()) {
                this.f99398f.remove(taskQueue);
            } else {
                f.c(this.f99398f, taskQueue);
            }
        }
        if (this.f99395c) {
            this.f99393a.c(this);
        } else {
            this.f99393a.execute(this.f99399g);
        }
    }

    @k
    public final y50.c j() {
        int i11;
        synchronized (this) {
            i11 = this.f99394b;
            this.f99394b = i11 + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('Q');
        sb2.append(i11);
        return new y50.c(this, sb2.toString());
    }

    public final void k(y50.a aVar) {
        if (f.f91853h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.b());
        try {
            long f11 = aVar.f();
            synchronized (this) {
                d(aVar, f11);
                g2 g2Var = g2.f100423a;
            }
            currentThread.setName(name);
        } catch (Throwable th2) {
            synchronized (this) {
                d(aVar, -1L);
                g2 g2Var2 = g2.f100423a;
                currentThread.setName(name);
                throw th2;
            }
        }
    }
}
