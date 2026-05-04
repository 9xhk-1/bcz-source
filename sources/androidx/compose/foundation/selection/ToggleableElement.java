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
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class ToggleableElement extends ModifierNodeElement<ToggleableNode> {
    private final boolean enabled;

    @l
    private final IndicationNodeFactory indicationNodeFactory;

    @l
    private final MutableInteractionSource interactionSource;

    @k
    private final x00.l<Boolean, g2> onValueChange;

    @l
    private final Role role;
    private final boolean value;

    public /* synthetic */ ToggleableElement(boolean z11, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z12, Role role, x00.l lVar, v vVar) {
        this(z11, mutableInteractionSource, indicationNodeFactory, z12, role, lVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ToggleableElement.class != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        return this.value == toggleableElement.value && g0.g(this.interactionSource, toggleableElement.interactionSource) && g0.g(this.indicationNodeFactory, toggleableElement.indicationNodeFactory) && this.enabled == toggleableElement.enabled && g0.g(this.role, toggleableElement.role) && this.onValueChange == toggleableElement.onValueChange;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = Boolean.hashCode(this.value) * 31;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        int hashCode2 = (hashCode + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31;
        IndicationNodeFactory indicationNodeFactory = this.indicationNodeFactory;
        int hashCode3 = (((hashCode2 + (indicationNodeFactory != null ? indicationNodeFactory.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        Role role = this.role;
        return ((hashCode3 + (role != null ? Role.m4320hashCodeimpl(role.m4322unboximpl()) : 0)) * 31) + this.onValueChange.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("toggleable");
        inspectorInfo.getProperties().set("value", inspectorInfo.getValue());
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("indicationNodeFactory", this.indicationNodeFactory);
        inspectorInfo.getProperties().set(c3.f2342e, Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set("role", this.role);
        inspectorInfo.getProperties().set("onValueChange", this.onValueChange);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ToggleableElement(boolean z11, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z12, Role role, x00.l<? super Boolean, g2> lVar) {
        this.value = z11;
        this.interactionSource = mutableInteractionSource;
        this.indicationNodeFactory = indicationNodeFactory;
        this.enabled = z12;
        this.role = role;
        this.onValueChange = lVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public ToggleableNode create() {
        return new ToggleableNode(this.value, this.interactionSource, this.indicationNodeFactory, this.enabled, this.role, this.onValueChange, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k ToggleableNode toggleableNode) {
        toggleableNode.m1000updateQzZPfjk(this.value, this.interactionSource, this.indicationNodeFactory, this.enabled, this.role, this.onValueChange);
    }
}
