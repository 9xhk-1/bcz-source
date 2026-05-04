package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DebugViewProvider;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.PreviewingVideoGraph;
import androidx.media3.common.SurfaceInfo;
import androidx.media3.common.VideoCompositorSettings;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.common.VideoGraph;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.common.util.TimestampIterator;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper;
import androidx.media3.exoplayer.video.VideoSink;
import com.google.common.collect.ImmutableList;
import ho.p0;
import ho.r0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@UnstableApi
/* loaded from: classes2.dex */
public final class PlaybackVideoGraphWrapper implements VideoSinkProvider, VideoGraph.Listener {
    private static final Executor NO_OP_EXECUTOR = new Executor() { // from class: androidx.media3.exoplayer.video.i
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            PlaybackVideoGraphWrapper.a(runnable);
        }
    };
    private static final int PRIMARY_SEQUENCE_INDEX = 0;
    private static final int STATE_CREATED = 0;
    private static final int STATE_INITIALIZED = 1;
    private static final int STATE_RELEASED = 2;
    private long bufferTimestampAdjustmentUs;
    private final Clock clock;
    private final List<Effect> compositionEffects;
    private final VideoCompositorSettings compositorSettings;
    private final Context context;

    @Nullable
    private Pair<Surface, Size> currentSurfaceAndSize;
    private final VideoSink defaultVideoSink;
    private long finalBufferPresentationTimeUs;
    private HandlerWrapper handler;
    private boolean hasSignaledEndOfCurrentInputStream;
    private final SparseArray<InputVideoSink> inputVideoSinks;
    private long lastOutputBufferPresentationTimeUs;
    private final CopyOnWriteArraySet<Listener> listeners;
    private long outputStreamStartPositionUs;
    private int pendingFlushCount;
    private final PreviewingVideoGraph.Factory previewingVideoGraphFactory;
    private int registeredVideoInputCount;
    private final boolean requestOpenGlToneMapping;
    private int state;
    private final TimedValueQueue<Long> streamStartPositionsUs;
    private int totalVideoInputCount;
    private final VideoSink.VideoFrameHandler videoFrameHandler;
    private PreviewingVideoGraph videoGraph;
    private Format videoGraphOutputFormat;

    @Nullable
    private Renderer.WakeupListener wakeupListener;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Builder {
        private boolean built;
        private final Context context;
        private PreviewingVideoGraph.Factory previewingVideoGraphFactory;
        private boolean requestOpenGlToneMapping;
        private VideoFrameProcessor.Factory videoFrameProcessorFactory;
        private final VideoFrameReleaseControl videoFrameReleaseControl;
        private List<Effect> compositionEffects = ImmutableList.of();
        private VideoCompositorSettings compositorSettings = VideoCompositorSettings.DEFAULT;
        private Clock clock = Clock.DEFAULT;

        public Builder(Context context, VideoFrameReleaseControl videoFrameReleaseControl) {
            this.context = context.getApplicationContext();
            this.videoFrameReleaseControl = videoFrameReleaseControl;
        }

        public PlaybackVideoGraphWrapper build() {
            Assertions.checkState(!this.built);
            if (this.previewingVideoGraphFactory == null) {
                if (this.videoFrameProcessorFactory == null) {
                    this.videoFrameProcessorFactory = new ReflectiveDefaultVideoFrameProcessorFactory();
                }
                this.previewingVideoGraphFactory = new ReflectivePreviewingSingleInputVideoGraphFactory(this.videoFrameProcessorFactory);
            }
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = new PlaybackVideoGraphWrapper(this);
            this.built = true;
            return playbackVideoGraphWrapper;
        }

        @uo.a
        public Builder setClock(Clock clock) {
            this.clock = clock;
            return this;
        }

        @uo.a
        public Builder setCompositionEffects(List<Effect> list) {
            this.compositionEffects = list;
            return this;
        }

        @uo.a
        public Builder setCompositorSettings(VideoCompositorSettings videoCompositorSettings) {
            this.compositorSettings = videoCompositorSettings;
            return this;
        }

        @uo.a
        public Builder setPreviewingVideoGraphFactory(PreviewingVideoGraph.Factory factory) {
            this.previewingVideoGraphFactory = factory;
            return this;
        }

        @uo.a
        public Builder setRequestOpenGlToneMapping(boolean z11) {
            this.requestOpenGlToneMapping = z11;
            return this;
        }

        @uo.a
        public Builder setVideoFrameProcessorFactory(VideoFrameProcessor.Factory factory) {
            this.videoFrameProcessorFactory = factory;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class DefaultVideoSinkListener implements VideoSink.Listener {
        private DefaultVideoSinkListener() {
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.Listener
        public void onError(VideoSink videoSink, VideoSink.VideoSinkException videoSinkException) {
            Iterator it = PlaybackVideoGraphWrapper.this.listeners.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onError(PlaybackVideoGraphWrapper.this, VideoFrameProcessingException.from(videoSinkException));
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.Listener
        public void onFirstFrameRendered(VideoSink videoSink) {
            Iterator it = PlaybackVideoGraphWrapper.this.listeners.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onFirstFrameRendered(PlaybackVideoGraphWrapper.this);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.Listener
        public void onFrameDropped(VideoSink videoSink) {
            Iterator it = PlaybackVideoGraphWrapper.this.listeners.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onFrameDropped(PlaybackVideoGraphWrapper.this);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.Listener
        public void onVideoSizeChanged(VideoSink videoSink, VideoSize videoSize) {
            Iterator it = PlaybackVideoGraphWrapper.this.listeners.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onVideoSizeChanged(PlaybackVideoGraphWrapper.this, videoSize);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class InputVideoSink implements VideoSink, Listener {
        private long inputBufferTimestampAdjustmentUs;

        @Nullable
        private Format inputFormat;
        private final int inputIndex;
        private int inputType;
        private boolean signaledEndOfStream;

        @Nullable
        private VideoFrameProcessor videoFrameProcessor;
        private final int videoFrameProcessorMaxPendingFrameCount;
        private ImmutableList<Effect> videoEffects = ImmutableList.of();
        private long lastBufferPresentationTimeUs = C.TIME_UNSET;
        private VideoSink.Listener listener = VideoSink.Listener.NO_OP;
        private Executor listenerExecutor = PlaybackVideoGraphWrapper.NO_OP_EXECUTOR;

        public InputVideoSink(Context context, int i11) {
            this.inputIndex = i11;
            this.videoFrameProcessorMaxPendingFrameCount = Util.getMaxPendingFramesCountForMediaCodecDecoders(context);
        }

        public static /* synthetic */ void a(InputVideoSink inputVideoSink, VideoSink.Listener listener, VideoFrameProcessingException videoFrameProcessingException) {
            inputVideoSink.getClass();
            listener.onError(inputVideoSink, new VideoSink.VideoSinkException(videoFrameProcessingException, (Format) Assertions.checkStateNotNull(inputVideoSink.inputFormat)));
        }

        public static /* synthetic */ void b(InputVideoSink inputVideoSink, VideoSink.Listener listener, VideoSize videoSize) {
            inputVideoSink.getClass();
            listener.onVideoSizeChanged(inputVideoSink, videoSize);
        }

        public static /* synthetic */ void c(InputVideoSink inputVideoSink, VideoSink.Listener listener) {
            inputVideoSink.getClass();
            listener.onFrameDropped((VideoSink) Assertions.checkStateNotNull(inputVideoSink));
        }

        public static /* synthetic */ void d(InputVideoSink inputVideoSink, VideoSink.Listener listener) {
            inputVideoSink.getClass();
            listener.onFirstFrameRendered(inputVideoSink);
        }

        private void registerInputStream(Format format) {
            ((VideoFrameProcessor) Assertions.checkStateNotNull(this.videoFrameProcessor)).registerInputStream(this.inputType, format.buildUpon().setColorInfo(PlaybackVideoGraphWrapper.getAdjustedInputColorInfo(format.colorInfo)).build(), this.videoEffects, 0L);
        }

        private void setPendingVideoEffects(List<Effect> list) {
            if (PlaybackVideoGraphWrapper.this.previewingVideoGraphFactory.supportsMultipleInputs()) {
                this.videoEffects = ImmutableList.copyOf((Collection) list);
            } else {
                this.videoEffects = new ImmutableList.a().c(list).c(PlaybackVideoGraphWrapper.this.compositionEffects).e();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void clearOutputSurfaceInfo() {
            PlaybackVideoGraphWrapper.this.clearOutputSurfaceInfo();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void enableMayRenderStartOfStream() {
            PlaybackVideoGraphWrapper.this.defaultVideoSink.enableMayRenderStartOfStream();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void flush(boolean z11) {
            if (isInitialized()) {
                this.videoFrameProcessor.flush();
            }
            this.lastBufferPresentationTimeUs = C.TIME_UNSET;
            PlaybackVideoGraphWrapper.this.flush(z11);
            this.signaledEndOfStream = false;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public Surface getInputSurface() {
            Assertions.checkState(isInitialized());
            return ((VideoFrameProcessor) Assertions.checkStateNotNull(this.videoFrameProcessor)).getInputSurface();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean handleInputBitmap(Bitmap bitmap, TimestampIterator timestampIterator) {
            Assertions.checkState(isInitialized());
            if (!PlaybackVideoGraphWrapper.this.shouldRenderToInputVideoSink() || !((VideoFrameProcessor) Assertions.checkNotNull(this.videoFrameProcessor)).queueInputBitmap(bitmap, timestampIterator)) {
                return false;
            }
            long lastTimestampUs = timestampIterator.getLastTimestampUs() - this.inputBufferTimestampAdjustmentUs;
            Assertions.checkState(lastTimestampUs != C.TIME_UNSET);
            this.lastBufferPresentationTimeUs = lastTimestampUs;
            return true;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean handleInputFrame(long j11, boolean z11, VideoSink.VideoFrameHandler videoFrameHandler) {
            Assertions.checkState(isInitialized());
            if (!PlaybackVideoGraphWrapper.this.shouldRenderToInputVideoSink() || ((VideoFrameProcessor) Assertions.checkStateNotNull(this.videoFrameProcessor)).getPendingInputFrameCount() >= this.videoFrameProcessorMaxPendingFrameCount || !((VideoFrameProcessor) Assertions.checkStateNotNull(this.videoFrameProcessor)).registerInputFrame()) {
                return false;
            }
            this.lastBufferPresentationTimeUs = j11 - this.inputBufferTimestampAdjustmentUs;
            videoFrameHandler.render(j11 * 1000);
            return true;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean initialize(Format format) throws VideoSink.VideoSinkException {
            Assertions.checkState(!isInitialized());
            VideoFrameProcessor registerInput = PlaybackVideoGraphWrapper.this.registerInput(format, this.inputIndex);
            this.videoFrameProcessor = registerInput;
            return registerInput != null;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isEnded() {
            return isInitialized() && PlaybackVideoGraphWrapper.this.isEnded();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        @EnsuresNonNullIf(expression = {"videoFrameProcessor"}, result = true)
        public boolean isInitialized() {
            return this.videoFrameProcessor != null;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isReady(boolean z11) {
            return PlaybackVideoGraphWrapper.this.isReady(z11 && isInitialized());
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void join(boolean z11) {
            PlaybackVideoGraphWrapper.this.defaultVideoSink.join(z11);
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public void onError(PlaybackVideoGraphWrapper playbackVideoGraphWrapper, final VideoFrameProcessingException videoFrameProcessingException) {
            final VideoSink.Listener listener = this.listener;
            this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.k
                @Override // java.lang.Runnable
                public final void run() {
                    PlaybackVideoGraphWrapper.InputVideoSink.a(PlaybackVideoGraphWrapper.InputVideoSink.this, listener, videoFrameProcessingException);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public void onFirstFrameRendered(PlaybackVideoGraphWrapper playbackVideoGraphWrapper) {
            final VideoSink.Listener listener = this.listener;
            this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.l
                @Override // java.lang.Runnable
                public final void run() {
                    PlaybackVideoGraphWrapper.InputVideoSink.d(PlaybackVideoGraphWrapper.InputVideoSink.this, listener);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public void onFrameDropped(PlaybackVideoGraphWrapper playbackVideoGraphWrapper) {
            final VideoSink.Listener listener = this.listener;
            this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.m
                @Override // java.lang.Runnable
                public final void run() {
                    PlaybackVideoGraphWrapper.InputVideoSink.c(PlaybackVideoGraphWrapper.InputVideoSink.this, listener);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void onInputStreamChanged(int i11, Format format, List<Effect> list) {
            Assertions.checkState(isInitialized());
            if (i11 != 1 && i11 != 2) {
                throw new UnsupportedOperationException("Unsupported input type " + i11);
            }
            setPendingVideoEffects(list);
            this.inputType = i11;
            this.inputFormat = format;
            PlaybackVideoGraphWrapper.this.finalBufferPresentationTimeUs = C.TIME_UNSET;
            PlaybackVideoGraphWrapper.this.hasSignaledEndOfCurrentInputStream = false;
            registerInputStream(format);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void onRendererDisabled() {
            PlaybackVideoGraphWrapper.this.defaultVideoSink.onRendererDisabled();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void onRendererEnabled(boolean z11) {
            PlaybackVideoGraphWrapper.this.defaultVideoSink.onRendererEnabled(z11);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void onRendererStarted() {
            PlaybackVideoGraphWrapper.this.defaultVideoSink.onRendererStarted();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void onRendererStopped() {
            PlaybackVideoGraphWrapper.this.defaultVideoSink.onRendererStopped();
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public void onVideoSizeChanged(PlaybackVideoGraphWrapper playbackVideoGraphWrapper, final VideoSize videoSize) {
            final VideoSink.Listener listener = this.listener;
            this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.j
                @Override // java.lang.Runnable
                public final void run() {
                    PlaybackVideoGraphWrapper.InputVideoSink.b(PlaybackVideoGraphWrapper.InputVideoSink.this, listener, videoSize);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void release() {
            PlaybackVideoGraphWrapper.this.release();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void render(long j11, long j12) throws VideoSink.VideoSinkException {
            PlaybackVideoGraphWrapper.this.render(j11, j12);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setChangeFrameRateStrategy(int i11) {
            PlaybackVideoGraphWrapper.this.defaultVideoSink.setChangeFrameRateStrategy(i11);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setListener(VideoSink.Listener listener, Executor executor) {
            this.listener = listener;
            this.listenerExecutor = executor;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setOutputSurfaceInfo(Surface surface, Size size) {
            PlaybackVideoGraphWrapper.this.setOutputSurfaceInfo(surface, size);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setPlaybackSpeed(@FloatRange(from = 0.0d, fromInclusive = false) float f11) {
            PlaybackVideoGraphWrapper.this.setPlaybackSpeed(f11);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setStreamTimestampInfo(long j11, long j12) {
            TimedValueQueue timedValueQueue = PlaybackVideoGraphWrapper.this.streamStartPositionsUs;
            long j13 = this.lastBufferPresentationTimeUs;
            timedValueQueue.add(j13 == C.TIME_UNSET ? 0L : j13 + 1, Long.valueOf(j11));
            this.inputBufferTimestampAdjustmentUs = j12;
            PlaybackVideoGraphWrapper.this.setBufferTimestampAdjustment(j12);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setVideoEffects(List<Effect> list) {
            if (this.videoEffects.equals(list)) {
                return;
            }
            setPendingVideoEffects(list);
            Format format = this.inputFormat;
            if (format != null) {
                registerInputStream(format);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
            PlaybackVideoGraphWrapper.this.setVideoFrameMetadataListener(videoFrameMetadataListener);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setWakeupListener(Renderer.WakeupListener wakeupListener) {
            PlaybackVideoGraphWrapper.this.wakeupListener = wakeupListener;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void signalEndOfCurrentInputStream() {
            PlaybackVideoGraphWrapper.this.finalBufferPresentationTimeUs = this.lastBufferPresentationTimeUs;
            if (PlaybackVideoGraphWrapper.this.lastOutputBufferPresentationTimeUs >= PlaybackVideoGraphWrapper.this.finalBufferPresentationTimeUs) {
                PlaybackVideoGraphWrapper.this.defaultVideoSink.signalEndOfCurrentInputStream();
                PlaybackVideoGraphWrapper.this.hasSignaledEndOfCurrentInputStream = true;
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void signalEndOfInput() {
            if (!this.signaledEndOfStream && isInitialized()) {
                this.videoFrameProcessor.signalEndOfInput();
                this.signaledEndOfStream = true;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Listener {
        void onError(PlaybackVideoGraphWrapper playbackVideoGraphWrapper, VideoFrameProcessingException videoFrameProcessingException);

        void onFirstFrameRendered(PlaybackVideoGraphWrapper playbackVideoGraphWrapper);

        void onFrameDropped(PlaybackVideoGraphWrapper playbackVideoGraphWrapper);

        void onVideoSizeChanged(PlaybackVideoGraphWrapper playbackVideoGraphWrapper, VideoSize videoSize);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ReflectiveDefaultVideoFrameProcessorFactory implements VideoFrameProcessor.Factory {
        private static final p0<VideoFrameProcessor.Factory> VIDEO_FRAME_PROCESSOR_FACTORY_SUPPLIER = r0.b(new p0() { // from class: androidx.media3.exoplayer.video.n
            @Override // ho.p0
            public final Object get() {
                return PlaybackVideoGraphWrapper.ReflectiveDefaultVideoFrameProcessorFactory.a();
            }
        });

        private ReflectiveDefaultVideoFrameProcessorFactory() {
        }

        public static /* synthetic */ VideoFrameProcessor.Factory a() {
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                return (VideoFrameProcessor.Factory) Assertions.checkNotNull(cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null));
            } catch (Exception e11) {
                throw new IllegalStateException(e11);
            }
        }

        @Override // androidx.media3.common.VideoFrameProcessor.Factory
        public VideoFrameProcessor create(Context context, DebugViewProvider debugViewProvider, ColorInfo colorInfo, boolean z11, Executor executor, VideoFrameProcessor.Listener listener) throws VideoFrameProcessingException {
            return VIDEO_FRAME_PROCESSOR_FACTORY_SUPPLIER.get().create(context, debugViewProvider, colorInfo, z11, executor, listener);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ReflectivePreviewingSingleInputVideoGraphFactory implements PreviewingVideoGraph.Factory {
        private final VideoFrameProcessor.Factory videoFrameProcessorFactory;

        public ReflectivePreviewingSingleInputVideoGraphFactory(VideoFrameProcessor.Factory factory) {
            this.videoFrameProcessorFactory = factory;
        }

        @Override // androidx.media3.common.PreviewingVideoGraph.Factory
        public PreviewingVideoGraph create(Context context, ColorInfo colorInfo, DebugViewProvider debugViewProvider, VideoGraph.Listener listener, Executor executor, VideoCompositorSettings videoCompositorSettings, List<Effect> list, long j11) throws VideoFrameProcessingException {
            try {
                return ((PreviewingVideoGraph.Factory) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(VideoFrameProcessor.Factory.class).newInstance(this.videoFrameProcessorFactory)).create(context, colorInfo, debugViewProvider, listener, executor, videoCompositorSettings, list, j11);
            } catch (Exception e11) {
                throw VideoFrameProcessingException.from(e11);
            }
        }

        @Override // androidx.media3.common.PreviewingVideoGraph.Factory
        public boolean supportsMultipleInputs() {
            return false;
        }
    }

    public static /* synthetic */ void b(PlaybackVideoGraphWrapper playbackVideoGraphWrapper) {
        playbackVideoGraphWrapper.pendingFlushCount--;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void flush(boolean z11) {
        if (isInitialized()) {
            this.pendingFlushCount++;
            this.defaultVideoSink.flush(z11);
            while (this.streamStartPositionsUs.size() > 1) {
                this.streamStartPositionsUs.pollFirst();
            }
            if (this.streamStartPositionsUs.size() == 1) {
                this.defaultVideoSink.setStreamTimestampInfo(((Long) Assertions.checkNotNull(this.streamStartPositionsUs.pollFirst())).longValue(), this.bufferTimestampAdjustmentUs);
            }
            this.lastOutputBufferPresentationTimeUs = C.TIME_UNSET;
            this.finalBufferPresentationTimeUs = C.TIME_UNSET;
            this.hasSignaledEndOfCurrentInputStream = false;
            ((HandlerWrapper) Assertions.checkStateNotNull(this.handler)).post(new Runnable() { // from class: androidx.media3.exoplayer.video.h
                @Override // java.lang.Runnable
                public final void run() {
                    PlaybackVideoGraphWrapper.b(PlaybackVideoGraphWrapper.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ColorInfo getAdjustedInputColorInfo(@Nullable ColorInfo colorInfo) {
        return (colorInfo == null || !colorInfo.isDataSpaceValid()) ? ColorInfo.SDR_BT709_LIMITED : colorInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isEnded() {
        return this.pendingFlushCount == 0 && this.hasSignaledEndOfCurrentInputStream && this.defaultVideoSink.isEnded();
    }

    private boolean isInitialized() {
        return this.state == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isReady(boolean z11) {
        return this.defaultVideoSink.isReady(z11 && this.pendingFlushCount == 0);
    }

    private void maybeSetOutputSurfaceInfo(@Nullable Surface surface, int i11, int i12) {
        PreviewingVideoGraph previewingVideoGraph = this.videoGraph;
        if (previewingVideoGraph == null) {
            return;
        }
        if (surface != null) {
            previewingVideoGraph.setOutputSurfaceInfo(new SurfaceInfo(surface, i11, i12));
            this.defaultVideoSink.setOutputSurfaceInfo(surface, new Size(i11, i12));
        } else {
            previewingVideoGraph.setOutputSurfaceInfo(null);
            this.defaultVideoSink.clearOutputSurfaceInfo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public VideoFrameProcessor registerInput(Format format, int i11) throws VideoSink.VideoSinkException {
        PlaybackVideoGraphWrapper playbackVideoGraphWrapper;
        if (i11 == 0) {
            Assertions.checkState(this.state == 0);
            ColorInfo adjustedInputColorInfo = getAdjustedInputColorInfo(format.colorInfo);
            if (this.requestOpenGlToneMapping) {
                adjustedInputColorInfo = ColorInfo.SDR_BT709_LIMITED;
            } else if (adjustedInputColorInfo.colorTransfer == 7 && Util.SDK_INT < 34) {
                adjustedInputColorInfo = adjustedInputColorInfo.buildUpon().setColorTransfer(6).build();
            }
            ColorInfo colorInfo = adjustedInputColorInfo;
            final HandlerWrapper createHandler = this.clock.createHandler((Looper) Assertions.checkStateNotNull(Looper.myLooper()), null);
            this.handler = createHandler;
            try {
                PreviewingVideoGraph.Factory factory = this.previewingVideoGraphFactory;
                Context context = this.context;
                DebugViewProvider debugViewProvider = DebugViewProvider.NONE;
                Objects.requireNonNull(createHandler);
                playbackVideoGraphWrapper = this;
                try {
                    PreviewingVideoGraph create = factory.create(context, colorInfo, debugViewProvider, playbackVideoGraphWrapper, new Executor() { // from class: androidx.media3.exoplayer.video.g
                        @Override // java.util.concurrent.Executor
                        public final void execute(Runnable runnable) {
                            HandlerWrapper.this.post(runnable);
                        }
                    }, this.compositorSettings, this.compositionEffects, 0L);
                    playbackVideoGraphWrapper.videoGraph = create;
                    create.initialize();
                    Pair<Surface, Size> pair = playbackVideoGraphWrapper.currentSurfaceAndSize;
                    if (pair != null) {
                        Surface surface = (Surface) pair.first;
                        Size size = (Size) pair.second;
                        maybeSetOutputSurfaceInfo(surface, size.getWidth(), size.getHeight());
                    }
                    playbackVideoGraphWrapper.defaultVideoSink.initialize(format);
                    playbackVideoGraphWrapper.state = 1;
                } catch (VideoFrameProcessingException e11) {
                    e = e11;
                    throw new VideoSink.VideoSinkException(e, format);
                }
            } catch (VideoFrameProcessingException e12) {
                e = e12;
            }
        } else {
            playbackVideoGraphWrapper = this;
            if (!isInitialized()) {
                return null;
            }
        }
        try {
            ((PreviewingVideoGraph) Assertions.checkNotNull(playbackVideoGraphWrapper.videoGraph)).registerInput(i11);
            playbackVideoGraphWrapper.registeredVideoInputCount++;
            VideoSink videoSink = playbackVideoGraphWrapper.defaultVideoSink;
            DefaultVideoSinkListener defaultVideoSinkListener = new DefaultVideoSinkListener();
            final HandlerWrapper handlerWrapper = (HandlerWrapper) Assertions.checkNotNull(playbackVideoGraphWrapper.handler);
            Objects.requireNonNull(handlerWrapper);
            videoSink.setListener(defaultVideoSinkListener, new Executor() { // from class: androidx.media3.exoplayer.video.g
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    HandlerWrapper.this.post(runnable);
                }
            });
            return playbackVideoGraphWrapper.videoGraph.getProcessor(i11);
        } catch (VideoFrameProcessingException e13) {
            throw new VideoSink.VideoSinkException(e13, format);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(long j11, long j12) throws VideoSink.VideoSinkException {
        this.defaultVideoSink.render(j11, j12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBufferTimestampAdjustment(long j11) {
        this.bufferTimestampAdjustmentUs = j11;
        this.defaultVideoSink.setStreamTimestampInfo(this.outputStreamStartPositionUs, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f11) {
        this.defaultVideoSink.setPlaybackSpeed(f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
        this.defaultVideoSink.setVideoFrameMetadataListener(videoFrameMetadataListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldRenderToInputVideoSink() {
        int i11 = this.totalVideoInputCount;
        return i11 != -1 && i11 == this.registeredVideoInputCount;
    }

    public void addListener(Listener listener) {
        this.listeners.add(listener);
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public void clearOutputSurfaceInfo() {
        Size size = Size.UNKNOWN;
        maybeSetOutputSurfaceInfo(null, size.getWidth(), size.getHeight());
        this.currentSurfaceAndSize = null;
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public VideoSink getSink(int i11) {
        Assertions.checkState(!Util.contains(this.inputVideoSinks, i11));
        InputVideoSink inputVideoSink = new InputVideoSink(this.context, i11);
        addListener(inputVideoSink);
        this.inputVideoSinks.put(i11, inputVideoSink);
        return inputVideoSink;
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onError(VideoFrameProcessingException videoFrameProcessingException) {
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onError(this, videoFrameProcessingException);
        }
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onOutputFrameAvailableForRendering(long j11) {
        if (this.pendingFlushCount > 0) {
            return;
        }
        Renderer.WakeupListener wakeupListener = this.wakeupListener;
        if (wakeupListener != null) {
            wakeupListener.onWakeup();
        }
        long j12 = j11 - this.bufferTimestampAdjustmentUs;
        this.lastOutputBufferPresentationTimeUs = j12;
        Long pollFloor = this.streamStartPositionsUs.pollFloor(j12);
        if (pollFloor != null && pollFloor.longValue() != this.outputStreamStartPositionUs) {
            this.defaultVideoSink.setStreamTimestampInfo(pollFloor.longValue(), this.bufferTimestampAdjustmentUs);
            this.outputStreamStartPositionUs = pollFloor.longValue();
        }
        long j13 = this.finalBufferPresentationTimeUs;
        boolean z11 = j13 != C.TIME_UNSET && j12 >= j13;
        this.defaultVideoSink.handleInputFrame(j11, z11, this.videoFrameHandler);
        if (z11) {
            this.defaultVideoSink.signalEndOfCurrentInputStream();
            this.hasSignaledEndOfCurrentInputStream = true;
        }
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onOutputFrameRateChanged(float f11) {
        Format build = this.videoGraphOutputFormat.buildUpon().setFrameRate(f11).build();
        this.videoGraphOutputFormat = build;
        this.defaultVideoSink.onInputStreamChanged(1, build, ImmutableList.of());
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onOutputSizeChanged(int i11, int i12) {
        Format build = this.videoGraphOutputFormat.buildUpon().setWidth(i11).setHeight(i12).build();
        this.videoGraphOutputFormat = build;
        this.defaultVideoSink.onInputStreamChanged(1, build, ImmutableList.of());
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public void release() {
        if (this.state == 2) {
            return;
        }
        HandlerWrapper handlerWrapper = this.handler;
        if (handlerWrapper != null) {
            handlerWrapper.removeCallbacksAndMessages(null);
        }
        PreviewingVideoGraph previewingVideoGraph = this.videoGraph;
        if (previewingVideoGraph != null) {
            previewingVideoGraph.release();
        }
        this.currentSurfaceAndSize = null;
        this.state = 2;
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    @Override // androidx.media3.exoplayer.video.VideoSinkProvider
    public void setOutputSurfaceInfo(Surface surface, Size size) {
        Pair<Surface, Size> pair = this.currentSurfaceAndSize;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((Size) this.currentSurfaceAndSize.second).equals(size)) {
            return;
        }
        this.currentSurfaceAndSize = Pair.create(surface, size);
        maybeSetOutputSurfaceInfo(surface, size.getWidth(), size.getHeight());
    }

    public void setTotalVideoInputCount(int i11) {
        this.totalVideoInputCount = i11;
    }

    private PlaybackVideoGraphWrapper(Builder builder) {
        this.context = builder.context;
        this.streamStartPositionsUs = new TimedValueQueue<>();
        this.previewingVideoGraphFactory = (PreviewingVideoGraph.Factory) Assertions.checkStateNotNull(builder.previewingVideoGraphFactory);
        this.inputVideoSinks = new SparseArray<>();
        this.compositionEffects = builder.compositionEffects;
        this.compositorSettings = builder.compositorSettings;
        Clock clock = builder.clock;
        this.clock = clock;
        this.defaultVideoSink = new DefaultVideoSink(builder.videoFrameReleaseControl, clock);
        this.videoFrameHandler = new VideoSink.VideoFrameHandler() { // from class: androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.1
            @Override // androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler
            public void render(long j11) {
                ((PreviewingVideoGraph) Assertions.checkStateNotNull(PlaybackVideoGraphWrapper.this.videoGraph)).renderOutputFrame(j11);
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler
            public void skip() {
                ((PreviewingVideoGraph) Assertions.checkStateNotNull(PlaybackVideoGraphWrapper.this.videoGraph)).renderOutputFrame(-2L);
            }
        };
        this.listeners = new CopyOnWriteArraySet<>();
        this.requestOpenGlToneMapping = builder.requestOpenGlToneMapping;
        this.videoGraphOutputFormat = new Format.Builder().build();
        this.lastOutputBufferPresentationTimeUs = C.TIME_UNSET;
        this.finalBufferPresentationTimeUs = C.TIME_UNSET;
        this.totalVideoInputCount = -1;
        this.state = 0;
    }

    public static /* synthetic */ void a(Runnable runnable) {
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onEnded(long j11) {
    }
}
