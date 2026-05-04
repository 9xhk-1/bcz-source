package androidx.compose.foundation;

import a90.c3;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class ClickableElement extends ModifierNodeElement<ClickableNode> {
    private final boolean enabled;

    @l
    private final IndicationNodeFactory indicationNodeFactory;

    @l
    private final MutableInteractionSource interactionSource;

    @m80.k
    private final x00.a<g2> onClick;

    @l
    private final String onClickLabel;

    @l
    private final Role role;

    public /* synthetic */ ClickableElement(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z11, String str, Role role, x00.a aVar, v vVar) {
        this(mutableInteractionSource, indicationNodeFactory, z11, str, role, aVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return g0.g(this.interactionSource, clickableElement.interactionSource) && g0.g(this.indicationNodeFactory, clickableElement.indicationNodeFactory) && this.enabled == clickableElement.enabled && g0.g(this.onClickLabel, clickableElement.onClickLabel) && g0.g(this.role, clickableElement.role) && this.onClick == clickableElement.onClick;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        int hashCode = (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0) * 31;
        IndicationNodeFactory indicationNodeFactory = this.indicationNodeFactory;
        int hashCode2 = (((hashCode + (indicationNodeFactory != null ? indicationNodeFactory.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        String str = this.onClickLabel;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Role role = this.role;
        return ((hashCode3 + (role != null ? Role.m4320hashCodeimpl(role.m4322unboximpl()) : 0)) * 31) + this.onClick.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("clickable");
        inspectorInfo.getProperties().set(c3.f2342e, Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set("onClick", this.onClick);
        inspectorInfo.getProperties().set("onClickLabel", this.onClickLabel);
        inspectorInfo.getProperties().set("role", this.role);
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("indicationNodeFactory", this.indicationNodeFactory);
    }

    private ClickableElement(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z11, String str, Role role, x00.a<g2> aVar) {
        this.interactionSource = mutableInteractionSource;
        this.indicationNodeFactory = indicationNodeFactory;
        this.enabled = z11;
        this.onClickLabel = str;
        this.role = role;
        this.onClick = aVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public ClickableNode create() {
        return new ClickableNode(this.interactionSource, this.indicationNodeFactory, this.enabled, this.onClickLabel, this.role, this.onClick, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k ClickableNode clickableNode) {
        clickableNode.m281updateQzZPfjk(this.interactionSource, this.indicationNodeFactory, this.enabled, this.onClickLabel, this.role, this.onClick);
    }
}
