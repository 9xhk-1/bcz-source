package androidx.camera.core;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class CameraUnavailableException extends Exception {
    public static final int CAMERA_DISABLED = 1;
    public static final int CAMERA_DISCONNECTED = 2;
    public static final int CAMERA_ERROR = 3;
    public static final int CAMERA_IN_USE = 4;
    public static final int CAMERA_MAX_IN_USE = 5;
    public static final int CAMERA_UNAVAILABLE_DO_NOT_DISTURB = 6;
    public static final int CAMERA_UNKNOWN_ERROR = 0;
    private final int mReason;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface Reason {
    }

    public CameraUnavailableException(int i11) {
        this.mReason = i11;
    }

    public int getReason() {
        return this.mReason;
    }

    public CameraUnavailableException(int i11, @Nullable String str) {
        super(str);
        this.mReason = i11;
    }

    public CameraUnavailableException(int i11, @Nullable String str, @Nullable Throwable th2) {
        super(str, th2);
        this.mReason = i11;
    }

    public CameraUnavailableException(int i11, @Nullable Throwable th2) {
        super(th2);
        this.mReason = i11;
    }
}
