package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class SilenceSkippingAudioProcessor extends androidx.media3.common.audio.BaseAudioProcessor {
    private static final int AVOID_TRUNCATION_FACTOR = 1000;
    public static final long DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US = 2000000;
    public static final long DEFAULT_MINIMUM_SILENCE_DURATION_US = 100000;
    public static final int DEFAULT_MIN_VOLUME_TO_KEEP_PERCENTAGE = 10;

    @Deprecated
    public static final long DEFAULT_PADDING_SILENCE_US = 20000;
    public static final float DEFAULT_SILENCE_RETENTION_RATIO = 0.2f;
    public static final short DEFAULT_SILENCE_THRESHOLD_LEVEL = 1024;
    private static final int DO_NOT_CHANGE_VOLUME = 3;
    private static final int FADE_IN = 2;
    private static final int FADE_OUT = 0;
    private static final int MUTE = 1;
    private static final int STATE_NOISY = 0;
    private static final int STATE_SHORTENING_SILENCE = 1;
    private int bytesPerFrame;
    private byte[] contiguousOutputBuffer;
    private boolean enabled;
    private final long maxSilenceToKeepDurationUs;
    private byte[] maybeSilenceBuffer;
    private int maybeSilenceBufferContentsSize;
    private int maybeSilenceBufferStartIndex;
    private final int minVolumeToKeepPercentageWhenMuting;
    private final long minimumSilenceDurationUs;
    private int outputSilenceFramesSinceNoise;
    private final float silenceRetentionRatio;
    private final short silenceThresholdLevel;
    private long skippedFrames;
    private int state;

    public SilenceSkippingAudioProcessor() {
        this(DEFAULT_MINIMUM_SILENCE_DURATION_US, 0.2f, DEFAULT_MAX_SILENCE_TO_KEEP_DURATION_US, 10, (short) 1024);
    }

    private int alignToBytePerFrameBoundary(int i11) {
        int i12 = this.bytesPerFrame;
        return (i11 / i12) * i12;
    }

    private int calculateFadeInPercentage(int i11, int i12) {
        int i13 = this.minVolumeToKeepPercentageWhenMuting;
        return i13 + ((((100 - i13) * (i11 * 1000)) / i12) / 1000);
    }

    private int calculateFadeOutPercentage(int i11, int i12) {
        return (((this.minVolumeToKeepPercentageWhenMuting - 100) * ((i11 * 1000) / i12)) / 1000) + 100;
    }

    private int calculateShortenedSilenceLength(int i11) {
        int durationUsToFrames = ((durationUsToFrames(this.maxSilenceToKeepDurationUs) - this.outputSilenceFramesSinceNoise) * this.bytesPerFrame) - (this.maybeSilenceBuffer.length / 2);
        Assertions.checkState(durationUsToFrames >= 0);
        return alignToBytePerFrameBoundary(Math.min((i11 * this.silenceRetentionRatio) + 0.5f, durationUsToFrames));
    }

    private int durationUsToFrames(long j11) {
        return (int) ((j11 * this.inputAudioFormat.sampleRate) / 1000000);
    }

    private int findNoiseLimit(ByteBuffer byteBuffer) {
        for (int limit = byteBuffer.limit() - 1; limit >= byteBuffer.position(); limit -= 2) {
            if (isNoise(byteBuffer.get(limit), byteBuffer.get(limit - 1))) {
                int i11 = this.bytesPerFrame;
                return ((limit / i11) * i11) + i11;
            }
        }
        return byteBuffer.position();
    }

    private int findNoisePosition(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position() + 1; position < byteBuffer.limit(); position += 2) {
            if (isNoise(byteBuffer.get(position), byteBuffer.get(position - 1))) {
                int i11 = this.bytesPerFrame;
                return i11 * (position / i11);
            }
        }
        return byteBuffer.limit();
    }

    private boolean isNoise(byte b11, byte b12) {
        return Math.abs(twoByteSampleToInt(b11, b12)) > this.silenceThresholdLevel;
    }

    private void modifyVolume(byte[] bArr, int i11, int i12) {
        if (i12 == 3) {
            return;
        }
        for (int i13 = 0; i13 < i11; i13 += 2) {
            sampleIntToTwoBigEndianBytes(bArr, i13, (twoByteSampleToInt(bArr[i13 + 1], bArr[i13]) * (i12 == 0 ? calculateFadeOutPercentage(i13, i11 - 1) : i12 == 2 ? calculateFadeInPercentage(i13, i11 - 1) : this.minVolumeToKeepPercentageWhenMuting)) / 100);
        }
    }

    private void output(ByteBuffer byteBuffer) {
        replaceOutputBuffer(byteBuffer.remaining()).put(byteBuffer).flip();
    }

    private void outputRange(byte[] bArr, int i11, int i12) {
        Assertions.checkArgument(i11 % this.bytesPerFrame == 0, "byteOutput size is not aligned to frame size " + i11);
        modifyVolume(bArr, i11, i12);
        replaceOutputBuffer(i11).put(bArr, 0, i11).flip();
    }

    private void outputShortenedSilenceBuffer(boolean z11) {
        int length;
        int calculateShortenedSilenceLength;
        int i11 = this.maybeSilenceBufferContentsSize;
        byte[] bArr = this.maybeSilenceBuffer;
        if (i11 == bArr.length || z11) {
            if (this.outputSilenceFramesSinceNoise == 0) {
                if (z11) {
                    outputSilence(i11, 3);
                    length = i11;
                } else {
                    Assertions.checkState(i11 >= bArr.length / 2);
                    length = this.maybeSilenceBuffer.length / 2;
                    outputSilence(length, 0);
                }
                calculateShortenedSilenceLength = length;
            } else if (z11) {
                int length2 = i11 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int calculateShortenedSilenceLength2 = calculateShortenedSilenceLength(length2) + (this.maybeSilenceBuffer.length / 2);
                outputSilence(calculateShortenedSilenceLength2, 2);
                calculateShortenedSilenceLength = calculateShortenedSilenceLength2;
                length = length3;
            } else {
                length = i11 - (bArr.length / 2);
                calculateShortenedSilenceLength = calculateShortenedSilenceLength(length);
                outputSilence(calculateShortenedSilenceLength, 1);
            }
            Assertions.checkState(length % this.bytesPerFrame == 0, "bytesConsumed is not aligned to frame size: %s" + length);
            Assertions.checkState(i11 >= calculateShortenedSilenceLength);
            this.maybeSilenceBufferContentsSize -= length;
            int i12 = this.maybeSilenceBufferStartIndex + length;
            this.maybeSilenceBufferStartIndex = i12;
            this.maybeSilenceBufferStartIndex = i12 % this.maybeSilenceBuffer.length;
            this.outputSilenceFramesSinceNoise = this.outputSilenceFramesSinceNoise + (calculateShortenedSilenceLength / this.bytesPerFrame);
            this.skippedFrames += (length - calculateShortenedSilenceLength) / r2;
        }
    }

    private void outputSilence(int i11, int i12) {
        if (i11 == 0) {
            return;
        }
        Assertions.checkArgument(this.maybeSilenceBufferContentsSize >= i11);
        if (i12 == 2) {
            int i13 = this.maybeSilenceBufferStartIndex;
            int i14 = this.maybeSilenceBufferContentsSize;
            int i15 = i13 + i14;
            byte[] bArr = this.maybeSilenceBuffer;
            if (i15 <= bArr.length) {
                System.arraycopy(bArr, (i13 + i14) - i11, this.contiguousOutputBuffer, 0, i11);
            } else {
                int length = i14 - (bArr.length - i13);
                if (length >= i11) {
                    System.arraycopy(bArr, length - i11, this.contiguousOutputBuffer, 0, i11);
                } else {
                    int i16 = i11 - length;
                    System.arraycopy(bArr, bArr.length - i16, this.contiguousOutputBuffer, 0, i16);
                    System.arraycopy(this.maybeSilenceBuffer, 0, this.contiguousOutputBuffer, i16, length);
                }
            }
        } else {
            int i17 = this.maybeSilenceBufferStartIndex;
            int i18 = i17 + i11;
            byte[] bArr2 = this.maybeSilenceBuffer;
            if (i18 <= bArr2.length) {
                System.arraycopy(bArr2, i17, this.contiguousOutputBuffer, 0, i11);
            } else {
                int length2 = bArr2.length - i17;
                System.arraycopy(bArr2, i17, this.contiguousOutputBuffer, 0, length2);
                System.arraycopy(this.maybeSilenceBuffer, 0, this.contiguousOutputBuffer, length2, i11 - length2);
            }
        }
        Assertions.checkArgument(i11 % this.bytesPerFrame == 0, "sizeToOutput is not aligned to frame size: " + i11);
        Assertions.checkState(this.maybeSilenceBufferStartIndex < this.maybeSilenceBuffer.length);
        outputRange(this.contiguousOutputBuffer, i11, i12);
    }

    private void processNoisy(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.maybeSilenceBuffer.length));
        int findNoiseLimit = findNoiseLimit(byteBuffer);
        if (findNoiseLimit == byteBuffer.position()) {
            this.state = 1;
        } else {
            byteBuffer.limit(Math.min(findNoiseLimit, byteBuffer.capacity()));
            output(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    private static void sampleIntToTwoBigEndianBytes(byte[] bArr, int i11, int i12) {
        if (i12 >= 32767) {
            bArr[i11] = -1;
            bArr[i11 + 1] = Byte.MAX_VALUE;
        } else if (i12 <= -32768) {
            bArr[i11] = 0;
            bArr[i11 + 1] = Byte.MIN_VALUE;
        } else {
            bArr[i11] = (byte) (i12 & 255);
            bArr[i11 + 1] = (byte) (i12 >> 8);
        }
    }

    private void shortenSilenceSilenceUntilNoise(ByteBuffer byteBuffer) {
        int i11;
        int i12;
        Assertions.checkState(this.maybeSilenceBufferStartIndex < this.maybeSilenceBuffer.length);
        int limit = byteBuffer.limit();
        int findNoisePosition = findNoisePosition(byteBuffer);
        int position = findNoisePosition - byteBuffer.position();
        int i13 = this.maybeSilenceBufferStartIndex;
        int i14 = this.maybeSilenceBufferContentsSize;
        int i15 = i13 + i14;
        byte[] bArr = this.maybeSilenceBuffer;
        if (i15 < bArr.length) {
            i11 = bArr.length - (i14 + i13);
            i12 = i13 + i14;
        } else {
            int length = i14 - (bArr.length - i13);
            i11 = i13 - length;
            i12 = length;
        }
        boolean z11 = findNoisePosition < limit;
        int min = Math.min(position, i11);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.maybeSilenceBuffer, i12, min);
        int i16 = this.maybeSilenceBufferContentsSize + min;
        this.maybeSilenceBufferContentsSize = i16;
        Assertions.checkState(i16 <= this.maybeSilenceBuffer.length);
        boolean z12 = z11 && position < i11;
        outputShortenedSilenceBuffer(z12);
        if (z12) {
            this.state = 0;
            this.outputSilenceFramesSinceNoise = 0;
        }
        byteBuffer.limit(limit);
    }

    private static int twoByteSampleToInt(byte b11, byte b12) {
        return (b11 << 8) | (b12 & 255);
    }

    public long getSkippedFrames() {
        return this.skippedFrames;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor, androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        return super.isActive() && this.enabled;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        if (audioFormat.encoding == 2) {
            return audioFormat.sampleRate == -1 ? AudioProcessor.AudioFormat.NOT_SET : audioFormat;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onFlush() {
        if (isActive()) {
            this.bytesPerFrame = this.inputAudioFormat.channelCount * 2;
            int alignToBytePerFrameBoundary = alignToBytePerFrameBoundary(durationUsToFrames(this.minimumSilenceDurationUs) / 2) * 2;
            if (this.maybeSilenceBuffer.length != alignToBytePerFrameBoundary) {
                this.maybeSilenceBuffer = new byte[alignToBytePerFrameBoundary];
                this.contiguousOutputBuffer = new byte[alignToBytePerFrameBoundary];
            }
        }
        this.state = 0;
        this.skippedFrames = 0L;
        this.outputSilenceFramesSinceNoise = 0;
        this.maybeSilenceBufferStartIndex = 0;
        this.maybeSilenceBufferContentsSize = 0;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onQueueEndOfStream() {
        if (this.maybeSilenceBufferContentsSize > 0) {
            outputShortenedSilenceBuffer(true);
            this.outputSilenceFramesSinceNoise = 0;
        }
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public void onReset() {
        this.enabled = false;
        byte[] bArr = Util.EMPTY_BYTE_ARRAY;
        this.maybeSilenceBuffer = bArr;
        this.contiguousOutputBuffer = bArr;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !hasPendingOutput()) {
            int i11 = this.state;
            if (i11 == 0) {
                processNoisy(byteBuffer);
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException();
                }
                shortenSilenceSilenceUntilNoise(byteBuffer);
            }
        }
    }

    public void setEnabled(boolean z11) {
        this.enabled = z11;
    }

    @Deprecated
    public SilenceSkippingAudioProcessor(long j11, long j12, short s11) {
        this(j11, j12 / j11, j11, 0, s11);
    }

    private int alignToBytePerFrameBoundary(float f11) {
        return alignToBytePerFrameBoundary((int) f11);
    }

    public SilenceSkippingAudioProcessor(long j11, float f11, long j12, int i11, short s11) {
        boolean z11 = false;
        this.outputSilenceFramesSinceNoise = 0;
        this.maybeSilenceBufferStartIndex = 0;
        this.maybeSilenceBufferContentsSize = 0;
        if (f11 >= 0.0f && f11 <= 1.0f) {
            z11 = true;
        }
        Assertions.checkArgument(z11);
        this.minimumSilenceDurationUs = j11;
        this.silenceRetentionRatio = f11;
        this.maxSilenceToKeepDurationUs = j12;
        this.minVolumeToKeepPercentageWhenMuting = i11;
        this.silenceThresholdLevel = s11;
        byte[] bArr = Util.EMPTY_BYTE_ARRAY;
        this.maybeSilenceBuffer = bArr;
        this.contiguousOutputBuffer = bArr;
    }
}
