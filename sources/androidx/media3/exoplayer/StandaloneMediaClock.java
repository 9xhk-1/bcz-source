package androidx.media3.exoplayer;

import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class StandaloneMediaClock implements MediaClock {
    private long baseElapsedMs;
    private long baseUs;
    private final Clock clock;
    private PlaybackParameters playbackParameters = PlaybackParameters.DEFAULT;
    private boolean started;

    public StandaloneMediaClock(Clock clock) {
        this.clock = clock;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public PlaybackParameters getPlaybackParameters() {
        return this.playbackParameters;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public long getPositionUs() {
        long j11 = this.baseUs;
        if (!this.started) {
            return j11;
        }
        long elapsedRealtime = this.clock.elapsedRealtime() - this.baseElapsedMs;
        PlaybackParameters playbackParameters = this.playbackParameters;
        return j11 + (playbackParameters.speed == 1.0f ? Util.msToUs(elapsedRealtime) : playbackParameters.getMediaTimeUsForPlayoutTimeMs(elapsedRealtime));
    }

    public void resetPosition(long j11) {
        this.baseUs = j11;
        if (this.started) {
            this.baseElapsedMs = this.clock.elapsedRealtime();
        }
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        if (this.started) {
            resetPosition(getPositionUs());
        }
        this.playbackParameters = playbackParameters;
    }

    public void start() {
        if (this.started) {
            return;
        }
        this.baseElapsedMs = this.clock.elapsedRealtime();
        this.started = true;
    }

    public void stop() {
        if (this.started) {
            resetPosition(getPositionUs());
            this.started = false;
        }
    }
}
