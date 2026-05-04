package androidx.media3.common.audio;

import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class SonicAudioProcessor implements AudioProcessor {
    private static final float CLOSE_THRESHOLD = 1.0E-4f;
    private static final int MIN_BYTES_FOR_DURATION_SCALING_CALCULATION = 1024;
    public static final int SAMPLE_RATE_NO_CHANGE = -1;
    private ByteBuffer buffer;
    private AudioProcessor.AudioFormat inputAudioFormat;
    private long inputBytes;
    private boolean inputEnded;
    private AudioProcessor.AudioFormat outputAudioFormat;
    private ByteBuffer outputBuffer;
    private long outputBytes;
    private AudioProcessor.AudioFormat pendingInputAudioFormat;
    private AudioProcessor.AudioFormat pendingOutputAudioFormat;
    private int pendingOutputSampleRate;
    private boolean pendingSonicRecreation;
    private float pitch;
    private ShortBuffer shortBuffer;
    private final boolean shouldBeActiveWithDefaultParameters;

    @Nullable
    private Sonic sonic;
    private float speed;

    public SonicAudioProcessor() {
        this(false);
    }

    private boolean areParametersSetToDefaultValues() {
        return Math.abs(this.speed - 1.0f) < 1.0E-4f && Math.abs(this.pitch - 1.0f) < 1.0E-4f && this.pendingOutputAudioFormat.sampleRate == this.pendingInputAudioFormat.sampleRate;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public AudioProcessor.AudioFormat configure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.encoding != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        int i11 = this.pendingOutputSampleRate;
        if (i11 == -1) {
            i11 = audioFormat.sampleRate;
        }
        this.pendingInputAudioFormat = audioFormat;
        AudioProcessor.AudioFormat audioFormat2 = new AudioProcessor.AudioFormat(i11, audioFormat.channelCount, 2);
        this.pendingOutputAudioFormat = audioFormat2;
        this.pendingSonicRecreation = true;
        return audioFormat2;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void flush() {
        if (isActive()) {
            AudioProcessor.AudioFormat audioFormat = this.pendingInputAudioFormat;
            this.inputAudioFormat = audioFormat;
            AudioProcessor.AudioFormat audioFormat2 = this.pendingOutputAudioFormat;
            this.outputAudioFormat = audioFormat2;
            if (this.pendingSonicRecreation) {
                this.sonic = new Sonic(audioFormat.sampleRate, audioFormat.channelCount, this.speed, this.pitch, audioFormat2.sampleRate);
            } else {
                Sonic sonic = this.sonic;
                if (sonic != null) {
                    sonic.flush();
                }
            }
        }
        this.outputBuffer = AudioProcessor.EMPTY_BUFFER;
        this.inputBytes = 0L;
        this.outputBytes = 0L;
        this.inputEnded = false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public long getDurationAfterProcessorApplied(long j11) {
        return getPlayoutDuration(j11);
    }

    public long getMediaDuration(long j11) {
        if (this.outputBytes < 1024) {
            return (long) (this.speed * j11);
        }
        long pendingInputBytes = this.inputBytes - ((Sonic) Assertions.checkNotNull(this.sonic)).getPendingInputBytes();
        int i11 = this.outputAudioFormat.sampleRate;
        int i12 = this.inputAudioFormat.sampleRate;
        return i11 == i12 ? Util.scaleLargeTimestamp(j11, pendingInputBytes, this.outputBytes) : Util.scaleLargeTimestamp(j11, pendingInputBytes * i11, this.outputBytes * i12);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public ByteBuffer getOutput() {
        int outputSize;
        Sonic sonic = this.sonic;
        if (sonic != null && (outputSize = sonic.getOutputSize()) > 0) {
            if (this.buffer.capacity() < outputSize) {
                ByteBuffer order = ByteBuffer.allocateDirect(outputSize).order(ByteOrder.nativeOrder());
                this.buffer = order;
                this.shortBuffer = order.asShortBuffer();
            } else {
                this.buffer.clear();
                this.shortBuffer.clear();
            }
            sonic.getOutput(this.shortBuffer);
            this.outputBytes += outputSize;
            this.buffer.limit(outputSize);
            this.outputBuffer = this.buffer;
        }
        ByteBuffer byteBuffer = this.outputBuffer;
        this.outputBuffer = AudioProcessor.EMPTY_BUFFER;
        return byteBuffer;
    }

    public long getPlayoutDuration(long j11) {
        if (this.outputBytes < 1024) {
            return (long) (j11 / this.speed);
        }
        long pendingInputBytes = this.inputBytes - ((Sonic) Assertions.checkNotNull(this.sonic)).getPendingInputBytes();
        int i11 = this.outputAudioFormat.sampleRate;
        int i12 = this.inputAudioFormat.sampleRate;
        return i11 == i12 ? Util.scaleLargeTimestamp(j11, this.outputBytes, pendingInputBytes) : Util.scaleLargeTimestamp(j11, this.outputBytes * i12, pendingInputBytes * i11);
    }

    public long getProcessedInputBytes() {
        return this.inputBytes - ((Sonic) Assertions.checkNotNull(this.sonic)).getPendingInputBytes();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        if (this.pendingOutputAudioFormat.sampleRate != -1) {
            return this.shouldBeActiveWithDefaultParameters || !areParametersSetToDefaultValues();
        }
        return false;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isEnded() {
        if (!this.inputEnded) {
            return false;
        }
        Sonic sonic = this.sonic;
        return sonic == null || sonic.getOutputSize() == 0;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueEndOfStream() {
        Sonic sonic = this.sonic;
        if (sonic != null) {
            sonic.queueEndOfStream();
        }
        this.inputEnded = true;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            Sonic sonic = (Sonic) Assertions.checkNotNull(this.sonic);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.inputBytes += remaining;
            sonic.queueInput(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void reset() {
        this.speed = 1.0f;
        this.pitch = 1.0f;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.pendingInputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        this.inputAudioFormat = audioFormat;
        this.outputAudioFormat = audioFormat;
        ByteBuffer byteBuffer = AudioProcessor.EMPTY_BUFFER;
        this.buffer = byteBuffer;
        this.shortBuffer = byteBuffer.asShortBuffer();
        this.outputBuffer = byteBuffer;
        this.pendingOutputSampleRate = -1;
        this.pendingSonicRecreation = false;
        this.sonic = null;
        this.inputBytes = 0L;
        this.outputBytes = 0L;
        this.inputEnded = false;
    }

    public void setOutputSampleRateHz(int i11) {
        Assertions.checkArgument(i11 == -1 || i11 > 0);
        this.pendingOutputSampleRate = i11;
    }

    public void setPitch(@FloatRange(from = 0.0d, fromInclusive = false) float f11) {
        Assertions.checkArgument(f11 > 0.0f);
        if (this.pitch != f11) {
            this.pitch = f11;
            this.pendingSonicRecreation = true;
        }
    }

    public void setSpeed(@FloatRange(from = 0.0d, fromInclusive = false) float f11) {
        Assertions.checkArgument(f11 > 0.0f);
        if (this.speed != f11) {
            this.speed = f11;
            this.pendingSonicRecreation = true;
        }
    }

    public SonicAudioProcessor(boolean z11) {
        this.speed = 1.0f;
        this.pitch = 1.0f;
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.pendingInputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        this.inputAudioFormat = audioFormat;
        this.outputAudioFormat = audioFormat;
        ByteBuffer byteBuffer = AudioProcessor.EMPTY_BUFFER;
        this.buffer = byteBuffer;
        this.shortBuffer = byteBuffer.asShortBuffer();
        this.outputBuffer = byteBuffer;
        this.pendingOutputSampleRate = -1;
        this.shouldBeActiveWithDefaultParameters = z11;
    }
}
