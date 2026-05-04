package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DpTouchBoundsExpansion;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class PointerIconKt {
    @Stable
    @k
    public static final Modifier pointerHoverIcon(@k Modifier modifier, @k PointerIcon pointerIcon, boolean z11) {
        return modifier.then(new PointerHoverIconModifierElement(pointerIcon, z11));
    }

    public static /* synthetic */ Modifier pointerHoverIcon$default(Modifier modifier, PointerIcon pointerIcon, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return pointerHoverIcon(modifier, pointerIcon, z11);
    }

    @k
    public static final Modifier stylusHoverIcon(@k Modifier modifier, @k PointerIcon pointerIcon, boolean z11, @l DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        return modifier.then(new StylusHoverIconModifierElement(pointerIcon, z11, dpTouchBoundsExpansion));
    }

    public static /* synthetic */ Modifier stylusHoverIcon$default(Modifier modifier, PointerIcon pointerIcon, boolean z11, DpTouchBoundsExpansion dpTouchBoundsExpansion, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            dpTouchBoundsExpansion = null;
        }
        return stylusHoverIcon(modifier, pointerIcon, z11, dpTouchBoundsExpansion);
    }
}
