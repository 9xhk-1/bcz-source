package androidx.camera.extensions;

import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ExtensionMode {
    public static final int AUTO = 5;
    public static final int BOKEH = 1;
    public static final int FACE_RETOUCH = 4;
    public static final int HDR = 2;
    public static final int NIGHT = 3;
    public static final int NONE = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Mode {
    }

    private ExtensionMode() {
    }
}
