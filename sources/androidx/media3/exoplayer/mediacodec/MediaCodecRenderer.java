package androidx.media3.exoplayer.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.OggOpusAudioPacketizer;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.FrameworkCryptoConfig;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.extractor.OpusUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public abstract class MediaCodecRenderer extends BaseRenderer {
    private static final byte[] ADAPTATION_WORKAROUND_BUFFER = {0, 0, 1, 103, 66, com.baicizhan.main.vld.bonding.j.f25378c, 11, -38, s60.e.f88061c, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, ho.c.B, com.baicizhan.main.vld.bonding.j.f25376a, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private static final int ADAPTATION_WORKAROUND_MODE_ALWAYS = 2;
    private static final int ADAPTATION_WORKAROUND_MODE_NEVER = 0;
    private static final int ADAPTATION_WORKAROUND_MODE_SAME_RESOLUTION = 1;
    private static final int ADAPTATION_WORKAROUND_SLICE_WIDTH_HEIGHT = 32;
    protected static final float CODEC_OPERATING_RATE_UNSET = -1.0f;
    private static final int DRAIN_ACTION_FLUSH = 1;
    private static final int DRAIN_ACTION_FLUSH_AND_UPDATE_DRM_SESSION = 2;
    private static final int DRAIN_ACTION_NONE = 0;
    private static final int DRAIN_ACTION_REINITIALIZE = 3;
    private static final int DRAIN_STATE_NONE = 0;
    private static final int DRAIN_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int DRAIN_STATE_WAIT_END_OF_STREAM = 2;
    private static final long MAX_CODEC_HOTSWAP_TIME_MS = 1000;
    private static final int RECONFIGURATION_STATE_NONE = 0;
    private static final int RECONFIGURATION_STATE_QUEUE_PENDING = 2;
    private static final int RECONFIGURATION_STATE_WRITE_PENDING = 1;
    private static final String TAG = "MediaCodecRenderer";
    private final float assumedMinimumCodecOperatingRate;

    @Nullable
    private ArrayDeque<MediaCodecInfo> availableCodecInfos;
    private final DecoderInputBuffer buffer;
    private final BatchBuffer bypassBatchBuffer;
    private boolean bypassDrainAndReinitialize;
    private boolean bypassEnabled;
    private final DecoderInputBuffer bypassSampleBuffer;
    private boolean bypassSampleBufferPending;

    @Nullable
    private MediaCodecAdapter codec;
    private int codecAdaptationWorkaroundMode;
    private final MediaCodecAdapter.Factory codecAdapterFactory;
    private int codecDrainAction;
    private int codecDrainState;

    @Nullable
    private DrmSession codecDrmSession;
    private boolean codecHasOutputMediaFormat;
    private long codecHotswapDeadlineMs;

    @Nullable
    private MediaCodecInfo codecInfo;

    @Nullable
    private Format codecInputFormat;
    private boolean codecNeedsAdaptationWorkaroundBuffer;
    private boolean codecNeedsEosFlushWorkaround;
    private boolean codecNeedsEosOutputExceptionWorkaround;
    private boolean codecNeedsEosPropagation;
    private boolean codecNeedsSosFlushWorkaround;
    private float codecOperatingRate;

    @Nullable
    private MediaFormat codecOutputMediaFormat;
    private boolean codecOutputMediaFormatChanged;
    private boolean codecReceivedBuffers;
    private boolean codecReceivedEos;
    private int codecReconfigurationState;
    private boolean codecReconfigured;
    private boolean codecRegisteredOnBufferAvailableListener;
    private float currentPlaybackSpeed;
    protected DecoderCounters decoderCounters;
    private final boolean enableDecoderFallback;
    private boolean experimentalEnableProcessedStreamChangedAtStart;

    @Nullable
    private Format inputFormat;
    private int inputIndex;
    private boolean inputStreamEnded;
    private boolean isDecodeOnlyOutputBuffer;
    private boolean isLastOutputBuffer;
    private long largestQueuedPresentationTimeUs;
    private long lastBufferInStreamPresentationTimeUs;
    private long lastOutputBufferProcessedRealtimeMs;
    private long lastProcessedOutputBufferTimeUs;
    private final MediaCodecSelector mediaCodecSelector;

    @Nullable
    private MediaCrypto mediaCrypto;
    private boolean needToNotifyOutputFormatChangeAfterStreamChange;
    private final DecoderInputBuffer noDataBuffer;
    private final OggOpusAudioPacketizer oggOpusAudioPacketizer;

    @Nullable
    private ByteBuffer outputBuffer;
    private final MediaCodec.BufferInfo outputBufferInfo;
    private Format outputFormat;
    private int outputIndex;
    private boolean outputStreamEnded;
    private OutputStreamInfo outputStreamInfo;
    private boolean pendingOutputEndOfStream;
    private final ArrayDeque<OutputStreamInfo> pendingOutputStreamChanges;

    @Nullable
    private ExoPlaybackException pendingPlaybackException;

    @Nullable
    private DecoderInitializationException preferredDecoderInitializationException;
    private long renderTimeLimitMs;
    private boolean shouldSkipAdaptationWorkaroundOutputBuffer;

    @Nullable
    private DrmSession sourceDrmSession;
    private float targetPlaybackSpeed;
    private boolean waitingForFirstSampleInFormat;
    private Renderer.WakeupListener wakeupListener;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(31)
    public static final class Api31 {
        private Api31() {
        }

        public static void setLogSessionIdToMediaCodecFormat(MediaCodecAdapter.Configuration configuration, PlayerId playerId) {
            LogSessionId logSessionId;
            boolean equals;
            String stringId;
            LogSessionId logSessionId2 = playerId.getLogSessionId();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = logSessionId2.equals(logSessionId);
            if (equals) {
                return;
            }
            MediaFormat mediaFormat = configuration.mediaFormat;
            stringId = logSessionId2.getStringId();
            mediaFormat.setString("log-session-id", stringId);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class MediaCodecRendererCodecAdapterListener implements MediaCodecAdapter.OnBufferAvailableListener {
        private MediaCodecRendererCodecAdapterListener() {
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnBufferAvailableListener
        public void onInputBufferAvailable() {
            if (MediaCodecRenderer.this.wakeupListener != null) {
                MediaCodecRenderer.this.wakeupListener.onWakeup();
            }
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnBufferAvailableListener
        public void onOutputBufferAvailable() {
            if (MediaCodecRenderer.this.wakeupListener != null) {
                MediaCodecRenderer.this.wakeupListener.onWakeup();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class OutputStreamInfo {
        public static final OutputStreamInfo UNSET = new OutputStreamInfo(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET);
        public final TimedValueQueue<Format> formatQueue = new TimedValueQueue<>();
        public final long previousStreamLastBufferTimeUs;
        public final long startPositionUs;
        public final long streamOffsetUs;

        public OutputStreamInfo(long j11, long j12, long j13) {
            this.previousStreamLastBufferTimeUs = j11;
            this.startPositionUs = j12;
            this.streamOffsetUs = j13;
        }
    }

    public MediaCodecRenderer(int i11, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, boolean z11, float f11) {
        super(i11);
        this.codecAdapterFactory = factory;
        this.mediaCodecSelector = (MediaCodecSelector) Assertions.checkNotNull(mediaCodecSelector);
        this.enableDecoderFallback = z11;
        this.assumedMinimumCodecOperatingRate = f11;
        this.noDataBuffer = DecoderInputBuffer.newNoDataInstance();
        this.buffer = new DecoderInputBuffer(0);
        this.bypassSampleBuffer = new DecoderInputBuffer(2);
        BatchBuffer batchBuffer = new BatchBuffer();
        this.bypassBatchBuffer = batchBuffer;
        this.outputBufferInfo = new MediaCodec.BufferInfo();
        this.currentPlaybackSpeed = 1.0f;
        this.targetPlaybackSpeed = 1.0f;
        this.renderTimeLimitMs = C.TIME_UNSET;
        this.pendingOutputStreamChanges = new ArrayDeque<>();
        this.outputStreamInfo = OutputStreamInfo.UNSET;
        batchBuffer.ensureSpaceForWrite(0);
        batchBuffer.data.order(ByteOrder.nativeOrder());
        this.oggOpusAudioPacketizer = new OggOpusAudioPacketizer();
        this.codecOperatingRate = -1.0f;
        this.codecAdaptationWorkaroundMode = 0;
        this.codecReconfigurationState = 0;
        this.inputIndex = -1;
        this.outputIndex = -1;
        this.codecHotswapDeadlineMs = C.TIME_UNSET;
        this.largestQueuedPresentationTimeUs = C.TIME_UNSET;
        this.lastBufferInStreamPresentationTimeUs = C.TIME_UNSET;
        this.lastProcessedOutputBufferTimeUs = C.TIME_UNSET;
        this.lastOutputBufferProcessedRealtimeMs = C.TIME_UNSET;
        this.codecDrainState = 0;
        this.codecDrainAction = 0;
        this.decoderCounters = new DecoderCounters();
    }

    private void bypassRead() throws ExoPlaybackException {
        Assertions.checkState(!this.inputStreamEnded);
        FormatHolder formatHolder = getFormatHolder();
        this.bypassSampleBuffer.clear();
        do {
            this.bypassSampleBuffer.clear();
            int readSource = readSource(formatHolder, this.bypassSampleBuffer, 0);
            if (readSource == -5) {
                onInputFormatChanged(formatHolder);
                return;
            }
            if (readSource == -4) {
                if (!this.bypassSampleBuffer.isEndOfStream()) {
                    this.largestQueuedPresentationTimeUs = Math.max(this.largestQueuedPresentationTimeUs, this.bypassSampleBuffer.timeUs);
                    if (hasReadStreamToEnd() || this.buffer.isLastSample()) {
                        this.lastBufferInStreamPresentationTimeUs = this.largestQueuedPresentationTimeUs;
                    }
                    if (this.waitingForFirstSampleInFormat) {
                        Format format = (Format) Assertions.checkNotNull(this.inputFormat);
                        this.outputFormat = format;
                        if (Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_OPUS) && !this.outputFormat.initializationData.isEmpty()) {
                            this.outputFormat = this.outputFormat.buildUpon().setEncoderDelay(OpusUtil.getPreSkipSamples(this.outputFormat.initializationData.get(0))).build();
                        }
                        onOutputFormatChanged(this.outputFormat, null);
                        this.waitingForFirstSampleInFormat = false;
                    }
                    this.bypassSampleBuffer.flip();
                    Format format2 = this.outputFormat;
                    if (format2 != null && Objects.equals(format2.sampleMimeType, MimeTypes.AUDIO_OPUS)) {
                        if (this.bypassSampleBuffer.hasSupplementalData()) {
                            DecoderInputBuffer decoderInputBuffer = this.bypassSampleBuffer;
                            decoderInputBuffer.format = this.outputFormat;
                            handleInputBufferSupplementalData(decoderInputBuffer);
                        }
                        if (OpusUtil.needToDecodeOpusFrame(getLastResetPositionUs(), this.bypassSampleBuffer.timeUs)) {
                            this.oggOpusAudioPacketizer.packetize(this.bypassSampleBuffer, this.outputFormat.initializationData);
                        }
                    }
                    if (!haveBypassBatchBufferAndNewSampleSameDecodeOnlyState()) {
                        break;
                    }
                } else {
                    this.inputStreamEnded = true;
                    this.lastBufferInStreamPresentationTimeUs = this.largestQueuedPresentationTimeUs;
                    return;
                }
            } else {
                if (readSource != -3) {
                    throw new IllegalStateException();
                }
                if (hasReadStreamToEnd()) {
                    this.lastBufferInStreamPresentationTimeUs = this.largestQueuedPresentationTimeUs;
                    return;
                }
                return;
            }
        } while (this.bypassBatchBuffer.append(this.bypassSampleBuffer));
        this.bypassSampleBufferPending = true;
    }

    private boolean bypassRender(long j11, long j12) throws ExoPlaybackException {
        boolean z11;
        Assertions.checkState(!this.outputStreamEnded);
        if (this.bypassBatchBuffer.hasSamples()) {
            BatchBuffer batchBuffer = this.bypassBatchBuffer;
            z11 = false;
            if (!processOutputBuffer(j11, j12, null, batchBuffer.data, this.outputIndex, 0, batchBuffer.getSampleCount(), this.bypassBatchBuffer.getFirstSampleTimeUs(), isDecodeOnly(getLastResetPositionUs(), this.bypassBatchBuffer.getLastSampleTimeUs()), this.bypassBatchBuffer.isEndOfStream(), (Format) Assertions.checkNotNull(this.outputFormat))) {
                return false;
            }
            onProcessedOutputBuffer(this.bypassBatchBuffer.getLastSampleTimeUs());
            this.bypassBatchBuffer.clear();
        } else {
            z11 = false;
        }
        if (this.inputStreamEnded) {
            this.outputStreamEnded = true;
            return z11;
        }
        if (this.bypassSampleBufferPending) {
            Assertions.checkState(this.bypassBatchBuffer.append(this.bypassSampleBuffer));
            this.bypassSampleBufferPending = z11;
        }
        if (this.bypassDrainAndReinitialize) {
            if (this.bypassBatchBuffer.hasSamples()) {
                return true;
            }
            disableBypass();
            this.bypassDrainAndReinitialize = z11;
            maybeInitCodecOrBypass();
            if (!this.bypassEnabled) {
                return z11;
            }
        }
        bypassRead();
        if (this.bypassBatchBuffer.hasSamples()) {
            this.bypassBatchBuffer.flip();
        }
        if (this.bypassBatchBuffer.hasSamples() || this.inputStreamEnded || this.bypassDrainAndReinitialize) {
            return true;
        }
        return z11;
    }

    private int codecAdaptationWorkaroundMode(String str) {
        int i11 = Util.SDK_INT;
        if (i11 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = Build.MODEL;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i11 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = Build.DEVICE;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private static boolean codecNeedsEosFlushWorkaround(String str) {
        return Util.SDK_INT <= 23 && "OMX.google.vorbis.decoder".equals(str);
    }

    private static boolean codecNeedsEosOutputExceptionWorkaround(String str) {
        return Util.SDK_INT == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private static boolean codecNeedsEosPropagationWorkaround(MediaCodecInfo mediaCodecInfo) {
        String str = mediaCodecInfo.name;
        int i11 = Util.SDK_INT;
        if (i11 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) {
            return true;
        }
        if (i11 > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) {
            return "Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && mediaCodecInfo.secure;
        }
        return true;
    }

    private static boolean codecNeedsSosFlushWorkaround(String str) {
        return Util.SDK_INT == 29 && "c2.android.aac.decoder".equals(str);
    }

    private void disableBypass() {
        this.bypassDrainAndReinitialize = false;
        this.bypassBatchBuffer.clear();
        this.bypassSampleBuffer.clear();
        this.bypassSampleBufferPending = false;
        this.bypassEnabled = false;
        this.oggOpusAudioPacketizer.reset();
    }

    private boolean drainAndFlushCodec() {
        if (this.codecReceivedBuffers) {
            this.codecDrainState = 1;
            if (this.codecNeedsEosFlushWorkaround) {
                this.codecDrainAction = 3;
                return false;
            }
            this.codecDrainAction = 1;
        }
        return true;
    }

    private void drainAndReinitializeCodec() throws ExoPlaybackException {
        if (!this.codecReceivedBuffers) {
            reinitializeCodec();
        } else {
            this.codecDrainState = 1;
            this.codecDrainAction = 3;
        }
    }

    @TargetApi(23)
    private boolean drainAndUpdateCodecDrmSessionV23() throws ExoPlaybackException {
        if (this.codecReceivedBuffers) {
            this.codecDrainState = 1;
            if (this.codecNeedsEosFlushWorkaround) {
                this.codecDrainAction = 3;
                return false;
            }
            this.codecDrainAction = 2;
        } else {
            updateDrmSessionV23();
        }
        return true;
    }

    private boolean drainOutputBuffer(long j11, long j12) throws ExoPlaybackException {
        boolean z11;
        boolean processOutputBuffer;
        ByteBuffer byteBuffer;
        int i11;
        MediaCodec.BufferInfo bufferInfo;
        int dequeueOutputBufferIndex;
        MediaCodecAdapter mediaCodecAdapter = (MediaCodecAdapter) Assertions.checkNotNull(this.codec);
        if (!hasOutputBuffer()) {
            if (this.codecNeedsEosOutputExceptionWorkaround && this.codecReceivedEos) {
                try {
                    dequeueOutputBufferIndex = mediaCodecAdapter.dequeueOutputBufferIndex(this.outputBufferInfo);
                } catch (IllegalStateException unused) {
                    processEndOfStream();
                    if (this.outputStreamEnded) {
                        releaseCodec();
                    }
                    return false;
                }
            } else {
                dequeueOutputBufferIndex = mediaCodecAdapter.dequeueOutputBufferIndex(this.outputBufferInfo);
            }
            if (dequeueOutputBufferIndex < 0) {
                if (dequeueOutputBufferIndex == -2) {
                    processOutputMediaFormatChanged();
                    return true;
                }
                if (this.codecNeedsEosPropagation && (this.inputStreamEnded || this.codecDrainState == 2)) {
                    processEndOfStream();
                }
                long j13 = this.lastOutputBufferProcessedRealtimeMs;
                if (j13 != C.TIME_UNSET && j13 + 100 < getClock().currentTimeMillis()) {
                    processEndOfStream();
                }
                return false;
            }
            if (this.shouldSkipAdaptationWorkaroundOutputBuffer) {
                this.shouldSkipAdaptationWorkaroundOutputBuffer = false;
                mediaCodecAdapter.releaseOutputBuffer(dequeueOutputBufferIndex, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo2 = this.outputBufferInfo;
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                processEndOfStream();
                return false;
            }
            this.outputIndex = dequeueOutputBufferIndex;
            ByteBuffer outputBuffer = mediaCodecAdapter.getOutputBuffer(dequeueOutputBufferIndex);
            this.outputBuffer = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(this.outputBufferInfo.offset);
                ByteBuffer byteBuffer2 = this.outputBuffer;
                MediaCodec.BufferInfo bufferInfo3 = this.outputBufferInfo;
                byteBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
            }
            this.isDecodeOnlyOutputBuffer = this.outputBufferInfo.presentationTimeUs < getLastResetPositionUs();
            long j14 = this.lastBufferInStreamPresentationTimeUs;
            this.isLastOutputBuffer = j14 != C.TIME_UNSET && j14 <= this.outputBufferInfo.presentationTimeUs;
            updateOutputFormatForTime(this.outputBufferInfo.presentationTimeUs);
        }
        if (this.codecNeedsEosOutputExceptionWorkaround && this.codecReceivedEos) {
            try {
                byteBuffer = this.outputBuffer;
                i11 = this.outputIndex;
                bufferInfo = this.outputBufferInfo;
                z11 = false;
            } catch (IllegalStateException unused2) {
                z11 = false;
            }
            try {
                processOutputBuffer = processOutputBuffer(j11, j12, mediaCodecAdapter, byteBuffer, i11, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.isDecodeOnlyOutputBuffer, this.isLastOutputBuffer, (Format) Assertions.checkNotNull(this.outputFormat));
            } catch (IllegalStateException unused3) {
                processEndOfStream();
                if (this.outputStreamEnded) {
                    releaseCodec();
                }
                return z11;
            }
        } else {
            z11 = false;
            ByteBuffer byteBuffer3 = this.outputBuffer;
            int i12 = this.outputIndex;
            MediaCodec.BufferInfo bufferInfo4 = this.outputBufferInfo;
            processOutputBuffer = processOutputBuffer(j11, j12, mediaCodecAdapter, byteBuffer3, i12, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.isDecodeOnlyOutputBuffer, this.isLastOutputBuffer, (Format) Assertions.checkNotNull(this.outputFormat));
        }
        if (processOutputBuffer) {
            onProcessedOutputBuffer(this.outputBufferInfo.presentationTimeUs);
            boolean z12 = (this.outputBufferInfo.flags & 4) != 0 ? true : z11;
            if (!z12 && this.codecReceivedEos && this.isLastOutputBuffer) {
                this.lastOutputBufferProcessedRealtimeMs = getClock().currentTimeMillis();
            }
            resetOutputBuffer();
            if (!z12) {
                return true;
            }
            processEndOfStream();
        }
        return z11;
    }

    private boolean drmNeedsCodecReinitialization(MediaCodecInfo mediaCodecInfo, Format format, @Nullable DrmSession drmSession, @Nullable DrmSession drmSession2) throws ExoPlaybackException {
        CryptoConfig cryptoConfig;
        CryptoConfig cryptoConfig2;
        if (drmSession == drmSession2) {
            return false;
        }
        if (drmSession2 != null && drmSession != null && (cryptoConfig = drmSession2.getCryptoConfig()) != null && (cryptoConfig2 = drmSession.getCryptoConfig()) != null && cryptoConfig.getClass().equals(cryptoConfig2.getClass())) {
            if (!(cryptoConfig instanceof FrameworkCryptoConfig)) {
                return false;
            }
            if (!drmSession2.getSchemeUuid().equals(drmSession.getSchemeUuid()) || Util.SDK_INT < 23) {
                return true;
            }
            UUID uuid = C.PLAYREADY_UUID;
            if (!uuid.equals(drmSession.getSchemeUuid()) && !uuid.equals(drmSession2.getSchemeUuid())) {
                return !mediaCodecInfo.secure && (drmSession2.getState() == 2 || ((drmSession2.getState() == 3 || drmSession2.getState() == 4) && drmSession2.requiresSecureDecoder((String) Assertions.checkNotNull(format.sampleMimeType))));
            }
        }
        return true;
    }

    private boolean feedInputBuffer() throws ExoPlaybackException {
        int i11;
        if (this.codec == null || (i11 = this.codecDrainState) == 2 || this.inputStreamEnded) {
            return false;
        }
        if (i11 == 0 && shouldReinitCodec()) {
            drainAndReinitializeCodec();
        }
        MediaCodecAdapter mediaCodecAdapter = (MediaCodecAdapter) Assertions.checkNotNull(this.codec);
        if (this.inputIndex < 0) {
            int dequeueInputBufferIndex = mediaCodecAdapter.dequeueInputBufferIndex();
            this.inputIndex = dequeueInputBufferIndex;
            if (dequeueInputBufferIndex < 0) {
                return false;
            }
            this.buffer.data = mediaCodecAdapter.getInputBuffer(dequeueInputBufferIndex);
            this.buffer.clear();
        }
        if (this.codecDrainState == 1) {
            if (!this.codecNeedsEosPropagation) {
                this.codecReceivedEos = true;
                mediaCodecAdapter.queueInputBuffer(this.inputIndex, 0, 0, 0L, 4);
                resetInputBuffer();
            }
            this.codecDrainState = 2;
            return false;
        }
        if (this.codecNeedsAdaptationWorkaroundBuffer) {
            this.codecNeedsAdaptationWorkaroundBuffer = false;
            ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(this.buffer.data);
            byte[] bArr = ADAPTATION_WORKAROUND_BUFFER;
            byteBuffer.put(bArr);
            mediaCodecAdapter.queueInputBuffer(this.inputIndex, 0, bArr.length, 0L, 0);
            resetInputBuffer();
            this.codecReceivedBuffers = true;
            return true;
        }
        if (this.codecReconfigurationState == 1) {
            for (int i12 = 0; i12 < ((Format) Assertions.checkNotNull(this.codecInputFormat)).initializationData.size(); i12++) {
                ((ByteBuffer) Assertions.checkNotNull(this.buffer.data)).put(this.codecInputFormat.initializationData.get(i12));
            }
            this.codecReconfigurationState = 2;
        }
        int position = ((ByteBuffer) Assertions.checkNotNull(this.buffer.data)).position();
        FormatHolder formatHolder = getFormatHolder();
        try {
            int readSource = readSource(formatHolder, this.buffer, 0);
            if (readSource == -3) {
                if (hasReadStreamToEnd()) {
                    this.lastBufferInStreamPresentationTimeUs = this.largestQueuedPresentationTimeUs;
                }
                return false;
            }
            if (readSource == -5) {
                if (this.codecReconfigurationState == 2) {
                    this.buffer.clear();
                    this.codecReconfigurationState = 1;
                }
                onInputFormatChanged(formatHolder);
                return true;
            }
            if (this.buffer.isEndOfStream()) {
                this.lastBufferInStreamPresentationTimeUs = this.largestQueuedPresentationTimeUs;
                if (this.codecReconfigurationState == 2) {
                    this.buffer.clear();
                    this.codecReconfigurationState = 1;
                }
                this.inputStreamEnded = true;
                if (!this.codecReceivedBuffers) {
                    processEndOfStream();
                    return false;
                }
                if (!this.codecNeedsEosPropagation) {
                    this.codecReceivedEos = true;
                    mediaCodecAdapter.queueInputBuffer(this.inputIndex, 0, 0, 0L, 4);
                    resetInputBuffer();
                }
                return false;
            }
            if (!this.codecReceivedBuffers && !this.buffer.isKeyFrame()) {
                this.buffer.clear();
                if (this.codecReconfigurationState == 2) {
                    this.codecReconfigurationState = 1;
                }
                return true;
            }
            if (shouldDiscardDecoderInputBuffer(this.buffer)) {
                return true;
            }
            boolean isEncrypted = this.buffer.isEncrypted();
            if (isEncrypted) {
                this.buffer.cryptoInfo.increaseClearDataFirstSubSampleBy(position);
            }
            long j11 = this.buffer.timeUs;
            if (this.waitingForFirstSampleInFormat) {
                if (this.pendingOutputStreamChanges.isEmpty()) {
                    this.outputStreamInfo.formatQueue.add(j11, (Format) Assertions.checkNotNull(this.inputFormat));
                } else {
                    this.pendingOutputStreamChanges.peekLast().formatQueue.add(j11, (Format) Assertions.checkNotNull(this.inputFormat));
                }
                this.waitingForFirstSampleInFormat = false;
            }
            this.largestQueuedPresentationTimeUs = Math.max(this.largestQueuedPresentationTimeUs, j11);
            if (hasReadStreamToEnd() || this.buffer.isLastSample()) {
                this.lastBufferInStreamPresentationTimeUs = this.largestQueuedPresentationTimeUs;
            }
            this.buffer.flip();
            if (this.buffer.hasSupplementalData()) {
                handleInputBufferSupplementalData(this.buffer);
            }
            onQueueInputBuffer(this.buffer);
            int codecBufferFlags = getCodecBufferFlags(this.buffer);
            if (isEncrypted) {
                ((MediaCodecAdapter) Assertions.checkNotNull(mediaCodecAdapter)).queueSecureInputBuffer(this.inputIndex, 0, this.buffer.cryptoInfo, j11, codecBufferFlags);
            } else {
                ((MediaCodecAdapter) Assertions.checkNotNull(mediaCodecAdapter)).queueInputBuffer(this.inputIndex, 0, ((ByteBuffer) Assertions.checkNotNull(this.buffer.data)).limit(), j11, codecBufferFlags);
            }
            resetInputBuffer();
            this.codecReceivedBuffers = true;
            this.codecReconfigurationState = 0;
            this.decoderCounters.queuedInputBufferCount++;
            return true;
        } catch (DecoderInputBuffer.InsufficientCapacityException e11) {
            onCodecError(e11);
            readSourceOmittingSampleData(0);
            flushCodec();
            return true;
        }
    }

    private void flushCodec() {
        try {
            ((MediaCodecAdapter) Assertions.checkStateNotNull(this.codec)).flush();
        } finally {
            resetCodecStateForFlush();
        }
    }

    private List<MediaCodecInfo> getAvailableCodecInfos(boolean z11) throws MediaCodecUtil.DecoderQueryException {
        Format format = (Format) Assertions.checkNotNull(this.inputFormat);
        List<MediaCodecInfo> decoderInfos = getDecoderInfos(this.mediaCodecSelector, format, z11);
        if (!decoderInfos.isEmpty() || !z11) {
            return decoderInfos;
        }
        List<MediaCodecInfo> decoderInfos2 = getDecoderInfos(this.mediaCodecSelector, format, false);
        if (!decoderInfos2.isEmpty()) {
            Log.w(TAG, "Drm session requires secure decoder for " + format.sampleMimeType + ", but no secure decoder available. Trying to proceed with " + decoderInfos2 + ".");
        }
        return decoderInfos2;
    }

    private boolean hasOutputBuffer() {
        return this.outputIndex >= 0;
    }

    private boolean haveBypassBatchBufferAndNewSampleSameDecodeOnlyState() {
        if (!this.bypassBatchBuffer.hasSamples()) {
            return true;
        }
        long lastResetPositionUs = getLastResetPositionUs();
        return isDecodeOnly(lastResetPositionUs, this.bypassBatchBuffer.getLastSampleTimeUs()) == isDecodeOnly(lastResetPositionUs, this.bypassSampleBuffer.timeUs);
    }

    private void initBypass(Format format) {
        disableBypass();
        String str = format.sampleMimeType;
        if (MimeTypes.AUDIO_AAC.equals(str) || MimeTypes.AUDIO_MPEG.equals(str) || MimeTypes.AUDIO_OPUS.equals(str)) {
            this.bypassBatchBuffer.setMaxSampleCount(32);
        } else {
            this.bypassBatchBuffer.setMaxSampleCount(1);
        }
        this.bypassEnabled = true;
    }

    private void initCodec(MediaCodecInfo mediaCodecInfo, @Nullable MediaCrypto mediaCrypto) throws Exception {
        Format format = (Format) Assertions.checkNotNull(this.inputFormat);
        String str = mediaCodecInfo.name;
        int i11 = Util.SDK_INT;
        float codecOperatingRateV23 = i11 < 23 ? -1.0f : getCodecOperatingRateV23(this.targetPlaybackSpeed, format, getStreamFormats());
        float f11 = codecOperatingRateV23 > this.assumedMinimumCodecOperatingRate ? codecOperatingRateV23 : -1.0f;
        long elapsedRealtime = getClock().elapsedRealtime();
        MediaCodecAdapter.Configuration mediaCodecConfiguration = getMediaCodecConfiguration(mediaCodecInfo, format, mediaCrypto, f11);
        if (i11 >= 31) {
            Api31.setLogSessionIdToMediaCodecFormat(mediaCodecConfiguration, getPlayerId());
        }
        try {
            TraceUtil.beginSection("createCodec:" + str);
            MediaCodecAdapter createAdapter = this.codecAdapterFactory.createAdapter(mediaCodecConfiguration);
            this.codec = createAdapter;
            this.codecRegisteredOnBufferAvailableListener = createAdapter.registerOnBufferAvailableListener(new MediaCodecRendererCodecAdapterListener());
            TraceUtil.endSection();
            long elapsedRealtime2 = getClock().elapsedRealtime();
            if (!mediaCodecInfo.isFormatSupported(format)) {
                Log.w(TAG, Util.formatInvariant("Format exceeds selected codec's capabilities [%s, %s]", Format.toLogString(format), str));
            }
            this.codecInfo = mediaCodecInfo;
            this.codecOperatingRate = f11;
            this.codecInputFormat = format;
            this.codecAdaptationWorkaroundMode = codecAdaptationWorkaroundMode(str);
            this.codecNeedsSosFlushWorkaround = codecNeedsSosFlushWorkaround(str);
            this.codecNeedsEosFlushWorkaround = codecNeedsEosFlushWorkaround(str);
            this.codecNeedsEosOutputExceptionWorkaround = codecNeedsEosOutputExceptionWorkaround(str);
            this.codecNeedsEosPropagation = codecNeedsEosPropagationWorkaround(mediaCodecInfo) || getCodecNeedsEosPropagation();
            if (((MediaCodecAdapter) Assertions.checkNotNull(this.codec)).needsReconfiguration()) {
                this.codecReconfigured = true;
                this.codecReconfigurationState = 1;
                this.codecNeedsAdaptationWorkaroundBuffer = this.codecAdaptationWorkaroundMode != 0;
            }
            if (getState() == 2) {
                this.codecHotswapDeadlineMs = getClock().elapsedRealtime() + 1000;
            }
            this.decoderCounters.decoderInitCount++;
            onCodecInitialized(str, mediaCodecConfiguration, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Throwable th2) {
            TraceUtil.endSection();
            throw th2;
        }
    }

    @RequiresNonNull({"this.codecDrmSession"})
    private boolean initMediaCryptoIfDrmSessionReady() throws ExoPlaybackException {
        Assertions.checkState(this.mediaCrypto == null);
        DrmSession drmSession = this.codecDrmSession;
        CryptoConfig cryptoConfig = drmSession.getCryptoConfig();
        if (FrameworkCryptoConfig.WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC && (cryptoConfig instanceof FrameworkCryptoConfig)) {
            int state = drmSession.getState();
            if (state == 1) {
                DrmSession.DrmSessionException drmSessionException = (DrmSession.DrmSessionException) Assertions.checkNotNull(drmSession.getError());
                throw createRendererException(drmSessionException, this.inputFormat, drmSessionException.errorCode);
            }
            if (state != 4) {
                return false;
            }
        }
        if (cryptoConfig == null) {
            return drmSession.getError() != null;
        }
        if (cryptoConfig instanceof FrameworkCryptoConfig) {
            FrameworkCryptoConfig frameworkCryptoConfig = (FrameworkCryptoConfig) cryptoConfig;
            try {
                this.mediaCrypto = new MediaCrypto(frameworkCryptoConfig.uuid, frameworkCryptoConfig.sessionId);
            } catch (MediaCryptoException e11) {
                throw createRendererException(e11, this.inputFormat, 6006);
            }
        }
        return true;
    }

    private boolean isDecodeOnly(long j11, long j12) {
        if (j12 >= j11) {
            return false;
        }
        Format format = this.outputFormat;
        return (format != null && Objects.equals(format.sampleMimeType, MimeTypes.AUDIO_OPUS) && OpusUtil.needToDecodeOpusFrame(j11, j12)) ? false : true;
    }

    private static boolean isMediaCodecException(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private void maybeInitCodecWithFallback(@Nullable MediaCrypto mediaCrypto, boolean z11) throws DecoderInitializationException, ExoPlaybackException {
        Format format = (Format) Assertions.checkNotNull(this.inputFormat);
        if (this.availableCodecInfos == null) {
            try {
                List<MediaCodecInfo> availableCodecInfos = getAvailableCodecInfos(z11);
                ArrayDeque<MediaCodecInfo> arrayDeque = new ArrayDeque<>();
                this.availableCodecInfos = arrayDeque;
                if (this.enableDecoderFallback) {
                    arrayDeque.addAll(availableCodecInfos);
                } else if (!availableCodecInfos.isEmpty()) {
                    this.availableCodecInfos.add(availableCodecInfos.get(0));
                }
                this.preferredDecoderInitializationException = null;
            } catch (MediaCodecUtil.DecoderQueryException e11) {
                throw new DecoderInitializationException(format, e11, z11, -49998);
            }
        }
        if (this.availableCodecInfos.isEmpty()) {
            throw new DecoderInitializationException(format, (Throwable) null, z11, -49999);
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) Assertions.checkNotNull(this.availableCodecInfos);
        while (this.codec == null) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) Assertions.checkNotNull((MediaCodecInfo) arrayDeque2.peekFirst());
            if (!maybeInitializeProcessingPipeline(format) || !shouldInitCodec(mediaCodecInfo)) {
                return;
            }
            try {
                initCodec(mediaCodecInfo, mediaCrypto);
            } catch (Exception e12) {
                Log.w(TAG, "Failed to initialize decoder: " + mediaCodecInfo, e12);
                arrayDeque2.removeFirst();
                DecoderInitializationException decoderInitializationException = new DecoderInitializationException(format, e12, z11, mediaCodecInfo);
                onCodecError(decoderInitializationException);
                if (this.preferredDecoderInitializationException == null) {
                    this.preferredDecoderInitializationException = decoderInitializationException;
                } else {
                    this.preferredDecoderInitializationException = this.preferredDecoderInitializationException.copyWithFallbackException(decoderInitializationException);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.preferredDecoderInitializationException;
                }
            }
        }
        this.availableCodecInfos = null;
    }

    @TargetApi(23)
    private void processEndOfStream() throws ExoPlaybackException {
        int i11 = this.codecDrainAction;
        if (i11 == 1) {
            flushCodec();
            return;
        }
        if (i11 == 2) {
            flushCodec();
            updateDrmSessionV23();
        } else if (i11 == 3) {
            reinitializeCodec();
        } else {
            this.outputStreamEnded = true;
            renderToEndOfStream();
        }
    }

    private void processOutputMediaFormatChanged() {
        this.codecHasOutputMediaFormat = true;
        MediaFormat outputFormat = ((MediaCodecAdapter) Assertions.checkNotNull(this.codec)).getOutputFormat();
        if (this.codecAdaptationWorkaroundMode != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.shouldSkipAdaptationWorkaroundOutputBuffer = true;
        } else {
            this.codecOutputMediaFormat = outputFormat;
            this.codecOutputMediaFormatChanged = true;
        }
    }

    private boolean readSourceOmittingSampleData(int i11) throws ExoPlaybackException {
        FormatHolder formatHolder = getFormatHolder();
        this.noDataBuffer.clear();
        int readSource = readSource(formatHolder, this.noDataBuffer, i11 | 4);
        if (readSource == -5) {
            onInputFormatChanged(formatHolder);
            return true;
        }
        if (readSource != -4 || !this.noDataBuffer.isEndOfStream()) {
            return false;
        }
        this.inputStreamEnded = true;
        processEndOfStream();
        return false;
    }

    private void reinitializeCodec() throws ExoPlaybackException {
        releaseCodec();
        maybeInitCodecOrBypass();
    }

    private void resetInputBuffer() {
        this.inputIndex = -1;
        this.buffer.data = null;
    }

    private void resetOutputBuffer() {
        this.outputIndex = -1;
        this.outputBuffer = null;
    }

    private void setCodecDrmSession(@Nullable DrmSession drmSession) {
        DrmSession.replaceSession(this.codecDrmSession, drmSession);
        this.codecDrmSession = drmSession;
    }

    private void setOutputStreamInfo(OutputStreamInfo outputStreamInfo) {
        this.outputStreamInfo = outputStreamInfo;
        long j11 = outputStreamInfo.streamOffsetUs;
        if (j11 != C.TIME_UNSET) {
            this.needToNotifyOutputFormatChangeAfterStreamChange = true;
            onOutputStreamOffsetUsChanged(j11);
        }
    }

    private void setSourceDrmSession(@Nullable DrmSession drmSession) {
        DrmSession.replaceSession(this.sourceDrmSession, drmSession);
        this.sourceDrmSession = drmSession;
    }

    private boolean shouldContinueRendering(long j11) {
        return this.renderTimeLimitMs == C.TIME_UNSET || getClock().elapsedRealtime() - j11 < this.renderTimeLimitMs;
    }

    public static boolean supportsFormatDrm(Format format) {
        int i11 = format.cryptoType;
        return i11 == 0 || i11 == 2;
    }

    @RequiresApi(23)
    private void updateDrmSessionV23() throws ExoPlaybackException {
        CryptoConfig cryptoConfig = ((DrmSession) Assertions.checkNotNull(this.sourceDrmSession)).getCryptoConfig();
        if (cryptoConfig instanceof FrameworkCryptoConfig) {
            try {
                ((MediaCrypto) Assertions.checkNotNull(this.mediaCrypto)).setMediaDrmSession(((FrameworkCryptoConfig) cryptoConfig).sessionId);
            } catch (MediaCryptoException e11) {
                throw createRendererException(e11, this.inputFormat, 6006);
            }
        }
        setCodecDrmSession(this.sourceDrmSession);
        this.codecDrainState = 0;
        this.codecDrainAction = 0;
    }

    public DecoderReuseEvaluation canReuseCodec(MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        return new DecoderReuseEvaluation(mediaCodecInfo.name, format, format2, 0, 1);
    }

    public MediaCodecDecoderException createDecoderException(Throwable th2, @Nullable MediaCodecInfo mediaCodecInfo) {
        return new MediaCodecDecoderException(th2, mediaCodecInfo);
    }

    public void experimentalEnableProcessedStreamChangedAtStart() {
        this.experimentalEnableProcessedStreamChangedAtStart = true;
    }

    public final boolean flushOrReinitializeCodec() throws ExoPlaybackException {
        boolean flushOrReleaseCodec = flushOrReleaseCodec();
        if (flushOrReleaseCodec) {
            maybeInitCodecOrBypass();
        }
        return flushOrReleaseCodec;
    }

    public boolean flushOrReleaseCodec() {
        if (this.codec == null) {
            return false;
        }
        int i11 = this.codecDrainAction;
        if (i11 == 3 || ((this.codecNeedsSosFlushWorkaround && !this.codecHasOutputMediaFormat) || (this.codecNeedsEosFlushWorkaround && this.codecReceivedEos))) {
            releaseCodec();
            return true;
        }
        if (i11 == 2) {
            int i12 = Util.SDK_INT;
            Assertions.checkState(i12 >= 23);
            if (i12 >= 23) {
                try {
                    updateDrmSessionV23();
                } catch (ExoPlaybackException e11) {
                    Log.w(TAG, "Failed to update the DRM session, releasing the codec instead.", e11);
                    releaseCodec();
                    return true;
                }
            }
        }
        flushCodec();
        return false;
    }

    @Nullable
    public final MediaCodecAdapter getCodec() {
        return this.codec;
    }

    public int getCodecBufferFlags(DecoderInputBuffer decoderInputBuffer) {
        return 0;
    }

    @Nullable
    public final MediaCodecInfo getCodecInfo() {
        return this.codecInfo;
    }

    public boolean getCodecNeedsEosPropagation() {
        return false;
    }

    public float getCodecOperatingRate() {
        return this.codecOperatingRate;
    }

    public float getCodecOperatingRateV23(float f11, Format format, Format[] formatArr) {
        return -1.0f;
    }

    @Nullable
    public final MediaFormat getCodecOutputMediaFormat() {
        return this.codecOutputMediaFormat;
    }

    public abstract List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector mediaCodecSelector, Format format, boolean z11) throws MediaCodecUtil.DecoderQueryException;

    @Override // androidx.media3.exoplayer.Renderer
    public final long getDurationToProgressUs(long j11, long j12) {
        return getDurationToProgressUs(j11, j12, this.codecRegisteredOnBufferAvailableListener);
    }

    public long getLastBufferInStreamPresentationTimeUs() {
        return this.lastBufferInStreamPresentationTimeUs;
    }

    public abstract MediaCodecAdapter.Configuration getMediaCodecConfiguration(MediaCodecInfo mediaCodecInfo, Format format, @Nullable MediaCrypto mediaCrypto, float f11);

    public final long getOutputStreamOffsetUs() {
        return this.outputStreamInfo.streamOffsetUs;
    }

    public final long getOutputStreamStartPositionUs() {
        return this.outputStreamInfo.startPositionUs;
    }

    public float getPlaybackSpeed() {
        return this.currentPlaybackSpeed;
    }

    @Nullable
    public final Renderer.WakeupListener getWakeupListener() {
        return this.wakeupListener;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i11, @Nullable Object obj) throws ExoPlaybackException {
        if (i11 != 11) {
            super.handleMessage(i11, obj);
            return;
        }
        Renderer.WakeupListener wakeupListener = (Renderer.WakeupListener) Assertions.checkNotNull((Renderer.WakeupListener) obj);
        this.wakeupListener = wakeupListener;
        onWakeupListenerSet(wakeupListener);
    }

    public final boolean isBypassEnabled() {
        return this.bypassEnabled;
    }

    public final boolean isBypassPossible(Format format) {
        return this.sourceDrmSession == null && shouldUseBypass(format);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        if (this.inputFormat == null) {
            return false;
        }
        if (isSourceReady() || hasOutputBuffer()) {
            return true;
        }
        return this.codecHotswapDeadlineMs != C.TIME_UNSET && getClock().elapsedRealtime() < this.codecHotswapDeadlineMs;
    }

    public final void maybeInitCodecOrBypass() throws ExoPlaybackException {
        Format format;
        boolean z11;
        if (this.codec != null || this.bypassEnabled || (format = this.inputFormat) == null) {
            return;
        }
        if (isBypassPossible(format)) {
            initBypass(format);
            return;
        }
        setCodecDrmSession(this.sourceDrmSession);
        if (this.codecDrmSession == null || initMediaCryptoIfDrmSessionReady()) {
            try {
                DrmSession drmSession = this.codecDrmSession;
                if (drmSession != null) {
                    if (drmSession.getState() != 3) {
                        if (this.codecDrmSession.getState() == 4) {
                        }
                    }
                    if (this.codecDrmSession.requiresSecureDecoder((String) Assertions.checkStateNotNull(format.sampleMimeType))) {
                        z11 = true;
                        maybeInitCodecWithFallback(this.mediaCrypto, z11);
                    }
                }
                z11 = false;
                maybeInitCodecWithFallback(this.mediaCrypto, z11);
            } catch (DecoderInitializationException e11) {
                throw createRendererException(e11, format, 4001);
            }
        }
        MediaCrypto mediaCrypto = this.mediaCrypto;
        if (mediaCrypto == null || this.codec != null) {
            return;
        }
        mediaCrypto.release();
        this.mediaCrypto = null;
    }

    public boolean maybeInitializeProcessingPipeline(Format format) throws ExoPlaybackException {
        return true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onDisabled() {
        this.inputFormat = null;
        setOutputStreamInfo(OutputStreamInfo.UNSET);
        this.pendingOutputStreamChanges.clear();
        flushOrReleaseCodec();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onEnabled(boolean z11, boolean z12) throws ExoPlaybackException {
        this.decoderCounters = new DecoderCounters();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
    
        if (drainAndUpdateCodecDrmSessionV23() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:
    
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00db, code lost:
    
        if (drainAndUpdateCodecDrmSessionV23() == false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    @androidx.annotation.Nullable
    @androidx.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.media3.exoplayer.DecoderReuseEvaluation onInputFormatChanged(androidx.media3.exoplayer.FormatHolder r12) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.onInputFormatChanged(androidx.media3.exoplayer.FormatHolder):androidx.media3.exoplayer.DecoderReuseEvaluation");
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onPositionReset(long j11, boolean z11) throws ExoPlaybackException {
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        this.pendingOutputEndOfStream = false;
        if (this.bypassEnabled) {
            this.bypassBatchBuffer.clear();
            this.bypassSampleBuffer.clear();
            this.bypassSampleBufferPending = false;
            this.oggOpusAudioPacketizer.reset();
        } else {
            flushOrReinitializeCodec();
        }
        if (this.outputStreamInfo.formatQueue.size() > 0) {
            this.waitingForFirstSampleInFormat = true;
        }
        this.outputStreamInfo.formatQueue.clear();
        this.pendingOutputStreamChanges.clear();
    }

    @CallSuper
    public void onProcessedOutputBuffer(long j11) {
        this.lastProcessedOutputBufferTimeUs = j11;
        while (!this.pendingOutputStreamChanges.isEmpty() && j11 >= this.pendingOutputStreamChanges.peek().previousStreamLastBufferTimeUs) {
            setOutputStreamInfo((OutputStreamInfo) Assertions.checkNotNull(this.pendingOutputStreamChanges.poll()));
            onProcessedStreamChange();
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onReset() {
        try {
            disableBypass();
            releaseCodec();
        } finally {
            setSourceDrmSession(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // androidx.media3.exoplayer.BaseRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStreamChanged(androidx.media3.common.Format[] r12, long r13, long r15, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId r17) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r11 = this;
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo r12 = r11.outputStreamInfo
            long r0 = r12.streamOffsetUs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo r4 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.setOutputStreamInfo(r4)
            boolean r12 = r11.experimentalEnableProcessedStreamChangedAtStart
            if (r12 == 0) goto L56
            r11.onProcessedStreamChange()
            return
        L24:
            java.util.ArrayDeque<androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo> r12 = r11.pendingOutputStreamChanges
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L57
            long r0 = r11.largestQueuedPresentationTimeUs
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 == 0) goto L3c
            long r4 = r11.lastProcessedOutputBufferTimeUs
            int r12 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r12 == 0) goto L57
            int r12 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r12 < 0) goto L57
        L3c:
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo r4 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.setOutputStreamInfo(r4)
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo r12 = r11.outputStreamInfo
            long r12 = r12.streamOffsetUs
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.onProcessedStreamChange()
        L56:
            return
        L57:
            java.util.ArrayDeque<androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo> r12 = r11.pendingOutputStreamChanges
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo r0 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo
            long r1 = r11.largestQueuedPresentationTimeUs
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.onStreamChanged(androidx.media3.common.Format[], long, long, androidx.media3.exoplayer.source.MediaSource$MediaPeriodId):void");
    }

    public abstract boolean processOutputBuffer(long j11, long j12, @Nullable MediaCodecAdapter mediaCodecAdapter, @Nullable ByteBuffer byteBuffer, int i11, int i12, int i13, long j13, boolean z11, boolean z12, Format format) throws ExoPlaybackException;

    /* JADX WARN: Multi-variable type inference failed */
    public void releaseCodec() {
        try {
            MediaCodecAdapter mediaCodecAdapter = this.codec;
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.release();
                this.decoderCounters.decoderReleaseCount++;
                onCodecReleased(((MediaCodecInfo) Assertions.checkNotNull(this.codecInfo)).name);
            }
            this.codec = null;
            try {
                MediaCrypto mediaCrypto = this.mediaCrypto;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.codec = null;
            try {
                MediaCrypto mediaCrypto2 = this.mediaCrypto;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j11, long j12) throws ExoPlaybackException {
        boolean z11 = false;
        if (this.pendingOutputEndOfStream) {
            this.pendingOutputEndOfStream = false;
            processEndOfStream();
        }
        ExoPlaybackException exoPlaybackException = this.pendingPlaybackException;
        if (exoPlaybackException != null) {
            this.pendingPlaybackException = null;
            throw exoPlaybackException;
        }
        try {
            if (this.outputStreamEnded) {
                renderToEndOfStream();
                return;
            }
            if (this.inputFormat != null || readSourceOmittingSampleData(2)) {
                maybeInitCodecOrBypass();
                if (this.bypassEnabled) {
                    TraceUtil.beginSection("bypassRender");
                    while (bypassRender(j11, j12)) {
                    }
                    TraceUtil.endSection();
                } else if (this.codec != null) {
                    long elapsedRealtime = getClock().elapsedRealtime();
                    TraceUtil.beginSection("drainAndFeed");
                    while (drainOutputBuffer(j11, j12) && shouldContinueRendering(elapsedRealtime)) {
                    }
                    while (feedInputBuffer() && shouldContinueRendering(elapsedRealtime)) {
                    }
                    TraceUtil.endSection();
                } else {
                    this.decoderCounters.skippedInputBufferCount += skipSource(j11);
                    readSourceOmittingSampleData(1);
                }
                this.decoderCounters.ensureUpdated();
            }
        } catch (MediaCodec.CryptoException e11) {
            throw createRendererException(e11, this.inputFormat, Util.getErrorCodeForMediaDrmErrorCode(e11.getErrorCode()));
        } catch (IllegalStateException e12) {
            if (!isMediaCodecException(e12)) {
                throw e12;
            }
            onCodecError(e12);
            if ((e12 instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e12).isRecoverable()) {
                z11 = true;
            }
            if (z11) {
                releaseCodec();
            }
            MediaCodecDecoderException createDecoderException = createDecoderException(e12, getCodecInfo());
            throw createRendererException(createDecoderException, this.inputFormat, z11, createDecoderException.errorCode == 1101 ? PlaybackException.ERROR_CODE_DECODING_RESOURCES_RECLAIMED : PlaybackException.ERROR_CODE_DECODING_FAILED);
        }
    }

    @CallSuper
    public void resetCodecStateForFlush() {
        resetInputBuffer();
        resetOutputBuffer();
        this.codecHotswapDeadlineMs = C.TIME_UNSET;
        this.codecReceivedEos = false;
        this.lastOutputBufferProcessedRealtimeMs = C.TIME_UNSET;
        this.codecReceivedBuffers = false;
        this.codecNeedsAdaptationWorkaroundBuffer = false;
        this.shouldSkipAdaptationWorkaroundOutputBuffer = false;
        this.isDecodeOnlyOutputBuffer = false;
        this.isLastOutputBuffer = false;
        this.largestQueuedPresentationTimeUs = C.TIME_UNSET;
        this.lastBufferInStreamPresentationTimeUs = C.TIME_UNSET;
        this.lastProcessedOutputBufferTimeUs = C.TIME_UNSET;
        this.codecDrainState = 0;
        this.codecDrainAction = 0;
        this.codecReconfigurationState = this.codecReconfigured ? 1 : 0;
    }

    @CallSuper
    public void resetCodecStateForRelease() {
        resetCodecStateForFlush();
        this.pendingPlaybackException = null;
        this.availableCodecInfos = null;
        this.codecInfo = null;
        this.codecInputFormat = null;
        this.codecOutputMediaFormat = null;
        this.codecOutputMediaFormatChanged = false;
        this.codecHasOutputMediaFormat = false;
        this.codecOperatingRate = -1.0f;
        this.codecAdaptationWorkaroundMode = 0;
        this.codecNeedsSosFlushWorkaround = false;
        this.codecNeedsEosFlushWorkaround = false;
        this.codecNeedsEosOutputExceptionWorkaround = false;
        this.codecNeedsEosPropagation = false;
        this.codecRegisteredOnBufferAvailableListener = false;
        this.codecReconfigured = false;
        this.codecReconfigurationState = 0;
    }

    public final void setPendingOutputEndOfStream() {
        this.pendingOutputEndOfStream = true;
    }

    public final void setPendingPlaybackException(ExoPlaybackException exoPlaybackException) {
        this.pendingPlaybackException = exoPlaybackException;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void setPlaybackSpeed(float f11, float f12) throws ExoPlaybackException {
        this.currentPlaybackSpeed = f11;
        this.targetPlaybackSpeed = f12;
        updateCodecOperatingRate(this.codecInputFormat);
    }

    public void setRenderTimeLimitMs(long j11) {
        this.renderTimeLimitMs = j11;
    }

    public boolean shouldDiscardDecoderInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        if (!shouldSkipDecoderInputBuffer(decoderInputBuffer)) {
            return false;
        }
        decoderInputBuffer.clear();
        this.decoderCounters.skippedInputBufferCount++;
        return true;
    }

    public boolean shouldInitCodec(MediaCodecInfo mediaCodecInfo) {
        return true;
    }

    public boolean shouldReinitCodec() {
        return false;
    }

    public boolean shouldSkipDecoderInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        return false;
    }

    public boolean shouldUseBypass(Format format) {
        return false;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final int supportsFormat(Format format) throws ExoPlaybackException {
        try {
            return supportsFormat(this.mediaCodecSelector, format);
        } catch (MediaCodecUtil.DecoderQueryException e11) {
            throw createRendererException(e11, format, PlaybackException.ERROR_CODE_DECODER_QUERY_FAILED);
        }
    }

    public abstract int supportsFormat(MediaCodecSelector mediaCodecSelector, Format format) throws MediaCodecUtil.DecoderQueryException;

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.RendererCapabilities
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    public final boolean updateCodecOperatingRate() throws ExoPlaybackException {
        return updateCodecOperatingRate(this.codecInputFormat);
    }

    public final void updateOutputFormatForTime(long j11) throws ExoPlaybackException {
        Format pollFloor = this.outputStreamInfo.formatQueue.pollFloor(j11);
        if (pollFloor == null && this.needToNotifyOutputFormatChangeAfterStreamChange && this.codecOutputMediaFormat != null) {
            pollFloor = this.outputStreamInfo.formatQueue.pollFirst();
        }
        if (pollFloor != null) {
            this.outputFormat = pollFloor;
        } else if (!this.codecOutputMediaFormatChanged || this.outputFormat == null) {
            return;
        }
        onOutputFormatChanged((Format) Assertions.checkNotNull(this.outputFormat), this.codecOutputMediaFormat);
        this.codecOutputMediaFormatChanged = false;
        this.needToNotifyOutputFormatChangeAfterStreamChange = false;
    }

    private boolean updateCodecOperatingRate(@Nullable Format format) throws ExoPlaybackException {
        if (Util.SDK_INT >= 23 && this.codec != null && this.codecDrainAction != 3 && getState() != 0) {
            float codecOperatingRateV23 = getCodecOperatingRateV23(this.targetPlaybackSpeed, (Format) Assertions.checkNotNull(format), getStreamFormats());
            float f11 = this.codecOperatingRate;
            if (f11 == codecOperatingRateV23) {
                return true;
            }
            if (codecOperatingRateV23 == -1.0f) {
                drainAndReinitializeCodec();
                return false;
            }
            if (f11 == -1.0f && codecOperatingRateV23 <= this.assumedMinimumCodecOperatingRate) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", codecOperatingRateV23);
            ((MediaCodecAdapter) Assertions.checkNotNull(this.codec)).setParameters(bundle);
            this.codecOperatingRate = codecOperatingRateV23;
        }
        return true;
    }

    public long getDurationToProgressUs(long j11, long j12, boolean z11) {
        return super.getDurationToProgressUs(j11, j12);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DecoderInitializationException extends Exception {
        private static final int CUSTOM_ERROR_CODE_BASE = -50000;
        private static final int DECODER_QUERY_ERROR = -49998;
        private static final int NO_SUITABLE_DECODER_ERROR = -49999;

        @Nullable
        public final MediaCodecInfo codecInfo;

        @Nullable
        public final String diagnosticInfo;

        @Nullable
        public final DecoderInitializationException fallbackDecoderInitializationException;

        @Nullable
        public final String mimeType;
        public final boolean secureDecoderRequired;

        public DecoderInitializationException(Format format, @Nullable Throwable th2, boolean z11, int i11) {
            this("Decoder init failed: [" + i11 + "], " + format, th2, format.sampleMimeType, z11, null, buildCustomDiagnosticInfo(i11), null);
        }

        private static String buildCustomDiagnosticInfo(int i11) {
            return "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i11 < 0 ? "neg_" : "") + Math.abs(i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @CheckResult
        public DecoderInitializationException copyWithFallbackException(DecoderInitializationException decoderInitializationException) {
            return new DecoderInitializationException(getMessage(), getCause(), this.mimeType, this.secureDecoderRequired, this.codecInfo, this.diagnosticInfo, decoderInitializationException);
        }

        public DecoderInitializationException(Format format, @Nullable Throwable th2, boolean z11, MediaCodecInfo mediaCodecInfo) {
            this("Decoder init failed: " + mediaCodecInfo.name + j2.O + format, th2, format.sampleMimeType, z11, mediaCodecInfo, th2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null, null);
        }

        private DecoderInitializationException(@Nullable String str, @Nullable Throwable th2, @Nullable String str2, boolean z11, @Nullable MediaCodecInfo mediaCodecInfo, @Nullable String str3, @Nullable DecoderInitializationException decoderInitializationException) {
            super(str, th2);
            this.mimeType = str2;
            this.secureDecoderRequired = z11;
            this.codecInfo = mediaCodecInfo;
            this.diagnosticInfo = str3;
            this.fallbackDecoderInitializationException = decoderInitializationException;
        }
    }

    public void onProcessedStreamChange() {
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onStarted() {
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onStopped() {
    }

    public void renderToEndOfStream() throws ExoPlaybackException {
    }

    public void handleInputBufferSupplementalData(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    public void onCodecError(Exception exc) {
    }

    public void onCodecReleased(String str) {
    }

    public void onOutputStreamOffsetUsChanged(long j11) {
    }

    public void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    public void onWakeupListenerSet(Renderer.WakeupListener wakeupListener) {
    }

    public void onOutputFormatChanged(Format format, @Nullable MediaFormat mediaFormat) throws ExoPlaybackException {
    }

    public void onCodecInitialized(String str, MediaCodecAdapter.Configuration configuration, long j11, long j12) {
    }
}
