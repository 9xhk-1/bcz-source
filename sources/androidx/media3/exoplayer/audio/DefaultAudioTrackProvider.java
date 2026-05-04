package androidx.media3.exoplayer.audio;

import android.media.AudioAttributes;
import android.media.AudioTrack;
import androidx.annotation.RequiresApi;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class DefaultAudioTrackProvider implements DefaultAudioSink.AudioTrackProvider {
    private AudioTrack createAudioTrackV21(AudioSink.AudioTrackConfig audioTrackConfig, AudioAttributes audioAttributes, int i11) {
        return new AudioTrack(getAudioTrackAttributesV21(audioAttributes, audioTrackConfig.tunneling), Util.getAudioFormat(audioTrackConfig.sampleRate, audioTrackConfig.channelConfig, audioTrackConfig.encoding), audioTrackConfig.bufferSize, 1, i11);
    }

    @RequiresApi(23)
    private AudioTrack createAudioTrackV23(AudioSink.AudioTrackConfig audioTrackConfig, AudioAttributes audioAttributes, int i11) {
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(getAudioTrackAttributesV21(audioAttributes, audioTrackConfig.tunneling)).setAudioFormat(Util.getAudioFormat(audioTrackConfig.sampleRate, audioTrackConfig.channelConfig, audioTrackConfig.encoding)).setTransferMode(1).setBufferSizeInBytes(audioTrackConfig.bufferSize).setSessionId(i11);
        if (Util.SDK_INT >= 29) {
            setOffloadedPlaybackV29(sessionId, audioTrackConfig.offload);
        }
        return customizeAudioTrackBuilder(sessionId).build();
    }

    private android.media.AudioAttributes getAudioTrackAttributesV21(AudioAttributes audioAttributes, boolean z11) {
        return z11 ? getAudioTrackTunnelingAttributesV21() : audioAttributes.getAudioAttributesV21().audioAttributes;
    }

    private android.media.AudioAttributes getAudioTrackTunnelingAttributesV21() {
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    @RequiresApi(29)
    private void setOffloadedPlaybackV29(AudioTrack.Builder builder, boolean z11) {
        builder.setOffloadedPlayback(z11);
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.AudioTrackProvider
    public final AudioTrack getAudioTrack(AudioSink.AudioTrackConfig audioTrackConfig, androidx.media3.common.AudioAttributes audioAttributes, int i11) {
        return Util.SDK_INT >= 23 ? createAudioTrackV23(audioTrackConfig, audioAttributes, i11) : createAudioTrackV21(audioTrackConfig, audioAttributes, i11);
    }

    @RequiresApi(23)
    @uo.a
    public AudioTrack.Builder customizeAudioTrackBuilder(AudioTrack.Builder builder) {
        return builder;
    }
}
