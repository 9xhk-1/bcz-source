package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import g10.u;
import kotlin.jvm.internal.g0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
final class ExcludeInsets implements WindowInsets {

    @m80.k
    private final WindowInsets excluded;

    @m80.k
    private final WindowInsets included;

    public ExcludeInsets(@m80.k WindowInsets windowInsets, @m80.k WindowInsets windowInsets2) {
        this.included = windowInsets;
        this.excluded = windowInsets2;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExcludeInsets)) {
            return false;
        }
        ExcludeInsets excludeInsets = (ExcludeInsets) obj;
        return g0.g(excludeInsets.included, this.included) && g0.g(excludeInsets.excluded, this.excluded);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(@m80.k Density density) {
        return u.u(this.included.getBottom(density) - this.excluded.getBottom(density), 0);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(@m80.k Density density, @m80.k LayoutDirection layoutDirection) {
        return u.u(this.included.getLeft(density, layoutDirection) - this.excluded.getLeft(density, layoutDirection), 0);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(@m80.k Density density, @m80.k LayoutDirection layoutDirection) {
        return u.u(this.included.getRight(density, layoutDirection) - this.excluded.getRight(density, layoutDirection), 0);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(@m80.k Density density) {
        return u.u(this.included.getTop(density) - this.excluded.getTop(density), 0);
    }

    public int hashCode() {
        return (this.included.hashCode() * 31) + this.excluded.hashCode();
    }

    @m80.k
    public String toString() {
        return '(' + this.included + " - " + this.excluded + ')';
    }
}
