package androidx.media3.exoplayer.audio;

import android.media.AudioTrack;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Util;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class AudioTrackPositionTracker {
    private static final long FORCE_RESET_WORKAROUND_TIMEOUT_MS = 200;
    private static final long MAX_AUDIO_TIMESTAMP_OFFSET_US = 5000000;
    private static final long MAX_LATENCY_US = 5000000;
    private static final int MAX_PLAYHEAD_OFFSET_COUNT = 10;
    private static final int MIN_LATENCY_SAMPLE_INTERVAL_US = 500000;
    private static final int MIN_PLAYHEAD_OFFSET_SAMPLE_INTERVAL_US = 30000;
    private static final long MODE_SWITCH_SMOOTHING_DURATION_US = 1000000;
    private static final int PLAYSTATE_PAUSED = 2;
    private static final int PLAYSTATE_PLAYING = 3;
    private static final int PLAYSTATE_STOPPED = 1;
    private static final long RAW_PLAYBACK_HEAD_POSITION_UPDATE_INTERVAL_MS = 5;

    @Nullable
    private AudioTimestampPoller audioTimestampPoller;

    @Nullable
    private AudioTrack audioTrack;
    private float audioTrackPlaybackSpeed;
    private int bufferSize;
    private long bufferSizeUs;
    private Clock clock;
    private long endPlaybackHeadPosition;
    private boolean expectRawPlaybackHeadReset;
    private long forceResetWorkaroundTimeMs;

    @Nullable
    private Method getLatencyMethod;
    private boolean hasData;
    private boolean isOutputPcm;
    private long lastLatencySampleTimeUs;
    private long lastPlayheadSampleTimeUs;
    private long lastPositionUs;
    private long lastRawPlaybackHeadPositionSampleTimeMs;
    private boolean lastSampleUsedGetTimestampMode;
    private long lastSystemTimeUs;
    private long latencyUs;
    private final Listener listener;
    private boolean needsPassthroughWorkarounds;
    private int nextPlayheadOffsetIndex;
    private boolean notifiedPositionIncreasing;
    private int outputPcmFrameSize;
    private int outputSampleRate;
    private long passthroughWorkaroundPauseOffset;
    private int playheadOffsetCount;
    private final long[] playheadOffsets;
    private long previousModePositionUs;
    private long previousModeSystemTimeUs;
    private long rawPlaybackHeadPosition;
    private long rawPlaybackHeadWrapCount;
    private long smoothedPlayheadOffsetUs;
    private long stopPlaybackHeadPosition;
    private long stopTimestampUs;
    private long sumRawPlaybackHeadPosition;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Listener {
        void onInvalidLatency(long j11);

        void onPositionAdvancing(long j11);

        void onPositionFramesMismatch(long j11, long j12, long j13, long j14);

        void onSystemTimeUsMismatch(long j11, long j12, long j13, long j14);

        void onUnderrun(int i11, long j11);
    }

    public AudioTrackPositionTracker(Listener listener) {
        this.listener = (Listener) Assertions.checkNotNull(listener);
        try {
            this.getLatencyMethod = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.playheadOffsets = new long[10];
        this.clock = Clock.DEFAULT;
    }

    private boolean forceHasPendingData() {
        return this.needsPassthroughWorkarounds && ((AudioTrack) Assertions.checkNotNull(this.audioTrack)).getPlayState() == 2 && getPlaybackHeadPosition() == 0;
    }

    private long getPlaybackHeadPosition() {
        if (this.stopTimestampUs != C.TIME_UNSET) {
            return Math.min(this.endPlaybackHeadPosition, getSimulatedPlaybackHeadPositionAfterStop());
        }
        long elapsedRealtime = this.clock.elapsedRealtime();
        if (elapsedRealtime - this.lastRawPlaybackHeadPositionSampleTimeMs >= 5) {
            updateRawPlaybackHeadPosition(elapsedRealtime);
            this.lastRawPlaybackHeadPositionSampleTimeMs = elapsedRealtime;
        }
        return this.rawPlaybackHeadPosition + this.sumRawPlaybackHeadPosition + (this.rawPlaybackHeadWrapCount << 32);
    }

    private long getPlaybackHeadPositionUs() {
        return Util.sampleCountToDurationUs(getPlaybackHeadPosition(), this.outputSampleRate);
    }

    private long getSimulatedPlaybackHeadPositionAfterStop() {
        if (((AudioTrack) Assertions.checkNotNull(this.audioTrack)).getPlayState() == 2) {
            return this.stopPlaybackHeadPosition;
        }
        return this.stopPlaybackHeadPosition + Util.durationUsToSampleCount(Util.getMediaDurationForPlayoutDuration(Util.msToUs(this.clock.elapsedRealtime()) - this.stopTimestampUs, this.audioTrackPlaybackSpeed), this.outputSampleRate);
    }

    private void maybePollAndCheckTimestamp(long j11) {
        AudioTimestampPoller audioTimestampPoller = (AudioTimestampPoller) Assertions.checkNotNull(this.audioTimestampPoller);
        if (audioTimestampPoller.maybePollTimestamp(j11)) {
            long timestampSystemTimeUs = audioTimestampPoller.getTimestampSystemTimeUs();
            long timestampPositionFrames = audioTimestampPoller.getTimestampPositionFrames();
            long playbackHeadPositionUs = getPlaybackHeadPositionUs();
            if (Math.abs(timestampSystemTimeUs - j11) > 5000000) {
                this.listener.onSystemTimeUsMismatch(timestampPositionFrames, timestampSystemTimeUs, j11, playbackHeadPositionUs);
                audioTimestampPoller.rejectTimestamp();
            } else if (Math.abs(Util.sampleCountToDurationUs(timestampPositionFrames, this.outputSampleRate) - playbackHeadPositionUs) <= 5000000) {
                audioTimestampPoller.acceptTimestamp();
            } else {
                this.listener.onPositionFramesMismatch(timestampPositionFrames, timestampSystemTimeUs, j11, playbackHeadPositionUs);
                audioTimestampPoller.rejectTimestamp();
            }
        }
    }

    private void maybeSampleSyncParams() {
        long nanoTime = this.clock.nanoTime() / 1000;
        if (nanoTime - this.lastPlayheadSampleTimeUs >= 30000) {
            long playbackHeadPositionUs = getPlaybackHeadPositionUs();
            if (playbackHeadPositionUs != 0) {
                this.playheadOffsets[this.nextPlayheadOffsetIndex] = Util.getPlayoutDurationForMediaDuration(playbackHeadPositionUs, this.audioTrackPlaybackSpeed) - nanoTime;
                this.nextPlayheadOffsetIndex = (this.nextPlayheadOffsetIndex + 1) % 10;
                int i11 = this.playheadOffsetCount;
                if (i11 < 10) {
                    this.playheadOffsetCount = i11 + 1;
                }
                this.lastPlayheadSampleTimeUs = nanoTime;
                this.smoothedPlayheadOffsetUs = 0L;
                int i12 = 0;
                while (true) {
                    int i13 = this.playheadOffsetCount;
                    if (i12 >= i13) {
                        break;
                    }
                    this.smoothedPlayheadOffsetUs += this.playheadOffsets[i12] / i13;
                    i12++;
                }
            } else {
                return;
            }
        }
        if (this.needsPassthroughWorkarounds) {
            return;
        }
        maybePollAndCheckTimestamp(nanoTime);
        maybeUpdateLatency(nanoTime);
    }

    private void maybeUpdateLatency(long j11) {
        Method method;
        if (!this.isOutputPcm || (method = this.getLatencyMethod) == null || j11 - this.lastLatencySampleTimeUs < 500000) {
            return;
        }
        try {
            long intValue = (((Integer) Util.castNonNull((Integer) method.invoke(Assertions.checkNotNull(this.audioTrack), null))).intValue() * 1000) - this.bufferSizeUs;
            this.latencyUs = intValue;
            long max = Math.max(intValue, 0L);
            this.latencyUs = max;
            if (max > 5000000) {
                this.listener.onInvalidLatency(max);
                this.latencyUs = 0L;
            }
        } catch (Exception unused) {
            this.getLatencyMethod = null;
        }
        this.lastLatencySampleTimeUs = j11;
    }

    private static boolean needsPassthroughWorkarounds(int i11) {
        if (Util.SDK_INT < 23) {
            return i11 == 5 || i11 == 6;
        }
        return false;
    }

    private void resetSyncParams() {
        this.smoothedPlayheadOffsetUs = 0L;
        this.playheadOffsetCount = 0;
        this.nextPlayheadOffsetIndex = 0;
        this.lastPlayheadSampleTimeUs = 0L;
        this.lastSystemTimeUs = 0L;
        this.previousModeSystemTimeUs = 0L;
        this.notifiedPositionIncreasing = false;
    }

    private void updateRawPlaybackHeadPosition(long j11) {
        int playState = ((AudioTrack) Assertions.checkNotNull(this.audioTrack)).getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = r0.getPlaybackHeadPosition() & 4294967295L;
        if (this.needsPassthroughWorkarounds) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.passthroughWorkaroundPauseOffset = this.rawPlaybackHeadPosition;
            }
            playbackHeadPosition += this.passthroughWorkaroundPauseOffset;
        }
        if (Util.SDK_INT <= 29) {
            if (playbackHeadPosition == 0 && this.rawPlaybackHeadPosition > 0 && playState == 3) {
                if (this.forceResetWorkaroundTimeMs == C.TIME_UNSET) {
                    this.forceResetWorkaroundTimeMs = j11;
                    return;
                }
                return;
            }
            this.forceResetWorkaroundTimeMs = C.TIME_UNSET;
        }
        long j12 = this.rawPlaybackHeadPosition;
        if (j12 > playbackHeadPosition) {
            if (this.expectRawPlaybackHeadReset) {
                this.sumRawPlaybackHeadPosition += j12;
                this.expectRawPlaybackHeadReset = false;
            } else {
                this.rawPlaybackHeadWrapCount++;
            }
        }
        this.rawPlaybackHeadPosition = playbackHeadPosition;
    }

    public void expectRawPlaybackHeadReset() {
        this.expectRawPlaybackHeadReset = true;
        AudioTimestampPoller audioTimestampPoller = this.audioTimestampPoller;
        if (audioTimestampPoller != null) {
            audioTimestampPoller.expectTimestampFramePositionReset();
        }
    }

    public int getAvailableBufferSize(long j11) {
        return this.bufferSize - ((int) (j11 - (getPlaybackHeadPosition() * this.outputPcmFrameSize)));
    }

    public long getCurrentPositionUs() {
        long min;
        AudioTrack audioTrack = (AudioTrack) Assertions.checkNotNull(this.audioTrack);
        if (audioTrack.getPlayState() == 3) {
            maybeSampleSyncParams();
        }
        long nanoTime = this.clock.nanoTime() / 1000;
        AudioTimestampPoller audioTimestampPoller = (AudioTimestampPoller) Assertions.checkNotNull(this.audioTimestampPoller);
        boolean hasAdvancingTimestamp = audioTimestampPoller.hasAdvancingTimestamp();
        if (hasAdvancingTimestamp) {
            min = Util.sampleCountToDurationUs(audioTimestampPoller.getTimestampPositionFrames(), this.outputSampleRate) + Util.getMediaDurationForPlayoutDuration(nanoTime - audioTimestampPoller.getTimestampSystemTimeUs(), this.audioTrackPlaybackSpeed);
        } else {
            long max = Math.max(0L, (this.playheadOffsetCount == 0 ? this.stopTimestampUs != C.TIME_UNSET ? Util.sampleCountToDurationUs(getSimulatedPlaybackHeadPositionAfterStop(), this.outputSampleRate) : getPlaybackHeadPositionUs() : Util.getMediaDurationForPlayoutDuration(this.smoothedPlayheadOffsetUs + nanoTime, this.audioTrackPlaybackSpeed)) - this.latencyUs);
            min = this.stopTimestampUs != C.TIME_UNSET ? Math.min(Util.sampleCountToDurationUs(this.endPlaybackHeadPosition, this.outputSampleRate), max) : max;
        }
        if (this.lastSampleUsedGetTimestampMode != hasAdvancingTimestamp) {
            this.previousModeSystemTimeUs = this.lastSystemTimeUs;
            this.previousModePositionUs = this.lastPositionUs;
        }
        long j11 = nanoTime - this.previousModeSystemTimeUs;
        if (j11 < 1000000) {
            long mediaDurationForPlayoutDuration = this.previousModePositionUs + Util.getMediaDurationForPlayoutDuration(j11, this.audioTrackPlaybackSpeed);
            long j12 = (j11 * 1000) / 1000000;
            min = ((min * j12) + ((1000 - j12) * mediaDurationForPlayoutDuration)) / 1000;
        }
        if (!this.notifiedPositionIncreasing && min > this.lastPositionUs && audioTrack.getPlayState() == 3) {
            this.notifiedPositionIncreasing = true;
            this.listener.onPositionAdvancing(this.clock.currentTimeMillis() - Util.usToMs(Util.getPlayoutDurationForMediaDuration(Util.usToMs(min - this.lastPositionUs), this.audioTrackPlaybackSpeed)));
        }
        this.lastSystemTimeUs = nanoTime;
        this.lastPositionUs = min;
        this.lastSampleUsedGetTimestampMode = hasAdvancingTimestamp;
        return min;
    }

    public void handleEndOfStream(long j11) {
        this.stopPlaybackHeadPosition = getPlaybackHeadPosition();
        this.stopTimestampUs = Util.msToUs(this.clock.elapsedRealtime());
        this.endPlaybackHeadPosition = j11;
    }

    public boolean hasPendingData(long j11) {
        return j11 > Util.durationUsToSampleCount(getCurrentPositionUs(), this.outputSampleRate) || forceHasPendingData();
    }

    public boolean isPlaying() {
        return ((AudioTrack) Assertions.checkNotNull(this.audioTrack)).getPlayState() == 3;
    }

    public boolean isStalled(long j11) {
        return this.forceResetWorkaroundTimeMs != C.TIME_UNSET && j11 > 0 && this.clock.elapsedRealtime() - this.forceResetWorkaroundTimeMs >= 200;
    }

    public boolean mayHandleBuffer(long j11) {
        int playState = ((AudioTrack) Assertions.checkNotNull(this.audioTrack)).getPlayState();
        if (this.needsPassthroughWorkarounds) {
            if (playState == 2) {
                this.hasData = false;
                return false;
            }
            if (playState == 1 && getPlaybackHeadPosition() == 0) {
                return false;
            }
        }
        boolean z11 = this.hasData;
        boolean hasPendingData = hasPendingData(j11);
        this.hasData = hasPendingData;
        if (z11 && !hasPendingData && playState != 1) {
            this.listener.onUnderrun(this.bufferSize, Util.usToMs(this.bufferSizeUs));
        }
        return true;
    }

    public boolean pause() {
        resetSyncParams();
        if (this.stopTimestampUs == C.TIME_UNSET) {
            ((AudioTimestampPoller) Assertions.checkNotNull(this.audioTimestampPoller)).reset();
            return true;
        }
        this.stopPlaybackHeadPosition = getPlaybackHeadPosition();
        return false;
    }

    public void reset() {
        resetSyncParams();
        this.audioTrack = null;
        this.audioTimestampPoller = null;
    }

    public void setAudioTrack(AudioTrack audioTrack, boolean z11, int i11, int i12, int i13) {
        this.audioTrack = audioTrack;
        this.outputPcmFrameSize = i12;
        this.bufferSize = i13;
        this.audioTimestampPoller = new AudioTimestampPoller(audioTrack);
        this.outputSampleRate = audioTrack.getSampleRate();
        this.needsPassthroughWorkarounds = z11 && needsPassthroughWorkarounds(i11);
        boolean isEncodingLinearPcm = Util.isEncodingLinearPcm(i11);
        this.isOutputPcm = isEncodingLinearPcm;
        this.bufferSizeUs = isEncodingLinearPcm ? Util.sampleCountToDurationUs(i13 / i12, this.outputSampleRate) : -9223372036854775807L;
        this.rawPlaybackHeadPosition = 0L;
        this.rawPlaybackHeadWrapCount = 0L;
        this.expectRawPlaybackHeadReset = false;
        this.sumRawPlaybackHeadPosition = 0L;
        this.passthroughWorkaroundPauseOffset = 0L;
        this.hasData = false;
        this.stopTimestampUs = C.TIME_UNSET;
        this.forceResetWorkaroundTimeMs = C.TIME_UNSET;
        this.lastLatencySampleTimeUs = 0L;
        this.latencyUs = 0L;
        this.audioTrackPlaybackSpeed = 1.0f;
    }

    public void setAudioTrackPlaybackSpeed(float f11) {
        this.audioTrackPlaybackSpeed = f11;
        AudioTimestampPoller audioTimestampPoller = this.audioTimestampPoller;
        if (audioTimestampPoller != null) {
            audioTimestampPoller.reset();
        }
        resetSyncParams();
    }

    public void setClock(Clock clock) {
        this.clock = clock;
    }

    public void start() {
        if (this.stopTimestampUs != C.TIME_UNSET) {
            this.stopTimestampUs = Util.msToUs(this.clock.elapsedRealtime());
        }
        ((AudioTimestampPoller) Assertions.checkNotNull(this.audioTimestampPoller)).reset();
    }
}
