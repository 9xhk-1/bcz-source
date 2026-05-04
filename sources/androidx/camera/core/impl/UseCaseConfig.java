package androidx.camera.core.impl;

import android.util.Range;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.ExtendableBuilder;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.internal.TargetConfig;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface UseCaseConfig<T extends UseCase> extends TargetConfig<T>, ImageInputConfig {
    public static final Config.Option<UseCaseConfigFactory.CaptureType> OPTION_CAPTURE_TYPE;
    public static final Config.Option<Boolean> OPTION_HIGH_RESOLUTION_DISABLED;
    public static final Config.Option<Integer> OPTION_PREVIEW_STABILIZATION_MODE;
    public static final Config.Option<Integer> OPTION_SURFACE_OCCUPANCY_PRIORITY;
    public static final Config.Option<Range<Integer>> OPTION_TARGET_FRAME_RATE;
    public static final Config.Option<Integer> OPTION_VIDEO_STABILIZATION_MODE;
    public static final Config.Option<Boolean> OPTION_ZSL_DISABLED;
    public static final Config.Option<SessionConfig> OPTION_DEFAULT_SESSION_CONFIG = Config.Option.create("camerax.core.useCase.defaultSessionConfig", SessionConfig.class);
    public static final Config.Option<CaptureConfig> OPTION_DEFAULT_CAPTURE_CONFIG = Config.Option.create("camerax.core.useCase.defaultCaptureConfig", CaptureConfig.class);
    public static final Config.Option<SessionConfig.OptionUnpacker> OPTION_SESSION_CONFIG_UNPACKER = Config.Option.create("camerax.core.useCase.sessionConfigUnpacker", SessionConfig.OptionUnpacker.class);
    public static final Config.Option<CaptureConfig.OptionUnpacker> OPTION_CAPTURE_CONFIG_UNPACKER = Config.Option.create("camerax.core.useCase.captureConfigUnpacker", CaptureConfig.OptionUnpacker.class);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Builder<T extends UseCase, C extends UseCaseConfig<T>, B> extends TargetConfig.Builder<T, B>, ExtendableBuilder<T> {
        @NonNull
        C getUseCaseConfig();

        @NonNull
        B setCaptureOptionUnpacker(@NonNull CaptureConfig.OptionUnpacker optionUnpacker);

        @NonNull
        B setCaptureType(@NonNull UseCaseConfigFactory.CaptureType captureType);

        @NonNull
        B setDefaultCaptureConfig(@NonNull CaptureConfig captureConfig);

        @NonNull
        B setDefaultSessionConfig(@NonNull SessionConfig sessionConfig);

        @NonNull
        B setHighResolutionDisabled(boolean z11);

        @NonNull
        B setSessionOptionUnpacker(@NonNull SessionConfig.OptionUnpacker optionUnpacker);

        @NonNull
        B setSurfaceOccupancyPriority(int i11);

        @NonNull
        B setZslDisabled(boolean z11);
    }

    static {
        Class cls = Integer.TYPE;
        OPTION_SURFACE_OCCUPANCY_PRIORITY = Config.Option.create("camerax.core.useCase.surfaceOccupancyPriority", cls);
        OPTION_TARGET_FRAME_RATE = Config.Option.create("camerax.core.useCase.targetFrameRate", Range.class);
        Class cls2 = Boolean.TYPE;
        OPTION_ZSL_DISABLED = Config.Option.create("camerax.core.useCase.zslDisabled", cls2);
        OPTION_HIGH_RESOLUTION_DISABLED = Config.Option.create("camerax.core.useCase.highResolutionDisabled", cls2);
        OPTION_CAPTURE_TYPE = Config.Option.create("camerax.core.useCase.captureType", UseCaseConfigFactory.CaptureType.class);
        OPTION_PREVIEW_STABILIZATION_MODE = Config.Option.create("camerax.core.useCase.previewStabilizationMode", cls);
        OPTION_VIDEO_STABILIZATION_MODE = Config.Option.create("camerax.core.useCase.videoStabilizationMode", cls);
    }

    @Nullable
    default CaptureConfig.OptionUnpacker getCaptureOptionUnpacker(@Nullable CaptureConfig.OptionUnpacker optionUnpacker) {
        return (CaptureConfig.OptionUnpacker) retrieveOption(OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
    }

    @NonNull
    default UseCaseConfigFactory.CaptureType getCaptureType() {
        return (UseCaseConfigFactory.CaptureType) retrieveOption(OPTION_CAPTURE_TYPE);
    }

    @Nullable
    default CaptureConfig getDefaultCaptureConfig(@Nullable CaptureConfig captureConfig) {
        return (CaptureConfig) retrieveOption(OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
    }

    @Nullable
    default SessionConfig getDefaultSessionConfig(@Nullable SessionConfig sessionConfig) {
        return (SessionConfig) retrieveOption(OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
    }

    default int getPreviewStabilizationMode() {
        return ((Integer) retrieveOption(OPTION_PREVIEW_STABILIZATION_MODE, 0)).intValue();
    }

    @Nullable
    default SessionConfig.OptionUnpacker getSessionOptionUnpacker(@Nullable SessionConfig.OptionUnpacker optionUnpacker) {
        return (SessionConfig.OptionUnpacker) retrieveOption(OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
    }

    default int getSurfaceOccupancyPriority(int i11) {
        return ((Integer) retrieveOption(OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i11))).intValue();
    }

    @Nullable
    default Range<Integer> getTargetFrameRate(@Nullable Range<Integer> range) {
        return (Range) retrieveOption(OPTION_TARGET_FRAME_RATE, range);
    }

    default int getVideoStabilizationMode() {
        return ((Integer) retrieveOption(OPTION_VIDEO_STABILIZATION_MODE, 0)).intValue();
    }

    default boolean isHighResolutionDisabled(boolean z11) {
        return ((Boolean) retrieveOption(OPTION_HIGH_RESOLUTION_DISABLED, Boolean.valueOf(z11))).booleanValue();
    }

    default boolean isZslDisabled(boolean z11) {
        return ((Boolean) retrieveOption(OPTION_ZSL_DISABLED, Boolean.valueOf(z11))).booleanValue();
    }

    @NonNull
    default CaptureConfig.OptionUnpacker getCaptureOptionUnpacker() {
        return (CaptureConfig.OptionUnpacker) retrieveOption(OPTION_CAPTURE_CONFIG_UNPACKER);
    }

    @NonNull
    default CaptureConfig getDefaultCaptureConfig() {
        return (CaptureConfig) retrieveOption(OPTION_DEFAULT_CAPTURE_CONFIG);
    }

    @NonNull
    default SessionConfig getDefaultSessionConfig() {
        return (SessionConfig) retrieveOption(OPTION_DEFAULT_SESSION_CONFIG);
    }

    @NonNull
    default SessionConfig.OptionUnpacker getSessionOptionUnpacker() {
        return (SessionConfig.OptionUnpacker) retrieveOption(OPTION_SESSION_CONFIG_UNPACKER);
    }

    default int getSurfaceOccupancyPriority() {
        return ((Integer) retrieveOption(OPTION_SURFACE_OCCUPANCY_PRIORITY)).intValue();
    }

    @NonNull
    default Range<Integer> getTargetFrameRate() {
        return (Range) retrieveOption(OPTION_TARGET_FRAME_RATE);
    }
}
