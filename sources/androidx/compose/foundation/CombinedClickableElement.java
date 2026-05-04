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
final class CombinedClickableElement extends ModifierNodeElement<CombinedClickableNode> {
    private final boolean enabled;
    private final boolean hapticFeedbackEnabled;

    @l
    private final IndicationNodeFactory indicationNodeFactory;

    @l
    private final MutableInteractionSource interactionSource;

    @m80.k
    private final x00.a<g2> onClick;

    @l
    private final String onClickLabel;

    @l
    private final x00.a<g2> onDoubleClick;

    @l
    private final x00.a<g2> onLongClick;

    @l
    private final String onLongClickLabel;

    @l
    private final Role role;

    public /* synthetic */ CombinedClickableElement(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z11, String str, Role role, x00.a aVar, String str2, x00.a aVar2, x00.a aVar3, boolean z12, v vVar) {
        this(mutableInteractionSource, indicationNodeFactory, z11, str, role, aVar, str2, aVar2, aVar3, z12);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return g0.g(this.interactionSource, combinedClickableElement.interactionSource) && g0.g(this.indicationNodeFactory, combinedClickableElement.indicationNodeFactory) && this.enabled == combinedClickableElement.enabled && g0.g(this.onClickLabel, combinedClickableElement.onClickLabel) && g0.g(this.role, combinedClickableElement.role) && this.onClick == combinedClickableElement.onClick && g0.g(this.onLongClickLabel, combinedClickableElement.onLongClickLabel) && this.onLongClick == combinedClickableElement.onLongClick && this.onDoubleClick == combinedClickableElement.onDoubleClick && this.hapticFeedbackEnabled == combinedClickableElement.hapticFeedbackEnabled;
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
        int m4320hashCodeimpl = (((hashCode3 + (role != null ? Role.m4320hashCodeimpl(role.m4322unboximpl()) : 0)) * 31) + this.onClick.hashCode()) * 31;
        String str2 = this.onLongClickLabel;
        int hashCode4 = (m4320hashCodeimpl + (str2 != null ? str2.hashCode() : 0)) * 31;
        x00.a<g2> aVar = this.onLongClick;
        int hashCode5 = (hashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        x00.a<g2> aVar2 = this.onDoubleClick;
        return ((hashCode5 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31) + Boolean.hashCode(this.hapticFeedbackEnabled);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("combinedClickable");
        inspectorInfo.getProperties().set("indicationNodeFactory", this.indicationNodeFactory);
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set(c3.f2342e, Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set("onClickLabel", this.onClickLabel);
        inspectorInfo.getProperties().set("role", this.role);
        inspectorInfo.getProperties().set("onClick", this.onClick);
        inspectorInfo.getProperties().set("onDoubleClick", this.onDoubleClick);
        inspectorInfo.getProperties().set("onLongClick", this.onLongClick);
        inspectorInfo.getProperties().set("onLongClickLabel", this.onLongClickLabel);
        inspectorInfo.getProperties().set("hapticFeedbackEnabled", Boolean.valueOf(this.hapticFeedbackEnabled));
    }

    private CombinedClickableElement(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z11, String str, Role role, x00.a<g2> aVar, String str2, x00.a<g2> aVar2, x00.a<g2> aVar3, boolean z12) {
        this.interactionSource = mutableInteractionSource;
        this.indicationNodeFactory = indicationNodeFactory;
        this.enabled = z11;
        this.onClickLabel = str;
        this.role = role;
        this.onClick = aVar;
        this.onLongClickLabel = str2;
        this.onLongClick = aVar2;
        this.onDoubleClick = aVar3;
        this.hapticFeedbackEnabled = z12;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public CombinedClickableNode create() {
        return new CombinedClickableNode(this.onClick, this.onLongClickLabel, this.onLongClick, this.onDoubleClick, this.hapticFeedbackEnabled, this.interactionSource, this.indicationNodeFactory, this.enabled, this.onClickLabel, this.role, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k CombinedClickableNode combinedClickableNode) {
        combinedClickableNode.setHapticFeedbackEnabled(this.hapticFeedbackEnabled);
        combinedClickableNode.m284updatenSzSaCc(this.onClick, this.onLongClickLabel, this.onLongClick, this.onDoubleClick, this.interactionSource, this.indicationNodeFactory, this.enabled, this.onClickLabel, this.role);
    }
}
