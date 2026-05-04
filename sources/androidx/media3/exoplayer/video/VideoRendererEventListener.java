package androidx.media3.exoplayer.video;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface VideoRendererEventListener {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class EventDispatcher {

        @Nullable
        private final Handler handler;

        @Nullable
        private final VideoRendererEventListener listener;

        public EventDispatcher(@Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener) {
            this.handler = videoRendererEventListener != null ? (Handler) Assertions.checkNotNull(handler) : null;
            this.listener = videoRendererEventListener;
        }

        public static /* synthetic */ void d(EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
            eventDispatcher.getClass();
            decoderCounters.ensureUpdated();
            ((VideoRendererEventListener) Util.castNonNull(eventDispatcher.listener)).onVideoDisabled(decoderCounters);
        }

        public void decoderInitialized(final String str, final long j11, final long j12) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(VideoRendererEventListener.EventDispatcher.this.listener)).onVideoDecoderInitialized(str, j11, j12);
                    }
                });
            }
        }

        public void decoderReleased(final String str) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(VideoRendererEventListener.EventDispatcher.this.listener)).onVideoDecoderReleased(str);
                    }
                });
            }
        }

        public void disabled(final DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        VideoRendererEventListener.EventDispatcher.d(VideoRendererEventListener.EventDispatcher.this, decoderCounters);
                    }
                });
            }
        }

        public void droppedFrames(final int i11, final long j11) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(VideoRendererEventListener.EventDispatcher.this.listener)).onDroppedFrames(i11, j11);
                    }
                });
            }
        }

        public void enabled(final DecoderCounters decoderCounters) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(VideoRendererEventListener.EventDispatcher.this.listener)).onVideoEnabled(decoderCounters);
                    }
                });
            }
        }

        public void inputFormatChanged(final Format format, @Nullable final DecoderReuseEvaluation decoderReuseEvaluation) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(VideoRendererEventListener.EventDispatcher.this.listener)).onVideoInputFormatChanged(format, decoderReuseEvaluation);
                    }
                });
            }
        }

        public void renderedFirstFrame(final Object obj) {
            if (this.handler != null) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                this.handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(VideoRendererEventListener.EventDispatcher.this.listener)).onRenderedFirstFrame(obj, elapsedRealtime);
                    }
                });
            }
        }

        public void reportVideoFrameProcessingOffset(final long j11, final int i11) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(VideoRendererEventListener.EventDispatcher.this.listener)).onVideoFrameProcessingOffset(j11, i11);
                    }
                });
            }
        }

        public void videoCodecError(final Exception exc) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(VideoRendererEventListener.EventDispatcher.this.listener)).onVideoCodecError(exc);
                    }
                });
            }
        }

        public void videoSizeChanged(final VideoSize videoSize) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: androidx.media3.exoplayer.video.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((VideoRendererEventListener) Util.castNonNull(VideoRendererEventListener.EventDispatcher.this.listener)).onVideoSizeChanged(videoSize);
                    }
                });
            }
        }
    }

    default void onVideoCodecError(Exception exc) {
    }

    default void onVideoDecoderReleased(String str) {
    }

    default void onVideoDisabled(DecoderCounters decoderCounters) {
    }

    default void onVideoEnabled(DecoderCounters decoderCounters) {
    }

    default void onVideoSizeChanged(VideoSize videoSize) {
    }

    default void onDroppedFrames(int i11, long j11) {
    }

    default void onRenderedFirstFrame(Object obj, long j11) {
    }

    default void onVideoFrameProcessingOffset(long j11, int i11) {
    }

    default void onVideoInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    default void onVideoDecoderInitialized(String str, long j11, long j12) {
    }
}
