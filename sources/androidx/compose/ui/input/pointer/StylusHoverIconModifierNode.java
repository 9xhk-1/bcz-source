package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.node.DpTouchBoundsExpansion;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class StylusHoverIconModifierNode extends HoverIconModifierNode {
    public static final int $stable = 0;

    @k
    private final String traverseKey;

    public /* synthetic */ StylusHoverIconModifierNode(PointerIcon pointerIcon, boolean z11, DpTouchBoundsExpansion dpTouchBoundsExpansion, int i11, v vVar) {
        this(pointerIcon, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? null : dpTouchBoundsExpansion);
    }

    @Override // androidx.compose.ui.input.pointer.HoverIconModifierNode
    public void displayIcon(@l PointerIcon pointerIcon) {
        PointerIconService pointerIconService = getPointerIconService();
        if (pointerIconService != null) {
            pointerIconService.setStylusHoverIcon(pointerIcon);
        }
    }

    @Override // androidx.compose.ui.input.pointer.HoverIconModifierNode
    /* renamed from: isRelevantPointerType-uerMTgs */
    public boolean mo3659isRelevantPointerTypeuerMTgs(int i11) {
        PointerType.Companion companion = PointerType.Companion;
        return PointerType.m3803equalsimpl0(i11, companion.m3809getStylusT8wyACA()) || PointerType.m3803equalsimpl0(i11, companion.m3807getEraserT8wyACA());
    }

    public StylusHoverIconModifierNode(@k PointerIcon pointerIcon, boolean z11, @l DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        super(pointerIcon, z11, dpTouchBoundsExpansion);
        this.traverseKey = "androidx.compose.ui.input.pointer.StylusHoverIcon";
    }

    @Override // androidx.compose.ui.node.TraversableNode
    @k
    public String getTraverseKey() {
        return this.traverseKey;
    }
}
