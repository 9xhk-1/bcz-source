package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@u0({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/InsetsPaddingValues\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,710:1\n1#2:711\n*E\n"})
/* loaded from: classes.dex */
final class InsetsPaddingValues implements PaddingValues {

    @m80.k
    private final Density density;

    @m80.k
    private final WindowInsets insets;

    public InsetsPaddingValues(@m80.k WindowInsets windowInsets, @m80.k Density density) {
        this.insets = windowInsets;
        this.density = density;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM, reason: not valid java name */
    public float mo675calculateBottomPaddingD9Ej5fM() {
        Density density = this.density;
        return density.mo374toDpu2uoSUM(this.insets.getBottom(density));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM, reason: not valid java name */
    public float mo676calculateLeftPaddingu2uoSUM(@m80.k LayoutDirection layoutDirection) {
        Density density = this.density;
        return density.mo374toDpu2uoSUM(this.insets.getLeft(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM, reason: not valid java name */
    public float mo677calculateRightPaddingu2uoSUM(@m80.k LayoutDirection layoutDirection) {
        Density density = this.density;
        return density.mo374toDpu2uoSUM(this.insets.getRight(density, layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM, reason: not valid java name */
    public float mo678calculateTopPaddingD9Ej5fM() {
        Density density = this.density;
        return density.mo374toDpu2uoSUM(this.insets.getTop(density));
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsetsPaddingValues)) {
            return false;
        }
        InsetsPaddingValues insetsPaddingValues = (InsetsPaddingValues) obj;
        return g0.g(this.insets, insetsPaddingValues.insets) && g0.g(this.density, insetsPaddingValues.density);
    }

    @m80.k
    public final WindowInsets getInsets() {
        return this.insets;
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + this.density.hashCode();
    }

    @m80.k
    public String toString() {
        return "InsetsPaddingValues(insets=" + this.insets + ", density=" + this.density + ')';
    }
}
