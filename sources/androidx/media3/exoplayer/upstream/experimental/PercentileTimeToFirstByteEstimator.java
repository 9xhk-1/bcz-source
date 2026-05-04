package androidx.media3.exoplayer.upstream.experimental;

import androidx.annotation.VisibleForTesting;
import androidx.media3.common.C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSpec;
import androidx.media3.exoplayer.upstream.SlidingPercentile;
import androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class PercentileTimeToFirstByteEstimator implements TimeToFirstByteEstimator {
    public static final int DEFAULT_MAX_SAMPLES_COUNT = 10;
    public static final float DEFAULT_PERCENTILE = 0.5f;
    private static final int MAX_DATA_SPECS = 10;
    private final Clock clock;
    private final LinkedHashMap<DataSpec, Long> initializedDataSpecs;
    private boolean isEmpty;
    private final float percentile;
    private final SlidingPercentile slidingPercentile;

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

    public PercentileTimeToFirstByteEstimator() {
        this(10, 0.5f);
    }

    @Override // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public long getTimeToFirstByteEstimateUs() {
        return !this.isEmpty ? (long) this.slidingPercentile.getPercentile(this.percentile) : C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public void onTransferInitializing(DataSpec dataSpec) {
        this.initializedDataSpecs.remove(dataSpec);
        this.initializedDataSpecs.put(dataSpec, Long.valueOf(Util.msToUs(this.clock.elapsedRealtime())));
    }

    @Override // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public void onTransferStart(DataSpec dataSpec) {
        if (this.initializedDataSpecs.remove(dataSpec) == null) {
            return;
        }
        this.slidingPercentile.addSample(1, Util.msToUs(this.clock.elapsedRealtime()) - r6.longValue());
        this.isEmpty = false;
    }

    @Override // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public void reset() {
        this.slidingPercentile.reset();
        this.isEmpty = true;
    }

    public PercentileTimeToFirstByteEstimator(int i11, float f11) {
        this(i11, f11, Clock.DEFAULT);
    }

    @VisibleForTesting
    public PercentileTimeToFirstByteEstimator(int i11, float f11, Clock clock) {
        Assertions.checkArgument(i11 > 0 && f11 > 0.0f && f11 <= 1.0f);
        this.percentile = f11;
        this.clock = clock;
        this.initializedDataSpecs = new FixedSizeLinkedHashMap(10);
        this.slidingPercentile = new SlidingPercentile(i11);
        this.isEmpty = true;
    }
}
