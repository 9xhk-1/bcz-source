package androidx.compose.ui.unit;

import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class DensityImpl implements Density {
    private final float density;
    private final float fontScale;

    public DensityImpl(float f11, float f12) {
        this.density = f11;
        this.fontScale = f12;
    }

    public static /* synthetic */ DensityImpl copy$default(DensityImpl densityImpl, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = densityImpl.density;
        }
        if ((i11 & 2) != 0) {
            f12 = densityImpl.fontScale;
        }
        return densityImpl.copy(f11, f12);
    }

    public final float component1() {
        return this.density;
    }

    public final float component2() {
        return this.fontScale;
    }

    @k
    public final DensityImpl copy(float f11, float f12) {
        return new DensityImpl(f11, f12);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DensityImpl)) {
            return false;
        }
        DensityImpl densityImpl = (DensityImpl) obj;
        return Float.compare(this.density, densityImpl.density) == 0 && Float.compare(this.fontScale, densityImpl.fontScale) == 0;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.density;
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.fontScale;
    }

    public int hashCode() {
        return (Float.hashCode(this.density) * 31) + Float.hashCode(this.fontScale);
    }

    @k
    public String toString() {
        return "DensityImpl(density=" + this.density + ", fontScale=" + this.fontScale + ')';
    }
}
