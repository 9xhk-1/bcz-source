package androidx.media3.exoplayer.video;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.C;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.Timeline;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.MediaFormatUtil;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper;
import androidx.media3.exoplayer.video.VideoFrameReleaseControl;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.media3.exoplayer.video.VideoSink;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.w1;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.tencent.ijk.media.player.misc.IMediaFormat;
import com.tencent.liteav.audio.TXEAudioDef;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class MediaCodecVideoRenderer extends MediaCodecRenderer implements VideoFrameReleaseControl.FrameTimingEvaluator {
    private static final int HEVC_MAX_INPUT_SIZE_THRESHOLD = 2097152;
    private static final float INITIAL_FORMAT_MAX_INPUT_SIZE_SCALE_FACTOR = 1.5f;
    private static final String KEY_CROP_BOTTOM = "crop-bottom";
    private static final String KEY_CROP_LEFT = "crop-left";
    private static final String KEY_CROP_RIGHT = "crop-right";
    private static final String KEY_CROP_TOP = "crop-top";
    private static final int MAX_CONSECUTIVE_DROPPED_INPUT_BUFFERS_COUNT_TO_DISCARD_HEADER = 0;
    private static final long MIN_EARLY_US_LATE_THRESHOLD = -30000;
    private static final long MIN_EARLY_US_VERY_LATE_THRESHOLD = -500000;
    private static final long OFFSET_FROM_PERIOD_END_TO_TREAT_AS_LAST_US = 100000;
    private static final long OFFSET_FROM_RESET_POSITION_TO_ALLOW_INPUT_BUFFER_DROPPING_US = 200000;
    private static final int[] STANDARD_LONG_EDGE_VIDEO_PX = {1920, 1600, 1440, 1280, TXEAudioDef.TXE_OPUS_SAMPLE_NUM, 854, 640, 540, 480};
    private static final String TAG = "MediaCodecVideoRenderer";
    private static final long TUNNELING_EOS_PRESENTATION_TIME_US = Long.MAX_VALUE;
    private static boolean deviceNeedsSetOutputSurfaceWorkaround;
    private static boolean evaluatedDeviceNeedsSetOutputSurfaceWorkaround;

    @Nullable
    private final Av1SampleDependencyParser av1SampleDependencyParser;
    private int buffersInCodecCount;
    private int changeFrameRateStrategy;
    private boolean codecHandlesHdr10PlusOutOfBandMetadata;
    private CodecMaxValues codecMaxValues;
    private boolean codecNeedsSetOutputSurfaceWorkaround;
    private int consecutiveDroppedFrameCount;
    private int consecutiveDroppedInputBufferCount;
    private final Context context;
    private VideoSize decodedVideoSize;
    private final boolean deviceNeedsNoPostProcessWorkaround;

    @Nullable
    private Surface displaySurface;
    private final PriorityQueue<Long> droppedDecoderInputBufferTimestamps;
    private long droppedFrameAccumulationStartTimeMs;
    private int droppedFrames;
    private final VideoRendererEventListener.EventDispatcher eventDispatcher;

    @Nullable
    private VideoFrameMetadataListener frameMetadataListener;
    private boolean hasSetVideoSink;
    private boolean haveReportedFirstFrameRenderedForCurrentSurface;
    private long lastFrameReleaseTimeNs;
    private final int maxDroppedFramesToNotify;
    private final long minEarlyUsToDropDecoderInput;
    private Size outputResolution;
    private final boolean ownsVideoSink;
    private boolean pendingVideoSinkInputStreamChange;
    private long periodDurationUs;

    @Nullable
    private PlaceholderSurface placeholderSurface;
    private int rendererPriority;

    @Nullable
    private VideoSize reportedVideoSize;
    private int scalingMode;
    private boolean shouldDropDecoderInputBuffers;
    private long startPositionUs;
    private long totalVideoFrameProcessingOffsetUs;
    private boolean tunneling;
    private int tunnelingAudioSessionId;

    @Nullable
    OnFrameRenderedListenerV23 tunnelingOnFrameRenderedListener;
    private List<Effect> videoEffects;
    private int videoFrameProcessingOffsetCount;
    private final VideoFrameReleaseControl videoFrameReleaseControl;
    private final VideoFrameReleaseControl.FrameReleaseInfo videoFrameReleaseInfo;
    private VideoSink videoSink;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(26)
    public static final class Api26 {
        private Api26() {
        }

        public static boolean doesDisplaySupportDolbyVision(Context context) {
            boolean isHdr;
            DisplayManager displayManager = (DisplayManager) context.getSystemService(CommonConstant.ReqAccessTokenParam.DISPLAY_LABEL);
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null) {
                isHdr = display.isHdr();
                if (isHdr) {
                    for (int i11 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                        if (i11 == 1) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Builder {
        private long allowedJoiningTimeMs;
        private boolean buildCalled;
        private MediaCodecAdapter.Factory codecAdapterFactory;
        private final Context context;
        private boolean enableDecoderFallback;

        @Nullable
        private Handler eventHandler;

        @Nullable
        private VideoRendererEventListener eventListener;
        private int maxDroppedFramesToNotify;
        private boolean parseAv1SampleDependencies;

        @Nullable
        private VideoSink videoSink;
        private MediaCodecSelector mediaCodecSelector = MediaCodecSelector.DEFAULT;
        private float assumedMinimumCodecOperatingRate = 30.0f;
        private long lateThresholdToDropDecoderInputUs = C.TIME_UNSET;

        public Builder(Context context) {
            this.context = context;
            this.codecAdapterFactory = MediaCodecAdapter.Factory.getDefault(context);
        }

        public MediaCodecVideoRenderer build() {
            Assertions.checkState(!this.buildCalled);
            Handler handler = this.eventHandler;
            Assertions.checkState((handler == null && this.eventListener == null) || !(handler == null || this.eventListener == null));
            this.buildCalled = true;
            return new MediaCodecVideoRenderer(this);
        }

        @uo.a
        public Builder experimentalSetLateThresholdToDropDecoderInputUs(long j11) {
            this.lateThresholdToDropDecoderInputUs = j11;
            return this;
        }

        @uo.a
        public Builder experimentalSetParseAv1SampleDependencies(boolean z11) {
            this.parseAv1SampleDependencies = z11;
            return this;
        }

        @uo.a
        public Builder setAllowedJoiningTimeMs(long j11) {
            this.allowedJoiningTimeMs = j11;
            return this;
        }

        @uo.a
        public Builder setAssumedMinimumCodecOperatingRate(float f11) {
            this.assumedMinimumCodecOperatingRate = f11;
            return this;
        }

        @uo.a
        public Builder setCodecAdapterFactory(MediaCodecAdapter.Factory factory) {
            this.codecAdapterFactory = factory;
            return this;
        }

        @uo.a
        public Builder setEnableDecoderFallback(boolean z11) {
            this.enableDecoderFallback = z11;
            return this;
        }

        @uo.a
        public Builder setEventHandler(@Nullable Handler handler) {
            this.eventHandler = handler;
            return this;
        }

        @uo.a
        public Builder setEventListener(@Nullable VideoRendererEventListener videoRendererEventListener) {
            this.eventListener = videoRendererEventListener;
            return this;
        }

        @uo.a
        public Builder setMaxDroppedFramesToNotify(int i11) {
            this.maxDroppedFramesToNotify = i11;
            return this;
        }

        @uo.a
        public Builder setMediaCodecSelector(MediaCodecSelector mediaCodecSelector) {
            this.mediaCodecSelector = mediaCodecSelector;
            return this;
        }

        @uo.a
        public Builder setVideoSink(@Nullable VideoSink videoSink) {
            this.videoSink = videoSink;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class CodecMaxValues {
        public final int height;
        public final int inputSize;
        public final int width;

        public CodecMaxValues(int i11, int i12, int i13) {
            this.width = i11;
            this.height = i12;
            this.inputSize = i13;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(23)
    public final class OnFrameRenderedListenerV23 implements MediaCodecAdapter.OnFrameRenderedListener, Handler.Callback {
        private static final int HANDLE_FRAME_RENDERED = 0;
        private final Handler handler;

        public OnFrameRenderedListenerV23(MediaCodecAdapter mediaCodecAdapter) {
            Handler createHandlerForCurrentLooper = Util.createHandlerForCurrentLooper(this);
            this.handler = createHandlerForCurrentLooper;
            mediaCodecAdapter.setOnFrameRenderedListener(this, createHandlerForCurrentLooper);
        }

        private void handleFrameRendered(long j11) {
            MediaCodecVideoRenderer mediaCodecVideoRenderer = MediaCodecVideoRenderer.this;
            if (this != mediaCodecVideoRenderer.tunnelingOnFrameRenderedListener || mediaCodecVideoRenderer.getCodec() == null) {
                return;
            }
            if (j11 == Long.MAX_VALUE) {
                MediaCodecVideoRenderer.this.onProcessedTunneledEndOfStream();
                return;
            }
            try {
                MediaCodecVideoRenderer.this.onProcessedTunneledBuffer(j11);
            } catch (ExoPlaybackException e11) {
                MediaCodecVideoRenderer.this.setPendingPlaybackException(e11);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            handleFrameRendered(Util.toLong(message.arg1, message.arg2));
            return true;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnFrameRenderedListener
        public void onFrameRendered(MediaCodecAdapter mediaCodecAdapter, long j11, long j12) {
            if (Util.SDK_INT >= 30) {
                handleFrameRendered(j11);
            } else {
                this.handler.sendMessageAtFrontOfQueue(Message.obtain(this.handler, 0, (int) (j11 >> 32), (int) j11));
            }
        }
    }

    @Deprecated
    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector) {
        this(new Builder(context).setMediaCodecSelector(mediaCodecSelector));
    }

    private static boolean deviceNeedsNoPostProcessWorkaround() {
        return "NVIDIA".equals(Build.MANUFACTURER);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0844, code lost:
    
        if (r0.equals("PGN528") == false) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean evaluateDeviceNeedsSetOutputSurfaceWorkaround() {
        /*
            Method dump skipped, instructions count: 3182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.MediaCodecVideoRenderer.evaluateDeviceNeedsSetOutputSurfaceWorkaround():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0087, code lost:
    
        if (r3.equals(androidx.media3.common.MimeTypes.VIDEO_AV1) == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getCodecMaxInputSize(androidx.media3.exoplayer.mediacodec.MediaCodecInfo r10, androidx.media3.common.Format r11) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.MediaCodecVideoRenderer.getCodecMaxInputSize(androidx.media3.exoplayer.mediacodec.MediaCodecInfo, androidx.media3.common.Format):int");
    }

    @Nullable
    private static Point getCodecMaxSize(MediaCodecInfo mediaCodecInfo, Format format) {
        int i11 = format.height;
        int i12 = format.width;
        boolean z11 = i11 > i12;
        int i13 = z11 ? i11 : i12;
        if (z11) {
            i11 = i12;
        }
        float f11 = i11 / i13;
        for (int i14 : STANDARD_LONG_EDGE_VIDEO_PX) {
            int i15 = (int) (i14 * f11);
            if (i14 <= i13 || i15 <= i11) {
                break;
            }
            int i16 = z11 ? i15 : i14;
            if (!z11) {
                i14 = i15;
            }
            Point alignVideoSizeV21 = mediaCodecInfo.alignVideoSizeV21(i16, i14);
            float f12 = format.frameRate;
            if (alignVideoSizeV21 != null && mediaCodecInfo.isVideoSizeAndRateSupportedV21(alignVideoSizeV21.x, alignVideoSizeV21.y, f12)) {
                return alignVideoSizeV21;
            }
        }
        return null;
    }

    public static int getMaxInputSize(MediaCodecInfo mediaCodecInfo, Format format) {
        if (format.maxInputSize == -1) {
            return getCodecMaxInputSize(mediaCodecInfo, format);
        }
        int size = format.initializationData.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += format.initializationData.get(i12).length;
        }
        return format.maxInputSize + i11;
    }

    private static int getMaxSampleSize(int i11, int i12) {
        return (i11 * 3) / (i12 * 2);
    }

    @Nullable
    private Surface getSurfaceForCodec(MediaCodecInfo mediaCodecInfo) {
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            return videoSink.getInputSurface();
        }
        Surface surface = this.displaySurface;
        if (surface != null) {
            return surface;
        }
        if (shouldUseDetachedSurface(mediaCodecInfo)) {
            return null;
        }
        Assertions.checkState(shouldUsePlaceholderSurface(mediaCodecInfo));
        PlaceholderSurface placeholderSurface = this.placeholderSurface;
        if (placeholderSurface != null && placeholderSurface.secure != mediaCodecInfo.secure) {
            releasePlaceholderSurface();
        }
        if (this.placeholderSurface == null) {
            this.placeholderSurface = PlaceholderSurface.newInstance(this.context, mediaCodecInfo.secure);
        }
        return this.placeholderSurface;
    }

    private boolean hasSurfaceForCodec(MediaCodecInfo mediaCodecInfo) {
        if (this.videoSink != null) {
            return true;
        }
        Surface surface = this.displaySurface;
        return (surface != null && surface.isValid()) || shouldUseDetachedSurface(mediaCodecInfo) || shouldUsePlaceholderSurface(mediaCodecInfo);
    }

    private boolean isBufferBeforeStartTime(DecoderInputBuffer decoderInputBuffer) {
        return decoderInputBuffer.timeUs < getLastResetPositionUs();
    }

    private boolean isBufferProbablyLastSample(DecoderInputBuffer decoderInputBuffer) {
        if (hasReadStreamToEnd() || decoderInputBuffer.isLastSample() || this.periodDurationUs == C.TIME_UNSET) {
            return true;
        }
        return this.periodDurationUs - (decoderInputBuffer.timeUs - getOutputStreamOffsetUs()) <= 100000;
    }

    private void maybeNotifyDroppedFrames() {
        if (this.droppedFrames > 0) {
            long elapsedRealtime = getClock().elapsedRealtime();
            this.eventDispatcher.droppedFrames(this.droppedFrames, elapsedRealtime - this.droppedFrameAccumulationStartTimeMs);
            this.droppedFrames = 0;
            this.droppedFrameAccumulationStartTimeMs = elapsedRealtime;
        }
    }

    private void maybeNotifyRenderedFirstFrame() {
        if (!this.videoFrameReleaseControl.onFrameReleasedIsFirstFrame() || this.displaySurface == null) {
            return;
        }
        notifyRenderedFirstFrame();
    }

    private void maybeNotifyVideoFrameProcessingOffset() {
        int i11 = this.videoFrameProcessingOffsetCount;
        if (i11 != 0) {
            this.eventDispatcher.reportVideoFrameProcessingOffset(this.totalVideoFrameProcessingOffsetUs, i11);
            this.totalVideoFrameProcessingOffsetUs = 0L;
            this.videoFrameProcessingOffsetCount = 0;
        }
    }

    private void maybeNotifyVideoSizeChanged(VideoSize videoSize) {
        if (videoSize.equals(VideoSize.UNKNOWN) || videoSize.equals(this.reportedVideoSize)) {
            return;
        }
        this.reportedVideoSize = videoSize;
        this.eventDispatcher.videoSizeChanged(videoSize);
    }

    private void maybeRenotifyRenderedFirstFrame() {
        Surface surface = this.displaySurface;
        if (surface == null || !this.haveReportedFirstFrameRenderedForCurrentSurface) {
            return;
        }
        this.eventDispatcher.renderedFirstFrame(surface);
    }

    private void maybeRenotifyVideoSizeChanged() {
        VideoSize videoSize = this.reportedVideoSize;
        if (videoSize != null) {
            this.eventDispatcher.videoSizeChanged(videoSize);
        }
    }

    private void maybeSetKeyAllowFrameDrop(MediaFormat mediaFormat) {
        if (this.videoSink == null || Util.isFrameDropAllowedOnSurfaceInput(this.context)) {
            return;
        }
        mediaFormat.setInteger("allow-frame-drop", 0);
    }

    private void maybeSetupTunnelingForFirstFrame() {
        int i11;
        MediaCodecAdapter codec;
        if (!this.tunneling || (i11 = Util.SDK_INT) < 23 || (codec = getCodec()) == null) {
            return;
        }
        this.tunnelingOnFrameRenderedListener = new OnFrameRenderedListenerV23(codec);
        if (i11 >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            codec.setParameters(bundle);
        }
    }

    private void notifyFrameMetadataListener(long j11, long j12, Format format) {
        VideoFrameMetadataListener videoFrameMetadataListener = this.frameMetadataListener;
        if (videoFrameMetadataListener != null) {
            videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j11, j12, format, getCodecOutputMediaFormat());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresNonNull({"displaySurface"})
    public void notifyRenderedFirstFrame() {
        this.eventDispatcher.renderedFirstFrame(this.displaySurface);
        this.haveReportedFirstFrameRenderedForCurrentSurface = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProcessedTunneledEndOfStream() {
        setPendingOutputEndOfStream();
    }

    private void releaseFrame(MediaCodecAdapter mediaCodecAdapter, int i11, long j11, Format format) {
        MediaCodecVideoRenderer mediaCodecVideoRenderer;
        long releaseTimeNs = this.videoFrameReleaseInfo.getReleaseTimeNs();
        long earlyUs = this.videoFrameReleaseInfo.getEarlyUs();
        if (shouldSkipBuffersWithIdenticalReleaseTime() && releaseTimeNs == this.lastFrameReleaseTimeNs) {
            skipOutputBuffer(mediaCodecAdapter, i11, j11);
            mediaCodecVideoRenderer = this;
        } else {
            mediaCodecVideoRenderer = this;
            mediaCodecVideoRenderer.notifyFrameMetadataListener(j11, releaseTimeNs, format);
            mediaCodecVideoRenderer.renderOutputBufferV21(mediaCodecAdapter, i11, j11, releaseTimeNs);
            releaseTimeNs = releaseTimeNs;
        }
        updateVideoFrameProcessingOffsetCounters(earlyUs);
        mediaCodecVideoRenderer.lastFrameReleaseTimeNs = releaseTimeNs;
    }

    private void releasePlaceholderSurface() {
        PlaceholderSurface placeholderSurface = this.placeholderSurface;
        if (placeholderSurface != null) {
            placeholderSurface.release();
            this.placeholderSurface = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderOutputBuffer(MediaCodecAdapter mediaCodecAdapter, int i11, long j11, long j12) {
        renderOutputBufferV21(mediaCodecAdapter, i11, j11, j12);
    }

    @RequiresApi(29)
    private static void setHdr10PlusInfoV29(MediaCodecAdapter mediaCodecAdapter, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        mediaCodecAdapter.setParameters(bundle);
    }

    private void setOutput(@Nullable Object obj) throws ExoPlaybackException {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.displaySurface == surface) {
            if (surface != null) {
                maybeRenotifyVideoSizeChanged();
                maybeRenotifyRenderedFirstFrame();
                return;
            }
            return;
        }
        this.displaySurface = surface;
        if (this.videoSink == null) {
            this.videoFrameReleaseControl.setOutputSurface(surface);
        }
        this.haveReportedFirstFrameRenderedForCurrentSurface = false;
        int state = getState();
        MediaCodecAdapter codec = getCodec();
        if (codec != null && this.videoSink == null) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) Assertions.checkNotNull(getCodecInfo());
            boolean hasSurfaceForCodec = hasSurfaceForCodec(mediaCodecInfo);
            if (Util.SDK_INT < 23 || !hasSurfaceForCodec || this.codecNeedsSetOutputSurfaceWorkaround) {
                releaseCodec();
                maybeInitCodecOrBypass();
            } else {
                setOutputSurface(codec, getSurfaceForCodec(mediaCodecInfo));
            }
        }
        if (surface != null) {
            maybeRenotifyVideoSizeChanged();
        } else {
            this.reportedVideoSize = null;
            VideoSink videoSink = this.videoSink;
            if (videoSink != null) {
                videoSink.clearOutputSurfaceInfo();
            }
        }
        if (state == 2) {
            VideoSink videoSink2 = this.videoSink;
            if (videoSink2 != null) {
                videoSink2.join(true);
            } else {
                this.videoFrameReleaseControl.join(true);
            }
        }
        maybeSetupTunnelingForFirstFrame();
    }

    private void setOutputSurface(MediaCodecAdapter mediaCodecAdapter, @Nullable Surface surface) {
        int i11 = Util.SDK_INT;
        if (i11 >= 23 && surface != null) {
            setOutputSurfaceV23(mediaCodecAdapter, surface);
        } else {
            if (i11 < 35) {
                throw new IllegalStateException();
            }
            detachOutputSurfaceV35(mediaCodecAdapter);
        }
    }

    public static int supportsFormat(Context context, MediaCodecSelector mediaCodecSelector, Format format) throws MediaCodecUtil.DecoderQueryException {
        return supportsFormatInternal(context, mediaCodecSelector, format);
    }

    private static int supportsFormatInternal(Context context, MediaCodecSelector mediaCodecSelector, Format format) throws MediaCodecUtil.DecoderQueryException {
        boolean z11;
        int i11 = 0;
        if (!MimeTypes.isVideo(format.sampleMimeType)) {
            return RendererCapabilities.create(0);
        }
        boolean z12 = format.drmInitData != null;
        List<MediaCodecInfo> decoderInfos = getDecoderInfos(context, mediaCodecSelector, format, z12, false);
        if (z12 && decoderInfos.isEmpty()) {
            decoderInfos = getDecoderInfos(context, mediaCodecSelector, format, false, false);
        }
        if (decoderInfos.isEmpty()) {
            return RendererCapabilities.create(1);
        }
        if (!MediaCodecRenderer.supportsFormatDrm(format)) {
            return RendererCapabilities.create(2);
        }
        MediaCodecInfo mediaCodecInfo = decoderInfos.get(0);
        boolean isFormatSupported = mediaCodecInfo.isFormatSupported(format);
        if (!isFormatSupported) {
            for (int i12 = 1; i12 < decoderInfos.size(); i12++) {
                MediaCodecInfo mediaCodecInfo2 = decoderInfos.get(i12);
                if (mediaCodecInfo2.isFormatSupported(format)) {
                    z11 = false;
                    isFormatSupported = true;
                    mediaCodecInfo = mediaCodecInfo2;
                    break;
                }
            }
        }
        z11 = true;
        int i13 = isFormatSupported ? 4 : 3;
        int i14 = mediaCodecInfo.isSeamlessAdaptationSupported(format) ? 16 : 8;
        int i15 = mediaCodecInfo.hardwareAccelerated ? 64 : 0;
        int i16 = z11 ? 128 : 0;
        if (Util.SDK_INT >= 26 && MimeTypes.VIDEO_DOLBY_VISION.equals(format.sampleMimeType) && !Api26.doesDisplaySupportDolbyVision(context)) {
            i16 = 256;
        }
        if (isFormatSupported) {
            List<MediaCodecInfo> decoderInfos2 = getDecoderInfos(context, mediaCodecSelector, format, z12, true);
            if (!decoderInfos2.isEmpty()) {
                MediaCodecInfo mediaCodecInfo3 = MediaCodecUtil.getDecoderInfosSortedByFormatSupport(decoderInfos2, format).get(0);
                if (mediaCodecInfo3.isFormatSupported(format) && mediaCodecInfo3.isSeamlessAdaptationSupported(format)) {
                    i11 = 32;
                }
            }
        }
        return RendererCapabilities.create(i13, i14, i11, i15, i16);
    }

    private void updateCodecImportance() {
        MediaCodecAdapter codec = getCodec();
        if (codec != null && Util.SDK_INT >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.rendererPriority));
            codec.setParameters(bundle);
        }
    }

    private void updateDroppedBufferCountersWithInputBuffers(long j11) {
        int i11 = 0;
        while (true) {
            Long peek = this.droppedDecoderInputBufferTimestamps.peek();
            if (peek == null || peek.longValue() >= j11) {
                break;
            }
            i11++;
            this.droppedDecoderInputBufferTimestamps.poll();
        }
        updateDroppedBufferCounters(i11, 0);
    }

    private void updatePeriodDurationUs(MediaSource.MediaPeriodId mediaPeriodId) {
        Timeline timeline = getTimeline();
        if (timeline.isEmpty()) {
            this.periodDurationUs = C.TIME_UNSET;
        } else {
            this.periodDurationUs = timeline.getPeriodByUid(((MediaSource.MediaPeriodId) Assertions.checkNotNull(mediaPeriodId)).periodUid, new Timeline.Period()).getDurationUs();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public DecoderReuseEvaluation canReuseCodec(MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        DecoderReuseEvaluation canReuseCodec = mediaCodecInfo.canReuseCodec(format, format2);
        int i11 = canReuseCodec.discardReasons;
        CodecMaxValues codecMaxValues = (CodecMaxValues) Assertions.checkNotNull(this.codecMaxValues);
        if (format2.width > codecMaxValues.width || format2.height > codecMaxValues.height) {
            i11 |= 256;
        }
        if (getMaxInputSize(mediaCodecInfo, format2) > codecMaxValues.inputSize) {
            i11 |= 64;
        }
        int i12 = i11;
        return new DecoderReuseEvaluation(mediaCodecInfo.name, format, format2, i12 != 0 ? 0 : canReuseCodec.result, i12);
    }

    public void changeVideoSinkInputStream(VideoSink videoSink, int i11, Format format) {
        List<Effect> list = this.videoEffects;
        if (list == null) {
            list = ImmutableList.of();
        }
        videoSink.onInputStreamChanged(i11, format, list);
    }

    public boolean codecNeedsSetOutputSurfaceWorkaround(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (MediaCodecVideoRenderer.class) {
            try {
                if (!evaluatedDeviceNeedsSetOutputSurfaceWorkaround) {
                    deviceNeedsSetOutputSurfaceWorkaround = evaluateDeviceNeedsSetOutputSurfaceWorkaround();
                    evaluatedDeviceNeedsSetOutputSurfaceWorkaround = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return deviceNeedsSetOutputSurfaceWorkaround;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public MediaCodecDecoderException createDecoderException(Throwable th2, @Nullable MediaCodecInfo mediaCodecInfo) {
        return new MediaCodecVideoDecoderException(th2, mediaCodecInfo, this.displaySurface);
    }

    @RequiresApi(35)
    public void detachOutputSurfaceV35(MediaCodecAdapter mediaCodecAdapter) {
        mediaCodecAdapter.detachOutputSurface();
    }

    public void dropOutputBuffer(MediaCodecAdapter mediaCodecAdapter, int i11, long j11) {
        TraceUtil.beginSection("dropVideoBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i11, false);
        TraceUtil.endSection();
        updateDroppedBufferCounters(0, 1);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void enableMayRenderStartOfStream() {
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.enableMayRenderStartOfStream();
        } else {
            this.videoFrameReleaseControl.allowReleaseFirstFrameBeforeStarted();
        }
    }

    public long getBufferTimestampAdjustmentUs() {
        return -this.startPositionUs;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public int getCodecBufferFlags(DecoderInputBuffer decoderInputBuffer) {
        return (Util.SDK_INT >= 34 && this.tunneling && isBufferBeforeStartTime(decoderInputBuffer)) ? 32 : 0;
    }

    public CodecMaxValues getCodecMaxValues(MediaCodecInfo mediaCodecInfo, Format format, Format[] formatArr) {
        int codecMaxInputSize;
        int i11 = format.width;
        int i12 = format.height;
        int maxInputSize = getMaxInputSize(mediaCodecInfo, format);
        if (formatArr.length == 1) {
            if (maxInputSize != -1 && (codecMaxInputSize = getCodecMaxInputSize(mediaCodecInfo, format)) != -1) {
                maxInputSize = Math.min((int) (maxInputSize * 1.5f), codecMaxInputSize);
            }
            return new CodecMaxValues(i11, i12, maxInputSize);
        }
        int length = formatArr.length;
        boolean z11 = false;
        for (int i13 = 0; i13 < length; i13++) {
            Format format2 = formatArr[i13];
            if (format.colorInfo != null && format2.colorInfo == null) {
                format2 = format2.buildUpon().setColorInfo(format.colorInfo).build();
            }
            if (mediaCodecInfo.canReuseCodec(format, format2).result != 0) {
                int i14 = format2.width;
                z11 |= i14 == -1 || format2.height == -1;
                i11 = Math.max(i11, i14);
                i12 = Math.max(i12, format2.height);
                maxInputSize = Math.max(maxInputSize, getMaxInputSize(mediaCodecInfo, format2));
            }
        }
        if (z11) {
            Log.w(TAG, "Resolutions unknown. Codec max resolution: " + i11 + "x" + i12);
            Point codecMaxSize = getCodecMaxSize(mediaCodecInfo, format);
            if (codecMaxSize != null) {
                i11 = Math.max(i11, codecMaxSize.x);
                i12 = Math.max(i12, codecMaxSize.y);
                maxInputSize = Math.max(maxInputSize, getCodecMaxInputSize(mediaCodecInfo, format.buildUpon().setWidth(i11).setHeight(i12).build()));
                Log.w(TAG, "Codec max resolution adjusted to: " + i11 + "x" + i12);
            }
        }
        return new CodecMaxValues(i11, i12, maxInputSize);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean getCodecNeedsEosPropagation() {
        return this.tunneling && Util.SDK_INT < 23;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public float getCodecOperatingRateV23(float f11, Format format, Format[] formatArr) {
        float f12 = -1.0f;
        for (Format format2 : formatArr) {
            float f13 = format2.frameRate;
            if (f13 != -1.0f) {
                f12 = Math.max(f12, f13);
            }
        }
        if (f12 == -1.0f) {
            return -1.0f;
        }
        return f12 * f11;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector mediaCodecSelector, Format format, boolean z11) throws MediaCodecUtil.DecoderQueryException {
        return MediaCodecUtil.getDecoderInfosSortedByFormatSupport(getDecoderInfos(this.context, mediaCodecSelector, format, z11, this.tunneling), format);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public MediaCodecAdapter.Configuration getMediaCodecConfiguration(MediaCodecInfo mediaCodecInfo, Format format, @Nullable MediaCrypto mediaCrypto, float f11) {
        String str = mediaCodecInfo.codecMimeType;
        CodecMaxValues codecMaxValues = getCodecMaxValues(mediaCodecInfo, format, getStreamFormats());
        this.codecMaxValues = codecMaxValues;
        MediaFormat mediaFormat = getMediaFormat(format, str, codecMaxValues, f11, this.deviceNeedsNoPostProcessWorkaround, this.tunneling ? this.tunnelingAudioSessionId : 0);
        Surface surfaceForCodec = getSurfaceForCodec(mediaCodecInfo);
        maybeSetKeyAllowFrameDrop(mediaFormat);
        return MediaCodecAdapter.Configuration.createForVideoDecoding(mediaCodecInfo, mediaFormat, format, surfaceForCodec, mediaCrypto);
    }

    @SuppressLint({"InlinedApi"})
    public MediaFormat getMediaFormat(Format format, String str, CodecMaxValues codecMaxValues, float f11, boolean z11, int i11) {
        Pair<Integer, Integer> codecProfileAndLevel;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(IMediaFormat.KEY_MIME, str);
        mediaFormat.setInteger("width", format.width);
        mediaFormat.setInteger("height", format.height);
        MediaFormatUtil.setCsdBuffers(mediaFormat, format.initializationData);
        MediaFormatUtil.maybeSetFloat(mediaFormat, "frame-rate", format.frameRate);
        MediaFormatUtil.maybeSetInteger(mediaFormat, "rotation-degrees", format.rotationDegrees);
        MediaFormatUtil.maybeSetColorInfo(mediaFormat, format.colorInfo);
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(format.sampleMimeType) && (codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format)) != null) {
            MediaFormatUtil.maybeSetInteger(mediaFormat, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, ((Integer) codecProfileAndLevel.first).intValue());
        }
        mediaFormat.setInteger("max-width", codecMaxValues.width);
        mediaFormat.setInteger("max-height", codecMaxValues.height);
        MediaFormatUtil.maybeSetInteger(mediaFormat, "max-input-size", codecMaxValues.inputSize);
        int i12 = Util.SDK_INT;
        if (i12 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f11 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f11);
            }
        }
        if (z11) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i11 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i11);
        }
        if (i12 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.rendererPriority));
        }
        return mediaFormat;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public String getName() {
        return TAG;
    }

    @Nullable
    public Surface getSurface() {
        return this.displaySurface;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @TargetApi(29)
    public void handleInputBufferSupplementalData(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        if (this.codecHandlesHdr10PlusOutOfBandMetadata) {
            ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(decoderInputBuffer.supplementalData);
            if (byteBuffer.remaining() >= 7) {
                byte b11 = byteBuffer.get();
                short s11 = byteBuffer.getShort();
                short s12 = byteBuffer.getShort();
                byte b12 = byteBuffer.get();
                byte b13 = byteBuffer.get();
                byteBuffer.position(0);
                if (b11 == -75 && s11 == 60 && s12 == 1 && b12 == 4) {
                    if (b13 == 0 || b13 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        setHdr10PlusInfoV29((MediaCodecAdapter) Assertions.checkNotNull(getCodec()), bArr);
                    }
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i11, @Nullable Object obj) throws ExoPlaybackException {
        if (i11 == 1) {
            setOutput(obj);
            return;
        }
        if (i11 == 7) {
            VideoFrameMetadataListener videoFrameMetadataListener = (VideoFrameMetadataListener) Assertions.checkNotNull(obj);
            this.frameMetadataListener = videoFrameMetadataListener;
            VideoSink videoSink = this.videoSink;
            if (videoSink != null) {
                videoSink.setVideoFrameMetadataListener(videoFrameMetadataListener);
                return;
            }
            return;
        }
        if (i11 == 10) {
            int intValue = ((Integer) Assertions.checkNotNull(obj)).intValue();
            if (this.tunnelingAudioSessionId != intValue) {
                this.tunnelingAudioSessionId = intValue;
                if (this.tunneling) {
                    releaseCodec();
                    return;
                }
                return;
            }
            return;
        }
        if (i11 == 4) {
            this.scalingMode = ((Integer) Assertions.checkNotNull(obj)).intValue();
            MediaCodecAdapter codec = getCodec();
            if (codec != null) {
                codec.setVideoScalingMode(this.scalingMode);
                return;
            }
            return;
        }
        if (i11 == 5) {
            int intValue2 = ((Integer) Assertions.checkNotNull(obj)).intValue();
            this.changeFrameRateStrategy = intValue2;
            VideoSink videoSink2 = this.videoSink;
            if (videoSink2 != null) {
                videoSink2.setChangeFrameRateStrategy(intValue2);
                return;
            } else {
                this.videoFrameReleaseControl.setChangeFrameRateStrategy(intValue2);
                return;
            }
        }
        if (i11 == 13) {
            setVideoEffects((List) Assertions.checkNotNull(obj));
            return;
        }
        if (i11 == 14) {
            Size size = (Size) Assertions.checkNotNull(obj);
            if (size.getWidth() == 0 || size.getHeight() == 0) {
                return;
            }
            this.outputResolution = size;
            VideoSink videoSink3 = this.videoSink;
            if (videoSink3 != null) {
                videoSink3.setOutputSurfaceInfo((Surface) Assertions.checkStateNotNull(this.displaySurface), size);
                return;
            }
            return;
        }
        if (i11 == 16) {
            this.rendererPriority = ((Integer) Assertions.checkNotNull(obj)).intValue();
            updateCodecImportance();
        } else {
            if (i11 != 17) {
                super.handleMessage(i11, obj);
                return;
            }
            Surface surface = this.displaySurface;
            setOutput(null);
            ((MediaCodecVideoRenderer) Assertions.checkNotNull(obj)).handleMessage(1, surface);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        if (!super.isEnded()) {
            return false;
        }
        VideoSink videoSink = this.videoSink;
        return videoSink == null || videoSink.isEnded();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        boolean isReady = super.isReady();
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            return videoSink.isReady(isReady);
        }
        if (isReady && (getCodec() == null || this.tunneling)) {
            return true;
        }
        return this.videoFrameReleaseControl.isReady(isReady);
    }

    public boolean maybeDropBuffersToKeyframe(long j11, boolean z11) throws ExoPlaybackException {
        int skipSource = skipSource(j11);
        if (skipSource == 0) {
            return false;
        }
        if (z11) {
            DecoderCounters decoderCounters = this.decoderCounters;
            int i11 = decoderCounters.skippedInputBufferCount + skipSource;
            decoderCounters.skippedInputBufferCount = i11;
            decoderCounters.skippedOutputBufferCount += this.buffersInCodecCount;
            decoderCounters.skippedInputBufferCount = i11 + this.droppedDecoderInputBufferTimestamps.size();
        } else {
            this.decoderCounters.droppedToKeyframeCount++;
            updateDroppedBufferCounters(skipSource + this.droppedDecoderInputBufferTimestamps.size(), this.buffersInCodecCount);
        }
        flushOrReinitializeCodec();
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.flush(false);
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @CallSuper
    public boolean maybeInitializeProcessingPipeline(Format format) throws ExoPlaybackException {
        VideoSink videoSink = this.videoSink;
        if (videoSink == null || videoSink.isInitialized()) {
            return true;
        }
        try {
            return this.videoSink.initialize(format);
        } catch (VideoSink.VideoSinkException e11) {
            throw createRendererException(e11, format, 7000);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onCodecError(Exception exc) {
        Log.e(TAG, "Video codec error", exc);
        this.eventDispatcher.videoCodecError(exc);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onCodecInitialized(String str, MediaCodecAdapter.Configuration configuration, long j11, long j12) {
        this.eventDispatcher.decoderInitialized(str, j11, j12);
        this.codecNeedsSetOutputSurfaceWorkaround = codecNeedsSetOutputSurfaceWorkaround(str);
        this.codecHandlesHdr10PlusOutOfBandMetadata = ((MediaCodecInfo) Assertions.checkNotNull(getCodecInfo())).isHdr10PlusOutOfBandMetadataSupported();
        maybeSetupTunnelingForFirstFrame();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onCodecReleased(String str) {
        this.eventDispatcher.decoderReleased(str);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onDisabled() {
        this.reportedVideoSize = null;
        this.periodDurationUs = C.TIME_UNSET;
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.onRendererDisabled();
        } else {
            this.videoFrameReleaseControl.onDisabled();
        }
        maybeSetupTunnelingForFirstFrame();
        this.haveReportedFirstFrameRenderedForCurrentSurface = false;
        this.tunnelingOnFrameRenderedListener = null;
        try {
            super.onDisabled();
        } finally {
            this.eventDispatcher.disabled(this.decoderCounters);
            this.eventDispatcher.videoSizeChanged(VideoSize.UNKNOWN);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onEnabled(boolean z11, boolean z12) throws ExoPlaybackException {
        super.onEnabled(z11, z12);
        boolean z13 = getConfiguration().tunneling;
        Assertions.checkState((z13 && this.tunnelingAudioSessionId == 0) ? false : true);
        if (this.tunneling != z13) {
            this.tunneling = z13;
            releaseCodec();
        }
        this.eventDispatcher.enabled(this.decoderCounters);
        if (!this.hasSetVideoSink) {
            if (this.videoEffects != null && this.videoSink == null) {
                PlaybackVideoGraphWrapper build = new PlaybackVideoGraphWrapper.Builder(this.context, this.videoFrameReleaseControl).setClock(getClock()).build();
                build.setTotalVideoInputCount(1);
                this.videoSink = build.getSink(0);
            }
            this.hasSetVideoSink = true;
        }
        VideoSink videoSink = this.videoSink;
        if (videoSink == null) {
            this.videoFrameReleaseControl.setClock(getClock());
            this.videoFrameReleaseControl.onEnabled(z12);
            return;
        }
        videoSink.setListener(new VideoSink.Listener() { // from class: androidx.media3.exoplayer.video.MediaCodecVideoRenderer.1
            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public void onError(VideoSink videoSink2, VideoSink.VideoSinkException videoSinkException) {
                MediaCodecVideoRenderer mediaCodecVideoRenderer = MediaCodecVideoRenderer.this;
                mediaCodecVideoRenderer.setPendingPlaybackException(mediaCodecVideoRenderer.createRendererException(videoSinkException, videoSinkException.format, 7001));
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public void onFirstFrameRendered(VideoSink videoSink2) {
                if (MediaCodecVideoRenderer.this.displaySurface != null) {
                    MediaCodecVideoRenderer.this.notifyRenderedFirstFrame();
                }
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public void onFrameDropped(VideoSink videoSink2) {
                if (MediaCodecVideoRenderer.this.displaySurface != null) {
                    MediaCodecVideoRenderer.this.updateDroppedBufferCounters(0, 1);
                }
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public void onVideoSizeChanged(VideoSink videoSink2, VideoSize videoSize) {
            }
        }, w1.c());
        VideoFrameMetadataListener videoFrameMetadataListener = this.frameMetadataListener;
        if (videoFrameMetadataListener != null) {
            this.videoSink.setVideoFrameMetadataListener(videoFrameMetadataListener);
        }
        if (this.displaySurface != null && !this.outputResolution.equals(Size.UNKNOWN)) {
            this.videoSink.setOutputSurfaceInfo(this.displaySurface, this.outputResolution);
        }
        this.videoSink.setChangeFrameRateStrategy(this.changeFrameRateStrategy);
        this.videoSink.setPlaybackSpeed(getPlaybackSpeed());
        List<Effect> list = this.videoEffects;
        if (list != null) {
            this.videoSink.setVideoEffects(list);
        }
        this.videoSink.onRendererEnabled(z12);
        Renderer.WakeupListener wakeupListener = getWakeupListener();
        if (wakeupListener != null) {
            this.videoSink.setWakeupListener(wakeupListener);
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onInit() {
        super.onInit();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @Nullable
    public DecoderReuseEvaluation onInputFormatChanged(FormatHolder formatHolder) throws ExoPlaybackException {
        DecoderReuseEvaluation onInputFormatChanged = super.onInputFormatChanged(formatHolder);
        this.eventDispatcher.inputFormatChanged((Format) Assertions.checkNotNull(formatHolder.format), onInputFormatChanged);
        return onInputFormatChanged;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onOutputFormatChanged(Format format, @Nullable MediaFormat mediaFormat) {
        int integer;
        int i11;
        MediaCodecAdapter codec = getCodec();
        if (codec != null) {
            codec.setVideoScalingMode(this.scalingMode);
        }
        if (this.tunneling) {
            i11 = format.width;
            integer = format.height;
        } else {
            Assertions.checkNotNull(mediaFormat);
            boolean z11 = mediaFormat.containsKey(KEY_CROP_RIGHT) && mediaFormat.containsKey(KEY_CROP_LEFT) && mediaFormat.containsKey(KEY_CROP_BOTTOM) && mediaFormat.containsKey(KEY_CROP_TOP);
            int integer2 = z11 ? (mediaFormat.getInteger(KEY_CROP_RIGHT) - mediaFormat.getInteger(KEY_CROP_LEFT)) + 1 : mediaFormat.getInteger("width");
            integer = z11 ? (mediaFormat.getInteger(KEY_CROP_BOTTOM) - mediaFormat.getInteger(KEY_CROP_TOP)) + 1 : mediaFormat.getInteger("height");
            i11 = integer2;
        }
        float f11 = format.pixelWidthHeightRatio;
        int i12 = format.rotationDegrees;
        if (i12 == 90 || i12 == 270) {
            f11 = 1.0f / f11;
            int i13 = integer;
            integer = i11;
            i11 = i13;
        }
        this.decodedVideoSize = new VideoSize(i11, integer, f11);
        VideoSink videoSink = this.videoSink;
        if (videoSink == null || !this.pendingVideoSinkInputStreamChange) {
            this.videoFrameReleaseControl.setFrameRate(format.frameRate);
        } else {
            changeVideoSinkInputStream(videoSink, 1, format.buildUpon().setWidth(i11).setHeight(integer).setPixelWidthHeightRatio(f11).build());
        }
        this.pendingVideoSinkInputStreamChange = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onPositionReset(long j11, boolean z11) throws ExoPlaybackException {
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            if (!z11) {
                videoSink.flush(true);
            }
            this.videoSink.setStreamTimestampInfo(getOutputStreamStartPositionUs(), getBufferTimestampAdjustmentUs());
            this.pendingVideoSinkInputStreamChange = true;
        }
        super.onPositionReset(j11, z11);
        if (this.videoSink == null) {
            this.videoFrameReleaseControl.reset();
        }
        if (z11) {
            VideoSink videoSink2 = this.videoSink;
            if (videoSink2 != null) {
                videoSink2.join(false);
            } else {
                this.videoFrameReleaseControl.join(false);
            }
        }
        maybeSetupTunnelingForFirstFrame();
        this.consecutiveDroppedFrameCount = 0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @CallSuper
    public void onProcessedOutputBuffer(long j11) {
        super.onProcessedOutputBuffer(j11);
        if (this.tunneling) {
            return;
        }
        this.buffersInCodecCount--;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onProcessedStreamChange() {
        super.onProcessedStreamChange();
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.signalEndOfCurrentInputStream();
            this.videoSink.setStreamTimestampInfo(getOutputStreamStartPositionUs(), getBufferTimestampAdjustmentUs());
        } else {
            this.videoFrameReleaseControl.onProcessedStreamChange();
        }
        this.pendingVideoSinkInputStreamChange = true;
        maybeSetupTunnelingForFirstFrame();
    }

    public void onProcessedTunneledBuffer(long j11) throws ExoPlaybackException {
        updateOutputFormatForTime(j11);
        maybeNotifyVideoSizeChanged(this.decodedVideoSize);
        this.decoderCounters.renderedOutputBufferCount++;
        maybeNotifyRenderedFirstFrame();
        onProcessedOutputBuffer(j11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @CallSuper
    public void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        ByteBuffer byteBuffer;
        if (this.av1SampleDependencyParser != null && ((MediaCodecInfo) Assertions.checkNotNull(getCodecInfo())).mimeType.equals(MimeTypes.VIDEO_AV1) && (byteBuffer = decoderInputBuffer.data) != null) {
            this.av1SampleDependencyParser.queueInputBuffer(byteBuffer);
        }
        this.consecutiveDroppedInputBufferCount = 0;
        boolean z11 = this.tunneling;
        if (!z11) {
            this.buffersInCodecCount++;
        }
        if (Util.SDK_INT >= 23 || !z11) {
            return;
        }
        onProcessedTunneledBuffer(decoderInputBuffer.timeUs);
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onRelease() {
        super.onRelease();
        VideoSink videoSink = this.videoSink;
        if (videoSink == null || !this.ownsVideoSink) {
            return;
        }
        videoSink.release();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onReset() {
        try {
            super.onReset();
        } finally {
            this.hasSetVideoSink = false;
            this.startPositionUs = C.TIME_UNSET;
            releasePlaceholderSurface();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onStarted() {
        super.onStarted();
        this.droppedFrames = 0;
        this.droppedFrameAccumulationStartTimeMs = getClock().elapsedRealtime();
        this.totalVideoFrameProcessingOffsetUs = 0L;
        this.videoFrameProcessingOffsetCount = 0;
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.onRendererStarted();
        } else {
            this.videoFrameReleaseControl.onStarted();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onStopped() {
        maybeNotifyDroppedFrames();
        maybeNotifyVideoFrameProcessingOffset();
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.onRendererStopped();
        } else {
            this.videoFrameReleaseControl.onStopped();
        }
        super.onStopped();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public void onStreamChanged(Format[] formatArr, long j11, long j12, MediaSource.MediaPeriodId mediaPeriodId) throws ExoPlaybackException {
        super.onStreamChanged(formatArr, j11, j12, mediaPeriodId);
        if (this.startPositionUs == C.TIME_UNSET) {
            this.startPositionUs = j11;
        }
        updatePeriodDurationUs(mediaPeriodId);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void onWakeupListenerSet(Renderer.WakeupListener wakeupListener) {
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.setWakeupListener(wakeupListener);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean processOutputBuffer(long j11, long j12, @Nullable final MediaCodecAdapter mediaCodecAdapter, @Nullable ByteBuffer byteBuffer, final int i11, int i12, int i13, long j13, boolean z11, boolean z12, Format format) throws ExoPlaybackException {
        Assertions.checkNotNull(mediaCodecAdapter);
        final long outputStreamOffsetUs = j13 - getOutputStreamOffsetUs();
        updateDroppedBufferCountersWithInputBuffers(j13);
        if (this.videoSink != null) {
            if (!z11 || z12) {
                return this.videoSink.handleInputFrame(getBufferTimestampAdjustmentUs() + j13, z12, new VideoSink.VideoFrameHandler() { // from class: androidx.media3.exoplayer.video.MediaCodecVideoRenderer.2
                    @Override // androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler
                    public void render(long j14) {
                        MediaCodecVideoRenderer.this.renderOutputBuffer(mediaCodecAdapter, i11, outputStreamOffsetUs, j14);
                    }

                    @Override // androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler
                    public void skip() {
                        MediaCodecVideoRenderer.this.skipOutputBuffer(mediaCodecAdapter, i11, outputStreamOffsetUs);
                    }
                });
            }
            skipOutputBuffer(mediaCodecAdapter, i11, outputStreamOffsetUs);
            return true;
        }
        int frameReleaseAction = this.videoFrameReleaseControl.getFrameReleaseAction(j13, j11, j12, getOutputStreamStartPositionUs(), z11, z12, this.videoFrameReleaseInfo);
        if (frameReleaseAction == 0) {
            long nanoTime = getClock().nanoTime();
            notifyFrameMetadataListener(outputStreamOffsetUs, nanoTime, format);
            renderOutputBuffer(mediaCodecAdapter, i11, outputStreamOffsetUs, nanoTime);
            updateVideoFrameProcessingOffsetCounters(this.videoFrameReleaseInfo.getEarlyUs());
            return true;
        }
        if (frameReleaseAction == 1) {
            releaseFrame((MediaCodecAdapter) Assertions.checkStateNotNull(mediaCodecAdapter), i11, outputStreamOffsetUs, format);
            return true;
        }
        if (frameReleaseAction == 2) {
            dropOutputBuffer(mediaCodecAdapter, i11, outputStreamOffsetUs);
            updateVideoFrameProcessingOffsetCounters(this.videoFrameReleaseInfo.getEarlyUs());
            return true;
        }
        if (frameReleaseAction == 3) {
            skipOutputBuffer(mediaCodecAdapter, i11, outputStreamOffsetUs);
            updateVideoFrameProcessingOffsetCounters(this.videoFrameReleaseInfo.getEarlyUs());
            return true;
        }
        if (frameReleaseAction == 4 || frameReleaseAction == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(frameReleaseAction));
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    @CallSuper
    public void render(long j11, long j12) throws ExoPlaybackException {
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            try {
                videoSink.render(j11, j12);
            } catch (VideoSink.VideoSinkException e11) {
                throw createRendererException(e11, e11.format, 7001);
            }
        }
        super.render(j11, j12);
    }

    public void renderOutputBufferV21(MediaCodecAdapter mediaCodecAdapter, int i11, long j11, long j12) {
        TraceUtil.beginSection("releaseOutputBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i11, j12);
        TraceUtil.endSection();
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        if (this.videoSink == null) {
            maybeNotifyVideoSizeChanged(this.decodedVideoSize);
            maybeNotifyRenderedFirstFrame();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public void renderToEndOfStream() {
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.signalEndOfCurrentInputStream();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @CallSuper
    public void resetCodecStateForFlush() {
        super.resetCodecStateForFlush();
        this.droppedDecoderInputBufferTimestamps.clear();
        this.shouldDropDecoderInputBuffers = false;
        this.buffersInCodecCount = 0;
        this.consecutiveDroppedInputBufferCount = 0;
        Av1SampleDependencyParser av1SampleDependencyParser = this.av1SampleDependencyParser;
        if (av1SampleDependencyParser != null) {
            av1SampleDependencyParser.reset();
        }
    }

    @RequiresApi(23)
    public void setOutputSurfaceV23(MediaCodecAdapter mediaCodecAdapter, Surface surface) {
        mediaCodecAdapter.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public void setPlaybackSpeed(float f11, float f12) throws ExoPlaybackException {
        super.setPlaybackSpeed(f11, f12);
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.setPlaybackSpeed(f11);
        } else {
            this.videoFrameReleaseControl.setPlaybackSpeed(f11);
        }
    }

    public void setVideoEffects(List<Effect> list) {
        this.videoEffects = list;
        VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.setVideoEffects(list);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean shouldDiscardDecoderInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        if (isBufferProbablyLastSample(decoderInputBuffer) || decoderInputBuffer.isEncrypted()) {
            return false;
        }
        boolean isBufferBeforeStartTime = isBufferBeforeStartTime(decoderInputBuffer);
        if ((!isBufferBeforeStartTime && !this.shouldDropDecoderInputBuffers) || decoderInputBuffer.hasSupplementalData()) {
            return false;
        }
        if (decoderInputBuffer.notDependedOn()) {
            decoderInputBuffer.clear();
            if (isBufferBeforeStartTime) {
                this.decoderCounters.skippedInputBufferCount++;
            } else if (this.shouldDropDecoderInputBuffers) {
                this.droppedDecoderInputBufferTimestamps.add(Long.valueOf(decoderInputBuffer.timeUs));
                this.consecutiveDroppedInputBufferCount++;
            }
            return true;
        }
        if (this.av1SampleDependencyParser != null && ((MediaCodecInfo) Assertions.checkNotNull(getCodecInfo())).mimeType.equals(MimeTypes.VIDEO_AV1) && (byteBuffer = decoderInputBuffer.data) != null) {
            boolean z11 = isBufferBeforeStartTime || this.consecutiveDroppedInputBufferCount <= 0;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            asReadOnlyBuffer.flip();
            int sampleLimitAfterSkippingNonReferenceFrame = this.av1SampleDependencyParser.sampleLimitAfterSkippingNonReferenceFrame(asReadOnlyBuffer, z11);
            boolean z12 = ((CodecMaxValues) Assertions.checkNotNull(this.codecMaxValues)).inputSize + sampleLimitAfterSkippingNonReferenceFrame < asReadOnlyBuffer.capacity();
            if (sampleLimitAfterSkippingNonReferenceFrame != asReadOnlyBuffer.limit() && z12) {
                ((ByteBuffer) Assertions.checkNotNull(decoderInputBuffer.data)).position(sampleLimitAfterSkippingNonReferenceFrame);
                if (isBufferBeforeStartTime) {
                    this.decoderCounters.skippedInputBufferCount++;
                } else if (this.shouldDropDecoderInputBuffers) {
                    this.droppedDecoderInputBufferTimestamps.add(Long.valueOf(decoderInputBuffer.timeUs));
                    this.consecutiveDroppedInputBufferCount++;
                }
                return true;
            }
        }
        return false;
    }

    public boolean shouldDropBuffersToKeyframe(long j11, long j12, boolean z11) {
        return j11 < MIN_EARLY_US_VERY_LATE_THRESHOLD && !z11;
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator
    public boolean shouldDropFrame(long j11, long j12, boolean z11) {
        return shouldDropOutputBuffer(j11, j12, z11);
    }

    public boolean shouldDropOutputBuffer(long j11, long j12, boolean z11) {
        return j11 < MIN_EARLY_US_LATE_THRESHOLD && !z11;
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator
    public boolean shouldForceReleaseFrame(long j11, long j12) {
        return shouldForceRenderOutputBuffer(j11, j12);
    }

    public boolean shouldForceRenderOutputBuffer(long j11, long j12) {
        return j11 < MIN_EARLY_US_LATE_THRESHOLD && j12 > 100000;
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator
    public boolean shouldIgnoreFrame(long j11, long j12, long j13, boolean z11, boolean z12) throws ExoPlaybackException {
        if (this.minEarlyUsToDropDecoderInput != C.TIME_UNSET) {
            this.shouldDropDecoderInputBuffers = j12 > getLastResetPositionUs() + OFFSET_FROM_RESET_POSITION_TO_ALLOW_INPUT_BUFFER_DROPPING_US && j11 < this.minEarlyUsToDropDecoderInput;
        }
        return shouldDropBuffersToKeyframe(j11, j13, z11) && maybeDropBuffersToKeyframe(j12, z12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public boolean shouldInitCodec(MediaCodecInfo mediaCodecInfo) {
        return hasSurfaceForCodec(mediaCodecInfo);
    }

    public boolean shouldSkipBuffersWithIdenticalReleaseTime() {
        return true;
    }

    public boolean shouldUseDetachedSurface(MediaCodecInfo mediaCodecInfo) {
        return Util.SDK_INT >= 35 && mediaCodecInfo.detachedSurfaceSupported;
    }

    public boolean shouldUsePlaceholderSurface(MediaCodecInfo mediaCodecInfo) {
        if (Util.SDK_INT < 23 || this.tunneling || codecNeedsSetOutputSurfaceWorkaround(mediaCodecInfo.name)) {
            return false;
        }
        return !mediaCodecInfo.secure || PlaceholderSurface.isSecureSupported(this.context);
    }

    public void skipOutputBuffer(MediaCodecAdapter mediaCodecAdapter, int i11, long j11) {
        TraceUtil.beginSection("skipVideoBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i11, false);
        TraceUtil.endSection();
        this.decoderCounters.skippedOutputBufferCount++;
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

    public void updateVideoFrameProcessingOffsetCounters(long j11) {
        this.decoderCounters.addVideoFrameProcessingOffset(j11);
        this.totalVideoFrameProcessingOffsetUs += j11;
        this.videoFrameProcessingOffsetCount++;
    }

    @Deprecated
    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j11) {
        this(new Builder(context).setMediaCodecSelector(mediaCodecSelector).setAllowedJoiningTimeMs(j11));
    }

    @Deprecated
    public void renderOutputBuffer(MediaCodecAdapter mediaCodecAdapter, int i11, long j11) {
        TraceUtil.beginSection("releaseOutputBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i11, true);
        TraceUtil.endSection();
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        if (this.videoSink == null) {
            maybeNotifyVideoSizeChanged(this.decodedVideoSize);
            maybeNotifyRenderedFirstFrame();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public int supportsFormat(MediaCodecSelector mediaCodecSelector, Format format) throws MediaCodecUtil.DecoderQueryException {
        return supportsFormatInternal(this.context, mediaCodecSelector, format);
    }

    private static List<MediaCodecInfo> getDecoderInfos(Context context, MediaCodecSelector mediaCodecSelector, Format format, boolean z11, boolean z12) throws MediaCodecUtil.DecoderQueryException {
        String str = format.sampleMimeType;
        if (str == null) {
            return ImmutableList.of();
        }
        if (Util.SDK_INT >= 26 && MimeTypes.VIDEO_DOLBY_VISION.equals(str) && !Api26.doesDisplaySupportDolbyVision(context)) {
            List<MediaCodecInfo> alternativeDecoderInfos = MediaCodecUtil.getAlternativeDecoderInfos(mediaCodecSelector, format, z11, z12);
            if (!alternativeDecoderInfos.isEmpty()) {
                return alternativeDecoderInfos;
            }
        }
        return MediaCodecUtil.getDecoderInfosSoftMatch(mediaCodecSelector, format, z11, z12);
    }

    @Deprecated
    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j11, @Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener, int i11) {
        this(new Builder(context).setMediaCodecSelector(mediaCodecSelector).setAllowedJoiningTimeMs(j11).setEventHandler(handler).setEventListener(videoRendererEventListener).setMaxDroppedFramesToNotify(i11));
    }

    @Deprecated
    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j11, boolean z11, @Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener, int i11) {
        this(new Builder(context).setMediaCodecSelector(mediaCodecSelector).setAllowedJoiningTimeMs(j11).setEnableDecoderFallback(z11).setEventHandler(handler).setEventListener(videoRendererEventListener).setMaxDroppedFramesToNotify(i11));
    }

    @Deprecated
    public MediaCodecVideoRenderer(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, long j11, boolean z11, @Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener, int i11) {
        this(new Builder(context).setMediaCodecSelector(mediaCodecSelector).setCodecAdapterFactory(factory).setAllowedJoiningTimeMs(j11).setEnableDecoderFallback(z11).setEventHandler(handler).setEventListener(videoRendererEventListener).setMaxDroppedFramesToNotify(i11));
    }

    @Deprecated
    public MediaCodecVideoRenderer(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, long j11, boolean z11, @Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener, int i11, float f11) {
        this(new Builder(context).setMediaCodecSelector(mediaCodecSelector).setCodecAdapterFactory(factory).setAllowedJoiningTimeMs(j11).setEnableDecoderFallback(z11).setEventHandler(handler).setEventListener(videoRendererEventListener).setMaxDroppedFramesToNotify(i11).setAssumedMinimumCodecOperatingRate(f11));
    }

    @Deprecated
    public MediaCodecVideoRenderer(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, long j11, boolean z11, @Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener, int i11, float f11, @Nullable VideoSinkProvider videoSinkProvider) {
        this(new Builder(context).setMediaCodecSelector(mediaCodecSelector).setCodecAdapterFactory(factory).setAllowedJoiningTimeMs(j11).setEnableDecoderFallback(z11).setEventHandler(handler).setEventListener(videoRendererEventListener).setMaxDroppedFramesToNotify(i11).setAssumedMinimumCodecOperatingRate(f11).setVideoSink(videoSinkProvider == null ? null : videoSinkProvider.getSink(0)));
    }

    @Deprecated
    public MediaCodecVideoRenderer(Context context, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, long j11, boolean z11, @Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener, int i11, float f11, @Nullable VideoSink videoSink) {
        this(new Builder(context).setMediaCodecSelector(mediaCodecSelector).setCodecAdapterFactory(factory).setAllowedJoiningTimeMs(j11).setEnableDecoderFallback(z11).setEventHandler(handler).setEventListener(videoRendererEventListener).setMaxDroppedFramesToNotify(i11).setAssumedMinimumCodecOperatingRate(f11).setVideoSink(videoSink));
    }

    public MediaCodecVideoRenderer(Builder builder) {
        super(2, builder.codecAdapterFactory, builder.mediaCodecSelector, builder.enableDecoderFallback, builder.assumedMinimumCodecOperatingRate);
        Context applicationContext = builder.context.getApplicationContext();
        this.context = applicationContext;
        this.maxDroppedFramesToNotify = builder.maxDroppedFramesToNotify;
        this.videoSink = builder.videoSink;
        this.eventDispatcher = new VideoRendererEventListener.EventDispatcher(builder.eventHandler, builder.eventListener);
        this.ownsVideoSink = this.videoSink == null;
        this.videoFrameReleaseControl = new VideoFrameReleaseControl(applicationContext, this, builder.allowedJoiningTimeMs);
        this.videoFrameReleaseInfo = new VideoFrameReleaseControl.FrameReleaseInfo();
        this.deviceNeedsNoPostProcessWorkaround = deviceNeedsNoPostProcessWorkaround();
        this.outputResolution = Size.UNKNOWN;
        this.scalingMode = 1;
        this.changeFrameRateStrategy = 0;
        this.decodedVideoSize = VideoSize.UNKNOWN;
        this.tunnelingAudioSessionId = 0;
        this.reportedVideoSize = null;
        this.rendererPriority = -1000;
        long j11 = C.TIME_UNSET;
        this.startPositionUs = C.TIME_UNSET;
        this.periodDurationUs = C.TIME_UNSET;
        this.av1SampleDependencyParser = builder.parseAv1SampleDependencies ? new Av1SampleDependencyParser() : null;
        this.droppedDecoderInputBufferTimestamps = new PriorityQueue<>();
        this.minEarlyUsToDropDecoderInput = builder.lateThresholdToDropDecoderInputUs != C.TIME_UNSET ? -builder.lateThresholdToDropDecoderInputUs : j11;
    }
}
