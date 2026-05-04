package androidx.media3.exoplayer.util;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.Player;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.ExoPlayer;
import com.baicizhan.main.home.player.IslandsKt;
import java.util.Locale;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class DebugTextViewHelper {
    private static final int REFRESH_INTERVAL_MS = 1000;
    private final ExoPlayer player;
    private boolean started;
    private final TextView textView;
    private final Updater updater;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class Updater implements Player.Listener, Runnable {
        private Updater() {
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayWhenReadyChanged(boolean z11, int i11) {
            DebugTextViewHelper.this.updateAndPost();
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackStateChanged(int i11) {
            DebugTextViewHelper.this.updateAndPost();
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i11) {
            DebugTextViewHelper.this.updateAndPost();
        }

        @Override // java.lang.Runnable
        public void run() {
            DebugTextViewHelper.this.updateAndPost();
        }
    }

    public DebugTextViewHelper(ExoPlayer exoPlayer, TextView textView) {
        Assertions.checkArgument(exoPlayer.getApplicationLooper() == Looper.getMainLooper());
        this.player = exoPlayer;
        this.textView = textView;
        this.updater = new Updater();
    }

    private static String getColorInfoString(@Nullable ColorInfo colorInfo) {
        if (colorInfo == null || !colorInfo.isValid()) {
            return "";
        }
        return " colr:" + colorInfo.toLogString();
    }

    private static String getDecoderCountersBufferCountString(DecoderCounters decoderCounters) {
        if (decoderCounters == null) {
            return "";
        }
        decoderCounters.ensureUpdated();
        return " sib:" + decoderCounters.skippedInputBufferCount + " sb:" + decoderCounters.skippedOutputBufferCount + " rb:" + decoderCounters.renderedOutputBufferCount + " dib:" + decoderCounters.droppedInputBufferCount + " db:" + decoderCounters.droppedBufferCount + " mcdb:" + decoderCounters.maxConsecutiveDroppedBufferCount + " dk:" + decoderCounters.droppedToKeyframeCount;
    }

    private static String getPixelAspectRatioString(float f11) {
        if (f11 == -1.0f || f11 == 1.0f) {
            return "";
        }
        return " par:" + String.format(Locale.US, "%.02f", Float.valueOf(f11));
    }

    private static String getVideoFrameProcessingOffsetAverageString(long j11, int i11) {
        return i11 == 0 ? "N/A" : String.valueOf((long) (j11 / i11));
    }

    @UnstableApi
    public String getAudioString() {
        Format audioFormat = this.player.getAudioFormat();
        DecoderCounters audioDecoderCounters = this.player.getAudioDecoderCounters();
        if (audioFormat == null || audioDecoderCounters == null) {
            return "";
        }
        return "\n" + audioFormat.sampleMimeType + "(id:" + audioFormat.f4446id + " hz:" + audioFormat.sampleRate + " ch:" + audioFormat.channelCount + getDecoderCountersBufferCountString(audioDecoderCounters) + j.f81007d;
    }

    @UnstableApi
    public String getDebugString() {
        return getPlayerStateString() + getVideoString() + getAudioString();
    }

    @UnstableApi
    public String getPlayerStateString() {
        int playbackState = this.player.getPlaybackState();
        return String.format("playWhenReady:%s playbackState:%s item:%s", Boolean.valueOf(this.player.getPlayWhenReady()), playbackState != 1 ? playbackState != 2 ? playbackState != 3 ? playbackState != 4 ? "unknown" : "ended" : "ready" : "buffering" : IslandsKt.f23312q, Integer.valueOf(this.player.getCurrentMediaItemIndex()));
    }

    @UnstableApi
    public String getVideoString() {
        Format videoFormat = this.player.getVideoFormat();
        VideoSize videoSize = this.player.getVideoSize();
        DecoderCounters videoDecoderCounters = this.player.getVideoDecoderCounters();
        if (videoFormat == null || videoDecoderCounters == null) {
            return "";
        }
        return "\n" + videoFormat.sampleMimeType + "(id:" + videoFormat.f4446id + " r:" + videoSize.width + "x" + videoSize.height + getColorInfoString(videoFormat.colorInfo) + getPixelAspectRatioString(videoSize.pixelWidthHeightRatio) + getDecoderCountersBufferCountString(videoDecoderCounters) + " vfpo: " + getVideoFrameProcessingOffsetAverageString(videoDecoderCounters.totalVideoFrameProcessingOffsetUs, videoDecoderCounters.videoFrameProcessingOffsetCount) + j.f81007d;
    }

    public final void start() {
        if (this.started) {
            return;
        }
        this.started = true;
        this.player.addListener(this.updater);
        updateAndPost();
    }

    public final void stop() {
        if (this.started) {
            this.started = false;
            this.player.removeListener(this.updater);
            this.textView.removeCallbacks(this.updater);
        }
    }

    @SuppressLint({"SetTextI18n"})
    @UnstableApi
    public final void updateAndPost() {
        this.textView.setText(getDebugString());
        this.textView.removeCallbacks(this.updater);
        this.textView.postDelayed(this.updater, 1000L);
    }
}
