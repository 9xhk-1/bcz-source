package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
class RequestExecutor {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DefaultThreadFactory implements ThreadFactory {
        private int mPriority;
        private String mThreadName;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class ProcessPriorityThread extends Thread {
            private final int mPriority;

            public ProcessPriorityThread(Runnable runnable, String str, int i11) {
                super(runnable, str);
                this.mPriority = i11;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.mPriority);
                super.run();
            }
        }

        public DefaultThreadFactory(@NonNull String str, int i11) {
            this.mThreadName = str;
            this.mPriority = i11;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new ProcessPriorityThread(runnable, this.mThreadName, this.mPriority);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class HandlerExecutor implements Executor {
        private final Handler mHandler;

        public HandlerExecutor(@NonNull Handler handler) {
            this.mHandler = (Handler) Preconditions.checkNotNull(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            if (this.mHandler.post((Runnable) Preconditions.checkNotNull(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.mHandler + " is shutting down");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ReplyRunnable<T> implements Runnable {

        @NonNull
        private Callable<T> mCallable;

        @NonNull
        private Consumer<T> mConsumer;

        @NonNull
        private Handler mHandler;

        public ReplyRunnable(@NonNull Handler handler, @NonNull Callable<T> callable, @NonNull Consumer<T> consumer) {
            this.mCallable = callable;
            this.mConsumer = consumer;
            this.mHandler = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            final T t11;
            try {
                t11 = this.mCallable.call();
            } catch (Exception unused) {
                t11 = null;
            }
            final Consumer<T> consumer = this.mConsumer;
            this.mHandler.post(new Runnable() { // from class: androidx.core.provider.RequestExecutor.ReplyRunnable.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    consumer.accept(t11);
                }
            });
        }
    }

    private RequestExecutor() {
    }

    public static ThreadPoolExecutor createDefaultExecutor(@NonNull String str, int i11, @IntRange(from = 0) int i12) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i12, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new DefaultThreadFactory(str, i11));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static Executor createHandlerExecutor(@NonNull Handler handler) {
        return new HandlerExecutor(handler);
    }

    public static <T> void execute(@NonNull Executor executor, @NonNull Callable<T> callable, @NonNull Consumer<T> consumer) {
        executor.execute(new ReplyRunnable(CalleeHandler.create(), callable, consumer));
    }

    public static <T> T submit(@NonNull ExecutorService executorService, @NonNull Callable<T> callable, @IntRange(from = 0) int i11) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i11, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e11) {
            throw e11;
        } catch (ExecutionException e12) {
            throw new RuntimeException(e12);
        } catch (TimeoutException unused) {
            throw new InterruptedException(com.alipay.sdk.m.m.a.f10784h0);
        }
    }
}
