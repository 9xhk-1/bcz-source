package fl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Executor f52001a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final Executor f52002b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final Executor f52003c = new c();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            o.z(runnable);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            o.y(runnable);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return f52003c;
    }

    public static Executor b() {
        return f52001a;
    }

    public static Executor c() {
        return f52002b;
    }

    @VisibleForTesting
    public static void d(ExecutorService executorService) {
        executorService.shutdownNow();
        try {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (executorService.awaitTermination(5L, timeUnit)) {
                return;
            }
            executorService.shutdownNow();
            if (executorService.awaitTermination(5L, timeUnit)) {
            } else {
                throw new RuntimeException("Failed to shutdown");
            }
        } catch (InterruptedException e11) {
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
            throw new RuntimeException(e11);
        }
    }
}
