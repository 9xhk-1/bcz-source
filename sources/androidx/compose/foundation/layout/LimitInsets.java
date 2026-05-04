package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
final class LimitInsets implements WindowInsets {

    @m80.k
    private final WindowInsets insets;
    private final int sides;

    public /* synthetic */ LimitInsets(WindowInsets windowInsets, int i11, v vVar) {
        this(windowInsets, i11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitInsets)) {
            return false;
        }
        LimitInsets limitInsets = (LimitInsets) obj;
        return g0.g(this.insets, limitInsets.insets) && WindowInsetsSides.m808equalsimpl0(this.sides, limitInsets.sides);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(@m80.k Density density) {
        if (WindowInsetsSides.m809hasAnybkgdKaI$foundation_layout_release(this.sides, WindowInsetsSides.Companion.m819getBottomJoeWqyM())) {
            return this.insets.getBottom(density);
        }
        return 0;
    }

    @m80.k
    public final WindowInsets getInsets() {
        return this.insets;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(@m80.k Density density, @m80.k LayoutDirection layoutDirection) {
        if (WindowInsetsSides.m809hasAnybkgdKaI$foundation_layout_release(this.sides, layoutDirection == LayoutDirection.Ltr ? WindowInsetsSides.Companion.m815getAllowLeftInLtrJoeWqyM$foundation_layout_release() : WindowInsetsSides.Companion.m816getAllowLeftInRtlJoeWqyM$foundation_layout_release())) {
            return this.insets.getLeft(density, layoutDirection);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(@m80.k Density density, @m80.k LayoutDirection layoutDirection) {
        if (WindowInsetsSides.m809hasAnybkgdKaI$foundation_layout_release(this.sides, layoutDirection == LayoutDirection.Ltr ? WindowInsetsSides.Companion.m817getAllowRightInLtrJoeWqyM$foundation_layout_release() : WindowInsetsSides.Companion.m818getAllowRightInRtlJoeWqyM$foundation_layout_release())) {
            return this.insets.getRight(density, layoutDirection);
        }
        return 0;
    }

    /* renamed from: getSides-JoeWqyM, reason: not valid java name */
    public final int m680getSidesJoeWqyM() {
        return this.sides;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(@m80.k Density density) {
        if (WindowInsetsSides.m809hasAnybkgdKaI$foundation_layout_release(this.sides, WindowInsetsSides.Companion.m825getTopJoeWqyM())) {
            return this.insets.getTop(density);
        }
        return 0;
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + WindowInsetsSides.m810hashCodeimpl(this.sides);
    }

    @m80.k
    public String toString() {
        return '(' + this.insets + " only " + ((Object) WindowInsetsSides.m812toStringimpl(this.sides)) + ')';
    }

    private LimitInsets(WindowInsets windowInsets, int i11) {
        this.insets = windowInsets;
        this.sides = i11;
    }
}
