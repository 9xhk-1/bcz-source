package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraInternal;
import androidx.core.util.Consumer;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface SurfaceOutput extends Closeable {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @eo.c
    public static abstract class CameraInputInfo {
        @NonNull
        public static CameraInputInfo of(@NonNull Size size, @NonNull Rect rect, @Nullable CameraInternal cameraInternal, int i11, boolean z11) {
            return new AutoValue_SurfaceOutput_CameraInputInfo(size, rect, cameraInternal, i11, z11);
        }

        @Nullable
        public abstract CameraInternal getCameraInternal();

        @NonNull
        public abstract Rect getInputCropRect();

        @NonNull
        public abstract Size getInputSize();

        public abstract boolean getMirroring();

        public abstract int getRotationDegrees();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @eo.c
    public static abstract class Event {
        public static final int EVENT_REQUEST_CLOSE = 0;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface EventCode {
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static Event of(int i11, @NonNull SurfaceOutput surfaceOutput) {
            return new AutoValue_SurfaceOutput_Event(i11, surfaceOutput);
        }

        public abstract int getEventCode();

        @NonNull
        public abstract SurfaceOutput getSurfaceOutput();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    default int getFormat() {
        return 34;
    }

    @NonNull
    default Matrix getSensorToBufferTransform() {
        return new Matrix();
    }

    @NonNull
    Size getSize();

    @NonNull
    Surface getSurface(@NonNull Executor executor, @NonNull Consumer<Event> consumer);

    int getTargets();

    void updateTransformMatrix(@NonNull float[] fArr, @NonNull float[] fArr2);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    default void updateTransformMatrix(@NonNull float[] fArr, @NonNull float[] fArr2, boolean z11) {
    }
}
