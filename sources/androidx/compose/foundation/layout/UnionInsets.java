package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.g0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
final class UnionInsets implements WindowInsets {

    @m80.k
    private final WindowInsets first;

    @m80.k
    private final WindowInsets second;

    public UnionInsets(@m80.k WindowInsets windowInsets, @m80.k WindowInsets windowInsets2) {
        this.first = windowInsets;
        this.second = windowInsets2;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnionInsets)) {
            return false;
        }
        UnionInsets unionInsets = (UnionInsets) obj;
        return g0.g(unionInsets.first, this.first) && g0.g(unionInsets.second, this.second);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(@m80.k Density density) {
        return Math.max(this.first.getBottom(density), this.second.getBottom(density));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(@m80.k Density density, @m80.k LayoutDirection layoutDirection) {
        return Math.max(this.first.getLeft(density, layoutDirection), this.second.getLeft(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(@m80.k Density density, @m80.k LayoutDirection layoutDirection) {
        return Math.max(this.first.getRight(density, layoutDirection), this.second.getRight(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(@m80.k Density density) {
        return Math.max(this.first.getTop(density), this.second.getTop(density));
    }

    public int hashCode() {
        return this.first.hashCode() + (this.second.hashCode() * 31);
    }

    @m80.k
    public String toString() {
        return '(' + this.first + " ∪ " + this.second + ')';
    }
}
