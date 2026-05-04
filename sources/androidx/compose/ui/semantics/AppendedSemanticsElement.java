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
public final class AppendedSemanticsElement extends ModifierNodeElement<CoreSemanticsModifierNode> implements SemanticsModifier {
    public static final int $stable = 0;
    private final boolean mergeDescendants;

    @k
    private final l<SemanticsPropertyReceiver, g2> properties;

    /* JADX WARN: Multi-variable type inference failed */
    public AppendedSemanticsElement(boolean z11, @k l<? super SemanticsPropertyReceiver, g2> lVar) {
        this.mergeDescendants = z11;
        this.properties = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppendedSemanticsElement copy$default(AppendedSemanticsElement appendedSemanticsElement, boolean z11, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = appendedSemanticsElement.mergeDescendants;
        }
        if ((i11 & 2) != 0) {
            lVar = appendedSemanticsElement.properties;
        }
        return appendedSemanticsElement.copy(z11, lVar);
    }

    public final boolean component1() {
        return this.mergeDescendants;
    }

    @k
    public final l<SemanticsPropertyReceiver, g2> component2() {
        return this.properties;
    }

    @k
    public final AppendedSemanticsElement copy(boolean z11, @k l<? super SemanticsPropertyReceiver, g2> lVar) {
        return new AppendedSemanticsElement(z11, lVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.mergeDescendants == appendedSemanticsElement.mergeDescendants && g0.g(this.properties, appendedSemanticsElement.properties);
    }

    public final boolean getMergeDescendants() {
        return this.mergeDescendants;
    }

    @k
    public final l<SemanticsPropertyReceiver, g2> getProperties() {
        return this.properties;
    }

    @Override // androidx.compose.ui.semantics.SemanticsModifier
    @k
    public SemanticsConfiguration getSemanticsConfiguration() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.setMergingSemanticsOfDescendants(this.mergeDescendants);
        this.properties.invoke(semanticsConfiguration);
        return semanticsConfiguration;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (Boolean.hashCode(this.mergeDescendants) * 31) + this.properties.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("semantics");
        inspectorInfo.getProperties().set("mergeDescendants", Boolean.valueOf(this.mergeDescendants));
        SemanticsModifierKt.addSemanticsPropertiesFrom(inspectorInfo, getSemanticsConfiguration());
    }

    @k
    public String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.mergeDescendants + ", properties=" + this.properties + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public CoreSemanticsModifierNode create() {
        return new CoreSemanticsModifierNode(this.mergeDescendants, false, this.properties);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k CoreSemanticsModifierNode coreSemanticsModifierNode) {
        coreSemanticsModifierNode.setMergeDescendants(this.mergeDescendants);
        coreSemanticsModifierNode.setProperties(this.properties);
    }
}
