package androidx.camera.core.impl.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.core.os.HandlerCompat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class MainThreadAsyncHandler {
    private static volatile Handler sHandler;

    private MainThreadAsyncHandler() {
    }

    @NonNull
    public static Handler getInstance() {
        if (sHandler != null) {
            return sHandler;
        }
        synchronized (MainThreadAsyncHandler.class) {
            try {
                if (sHandler == null) {
                    sHandler = HandlerCompat.createAsync(Looper.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sHandler;
    }
}
