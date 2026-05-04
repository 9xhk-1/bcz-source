package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.Decoder;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.MediaClock;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.source.MediaSource;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public abstract class DecoderAudioRenderer<T extends Decoder<DecoderInputBuffer, ? extends SimpleDecoderOutputBuffer, ? extends DecoderException>> extends BaseRenderer implements MediaClock {
    private static final int MAX_PENDING_OUTPUT_STREAM_OFFSET_COUNT = 10;
    private static final int REINITIALIZATION_STATE_NONE = 0;
    private static final int REINITIALIZATION_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int REINITIALIZATION_STATE_WAIT_END_OF_STREAM = 2;
    private static final String TAG = "DecoderAudioRenderer";
    private boolean allowPositionDiscontinuity;
    private final AudioSink audioSink;
    private boolean audioTrackNeedsConfigure;
    private long currentPositionUs;

    @Nullable
    private T decoder;
    private DecoderCounters decoderCounters;

    @Nullable
    private DrmSession decoderDrmSession;
    private boolean decoderReceivedBuffers;
    private int decoderReinitializationState;
    private int encoderDelay;
    private int encoderPadding;
    private final AudioRendererEventListener.EventDispatcher eventDispatcher;
    private boolean firstStreamSampleRead;
    private final DecoderInputBuffer flagsOnlyBuffer;
    private boolean hasPendingReportedSkippedSilence;

    @Nullable
    private DecoderInputBuffer inputBuffer;
    private Format inputFormat;
    private boolean inputStreamEnded;
    private boolean isRendereringToEndOfStream;
    private boolean isStarted;
    private long largestQueuedPresentationTimeUs;
    private long lastBufferInStreamPresentationTimeUs;
    private long nextBufferToWritePresentationTimeUs;

    @Nullable
    private SimpleDecoderOutputBuffer outputBuffer;
    private boolean outputStreamEnded;
    private long outputStreamOffsetUs;
    private int pendingOutputStreamOffsetCount;
    private final long[] pendingOutputStreamOffsetsUs;

    @Nullable
    private DrmSession sourceDrmSession;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(23)
    public static final class Api23 {
        private Api23() {
        }

        public static void setAudioSinkPreferredDevice(AudioSink audioSink, @Nullable Object obj) {
            audioSink.setPreferredDevice((AudioDeviceInfo) obj);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class AudioSinkListener implements AudioSink.Listener {
        private AudioSinkListener() {
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onAudioSinkError(Exception exc) {
            Log.e(DecoderAudioRenderer.TAG, "Audio sink error", exc);
            DecoderAudioRenderer.this.eventDispatcher.audioSinkError(exc);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onAudioTrackInitialized(AudioSink.AudioTrackConfig audioTrackConfig) {
            DecoderAudioRenderer.this.eventDispatcher.audioTrackInitialized(audioTrackConfig);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onAudioTrackReleased(AudioSink.AudioTrackConfig audioTrackConfig) {
            DecoderAudioRenderer.this.eventDispatcher.audioTrackReleased(audioTrackConfig);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onPositionAdvancing(long j11) {
            DecoderAudioRenderer.this.eventDispatcher.positionAdvancing(j11);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onPositionDiscontinuity() {
            DecoderAudioRenderer.this.onPositionDiscontinuity();
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onSilenceSkipped() {
            DecoderAudioRenderer.this.hasPendingReportedSkippedSilence = true;
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onSkipSilenceEnabledChanged(boolean z11) {
            DecoderAudioRenderer.this.eventDispatcher.skipSilenceEnabledChanged(z11);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public void onUnderrun(int i11, long j11, long j12) {
            DecoderAudioRenderer.this.eventDispatcher.underrun(i11, j11, j12);
        }
    }

    public DecoderAudioRenderer() {
        this((Handler) null, (AudioRendererEventListener) null, new AudioProcessor[0]);
    }

    private boolean drainOutputBuffer() throws ExoPlaybackException, DecoderException, AudioSink.ConfigurationException, AudioSink.InitializationException, AudioSink.WriteException {
        if (this.outputBuffer == null) {
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) this.decoder.dequeueOutputBuffer();
            this.outputBuffer = simpleDecoderOutputBuffer;
            if (simpleDecoderOutputBuffer == null) {
                return false;
            }
            int i11 = simpleDecoderOutputBuffer.skippedOutputBufferCount;
            if (i11 > 0) {
                this.decoderCounters.skippedOutputBufferCount += i11;
                this.audioSink.handleDiscontinuity();
            }
            if (this.outputBuffer.isFirstSample()) {
                processFirstSampleOfStream();
            }
        }
        if (this.outputBuffer.isEndOfStream()) {
            if (this.decoderReinitializationState == 2) {
                releaseDecoder();
                maybeInitDecoder();
                this.audioTrackNeedsConfigure = true;
            } else {
                this.outputBuffer.release();
                this.outputBuffer = null;
                try {
                    processEndOfStream();
                } catch (AudioSink.WriteException e11) {
                    throw createRendererException(e11, e11.format, e11.isRecoverable, PlaybackException.ERROR_CODE_AUDIO_TRACK_WRITE_FAILED);
                }
            }
            return false;
        }
        this.nextBufferToWritePresentationTimeUs = C.TIME_UNSET;
        if (this.audioTrackNeedsConfigure) {
            this.audioSink.configure(getOutputFormat(this.decoder).buildUpon().setEncoderDelay(this.encoderDelay).setEncoderPadding(this.encoderPadding).setMetadata(this.inputFormat.metadata).setCustomData(this.inputFormat.customData).setId(this.inputFormat.f4446id).setLabel(this.inputFormat.label).setLabels(this.inputFormat.labels).setLanguage(this.inputFormat.language).setSelectionFlags(this.inputFormat.selectionFlags).setRoleFlags(this.inputFormat.roleFlags).build(), 0, getChannelMapping(this.decoder));
            this.audioTrackNeedsConfigure = false;
        }
        AudioSink audioSink = this.audioSink;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer2 = this.outputBuffer;
        if (!audioSink.handleBuffer(simpleDecoderOutputBuffer2.data, simpleDecoderOutputBuffer2.timeUs, 1)) {
            this.nextBufferToWritePresentationTimeUs = this.outputBuffer.timeUs;
            return false;
        }
        this.decoderCounters.renderedOutputBufferCount++;
        this.outputBuffer.release();
        this.outputBuffer = null;
        return true;
    }

    private boolean feedInputBuffer() throws DecoderException, ExoPlaybackException {
        T t11 = this.decoder;
        if (t11 == null || this.decoderReinitializationState == 2 || this.inputStreamEnded) {
            return false;
        }
        if (this.inputBuffer == null) {
            DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) t11.dequeueInputBuffer();
            this.inputBuffer = decoderInputBuffer;
            if (decoderInputBuffer == null) {
                return false;
            }
        }
        if (this.decoderReinitializationState == 1) {
            this.inputBuffer.setFlags(4);
            this.decoder.queueInputBuffer(this.inputBuffer);
            this.inputBuffer = null;
            this.decoderReinitializationState = 2;
            return false;
        }
        FormatHolder formatHolder = getFormatHolder();
        int readSource = readSource(formatHolder, this.inputBuffer, 0);
        if (readSource == -5) {
            onInputFormatChanged(formatHolder);
            return true;
        }
        if (readSource != -4) {
            if (readSource != -3) {
                throw new IllegalStateException();
            }
            if (hasReadStreamToEnd()) {
                this.lastBufferInStreamPresentationTimeUs = this.largestQueuedPresentationTimeUs;
            }
            return false;
        }
        if (this.inputBuffer.isEndOfStream()) {
            this.inputStreamEnded = true;
            this.lastBufferInStreamPresentationTimeUs = this.largestQueuedPresentationTimeUs;
            this.decoder.queueInputBuffer(this.inputBuffer);
            this.inputBuffer = null;
            return false;
        }
        if (!this.firstStreamSampleRead) {
            this.firstStreamSampleRead = true;
            this.inputBuffer.addFlag(C.BUFFER_FLAG_FIRST_SAMPLE);
        }
        this.largestQueuedPresentationTimeUs = this.inputBuffer.timeUs;
        if (hasReadStreamToEnd() || this.inputBuffer.isLastSample()) {
            this.lastBufferInStreamPresentationTimeUs = this.largestQueuedPresentationTimeUs;
        }
        this.inputBuffer.flip();
        DecoderInputBuffer decoderInputBuffer2 = this.inputBuffer;
        decoderInputBuffer2.format = this.inputFormat;
        this.decoder.queueInputBuffer(decoderInputBuffer2);
        this.decoderReceivedBuffers = true;
        this.decoderCounters.queuedInputBufferCount++;
        this.inputBuffer = null;
        return true;
    }

    private void flushDecoder() throws ExoPlaybackException {
        if (this.decoderReinitializationState != 0) {
            releaseDecoder();
            maybeInitDecoder();
            return;
        }
        this.inputBuffer = null;
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = this.outputBuffer;
        if (simpleDecoderOutputBuffer != null) {
            simpleDecoderOutputBuffer.release();
            this.outputBuffer = null;
        }
        Decoder decoder = (Decoder) Assertions.checkNotNull(this.decoder);
        decoder.flush();
        decoder.setOutputStartTimeUs(getLastResetPositionUs());
        this.decoderReceivedBuffers = false;
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
            TraceUtil.beginSection("createAudioDecoder");
            T createDecoder = createDecoder(this.inputFormat, cryptoConfig);
            this.decoder = createDecoder;
            createDecoder.setOutputStartTimeUs(getLastResetPositionUs());
            TraceUtil.endSection();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.eventDispatcher.decoderInitialized(this.decoder.getName(), elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
            this.decoderCounters.decoderInitCount++;
        } catch (DecoderException e11) {
            Log.e(TAG, "Audio codec error", e11);
            this.eventDispatcher.audioCodecError(e11);
            throw createRendererException(e11, this.inputFormat, 4001);
        } catch (OutOfMemoryError e12) {
            throw createRendererException(e12, this.inputFormat, 4001);
        }
    }

    private void onInputFormatChanged(FormatHolder formatHolder) throws ExoPlaybackException {
        Format format = (Format) Assertions.checkNotNull(formatHolder.format);
        setSourceDrmSession(formatHolder.drmSession);
        Format format2 = this.inputFormat;
        this.inputFormat = format;
        this.encoderDelay = format.encoderDelay;
        this.encoderPadding = format.encoderPadding;
        T t11 = this.decoder;
        if (t11 == null) {
            maybeInitDecoder();
            this.eventDispatcher.inputFormatChanged(this.inputFormat, null);
            return;
        }
        DecoderReuseEvaluation decoderReuseEvaluation = this.sourceDrmSession != this.decoderDrmSession ? new DecoderReuseEvaluation(t11.getName(), format2, format, 0, 128) : canReuseDecoder(t11.getName(), format2, format);
        if (decoderReuseEvaluation.result == 0) {
            if (this.decoderReceivedBuffers) {
                this.decoderReinitializationState = 1;
            } else {
                releaseDecoder();
                maybeInitDecoder();
                this.audioTrackNeedsConfigure = true;
            }
        }
        this.eventDispatcher.inputFormatChanged(this.inputFormat, decoderReuseEvaluation);
    }

    private void processEndOfStream() throws AudioSink.WriteException {
        this.outputStreamEnded = true;
        this.audioSink.playToEndOfStream();
        this.nextBufferToWritePresentationTimeUs = this.lastBufferInStreamPresentationTimeUs;
        this.isRendereringToEndOfStream = true;
    }

    private void processFirstSampleOfStream() {
        this.audioSink.handleDiscontinuity();
        if (this.pendingOutputStreamOffsetCount != 0) {
            setOutputStreamOffsetUs(this.pendingOutputStreamOffsetsUs[0]);
            int i11 = this.pendingOutputStreamOffsetCount - 1;
            this.pendingOutputStreamOffsetCount = i11;
            long[] jArr = this.pendingOutputStreamOffsetsUs;
            System.arraycopy(jArr, 1, jArr, 0, i11);
        }
    }

    private void releaseDecoder() {
        this.inputBuffer = null;
        this.outputBuffer = null;
        this.decoderReinitializationState = 0;
        this.decoderReceivedBuffers = false;
        this.largestQueuedPresentationTimeUs = C.TIME_UNSET;
        this.lastBufferInStreamPresentationTimeUs = C.TIME_UNSET;
        T t11 = this.decoder;
        if (t11 != null) {
            this.decoderCounters.decoderReleaseCount++;
            t11.release();
            this.eventDispatcher.decoderReleased(this.decoder.getName());
            this.decoder = null;
        }
        setDecoderDrmSession(null);
    }

    private void setDecoderDrmSession(@Nullable DrmSession drmSession) {
        DrmSession.replaceSession(this.decoderDrmSession, drmSession);
        this.decoderDrmSession = drmSession;
    }

    private void setOutputStreamOffsetUs(long j11) {
        this.outputStreamOffsetUs = j11;
        if (j11 != C.TIME_UNSET) {
            this.audioSink.setOutputStreamOffsetUs(j11);
        }
    }

    private void setSourceDrmSession(@Nullable DrmSession drmSession) {
        DrmSession.replaceSession(this.sourceDrmSession, drmSession);
        this.sourceDrmSession = drmSession;
    }

    private void updateCurrentPosition() {
        long currentPositionUs = this.audioSink.getCurrentPositionUs(isEnded());
        if (currentPositionUs != Long.MIN_VALUE) {
            if (!this.allowPositionDiscontinuity) {
                currentPositionUs = Math.max(this.currentPositionUs, currentPositionUs);
            }
            this.currentPositionUs = currentPositionUs;
            this.allowPositionDiscontinuity = false;
        }
    }

    @uo.g
    public DecoderReuseEvaluation canReuseDecoder(String str, Format format, Format format2) {
        return new DecoderReuseEvaluation(str, format, format2, 0, 1);
    }

    @uo.g
    public abstract T createDecoder(Format format, @Nullable CryptoConfig cryptoConfig) throws DecoderException;

    @Nullable
    @uo.g
    public int[] getChannelMapping(T t11) {
        return null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public long getDurationToProgressUs(long j11, long j12) {
        if (this.nextBufferToWritePresentationTimeUs == C.TIME_UNSET) {
            return super.getDurationToProgressUs(j11, j12);
        }
        long audioTrackBufferSizeUs = this.audioSink.getAudioTrackBufferSizeUs();
        if (!this.isRendereringToEndOfStream && audioTrackBufferSizeUs == C.TIME_UNSET) {
            return super.getDurationToProgressUs(j11, j12);
        }
        long j13 = this.nextBufferToWritePresentationTimeUs - j11;
        if (audioTrackBufferSizeUs != C.TIME_UNSET) {
            j13 = Math.min(audioTrackBufferSizeUs, j13);
        }
        long j14 = (long) ((j13 / (getPlaybackParameters() != null ? getPlaybackParameters().speed : 1.0f)) / 2.0f);
        if (this.isStarted) {
            j14 -= Util.msToUs(getClock().elapsedRealtime()) - j12;
        }
        return Math.max(10000L, j14);
    }

    @uo.g
    public abstract Format getOutputFormat(T t11);

    @Override // androidx.media3.exoplayer.MediaClock
    public PlaybackParameters getPlaybackParameters() {
        return this.audioSink.getPlaybackParameters();
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public long getPositionUs() {
        if (getState() == 2) {
            updateCurrentPosition();
        }
        return this.currentPositionUs;
    }

    public final int getSinkFormatSupport(Format format) {
        return this.audioSink.getFormatSupport(format);
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i11, @Nullable Object obj) throws ExoPlaybackException {
        if (i11 == 2) {
            this.audioSink.setVolume(((Float) obj).floatValue());
            return;
        }
        if (i11 == 3) {
            this.audioSink.setAudioAttributes((AudioAttributes) obj);
            return;
        }
        if (i11 == 6) {
            this.audioSink.setAuxEffectInfo((AuxEffectInfo) obj);
            return;
        }
        if (i11 == 12) {
            if (Util.SDK_INT >= 23) {
                Api23.setAudioSinkPreferredDevice(this.audioSink, obj);
            }
        } else if (i11 == 9) {
            this.audioSink.setSkipSilenceEnabled(((Boolean) obj).booleanValue());
        } else if (i11 != 10) {
            super.handleMessage(i11, obj);
        } else {
            this.audioSink.setAudioSessionId(((Integer) obj).intValue());
        }
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public boolean hasSkippedSilenceSinceLastCall() {
        boolean z11 = this.hasPendingReportedSkippedSilence;
        this.hasPendingReportedSkippedSilence = false;
        return z11;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded && this.audioSink.isEnded();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        if (this.audioSink.hasPendingData()) {
            return true;
        }
        if (this.inputFormat != null) {
            return isSourceReady() || this.outputBuffer != null;
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onDisabled() {
        this.inputFormat = null;
        this.audioTrackNeedsConfigure = true;
        setOutputStreamOffsetUs(C.TIME_UNSET);
        this.hasPendingReportedSkippedSilence = false;
        this.nextBufferToWritePresentationTimeUs = C.TIME_UNSET;
        this.isRendereringToEndOfStream = false;
        try {
            setSourceDrmSession(null);
            releaseDecoder();
            this.audioSink.reset();
        } finally {
            this.eventDispatcher.disabled(this.decoderCounters);
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onEnabled(boolean z11, boolean z12) throws ExoPlaybackException {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.decoderCounters = decoderCounters;
        this.eventDispatcher.enabled(decoderCounters);
        if (getConfiguration().tunneling) {
            this.audioSink.enableTunnelingV21();
        } else {
            this.audioSink.disableTunneling();
        }
        this.audioSink.setPlayerId(getPlayerId());
        this.audioSink.setClock(getClock());
    }

    @uo.g
    @CallSuper
    public void onPositionDiscontinuity() {
        this.allowPositionDiscontinuity = true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onPositionReset(long j11, boolean z11) throws ExoPlaybackException {
        this.audioSink.flush();
        this.currentPositionUs = j11;
        this.nextBufferToWritePresentationTimeUs = C.TIME_UNSET;
        this.isRendereringToEndOfStream = false;
        this.hasPendingReportedSkippedSilence = false;
        this.allowPositionDiscontinuity = true;
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        if (this.decoder != null) {
            flushDecoder();
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onStarted() {
        this.audioSink.play();
        this.isStarted = true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onStopped() {
        updateCurrentPosition();
        this.audioSink.pause();
        this.isStarted = false;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onStreamChanged(Format[] formatArr, long j11, long j12, MediaSource.MediaPeriodId mediaPeriodId) throws ExoPlaybackException {
        super.onStreamChanged(formatArr, j11, j12, mediaPeriodId);
        this.firstStreamSampleRead = false;
        if (this.outputStreamOffsetUs == C.TIME_UNSET) {
            setOutputStreamOffsetUs(j12);
            return;
        }
        int i11 = this.pendingOutputStreamOffsetCount;
        if (i11 == this.pendingOutputStreamOffsetsUs.length) {
            Log.w(TAG, "Too many stream changes, so dropping offset: " + this.pendingOutputStreamOffsetsUs[this.pendingOutputStreamOffsetCount - 1]);
        } else {
            this.pendingOutputStreamOffsetCount = i11 + 1;
        }
        this.pendingOutputStreamOffsetsUs[this.pendingOutputStreamOffsetCount - 1] = j12;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j11, long j12) throws ExoPlaybackException {
        if (this.outputStreamEnded) {
            try {
                this.audioSink.playToEndOfStream();
                this.nextBufferToWritePresentationTimeUs = this.lastBufferInStreamPresentationTimeUs;
                this.isRendereringToEndOfStream = true;
                return;
            } catch (AudioSink.WriteException e11) {
                throw createRendererException(e11, e11.format, e11.isRecoverable, PlaybackException.ERROR_CODE_AUDIO_TRACK_WRITE_FAILED);
            }
        }
        if (this.inputFormat == null) {
            FormatHolder formatHolder = getFormatHolder();
            this.flagsOnlyBuffer.clear();
            int readSource = readSource(formatHolder, this.flagsOnlyBuffer, 2);
            if (readSource != -5) {
                if (readSource == -4) {
                    Assertions.checkState(this.flagsOnlyBuffer.isEndOfStream());
                    this.inputStreamEnded = true;
                    try {
                        processEndOfStream();
                        return;
                    } catch (AudioSink.WriteException e12) {
                        throw createRendererException(e12, null, PlaybackException.ERROR_CODE_AUDIO_TRACK_WRITE_FAILED);
                    }
                }
                return;
            }
            onInputFormatChanged(formatHolder);
        }
        maybeInitDecoder();
        if (this.decoder != null) {
            try {
                TraceUtil.beginSection("drainAndFeed");
                while (drainOutputBuffer()) {
                }
                while (feedInputBuffer()) {
                }
                TraceUtil.endSection();
                this.decoderCounters.ensureUpdated();
            } catch (DecoderException e13) {
                Log.e(TAG, "Audio codec error", e13);
                this.eventDispatcher.audioCodecError(e13);
                throw createRendererException(e13, this.inputFormat, PlaybackException.ERROR_CODE_DECODING_FAILED);
            } catch (AudioSink.ConfigurationException e14) {
                throw createRendererException(e14, e14.format, PlaybackException.ERROR_CODE_AUDIO_TRACK_INIT_FAILED);
            } catch (AudioSink.InitializationException e15) {
                throw createRendererException(e15, e15.format, e15.isRecoverable, PlaybackException.ERROR_CODE_AUDIO_TRACK_INIT_FAILED);
            } catch (AudioSink.WriteException e16) {
                throw createRendererException(e16, e16.format, e16.isRecoverable, PlaybackException.ERROR_CODE_AUDIO_TRACK_WRITE_FAILED);
            }
        }
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        this.audioSink.setPlaybackParameters(playbackParameters);
    }

    public final boolean sinkSupportsFormat(Format format) {
        return this.audioSink.supportsFormat(format);
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final int supportsFormat(Format format) {
        if (!MimeTypes.isAudio(format.sampleMimeType)) {
            return RendererCapabilities.create(0);
        }
        int supportsFormatInternal = supportsFormatInternal(format);
        return supportsFormatInternal <= 2 ? RendererCapabilities.create(supportsFormatInternal) : RendererCapabilities.create(supportsFormatInternal, 8, 32);
    }

    @uo.g
    public abstract int supportsFormatInternal(Format format);

    public DecoderAudioRenderer(@Nullable Handler handler, @Nullable AudioRendererEventListener audioRendererEventListener, AudioProcessor... audioProcessorArr) {
        this(handler, audioRendererEventListener, null, audioProcessorArr);
    }

    public DecoderAudioRenderer(@Nullable Handler handler, @Nullable AudioRendererEventListener audioRendererEventListener, AudioCapabilities audioCapabilities, AudioProcessor... audioProcessorArr) {
        this(handler, audioRendererEventListener, new DefaultAudioSink.Builder().setAudioCapabilities((AudioCapabilities) ho.b0.a(audioCapabilities, AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES)).setAudioProcessors(audioProcessorArr).build());
    }

    public DecoderAudioRenderer(@Nullable Handler handler, @Nullable AudioRendererEventListener audioRendererEventListener, AudioSink audioSink) {
        super(1);
        this.eventDispatcher = new AudioRendererEventListener.EventDispatcher(handler, audioRendererEventListener);
        this.audioSink = audioSink;
        audioSink.setListener(new AudioSinkListener());
        this.flagsOnlyBuffer = DecoderInputBuffer.newNoDataInstance();
        this.decoderReinitializationState = 0;
        this.audioTrackNeedsConfigure = true;
        setOutputStreamOffsetUs(C.TIME_UNSET);
        this.pendingOutputStreamOffsetsUs = new long[10];
        this.largestQueuedPresentationTimeUs = C.TIME_UNSET;
        this.lastBufferInStreamPresentationTimeUs = C.TIME_UNSET;
        this.nextBufferToWritePresentationTimeUs = C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    @Nullable
    public MediaClock getMediaClock() {
        return this;
    }
}
