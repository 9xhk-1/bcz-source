package androidx.camera.core;

import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class CameraClosedException extends RuntimeException {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraClosedException(String str, Throwable th2) {
        super(str, th2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraClosedException(String str) {
        super(str);
    }
}
