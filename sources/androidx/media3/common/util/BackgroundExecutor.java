package androidx.media3.common.util;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class BackgroundExecutor {

    @Nullable
    private static Executor staticInstance;

    private BackgroundExecutor() {
    }

    public static synchronized Executor get() {
        Executor executor;
        synchronized (BackgroundExecutor.class) {
            try {
                if (staticInstance == null) {
                    staticInstance = Util.newSingleThreadExecutor("ExoPlayer:BackgroundExecutor");
                }
                executor = staticInstance;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return executor;
    }

    public static synchronized void set(Executor executor) {
        synchronized (BackgroundExecutor.class) {
            staticInstance = executor;
        }
    }
}
