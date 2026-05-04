package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.processing.SurfaceProcessorInternal;
import androidx.camera.core.processing.SurfaceProcessorWithExecutor;
import androidx.camera.core.processing.TargetUtils;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public abstract class CameraEffect {
    public static final int IMAGE_CAPTURE = 4;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int OUTPUT_OPTION_ONE_FOR_ALL_TARGETS = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int OUTPUT_OPTION_ONE_FOR_EACH_TARGET = 1;
    public static final int PREVIEW = 1;
    private static final List<Integer> SURFACE_PROCESSOR_TARGETS = Arrays.asList(1, 2, 3, 7);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int TRANSFORMATION_ARBITRARY = 0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int TRANSFORMATION_CAMERA_AND_SURFACE_ROTATION = 1;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int TRANSFORMATION_PASSTHROUGH = 2;
    public static final int VIDEO_CAPTURE = 2;

    @NonNull
    private final Consumer<Throwable> mErrorListener;

    @NonNull
    private final Executor mExecutor;

    @Nullable
    private final ImageProcessor mImageProcessor;
    private final int mOutputOption;

    @Nullable
    private final SurfaceProcessor mSurfaceProcessor;
    private final int mTargets;
    private final int mTransformation;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Formats {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface OutputOptions {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Targets {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface Transformations {
    }

    public CameraEffect(int i11, @NonNull Executor executor, @NonNull ImageProcessor imageProcessor, @NonNull Consumer<Throwable> consumer) {
        Preconditions.checkArgument(i11 == 4, "Currently ImageProcessor can only target IMAGE_CAPTURE.");
        this.mTargets = i11;
        this.mTransformation = 0;
        this.mOutputOption = 0;
        this.mExecutor = executor;
        this.mSurfaceProcessor = null;
        this.mImageProcessor = imageProcessor;
        this.mErrorListener = consumer;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public SurfaceProcessorInternal createSurfaceProcessorInternal() {
        return new SurfaceProcessorWithExecutor(this);
    }

    @NonNull
    public Consumer<Throwable> getErrorListener() {
        return this.mErrorListener;
    }

    @NonNull
    public Executor getExecutor() {
        return this.mExecutor;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ImageProcessor getImageProcessor() {
        return this.mImageProcessor;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getOutputOption() {
        return this.mOutputOption;
    }

    @Nullable
    public SurfaceProcessor getSurfaceProcessor() {
        return this.mSurfaceProcessor;
    }

    public int getTargets() {
        return this.mTargets;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getTransformation() {
        return this.mTransformation;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraEffect(int i11, int i12, @NonNull Executor executor, @NonNull SurfaceProcessor surfaceProcessor, @NonNull Consumer<Throwable> consumer) {
        this(i11, 0, i12, executor, surfaceProcessor, consumer);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraEffect(int i11, int i12, int i13, @NonNull Executor executor, @NonNull SurfaceProcessor surfaceProcessor, @NonNull Consumer<Throwable> consumer) {
        TargetUtils.checkSupportedTargets(SURFACE_PROCESSOR_TARGETS, i11);
        this.mTargets = i11;
        this.mOutputOption = i12;
        this.mTransformation = i13;
        this.mExecutor = executor;
        this.mSurfaceProcessor = surfaceProcessor;
        this.mImageProcessor = null;
        this.mErrorListener = consumer;
    }

    public CameraEffect(int i11, @NonNull Executor executor, @NonNull SurfaceProcessor surfaceProcessor, @NonNull Consumer<Throwable> consumer) {
        this(i11, 0, 0, executor, surfaceProcessor, consumer);
    }
}
