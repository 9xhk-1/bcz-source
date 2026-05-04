package androidx.media3.exoplayer;

import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class PlaybackInfo {
    private static final MediaSource.MediaPeriodId PLACEHOLDER_MEDIA_PERIOD_ID = new MediaSource.MediaPeriodId(new Object());
    public volatile long bufferedPositionUs;
    public final long discontinuityStartPositionUs;
    public final boolean isLoading;
    public final MediaSource.MediaPeriodId loadingMediaPeriodId;
    public final MediaSource.MediaPeriodId periodId;
    public final boolean playWhenReady;
    public final int playWhenReadyChangeReason;

    @Nullable
    public final ExoPlaybackException playbackError;
    public final PlaybackParameters playbackParameters;
    public final int playbackState;
    public final int playbackSuppressionReason;
    public volatile long positionUpdateTimeMs;
    public volatile long positionUs;
    public final long requestedContentPositionUs;
    public final boolean sleepingForOffload;
    public final List<Metadata> staticMetadata;
    public final Timeline timeline;
    public volatile long totalBufferedDurationUs;
    public final TrackGroupArray trackGroups;
    public final TrackSelectorResult trackSelectorResult;

    public PlaybackInfo(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j11, long j12, int i11, @Nullable ExoPlaybackException exoPlaybackException, boolean z11, TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult, List<Metadata> list, MediaSource.MediaPeriodId mediaPeriodId2, boolean z12, int i12, int i13, PlaybackParameters playbackParameters, long j13, long j14, long j15, long j16, boolean z13) {
        this.timeline = timeline;
        this.periodId = mediaPeriodId;
        this.requestedContentPositionUs = j11;
        this.discontinuityStartPositionUs = j12;
        this.playbackState = i11;
        this.playbackError = exoPlaybackException;
        this.isLoading = z11;
        this.trackGroups = trackGroupArray;
        this.trackSelectorResult = trackSelectorResult;
        this.staticMetadata = list;
        this.loadingMediaPeriodId = mediaPeriodId2;
        this.playWhenReady = z12;
        this.playWhenReadyChangeReason = i12;
        this.playbackSuppressionReason = i13;
        this.playbackParameters = playbackParameters;
        this.bufferedPositionUs = j13;
        this.totalBufferedDurationUs = j14;
        this.positionUs = j15;
        this.positionUpdateTimeMs = j16;
        this.sleepingForOffload = z13;
    }

    public static PlaybackInfo createDummy(TrackSelectorResult trackSelectorResult) {
        Timeline timeline = Timeline.EMPTY;
        MediaSource.MediaPeriodId mediaPeriodId = PLACEHOLDER_MEDIA_PERIOD_ID;
        return new PlaybackInfo(timeline, mediaPeriodId, C.TIME_UNSET, 0L, 1, null, false, TrackGroupArray.EMPTY, trackSelectorResult, ImmutableList.of(), mediaPeriodId, false, 1, 0, PlaybackParameters.DEFAULT, 0L, 0L, 0L, 0L, false);
    }

    public static MediaSource.MediaPeriodId getDummyPeriodForEmptyTimeline() {
        return PLACEHOLDER_MEDIA_PERIOD_ID;
    }

    @CheckResult
    public PlaybackInfo copyWithEstimatedPosition() {
        return new PlaybackInfo(this.timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, this.playbackState, this.playbackError, this.isLoading, this.trackGroups, this.trackSelectorResult, this.staticMetadata, this.loadingMediaPeriodId, this.playWhenReady, this.playWhenReadyChangeReason, this.playbackSuppressionReason, this.playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, getEstimatedPositionUs(), SystemClock.elapsedRealtime(), this.sleepingForOffload);
    }

    @CheckResult
    public PlaybackInfo copyWithIsLoading(boolean z11) {
        return new PlaybackInfo(this.timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, this.playbackState, this.playbackError, z11, this.trackGroups, this.trackSelectorResult, this.staticMetadata, this.loadingMediaPeriodId, this.playWhenReady, this.playWhenReadyChangeReason, this.playbackSuppressionReason, this.playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, this.positionUs, this.positionUpdateTimeMs, this.sleepingForOffload);
    }

    @CheckResult
    public PlaybackInfo copyWithLoadingMediaPeriodId(MediaSource.MediaPeriodId mediaPeriodId) {
        return new PlaybackInfo(this.timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, this.playbackState, this.playbackError, this.isLoading, this.trackGroups, this.trackSelectorResult, this.staticMetadata, mediaPeriodId, this.playWhenReady, this.playWhenReadyChangeReason, this.playbackSuppressionReason, this.playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, this.positionUs, this.positionUpdateTimeMs, this.sleepingForOffload);
    }

    @CheckResult
    public PlaybackInfo copyWithNewPosition(MediaSource.MediaPeriodId mediaPeriodId, long j11, long j12, long j13, long j14, TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult, List<Metadata> list) {
        return new PlaybackInfo(this.timeline, mediaPeriodId, j12, j13, this.playbackState, this.playbackError, this.isLoading, trackGroupArray, trackSelectorResult, list, this.loadingMediaPeriodId, this.playWhenReady, this.playWhenReadyChangeReason, this.playbackSuppressionReason, this.playbackParameters, this.bufferedPositionUs, j14, j11, SystemClock.elapsedRealtime(), this.sleepingForOffload);
    }

    @CheckResult
    public PlaybackInfo copyWithPlayWhenReady(boolean z11, int i11, int i12) {
        return new PlaybackInfo(this.timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, this.playbackState, this.playbackError, this.isLoading, this.trackGroups, this.trackSelectorResult, this.staticMetadata, this.loadingMediaPeriodId, z11, i11, i12, this.playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, this.positionUs, this.positionUpdateTimeMs, this.sleepingForOffload);
    }

    @CheckResult
    public PlaybackInfo copyWithPlaybackError(@Nullable ExoPlaybackException exoPlaybackException) {
        return new PlaybackInfo(this.timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, this.playbackState, exoPlaybackException, this.isLoading, this.trackGroups, this.trackSelectorResult, this.staticMetadata, this.loadingMediaPeriodId, this.playWhenReady, this.playWhenReadyChangeReason, this.playbackSuppressionReason, this.playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, this.positionUs, this.positionUpdateTimeMs, this.sleepingForOffload);
    }

    @CheckResult
    public PlaybackInfo copyWithPlaybackParameters(PlaybackParameters playbackParameters) {
        return new PlaybackInfo(this.timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, this.playbackState, this.playbackError, this.isLoading, this.trackGroups, this.trackSelectorResult, this.staticMetadata, this.loadingMediaPeriodId, this.playWhenReady, this.playWhenReadyChangeReason, this.playbackSuppressionReason, playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, this.positionUs, this.positionUpdateTimeMs, this.sleepingForOffload);
    }

    @CheckResult
    public PlaybackInfo copyWithPlaybackState(int i11) {
        return new PlaybackInfo(this.timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, i11, this.playbackError, this.isLoading, this.trackGroups, this.trackSelectorResult, this.staticMetadata, this.loadingMediaPeriodId, this.playWhenReady, this.playWhenReadyChangeReason, this.playbackSuppressionReason, this.playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, this.positionUs, this.positionUpdateTimeMs, this.sleepingForOffload);
    }

    @CheckResult
    public PlaybackInfo copyWithSleepingForOffload(boolean z11) {
        return new PlaybackInfo(this.timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, this.playbackState, this.playbackError, this.isLoading, this.trackGroups, this.trackSelectorResult, this.staticMetadata, this.loadingMediaPeriodId, this.playWhenReady, this.playWhenReadyChangeReason, this.playbackSuppressionReason, this.playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, this.positionUs, this.positionUpdateTimeMs, z11);
    }

    @CheckResult
    public PlaybackInfo copyWithTimeline(Timeline timeline) {
        return new PlaybackInfo(timeline, this.periodId, this.requestedContentPositionUs, this.discontinuityStartPositionUs, this.playbackState, this.playbackError, this.isLoading, this.trackGroups, this.trackSelectorResult, this.staticMetadata, this.loadingMediaPeriodId, this.playWhenReady, this.playWhenReadyChangeReason, this.playbackSuppressionReason, this.playbackParameters, this.bufferedPositionUs, this.totalBufferedDurationUs, this.positionUs, this.positionUpdateTimeMs, this.sleepingForOffload);
    }

    public long getEstimatedPositionUs() {
        long j11;
        long j12;
        if (!isPlaying()) {
            return this.positionUs;
        }
        do {
            j11 = this.positionUpdateTimeMs;
            j12 = this.positionUs;
        } while (j11 != this.positionUpdateTimeMs);
        return Util.msToUs(Util.usToMs(j12) + ((long) ((SystemClock.elapsedRealtime() - j11) * this.playbackParameters.speed)));
    }

    public boolean isPlaying() {
        return this.playbackState == 3 && this.playWhenReady && this.playbackSuppressionReason == 0;
    }

    public void updatePositionUs(long j11) {
        this.positionUs = j11;
        this.positionUpdateTimeMs = SystemClock.elapsedRealtime();
    }
}
