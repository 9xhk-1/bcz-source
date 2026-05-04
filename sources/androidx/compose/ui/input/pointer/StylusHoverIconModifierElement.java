package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.DpTouchBoundsExpansion;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class StylusHoverIconModifierElement extends ModifierNodeElement<StylusHoverIconModifierNode> {
    public static final int $stable = 0;

    @k
    private final PointerIcon icon;
    private final boolean overrideDescendants;

    @l
    private final DpTouchBoundsExpansion touchBoundsExpansion;

    public /* synthetic */ StylusHoverIconModifierElement(PointerIcon pointerIcon, boolean z11, DpTouchBoundsExpansion dpTouchBoundsExpansion, int i11, v vVar) {
        this(pointerIcon, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? null : dpTouchBoundsExpansion);
    }

    public static /* synthetic */ StylusHoverIconModifierElement copy$default(StylusHoverIconModifierElement stylusHoverIconModifierElement, PointerIcon pointerIcon, boolean z11, DpTouchBoundsExpansion dpTouchBoundsExpansion, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            pointerIcon = stylusHoverIconModifierElement.icon;
        }
        if ((i11 & 2) != 0) {
            z11 = stylusHoverIconModifierElement.overrideDescendants;
        }
        if ((i11 & 4) != 0) {
            dpTouchBoundsExpansion = stylusHoverIconModifierElement.touchBoundsExpansion;
        }
        return stylusHoverIconModifierElement.copy(pointerIcon, z11, dpTouchBoundsExpansion);
    }

    @k
    public final PointerIcon component1() {
        return this.icon;
    }

    public final boolean component2() {
        return this.overrideDescendants;
    }

    @l
    public final DpTouchBoundsExpansion component3() {
        return this.touchBoundsExpansion;
    }

    @k
    public final StylusHoverIconModifierElement copy(@k PointerIcon pointerIcon, boolean z11, @l DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        return new StylusHoverIconModifierElement(pointerIcon, z11, dpTouchBoundsExpansion);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StylusHoverIconModifierElement)) {
            return false;
        }
        StylusHoverIconModifierElement stylusHoverIconModifierElement = (StylusHoverIconModifierElement) obj;
        return g0.g(this.icon, stylusHoverIconModifierElement.icon) && this.overrideDescendants == stylusHoverIconModifierElement.overrideDescendants && g0.g(this.touchBoundsExpansion, stylusHoverIconModifierElement.touchBoundsExpansion);
    }

    @k
    public final PointerIcon getIcon() {
        return this.icon;
    }

    public final boolean getOverrideDescendants() {
        return this.overrideDescendants;
    }

    @l
    public final DpTouchBoundsExpansion getTouchBoundsExpansion() {
        return this.touchBoundsExpansion;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = ((this.icon.hashCode() * 31) + Boolean.hashCode(this.overrideDescendants)) * 31;
        DpTouchBoundsExpansion dpTouchBoundsExpansion = this.touchBoundsExpansion;
        return hashCode + (dpTouchBoundsExpansion == null ? 0 : dpTouchBoundsExpansion.hashCode());
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("stylusHoverIcon");
        inspectorInfo.getProperties().set("icon", this.icon);
        inspectorInfo.getProperties().set("overrideDescendants", Boolean.valueOf(this.overrideDescendants));
        inspectorInfo.getProperties().set("touchBoundsExpansion", this.touchBoundsExpansion);
    }

    @k
    public String toString() {
        return "StylusHoverIconModifierElement(icon=" + this.icon + ", overrideDescendants=" + this.overrideDescendants + ", touchBoundsExpansion=" + this.touchBoundsExpansion + ')';
    }

    public StylusHoverIconModifierElement(@k PointerIcon pointerIcon, boolean z11, @l DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        this.icon = pointerIcon;
        this.overrideDescendants = z11;
        this.touchBoundsExpansion = dpTouchBoundsExpansion;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public StylusHoverIconModifierNode create() {
        return new StylusHoverIconModifierNode(this.icon, this.overrideDescendants, this.touchBoundsExpansion);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k StylusHoverIconModifierNode stylusHoverIconModifierNode) {
        stylusHoverIconModifierNode.setIcon(this.icon);
        stylusHoverIconModifierNode.setOverrideDescendants(this.overrideDescendants);
        stylusHoverIconModifierNode.setDpTouchBoundsExpansion(this.touchBoundsExpansion);
    }
}
