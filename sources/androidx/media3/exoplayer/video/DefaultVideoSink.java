package androidx.media3.exoplayer.video;

import android.graphics.Bitmap;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.TimestampIterator;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.video.VideoFrameRenderControl;
import androidx.media3.exoplayer.video.VideoSink;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class DefaultVideoSink implements VideoSink {
    private long bufferTimestampAdjustmentUs;
    private final Clock clock;
    private Format inputFormat;
    private VideoSink.Listener listener;
    private Executor listenerExecutor;

    @Nullable
    private Surface outputSurface;
    private long streamStartPositionUs;
    private final Queue<VideoSink.VideoFrameHandler> videoFrameHandlers;
    private VideoFrameMetadataListener videoFrameMetadataListener;
    private final VideoFrameReleaseControl videoFrameReleaseControl;
    private final VideoFrameRenderControl videoFrameRenderControl;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class FrameRendererImpl implements VideoFrameRenderControl.FrameRenderer {
        private Format outputFormat;

        private FrameRendererImpl() {
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameRenderControl.FrameRenderer
        public void dropFrame() {
            DefaultVideoSink.this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.d
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultVideoSink.this.listener.onFrameDropped(DefaultVideoSink.this);
                }
            });
            ((VideoSink.VideoFrameHandler) DefaultVideoSink.this.videoFrameHandlers.remove()).skip();
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameRenderControl.FrameRenderer
        public void onVideoSizeChanged(final VideoSize videoSize) {
            this.outputFormat = new Format.Builder().setWidth(videoSize.width).setHeight(videoSize.height).setSampleMimeType(MimeTypes.VIDEO_RAW).build();
            DefaultVideoSink.this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.e
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultVideoSink.this.listener.onVideoSizeChanged(DefaultVideoSink.this, videoSize);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameRenderControl.FrameRenderer
        public void renderFrame(long j11, long j12, boolean z11) {
            if (z11 && DefaultVideoSink.this.outputSurface != null) {
                DefaultVideoSink.this.listenerExecutor.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultVideoSink.this.listener.onFirstFrameRendered(DefaultVideoSink.this);
                    }
                });
            }
            Format format = this.outputFormat;
            if (format == null) {
                format = new Format.Builder().build();
            }
            DefaultVideoSink.this.videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j12, DefaultVideoSink.this.clock.nanoTime(), format, null);
            ((VideoSink.VideoFrameHandler) DefaultVideoSink.this.videoFrameHandlers.remove()).render(j11);
        }
    }

    public DefaultVideoSink(VideoFrameReleaseControl videoFrameReleaseControl, Clock clock) {
        this.videoFrameReleaseControl = videoFrameReleaseControl;
        videoFrameReleaseControl.setClock(clock);
        this.clock = clock;
        this.videoFrameRenderControl = new VideoFrameRenderControl(new FrameRendererImpl(), videoFrameReleaseControl);
        this.videoFrameHandlers = new ArrayDeque();
        this.inputFormat = new Format.Builder().build();
        this.streamStartPositionUs = C.TIME_UNSET;
        this.listener = VideoSink.Listener.NO_OP;
        this.listenerExecutor = new Executor() { // from class: androidx.media3.exoplayer.video.a
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                DefaultVideoSink.a(runnable);
            }
        };
        this.videoFrameMetadataListener = new VideoFrameMetadataListener() { // from class: androidx.media3.exoplayer.video.b
            @Override // androidx.media3.exoplayer.video.VideoFrameMetadataListener
            public final void onVideoFrameAboutToBeRendered(long j11, long j12, Format format, MediaFormat mediaFormat) {
                DefaultVideoSink.b(j11, j12, format, mediaFormat);
            }
        };
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void clearOutputSurfaceInfo() {
        this.outputSurface = null;
        this.videoFrameReleaseControl.setOutputSurface(null);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void enableMayRenderStartOfStream() {
        this.videoFrameReleaseControl.allowReleaseFirstFrameBeforeStarted();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void flush(boolean z11) {
        if (z11) {
            this.videoFrameReleaseControl.reset();
        }
        this.videoFrameRenderControl.flush();
        this.videoFrameHandlers.clear();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public Surface getInputSurface() {
        return (Surface) Assertions.checkStateNotNull(this.outputSurface);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean handleInputBitmap(Bitmap bitmap, TimestampIterator timestampIterator) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean handleInputFrame(long j11, boolean z11, VideoSink.VideoFrameHandler videoFrameHandler) {
        this.videoFrameHandlers.add(videoFrameHandler);
        this.videoFrameRenderControl.onFrameAvailableForRendering(j11 - this.bufferTimestampAdjustmentUs);
        return true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean initialize(Format format) {
        return true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean isEnded() {
        return this.videoFrameRenderControl.isEnded();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean isInitialized() {
        return true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean isReady(boolean z11) {
        return this.videoFrameReleaseControl.isReady(z11);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void join(boolean z11) {
        this.videoFrameReleaseControl.join(z11);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void onInputStreamChanged(int i11, Format format, List<Effect> list) {
        Assertions.checkState(list.isEmpty());
        int i12 = format.width;
        Format format2 = this.inputFormat;
        if (i12 != format2.width || format.height != format2.height) {
            this.videoFrameRenderControl.onVideoSizeChanged(i12, format.height);
        }
        float f11 = format.frameRate;
        if (f11 != this.inputFormat.frameRate) {
            this.videoFrameReleaseControl.setFrameRate(f11);
        }
        this.inputFormat = format;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void onRendererDisabled() {
        this.videoFrameReleaseControl.onDisabled();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void onRendererEnabled(boolean z11) {
        this.videoFrameReleaseControl.onEnabled(z11);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void onRendererStarted() {
        this.videoFrameReleaseControl.onStarted();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void onRendererStopped() {
        this.videoFrameReleaseControl.onStopped();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void render(long j11, long j12) throws VideoSink.VideoSinkException {
        try {
            this.videoFrameRenderControl.render(j11, j12);
        } catch (ExoPlaybackException e11) {
            throw new VideoSink.VideoSinkException(e11, this.inputFormat);
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setChangeFrameRateStrategy(int i11) {
        this.videoFrameReleaseControl.setChangeFrameRateStrategy(i11);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setListener(VideoSink.Listener listener, Executor executor) {
        this.listener = listener;
        this.listenerExecutor = executor;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setOutputSurfaceInfo(Surface surface, Size size) {
        this.outputSurface = surface;
        this.videoFrameReleaseControl.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setPlaybackSpeed(float f11) {
        this.videoFrameReleaseControl.setPlaybackSpeed(f11);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setStreamTimestampInfo(long j11, long j12) {
        if (j11 != this.streamStartPositionUs) {
            this.videoFrameRenderControl.onStreamStartPositionChanged(j11);
            this.streamStartPositionUs = j11;
        }
        this.bufferTimestampAdjustmentUs = j12;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setVideoEffects(List<Effect> list) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
        this.videoFrameMetadataListener = videoFrameMetadataListener;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setWakeupListener(Renderer.WakeupListener wakeupListener) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void signalEndOfCurrentInputStream() {
        this.videoFrameRenderControl.signalEndOfInput();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void release() {
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void signalEndOfInput() {
    }

    public static /* synthetic */ void a(Runnable runnable) {
    }

    public static /* synthetic */ void b(long j11, long j12, Format format, MediaFormat mediaFormat) {
    }
}
