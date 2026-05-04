package androidx.camera.core.impl.utils;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class InterruptedRuntimeException extends RuntimeException {
    public InterruptedRuntimeException() {
    }

    public InterruptedRuntimeException(@NonNull String str) {
        super(str);
    }

    public InterruptedRuntimeException(@NonNull String str, @NonNull Throwable th2) {
        super(str, th2);
    }

    public InterruptedRuntimeException(@NonNull Throwable th2) {
        super(th2);
    }
}
