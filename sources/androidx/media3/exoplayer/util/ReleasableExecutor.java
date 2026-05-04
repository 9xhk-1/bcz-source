package androidx.media3.exoplayer.util;

import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.UnstableApi;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface ReleasableExecutor extends Executor {
    static <T extends Executor> ReleasableExecutor from(final T t11, final Consumer<T> consumer) {
        return new ReleasableExecutor() { // from class: androidx.media3.exoplayer.util.ReleasableExecutor.1
            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                t11.execute(runnable);
            }

            @Override // androidx.media3.exoplayer.util.ReleasableExecutor
            public void release() {
                consumer.accept(t11);
            }
        };
    }

    void release();
}
