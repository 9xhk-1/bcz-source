package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.exoplayer.metadata.MetadataRenderer;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.text.TextRenderer;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
class RendererHolder {
    static final int RENDERER_PREWARMING_STATE_NOT_PREWARMING_USING_PRIMARY = 0;
    static final int RENDERER_PREWARMING_STATE_NOT_PREWARMING_USING_SECONDARY = 1;
    static final int RENDERER_PREWARMING_STATE_PREWARMING_PRIMARY = 2;
    static final int RENDERER_PREWARMING_STATE_TRANSITIONING_TO_PRIMARY = 4;
    static final int RENDERER_PREWARMING_STATE_TRANSITIONING_TO_SECONDARY = 3;
    static final int REPLACE_STREAMS_DISABLE_RENDERERS_COMPLETED = 1;
    static final int REPLACE_STREAMS_DISABLE_RENDERERS_DISABLE_OFFLOAD_SCHEDULING = 2;
    private final int index;
    private final Renderer primaryRenderer;

    @Nullable
    private final Renderer secondaryRenderer;
    private int prewarmingState = 0;
    private boolean primaryRequiresReset = false;
    private boolean secondaryRequiresReset = false;

    public RendererHolder(Renderer renderer, @Nullable Renderer renderer2, int i11) {
        this.primaryRenderer = renderer;
        this.index = i11;
        this.secondaryRenderer = renderer2;
    }

    private void disableRenderer(Renderer renderer, DefaultMediaClock defaultMediaClock) {
        Assertions.checkState(this.primaryRenderer == renderer || this.secondaryRenderer == renderer);
        if (isRendererEnabled(renderer)) {
            defaultMediaClock.onRendererDisabled(renderer);
            ensureStopped(renderer);
            renderer.disable();
        }
    }

    private void ensureStopped(Renderer renderer) {
        if (renderer.getState() == 2) {
            renderer.stop();
        }
    }

