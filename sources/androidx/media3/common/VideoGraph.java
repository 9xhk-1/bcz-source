package androidx.media3.common;

import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface VideoGraph {
    VideoFrameProcessor getProcessor(int i11);

    boolean hasProducedFrameWithTimestampZero();

    void initialize() throws VideoFrameProcessingException;

    void registerInput(@IntRange(from = 0) int i11) throws VideoFrameProcessingException;

    void release();

    void setOutputSurfaceInfo(@Nullable SurfaceInfo surfaceInfo);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @UnstableApi
    public interface Listener {
        default void onEnded(long j11) {
        }

        default void onError(VideoFrameProcessingException videoFrameProcessingException) {
        }

        default void onOutputFrameAvailableForRendering(long j11) {
        }

        default void onOutputFrameRateChanged(float f11) {
        }

        default void onOutputSizeChanged(int i11, int i12) {
        }
    }
}
