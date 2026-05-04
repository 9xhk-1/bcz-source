package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@u0({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/FixedDpInsets\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,710:1\n1#2:711\n*E\n"})
/* loaded from: classes.dex */
final class FixedDpInsets implements WindowInsets {
    private final float bottomDp;
    private final float leftDp;
    private final float rightDp;
    private final float topDp;

    public /* synthetic */ FixedDpInsets(float f11, float f12, float f13, float f14, v vVar) {
        this(f11, f12, f13, f14);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FixedDpInsets)) {
            return false;
        }
        FixedDpInsets fixedDpInsets = (FixedDpInsets) obj;
        return Dp.m5120equalsimpl0(this.leftDp, fixedDpInsets.leftDp) && Dp.m5120equalsimpl0(this.topDp, fixedDpInsets.topDp) && Dp.m5120equalsimpl0(this.rightDp, fixedDpInsets.rightDp) && Dp.m5120equalsimpl0(this.bottomDp, fixedDpInsets.bottomDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(@m80.k Density density) {
        return density.mo371roundToPx0680j_4(this.bottomDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(@m80.k Density density, @m80.k LayoutDirection layoutDirection) {
        return density.mo371roundToPx0680j_4(this.leftDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(@m80.k Density density, @m80.k LayoutDirection layoutDirection) {
        return density.mo371roundToPx0680j_4(this.rightDp);
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(@m80.k Density density) {
        return density.mo371roundToPx0680j_4(this.topDp);
    }

    public int hashCode() {
        return (((((Dp.m5121hashCodeimpl(this.leftDp) * 31) + Dp.m5121hashCodeimpl(this.topDp)) * 31) + Dp.m5121hashCodeimpl(this.rightDp)) * 31) + Dp.m5121hashCodeimpl(this.bottomDp);
    }

    @m80.k
    public String toString() {
        return "Insets(left=" + ((Object) Dp.m5126toStringimpl(this.leftDp)) + ", top=" + ((Object) Dp.m5126toStringimpl(this.topDp)) + ", right=" + ((Object) Dp.m5126toStringimpl(this.rightDp)) + ", bottom=" + ((Object) Dp.m5126toStringimpl(this.bottomDp)) + ')';
    }

    private FixedDpInsets(float f11, float f12, float f13, float f14) {
        this.leftDp = f11;
        this.topDp = f12;
        this.rightDp = f13;
        this.bottomDp = f14;
    }
}
