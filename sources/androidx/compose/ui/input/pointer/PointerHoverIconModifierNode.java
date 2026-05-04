package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.PointerType;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class PointerHoverIconModifierNode extends HoverIconModifierNode {
    public static final int $stable = 0;

    @k
    private final String traverseKey;

    public /* synthetic */ PointerHoverIconModifierNode(PointerIcon pointerIcon, boolean z11, int i11, v vVar) {
        this(pointerIcon, (i11 & 2) != 0 ? false : z11);
    }

    @Override // androidx.compose.ui.input.pointer.HoverIconModifierNode
    public void displayIcon(@l PointerIcon pointerIcon) {
        PointerIconService pointerIconService = getPointerIconService();
        if (pointerIconService != null) {
            pointerIconService.setIcon(pointerIcon);
        }
    }

    @Override // androidx.compose.ui.input.pointer.HoverIconModifierNode
    /* renamed from: isRelevantPointerType-uerMTgs */
    public boolean mo3659isRelevantPointerTypeuerMTgs(int i11) {
        PointerType.Companion companion = PointerType.Companion;
        return (PointerType.m3803equalsimpl0(i11, companion.m3809getStylusT8wyACA()) || PointerType.m3803equalsimpl0(i11, companion.m3807getEraserT8wyACA())) ? false : true;
    }

    public PointerHoverIconModifierNode(@k PointerIcon pointerIcon, boolean z11) {
        super(pointerIcon, z11, null, 4, null);
        this.traverseKey = "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // androidx.compose.ui.node.TraversableNode
    @k
    public String getTraverseKey() {
        return this.traverseKey;
    }
}
