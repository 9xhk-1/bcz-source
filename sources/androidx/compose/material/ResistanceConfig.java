package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@n(message = "Material's Swipeable has been replaced by Foundation's AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
@u0({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/ResistanceConfig\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,881:1\n71#2,16:882\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/ResistanceConfig\n*L\n695#1:882,16\n*E\n"})
/* loaded from: classes.dex */
public final class ResistanceConfig {
    public static final int $stable = 0;
    private final float basis;
    private final float factorAtMax;
    private final float factorAtMin;

    public ResistanceConfig(float f11, float f12, float f13) {
        this.basis = f11;
        this.factorAtMin = f12;
        this.factorAtMax = f13;
    }

    public final float computeResistance(float f11) {
        float f12 = f11 < 0.0f ? this.factorAtMin : this.factorAtMax;
        if (f12 == 0.0f) {
            return 0.0f;
        }
        float f13 = this.basis;
        float f14 = f11 / f13;
        if (f14 < -1.0f) {
            f14 = -1.0f;
        }
        if (f14 > 1.0f) {
            f14 = 1.0f;
        }
        return (f13 / f12) * ((float) Math.sin((f14 * 3.1415927f) / 2));
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResistanceConfig)) {
            return false;
        }
        ResistanceConfig resistanceConfig = (ResistanceConfig) obj;
        return this.basis == resistanceConfig.basis && this.factorAtMin == resistanceConfig.factorAtMin && this.factorAtMax == resistanceConfig.factorAtMax;
    }

    public final float getBasis() {
        return this.basis;
    }

    public final float getFactorAtMax() {
        return this.factorAtMax;
    }

    public final float getFactorAtMin() {
        return this.factorAtMin;
    }

    public int hashCode() {
        return (((Float.hashCode(this.basis) * 31) + Float.hashCode(this.factorAtMin)) * 31) + Float.hashCode(this.factorAtMax);
    }

    @k
    public String toString() {
        return "ResistanceConfig(basis=" + this.basis + ", factorAtMin=" + this.factorAtMin + ", factorAtMax=" + this.factorAtMax + ')';
    }

    public /* synthetic */ ResistanceConfig(float f11, float f12, float f13, int i11, v vVar) {
        this(f11, (i11 & 2) != 0 ? 10.0f : f12, (i11 & 4) != 0 ? 10.0f : f13);
    }
}
