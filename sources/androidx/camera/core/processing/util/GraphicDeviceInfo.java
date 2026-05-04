package androidx.camera.core.processing.util;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.core.processing.util.AutoValue_GraphicDeviceInfo;
import eo.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@c
/* loaded from: classes.dex */
public abstract class GraphicDeviceInfo {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @c.a
    public static abstract class Builder {
        @NonNull
        public abstract GraphicDeviceInfo build();

        @NonNull
        public abstract Builder setEglExtensions(@NonNull String str);

        @NonNull
        public abstract Builder setEglVersion(@NonNull String str);

        @NonNull
        public abstract Builder setGlExtensions(@NonNull String str);

        @NonNull
        public abstract Builder setGlVersion(@NonNull String str);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_GraphicDeviceInfo.Builder().setGlVersion(GLUtils.VERSION_UNKNOWN).setEglVersion(GLUtils.VERSION_UNKNOWN).setGlExtensions("").setEglExtensions("");
    }

    @NonNull
    public abstract String getEglExtensions();

    @NonNull
    public abstract String getEglVersion();

    @NonNull
    public abstract String getGlExtensions();

    @NonNull
    public abstract String getGlVersion();
}
