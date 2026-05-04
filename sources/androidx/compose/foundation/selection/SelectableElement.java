package androidx.compose.foundation.selection;

import a90.c3;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class SelectableElement extends ModifierNodeElement<SelectableNode> {
    private final boolean enabled;

    @l
    private final IndicationNodeFactory indicationNodeFactory;

    @l
    private final MutableInteractionSource interactionSource;

    @k
    private final a<g2> onClick;

    @l
    private final Role role;
    private final boolean selected;

    public /* synthetic */ SelectableElement(boolean z11, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z12, Role role, a aVar, v vVar) {
        this(z11, mutableInteractionSource, indicationNodeFactory, z12, role, aVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.selected == selectableElement.selected && g0.g(this.interactionSource, selectableElement.interactionSource) && g0.g(this.indicationNodeFactory, selectableElement.indicationNodeFactory) && this.enabled == selectableElement.enabled && g0.g(this.role, selectableElement.role) && this.onClick == selectableElement.onClick;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = Boolean.hashCode(this.selected) * 31;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        int hashCode2 = (hashCode + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31;
        IndicationNodeFactory indicationNodeFactory = this.indicationNodeFactory;
        int hashCode3 = (((hashCode2 + (indicationNodeFactory != null ? indicationNodeFactory.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        Role role = this.role;
        return ((hashCode3 + (role != null ? Role.m4320hashCodeimpl(role.m4322unboximpl()) : 0)) * 31) + this.onClick.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("selectable");
        inspectorInfo.getProperties().set("selected", Boolean.valueOf(this.selected));
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("indicationNodeFactory", this.indicationNodeFactory);
        inspectorInfo.getProperties().set(c3.f2342e, Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set("role", this.role);
        inspectorInfo.getProperties().set("onClick", this.onClick);
    }

    private SelectableElement(boolean z11, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z12, Role role, a<g2> aVar) {
        this.selected = z11;
        this.interactionSource = mutableInteractionSource;
        this.indicationNodeFactory = indicationNodeFactory;
        this.enabled = z12;
        this.role = role;
        this.onClick = aVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public SelectableNode create() {
        return new SelectableNode(this.selected, this.interactionSource, this.indicationNodeFactory, this.enabled, this.role, this.onClick, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k SelectableNode selectableNode) {
        selectableNode.m991updateQzZPfjk(this.selected, this.interactionSource, this.indicationNodeFactory, this.enabled, this.role, this.onClick);
    }
}
