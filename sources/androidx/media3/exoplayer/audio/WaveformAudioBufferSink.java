package androidx.media3.exoplayer.audio;

import android.util.SparseArray;
import androidx.annotation.FloatRange;
import androidx.media3.common.audio.AudioMixingUtil;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.ChannelMixingMatrix;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.TeeAudioProcessor;
import com.google.common.base.Preconditions;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class WaveformAudioBufferSink implements TeeAudioProcessor.AudioBufferSink {
    private final int barsPerSecond;
    private ChannelMixingMatrix channelMixingMatrix;
    private AudioProcessor.AudioFormat inputAudioFormat;
    private final Listener listener;
    private AudioProcessor.AudioFormat mixingAudioFormat;
    private final ByteBuffer mixingBuffer;
    private final SparseArray<WaveformBar> outputChannels;
    private int samplesPerBar;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Listener {
        void onNewWaveformBar(int i11, WaveformBar waveformBar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WaveformBar {
        private int sampleCount;
        private double squareSum;
        private float minSampleValue = 1.0f;
        private float maxSampleValue = -1.0f;

        public void addSample(@FloatRange(from = -1.0d, to = 1.0d) float f11) {
            Preconditions.checkArgument(f11 >= -1.0f && f11 <= 1.0f);
            this.minSampleValue = Math.min(this.minSampleValue, f11);
            this.maxSampleValue = Math.max(this.maxSampleValue, f11);
            double d11 = f11;
            this.squareSum += d11 * d11;
            this.sampleCount++;
        }

        public double getMaxSampleValue() {
            return this.maxSampleValue;
        }

        public double getMinSampleValue() {
            return this.minSampleValue;
        }

        public double getRootMeanSquare() {
            return Math.sqrt(this.squareSum / this.sampleCount);
        }

        public int getSampleCount() {
            return this.sampleCount;
        }
    }

    public WaveformAudioBufferSink(int i11, int i12, Listener listener) {
        this.barsPerSecond = i11;
        this.listener = listener;
        this.mixingBuffer = ByteBuffer.allocate(Util.getPcmFrameSize(4, i12));
        this.outputChannels = new SparseArray<>(i12);
        for (int i13 = 0; i13 < i12; i13++) {
            this.outputChannels.append(i13, new WaveformBar());
        }
    }

    @Override // androidx.media3.exoplayer.audio.TeeAudioProcessor.AudioBufferSink
    public void flush(int i11, int i12, int i13) {
        this.samplesPerBar = i11 / this.barsPerSecond;
        this.inputAudioFormat = new AudioProcessor.AudioFormat(i11, i12, i13);
        this.mixingAudioFormat = new AudioProcessor.AudioFormat(i11, this.outputChannels.size(), 4);
        this.channelMixingMatrix = ChannelMixingMatrix.create(i12, this.outputChannels.size());
    }

    @Override // androidx.media3.exoplayer.audio.TeeAudioProcessor.AudioBufferSink
    public void handleBuffer(ByteBuffer byteBuffer) {
        Assertions.checkStateNotNull(this.inputAudioFormat);
        Assertions.checkStateNotNull(this.mixingAudioFormat);
        Assertions.checkStateNotNull(this.channelMixingMatrix);
        while (byteBuffer.hasRemaining()) {
            this.mixingBuffer.rewind();
            ByteBuffer byteBuffer2 = byteBuffer;
            AudioMixingUtil.mix(byteBuffer2, this.inputAudioFormat, this.mixingBuffer, this.mixingAudioFormat, this.channelMixingMatrix, 1, false, true);
            this.mixingBuffer.rewind();
            for (int i11 = 0; i11 < this.outputChannels.size(); i11++) {
                WaveformBar waveformBar = this.outputChannels.get(i11);
                waveformBar.addSample(this.mixingBuffer.getFloat());
                if (waveformBar.getSampleCount() >= this.samplesPerBar) {
                    this.listener.onNewWaveformBar(i11, waveformBar);
                    this.outputChannels.put(i11, new WaveformBar());
                }
            }
            byteBuffer = byteBuffer2;
        }
    }
}
