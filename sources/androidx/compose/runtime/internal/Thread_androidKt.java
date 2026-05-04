package androidx.compose.runtime.internal;

import android.os.Looper;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class Thread_androidKt {
    private static final long MainThreadId;

    static {
        long j11;
        try {
            j11 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j11 = -1;
        }
        MainThreadId = j11;
    }

    public static final long getMainThreadId() {
        return MainThreadId;
    }
}
