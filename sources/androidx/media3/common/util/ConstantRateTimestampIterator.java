package androidx.media3.common.util;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.media3.common.C;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class ConstantRateTimestampIterator implements TimestampIterator {
    private final long endPositionUs;
    private final float frameRate;
    private int framesAdded;
    private final double framesDurationUs;
    private final long startPositionUs;
    private final int totalNumberOfFramesToAdd;

    public ConstantRateTimestampIterator(@IntRange(from = 1) long j11, @FloatRange(from = 0.0d, fromInclusive = false) float f11) {
        this(0L, j11, f11);
    }

    private long getTimestampUsAfter(int i11) {
        long round = this.startPositionUs + Math.round(this.framesDurationUs * i11);
        Assertions.checkState(round >= 0);
        return round;
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public long getLastTimestampUs() {
        int i11 = this.totalNumberOfFramesToAdd;
        return i11 == 0 ? C.TIME_UNSET : getTimestampUsAfter(i11 - 1);
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public boolean hasNext() {
        return this.framesAdded < this.totalNumberOfFramesToAdd;
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public long next() {
        Assertions.checkState(hasNext());
        int i11 = this.framesAdded;
        this.framesAdded = i11 + 1;
        return getTimestampUsAfter(i11);
    }

    public ConstantRateTimestampIterator(@IntRange(from = 0) long j11, @IntRange(from = 1) long j12, @FloatRange(from = 0.0d, fromInclusive = false) float f11) {
        boolean z11 = false;
        Assertions.checkArgument(j12 > 0);
        Assertions.checkArgument(f11 > 0.0f);
        if (0 <= j11 && j11 < j12) {
            z11 = true;
        }
        Assertions.checkArgument(z11);
        this.startPositionUs = j11;
        this.endPositionUs = j12;
        this.frameRate = f11;
        this.totalNumberOfFramesToAdd = Math.max(Math.round(((j12 - j11) / 1000000.0f) * f11), 1);
        this.framesDurationUs = 1000000.0f / f11;
    }

    @Override // androidx.media3.common.util.TimestampIterator
    public ConstantRateTimestampIterator copyOf() {
        return new ConstantRateTimestampIterator(this.startPositionUs, this.endPositionUs, this.frameRate);
    }
}
