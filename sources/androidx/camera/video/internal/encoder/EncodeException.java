package androidx.camera.video.internal.encoder;

import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class EncodeException extends Exception {
    public static final int ERROR_CODEC = 1;
    public static final int ERROR_UNKNOWN = 0;
    private final int mErrorType;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorType {
    }

    public EncodeException(int i11, @Nullable String str, @Nullable Throwable th2) {
        super(str, th2);
        this.mErrorType = i11;
    }

    public int getErrorType() {
        return this.mErrorType;
    }
}
