package androidx.arch.core.executor;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class TaskExecutor {
    public abstract void executeOnDiskIO(@NonNull Runnable runnable);

    public void executeOnMainThread(@NonNull Runnable runnable) {
        if (isMainThread()) {
            runnable.run();
        } else {
            postToMainThread(runnable);
        }
    }

    public abstract boolean isMainThread();

    public abstract void postToMainThread(@NonNull Runnable runnable);
}
