package androidx.camera.core.impl.utils.executor;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class DirectExecutor implements Executor {
    private static volatile DirectExecutor sDirectExecutor;

    public static Executor getInstance() {
        if (sDirectExecutor != null) {
            return sDirectExecutor;
        }
        synchronized (DirectExecutor.class) {
            try {
                if (sDirectExecutor == null) {
                    sDirectExecutor = new DirectExecutor();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sDirectExecutor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
