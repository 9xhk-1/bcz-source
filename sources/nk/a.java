package nk;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class a implements ExecutorService {

    /* renamed from: b, reason: collision with root package name */
    public static final String f75144b = "source";

    /* renamed from: c, reason: collision with root package name */
    public static final String f75145c = "disk-cache";

    /* renamed from: d, reason: collision with root package name */
    public static final int f75146d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final String f75147e = "GlideExecutor";

    /* renamed from: f, reason: collision with root package name */
    public static final String f75148f = "source-unlimited";

    /* renamed from: g, reason: collision with root package name */
    public static final String f75149g = "animation";

    /* renamed from: h, reason: collision with root package name */
    public static final long f75150h = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: i, reason: collision with root package name */
    public static final int f75151i = 4;

    /* renamed from: j, reason: collision with root package name */
    public static volatile int f75152j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final int f75153k = 9;

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f75154a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: h, reason: collision with root package name */
        public static final long f75155h = 0;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f75156a;

        /* renamed from: b, reason: collision with root package name */
        public int f75157b;

        /* renamed from: c, reason: collision with root package name */
        public int f75158c;

        /* renamed from: d, reason: collision with root package name */
        @NonNull
        public ThreadFactory f75159d = new c();

        /* renamed from: e, reason: collision with root package name */
        @NonNull
        public e f75160e = e.f75174d;

        /* renamed from: f, reason: collision with root package name */
        public String f75161f;

        /* renamed from: g, reason: collision with root package name */
        public long f75162g;

        public b(boolean z11) {
            this.f75156a = z11;
        }

        public a a() {
            if (TextUtils.isEmpty(this.f75161f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f75161f);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f75157b, this.f75158c, this.f75162g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f75159d, this.f75161f, this.f75160e, this.f75156a));
            if (this.f75162g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new a(threadPoolExecutor);
        }

        public b b(String str) {
            this.f75161f = str;
            return this;
        }

        public b c(@IntRange(from = 1) int i11) {
            this.f75157b = i11;
            this.f75158c = i11;
            return this;
        }

        @Deprecated
        public b d(@NonNull ThreadFactory threadFactory) {
            this.f75159d = threadFactory;
            return this;
        }

        public b e(long j11) {
            this.f75162g = j11;
            return this;
        }

        public b f(@NonNull e eVar) {
            this.f75160e = eVar;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ThreadFactory {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: nk.a$c$a, reason: collision with other inner class name */
        public class C0914a extends Thread {
            public C0914a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        public c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            return new C0914a(runnable);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final ThreadFactory f75164a;

        /* renamed from: b, reason: collision with root package name */
        public final String f75165b;

        /* renamed from: c, reason: collision with root package name */
        public final e f75166c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f75167d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicInteger f75168e = new AtomicInteger();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: nk.a$d$a, reason: collision with other inner class name */
        public class RunnableC0915a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Runnable f75169a;

            public RunnableC0915a(Runnable runnable) {
                this.f75169a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f75167d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f75169a.run();
                } catch (Throwable th2) {
                    d.this.f75166c.a(th2);
                }
            }
        }

        public d(ThreadFactory threadFactory, String str, e eVar, boolean z11) {
            this.f75164a = threadFactory;
            this.f75165b = str;
            this.f75166c = eVar;
            this.f75167d = z11;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            Thread newThread = this.f75164a.newThread(new RunnableC0915a(runnable));
            newThread.setName("glide-" + this.f75165b + "-thread-" + this.f75168e.getAndIncrement());
            return newThread;
        }
    }

    @VisibleForTesting
    public a(ExecutorService executorService) {
        this.f75154a = executorService;
    }

    public static int a() {
        return b() >= 4 ? 2 : 1;
    }

    public static int b() {
        if (f75152j == 0) {
            f75152j = Math.min(4, nk.b.a());
        }
        return f75152j;
    }

    public static b c() {
        return new b(true).c(a()).b("animation");
    }

    public static a d() {
        return c().a();
    }

    @Deprecated
    public static a e(int i11, e eVar) {
        return c().c(i11).f(eVar).a();
    }

    public static b f() {
        return new b(true).c(1).b(f75145c);
    }

    public static a g() {
        return f().a();
    }

    @Deprecated
    public static a h(int i11, String str, e eVar) {
        return f().c(i11).b(str).f(eVar).a();
    }

    @Deprecated
    public static a i(e eVar) {
        return f().f(eVar).a();
    }

    public static b j() {
        return new b(false).c(b()).b("source");
    }

    public static a k() {
        return j().a();
    }

    @Deprecated
    public static a l(int i11, String str, e eVar) {
        return j().c(i11).b(str).f(eVar).a();
    }

    @Deprecated
    public static a m(e eVar) {
        return j().f(eVar).a();
    }

    public static a n() {
        return new a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f75150h, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), f75148f, e.f75174d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j11, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f75154a.awaitTermination(j11, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        this.f75154a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f75154a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) this.f75154a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f75154a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f75154a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f75154a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public List<Runnable> shutdownNow() {
        return this.f75154a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public Future<?> submit(@NonNull Runnable runnable) {
        return this.f75154a.submit(runnable);
    }

    public String toString() {
        return this.f75154a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection, long j11, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f75154a.invokeAll(collection, j11, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j11, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) this.f75154a.invokeAny(collection, j11, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public <T> Future<T> submit(@NonNull Runnable runnable, T t11) {
        return this.f75154a.submit(runnable, t11);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(@NonNull Callable<T> callable) {
        return this.f75154a.submit(callable);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f75171a = new C0916a();

        /* renamed from: b, reason: collision with root package name */
        public static final e f75172b;

        /* renamed from: c, reason: collision with root package name */
        public static final e f75173c;

        /* renamed from: d, reason: collision with root package name */
        public static final e f75174d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b implements e {
            @Override // nk.a.e
            public void a(Throwable th2) {
                if (th2 == null || !Log.isLoggable(a.f75147e, 6)) {
                    return;
                }
                Log.e(a.f75147e, "Request threw uncaught throwable", th2);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class c implements e {
            @Override // nk.a.e
            public void a(Throwable th2) {
                if (th2 != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th2);
                }
            }
        }

        static {
            b bVar = new b();
            f75172b = bVar;
            f75173c = new c();
            f75174d = bVar;
        }

        void a(Throwable th2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: nk.a$e$a, reason: collision with other inner class name */
        public class C0916a implements e {
            @Override // nk.a.e
            public void a(Throwable th2) {
            }
        }
    }
}
