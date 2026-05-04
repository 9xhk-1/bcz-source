package gr;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f54023b = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final int f54024c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f54025d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f54026e;

    /* renamed from: a, reason: collision with root package name */
    public final Executor f54027a = new ExecutorC0644a(0);

    /* renamed from: gr.a$a, reason: collision with other inner class name */
    public static class ExecutorC0644a implements Executor {
        public ExecutorC0644a() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }

        public /* synthetic */ ExecutorC0644a(byte b11) {
            this();
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f54024c = availableProcessors;
        f54025d = availableProcessors + 1;
        f54026e = (availableProcessors * 2) + 1;
    }

    public static ExecutorService a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(f54025d, f54026e, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static Executor b() {
        return f54023b.f54027a;
    }
}
