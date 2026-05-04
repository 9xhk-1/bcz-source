package androidx.media3.exoplayer;

import androidx.media3.common.Timeline;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface LoadControl {

    @Deprecated
    public static final MediaSource.MediaPeriodId EMPTY_MEDIA_PERIOD_ID = new MediaSource.MediaPeriodId(new Object());

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Parameters {
        public final long bufferedDurationUs;
        public final long lastRebufferRealtimeMs;
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final boolean playWhenReady;
        public final long playbackPositionUs;
        public final float playbackSpeed;
        public final PlayerId playerId;
        public final boolean rebuffering;
        public final long targetLiveOffsetUs;
        public final Timeline timeline;

        public Parameters(PlayerId playerId, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j11, long j12, float f11, boolean z11, boolean z12, long j13, long j14) {
            this.playerId = playerId;
            this.timeline = timeline;
            this.mediaPeriodId = mediaPeriodId;
            this.playbackPositionUs = j11;
            this.bufferedDurationUs = j12;
            this.playbackSpeed = f11;
            this.playWhenReady = z11;
            this.rebuffering = z12;
            this.targetLiveOffsetUs = j13;
            this.lastRebufferRealtimeMs = j14;
        }
    }

    Allocator getAllocator();

    default long getBackBufferDurationUs(PlayerId playerId) {
        return getBackBufferDurationUs();
    }

    default void onPrepared(PlayerId playerId) {
        onPrepared();
    }

    default void onReleased(PlayerId playerId) {
        onReleased();
    }

    default void onStopped(PlayerId playerId) {
        onStopped();
    }

    default void onTracksSelected(Parameters parameters, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    default boolean retainBackBufferFromKeyframe(PlayerId playerId) {
        return retainBackBufferFromKeyframe();
    }

    default boolean shouldContinueLoading(Parameters parameters) {
        return shouldContinueLoading(parameters.playbackPositionUs, parameters.bufferedDurationUs, parameters.playbackSpeed);
    }

    default boolean shouldContinuePreloading(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j11) {
        Log.w("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    default boolean shouldStartPlayback(Parameters parameters) {
        return shouldStartPlayback(parameters.timeline, parameters.mediaPeriodId, parameters.bufferedDurationUs, parameters.playbackSpeed, parameters.rebuffering, parameters.targetLiveOffsetUs);
    }

    @Deprecated
    default long getBackBufferDurationUs() {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    @Deprecated
    default void onPrepared() {
        throw new IllegalStateException("onPrepared not implemented");
    }

    @Deprecated
    default void onReleased() {
        throw new IllegalStateException("onReleased not implemented");
    }

    @Deprecated
    default void onStopped() {
        throw new IllegalStateException("onStopped not implemented");
    }

    @Deprecated
    default void onTracksSelected(PlayerId playerId, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        onTracksSelected(timeline, mediaPeriodId, rendererArr, trackGroupArray, exoTrackSelectionArr);
    }

    @Deprecated
    default boolean retainBackBufferFromKeyframe() {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    @Deprecated
    default boolean shouldContinueLoading(long j11, long j12, float f11) {
        throw new IllegalStateException("shouldContinueLoading not implemented");
    }

    @Deprecated
    default boolean shouldStartPlayback(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j11, float f11, boolean z11, long j12) {
        return shouldStartPlayback(j11, f11, z11, j12);
    }

    @Deprecated
    default void onTracksSelected(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        onTracksSelected(rendererArr, trackGroupArray, exoTrackSelectionArr);
    }

    @Deprecated
    default boolean shouldStartPlayback(long j11, float f11, boolean z11, long j12) {
        throw new IllegalStateException("shouldStartPlayback not implemented");
    }

    @Deprecated
    default void onTracksSelected(Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }
}