    private static Format[] getFormats(@Nullable ExoTrackSelection exoTrackSelection) {
        int length = exoTrackSelection != null ? exoTrackSelection.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i11 = 0; i11 < length; i11++) {
            formatArr[i11] = ((ExoTrackSelection) Assertions.checkNotNull(exoTrackSelection)).getFormat(i11);
        }
        return formatArr;
    }

    @Nullable
    private Renderer getRendererReadingFromPeriod(@Nullable MediaPeriodHolder mediaPeriodHolder) {
        if (mediaPeriodHolder != null && mediaPeriodHolder.sampleStreams[this.index] != null) {
            if (this.primaryRenderer.getStream() == mediaPeriodHolder.sampleStreams[this.index]) {
                return this.primaryRenderer;
            }
            Renderer renderer = this.secondaryRenderer;
            if (renderer != null && renderer.getStream() == mediaPeriodHolder.sampleStreams[this.index]) {
                return this.secondaryRenderer;
            }
        }
        return null;
    }

    private boolean hasFinishedReadingFromPeriodInternal(MediaPeriodHolder mediaPeriodHolder, @Nullable Renderer renderer) {
        if (renderer == null) {
            return true;
        }
        SampleStream sampleStream = mediaPeriodHolder.sampleStreams[this.index];
        if (renderer.getStream() == null || (renderer.getStream() == sampleStream && (sampleStream == null || renderer.hasReadStreamToEnd() || hasReachedServerSideInsertedAdsTransition(renderer, mediaPeriodHolder)))) {
            return true;
        }
        MediaPeriodHolder next = mediaPeriodHolder.getNext();
        return next != null && next.sampleStreams[this.index] == renderer.getStream();
    }

    private boolean hasReachedServerSideInsertedAdsTransition(Renderer renderer, MediaPeriodHolder mediaPeriodHolder) {
        MediaPeriodHolder next = mediaPeriodHolder.getNext();
        if (mediaPeriodHolder.info.isFollowedByTransitionToSameStream && next != null && next.prepared) {
            return (renderer instanceof TextRenderer) || (renderer instanceof MetadataRenderer) || renderer.getReadingPositionUs() >= next.getStartPositionRendererTime();
        }
        return false;
    }

    private boolean isPrimaryRendererPrewarming() {
        int i11 = this.prewarmingState;
        return i11 == 2 || i11 == 4;
    }

    private boolean isSecondaryRendererPrewarming() {
        return this.prewarmingState == 3;
    }

    private void maybeDisableOrResetPositionInternal(Renderer renderer, SampleStream sampleStream, DefaultMediaClock defaultMediaClock, long j11, boolean z11) throws ExoPlaybackException {
        if (isRendererEnabled(renderer)) {
            if (sampleStream != renderer.getStream()) {
                disableRenderer(renderer, defaultMediaClock);
            } else if (z11) {
                renderer.resetPosition(j11);
            }
        }
    }

    private void maybeResetRenderer(boolean z11) {
        if (z11) {
            if (this.primaryRequiresReset) {
                this.primaryRenderer.reset();
                this.primaryRequiresReset = false;
                return;
            }
            return;
        }
        if (this.secondaryRequiresReset) {
            ((Renderer) Assertions.checkNotNull(this.secondaryRenderer)).reset();
            this.secondaryRequiresReset = false;
        }
    }

    private int replaceStreamsOrDisableRendererForTransitionInternal(@Nullable Renderer renderer, MediaPeriodHolder mediaPeriodHolder, TrackSelectorResult trackSelectorResult, DefaultMediaClock defaultMediaClock) throws ExoPlaybackException {
        if (renderer == null || !isRendererEnabled(renderer) || ((renderer == this.primaryRenderer && isPrimaryRendererPrewarming()) || (renderer == this.secondaryRenderer && isSecondaryRendererPrewarming()))) {
            return 1;
        }
        SampleStream stream = renderer.getStream();
        SampleStream[] sampleStreamArr = mediaPeriodHolder.sampleStreams;
        int i11 = this.index;
        boolean z11 = stream != sampleStreamArr[i11];
        boolean isRendererEnabled = trackSelectorResult.isRendererEnabled(i11);
        if (isRendererEnabled && !z11) {
            return 1;
        }
        if (!renderer.isCurrentStreamFinal()) {
            renderer.replaceStream(getFormats(trackSelectorResult.selections[this.index]), (SampleStream) Assertions.checkNotNull(mediaPeriodHolder.sampleStreams[this.index]), mediaPeriodHolder.getStartPositionRendererTime(), mediaPeriodHolder.getRendererOffset(), mediaPeriodHolder.info.f4604id);
            return 3;
        }
        if (!renderer.isEnded()) {
            return 0;
        }
        disableRenderer(renderer, defaultMediaClock);
        if (!isRendererEnabled || isPrewarming()) {
            maybeResetRenderer(renderer == this.primaryRenderer);
        }
        return 1;
    }

    private void setCurrentStreamFinalInternal(Renderer renderer, long j11) {
        renderer.setCurrentStreamFinal();
        if (renderer instanceof TextRenderer) {
            ((TextRenderer) renderer).setFinalStreamEndPositionUs(j11);
        }
    }

    private void transferResources(boolean z11) throws ExoPlaybackException {
        if (z11) {
            ((Renderer) Assertions.checkNotNull(this.secondaryRenderer)).handleMessage(17, this.primaryRenderer);
        } else {
            this.primaryRenderer.handleMessage(17, Assertions.checkNotNull(this.secondaryRenderer));
        }
    }

    public boolean allowsPlayback(MediaPeriodHolder mediaPeriodHolder) {
        Renderer rendererReadingFromPeriod = getRendererReadingFromPeriod(mediaPeriodHolder);
        return rendererReadingFromPeriod == null || rendererReadingFromPeriod.hasReadStreamToEnd() || rendererReadingFromPeriod.isReady() || rendererReadingFromPeriod.isEnded();
    }

    public void disable(DefaultMediaClock defaultMediaClock) throws ExoPlaybackException {
        disableRenderer(this.primaryRenderer, defaultMediaClock);
        Renderer renderer = this.secondaryRenderer;
        if (renderer != null) {
            boolean z11 = isRendererEnabled(renderer) && this.prewarmingState != 3;
            disableRenderer(this.secondaryRenderer, defaultMediaClock);
            maybeResetRenderer(false);
            if (z11) {
                transferResources(true);
            }
        }
        this.prewarmingState = 0;
    }

    public void disablePrewarming(DefaultMediaClock defaultMediaClock) {
        if (isPrewarming()) {
            int i11 = this.prewarmingState;
            boolean z11 = i11 == 4 || i11 == 2;
            int i12 = i11 != 4 ? 0 : 1;
            disableRenderer(z11 ? this.primaryRenderer : (Renderer) Assertions.checkNotNull(this.secondaryRenderer), defaultMediaClock);
            maybeResetRenderer(z11);
            this.prewarmingState = i12;
        }
    }

    public void enable(RendererConfiguration rendererConfiguration, ExoTrackSelection exoTrackSelection, SampleStream sampleStream, long j11, boolean z11, boolean z12, long j12, long j13, MediaSource.MediaPeriodId mediaPeriodId, DefaultMediaClock defaultMediaClock) throws ExoPlaybackException {
        Format[] formats = getFormats(exoTrackSelection);
        int i11 = this.prewarmingState;
        if (i11 == 0 || i11 == 2 || i11 == 4) {
            this.primaryRequiresReset = true;
            this.primaryRenderer.enable(rendererConfiguration, formats, sampleStream, j11, z11, z12, j12, j13, mediaPeriodId);
            defaultMediaClock.onRendererEnabled(this.primaryRenderer);
        } else {
            this.secondaryRequiresReset = true;
            ((Renderer) Assertions.checkNotNull(this.secondaryRenderer)).enable(rendererConfiguration, formats, sampleStream, j11, z11, z12, j12, j13, mediaPeriodId);
            defaultMediaClock.onRendererEnabled(this.secondaryRenderer);
        }
    }

    public void enableMayRenderStartOfStream() {
        if (isRendererEnabled(this.primaryRenderer)) {
            this.primaryRenderer.enableMayRenderStartOfStream();
            return;
        }
        Renderer renderer = this.secondaryRenderer;
        if (renderer == null || !isRendererEnabled(renderer)) {
            return;
        }
        this.secondaryRenderer.enableMayRenderStartOfStream();
    }

    public int getEnabledRendererCount() {
        boolean isRendererEnabled = isRendererEnabled(this.primaryRenderer);
        Renderer renderer = this.secondaryRenderer;
        return (isRendererEnabled ? 1 : 0) + ((renderer == null || !isRendererEnabled(renderer)) ? 0 : 1);
    }

    public long getMinDurationToProgressUs(long j11, long j12) {
        long durationToProgressUs = isRendererEnabled(this.primaryRenderer) ? this.primaryRenderer.getDurationToProgressUs(j11, j12) : Long.MAX_VALUE;
        Renderer renderer = this.secondaryRenderer;
        return (renderer == null || !isRendererEnabled(renderer)) ? durationToProgressUs : Math.min(durationToProgressUs, this.secondaryRenderer.getDurationToProgressUs(j11, j12));
    }

    public long getReadingPositionUs(@Nullable MediaPeriodHolder mediaPeriodHolder) {
        Renderer rendererReadingFromPeriod = getRendererReadingFromPeriod(mediaPeriodHolder);
        Objects.requireNonNull(rendererReadingFromPeriod);
        return rendererReadingFromPeriod.getReadingPositionUs();
    }

    public int getTrackType() {
        return this.primaryRenderer.getTrackType();
    }

    public void handleMessage(int i11, @Nullable Object obj, MediaPeriodHolder mediaPeriodHolder) throws ExoPlaybackException {
        ((Renderer) Assertions.checkNotNull(getRendererReadingFromPeriod(mediaPeriodHolder))).handleMessage(i11, obj);
    }

    public boolean hasFinishedReadingFromPeriod(MediaPeriodHolder mediaPeriodHolder) {
        return hasFinishedReadingFromPeriodInternal(mediaPeriodHolder, this.primaryRenderer) && hasFinishedReadingFromPeriodInternal(mediaPeriodHolder, this.secondaryRenderer);
    }

    public boolean hasReadPeriodToEnd(MediaPeriodHolder mediaPeriodHolder) {
        return ((Renderer) Assertions.checkNotNull(getRendererReadingFromPeriod(mediaPeriodHolder))).hasReadStreamToEnd();
    }

    public boolean hasSecondary() {
        return this.secondaryRenderer != null;
    }

    public boolean isEnded() {
        boolean isEnded = isRendererEnabled(this.primaryRenderer) ? this.primaryRenderer.isEnded() : true;
        Renderer renderer = this.secondaryRenderer;
        return (renderer == null || !isRendererEnabled(renderer)) ? isEnded : isEnded & this.secondaryRenderer.isEnded();
    }

    public boolean isPrewarming() {
        return isPrimaryRendererPrewarming() || isSecondaryRendererPrewarming();
    }

    public boolean isReadingFromPeriod(@Nullable MediaPeriodHolder mediaPeriodHolder) {
        return getRendererReadingFromPeriod(mediaPeriodHolder) != null;
    }

    public boolean isRendererEnabled() {
        int i11 = this.prewarmingState;
        return (i11 == 0 || i11 == 2 || i11 == 4) ? isRendererEnabled(this.primaryRenderer) : isRendererEnabled((Renderer) Assertions.checkNotNull(this.secondaryRenderer));
    }

    public boolean isRendererPrewarming(int i11) {
        return (isPrimaryRendererPrewarming() && i11 == this.index) || (isSecondaryRendererPrewarming() && i11 != this.index);
    }

    public void maybeDisableOrResetPosition(SampleStream sampleStream, DefaultMediaClock defaultMediaClock, long j11, boolean z11) throws ExoPlaybackException {
        maybeDisableOrResetPositionInternal(this.primaryRenderer, sampleStream, defaultMediaClock, j11, z11);
        Renderer renderer = this.secondaryRenderer;
        if (renderer != null) {
            maybeDisableOrResetPositionInternal(renderer, sampleStream, defaultMediaClock, j11, z11);
        }
    }

    public void maybeHandlePrewarmingTransition() throws ExoPlaybackException {
        int i11 = this.prewarmingState;
        if (i11 == 3 || i11 == 4) {
            transferResources(i11 == 4);
            this.prewarmingState = this.prewarmingState != 4 ? 1 : 0;
        } else if (i11 == 2) {
            this.prewarmingState = 0;
        }
    }

    public void maybeSetOldStreamToFinal(TrackSelectorResult trackSelectorResult, TrackSelectorResult trackSelectorResult2, long j11) {
        int i11;
        boolean isRendererEnabled = trackSelectorResult.isRendererEnabled(this.index);
        boolean isRendererEnabled2 = trackSelectorResult2.isRendererEnabled(this.index);
        Renderer renderer = (this.secondaryRenderer == null || (i11 = this.prewarmingState) == 3 || (i11 == 0 && isRendererEnabled(this.primaryRenderer))) ? this.primaryRenderer : (Renderer) Assertions.checkNotNull(this.secondaryRenderer);
        if (!isRendererEnabled || renderer.isCurrentStreamFinal()) {
            return;
        }
        boolean z11 = getTrackType() == -2;
        RendererConfiguration[] rendererConfigurationArr = trackSelectorResult.rendererConfigurations;
        int i12 = this.index;
        RendererConfiguration rendererConfiguration = rendererConfigurationArr[i12];
        RendererConfiguration rendererConfiguration2 = trackSelectorResult2.rendererConfigurations[i12];
        if (!isRendererEnabled2 || !Objects.equals(rendererConfiguration2, rendererConfiguration) || z11 || isPrewarming()) {
            setCurrentStreamFinalInternal(renderer, j11);
        }
    }

    public void maybeThrowStreamError(MediaPeriodHolder mediaPeriodHolder) throws IOException {
        ((Renderer) Assertions.checkNotNull(getRendererReadingFromPeriod(mediaPeriodHolder))).maybeThrowStreamError();
    }

    public void release() {
        this.primaryRenderer.release();
        this.primaryRequiresReset = false;
        Renderer renderer = this.secondaryRenderer;
        if (renderer != null) {
            renderer.release();
            this.secondaryRequiresReset = false;
        }
    }

    public void render(long j11, long j12) throws ExoPlaybackException {
        if (isRendererEnabled(this.primaryRenderer)) {
            this.primaryRenderer.render(j11, j12);
        }
        Renderer renderer = this.secondaryRenderer;
        if (renderer == null || !isRendererEnabled(renderer)) {
            return;
        }
        this.secondaryRenderer.render(j11, j12);
    }

    public int replaceStreamsOrDisableRendererForTransition(MediaPeriodHolder mediaPeriodHolder, TrackSelectorResult trackSelectorResult, DefaultMediaClock defaultMediaClock) throws ExoPlaybackException {
        int replaceStreamsOrDisableRendererForTransitionInternal = replaceStreamsOrDisableRendererForTransitionInternal(this.primaryRenderer, mediaPeriodHolder, trackSelectorResult, defaultMediaClock);
        return replaceStreamsOrDisableRendererForTransitionInternal == 1 ? replaceStreamsOrDisableRendererForTransitionInternal(this.secondaryRenderer, mediaPeriodHolder, trackSelectorResult, defaultMediaClock) : replaceStreamsOrDisableRendererForTransitionInternal;
    }

    public void reset() {
        if (!isRendererEnabled(this.primaryRenderer)) {
            maybeResetRenderer(true);
        }
        Renderer renderer = this.secondaryRenderer;
        if (renderer == null || isRendererEnabled(renderer)) {
            return;
        }
        maybeResetRenderer(false);
    }

    public void resetPosition(MediaPeriodHolder mediaPeriodHolder, long j11) throws ExoPlaybackException {
        Renderer rendererReadingFromPeriod = getRendererReadingFromPeriod(mediaPeriodHolder);
        if (rendererReadingFromPeriod != null) {
            rendererReadingFromPeriod.resetPosition(j11);
        }
    }

    public void setAllNonPrewarmingRendererStreamsFinal(long j11) {
        int i11;
        if (isRendererEnabled(this.primaryRenderer) && (i11 = this.prewarmingState) != 4 && i11 != 2) {
            setCurrentStreamFinalInternal(this.primaryRenderer, j11);
        }
        Renderer renderer = this.secondaryRenderer;
        if (renderer == null || !isRendererEnabled(renderer) || this.prewarmingState == 3) {
            return;
        }
        setCurrentStreamFinalInternal(this.secondaryRenderer, j11);
    }

    public void setCurrentStreamFinal(MediaPeriodHolder mediaPeriodHolder, long j11) {
        setCurrentStreamFinalInternal((Renderer) Assertions.checkNotNull(getRendererReadingFromPeriod(mediaPeriodHolder)), j11);
    }

    public void setPlaybackSpeed(float f11, float f12) throws ExoPlaybackException {
        this.primaryRenderer.setPlaybackSpeed(f11, f12);
        Renderer renderer = this.secondaryRenderer;
        if (renderer != null) {
            renderer.setPlaybackSpeed(f11, f12);
        }
    }

    public void setTimeline(Timeline timeline) {
        this.primaryRenderer.setTimeline(timeline);
        Renderer renderer = this.secondaryRenderer;
        if (renderer != null) {
            renderer.setTimeline(timeline);
        }
    }

    public void setVideoOutput(@Nullable Object obj) throws ExoPlaybackException {
        if (getTrackType() != 2) {
            return;
        }
        int i11 = this.prewarmingState;
        if (i11 == 4 || i11 == 1) {
            ((Renderer) Assertions.checkNotNull(this.secondaryRenderer)).handleMessage(1, obj);
        } else {
            this.primaryRenderer.handleMessage(1, obj);
        }
    }

    public void setVolume(float f11) throws ExoPlaybackException {
        if (getTrackType() != 1) {
            return;
        }
        this.primaryRenderer.handleMessage(2, Float.valueOf(f11));
        Renderer renderer = this.secondaryRenderer;
        if (renderer != null) {
            renderer.handleMessage(2, Float.valueOf(f11));
        }
    }

    public void start() throws ExoPlaybackException {
        if (this.primaryRenderer.getState() == 1 && this.prewarmingState != 4) {
            this.primaryRenderer.start();
            return;
        }
        Renderer renderer = this.secondaryRenderer;
        if (renderer == null || renderer.getState() != 1 || this.prewarmingState == 3) {
            return;
        }
        this.secondaryRenderer.start();
    }

    public void startPrewarming() {
        int i11;
        Assertions.checkState(!isPrewarming());
        if (isRendererEnabled(this.primaryRenderer)) {
            i11 = 3;
        } else {
            Renderer renderer = this.secondaryRenderer;
            i11 = (renderer == null || !isRendererEnabled(renderer)) ? 2 : 4;
        }
        this.prewarmingState = i11;
    }

    public void stop() {
        if (isRendererEnabled(this.primaryRenderer)) {
            ensureStopped(this.primaryRenderer);
        }
        Renderer renderer = this.secondaryRenderer;
        if (renderer == null || !isRendererEnabled(renderer)) {
            return;
        }
        ensureStopped(this.secondaryRenderer);
    }

    private static boolean isRendererEnabled(Renderer renderer) {
        return renderer.getState() != 0;
    }
}
