package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
final class FixedIntInsets implements WindowInsets {
    private final int bottomVal;
    private final int leftVal;
    private final int rightVal;
    private final int topVal;

    public FixedIntInsets(int i11, int i12, int i13, int i14) {
        this.leftVal = i11;
        this.topVal = i12;
        this.rightVal = i13;
        this.bottomVal = i14;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedIntInsets)) {
            return false;
        }
        FixedIntInsets fixedIntInsets = (FixedIntInsets) obj;
        return this.leftVal == fixedIntInsets.leftVal && this.topVal == fixedIntInsets.topVal && this.rightVal == fixedIntInsets.rightVal && this.bottomVal == fixedIntInsets.bottomVal;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(@m80.k Density density) {
        return this.bottomVal;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(@m80.k Density density, @m80.k LayoutDirection layoutDirection) {
        return this.leftVal;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(@m80.k Density density, @m80.k LayoutDirection layoutDirection) {
        return this.rightVal;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(@m80.k Density density) {
        return this.topVal;
    }

    public int hashCode() {
        return (((((this.leftVal * 31) + this.topVal) * 31) + this.rightVal) * 31) + this.bottomVal;
    }

    @m80.k
    public String toString() {
        return "Insets(left=" + this.leftVal + ", top=" + this.topVal + ", right=" + this.rightVal + ", bottom=" + this.bottomVal + ')';
    }
}
