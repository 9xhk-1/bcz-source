package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@n(message = "Material's Swipeable has been replaced by Foundation's AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class FixedThreshold implements ThresholdConfig {
    public static final int $stable = 0;
    private final float offset;

    public /* synthetic */ FixedThreshold(float f11, v vVar) {
        this(f11);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    private final float m1681component1D9Ej5fM() {
        return this.offset;
    }

    /* renamed from: copy-0680j_4$default, reason: not valid java name */
    public static /* synthetic */ FixedThreshold m1682copy0680j_4$default(FixedThreshold fixedThreshold, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = fixedThreshold.offset;
        }
        return fixedThreshold.m1683copy0680j_4(f11);
    }

    @Override // androidx.compose.material.ThresholdConfig
    public float computeThreshold(@k Density density, float f11, float f12) {
        return f11 + (density.mo377toPx0680j_4(this.offset) * Math.signum(f12 - f11));
    }

    @k
    /* renamed from: copy-0680j_4, reason: not valid java name */
    public final FixedThreshold m1683copy0680j_4(float f11) {
        return new FixedThreshold(f11, null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FixedThreshold) && Dp.m5120equalsimpl0(this.offset, ((FixedThreshold) obj).offset);
    }

    public int hashCode() {
        return Dp.m5121hashCodeimpl(this.offset);
    }

    @k
    public String toString() {
        return "FixedThreshold(offset=" + ((Object) Dp.m5126toStringimpl(this.offset)) + ')';
    }

    private FixedThreshold(float f11) {
        this.offset = f11;
    }
}
