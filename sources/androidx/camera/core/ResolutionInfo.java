package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.AutoValue_ResolutionInfo_ResolutionInfoInternal;
import eo.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class ResolutionInfo {
    private final ResolutionInfoInternal mResolutionInfoInternal;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @eo.c
    public static abstract class ResolutionInfoInternal {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @c.a
        public static abstract class Builder {
            @NonNull
            public abstract ResolutionInfoInternal build();

            @NonNull
            public abstract Builder setCropRect(@NonNull Rect rect);

            @NonNull
            public abstract Builder setResolution(@NonNull Size size);

            @NonNull
            public abstract Builder setRotationDegrees(int i11);
        }

        @NonNull
        public abstract Rect getCropRect();

        @NonNull
        public abstract Size getResolution();

        public abstract int getRotationDegrees();
    }

    public ResolutionInfo(@NonNull Size size, @NonNull Rect rect, int i11) {
        this.mResolutionInfoInternal = new AutoValue_ResolutionInfo_ResolutionInfoInternal.Builder().setResolution(size).setCropRect(rect).setRotationDegrees(i11).build();
    }

    public boolean equals(@Nullable Object obj) {
        return this.mResolutionInfoInternal.equals(obj);
    }

    @NonNull
    public Rect getCropRect() {
        return this.mResolutionInfoInternal.getCropRect();
    }

    @NonNull
    public Size getResolution() {
        return this.mResolutionInfoInternal.getResolution();
    }

    public int getRotationDegrees() {
        return this.mResolutionInfoInternal.getRotationDegrees();
    }

    public int hashCode() {
        return this.mResolutionInfoInternal.hashCode();
    }

    @NonNull
    public String toString() {
        return this.mResolutionInfoInternal.toString();
    }
}
