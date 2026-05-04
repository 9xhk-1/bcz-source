package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioSink;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class ForwardingAudioSink implements AudioSink {
    private final AudioSink sink;

    public ForwardingAudioSink(AudioSink audioSink) {
        this.sink = audioSink;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void configure(Format format, int i11, @Nullable int[] iArr) throws AudioSink.ConfigurationException {
        this.sink.configure(format, i11, iArr);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void disableTunneling() {
        this.sink.disableTunneling();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void enableTunnelingV21() {
        this.sink.enableTunnelingV21();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void flush() {
        this.sink.flush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    @Nullable
    public AudioAttributes getAudioAttributes() {
        return this.sink.getAudioAttributes();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public long getAudioTrackBufferSizeUs() {
        return this.sink.getAudioTrackBufferSizeUs();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public long getCurrentPositionUs(boolean z11) {
        return this.sink.getCurrentPositionUs(z11);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public AudioOffloadSupport getFormatOffloadSupport(Format format) {
        return this.sink.getFormatOffloadSupport(format);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public int getFormatSupport(Format format) {
        return this.sink.getFormatSupport(format);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public PlaybackParameters getPlaybackParameters() {
        return this.sink.getPlaybackParameters();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean getSkipSilenceEnabled() {
        return this.sink.getSkipSilenceEnabled();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean handleBuffer(ByteBuffer byteBuffer, long j11, int i11) throws AudioSink.InitializationException, AudioSink.WriteException {
        return this.sink.handleBuffer(byteBuffer, j11, i11);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void handleDiscontinuity() {
        this.sink.handleDiscontinuity();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean hasPendingData() {
        return this.sink.hasPendingData();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean isEnded() {
        return this.sink.isEnded();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void pause() {
        this.sink.pause();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void play() {
        this.sink.play();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void playToEndOfStream() throws AudioSink.WriteException {
        this.sink.playToEndOfStream();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void release() {
        this.sink.release();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void reset() {
        this.sink.reset();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAudioAttributes(AudioAttributes audioAttributes) {
        this.sink.setAudioAttributes(audioAttributes);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAudioSessionId(int i11) {
        this.sink.setAudioSessionId(i11);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setAuxEffectInfo(AuxEffectInfo auxEffectInfo) {
        this.sink.setAuxEffectInfo(auxEffectInfo);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setClock(Clock clock) {
        this.sink.setClock(clock);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setListener(AudioSink.Listener listener) {
        this.sink.setListener(listener);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    @RequiresApi(29)
    public void setOffloadDelayPadding(int i11, int i12) {
        this.sink.setOffloadDelayPadding(i11, i12);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    @RequiresApi(29)
    public void setOffloadMode(int i11) {
        this.sink.setOffloadMode(i11);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setOutputStreamOffsetUs(long j11) {
        this.sink.setOutputStreamOffsetUs(j11);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        this.sink.setPlaybackParameters(playbackParameters);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPlayerId(@Nullable PlayerId playerId) {
        this.sink.setPlayerId(playerId);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    @RequiresApi(23)
    public void setPreferredDevice(@Nullable AudioDeviceInfo audioDeviceInfo) {
        this.sink.setPreferredDevice(audioDeviceInfo);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setSkipSilenceEnabled(boolean z11) {
        this.sink.setSkipSilenceEnabled(z11);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setVolume(float f11) {
        this.sink.setVolume(f11);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean supportsFormat(Format format) {
        return this.sink.supportsFormat(format);
    }
}
