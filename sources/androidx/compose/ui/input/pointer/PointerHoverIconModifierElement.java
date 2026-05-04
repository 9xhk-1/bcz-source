package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class PointerHoverIconModifierElement extends ModifierNodeElement<PointerHoverIconModifierNode> {
    public static final int $stable = 0;

    @k
    private final PointerIcon icon;
    private final boolean overrideDescendants;

    public /* synthetic */ PointerHoverIconModifierElement(PointerIcon pointerIcon, boolean z11, int i11, v vVar) {
        this(pointerIcon, (i11 & 2) != 0 ? false : z11);
    }

    public static /* synthetic */ PointerHoverIconModifierElement copy$default(PointerHoverIconModifierElement pointerHoverIconModifierElement, PointerIcon pointerIcon, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            pointerIcon = pointerHoverIconModifierElement.icon;
        }
        if ((i11 & 2) != 0) {
            z11 = pointerHoverIconModifierElement.overrideDescendants;
        }
        return pointerHoverIconModifierElement.copy(pointerIcon, z11);
    }

    @k
    public final PointerIcon component1() {
        return this.icon;
    }

    public final boolean component2() {
        return this.overrideDescendants;
    }

    @k
    public final PointerHoverIconModifierElement copy(@k PointerIcon pointerIcon, boolean z11) {
        return new PointerHoverIconModifierElement(pointerIcon, z11);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        PointerHoverIconModifierElement pointerHoverIconModifierElement = (PointerHoverIconModifierElement) obj;
        return g0.g(this.icon, pointerHoverIconModifierElement.icon) && this.overrideDescendants == pointerHoverIconModifierElement.overrideDescendants;
    }

    @k
    public final PointerIcon getIcon() {
        return this.icon;
    }

    public final boolean getOverrideDescendants() {
        return this.overrideDescendants;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.icon.hashCode() * 31) + Boolean.hashCode(this.overrideDescendants);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("pointerHoverIcon");
        inspectorInfo.getProperties().set("icon", this.icon);
        inspectorInfo.getProperties().set("overrideDescendants", Boolean.valueOf(this.overrideDescendants));
    }

    @k
    public String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.icon + ", overrideDescendants=" + this.overrideDescendants + ')';
    }

    public PointerHoverIconModifierElement(@k PointerIcon pointerIcon, boolean z11) {
        this.icon = pointerIcon;
        this.overrideDescendants = z11;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public PointerHoverIconModifierNode create() {
        return new PointerHoverIconModifierNode(this.icon, this.overrideDescendants);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k PointerHoverIconModifierNode pointerHoverIconModifierNode) {
        pointerHoverIconModifierNode.setIcon(this.icon);
        pointerHoverIconModifierNode.setOverrideDescendants(this.overrideDescendants);
    }
}
