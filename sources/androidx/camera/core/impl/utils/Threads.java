package androidx.camera.core.impl.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class Threads {
    private static final long TIMEOUT_RUN_ON_MAIN_MS = 30000;

    private Threads() {
    }

    public static /* synthetic */ void a(Runnable runnable, CountDownLatch countDownLatch) {
        try {
            runnable.run();
        } finally {
            countDownLatch.countDown();
        }
    }

    public static void checkBackgroundThread() {
        Preconditions.checkState(isBackgroundThread(), "In application's main thread");
    }

    public static void checkMainThread() {
        Preconditions.checkState(isMainThread(), "Not in application's main thread");
    }

    @NonNull
    private static Handler getMainHandler() {
        return new Handler(Looper.getMainLooper());
    }

    public static boolean isBackgroundThread() {
        return !isMainThread();
    }

    public static boolean isMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void runOnMain(@NonNull Runnable runnable) {
        if (isMainThread()) {
            runnable.run();
        } else {
            Preconditions.checkState(getMainHandler().post(runnable), "Unable to post to main thread");
        }
    }

    public static void runOnMainSync(@NonNull final Runnable runnable) {
        if (isMainThread()) {
            runnable.run();
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        Preconditions.checkState(getMainHandler().post(new Runnable() { // from class: androidx.camera.core.impl.utils.a
            @Override // java.lang.Runnable
            public final void run() {
                Threads.a(runnable, countDownLatch);
            }
        }), "Unable to post to main thread");
        try {
            if (countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
            } else {
                throw new IllegalStateException("Timeout to wait main thread execution");
            }
        } catch (InterruptedException e11) {
            throw new InterruptedRuntimeException(e11);
        }
    }
}
