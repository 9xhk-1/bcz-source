package androidx.camera.core.impl.utils.executor;

import android.os.Handler;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class CameraXExecutors {
    private CameraXExecutors() {
    }

    @NonNull
    public static Executor audioExecutor() {
        return AudioExecutor.getInstance();
    }

    @NonNull
    public static Executor directExecutor() {
        return DirectExecutor.getInstance();
    }

    @NonNull
    public static Executor highPriorityExecutor() {
        return HighPriorityExecutor.getInstance();
    }

    @NonNull
    public static Executor ioExecutor() {
        return IoExecutor.getInstance();
    }

    public static boolean isSequentialExecutor(@NonNull Executor executor) {
        return executor instanceof SequentialExecutor;
    }

    @NonNull
    public static ScheduledExecutorService mainThreadExecutor() {
        return MainThreadExecutor.getInstance();
    }

    @NonNull
    public static ScheduledExecutorService myLooperExecutor() {
        return HandlerScheduledExecutorService.currentThreadExecutor();
    }

    @NonNull
    public static ScheduledExecutorService newHandlerExecutor(@NonNull Handler handler) {
        return new HandlerScheduledExecutorService(handler);
    }

    @NonNull
    public static Executor newSequentialExecutor(@NonNull Executor executor) {
        return new SequentialExecutor(executor);
    }
}
