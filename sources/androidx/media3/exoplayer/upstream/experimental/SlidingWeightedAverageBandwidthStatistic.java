package androidx.media3.exoplayer.upstream.experimental;

import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class SlidingWeightedAverageBandwidthStatistic implements BandwidthStatistic {
    public static final int DEFAULT_MAX_SAMPLES_COUNT = 10;
    private double bitrateWeightProductSum;
    private final Clock clock;
    private final SampleEvictionFunction sampleEvictionFunction;
    private final ArrayDeque<Sample> samples;
    private double weightSum;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Sample {
        public final long bitrate;
        public final long timeAddedMs;
        public final double weight;

        public Sample(long j11, double d11, long j12) {
            this.bitrate = j11;
            this.weight = d11;
            this.timeAddedMs = j12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface SampleEvictionFunction {
        boolean shouldEvictSample(Deque<Sample> deque);
    }

    public SlidingWeightedAverageBandwidthStatistic() {
        this(getMaxCountEvictionFunction(10L));
    }

    public static /* synthetic */ boolean a(long j11, Clock clock, Deque deque) {
        return !deque.isEmpty() && ((Sample) Util.castNonNull((Sample) deque.peek())).timeAddedMs + j11 < clock.elapsedRealtime();
    }

    public static /* synthetic */ boolean b(long j11, Deque deque) {
        return ((long) deque.size()) >= j11;
    }

    public static SampleEvictionFunction getAgeBasedEvictionFunction(long j11) {
        return getAgeBasedEvictionFunction(j11, Clock.DEFAULT);
    }

    public static SampleEvictionFunction getMaxCountEvictionFunction(final long j11) {
        return new SampleEvictionFunction() { // from class: androidx.media3.exoplayer.upstream.experimental.c
            @Override // androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction
            public final boolean shouldEvictSample(Deque deque) {
                return SlidingWeightedAverageBandwidthStatistic.b(j11, deque);
            }
        };
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void addSample(long j11, long j12) {
        while (this.sampleEvictionFunction.shouldEvictSample(this.samples)) {
            Sample remove = this.samples.remove();
            double d11 = this.bitrateWeightProductSum;
            double d12 = remove.bitrate;
            double d13 = remove.weight;
            this.bitrateWeightProductSum = d11 - (d12 * d13);
            this.weightSum -= d13;
        }
        Sample sample = new Sample((j11 * 8000000) / j12, Math.sqrt(j11), this.clock.elapsedRealtime());
        this.samples.add(sample);
        double d14 = this.bitrateWeightProductSum;
        double d15 = sample.bitrate;
        double d16 = sample.weight;
        this.bitrateWeightProductSum = d14 + (d15 * d16);
        this.weightSum += d16;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public long getBandwidthEstimate() {
        if (this.samples.isEmpty()) {
            return Long.MIN_VALUE;
        }
        return (long) (this.bitrateWeightProductSum / this.weightSum);
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void reset() {
        this.samples.clear();
        this.bitrateWeightProductSum = 0.0d;
        this.weightSum = 0.0d;
    }

    public SlidingWeightedAverageBandwidthStatistic(SampleEvictionFunction sampleEvictionFunction) {
        this(sampleEvictionFunction, Clock.DEFAULT);
    }

    @VisibleForTesting
    public static SampleEvictionFunction getAgeBasedEvictionFunction(final long j11, final Clock clock) {
        return new SampleEvictionFunction() { // from class: androidx.media3.exoplayer.upstream.experimental.b
            @Override // androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic.SampleEvictionFunction
            public final boolean shouldEvictSample(Deque deque) {
                return SlidingWeightedAverageBandwidthStatistic.a(j11, clock, deque);
            }
        };
    }

    @VisibleForTesting
    public SlidingWeightedAverageBandwidthStatistic(SampleEvictionFunction sampleEvictionFunction, Clock clock) {
        this.samples = new ArrayDeque<>();
        this.sampleEvictionFunction = sampleEvictionFunction;
        this.clock = clock;
    }
}
