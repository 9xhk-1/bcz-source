package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.l;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@u0({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/PaddingValuesInsets\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,710:1\n1#2:711\n*E\n"})
/* loaded from: classes.dex */
final class PaddingValuesInsets implements WindowInsets {

    @m80.k
    private final PaddingValues paddingValues;

    public PaddingValuesInsets(@m80.k PaddingValues paddingValues) {
        this.paddingValues = paddingValues;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaddingValuesInsets) {
            return g0.g(((PaddingValuesInsets) obj).paddingValues, this.paddingValues);
        }
        return false;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(@m80.k Density density) {
        return density.mo371roundToPx0680j_4(this.paddingValues.mo675calculateBottomPaddingD9Ej5fM());
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(@m80.k Density density, @m80.k LayoutDirection layoutDirection) {
        return density.mo371roundToPx0680j_4(this.paddingValues.mo676calculateLeftPaddingu2uoSUM(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(@m80.k Density density, @m80.k LayoutDirection layoutDirection) {
        return density.mo371roundToPx0680j_4(this.paddingValues.mo677calculateRightPaddingu2uoSUM(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(@m80.k Density density) {
        return density.mo371roundToPx0680j_4(this.paddingValues.mo678calculateTopPaddingD9Ej5fM());
    }

    public int hashCode() {
        return this.paddingValues.hashCode();
    }

    @m80.k
    public String toString() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        return "PaddingValues(" + ((Object) Dp.m5126toStringimpl(this.paddingValues.mo676calculateLeftPaddingu2uoSUM(layoutDirection))) + j2.O + ((Object) Dp.m5126toStringimpl(this.paddingValues.mo678calculateTopPaddingD9Ej5fM())) + j2.O + ((Object) Dp.m5126toStringimpl(this.paddingValues.mo677calculateRightPaddingu2uoSUM(layoutDirection))) + j2.O + ((Object) Dp.m5126toStringimpl(this.paddingValues.mo675calculateBottomPaddingD9Ej5fM())) + ')';
    }
}
