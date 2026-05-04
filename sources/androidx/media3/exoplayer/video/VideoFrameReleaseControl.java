package androidx.media3.exoplayer.video;

import android.content.Context;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class VideoFrameReleaseControl {
    public static final int FRAME_RELEASE_DROP = 2;
    public static final int FRAME_RELEASE_IGNORE = 4;
    public static final int FRAME_RELEASE_IMMEDIATELY = 0;
    public static final int FRAME_RELEASE_SCHEDULED = 1;
    public static final int FRAME_RELEASE_SKIP = 3;
    public static final int FRAME_RELEASE_TRY_AGAIN_LATER = 5;
    private static final long MAX_EARLY_US_THRESHOLD = 50000;
    private final long allowedJoiningTimeMs;
    private boolean frameReadyWithoutSurface;
    private final VideoFrameReleaseHelper frameReleaseHelper;
    private final FrameTimingEvaluator frameTimingEvaluator;
    private boolean hasOutputSurface;
    private boolean joiningRenderNextFrameImmediately;
    private long lastReleaseRealtimeUs;
    private boolean started;
    private int firstFrameState = 0;
    private long initialPositionUs = C.TIME_UNSET;
    private long lastPresentationTimeUs = C.TIME_UNSET;
    private long joiningDeadlineMs = C.TIME_UNSET;
    private float playbackSpeed = 1.0f;
    private Clock clock = Clock.DEFAULT;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    public @interface FrameReleaseAction {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class FrameReleaseInfo {
        private long earlyUs = C.TIME_UNSET;
        private long releaseTimeNs = C.TIME_UNSET;

        /* JADX INFO: Access modifiers changed from: private */
        public void reset() {
            this.earlyUs = C.TIME_UNSET;
            this.releaseTimeNs = C.TIME_UNSET;
        }

        public long getEarlyUs() {
            return this.earlyUs;
        }

        public long getReleaseTimeNs() {
            return this.releaseTimeNs;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface FrameTimingEvaluator {
        boolean shouldDropFrame(long j11, long j12, boolean z11);

        boolean shouldForceReleaseFrame(long j11, long j12);

        boolean shouldIgnoreFrame(long j11, long j12, long j13, boolean z11, boolean z12) throws ExoPlaybackException;
    }

    public VideoFrameReleaseControl(Context context, FrameTimingEvaluator frameTimingEvaluator, long j11) {
        this.frameTimingEvaluator = frameTimingEvaluator;
        this.allowedJoiningTimeMs = j11;
        this.frameReleaseHelper = new VideoFrameReleaseHelper(context);
    }

    private long calculateEarlyTimeUs(long j11, long j12, long j13) {
        long j14 = (long) ((j13 - j11) / this.playbackSpeed);
        return this.started ? j14 - (Util.msToUs(this.clock.elapsedRealtime()) - j12) : j14;
    }

    private void lowerFirstFrameState(int i11) {
        this.firstFrameState = Math.min(this.firstFrameState, i11);
    }

    private boolean shouldForceRelease(long j11, long j12, long j13) {
        if (this.joiningDeadlineMs != C.TIME_UNSET && !this.joiningRenderNextFrameImmediately) {
            return false;
        }
        int i11 = this.firstFrameState;
        if (i11 == 0) {
            return this.started;
        }
        if (i11 == 1) {
            return true;
        }
        if (i11 == 2) {
            return j11 >= j13;
        }
        if (i11 == 3) {
            return this.started && this.frameTimingEvaluator.shouldForceReleaseFrame(j12, Util.msToUs(this.clock.elapsedRealtime()) - this.lastReleaseRealtimeUs);
        }
        throw new IllegalStateException();
    }

    public void allowReleaseFirstFrameBeforeStarted() {
        if (this.firstFrameState == 0) {
            this.firstFrameState = 1;
        }
    }

    public int getFrameReleaseAction(long j11, long j12, long j13, long j14, boolean z11, boolean z12, FrameReleaseInfo frameReleaseInfo) throws ExoPlaybackException {
        frameReleaseInfo.reset();
        if (this.initialPositionUs == C.TIME_UNSET) {
            this.initialPositionUs = j12;
        }
        if (this.lastPresentationTimeUs != j11) {
            this.frameReleaseHelper.onNextFrame(j11);
            this.lastPresentationTimeUs = j11;
        }
        frameReleaseInfo.earlyUs = calculateEarlyTimeUs(j12, j13, j11);
        if (z11 && !z12) {
            return 3;
        }
        if (!this.hasOutputSurface) {
            this.frameReadyWithoutSurface = true;
            if (this.frameTimingEvaluator.shouldIgnoreFrame(frameReleaseInfo.earlyUs, j12, j13, z12, true)) {
                return 4;
            }
            return (!this.started || frameReleaseInfo.earlyUs >= 30000) ? 5 : 3;
        }
        if (shouldForceRelease(j12, frameReleaseInfo.earlyUs, j14)) {
            return 0;
        }
        if (!this.started || j12 == this.initialPositionUs) {
            return 5;
        }
        long nanoTime = this.clock.nanoTime();
        frameReleaseInfo.releaseTimeNs = this.frameReleaseHelper.adjustReleaseTime((frameReleaseInfo.earlyUs * 1000) + nanoTime);
        frameReleaseInfo.earlyUs = (frameReleaseInfo.releaseTimeNs - nanoTime) / 1000;
        boolean z13 = (this.joiningDeadlineMs == C.TIME_UNSET || this.joiningRenderNextFrameImmediately) ? false : true;
        if (this.frameTimingEvaluator.shouldIgnoreFrame(frameReleaseInfo.earlyUs, j12, j13, z12, z13)) {
            return 4;
        }
        return this.frameTimingEvaluator.shouldDropFrame(frameReleaseInfo.earlyUs, j13, z12) ? z13 ? 3 : 2 : frameReleaseInfo.earlyUs > MAX_EARLY_US_THRESHOLD ? 5 : 1;
    }

    public boolean isReady(boolean z11) {
        if (z11 && (this.firstFrameState == 3 || (!this.hasOutputSurface && this.frameReadyWithoutSurface))) {
            this.joiningDeadlineMs = C.TIME_UNSET;
            return true;
        }
        if (this.joiningDeadlineMs == C.TIME_UNSET) {
            return false;
        }
        if (this.clock.elapsedRealtime() < this.joiningDeadlineMs) {
            return true;
        }
        this.joiningDeadlineMs = C.TIME_UNSET;
        return false;
    }

    public void join(boolean z11) {
        this.joiningRenderNextFrameImmediately = z11;
        this.joiningDeadlineMs = this.allowedJoiningTimeMs > 0 ? this.clock.elapsedRealtime() + this.allowedJoiningTimeMs : C.TIME_UNSET;
    }

    public void onDisabled() {
        lowerFirstFrameState(0);
    }

    public void onEnabled(boolean z11) {
        this.firstFrameState = z11 ? 1 : 0;
    }

    public boolean onFrameReleasedIsFirstFrame() {
        boolean z11 = this.firstFrameState != 3;
        this.firstFrameState = 3;
        this.lastReleaseRealtimeUs = Util.msToUs(this.clock.elapsedRealtime());
        return z11;
    }

    public void onProcessedStreamChange() {
        lowerFirstFrameState(2);
    }

    public void onStarted() {
        this.started = true;
        this.lastReleaseRealtimeUs = Util.msToUs(this.clock.elapsedRealtime());
        this.frameReleaseHelper.onStarted();
    }

    public void onStopped() {
        this.started = false;
        this.joiningDeadlineMs = C.TIME_UNSET;
        this.frameReleaseHelper.onStopped();
    }

    public void reset() {
        this.frameReleaseHelper.onPositionReset();
        this.lastPresentationTimeUs = C.TIME_UNSET;
        this.initialPositionUs = C.TIME_UNSET;
        lowerFirstFrameState(1);
        this.joiningDeadlineMs = C.TIME_UNSET;
    }

    public void setChangeFrameRateStrategy(int i11) {
        this.frameReleaseHelper.setChangeFrameRateStrategy(i11);
    }

    public void setClock(Clock clock) {
        this.clock = clock;
    }

    public void setFrameRate(float f11) {
        this.frameReleaseHelper.onFormatChanged(f11);
    }

    public void setOutputSurface(@Nullable Surface surface) {
        this.hasOutputSurface = surface != null;
        this.frameReadyWithoutSurface = false;
        this.frameReleaseHelper.onSurfaceChanged(surface);
        lowerFirstFrameState(1);
    }

    public void setPlaybackSpeed(@FloatRange(from = 0.0d, fromInclusive = false) float f11) {
        Assertions.checkArgument(f11 > 0.0f);
        if (f11 == this.playbackSpeed) {
            return;
        }
        this.playbackSpeed = f11;
        this.frameReleaseHelper.onPlaybackSpeed(f11);
    }
}
