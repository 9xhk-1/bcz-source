package androidx.media3.exoplayer.video;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.Decoder;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public abstract class DecoderVideoRenderer extends BaseRenderer {
    private static final int REINITIALIZATION_STATE_NONE = 0;
    private static final int REINITIALIZATION_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int REINITIALIZATION_STATE_WAIT_END_OF_STREAM = 2;
    private static final String TAG = "DecoderVideoRenderer";
    private final long allowedJoiningTimeMs;
    private int buffersInCodecCount;
    private int consecutiveDroppedFrameCount;

    @Nullable
    private Decoder<DecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> decoder;
    protected DecoderCounters decoderCounters;

    @Nullable
    private DrmSession decoderDrmSession;
    private boolean decoderReceivedBuffers;
    private int decoderReinitializationState;
    private long droppedFrameAccumulationStartTimeMs;
    private int droppedFrames;
    private final VideoRendererEventListener.EventDispatcher eventDispatcher;
    private int firstFrameState;
    private final DecoderInputBuffer flagsOnlyBuffer;
    private final TimedValueQueue<Format> formatQueue;

    @Nullable
    private VideoFrameMetadataListener frameMetadataListener;
    private long initialPositionUs;

    @Nullable
    private DecoderInputBuffer inputBuffer;

    @Nullable
    private Format inputFormat;
    private boolean inputStreamEnded;
    private long joiningDeadlineMs;
    private long lastRenderTimeUs;
    private final int maxDroppedFramesToNotify;

    @Nullable
    private Object output;

    @Nullable
    private VideoDecoderOutputBuffer outputBuffer;

    @Nullable
    private VideoDecoderOutputBufferRenderer outputBufferRenderer;

    @Nullable
    private Format outputFormat;
    private int outputMode;
    private boolean outputStreamEnded;

    @Nullable
    private Surface outputSurface;

    @Nullable
    private VideoSize reportedVideoSize;

    @Nullable
    private DrmSession sourceDrmSession;
    private boolean waitingForFirstSampleInFormat;

    public DecoderVideoRenderer(long j11, @Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener, int i11) {
        super(2);
        this.allowedJoiningTimeMs = j11;
        this.maxDroppedFramesToNotify = i11;
        this.joiningDeadlineMs = C.TIME_UNSET;
        this.formatQueue = new TimedValueQueue<>();
        this.flagsOnlyBuffer = DecoderInputBuffer.newNoDataInstance();
        this.eventDispatcher = new VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        this.decoderReinitializationState = 0;
        this.outputMode = -1;
        this.firstFrameState = 0;
        this.decoderCounters = new DecoderCounters();
    }

    private boolean drainOutputBuffer(long j11, long j12) throws ExoPlaybackException, DecoderException {
        if (this.outputBuffer == null) {
            VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) ((Decoder) Assertions.checkNotNull(this.decoder)).dequeueOutputBuffer();
            this.outputBuffer = videoDecoderOutputBuffer;
            if (videoDecoderOutputBuffer == null) {
                return false;
            }
            DecoderCounters decoderCounters = this.decoderCounters;
            int i11 = decoderCounters.skippedOutputBufferCount;
            int i12 = videoDecoderOutputBuffer.skippedOutputBufferCount;
            decoderCounters.skippedOutputBufferCount = i11 + i12;
            this.buffersInCodecCount -= i12;
        }
        if (!this.outputBuffer.isEndOfStream()) {
            boolean processOutputBuffer = processOutputBuffer(j11, j12);
            if (processOutputBuffer) {
                onProcessedOutputBuffer(((VideoDecoderOutputBuffer) Assertions.checkNotNull(this.outputBuffer)).timeUs);
                this.outputBuffer = null;
            }
            return processOutputBuffer;
        }
        if (this.decoderReinitializationState == 2) {
            releaseDecoder();
            maybeInitDecoder();
        } else {
            this.outputBuffer.release();
            this.outputBuffer = null;
            this.outputStreamEnded = true;
        }
        return false;
    }

    private boolean feedInputBuffer() throws DecoderException, ExoPlaybackException {
        Decoder<DecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> decoder = this.decoder;
        if (decoder == null || this.decoderReinitializationState == 2 || this.inputStreamEnded) {
            return false;
        }
        if (this.inputBuffer == null) {
            DecoderInputBuffer dequeueInputBuffer = decoder.dequeueInputBuffer();
            this.inputBuffer = dequeueInputBuffer;
            if (dequeueInputBuffer == null) {
                return false;
            }
        }
        DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) Assertions.checkNotNull(this.inputBuffer);
        if (this.decoderReinitializationState == 1) {
            decoderInputBuffer.setFlags(4);
            ((Decoder) Assertions.checkNotNull(this.decoder)).queueInputBuffer(decoderInputBuffer);
            this.inputBuffer = null;
            this.decoderReinitializationState = 2;
            return false;
        }
        FormatHolder formatHolder = getFormatHolder();
        int readSource = readSource(formatHolder, decoderInputBuffer, 0);
        if (readSource == -5) {
            onInputFormatChanged(formatHolder);
            return true;
        }
        if (readSource != -4) {
            if (readSource == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        if (decoderInputBuffer.isEndOfStream()) {
            this.inputStreamEnded = true;
            ((Decoder) Assertions.checkNotNull(this.decoder)).queueInputBuffer(decoderInputBuffer);
            this.inputBuffer = null;
            return false;
        }
        if (this.waitingForFirstSampleInFormat) {
            this.formatQueue.add(decoderInputBuffer.timeUs, (Format) Assertions.checkNotNull(this.inputFormat));
            this.waitingForFirstSampleInFormat = false;
        }
        decoderInputBuffer.flip();
        decoderInputBuffer.format = this.inputFormat;
        onQueueInputBuffer(decoderInputBuffer);
        ((Decoder) Assertions.checkNotNull(this.decoder)).queueInputBuffer(decoderInputBuffer);
        this.buffersInCodecCount++;
        this.decoderReceivedBuffers = true;
        this.decoderCounters.queuedInputBufferCount++;
        this.inputBuffer = null;
        return true;
    }

    private boolean hasOutput() {
        return this.outputMode != -1;
    }

    private static boolean isBufferLate(long j11) {
        return j11 < -30000;
    }

    private static boolean isBufferVeryLate(long j11) {
        return j11 < -500000;
    }

    private void lowerFirstFrameState(int i11) {
        this.firstFrameState = Math.min(this.firstFrameState, i11);
    }

    private void maybeInitDecoder() throws ExoPlaybackException {
        CryptoConfig cryptoConfig;
        if (this.decoder != null) {
            return;
        }
        setDecoderDrmSession(this.sourceDrmSession);
        DrmSession drmSession = this.decoderDrmSession;
        if (drmSession != null) {
            cryptoConfig = drmSession.getCryptoConfig();
            if (cryptoConfig == null && this.decoderDrmSession.getError() == null) {
                return;
            }
        } else {
            cryptoConfig = null;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Decoder<DecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> createDecoder = createDecoder((Format) Assertions.checkNotNull(this.inputFormat), cryptoConfig);
            this.decoder = createDecoder;
            createDecoder.setOutputStartTimeUs(getLastResetPositionUs());
            setDecoderOutputMode(this.outputMode);
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.eventDispatcher.decoderInitialized(((Decoder) Assertions.checkNotNull(this.decoder)).getName(), elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
            this.decoderCounters.decoderInitCount++;
        } catch (DecoderException e11) {
            Log.e(TAG, "Video codec error", e11);
            this.eventDispatcher.videoCodecError(e11);
            throw createRendererException(e11, this.inputFormat, 4001);
        } catch (OutOfMemoryError e12) {
            throw createRendererException(e12, this.inputFormat, 4001);
        }
    }

    private void maybeNotifyDroppedFrames() {
        if (this.droppedFrames > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.eventDispatcher.droppedFrames(this.droppedFrames, elapsedRealtime - this.droppedFrameAccumulationStartTimeMs);
            this.droppedFrames = 0;
            this.droppedFrameAccumulationStartTimeMs = elapsedRealtime;
        }
    }

    private void maybeNotifyRenderedFirstFrame() {
        if (this.firstFrameState != 3) {
            this.firstFrameState = 3;
            Object obj = this.output;
            if (obj != null) {
                this.eventDispatcher.renderedFirstFrame(obj);
            }
        }
    }

    private void maybeNotifyVideoSizeChanged(int i11, int i12) {
        VideoSize videoSize = this.reportedVideoSize;
        if (videoSize != null && videoSize.width == i11 && videoSize.height == i12) {
            return;
        }
        VideoSize videoSize2 = new VideoSize(i11, i12);
        this.reportedVideoSize = videoSize2;
        this.eventDispatcher.videoSizeChanged(videoSize2);
    }

    private void maybeRenotifyRenderedFirstFrame() {
        Object obj;
        if (this.firstFrameState != 3 || (obj = this.output) == null) {
            return;
        }
        this.eventDispatcher.renderedFirstFrame(obj);
    }

    private void maybeRenotifyVideoSizeChanged() {
        VideoSize videoSize = this.reportedVideoSize;
        if (videoSize != null) {
            this.eventDispatcher.videoSizeChanged(videoSize);
        }
    }

    private void onOutputChanged() {
        maybeRenotifyVideoSizeChanged();
        lowerFirstFrameState(1);
        if (getState() == 2) {
            setJoiningDeadlineMs();
        }
    }

    private void onOutputRemoved() {
        this.reportedVideoSize = null;
        lowerFirstFrameState(1);
    }

    private void onOutputReset() {
        maybeRenotifyVideoSizeChanged();
        maybeRenotifyRenderedFirstFrame();
    }

    private boolean processOutputBuffer(long j11, long j12) throws ExoPlaybackException, DecoderException {
        if (this.initialPositionUs == C.TIME_UNSET) {
            this.initialPositionUs = j11;
        }
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) Assertions.checkNotNull(this.outputBuffer);
        long j13 = videoDecoderOutputBuffer.timeUs;
        long j14 = j13 - j11;
        if (!hasOutput()) {
            if (!isBufferLate(j14)) {
                return false;
            }
            skipOutputBuffer(videoDecoderOutputBuffer);
            return true;
        }
        Format pollFloor = this.formatQueue.pollFloor(j13);
        if (pollFloor != null) {
            this.outputFormat = pollFloor;
        } else if (this.outputFormat == null) {
            this.outputFormat = this.formatQueue.pollFirst();
        }
        long streamOffsetUs = j13 - getStreamOffsetUs();
        if (shouldForceRender(j14)) {
            renderOutputBuffer(videoDecoderOutputBuffer, streamOffsetUs, (Format) Assertions.checkNotNull(this.outputFormat));
            return true;
        }
        if (getState() != 2 || j11 == this.initialPositionUs || (shouldDropBuffersToKeyframe(j14, j12) && maybeDropBuffersToKeyframe(j11))) {
            return false;
        }
        if (shouldDropOutputBuffer(j14, j12)) {
            dropOutputBuffer(videoDecoderOutputBuffer);
            return true;
        }
        if (j14 < 30000) {
            renderOutputBuffer(videoDecoderOutputBuffer, streamOffsetUs, (Format) Assertions.checkNotNull(this.outputFormat));
            return true;
        }
        return false;
    }

    private void setDecoderDrmSession(@Nullable DrmSession drmSession) {
        DrmSession.replaceSession(this.decoderDrmSession, drmSession);
        this.decoderDrmSession = drmSession;
    }

    private void setJoiningDeadlineMs() {
        this.joiningDeadlineMs = this.allowedJoiningTimeMs > 0 ? SystemClock.elapsedRealtime() + this.allowedJoiningTimeMs : C.TIME_UNSET;
    }

    private void setSourceDrmSession(@Nullable DrmSession drmSession) {
        DrmSession.replaceSession(this.sourceDrmSession, drmSession);
        this.sourceDrmSession = drmSession;
    }

    private boolean shouldForceRender(long j11) {
        boolean z11 = getState() == 2;
        int i11 = this.firstFrameState;
        if (i11 == 0) {
            return z11;
        }
        if (i11 == 1) {
            return true;
        }
        if (i11 == 3) {
            return z11 && shouldForceRenderOutputBuffer(j11, Util.msToUs(SystemClock.elapsedRealtime()) - this.lastRenderTimeUs);
        }
        throw new IllegalStateException();
    }

    public DecoderReuseEvaluation canReuseDecoder(String str, Format format, Format format2) {
        return new DecoderReuseEvaluation(str, format, format2, 0, 1);
    }

    public abstract Decoder<DecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> createDecoder(Format format, @Nullable CryptoConfig cryptoConfig) throws DecoderException;

    public void dropOutputBuffer(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        updateDroppedBufferCounters(0, 1);
        videoDecoderOutputBuffer.release();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void enableMayRenderStartOfStream() {
        if (this.firstFrameState == 0) {
            this.firstFrameState = 1;
        }
    }

    @CallSuper
    public void flushDecoder() throws ExoPlaybackException {
        this.buffersInCodecCount = 0;
        if (this.decoderReinitializationState != 0) {
            releaseDecoder();
            maybeInitDecoder();
            return;
        }
        this.inputBuffer = null;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.outputBuffer;
        if (videoDecoderOutputBuffer != null) {
            videoDecoderOutputBuffer.release();
            this.outputBuffer = null;
        }
        Decoder decoder = (Decoder) Assertions.checkNotNull(this.decoder);
        decoder.flush();
        decoder.setOutputStartTimeUs(getLastResetPositionUs());
        this.decoderReceivedBuffers = false;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i11, @Nullable Object obj) throws ExoPlaybackException {
        if (i11 == 1) {
            setOutput(obj);
        } else if (i11 == 7) {
            this.frameMetadataListener = (VideoFrameMetadataListener) obj;
        } else {
            super.handleMessage(i11, obj);
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        if (this.inputFormat != null && ((isSourceReady() || this.outputBuffer != null) && (this.firstFrameState == 3 || !hasOutput()))) {
            this.joiningDeadlineMs = C.TIME_UNSET;
            return true;
        }
        if (this.joiningDeadlineMs == C.TIME_UNSET) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.joiningDeadlineMs) {
            return true;
        }
        this.joiningDeadlineMs = C.TIME_UNSET;
        return false;
    }

    public boolean maybeDropBuffersToKeyframe(long j11) throws ExoPlaybackException {
        int skipSource = skipSource(j11);
        if (skipSource == 0) {
            return false;
        }
        this.decoderCounters.droppedToKeyframeCount++;
        updateDroppedBufferCounters(skipSource, this.buffersInCodecCount);
        flushDecoder();
        return true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onDisabled() {
        this.inputFormat = null;
        this.reportedVideoSize = null;
        lowerFirstFrameState(0);
        try {
            setSourceDrmSession(null);
            releaseDecoder();
        } finally {
            this.eventDispatcher.disabled(this.decoderCounters);
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onEnabled(boolean z11, boolean z12) throws ExoPlaybackException {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.decoderCounters = decoderCounters;
        this.eventDispatcher.enabled(decoderCounters);
        this.firstFrameState = z12 ? 1 : 0;
    }

    @CallSuper
    public void onInputFormatChanged(FormatHolder formatHolder) throws ExoPlaybackException {
        this.waitingForFirstSampleInFormat = true;
        Format format = (Format) Assertions.checkNotNull(formatHolder.format);
        setSourceDrmSession(formatHolder.drmSession);
        Format format2 = this.inputFormat;
        this.inputFormat = format;
        Decoder<DecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> decoder = this.decoder;
        if (decoder == null) {
            maybeInitDecoder();
            this.eventDispatcher.inputFormatChanged((Format) Assertions.checkNotNull(this.inputFormat), null);
            return;
        }
        DecoderReuseEvaluation decoderReuseEvaluation = this.sourceDrmSession != this.decoderDrmSession ? new DecoderReuseEvaluation(decoder.getName(), (Format) Assertions.checkNotNull(format2), format, 0, 128) : canReuseDecoder(decoder.getName(), (Format) Assertions.checkNotNull(format2), format);
        if (decoderReuseEvaluation.result == 0) {
            if (this.decoderReceivedBuffers) {
                this.decoderReinitializationState = 1;
            } else {
                releaseDecoder();
                maybeInitDecoder();
            }
        }
        this.eventDispatcher.inputFormatChanged((Format) Assertions.checkNotNull(this.inputFormat), decoderReuseEvaluation);
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onPositionReset(long j11, boolean z11) throws ExoPlaybackException {
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        lowerFirstFrameState(1);
        this.initialPositionUs = C.TIME_UNSET;
        this.consecutiveDroppedFrameCount = 0;
        if (this.decoder != null) {
            flushDecoder();
        }
        if (z11) {
            setJoiningDeadlineMs();
        } else {
            this.joiningDeadlineMs = C.TIME_UNSET;
        }
        this.formatQueue.clear();
    }

    @CallSuper
    public void onProcessedOutputBuffer(long j11) {
        this.buffersInCodecCount--;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onStarted() {
        this.droppedFrames = 0;
        this.droppedFrameAccumulationStartTimeMs = SystemClock.elapsedRealtime();
        this.lastRenderTimeUs = Util.msToUs(SystemClock.elapsedRealtime());
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onStopped() {
        this.joiningDeadlineMs = C.TIME_UNSET;
        maybeNotifyDroppedFrames();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onStreamChanged(Format[] formatArr, long j11, long j12, MediaSource.MediaPeriodId mediaPeriodId) throws ExoPlaybackException {
        super.onStreamChanged(formatArr, j11, j12, mediaPeriodId);
    }

    @CallSuper
    public void releaseDecoder() {
        this.inputBuffer = null;
        this.outputBuffer = null;
        this.decoderReinitializationState = 0;
        this.decoderReceivedBuffers = false;
        this.buffersInCodecCount = 0;
        Decoder<DecoderInputBuffer, ? extends VideoDecoderOutputBuffer, ? extends DecoderException> decoder = this.decoder;
        if (decoder != null) {
            this.decoderCounters.decoderReleaseCount++;
            decoder.release();
            this.eventDispatcher.decoderReleased(this.decoder.getName());
            this.decoder = null;
        }
        setDecoderDrmSession(null);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j11, long j12) throws ExoPlaybackException {
        if (this.outputStreamEnded) {
            return;
        }
        if (this.inputFormat == null) {
            FormatHolder formatHolder = getFormatHolder();
            this.flagsOnlyBuffer.clear();
            int readSource = readSource(formatHolder, this.flagsOnlyBuffer, 2);
            if (readSource != -5) {
                if (readSource == -4) {
                    Assertions.checkState(this.flagsOnlyBuffer.isEndOfStream());
                    this.inputStreamEnded = true;
                    this.outputStreamEnded = true;
                    return;
                }
                return;
            }
            onInputFormatChanged(formatHolder);
        }
        maybeInitDecoder();
        if (this.decoder != null) {
            try {
                TraceUtil.beginSection("drainAndFeed");
                while (drainOutputBuffer(j11, j12)) {
                }
                while (feedInputBuffer()) {
                }
                TraceUtil.endSection();
                this.decoderCounters.ensureUpdated();
            } catch (DecoderException e11) {
                Log.e(TAG, "Video codec error", e11);
                this.eventDispatcher.videoCodecError(e11);
                throw createRendererException(e11, this.inputFormat, PlaybackException.ERROR_CODE_DECODING_FAILED);
            }
        }
    }

    public void renderOutputBuffer(VideoDecoderOutputBuffer videoDecoderOutputBuffer, long j11, Format format) throws DecoderException {
        VideoFrameMetadataListener videoFrameMetadataListener = this.frameMetadataListener;
        if (videoFrameMetadataListener != null) {
            videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j11, getClock().nanoTime(), format, null);
        }
        this.lastRenderTimeUs = Util.msToUs(SystemClock.elapsedRealtime());
        int i11 = videoDecoderOutputBuffer.mode;
        boolean z11 = i11 == 1 && this.outputSurface != null;
        boolean z12 = i11 == 0 && this.outputBufferRenderer != null;
        if (!z12 && !z11) {
            dropOutputBuffer(videoDecoderOutputBuffer);
            return;
        }
        maybeNotifyVideoSizeChanged(videoDecoderOutputBuffer.width, videoDecoderOutputBuffer.height);
        if (z12) {
            ((VideoDecoderOutputBufferRenderer) Assertions.checkNotNull(this.outputBufferRenderer)).setOutputBuffer(videoDecoderOutputBuffer);
        } else {
            renderOutputBufferToSurface(videoDecoderOutputBuffer, (Surface) Assertions.checkNotNull(this.outputSurface));
        }
        this.consecutiveDroppedFrameCount = 0;
        this.decoderCounters.renderedOutputBufferCount++;
        maybeNotifyRenderedFirstFrame();
    }

    public abstract void renderOutputBufferToSurface(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface) throws DecoderException;

    public abstract void setDecoderOutputMode(int i11);

    public final void setOutput(@Nullable Object obj) {
        if (obj instanceof Surface) {
            this.outputSurface = (Surface) obj;
            this.outputBufferRenderer = null;
            this.outputMode = 1;
        } else if (obj instanceof VideoDecoderOutputBufferRenderer) {
            this.outputSurface = null;
            this.outputBufferRenderer = (VideoDecoderOutputBufferRenderer) obj;
            this.outputMode = 0;
        } else {
            this.outputSurface = null;
            this.outputBufferRenderer = null;
            this.outputMode = -1;
            obj = null;
        }
        if (this.output == obj) {
            if (obj != null) {
                onOutputReset();
                return;
            }
            return;
        }
        this.output = obj;
        if (obj == null) {
            onOutputRemoved();
            return;
        }
        if (this.decoder != null) {
            setDecoderOutputMode(this.outputMode);
        }
        onOutputChanged();
    }

    public boolean shouldDropBuffersToKeyframe(long j11, long j12) {
        return isBufferVeryLate(j11);
    }

    public boolean shouldDropOutputBuffer(long j11, long j12) {
        return isBufferLate(j11);
    }

    public boolean shouldForceRenderOutputBuffer(long j11, long j12) {
        return isBufferLate(j11) && j12 > SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
    }

    public void skipOutputBuffer(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        this.decoderCounters.skippedOutputBufferCount++;
        videoDecoderOutputBuffer.release();
    }

    public void updateDroppedBufferCounters(int i11, int i12) {
        DecoderCounters decoderCounters = this.decoderCounters;
        decoderCounters.droppedInputBufferCount += i11;
        int i13 = i11 + i12;
        decoderCounters.droppedBufferCount += i13;
        this.droppedFrames += i13;
        int i14 = this.consecutiveDroppedFrameCount + i13;
        this.consecutiveDroppedFrameCount = i14;
        decoderCounters.maxConsecutiveDroppedBufferCount = Math.max(i14, decoderCounters.maxConsecutiveDroppedBufferCount);
        int i15 = this.maxDroppedFramesToNotify;
        if (i15 <= 0 || this.droppedFrames < i15) {
            return;
        }
        maybeNotifyDroppedFrames();
    }

    public void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
    }
}
