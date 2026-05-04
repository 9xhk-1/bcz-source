package androidx.compose.foundation.lazy.layout;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class Averages {
    private long compositionTimeNanos;
    private long measureTimeNanos;

    private final long calculateAverageTime(long j11, long j12) {
        if (j12 == 0) {
            return j11;
        }
        long j13 = 4;
        return ((j12 / j13) * 3) + (j11 / j13);
    }

    @k
    public final Averages copy() {
        Averages averages = new Averages();
        averages.compositionTimeNanos = this.compositionTimeNanos;
        averages.measureTimeNanos = this.measureTimeNanos;
        return averages;
    }

    public final long getCompositionTimeNanos() {
        return this.compositionTimeNanos;
    }

    public final long getMeasureTimeNanos() {
        return this.measureTimeNanos;
    }

    public final void saveCompositionTimeNanos(long j11) {
        this.compositionTimeNanos = calculateAverageTime(j11, this.compositionTimeNanos);
    }

    public final void saveMeasureTimeNanos(long j11) {
        this.measureTimeNanos = calculateAverageTime(j11, this.measureTimeNanos);
    }

    public final void setCompositionTimeNanos(long j11) {
        this.compositionTimeNanos = j11;
    }

    public final void setMeasureTimeNanos(long j11) {
        this.measureTimeNanos = j11;
    }
}
