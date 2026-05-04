package androidx.media3.exoplayer.upstream.experimental;

import androidx.annotation.VisibleForTesting;
import androidx.media3.common.C;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSpec;
import androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class ExponentialWeightedAverageTimeToFirstByteEstimator implements TimeToFirstByteEstimator {
    public static final double DEFAULT_SMOOTHING_FACTOR = 0.85d;
    private static final int MAX_DATA_SPECS = 10;
    private final Clock clock;
    private long estimateUs;
    private final LinkedHashMap<DataSpec, Long> initializedDataSpecs;
    private final double smoothingFactor;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class FixedSizeLinkedHashMap<K, V> extends LinkedHashMap<K, V> {
        private final int maxSize;

        public FixedSizeLinkedHashMap(int i11) {
            this.maxSize = i11;
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<K, V> entry) {
            return size() > this.maxSize;
        }
    }

    public ExponentialWeightedAverageTimeToFirstByteEstimator() {
        this(0.85d, Clock.DEFAULT);
    }

    @Override // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public long getTimeToFirstByteEstimateUs() {
        return this.estimateUs;
    }

    @Override // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public void onTransferInitializing(DataSpec dataSpec) {
        this.initializedDataSpecs.remove(dataSpec);
        this.initializedDataSpecs.put(dataSpec, Long.valueOf(Util.msToUs(this.clock.elapsedRealtime())));
    }

    @Override // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public void onTransferStart(DataSpec dataSpec) {
        Long remove = this.initializedDataSpecs.remove(dataSpec);
        if (remove == null) {
            return;
        }
        long msToUs = Util.msToUs(this.clock.elapsedRealtime()) - remove.longValue();
        long j11 = this.estimateUs;
        if (j11 == C.TIME_UNSET) {
            this.estimateUs = msToUs;
        } else {
            double d11 = this.smoothingFactor;
            this.estimateUs = (long) ((j11 * d11) + ((1.0d - d11) * msToUs));
        }
    }

    @Override // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public void reset() {
        this.estimateUs = C.TIME_UNSET;
    }

    public ExponentialWeightedAverageTimeToFirstByteEstimator(double d11) {
        this(d11, Clock.DEFAULT);
    }

    @VisibleForTesting
    public ExponentialWeightedAverageTimeToFirstByteEstimator(double d11, Clock clock) {
        this.smoothingFactor = d11;
        this.clock = clock;
        this.initializedDataSpecs = new FixedSizeLinkedHashMap(10);
        this.estimateUs = C.TIME_UNSET;
    }
}
