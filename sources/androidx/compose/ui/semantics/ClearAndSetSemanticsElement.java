package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class ClearAndSetSemanticsElement extends ModifierNodeElement<CoreSemanticsModifierNode> implements SemanticsModifier {
    public static final int $stable = 0;

    @k
    private final l<SemanticsPropertyReceiver, g2> properties;

    /* JADX WARN: Multi-variable type inference failed */
    public ClearAndSetSemanticsElement(@k l<? super SemanticsPropertyReceiver, g2> lVar) {
        this.properties = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClearAndSetSemanticsElement copy$default(ClearAndSetSemanticsElement clearAndSetSemanticsElement, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = clearAndSetSemanticsElement.properties;
        }
        return clearAndSetSemanticsElement.copy(lVar);
    }

    @k
    public final l<SemanticsPropertyReceiver, g2> component1() {
        return this.properties;
    }

    @k
    public final ClearAndSetSemanticsElement copy(@k l<? super SemanticsPropertyReceiver, g2> lVar) {
        return new ClearAndSetSemanticsElement(lVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClearAndSetSemanticsElement) && g0.g(this.properties, ((ClearAndSetSemanticsElement) obj).properties);
    }

    @k
    public final l<SemanticsPropertyReceiver, g2> getProperties() {
        return this.properties;
    }

    @Override // androidx.compose.ui.semantics.SemanticsModifier
    @k
    public SemanticsConfiguration getSemanticsConfiguration() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.setMergingSemanticsOfDescendants(false);
        semanticsConfiguration.setClearingSemantics(true);
        this.properties.invoke(semanticsConfiguration);
        return semanticsConfiguration;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.properties.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("clearAndSetSemantics");
        SemanticsModifierKt.addSemanticsPropertiesFrom(inspectorInfo, getSemanticsConfiguration());
    }

    @k
    public String toString() {
        return "ClearAndSetSemanticsElement(properties=" + this.properties + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public CoreSemanticsModifierNode create() {
        return new CoreSemanticsModifierNode(false, true, this.properties);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k CoreSemanticsModifierNode coreSemanticsModifierNode) {
        coreSemanticsModifierNode.setProperties(this.properties);
    }
}
