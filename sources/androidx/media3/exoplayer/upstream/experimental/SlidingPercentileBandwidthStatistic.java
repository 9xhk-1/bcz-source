package androidx.media3.exoplayer.upstream.experimental;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.TreeSet;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class SlidingPercentileBandwidthStatistic implements BandwidthStatistic {
    public static final int DEFAULT_MAX_SAMPLES_COUNT = 10;
    public static final double DEFAULT_PERCENTILE = 0.5d;
    private long bitrateEstimate;
    private final int maxSampleCount;
    private final double percentile;
    private final ArrayDeque<Sample> samples;
    private final TreeSet<Sample> sortedSamples;
    private double weightSum;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Sample implements Comparable<Sample> {
        private final long bitrate;
        private final double weight;

        public Sample(long j11, double d11) {
            this.bitrate = j11;
            this.weight = d11;
        }

        @Override // java.lang.Comparable
        public int compareTo(Sample sample) {
            return Util.compareLong(this.bitrate, sample.bitrate);
        }
    }

    public SlidingPercentileBandwidthStatistic() {
        this(10, 0.5d);
    }

    private long calculateBitrateEstimate() {
        if (this.samples.isEmpty()) {
            return Long.MIN_VALUE;
        }
        double d11 = this.weightSum * this.percentile;
        Iterator<Sample> it = this.sortedSamples.iterator();
        double d12 = 0.0d;
        long j11 = 0;
        double d13 = 0.0d;
        while (it.hasNext()) {
            Sample next = it.next();
            double d14 = d12 + (next.weight / 2.0d);
            if (d14 >= d11) {
                return j11 == 0 ? next.bitrate : j11 + ((long) (((next.bitrate - j11) * (d11 - d13)) / (d14 - d13)));
            }
            j11 = next.bitrate;
            d13 = d14;
            d12 = (next.weight / 2.0d) + d14;
        }
        return j11;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void addSample(long j11, long j12) {
        while (this.samples.size() >= this.maxSampleCount) {
            Sample remove = this.samples.remove();
            this.sortedSamples.remove(remove);
            this.weightSum -= remove.weight;
        }
        double sqrt = Math.sqrt(j11);
        Sample sample = new Sample((j11 * 8000000) / j12, sqrt);
        this.samples.add(sample);
        this.sortedSamples.add(sample);
        this.weightSum += sqrt;
        this.bitrateEstimate = calculateBitrateEstimate();
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public long getBandwidthEstimate() {
        return this.bitrateEstimate;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void reset() {
        this.samples.clear();
        this.sortedSamples.clear();
        this.weightSum = 0.0d;
        this.bitrateEstimate = Long.MIN_VALUE;
    }

    public SlidingPercentileBandwidthStatistic(int i11, double d11) {
        Assertions.checkArgument(d11 >= 0.0d && d11 <= 1.0d);
        this.maxSampleCount = i11;
        this.percentile = d11;
        this.samples = new ArrayDeque<>();
        this.sortedSamples = new TreeSet<>();
        this.bitrateEstimate = Long.MIN_VALUE;
    }
}
