package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public abstract class NoSampleRenderer implements Renderer, RendererCapabilities {
    private RendererConfiguration configuration;
    private int index;
    private int state;

    @Nullable
    private SampleStream stream;
    private boolean streamIsFinal;

    @Override // androidx.media3.exoplayer.Renderer
    public final void disable() {
        Assertions.checkState(this.state == 1);
        this.state = 0;
        this.stream = null;
        this.streamIsFinal = false;
        onDisabled();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void enable(RendererConfiguration rendererConfiguration, Format[] formatArr, SampleStream sampleStream, long j11, boolean z11, boolean z12, long j12, long j13, MediaSource.MediaPeriodId mediaPeriodId) throws ExoPlaybackException {
        Assertions.checkState(this.state == 0);
        this.configuration = rendererConfiguration;
        this.state = 1;
        onEnabled(z11);
        replaceStream(formatArr, sampleStream, j12, j13, mediaPeriodId);
        onPositionReset(j11, z11);
    }

    @Nullable
    public final RendererConfiguration getConfiguration() {
        return this.configuration;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // androidx.media3.exoplayer.Renderer
    @Nullable
    public MediaClock getMediaClock() {
        return null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public long getReadingPositionUs() {
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final int getState() {
        return this.state;
    }

    @Override // androidx.media3.exoplayer.Renderer
    @Nullable
    public final SampleStream getStream() {
        return this.stream;
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final int getTrackType() {
        return -2;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean hasReadStreamToEnd() {
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void init(int i11, PlayerId playerId, Clock clock) {
        this.index = i11;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean isCurrentStreamFinal() {
        return this.streamIsFinal;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void replaceStream(Format[] formatArr, SampleStream sampleStream, long j11, long j12, MediaSource.MediaPeriodId mediaPeriodId) throws ExoPlaybackException {
        Assertions.checkState(!this.streamIsFinal);
        this.stream = sampleStream;
        onRendererOffsetChanged(j12);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void reset() {
        Assertions.checkState(this.state == 0);
        onReset();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void resetPosition(long j11) throws ExoPlaybackException {
        this.streamIsFinal = false;
        onPositionReset(j11, false);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void setCurrentStreamFinal() {
        this.streamIsFinal = true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void start() throws ExoPlaybackException {
        Assertions.checkState(this.state == 1);
        this.state = 2;
        onStarted();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void stop() {
        Assertions.checkState(this.state == 2);
        this.state = 1;
        onStopped();
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsFormat(Format format) throws ExoPlaybackException {
        return RendererCapabilities.create(0);
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsMixedMimeTypeAdaptation() throws ExoPlaybackException {
        return 0;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final RendererCapabilities getCapabilities() {
        return this;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void maybeThrowStreamError() throws IOException {
    }

    public void onDisabled() {
    }

    public void onReset() {
    }

    public void onStarted() throws ExoPlaybackException {
    }

    public void onStopped() {
    }

    public void onEnabled(boolean z11) throws ExoPlaybackException {
    }

    public void onRendererOffsetChanged(long j11) throws ExoPlaybackException {
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void setTimeline(Timeline timeline) {
    }

    @Override // androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i11, @Nullable Object obj) throws ExoPlaybackException {
    }

    public void onPositionReset(long j11, boolean z11) throws ExoPlaybackException {
    }
}
