package androidx.media3.exoplayer.analytics;

import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.PlaybackSessionManager;
import androidx.media3.exoplayer.analytics.PlaybackStats;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class PlaybackStatsListener implements AnalyticsListener, PlaybackSessionManager.Listener {

    @Nullable
    private Format audioFormat;
    private long bandwidthBytes;
    private long bandwidthTimeMs;

    @Nullable
    private final Callback callback;
    private long discontinuityFromPositionMs;

    @Nullable
    private String discontinuityFromSession;
    private int discontinuityReason;
    private int droppedFrames;
    private PlaybackStats finishedPlaybackStats;
    private final boolean keepHistory;

    @Nullable
    private Exception nonFatalException;
    private final Timeline.Period period;
    private final Map<String, PlaybackStatsTracker> playbackStatsTrackers;
    private final PlaybackSessionManager sessionManager;
    private final Map<String, AnalyticsListener.EventTime> sessionStartEventTimes;

    @Nullable
    private Format videoFormat;
    private VideoSize videoSize;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Callback {
        void onPlaybackStatsReady(AnalyticsListener.EventTime eventTime, PlaybackStats playbackStats);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class PlaybackStatsTracker {
        private long audioFormatBitrateTimeProduct;
        private final List<PlaybackStats.EventTimeAndFormat> audioFormatHistory;
        private long audioFormatTimeMs;
        private long audioUnderruns;
        private long bandwidthBytes;
        private long bandwidthTimeMs;

        @Nullable
        private Format currentAudioFormat;
        private float currentPlaybackSpeed;
        private int currentPlaybackState;
        private long currentPlaybackStateStartTimeMs;

        @Nullable
        private Format currentVideoFormat;
        private long droppedFrames;
        private int fatalErrorCount;
        private final List<PlaybackStats.EventTimeAndException> fatalErrorHistory;
        private long firstReportedTimeMs;
        private boolean hasBeenReady;
        private boolean hasEnded;
        private boolean hasFatalError;
        private long initialAudioFormatBitrate;
        private long initialVideoFormatBitrate;
        private int initialVideoFormatHeight;
        private final boolean isAd;
        private boolean isForeground;
        private boolean isInterruptedByAd;
        private boolean isJoinTimeInvalid;
        private boolean isSeeking;
        private final boolean keepHistory;
        private long lastAudioFormatStartTimeMs;
        private long lastRebufferStartTimeMs;
        private long lastVideoFormatStartTimeMs;
        private long maxRebufferTimeMs;
        private final List<long[]> mediaTimeHistory;
        private int nonFatalErrorCount;
        private final List<PlaybackStats.EventTimeAndException> nonFatalErrorHistory;
        private int pauseBufferCount;
        private int pauseCount;
        private final long[] playbackStateDurationsMs = new long[16];
        private final List<PlaybackStats.EventTimeAndPlaybackState> playbackStateHistory;
        private int rebufferCount;
        private int seekCount;
        private boolean startedLoading;
        private long videoFormatBitrateTimeMs;
        private long videoFormatBitrateTimeProduct;
        private long videoFormatHeightTimeMs;
        private long videoFormatHeightTimeProduct;
        private final List<PlaybackStats.EventTimeAndFormat> videoFormatHistory;

        public PlaybackStatsTracker(boolean z11, AnalyticsListener.EventTime eventTime) {
            this.keepHistory = z11;
            this.playbackStateHistory = z11 ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.mediaTimeHistory = z11 ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.videoFormatHistory = z11 ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.audioFormatHistory = z11 ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.fatalErrorHistory = z11 ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.nonFatalErrorHistory = z11 ? new ArrayList<>() : Collections.EMPTY_LIST;
            boolean z12 = false;
            this.currentPlaybackState = 0;
            this.currentPlaybackStateStartTimeMs = eventTime.realtimeMs;
            this.firstReportedTimeMs = C.TIME_UNSET;
            this.maxRebufferTimeMs = C.TIME_UNSET;
            MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
            if (mediaPeriodId != null && mediaPeriodId.isAd()) {
                z12 = true;
            }
            this.isAd = z12;
            this.initialAudioFormatBitrate = -1L;
            this.initialVideoFormatBitrate = -1L;
            this.initialVideoFormatHeight = -1;
            this.currentPlaybackSpeed = 1.0f;
        }

        private long[] guessMediaTimeBasedOnElapsedRealtime(long j11) {
            List<long[]> list = this.mediaTimeHistory;
            return new long[]{j11, list.get(list.size() - 1)[1] + ((long) ((j11 - r0[0]) * this.currentPlaybackSpeed))};
        }

        private static boolean isInvalidJoinTransition(int i11, int i12) {
            return ((i11 != 1 && i11 != 2 && i11 != 14) || i12 == 1 || i12 == 2 || i12 == 14 || i12 == 3 || i12 == 4 || i12 == 9 || i12 == 11) ? false : true;
        }

        private static boolean isPausedState(int i11) {
            return i11 == 4 || i11 == 7;
        }

        private static boolean isReadyState(int i11) {
            return i11 == 3 || i11 == 4 || i11 == 9;
        }

        private static boolean isRebufferingState(int i11) {
            return i11 == 6 || i11 == 7 || i11 == 10;
        }

        private void maybeRecordAudioFormatTime(long j11) {
            Format format;
            int i11;
            if (this.currentPlaybackState == 3 && (format = this.currentAudioFormat) != null && (i11 = format.bitrate) != -1) {
                long j12 = (long) ((j11 - this.lastAudioFormatStartTimeMs) * this.currentPlaybackSpeed);
                this.audioFormatTimeMs += j12;
                this.audioFormatBitrateTimeProduct += j12 * i11;
            }
            this.lastAudioFormatStartTimeMs = j11;
        }

        private void maybeRecordVideoFormatTime(long j11) {
            Format format;
            if (this.currentPlaybackState == 3 && (format = this.currentVideoFormat) != null) {
                long j12 = (long) ((j11 - this.lastVideoFormatStartTimeMs) * this.currentPlaybackSpeed);
                int i11 = format.height;
                if (i11 != -1) {
                    this.videoFormatHeightTimeMs += j12;
                    this.videoFormatHeightTimeProduct += i11 * j12;
                }
                int i12 = format.bitrate;
                if (i12 != -1) {
                    this.videoFormatBitrateTimeMs += j12;
                    this.videoFormatBitrateTimeProduct += j12 * i12;
                }
            }
            this.lastVideoFormatStartTimeMs = j11;
        }

        private void maybeUpdateAudioFormat(AnalyticsListener.EventTime eventTime, @Nullable Format format) {
            int i11;
            if (Objects.equals(this.currentAudioFormat, format)) {
                return;
            }
            maybeRecordAudioFormatTime(eventTime.realtimeMs);
            if (format != null && this.initialAudioFormatBitrate == -1 && (i11 = format.bitrate) != -1) {
                this.initialAudioFormatBitrate = i11;
            }
            this.currentAudioFormat = format;
            if (this.keepHistory) {
                this.audioFormatHistory.add(new PlaybackStats.EventTimeAndFormat(eventTime, format));
            }
        }

        private void maybeUpdateMaxRebufferTimeMs(long j11) {
            if (isRebufferingState(this.currentPlaybackState)) {
                long j12 = j11 - this.lastRebufferStartTimeMs;
                long j13 = this.maxRebufferTimeMs;
                if (j13 == C.TIME_UNSET || j12 > j13) {
                    this.maxRebufferTimeMs = j12;
                }
            }
        }

        private void maybeUpdateMediaTimeHistory(long j11, long j12) {
            if (this.keepHistory) {
                if (this.currentPlaybackState != 3) {
                    if (j12 == C.TIME_UNSET) {
                        return;
                    }
                    if (!this.mediaTimeHistory.isEmpty()) {
                        List<long[]> list = this.mediaTimeHistory;
                        long j13 = list.get(list.size() - 1)[1];
                        if (j13 != j12) {
                            this.mediaTimeHistory.add(new long[]{j11, j13});
                        }
                    }
                }
                if (j12 != C.TIME_UNSET) {
                    this.mediaTimeHistory.add(new long[]{j11, j12});
                } else {
                    if (this.mediaTimeHistory.isEmpty()) {
                        return;
                    }
                    this.mediaTimeHistory.add(guessMediaTimeBasedOnElapsedRealtime(j11));
                }
            }
        }

        private void maybeUpdateVideoFormat(AnalyticsListener.EventTime eventTime, @Nullable Format format) {
            int i11;
            int i12;
            if (Objects.equals(this.currentVideoFormat, format)) {
                return;
            }
            maybeRecordVideoFormatTime(eventTime.realtimeMs);
            if (format != null) {
                if (this.initialVideoFormatHeight == -1 && (i12 = format.height) != -1) {
                    this.initialVideoFormatHeight = i12;
                }
                if (this.initialVideoFormatBitrate == -1 && (i11 = format.bitrate) != -1) {
                    this.initialVideoFormatBitrate = i11;
                }
            }
            this.currentVideoFormat = format;
            if (this.keepHistory) {
                this.videoFormatHistory.add(new PlaybackStats.EventTimeAndFormat(eventTime, format));
            }
        }

        private int resolveNewPlaybackState(Player player) {
            int playbackState = player.getPlaybackState();
            if (this.isSeeking && this.isForeground) {
                return 5;
            }
            if (this.hasFatalError) {
                return 13;
            }
            if (!this.isForeground) {
                return this.startedLoading ? 1 : 0;
            }
            if (this.isInterruptedByAd) {
                return 14;
            }
            if (playbackState == 4) {
                return 11;
            }
            if (playbackState != 2) {
                if (playbackState == 3) {
                    if (player.getPlayWhenReady()) {
                        return player.getPlaybackSuppressionReason() != 0 ? 9 : 3;
                    }
                    return 4;
                }
                if (playbackState != 1 || this.currentPlaybackState == 0) {
                    return this.currentPlaybackState;
                }
                return 12;
            }
            int i11 = this.currentPlaybackState;
            if (i11 == 0 || i11 == 1 || i11 == 2 || i11 == 14) {
                return 2;
            }
            if (player.getPlayWhenReady()) {
                return player.getPlaybackSuppressionReason() != 0 ? 10 : 6;
            }
            return 7;
        }

        private void updatePlaybackState(int i11, AnalyticsListener.EventTime eventTime) {
            Assertions.checkArgument(eventTime.realtimeMs >= this.currentPlaybackStateStartTimeMs);
            long j11 = eventTime.realtimeMs;
            long j12 = j11 - this.currentPlaybackStateStartTimeMs;
            long[] jArr = this.playbackStateDurationsMs;
            int i12 = this.currentPlaybackState;
            jArr[i12] = jArr[i12] + j12;
            if (this.firstReportedTimeMs == C.TIME_UNSET) {
                this.firstReportedTimeMs = j11;
            }
            this.isJoinTimeInvalid |= isInvalidJoinTransition(i12, i11);
            this.hasBeenReady |= isReadyState(i11);
            this.hasEnded |= i11 == 11;
            if (!isPausedState(this.currentPlaybackState) && isPausedState(i11)) {
                this.pauseCount++;
            }
            if (i11 == 5) {
                this.seekCount++;
            }
            if (!isRebufferingState(this.currentPlaybackState) && isRebufferingState(i11)) {
                this.rebufferCount++;
                this.lastRebufferStartTimeMs = eventTime.realtimeMs;
            }
            if (isRebufferingState(this.currentPlaybackState) && this.currentPlaybackState != 7 && i11 == 7) {
                this.pauseBufferCount++;
            }
            maybeUpdateMaxRebufferTimeMs(eventTime.realtimeMs);
            this.currentPlaybackState = i11;
            this.currentPlaybackStateStartTimeMs = eventTime.realtimeMs;
            if (this.keepHistory) {
                this.playbackStateHistory.add(new PlaybackStats.EventTimeAndPlaybackState(eventTime, i11));
            }
        }

        public PlaybackStats build(boolean z11) {
            long[] jArr;
            List<long[]> list;
            long[] jArr2 = this.playbackStateDurationsMs;
            List<long[]> list2 = this.mediaTimeHistory;
            if (z11) {
                jArr = jArr2;
                list = list2;
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long[] copyOf = Arrays.copyOf(this.playbackStateDurationsMs, 16);
                long max = Math.max(0L, elapsedRealtime - this.currentPlaybackStateStartTimeMs);
                int i11 = this.currentPlaybackState;
                copyOf[i11] = copyOf[i11] + max;
                maybeUpdateMaxRebufferTimeMs(elapsedRealtime);
                maybeRecordVideoFormatTime(elapsedRealtime);
                maybeRecordAudioFormatTime(elapsedRealtime);
                ArrayList arrayList = new ArrayList(this.mediaTimeHistory);
                if (this.keepHistory && this.currentPlaybackState == 3) {
                    arrayList.add(guessMediaTimeBasedOnElapsedRealtime(elapsedRealtime));
                }
                jArr = copyOf;
                list = arrayList;
            }
            int i12 = (this.isJoinTimeInvalid || !this.hasBeenReady) ? 1 : 0;
            long j11 = i12 != 0 ? C.TIME_UNSET : jArr[2];
            int i13 = jArr[1] > 0 ? 1 : 0;
            List arrayList2 = z11 ? this.videoFormatHistory : new ArrayList(this.videoFormatHistory);
            List arrayList3 = z11 ? this.audioFormatHistory : new ArrayList(this.audioFormatHistory);
            List arrayList4 = z11 ? this.playbackStateHistory : new ArrayList(this.playbackStateHistory);
            long j12 = this.firstReportedTimeMs;
            boolean z12 = this.isForeground;
            int i14 = !this.hasBeenReady ? 1 : 0;
            boolean z13 = this.hasEnded;
            int i15 = i12 ^ 1;
            int i16 = this.pauseCount;
            int i17 = this.pauseBufferCount;
            int i18 = this.seekCount;
            int i19 = this.rebufferCount;
            long j13 = this.maxRebufferTimeMs;
            boolean z14 = this.isAd;
            long j14 = this.videoFormatHeightTimeMs;
            long j15 = this.videoFormatHeightTimeProduct;
            long j16 = this.videoFormatBitrateTimeMs;
            long j17 = this.videoFormatBitrateTimeProduct;
            long j18 = this.audioFormatTimeMs;
            long j19 = this.audioFormatBitrateTimeProduct;
            int i21 = this.initialVideoFormatHeight;
            int i22 = i21 == -1 ? 0 : 1;
            long j21 = this.initialVideoFormatBitrate;
            int i23 = j21 == -1 ? 0 : 1;
            long j22 = this.initialAudioFormatBitrate;
            int i24 = j22 == -1 ? 0 : 1;
            long j23 = this.bandwidthTimeMs;
            long j24 = this.bandwidthBytes;
            long j25 = this.droppedFrames;
            long j26 = this.audioUnderruns;
            int i25 = this.fatalErrorCount;
            return new PlaybackStats(1, jArr, arrayList4, list, j12, z12 ? 1 : 0, i14, z13 ? 1 : 0, i13, j11, i15, i16, i17, i18, i19, j13, z14 ? 1 : 0, arrayList2, arrayList3, j14, j15, j16, j17, j18, j19, i22, i23, i21, j21, i24, j22, j23, j24, j25, j26, i25 > 0 ? 1 : 0, i25, this.nonFatalErrorCount, this.fatalErrorHistory, this.nonFatalErrorHistory);
        }

        public void onEvents(Player player, AnalyticsListener.EventTime eventTime, boolean z11, long j11, boolean z12, int i11, boolean z13, boolean z14, @Nullable PlaybackException playbackException, @Nullable Exception exc, long j12, long j13, @Nullable Format format, @Nullable Format format2, @Nullable VideoSize videoSize) {
            long j14 = C.TIME_UNSET;
            if (j11 != C.TIME_UNSET) {
                maybeUpdateMediaTimeHistory(eventTime.realtimeMs, j11);
                this.isSeeking = true;
            }
            if (player.getPlaybackState() != 2) {
                this.isSeeking = false;
            }
            int playbackState = player.getPlaybackState();
            if (playbackState == 1 || playbackState == 4 || z12) {
                this.isInterruptedByAd = false;
            }
            if (playbackException != null) {
                this.hasFatalError = true;
                this.fatalErrorCount++;
                if (this.keepHistory) {
                    this.fatalErrorHistory.add(new PlaybackStats.EventTimeAndException(eventTime, playbackException));
                }
            } else if (player.getPlayerError() == null) {
                this.hasFatalError = false;
            }
            if (this.isForeground && !this.isInterruptedByAd) {
                Tracks currentTracks = player.getCurrentTracks();
                if (!currentTracks.isTypeSelected(2)) {
                    maybeUpdateVideoFormat(eventTime, null);
                }
                if (!currentTracks.isTypeSelected(1)) {
                    maybeUpdateAudioFormat(eventTime, null);
                }
            }
            if (format != null) {
                maybeUpdateVideoFormat(eventTime, format);
            }
            if (format2 != null) {
                maybeUpdateAudioFormat(eventTime, format2);
            }
            Format format3 = this.currentVideoFormat;
            if (format3 != null && format3.height == -1 && videoSize != null) {
                maybeUpdateVideoFormat(eventTime, format3.buildUpon().setWidth(videoSize.width).setHeight(videoSize.height).build());
            }
            if (z14) {
                this.startedLoading = true;
            }
            if (z13) {
                this.audioUnderruns++;
            }
            this.droppedFrames += i11;
            this.bandwidthTimeMs += j12;
            this.bandwidthBytes += j13;
            if (exc != null) {
                this.nonFatalErrorCount++;
                if (this.keepHistory) {
                    this.nonFatalErrorHistory.add(new PlaybackStats.EventTimeAndException(eventTime, exc));
                }
            }
            int resolveNewPlaybackState = resolveNewPlaybackState(player);
            float f11 = player.getPlaybackParameters().speed;
            if (this.currentPlaybackState != resolveNewPlaybackState || this.currentPlaybackSpeed != f11) {
                long j15 = eventTime.realtimeMs;
                if (z11) {
                    j14 = eventTime.eventPlaybackPositionMs;
                }
                maybeUpdateMediaTimeHistory(j15, j14);
                maybeRecordVideoFormatTime(eventTime.realtimeMs);
                maybeRecordAudioFormatTime(eventTime.realtimeMs);
            }
            this.currentPlaybackSpeed = f11;
            if (this.currentPlaybackState != resolveNewPlaybackState) {
                updatePlaybackState(resolveNewPlaybackState, eventTime);
            }
        }

        public void onFinished(AnalyticsListener.EventTime eventTime, boolean z11, long j11) {
            int i11 = 11;
            if (this.currentPlaybackState != 11 && !z11) {
                i11 = 15;
            }
            maybeUpdateMediaTimeHistory(eventTime.realtimeMs, j11);
            maybeRecordVideoFormatTime(eventTime.realtimeMs);
            maybeRecordAudioFormatTime(eventTime.realtimeMs);
            updatePlaybackState(i11, eventTime);
        }

        public void onForeground() {
            this.isForeground = true;
        }

        public void onInterruptedByAd() {
            this.isInterruptedByAd = true;
            this.isSeeking = false;
        }
    }

    public PlaybackStatsListener(boolean z11, @Nullable Callback callback) {
        this.callback = callback;
        this.keepHistory = z11;
        DefaultPlaybackSessionManager defaultPlaybackSessionManager = new DefaultPlaybackSessionManager();
        this.sessionManager = defaultPlaybackSessionManager;
        this.playbackStatsTrackers = new HashMap();
        this.sessionStartEventTimes = new HashMap();
        this.finishedPlaybackStats = PlaybackStats.EMPTY;
        this.period = new Timeline.Period();
        this.videoSize = VideoSize.UNKNOWN;
        defaultPlaybackSessionManager.setListener(this);
    }

    private Pair<AnalyticsListener.EventTime, Boolean> findBestEventTime(AnalyticsListener.Events events, String str) {
        MediaSource.MediaPeriodId mediaPeriodId;
        AnalyticsListener.EventTime eventTime = null;
        boolean z11 = false;
        for (int i11 = 0; i11 < events.size(); i11++) {
            AnalyticsListener.EventTime eventTime2 = events.getEventTime(events.get(i11));
            boolean belongsToSession = this.sessionManager.belongsToSession(eventTime2, str);
            if (eventTime == null || ((belongsToSession && !z11) || (belongsToSession == z11 && eventTime2.realtimeMs > eventTime.realtimeMs))) {
                eventTime = eventTime2;
                z11 = belongsToSession;
            }
        }
        Assertions.checkNotNull(eventTime);
        if (!z11 && (mediaPeriodId = eventTime.mediaPeriodId) != null && mediaPeriodId.isAd()) {
            long adGroupTimeUs = eventTime.timeline.getPeriodByUid(eventTime.mediaPeriodId.periodUid, this.period).getAdGroupTimeUs(eventTime.mediaPeriodId.adGroupIndex);
            if (adGroupTimeUs == Long.MIN_VALUE) {
                adGroupTimeUs = this.period.durationUs;
            }
            long positionInWindowUs = adGroupTimeUs + this.period.getPositionInWindowUs();
            long j11 = eventTime.realtimeMs;
            Timeline timeline = eventTime.timeline;
            int i12 = eventTime.windowIndex;
            MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
            AnalyticsListener.EventTime eventTime3 = new AnalyticsListener.EventTime(j11, timeline, i12, new MediaSource.MediaPeriodId(mediaPeriodId2.periodUid, mediaPeriodId2.windowSequenceNumber, mediaPeriodId2.adGroupIndex), Util.usToMs(positionInWindowUs), eventTime.timeline, eventTime.currentWindowIndex, eventTime.currentMediaPeriodId, eventTime.currentPlaybackPositionMs, eventTime.totalBufferedDurationMs);
            z11 = this.sessionManager.belongsToSession(eventTime3, str);
            eventTime = eventTime3;
        }
        return Pair.create(eventTime, Boolean.valueOf(z11));
    }

    private boolean hasEvent(AnalyticsListener.Events events, String str, int i11) {
        return events.contains(i11) && this.sessionManager.belongsToSession(events.getEventTime(i11), str);
    }

    private void maybeAddSessions(AnalyticsListener.Events events) {
        for (int i11 = 0; i11 < events.size(); i11++) {
            int i12 = events.get(i11);
            AnalyticsListener.EventTime eventTime = events.getEventTime(i12);
            if (i12 == 0) {
                this.sessionManager.updateSessionsWithTimelineChange(eventTime);
            } else if (i12 == 11) {
                this.sessionManager.updateSessionsWithDiscontinuity(eventTime, this.discontinuityReason);
            } else {
                this.sessionManager.updateSessions(eventTime);
            }
        }
    }

    public PlaybackStats getCombinedPlaybackStats() {
        int i11 = 1;
        PlaybackStats[] playbackStatsArr = new PlaybackStats[this.playbackStatsTrackers.size() + 1];
        playbackStatsArr[0] = this.finishedPlaybackStats;
        Iterator<PlaybackStatsTracker> it = this.playbackStatsTrackers.values().iterator();
        while (it.hasNext()) {
            playbackStatsArr[i11] = it.next().build(false);
            i11++;
        }
        return PlaybackStats.merge(playbackStatsArr);
    }

    @Nullable
    public PlaybackStats getPlaybackStats() {
        String activeSessionId = this.sessionManager.getActiveSessionId();
        PlaybackStatsTracker playbackStatsTracker = activeSessionId == null ? null : this.playbackStatsTrackers.get(activeSessionId);
        if (playbackStatsTracker == null) {
            return null;
        }
        return playbackStatsTracker.build(false);
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onAdPlaybackStarted(AnalyticsListener.EventTime eventTime, String str, String str2) {
        ((PlaybackStatsTracker) Assertions.checkNotNull(this.playbackStatsTrackers.get(str))).onInterruptedByAd();
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i11, long j11, long j12) {
        this.bandwidthTimeMs = i11;
        this.bandwidthBytes = j11;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        int i11 = mediaLoadData.trackType;
        if (i11 == 2 || i11 == 0) {
            this.videoFormat = mediaLoadData.trackFormat;
        } else if (i11 == 1) {
            this.audioFormat = mediaLoadData.trackFormat;
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception exc) {
        this.nonFatalException = exc;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int i11, long j11) {
        this.droppedFrames = i11;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onEvents(Player player, AnalyticsListener.Events events) {
        if (events.size() == 0) {
            return;
        }
        maybeAddSessions(events);
        Iterator<String> it = this.playbackStatsTrackers.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            Pair<AnalyticsListener.EventTime, Boolean> findBestEventTime = findBestEventTime(events, next);
            PlaybackStatsTracker playbackStatsTracker = this.playbackStatsTrackers.get(next);
            boolean hasEvent = hasEvent(events, next, 11);
            boolean hasEvent2 = hasEvent(events, next, 1018);
            boolean hasEvent3 = hasEvent(events, next, 1011);
            boolean hasEvent4 = hasEvent(events, next, 1000);
            boolean hasEvent5 = hasEvent(events, next, 10);
            boolean z11 = hasEvent(events, next, 1003) || hasEvent(events, next, 1024);
            boolean hasEvent6 = hasEvent(events, next, 1006);
            boolean hasEvent7 = hasEvent(events, next, 1004);
            boolean hasEvent8 = hasEvent(events, next, 25);
            Iterator<String> it2 = it;
            playbackStatsTracker.onEvents(player, (AnalyticsListener.EventTime) findBestEventTime.first, ((Boolean) findBestEventTime.second).booleanValue(), next.equals(this.discontinuityFromSession) ? this.discontinuityFromPositionMs : C.TIME_UNSET, hasEvent, hasEvent2 ? this.droppedFrames : 0, hasEvent3, hasEvent4, hasEvent5 ? player.getPlayerError() : null, z11 ? this.nonFatalException : null, hasEvent6 ? this.bandwidthTimeMs : 0L, hasEvent6 ? this.bandwidthBytes : 0L, hasEvent7 ? this.videoFormat : null, hasEvent7 ? this.audioFormat : null, hasEvent8 ? this.videoSize : null);
            it = it2;
        }
        this.videoFormat = null;
        this.audioFormat = null;
        this.discontinuityFromSession = null;
        if (events.contains(1028)) {
            this.sessionManager.finishAllSessions(events.getEventTime(1028));
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z11) {
        this.nonFatalException = iOException;
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i11) {
        if (this.discontinuityFromSession == null) {
            this.discontinuityFromSession = this.sessionManager.getActiveSessionId();
            this.discontinuityFromPositionMs = positionInfo.positionMs;
        }
        this.discontinuityReason = i11;
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onSessionActive(AnalyticsListener.EventTime eventTime, String str) {
        ((PlaybackStatsTracker) Assertions.checkNotNull(this.playbackStatsTrackers.get(str))).onForeground();
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onSessionCreated(AnalyticsListener.EventTime eventTime, String str) {
        this.playbackStatsTrackers.put(str, new PlaybackStatsTracker(this.keepHistory, eventTime));
        this.sessionStartEventTimes.put(str, eventTime);
    }

    @Override // androidx.media3.exoplayer.analytics.PlaybackSessionManager.Listener
    public void onSessionFinished(AnalyticsListener.EventTime eventTime, String str, boolean z11) {
        PlaybackStatsTracker playbackStatsTracker = (PlaybackStatsTracker) Assertions.checkNotNull(this.playbackStatsTrackers.remove(str));
        AnalyticsListener.EventTime eventTime2 = (AnalyticsListener.EventTime) Assertions.checkNotNull(this.sessionStartEventTimes.remove(str));
        playbackStatsTracker.onFinished(eventTime, z11, str.equals(this.discontinuityFromSession) ? this.discontinuityFromPositionMs : C.TIME_UNSET);
        PlaybackStats build = playbackStatsTracker.build(true);
        this.finishedPlaybackStats = PlaybackStats.merge(this.finishedPlaybackStats, build);
        Callback callback = this.callback;
        if (callback != null) {
            callback.onPlaybackStatsReady(eventTime2, build);
        }
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsListener
    public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
        this.videoSize = videoSize;
    }
}
