package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.arch.core.executor.ArchTaskExecutor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class LifecycleRegistry_androidKt {
    @SuppressLint({"RestrictedApi"})
    public static final boolean isMainThread() {
        return ArchTaskExecutor.getInstance().isMainThread();
    }
}
