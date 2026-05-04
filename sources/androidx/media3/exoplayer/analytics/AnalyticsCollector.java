package androidx.media3.exoplayer.analytics;

import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.Player;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface AnalyticsCollector extends Player.Listener, MediaSourceEventListener, BandwidthMeter.EventListener, DrmSessionEventListener {
    void addListener(AnalyticsListener analyticsListener);

    void notifySeekStarted();

    void onAudioCodecError(Exception exc);

    void onAudioDecoderInitialized(String str, long j11, long j12);

    void onAudioDecoderReleased(String str);

    void onAudioDisabled(DecoderCounters decoderCounters);

    void onAudioEnabled(DecoderCounters decoderCounters);

    void onAudioInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation);

    void onAudioPositionAdvancing(long j11);

    void onAudioSinkError(Exception exc);

    void onAudioTrackInitialized(AudioSink.AudioTrackConfig audioTrackConfig);

    void onAudioTrackReleased(AudioSink.AudioTrackConfig audioTrackConfig);

    void onAudioUnderrun(int i11, long j11, long j12);

    void onDroppedFrames(int i11, long j11);

    void onRenderedFirstFrame(Object obj, long j11);

    void onRendererReadyChanged(int i11, int i12, boolean z11);

    void onVideoCodecError(Exception exc);

    void onVideoDecoderInitialized(String str, long j11, long j12);

    void onVideoDecoderReleased(String str);

    void onVideoDisabled(DecoderCounters decoderCounters);

    void onVideoEnabled(DecoderCounters decoderCounters);

    void onVideoFrameProcessingOffset(long j11, int i11);

    void onVideoInputFormatChanged(Format format, @Nullable DecoderReuseEvaluation decoderReuseEvaluation);

    void release();

    void removeListener(AnalyticsListener analyticsListener);

    void setPlayer(Player player, Looper looper);

    void updateMediaPeriodQueueInfo(List<MediaSource.MediaPeriodId> list, @Nullable MediaSource.MediaPeriodId mediaPeriodId);
}
