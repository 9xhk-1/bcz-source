package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class DefaultMediaClock implements MediaClock {
    private boolean isUsingStandaloneClock = true;
    private final PlaybackParametersListener listener;

    @Nullable
    private MediaClock rendererClock;

    @Nullable
    private Renderer rendererClockSource;
    private final StandaloneMediaClock standaloneClock;
    private boolean standaloneClockIsStarted;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface PlaybackParametersListener {
        void onPlaybackParametersChanged(PlaybackParameters playbackParameters);
    }

    public DefaultMediaClock(PlaybackParametersListener playbackParametersListener, Clock clock) {
        this.listener = playbackParametersListener;
        this.standaloneClock = new StandaloneMediaClock(clock);
    }

    private boolean shouldUseStandaloneClock(boolean z11) {
        Renderer renderer = this.rendererClockSource;
        if (renderer == null || renderer.isEnded()) {
            return true;
        }
        if (z11 && this.rendererClockSource.getState() != 2) {
            return true;
        }
        if (this.rendererClockSource.isReady()) {
            return false;
        }
        return z11 || this.rendererClockSource.hasReadStreamToEnd();
    }

    private void syncClocks(boolean z11) {
        if (shouldUseStandaloneClock(z11)) {
            this.isUsingStandaloneClock = true;
            if (this.standaloneClockIsStarted) {
                this.standaloneClock.start();
                return;
            }
            return;
        }
        MediaClock mediaClock = (MediaClock) Assertions.checkNotNull(this.rendererClock);
        long positionUs = mediaClock.getPositionUs();
        if (this.isUsingStandaloneClock) {
            if (positionUs < this.standaloneClock.getPositionUs()) {
                this.standaloneClock.stop();
                return;
            } else {
                this.isUsingStandaloneClock = false;
                if (this.standaloneClockIsStarted) {
                    this.standaloneClock.start();
                }
            }
        }
        this.standaloneClock.resetPosition(positionUs);
        PlaybackParameters playbackParameters = mediaClock.getPlaybackParameters();
        if (playbackParameters.equals(this.standaloneClock.getPlaybackParameters())) {
            return;
        }
        this.standaloneClock.setPlaybackParameters(playbackParameters);
        this.listener.onPlaybackParametersChanged(playbackParameters);
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public PlaybackParameters getPlaybackParameters() {
        MediaClock mediaClock = this.rendererClock;
        return mediaClock != null ? mediaClock.getPlaybackParameters() : this.standaloneClock.getPlaybackParameters();
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public long getPositionUs() {
        return this.isUsingStandaloneClock ? this.standaloneClock.getPositionUs() : ((MediaClock) Assertions.checkNotNull(this.rendererClock)).getPositionUs();
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public boolean hasSkippedSilenceSinceLastCall() {
        return this.isUsingStandaloneClock ? this.standaloneClock.hasSkippedSilenceSinceLastCall() : ((MediaClock) Assertions.checkNotNull(this.rendererClock)).hasSkippedSilenceSinceLastCall();
    }

    public void onRendererDisabled(Renderer renderer) {
        if (renderer == this.rendererClockSource) {
            this.rendererClock = null;
            this.rendererClockSource = null;
            this.isUsingStandaloneClock = true;
        }
    }

    public void onRendererEnabled(Renderer renderer) throws ExoPlaybackException {
        MediaClock mediaClock;
        MediaClock mediaClock2 = renderer.getMediaClock();
        if (mediaClock2 == null || mediaClock2 == (mediaClock = this.rendererClock)) {
            return;
        }
        if (mediaClock != null) {
            throw ExoPlaybackException.createForUnexpected(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.rendererClock = mediaClock2;
        this.rendererClockSource = renderer;
        mediaClock2.setPlaybackParameters(this.standaloneClock.getPlaybackParameters());
    }

    public void resetPosition(long j11) {
        this.standaloneClock.resetPosition(j11);
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        MediaClock mediaClock = this.rendererClock;
        if (mediaClock != null) {
            mediaClock.setPlaybackParameters(playbackParameters);
            playbackParameters = this.rendererClock.getPlaybackParameters();
        }
        this.standaloneClock.setPlaybackParameters(playbackParameters);
    }

    public void start() {
        this.standaloneClockIsStarted = true;
        this.standaloneClock.start();
    }

    public void stop() {
        this.standaloneClockIsStarted = false;
        this.standaloneClock.stop();
    }

    public long syncAndGetPositionUs(boolean z11) {
        syncClocks(z11);
        return getPositionUs();
    }
}
