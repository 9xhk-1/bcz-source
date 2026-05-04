package androidx.core.graphics;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class PathSegment {
    private final PointF mEnd;
    private final float mEndFraction;
    private final PointF mStart;
    private final float mStartFraction;

    public PathSegment(@NonNull PointF pointF, float f11, @NonNull PointF pointF2, float f12) {
        this.mStart = (PointF) Preconditions.checkNotNull(pointF, "start == null");
        this.mStartFraction = f11;
        this.mEnd = (PointF) Preconditions.checkNotNull(pointF2, "end == null");
        this.mEndFraction = f12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PathSegment)) {
            return false;
        }
        PathSegment pathSegment = (PathSegment) obj;
        return Float.compare(this.mStartFraction, pathSegment.mStartFraction) == 0 && Float.compare(this.mEndFraction, pathSegment.mEndFraction) == 0 && this.mStart.equals(pathSegment.mStart) && this.mEnd.equals(pathSegment.mEnd);
    }

    @NonNull
    public PointF getEnd() {
        return this.mEnd;
    }

    public float getEndFraction() {
        return this.mEndFraction;
    }

    @NonNull
    public PointF getStart() {
        return this.mStart;
    }

    public float getStartFraction() {
        return this.mStartFraction;
    }

    public int hashCode() {
        int hashCode = this.mStart.hashCode() * 31;
        float f11 = this.mStartFraction;
        int floatToIntBits = (((hashCode + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0)) * 31) + this.mEnd.hashCode()) * 31;
        float f12 = this.mEndFraction;
        return floatToIntBits + (f12 != 0.0f ? Float.floatToIntBits(f12) : 0);
    }

    public String toString() {
        return "PathSegment{start=" + this.mStart + ", startFraction=" + this.mStartFraction + ", end=" + this.mEnd + ", endFraction=" + this.mEndFraction + l50.b.f69928j;
    }
}
