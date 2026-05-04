package com.baicizhan.client.business.util.report;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class ExposureItemRange {
    public static final int $stable = 0;
    private final int endVisiblePosition;
    private final int firstVisiblePosition;

    public ExposureItemRange(int i11, int i12) {
        this.firstVisiblePosition = i11;
        this.endVisiblePosition = i12;
    }

    public static /* synthetic */ ExposureItemRange copy$default(ExposureItemRange exposureItemRange, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = exposureItemRange.firstVisiblePosition;
        }
        if ((i13 & 2) != 0) {
            i12 = exposureItemRange.endVisiblePosition;
        }
        return exposureItemRange.copy(i11, i12);
    }

    public final int component1() {
        return this.firstVisiblePosition;
    }

    public final int component2() {
        return this.endVisiblePosition;
    }

    @k
    public final ExposureItemRange copy(int i11, int i12) {
        return new ExposureItemRange(i11, i12);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExposureItemRange)) {
            return false;
        }
        ExposureItemRange exposureItemRange = (ExposureItemRange) obj;
        return this.firstVisiblePosition == exposureItemRange.firstVisiblePosition && this.endVisiblePosition == exposureItemRange.endVisiblePosition;
    }

    public final int getEndVisiblePosition() {
        return this.endVisiblePosition;
    }

    public final int getFirstVisiblePosition() {
        return this.firstVisiblePosition;
    }

    public int hashCode() {
        return (Integer.hashCode(this.firstVisiblePosition) * 31) + Integer.hashCode(this.endVisiblePosition);
    }

    @k
    public String toString() {
        return "ExposureItemRange(firstVisiblePosition=" + this.firstVisiblePosition + ", endVisiblePosition=" + this.endVisiblePosition + j.f81007d;
    }
}
