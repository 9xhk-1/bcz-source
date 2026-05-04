package androidx.camera.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ReadableConfig;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface ThreadConfig extends ReadableConfig {
    public static final Config.Option<Executor> OPTION_BACKGROUND_EXECUTOR = Config.Option.create("camerax.core.thread.backgroundExecutor", Executor.class);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Builder<B> {
        @NonNull
        B setBackgroundExecutor(@NonNull Executor executor);
    }

    @Nullable
    default Executor getBackgroundExecutor(@Nullable Executor executor) {
        return (Executor) retrieveOption(OPTION_BACKGROUND_EXECUTOR, executor);
    }

    @NonNull
    default Executor getBackgroundExecutor() {
        return (Executor) retrieveOption(OPTION_BACKGROUND_EXECUTOR);
    }
}
