package androidx.compose.foundation.shape;

import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.unit.Density;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class PxCornerSize implements CornerSize, InspectableValue {
    private final float size;

    public PxCornerSize(float f11) {
        this.size = f11;
    }

    private final float component1() {
        return this.size;
    }

    public static /* synthetic */ PxCornerSize copy$default(PxCornerSize pxCornerSize, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = pxCornerSize.size;
        }
        return pxCornerSize.copy(f11);
    }

    @k
    public final PxCornerSize copy(float f11) {
        return new PxCornerSize(f11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PxCornerSize) && Float.compare(this.size, ((PxCornerSize) obj).size) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.size);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public float mo1010toPxTmRCtEA(long j11, @k Density density) {
        return this.size;
    }

    @k
    public String toString() {
        return "CornerSize(size = " + this.size + ".px)";
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    @k
    public String getValueOverride() {
        return this.size + "px";
    }
}
