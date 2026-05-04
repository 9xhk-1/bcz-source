package androidx.compose.ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DataPointAtTime {
    public static final int $stable = 8;
    private float dataPoint;
    private long time;

    public DataPointAtTime(long j11, float f11) {
        this.time = j11;
        this.dataPoint = f11;
    }

    public static /* synthetic */ DataPointAtTime copy$default(DataPointAtTime dataPointAtTime, long j11, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = dataPointAtTime.time;
        }
        if ((i11 & 2) != 0) {
            f11 = dataPointAtTime.dataPoint;
        }
        return dataPointAtTime.copy(j11, f11);
    }

    public final long component1() {
        return this.time;
    }

    public final float component2() {
        return this.dataPoint;
    }

    @k
    public final DataPointAtTime copy(long j11, float f11) {
        return new DataPointAtTime(j11, f11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataPointAtTime)) {
            return false;
        }
        DataPointAtTime dataPointAtTime = (DataPointAtTime) obj;
        return this.time == dataPointAtTime.time && Float.compare(this.dataPoint, dataPointAtTime.dataPoint) == 0;
    }

    public final float getDataPoint() {
        return this.dataPoint;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (Long.hashCode(this.time) * 31) + Float.hashCode(this.dataPoint);
    }

    public final void setDataPoint(float f11) {
        this.dataPoint = f11;
    }

    public final void setTime(long j11) {
        this.time = j11;
    }

    @k
    public String toString() {
        return "DataPointAtTime(time=" + this.time + ", dataPoint=" + this.dataPoint + ')';
    }
}
