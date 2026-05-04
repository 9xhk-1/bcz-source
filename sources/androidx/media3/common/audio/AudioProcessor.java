package androidx.media3.common.audio;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface AudioProcessor {
    public static final ByteBuffer EMPTY_BUFFER = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class AudioFormat {
        public static final AudioFormat NOT_SET = new AudioFormat(-1, -1, -1);
        public final int bytesPerFrame;
        public final int channelCount;
        public final int encoding;
        public final int sampleRate;

        public AudioFormat(Format format) {
            this(format.sampleRate, format.channelCount, format.pcmEncoding);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioFormat)) {
                return false;
            }
            AudioFormat audioFormat = (AudioFormat) obj;
            return this.sampleRate == audioFormat.sampleRate && this.channelCount == audioFormat.channelCount && this.encoding == audioFormat.encoding;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.sampleRate), Integer.valueOf(this.channelCount), Integer.valueOf(this.encoding));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.sampleRate + ", channelCount=" + this.channelCount + ", encoding=" + this.encoding + l50.b.f69930l;
        }

        public AudioFormat(int i11, int i12, int i13) {
            this.sampleRate = i11;
            this.channelCount = i12;
            this.encoding = i13;
            this.bytesPerFrame = Util.isEncodingLinearPcm(i13) ? Util.getPcmFrameSize(i13, i12) : -1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class UnhandledAudioFormatException extends Exception {
        public final AudioFormat inputAudioFormat;

        public UnhandledAudioFormatException(AudioFormat audioFormat) {
            this("Unhandled input format:", audioFormat);
        }

        public UnhandledAudioFormatException(String str, AudioFormat audioFormat) {
            super(str + " " + audioFormat);
            this.inputAudioFormat = audioFormat;
        }
    }

    AudioFormat configure(AudioFormat audioFormat) throws UnhandledAudioFormatException;

    void flush();

    ByteBuffer getOutput();

    boolean isActive();

    boolean isEnded();

    void queueEndOfStream();

    void queueInput(ByteBuffer byteBuffer);

    void reset();

    default long getDurationAfterProcessorApplied(long j11) {
        return j11;
    }
}
