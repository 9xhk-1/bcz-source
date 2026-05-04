package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Constraints;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class InvalidationStrategySpecification {
    public static final int $stable = 8;
    private int heightRateCount;
    private int widthRateCount;

    /* renamed from: shouldInvalidateOnFixedHeight-SulIKG4, reason: not valid java name */
    public final boolean m5495shouldInvalidateOnFixedHeightSulIKG4(long j11, long j12, int i11, int i12) {
        if (Constraints.m5065getHasFixedHeightimpl(j11) && Constraints.m5065getHasFixedHeightimpl(j12)) {
            int abs = Math.abs(Constraints.m5067getMaxHeightimpl(j12) - Constraints.m5067getMaxHeightimpl(j11));
            if (abs >= i12) {
                this.heightRateCount = 0;
                return true;
            }
            if (abs != 0) {
                int i13 = this.heightRateCount + 1;
                this.heightRateCount = i13;
                if (i13 > i11) {
                    this.heightRateCount = 0;
                    return true;
                }
            }
        } else {
            this.heightRateCount = 0;
        }
        return false;
    }

    /* renamed from: shouldInvalidateOnFixedWidth-SulIKG4, reason: not valid java name */
    public final boolean m5496shouldInvalidateOnFixedWidthSulIKG4(long j11, long j12, int i11, int i12) {
        if (Constraints.m5066getHasFixedWidthimpl(j11) && Constraints.m5066getHasFixedWidthimpl(j12)) {
            int abs = Math.abs(Constraints.m5068getMaxWidthimpl(j12) - Constraints.m5068getMaxWidthimpl(j11));
            if (abs >= i12) {
                this.widthRateCount = 0;
                return true;
            }
            if (abs != 0) {
                int i13 = this.widthRateCount + 1;
                this.widthRateCount = i13;
                if (i13 > i11) {
                    this.widthRateCount = 0;
                    return true;
                }
            }
        } else {
            this.widthRateCount = 0;
        }
        return false;
    }
}
