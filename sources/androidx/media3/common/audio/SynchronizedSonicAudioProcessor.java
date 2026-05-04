package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
class SynchronizedSonicAudioProcessor implements AudioProcessor {
    private final Object lock;
    private final SonicAudioProcessor sonicAudioProcessor;

    public SynchronizedSonicAudioProcessor(Object obj, boolean z11) {
        this.lock = obj;
        this.sonicAudioProcessor = new SonicAudioProcessor(z11);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final AudioProcessor.AudioFormat configure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        AudioProcessor.AudioFormat configure;
        synchronized (this.lock) {
            configure = this.sonicAudioProcessor.configure(audioFormat);
        }
        return configure;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void flush() {
        synchronized (this.lock) {
            this.sonicAudioProcessor.flush();
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public long getDurationAfterProcessorApplied(long j11) {
        return getPlayoutDuration(j11);
    }

    public final long getMediaDuration(long j11) {
        long mediaDuration;
        synchronized (this.lock) {
            mediaDuration = this.sonicAudioProcessor.getMediaDuration(j11);
        }
        return mediaDuration;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final ByteBuffer getOutput() {
        ByteBuffer output;
        synchronized (this.lock) {
            output = this.sonicAudioProcessor.getOutput();
        }
        return output;
    }

    public final long getPlayoutDuration(long j11) {
        long playoutDuration;
        synchronized (this.lock) {
            playoutDuration = this.sonicAudioProcessor.getPlayoutDuration(j11);
        }
        return playoutDuration;
    }

    public final long getProcessedInputBytes() {
        long processedInputBytes;
        synchronized (this.lock) {
            processedInputBytes = this.sonicAudioProcessor.getProcessedInputBytes();
        }
        return processedInputBytes;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isActive() {
        boolean isActive;
        synchronized (this.lock) {
            isActive = this.sonicAudioProcessor.isActive();
        }
        return isActive;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final boolean isEnded() {
        boolean isEnded;
        synchronized (this.lock) {
            isEnded = this.sonicAudioProcessor.isEnded();
        }
        return isEnded;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueEndOfStream() {
        synchronized (this.lock) {
            this.sonicAudioProcessor.queueEndOfStream();
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void queueInput(ByteBuffer byteBuffer) {
        synchronized (this.lock) {
            this.sonicAudioProcessor.queueInput(byteBuffer);
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public final void reset() {
        synchronized (this.lock) {
            this.sonicAudioProcessor.reset();
        }
    }

    public final void setOutputSampleRateHz(int i11) {
        synchronized (this.lock) {
            this.sonicAudioProcessor.setOutputSampleRateHz(i11);
        }
    }

    public final void setPitch(float f11) {
        synchronized (this.lock) {
            this.sonicAudioProcessor.setPitch(f11);
        }
    }

    public final void setSpeed(float f11) {
        synchronized (this.lock) {
            this.sonicAudioProcessor.setSpeed(f11);
        }
    }
}
