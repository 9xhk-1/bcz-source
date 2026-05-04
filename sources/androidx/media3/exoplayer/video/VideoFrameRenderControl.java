package androidx.media3.exoplayer.video;

import androidx.media3.common.C;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.VideoFrameReleaseControl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class VideoFrameRenderControl {
    private final FrameRenderer frameRenderer;
    private long outputStreamStartPositionUs;
    private final VideoFrameReleaseControl videoFrameReleaseControl;
    private final VideoFrameReleaseControl.FrameReleaseInfo videoFrameReleaseInfo = new VideoFrameReleaseControl.FrameReleaseInfo();
    private final TimedValueQueue<VideoSize> videoSizes = new TimedValueQueue<>();
    private final TimedValueQueue<Long> streamStartPositionsUs = new TimedValueQueue<>();
    private final LongArrayQueue presentationTimestampsUs = new LongArrayQueue();
    private long latestInputPresentationTimeUs = C.TIME_UNSET;
    private VideoSize outputVideoSize = VideoSize.UNKNOWN;
    private long latestOutputPresentationTimeUs = C.TIME_UNSET;
    private long lastPresentationTimeUs = C.TIME_UNSET;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface FrameRenderer {
        void dropFrame();

        void onVideoSizeChanged(VideoSize videoSize);

        void renderFrame(long j11, long j12, boolean z11);
    }

    public VideoFrameRenderControl(FrameRenderer frameRenderer, VideoFrameReleaseControl videoFrameReleaseControl) {
        this.frameRenderer = frameRenderer;
        this.videoFrameReleaseControl = videoFrameReleaseControl;
    }

    private void dropFrame() {
        this.presentationTimestampsUs.remove();
        this.frameRenderer.dropFrame();
    }

    private static <T> T getLastAndClear(TimedValueQueue<T> timedValueQueue) {
        Assertions.checkArgument(timedValueQueue.size() > 0);
        while (timedValueQueue.size() > 1) {
            timedValueQueue.pollFirst();
        }
        return (T) Assertions.checkNotNull(timedValueQueue.pollFirst());
    }

    private boolean maybeUpdateOutputStreamStartPosition(long j11) {
        Long pollFloor = this.streamStartPositionsUs.pollFloor(j11);
        if (pollFloor == null || pollFloor.longValue() == this.outputStreamStartPositionUs) {
            return false;
        }
        this.outputStreamStartPositionUs = pollFloor.longValue();
        return true;
    }

    private boolean maybeUpdateOutputVideoSize(long j11) {
        VideoSize pollFloor = this.videoSizes.pollFloor(j11);
        if (pollFloor == null || pollFloor.equals(VideoSize.UNKNOWN) || pollFloor.equals(this.outputVideoSize)) {
            return false;
        }
        this.outputVideoSize = pollFloor;
        return true;
    }

    private void renderFrame(boolean z11) {
        long remove = this.presentationTimestampsUs.remove();
        if (maybeUpdateOutputVideoSize(remove)) {
            this.frameRenderer.onVideoSizeChanged(this.outputVideoSize);
        }
        this.frameRenderer.renderFrame(z11 ? -1L : this.videoFrameReleaseInfo.getReleaseTimeNs(), remove, this.videoFrameReleaseControl.onFrameReleasedIsFirstFrame());
    }

    public void flush() {
        this.presentationTimestampsUs.clear();
        this.latestInputPresentationTimeUs = C.TIME_UNSET;
        this.latestOutputPresentationTimeUs = C.TIME_UNSET;
        this.lastPresentationTimeUs = C.TIME_UNSET;
        if (this.streamStartPositionsUs.size() > 0) {
            Long l11 = (Long) getLastAndClear(this.streamStartPositionsUs);
            l11.longValue();
            this.streamStartPositionsUs.add(0L, l11);
        }
        if (this.videoSizes.size() > 0) {
            this.videoSizes.add(0L, (VideoSize) getLastAndClear(this.videoSizes));
        }
    }

    public boolean isEnded() {
        long j11 = this.lastPresentationTimeUs;
        return j11 != C.TIME_UNSET && this.latestOutputPresentationTimeUs == j11;
    }

    public void onFrameAvailableForRendering(long j11) {
        this.presentationTimestampsUs.add(j11);
        this.latestInputPresentationTimeUs = j11;
        this.lastPresentationTimeUs = C.TIME_UNSET;
    }

    public void onStreamStartPositionChanged(long j11) {
        TimedValueQueue<Long> timedValueQueue = this.streamStartPositionsUs;
        long j12 = this.latestInputPresentationTimeUs;
        timedValueQueue.add(j12 == C.TIME_UNSET ? 0L : j12 + 1, Long.valueOf(j11));
    }

    public void onVideoSizeChanged(int i11, int i12) {
        TimedValueQueue<VideoSize> timedValueQueue = this.videoSizes;
        long j11 = this.latestInputPresentationTimeUs;
        timedValueQueue.add(j11 == C.TIME_UNSET ? 0L : j11 + 1, new VideoSize(i11, i12));
    }

    public void render(long j11, long j12) throws ExoPlaybackException {
        while (!this.presentationTimestampsUs.isEmpty()) {
            long element = this.presentationTimestampsUs.element();
            if (maybeUpdateOutputStreamStartPosition(element)) {
                this.videoFrameReleaseControl.onProcessedStreamChange();
            }
            int frameReleaseAction = this.videoFrameReleaseControl.getFrameReleaseAction(element, j11, j12, this.outputStreamStartPositionUs, false, false, this.videoFrameReleaseInfo);
            if (frameReleaseAction == 0 || frameReleaseAction == 1) {
                this.latestOutputPresentationTimeUs = element;
                renderFrame(frameReleaseAction == 0);
            } else if (frameReleaseAction == 2 || frameReleaseAction == 3) {
                this.latestOutputPresentationTimeUs = element;
                dropFrame();
            } else {
                if (frameReleaseAction != 4) {
                    if (frameReleaseAction != 5) {
                        throw new IllegalStateException(String.valueOf(frameReleaseAction));
                    }
                    return;
                }
                this.latestOutputPresentationTimeUs = element;
            }
        }
    }

    public void signalEndOfInput() {
        this.lastPresentationTimeUs = this.latestInputPresentationTimeUs;
    }
}
