package androidx.media3.common.audio;

import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface AudioProcessorChain {
    PlaybackParameters applyPlaybackParameters(PlaybackParameters playbackParameters);

    boolean applySkipSilenceEnabled(boolean z11);

    AudioProcessor[] getAudioProcessors();

    long getMediaDuration(long j11);

    long getSkippedOutputFrameCount();
}
