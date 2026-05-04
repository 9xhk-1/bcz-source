package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.util.MathHelpersKt;
import m80.k;
import m80.l;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@n(message = "Material's Swipeable has been replaced by Foundation's AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class FractionalThreshold implements ThresholdConfig {
    public static final int $stable = 0;
    private final float fraction;

    public FractionalThreshold(float f11) {
        this.fraction = f11;
    }

    private final float component1() {
        return this.fraction;
    }

    public static /* synthetic */ FractionalThreshold copy$default(FractionalThreshold fractionalThreshold, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = fractionalThreshold.fraction;
        }
        return fractionalThreshold.copy(f11);
    }

    @Override // androidx.compose.material.ThresholdConfig
    public float computeThreshold(@k Density density, float f11, float f12) {
        return MathHelpersKt.lerp(f11, f12, this.fraction);
    }

    @k
    public final FractionalThreshold copy(float f11) {
        return new FractionalThreshold(f11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FractionalThreshold) && Float.compare(this.fraction, ((FractionalThreshold) obj).fraction) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.fraction);
    }

    @k
    public String toString() {
        return "FractionalThreshold(fraction=" + this.fraction + ')';
    }
}
