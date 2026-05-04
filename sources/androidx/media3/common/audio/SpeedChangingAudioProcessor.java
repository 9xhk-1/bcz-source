package androidx.media3.common.audio;

import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.SpeedProviderUtil;
import androidx.media3.common.util.TimestampConsumer;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class SpeedChangingAudioProcessor implements AudioProcessor {
    private float currentSpeed;
    private boolean endOfStreamQueuedToSonic;
    private long framesRead;

    @GuardedBy(vb.a.f93813p)
    private AudioProcessor.AudioFormat inputAudioFormat;
    private boolean inputEnded;
    private final Object lock;

    @GuardedBy(vb.a.f93813p)
    private final LongArrayQueue pendingCallbackInputTimesUs;

    @GuardedBy(vb.a.f93813p)
    private final Queue<TimestampConsumer> pendingCallbacks;
    private AudioProcessor.AudioFormat pendingInputAudioFormat;
    private AudioProcessor.AudioFormat pendingOutputAudioFormat;
    private final SynchronizedSonicAudioProcessor sonicAudioProcessor;
    private final SpeedProvider speedProvider;

    public SpeedChangingAudioProcessor(SpeedProvider speedProvider) {
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.pendingInputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        this.inputAudioFormat = audioFormat;
        this.speedProvider = speedProvider;
        Object obj = new Object();
        this.lock = obj;
        this.sonicAudioProcessor = new SynchronizedSonicAudioProcessor(obj, true);
        this.pendingCallbackInputTimesUs = new LongArrayQueue();
        this.pendingCallbacks = new ArrayDeque();
        resetInternalState(true);
    }

    private static long getDurationUsAfterProcessorApplied(SpeedProvider speedProvider, int i11, long j11) {
        return Util.sampleCountToDurationUs(getSampleCountAfterProcessorApplied(speedProvider, i11, Util.scaleLargeValue(j11, i11, 1000000L, RoundingMode.HALF_EVEN)), i11);
    }

    @VisibleForTesting
    public static long getInputFrameCountForOutput(SpeedProvider speedProvider, @IntRange(from = 1) int i11, @IntRange(from = 0) long j11) {
        int i12 = i11;
        Assertions.checkArgument(i12 > 0);
        Assertions.checkArgument(j11 >= 0);
        long j12 = j11;
        long j13 = 0;
        while (j12 > 0) {
            long nextSpeedChangeSamplePosition = SpeedProviderUtil.getNextSpeedChangeSamplePosition(speedProvider, j13, i11);
            float sampleAlignedSpeed = SpeedProviderUtil.getSampleAlignedSpeed(speedProvider, j13, i11);
            long expectedFrameCountAfterProcessorApplied = Sonic.getExpectedFrameCountAfterProcessorApplied(i12, i11, sampleAlignedSpeed, sampleAlignedSpeed, nextSpeedChangeSamplePosition - j13);
            if (nextSpeedChangeSamplePosition == -1 || expectedFrameCountAfterProcessorApplied > j12) {
                j13 += Sonic.getExpectedInputFrameCountForOutputFrameCount(i11, i11, sampleAlignedSpeed, sampleAlignedSpeed, j12);
                j12 = 0;
            } else {
                j12 -= expectedFrameCountAfterProcessorApplied;
                j13 = nextSpeedChangeSamplePosition;
            }
            i12 = i11;
        }
        return j13;
    }

    public static long getSampleCountAfterProcessorApplied(SpeedProvider speedProvider, @IntRange(from = 1) int i11, @IntRange(from = 0) long j11) {
        Assertions.checkArgument(speedProvider != null);
        Assertions.checkArgument(i11 > 0);
        long j12 = 0;
        Assertions.checkArgument(j11 >= 0);
        long j13 = 0;
        while (j12 < j11) {
            long nextSpeedChangeSamplePosition = SpeedProviderUtil.getNextSpeedChangeSamplePosition(speedProvider, j12, i11);
            if (nextSpeedChangeSamplePosition == -1 || nextSpeedChangeSamplePosition > j11) {
                nextSpeedChangeSamplePosition = j11;
            }
            float sampleAlignedSpeed = SpeedProviderUtil.getSampleAlignedSpeed(speedProvider, j12, i11);
            j13 += Sonic.getExpectedFrameCountAfterProcessorApplied(i11, i11, sampleAlignedSpeed, sampleAlignedSpeed, nextSpeedChangeSamplePosition - j12);
            j12 = nextSpeedChangeSamplePosition;
        }
        return j13;
    }

    private void processPendingCallbacks() {
        synchronized (this.lock) {
            try {
                if (this.inputAudioFormat.sampleRate == -1) {
                    return;
                }
                while (!this.pendingCallbacks.isEmpty()) {
                    this.pendingCallbacks.remove().onTimestamp(getDurationUsAfterProcessorApplied(this.speedProvider, this.inputAudioFormat.sampleRate, this.pendingCallbackInputTimesUs.remove()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void resetInternalState(boolean z11) {
        if (z11) {
            this.currentSpeed = 1.0f;
        }
        this.framesRead = 0L;
        this.endOfStreamQueuedToSonic = false;
    }

    private void updateSpeed(float f11) {
        if (f11 != this.currentSpeed) {
            this.currentSpeed = f11;
            this.sonicAudioProcessor.setSpeed(f11);
            this.sonicAudioProcessor.setPitch(f11);
            this.sonicAudioProcessor.flush();
            this.endOfStreamQueuedToSonic = false;
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public AudioProcessor.AudioFormat configure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        this.pendingInputAudioFormat = audioFormat;
        AudioProcessor.AudioFormat configure = this.sonicAudioProcessor.configure(audioFormat);
        this.pendingOutputAudioFormat = configure;
        return configure;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void flush() {
        this.inputEnded = false;
        resetInternalState(false);
        synchronized (this.lock) {
            this.inputAudioFormat = this.pendingInputAudioFormat;
            this.sonicAudioProcessor.flush();
            processPendingCallbacks();
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public long getDurationAfterProcessorApplied(long j11) {
        return SpeedProviderUtil.getDurationAfterSpeedProviderApplied(this.speedProvider, j11);
    }

    public long getMediaDurationUs(long j11) {
        int i11;
        synchronized (this.lock) {
            i11 = this.inputAudioFormat.sampleRate;
        }
        if (i11 == -1) {
            return j11;
        }
        return Util.sampleCountToDurationUs(getInputFrameCountForOutput(this.speedProvider, i11, Util.scaleLargeValue(j11, i11, 1000000L, RoundingMode.HALF_EVEN)), i11);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public ByteBuffer getOutput() {
        return this.sonicAudioProcessor.getOutput();
    }

    public void getSpeedAdjustedTimeAsync(long j11, TimestampConsumer timestampConsumer) {
        synchronized (this.lock) {
            try {
                int i11 = this.inputAudioFormat.sampleRate;
                if (i11 != -1) {
                    timestampConsumer.onTimestamp(getDurationUsAfterProcessorApplied(this.speedProvider, i11, j11));
                } else {
                    this.pendingCallbackInputTimesUs.add(j11);
                    this.pendingCallbacks.add(timestampConsumer);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        return !this.pendingOutputAudioFormat.equals(AudioProcessor.AudioFormat.NOT_SET);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isEnded() {
        return this.inputEnded && this.sonicAudioProcessor.isEnded();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueEndOfStream() {
        this.inputEnded = true;
        if (this.endOfStreamQueuedToSonic) {
            return;
        }
        this.sonicAudioProcessor.queueEndOfStream();
        this.endOfStreamQueuedToSonic = true;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        AudioProcessor.AudioFormat audioFormat;
        int i11;
        synchronized (this.lock) {
            audioFormat = this.inputAudioFormat;
        }
        float sampleAlignedSpeed = SpeedProviderUtil.getSampleAlignedSpeed(this.speedProvider, this.framesRead, audioFormat.sampleRate);
        long nextSpeedChangeSamplePosition = SpeedProviderUtil.getNextSpeedChangeSamplePosition(this.speedProvider, this.framesRead, audioFormat.sampleRate);
        updateSpeed(sampleAlignedSpeed);
        int limit = byteBuffer.limit();
        if (nextSpeedChangeSamplePosition != -1) {
            i11 = (int) ((nextSpeedChangeSamplePosition - this.framesRead) * audioFormat.bytesPerFrame);
            byteBuffer.limit(Math.min(limit, byteBuffer.position() + i11));
        } else {
            i11 = -1;
        }
        long position = byteBuffer.position();
        this.sonicAudioProcessor.queueInput(byteBuffer);
        if (i11 != -1 && byteBuffer.position() - position == i11) {
            this.sonicAudioProcessor.queueEndOfStream();
            this.endOfStreamQueuedToSonic = true;
        }
        long position2 = byteBuffer.position() - position;
        Assertions.checkState(position2 % ((long) audioFormat.bytesPerFrame) == 0, "A frame was not queued completely.");
        this.framesRead += position2 / audioFormat.bytesPerFrame;
        byteBuffer.limit(limit);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void reset() {
        flush();
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.pendingInputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        synchronized (this.lock) {
            this.inputAudioFormat = audioFormat;
            this.pendingCallbackInputTimesUs.clear();
            this.pendingCallbacks.clear();
        }
        resetInternalState(true);
        this.sonicAudioProcessor.reset();
    }
}
