package androidx.media3.exoplayer.analytics;

import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.baicizhan.main.vld.bonding.DeviceBondingActivityKt;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class PlaybackStats {
    public static final PlaybackStats EMPTY = merge(new PlaybackStats[0]);
    public static final int PLAYBACK_STATE_ABANDONED = 15;
    public static final int PLAYBACK_STATE_BUFFERING = 6;
    static final int PLAYBACK_STATE_COUNT = 16;
    public static final int PLAYBACK_STATE_ENDED = 11;
    public static final int PLAYBACK_STATE_FAILED = 13;
    public static final int PLAYBACK_STATE_INTERRUPTED_BY_AD = 14;
    public static final int PLAYBACK_STATE_JOINING_BACKGROUND = 1;
    public static final int PLAYBACK_STATE_JOINING_FOREGROUND = 2;
    public static final int PLAYBACK_STATE_NOT_STARTED = 0;
    public static final int PLAYBACK_STATE_PAUSED = 4;
    public static final int PLAYBACK_STATE_PAUSED_BUFFERING = 7;
    public static final int PLAYBACK_STATE_PLAYING = 3;
    public static final int PLAYBACK_STATE_SEEKING = 5;
    public static final int PLAYBACK_STATE_STOPPED = 12;
    public static final int PLAYBACK_STATE_SUPPRESSED = 9;
    public static final int PLAYBACK_STATE_SUPPRESSED_BUFFERING = 10;
    public final int abandonedBeforeReadyCount;
    public final int adPlaybackCount;
    public final List<EventTimeAndFormat> audioFormatHistory;
    public final int backgroundJoiningCount;
    public final int endedCount;
    public final int fatalErrorCount;
    public final List<EventTimeAndException> fatalErrorHistory;
    public final int fatalErrorPlaybackCount;
    public final long firstReportedTimeMs;
    public final int foregroundPlaybackCount;
    public final int initialAudioFormatBitrateCount;
    public final int initialVideoFormatBitrateCount;
    public final int initialVideoFormatHeightCount;
    public final long maxRebufferTimeMs;
    public final List<long[]> mediaTimeHistory;
    public final int nonFatalErrorCount;
    public final List<EventTimeAndException> nonFatalErrorHistory;
    public final int playbackCount;
    private final long[] playbackStateDurationsMs;
    public final List<EventTimeAndPlaybackState> playbackStateHistory;
    public final long totalAudioFormatBitrateTimeProduct;
    public final long totalAudioFormatTimeMs;
    public final long totalAudioUnderruns;
    public final long totalBandwidthBytes;
    public final long totalBandwidthTimeMs;
    public final long totalDroppedFrames;
    public final long totalInitialAudioFormatBitrate;
    public final long totalInitialVideoFormatBitrate;
    public final int totalInitialVideoFormatHeight;
    public final int totalPauseBufferCount;
    public final int totalPauseCount;
    public final int totalRebufferCount;
    public final int totalSeekCount;
    public final long totalValidJoinTimeMs;
    public final long totalVideoFormatBitrateTimeMs;
    public final long totalVideoFormatBitrateTimeProduct;
    public final long totalVideoFormatHeightTimeMs;
    public final long totalVideoFormatHeightTimeProduct;
    public final int validJoinTimeCount;
    public final List<EventTimeAndFormat> videoFormatHistory;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class EventTimeAndException {
        public final AnalyticsListener.EventTime eventTime;
        public final Exception exception;

        public EventTimeAndException(AnalyticsListener.EventTime eventTime, Exception exc) {
            this.eventTime = eventTime;
            this.exception = exc;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTimeAndException.class != obj.getClass()) {
                return false;
            }
            EventTimeAndException eventTimeAndException = (EventTimeAndException) obj;
            if (this.eventTime.equals(eventTimeAndException.eventTime)) {
                return this.exception.equals(eventTimeAndException.exception);
            }
            return false;
        }

        public int hashCode() {
            return (this.eventTime.hashCode() * 31) + this.exception.hashCode();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class EventTimeAndFormat {
        public final AnalyticsListener.EventTime eventTime;

        @Nullable
        public final Format format;

        public EventTimeAndFormat(AnalyticsListener.EventTime eventTime, @Nullable Format format) {
            this.eventTime = eventTime;
            this.format = format;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && EventTimeAndFormat.class == obj.getClass()) {
                EventTimeAndFormat eventTimeAndFormat = (EventTimeAndFormat) obj;
                if (!this.eventTime.equals(eventTimeAndFormat.eventTime)) {
                    return false;
                }
                Format format = this.format;
                Format format2 = eventTimeAndFormat.format;
                if (format != null) {
                    return format.equals(format2);
                }
                if (format2 == null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.eventTime.hashCode() * 31;
            Format format = this.format;
            return hashCode + (format != null ? format.hashCode() : 0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class EventTimeAndPlaybackState {
        public final AnalyticsListener.EventTime eventTime;
        public final int playbackState;

        public EventTimeAndPlaybackState(AnalyticsListener.EventTime eventTime, int i11) {
            this.eventTime = eventTime;
            this.playbackState = i11;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTimeAndPlaybackState.class != obj.getClass()) {
                return false;
            }
            EventTimeAndPlaybackState eventTimeAndPlaybackState = (EventTimeAndPlaybackState) obj;
            if (this.playbackState != eventTimeAndPlaybackState.playbackState) {
                return false;
            }
            return this.eventTime.equals(eventTimeAndPlaybackState.eventTime);
        }

        public int hashCode() {
            return (this.eventTime.hashCode() * 31) + this.playbackState;
        }
    }

    public PlaybackStats(int i11, long[] jArr, List<EventTimeAndPlaybackState> list, List<long[]> list2, long j11, int i12, int i13, int i14, int i15, long j12, int i16, int i17, int i18, int i19, int i21, long j13, int i22, List<EventTimeAndFormat> list3, List<EventTimeAndFormat> list4, long j14, long j15, long j16, long j17, long j18, long j19, int i23, int i24, int i25, long j21, int i26, long j22, long j23, long j24, long j25, long j26, int i27, int i28, int i29, List<EventTimeAndException> list5, List<EventTimeAndException> list6) {
        this.playbackCount = i11;
        this.playbackStateDurationsMs = jArr;
        this.playbackStateHistory = Collections.unmodifiableList(list);
        this.mediaTimeHistory = Collections.unmodifiableList(list2);
        this.firstReportedTimeMs = j11;
        this.foregroundPlaybackCount = i12;
        this.abandonedBeforeReadyCount = i13;
        this.endedCount = i14;
        this.backgroundJoiningCount = i15;
        this.totalValidJoinTimeMs = j12;
        this.validJoinTimeCount = i16;
        this.totalPauseCount = i17;
        this.totalPauseBufferCount = i18;
        this.totalSeekCount = i19;
        this.totalRebufferCount = i21;
        this.maxRebufferTimeMs = j13;
        this.adPlaybackCount = i22;
        this.videoFormatHistory = Collections.unmodifiableList(list3);
        this.audioFormatHistory = Collections.unmodifiableList(list4);
        this.totalVideoFormatHeightTimeMs = j14;
        this.totalVideoFormatHeightTimeProduct = j15;
        this.totalVideoFormatBitrateTimeMs = j16;
        this.totalVideoFormatBitrateTimeProduct = j17;
        this.totalAudioFormatTimeMs = j18;
        this.totalAudioFormatBitrateTimeProduct = j19;
        this.initialVideoFormatHeightCount = i23;
        this.initialVideoFormatBitrateCount = i24;
        this.totalInitialVideoFormatHeight = i25;
        this.totalInitialVideoFormatBitrate = j21;
        this.initialAudioFormatBitrateCount = i26;
        this.totalInitialAudioFormatBitrate = j22;
        this.totalBandwidthTimeMs = j23;
        this.totalBandwidthBytes = j24;
        this.totalDroppedFrames = j25;
        this.totalAudioUnderruns = j26;
        this.fatalErrorPlaybackCount = i27;
        this.fatalErrorCount = i28;
        this.nonFatalErrorCount = i29;
        this.fatalErrorHistory = Collections.unmodifiableList(list5);
        this.nonFatalErrorHistory = Collections.unmodifiableList(list6);
    }

    public static PlaybackStats merge(PlaybackStats... playbackStatsArr) {
        int i11;
        PlaybackStats[] playbackStatsArr2 = playbackStatsArr;
        long[] jArr = new long[16];
        int length = playbackStatsArr2.length;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        long j21 = 0;
        long j22 = -1;
        long j23 = -1;
        long j24 = C.TIME_UNSET;
        long j25 = C.TIME_UNSET;
        long j26 = C.TIME_UNSET;
        int i27 = -1;
        int i28 = 0;
        int i29 = 0;
        int i31 = 0;
        int i32 = 0;
        while (i28 < length) {
            PlaybackStats playbackStats = playbackStatsArr2[i28];
            i12 += playbackStats.playbackCount;
            for (int i33 = 0; i33 < 16; i33++) {
                jArr[i33] = jArr[i33] + playbackStats.playbackStateDurationsMs[i33];
            }
            if (j25 == C.TIME_UNSET) {
                j25 = playbackStats.firstReportedTimeMs;
            } else {
                long j27 = playbackStats.firstReportedTimeMs;
                if (j27 != C.TIME_UNSET) {
                    j25 = Math.min(j25, j27);
                }
            }
            i29 += playbackStats.foregroundPlaybackCount;
            i31 += playbackStats.abandonedBeforeReadyCount;
            i32 += playbackStats.endedCount;
            i13 += playbackStats.backgroundJoiningCount;
            if (j26 == C.TIME_UNSET) {
                j26 = playbackStats.totalValidJoinTimeMs;
            } else {
                long j28 = playbackStats.totalValidJoinTimeMs;
                if (j28 != C.TIME_UNSET) {
                    j26 += j28;
                }
            }
            i14 += playbackStats.validJoinTimeCount;
            i15 += playbackStats.totalPauseCount;
            i16 += playbackStats.totalPauseBufferCount;
            i17 += playbackStats.totalSeekCount;
            i18 += playbackStats.totalRebufferCount;
            if (j24 == C.TIME_UNSET) {
                j24 = playbackStats.maxRebufferTimeMs;
            } else {
                long j29 = playbackStats.maxRebufferTimeMs;
                if (j29 != C.TIME_UNSET) {
                    j24 = Math.max(j24, j29);
                }
            }
            i19 += playbackStats.adPlaybackCount;
            j11 += playbackStats.totalVideoFormatHeightTimeMs;
            j12 += playbackStats.totalVideoFormatHeightTimeProduct;
            j13 += playbackStats.totalVideoFormatBitrateTimeMs;
            j14 += playbackStats.totalVideoFormatBitrateTimeProduct;
            j15 += playbackStats.totalAudioFormatTimeMs;
            j16 += playbackStats.totalAudioFormatBitrateTimeProduct;
            i21 += playbackStats.initialVideoFormatHeightCount;
            i22 += playbackStats.initialVideoFormatBitrateCount;
            int i34 = i27;
            if (i34 == -1) {
                i27 = playbackStats.totalInitialVideoFormatHeight;
            } else {
                i27 = i34;
                int i35 = playbackStats.totalInitialVideoFormatHeight;
                if (i35 != -1) {
                    i27 += i35;
                }
            }
            if (j22 == -1) {
                i11 = length;
                j22 = playbackStats.totalInitialVideoFormatBitrate;
            } else {
                i11 = length;
                long j31 = playbackStats.totalInitialVideoFormatBitrate;
                if (j31 != -1) {
                    j22 += j31;
                }
            }
            i23 += playbackStats.initialAudioFormatBitrateCount;
            if (j23 == -1) {
                j23 = playbackStats.totalInitialAudioFormatBitrate;
            } else {
                long j32 = playbackStats.totalInitialAudioFormatBitrate;
                if (j32 != -1) {
                    j23 += j32;
                }
            }
            j17 += playbackStats.totalBandwidthTimeMs;
            j18 += playbackStats.totalBandwidthBytes;
            j19 += playbackStats.totalDroppedFrames;
            j21 += playbackStats.totalAudioUnderruns;
            i24 += playbackStats.fatalErrorPlaybackCount;
            i25 += playbackStats.fatalErrorCount;
            i26 += playbackStats.nonFatalErrorCount;
            i28++;
            length = i11;
            playbackStatsArr2 = playbackStatsArr;
        }
        long j33 = j25;
        long j34 = j24;
        List list = Collections.EMPTY_LIST;
        return new PlaybackStats(i12, jArr, list, list, j33, i29, i31, i32, i13, j26, i14, i15, i16, i17, i18, j34, i19, list, list, j11, j12, j13, j14, j15, j16, i21, i22, i27, j22, i23, j23, j17, j18, j19, j21, i24, i25, i26, list, list);
    }

    public float getAbandonedBeforeReadyRatio() {
        int i11 = this.abandonedBeforeReadyCount;
        int i12 = this.playbackCount;
        int i13 = this.foregroundPlaybackCount;
        int i14 = i11 - (i12 - i13);
        if (i13 == 0) {
            return 0.0f;
        }
        return i14 / i13;
    }

    public float getAudioUnderrunRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.totalAudioUnderruns * 1000.0f) / totalPlayTimeMs;
    }

    public float getDroppedFramesRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.totalDroppedFrames * 1000.0f) / totalPlayTimeMs;
    }

    public float getEndedRatio() {
        int i11 = this.foregroundPlaybackCount;
        if (i11 == 0) {
            return 0.0f;
        }
        return this.endedCount / i11;
    }

    public float getFatalErrorRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.fatalErrorCount * 1000.0f) / totalPlayTimeMs;
    }

    public float getFatalErrorRatio() {
        int i11 = this.foregroundPlaybackCount;
        if (i11 == 0) {
            return 0.0f;
        }
        return this.fatalErrorPlaybackCount / i11;
    }

    public float getJoinTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return getTotalJoinTimeMs() / totalPlayAndWaitTimeMs;
    }

    public int getMeanAudioFormatBitrate() {
        long j11 = this.totalAudioFormatTimeMs;
        if (j11 == 0) {
            return -1;
        }
        return (int) (this.totalAudioFormatBitrateTimeProduct / j11);
    }

    public int getMeanBandwidth() {
        long j11 = this.totalBandwidthTimeMs;
        if (j11 == 0) {
            return -1;
        }
        return (int) ((this.totalBandwidthBytes * DeviceBondingActivityKt.f25227b) / j11);
    }

    public long getMeanElapsedTimeMs() {
        return this.playbackCount == 0 ? C.TIME_UNSET : getTotalElapsedTimeMs() / this.playbackCount;
    }

    public int getMeanInitialAudioFormatBitrate() {
        int i11 = this.initialAudioFormatBitrateCount;
        if (i11 == 0) {
            return -1;
        }
        return (int) (this.totalInitialAudioFormatBitrate / i11);
    }

    public int getMeanInitialVideoFormatBitrate() {
        int i11 = this.initialVideoFormatBitrateCount;
        if (i11 == 0) {
            return -1;
        }
        return (int) (this.totalInitialVideoFormatBitrate / i11);
    }

    public int getMeanInitialVideoFormatHeight() {
        int i11 = this.initialVideoFormatHeightCount;
        if (i11 == 0) {
            return -1;
        }
        return this.totalInitialVideoFormatHeight / i11;
    }

    public long getMeanJoinTimeMs() {
        int i11 = this.validJoinTimeCount;
        return i11 == 0 ? C.TIME_UNSET : this.totalValidJoinTimeMs / i11;
    }

    public float getMeanNonFatalErrorCount() {
        int i11 = this.foregroundPlaybackCount;
        if (i11 == 0) {
            return 0.0f;
        }
        return this.nonFatalErrorCount / i11;
    }

    public float getMeanPauseBufferCount() {
        int i11 = this.foregroundPlaybackCount;
        if (i11 == 0) {
            return 0.0f;
        }
        return this.totalPauseBufferCount / i11;
    }

    public float getMeanPauseCount() {
        int i11 = this.foregroundPlaybackCount;
        if (i11 == 0) {
            return 0.0f;
        }
        return this.totalPauseCount / i11;
    }

    public long getMeanPausedTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalPausedTimeMs() / this.foregroundPlaybackCount;
    }

    public long getMeanPlayAndWaitTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalPlayAndWaitTimeMs() / this.foregroundPlaybackCount;
    }

    public long getMeanPlayTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalPlayTimeMs() / this.foregroundPlaybackCount;
    }

    public float getMeanRebufferCount() {
        int i11 = this.foregroundPlaybackCount;
        if (i11 == 0) {
            return 0.0f;
        }
        return this.totalRebufferCount / i11;
    }

    public long getMeanRebufferTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalRebufferTimeMs() / this.foregroundPlaybackCount;
    }

    public float getMeanSeekCount() {
        int i11 = this.foregroundPlaybackCount;
        if (i11 == 0) {
            return 0.0f;
        }
        return this.totalSeekCount / i11;
    }

    public long getMeanSeekTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalSeekTimeMs() / this.foregroundPlaybackCount;
    }

    public long getMeanSingleRebufferTimeMs() {
        return this.totalRebufferCount == 0 ? C.TIME_UNSET : (getPlaybackStateDurationMs(6) + getPlaybackStateDurationMs(7)) / this.totalRebufferCount;
    }

    public long getMeanSingleSeekTimeMs() {
        return this.totalSeekCount == 0 ? C.TIME_UNSET : getTotalSeekTimeMs() / this.totalSeekCount;
    }

    public float getMeanTimeBetweenFatalErrors() {
        return 1.0f / getFatalErrorRate();
    }

    public float getMeanTimeBetweenNonFatalErrors() {
        return 1.0f / getNonFatalErrorRate();
    }

    public float getMeanTimeBetweenRebuffers() {
        return 1.0f / getRebufferRate();
    }

    public int getMeanVideoFormatBitrate() {
        long j11 = this.totalVideoFormatBitrateTimeMs;
        if (j11 == 0) {
            return -1;
        }
        return (int) (this.totalVideoFormatBitrateTimeProduct / j11);
    }

    public int getMeanVideoFormatHeight() {
        long j11 = this.totalVideoFormatHeightTimeMs;
        if (j11 == 0) {
            return -1;
        }
        return (int) (this.totalVideoFormatHeightTimeProduct / j11);
    }

    public long getMeanWaitTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalWaitTimeMs() / this.foregroundPlaybackCount;
    }

    public long getMediaTimeMsAtRealtimeMs(long j11) {
        if (this.mediaTimeHistory.isEmpty()) {
            return C.TIME_UNSET;
        }
        int i11 = 0;
        while (i11 < this.mediaTimeHistory.size() && this.mediaTimeHistory.get(i11)[0] <= j11) {
            i11++;
        }
        if (i11 == 0) {
            return this.mediaTimeHistory.get(0)[1];
        }
        if (i11 == this.mediaTimeHistory.size()) {
            List<long[]> list = this.mediaTimeHistory;
            return list.get(list.size() - 1)[1];
        }
        int i12 = i11 - 1;
        long j12 = this.mediaTimeHistory.get(i12)[0];
        long j13 = this.mediaTimeHistory.get(i12)[1];
        long j14 = this.mediaTimeHistory.get(i11)[0];
        long j15 = this.mediaTimeHistory.get(i11)[1];
        long j16 = j14 - j12;
        if (j16 == 0) {
            return j13;
        }
        return j13 + ((long) ((j15 - j13) * ((j11 - j12) / j16)));
    }

    public float getNonFatalErrorRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.nonFatalErrorCount * 1000.0f) / totalPlayTimeMs;
    }

    public int getPlaybackStateAtTime(long j11) {
        int i11 = 0;
        for (EventTimeAndPlaybackState eventTimeAndPlaybackState : this.playbackStateHistory) {
            if (eventTimeAndPlaybackState.eventTime.realtimeMs > j11) {
                break;
            }
            i11 = eventTimeAndPlaybackState.playbackState;
        }
        return i11;
    }

    public long getPlaybackStateDurationMs(int i11) {
        return this.playbackStateDurationsMs[i11];
    }

    public float getRebufferRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.totalRebufferCount * 1000.0f) / totalPlayTimeMs;
    }

    public float getRebufferTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return getTotalRebufferTimeMs() / totalPlayAndWaitTimeMs;
    }

    public float getSeekTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return getTotalSeekTimeMs() / totalPlayAndWaitTimeMs;
    }

    public long getTotalElapsedTimeMs() {
        long j11 = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            j11 += this.playbackStateDurationsMs[i11];
        }
        return j11;
    }

    public long getTotalJoinTimeMs() {
        return getPlaybackStateDurationMs(2);
    }

    public long getTotalPausedTimeMs() {
        return getPlaybackStateDurationMs(4) + getPlaybackStateDurationMs(7);
    }

    public long getTotalPlayAndWaitTimeMs() {
        return getTotalPlayTimeMs() + getTotalWaitTimeMs();
    }

    public long getTotalPlayTimeMs() {
        return getPlaybackStateDurationMs(3);
    }

    public long getTotalRebufferTimeMs() {
        return getPlaybackStateDurationMs(6);
    }

    public long getTotalSeekTimeMs() {
        return getPlaybackStateDurationMs(5);
    }

    public long getTotalWaitTimeMs() {
        return getPlaybackStateDurationMs(2) + getPlaybackStateDurationMs(6) + getPlaybackStateDurationMs(5);
    }

    public float getWaitTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return getTotalWaitTimeMs() / totalPlayAndWaitTimeMs;
    }
}
