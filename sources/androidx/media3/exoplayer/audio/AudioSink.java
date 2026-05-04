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
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface AudioSink {
    public static final long CURRENT_POSITION_NOT_SET = Long.MIN_VALUE;
    public static final int OFFLOAD_MODE_DISABLED = 0;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_NOT_REQUIRED = 2;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_REQUIRED = 1;
    public static final int SINK_FORMAT_SUPPORTED_DIRECTLY = 2;
    public static final int SINK_FORMAT_SUPPORTED_WITH_TRANSCODING = 1;
    public static final int SINK_FORMAT_UNSUPPORTED = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class AudioTrackConfig {
        public final int bufferSize;
        public final int channelConfig;
        public final int encoding;
        public final boolean offload;
        public final int sampleRate;
        public final boolean tunneling;

        public AudioTrackConfig(int i11, int i12, int i13, boolean z11, boolean z12, int i14) {
            this.encoding = i11;
            this.sampleRate = i12;
            this.channelConfig = i13;
            this.tunneling = z11;
            this.offload = z12;
            this.bufferSize = i14;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface OffloadMode {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SinkFormatSupport {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class UnexpectedDiscontinuityException extends Exception {
        public final long actualPresentationTimeUs;
        public final long expectedPresentationTimeUs;

        public UnexpectedDiscontinuityException(long j11, long j12) {
            super("Unexpected audio track timestamp discontinuity: expected " + j12 + ", got " + j11);
            this.actualPresentationTimeUs = j11;
            this.expectedPresentationTimeUs = j12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class WriteException extends Exception {
        public final int errorCode;
        public final Format format;
        public final boolean isRecoverable;

        public WriteException(int i11, Format format, boolean z11) {
            super("AudioTrack write failed: " + i11);
            this.isRecoverable = z11;
            this.errorCode = i11;
            this.format = format;
        }
    }

    void configure(Format format, int i11, @Nullable int[] iArr) throws ConfigurationException;

    void disableTunneling();

    void enableTunnelingV21();

    void flush();

    @Nullable
    AudioAttributes getAudioAttributes();

    long getAudioTrackBufferSizeUs();

    long getCurrentPositionUs(boolean z11);

    default AudioOffloadSupport getFormatOffloadSupport(Format format) {
        return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
    }

    int getFormatSupport(Format format);

    PlaybackParameters getPlaybackParameters();

    boolean getSkipSilenceEnabled();

    boolean handleBuffer(ByteBuffer byteBuffer, long j11, int i11) throws InitializationException, WriteException;

    void handleDiscontinuity();

    boolean hasPendingData();

    boolean isEnded();

    void pause();

    void play();

    void playToEndOfStream() throws WriteException;

    void reset();

    void setAudioAttributes(AudioAttributes audioAttributes);

    void setAudioSessionId(int i11);

    void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

    void setListener(Listener listener);

    void setPlaybackParameters(PlaybackParameters playbackParameters);

    void setSkipSilenceEnabled(boolean z11);

    void setVolume(float f11);

    boolean supportsFormat(Format format);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ConfigurationException extends Exception {
        public final Format format;

        public ConfigurationException(Throwable th2, Format format) {
            super(th2);
            this.format = format;
        }

        public ConfigurationException(String str, Format format) {
            super(str);
            this.format = format;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class InitializationException extends Exception {
        public final int audioTrackState;
        public final Format format;
        public final boolean isRecoverable;

        public InitializationException(String str, int i11, Format format, boolean z11, @Nullable Throwable th2) {
            super(str, th2);
            this.audioTrackState = i11;
            this.isRecoverable = z11;
            this.format = format;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public InitializationException(int r8, int r9, int r10, int r11, androidx.media3.common.Format r12, boolean r13, @androidx.annotation.Nullable java.lang.Exception r14) {
            /*
                r7 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AudioTrack init failed "
                r0.append(r1)
                r0.append(r8)
                java.lang.String r1 = " "
                r0.append(r1)
                java.lang.String r2 = "Config("
                r0.append(r2)
                r0.append(r9)
                java.lang.String r9 = ", "
                r0.append(r9)
                r0.append(r10)
                r0.append(r9)
                r0.append(r11)
                java.lang.String r9 = ")"
                r0.append(r9)
                r0.append(r1)
                r0.append(r12)
                if (r13 == 0) goto L38
                java.lang.String r9 = " (recoverable)"
                goto L3a
            L38:
                java.lang.String r9 = ""
            L3a:
                r0.append(r9)
                java.lang.String r2 = r0.toString()
                r1 = r7
                r3 = r8
                r4 = r12
                r5 = r13
                r6 = r14
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.AudioSink.InitializationException.<init>(int, int, int, int, androidx.media3.common.Format, boolean, java.lang.Exception):void");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Listener {
        void onPositionDiscontinuity();

        void onSkipSilenceEnabledChanged(boolean z11);

        void onUnderrun(int i11, long j11, long j12);

        default void onAudioCapabilitiesChanged() {
        }

        default void onOffloadBufferEmptying() {
        }

        default void onOffloadBufferFull() {
        }

        default void onSilenceSkipped() {
        }

        default void onAudioSinkError(Exception exc) {
        }

        default void onAudioTrackInitialized(AudioTrackConfig audioTrackConfig) {
        }

        default void onAudioTrackReleased(AudioTrackConfig audioTrackConfig) {
        }

        default void onPositionAdvancing(long j11) {
        }
    }

    default void release() {
    }

    default void setClock(Clock clock) {
    }

    @RequiresApi(29)
    default void setOffloadMode(int i11) {
    }

    default void setOutputStreamOffsetUs(long j11) {
    }

    default void setPlayerId(@Nullable PlayerId playerId) {
    }

    @RequiresApi(23)
    default void setPreferredDevice(@Nullable AudioDeviceInfo audioDeviceInfo) {
    }

    @RequiresApi(29)
    default void setOffloadDelayPadding(int i11, int i12) {
    }
}
