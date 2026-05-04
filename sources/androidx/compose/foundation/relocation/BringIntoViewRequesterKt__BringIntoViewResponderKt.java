package androidx.compose.foundation.relocation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import m80.k;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final /* synthetic */ class BringIntoViewRequesterKt__BringIntoViewResponderKt {
    @n(message = "Use BringIntoViewModifierNode instead")
    @k
    public static final Modifier bringIntoViewResponder(@k Modifier modifier, @k BringIntoViewResponder bringIntoViewResponder) {
        return modifier.then(new BringIntoViewResponderElement(bringIntoViewResponder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect localRectOf$BringIntoViewRequesterKt__BringIntoViewResponderKt(LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, Rect rect) {
        return rect.m2305translatek4lQ0M(layoutCoordinates.localBoundingBoxOf(layoutCoordinates2, false).m2303getTopLeftF1C5BW0());
    }
}
