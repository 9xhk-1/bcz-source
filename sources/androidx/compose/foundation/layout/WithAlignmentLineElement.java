package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.SiblingsAlignedNode;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class WithAlignmentLineElement extends ModifierNodeElement<SiblingsAlignedNode.WithAlignmentLineNode> {
    public static final int $stable = 0;

    @m80.k
    private final AlignmentLine alignmentLine;

    public WithAlignmentLineElement(@m80.k AlignmentLine alignmentLine) {
        this.alignmentLine = alignmentLine;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        WithAlignmentLineElement withAlignmentLineElement = obj instanceof WithAlignmentLineElement ? (WithAlignmentLineElement) obj : null;
        if (withAlignmentLineElement == null) {
            return false;
        }
        return g0.g(this.alignmentLine, withAlignmentLineElement.alignmentLine);
    }

    @m80.k
    public final AlignmentLine getAlignmentLine() {
        return this.alignmentLine;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.alignmentLine.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("alignBy");
        inspectorInfo.setValue(this.alignmentLine);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public SiblingsAlignedNode.WithAlignmentLineNode create() {
        return new SiblingsAlignedNode.WithAlignmentLineNode(this.alignmentLine);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k SiblingsAlignedNode.WithAlignmentLineNode withAlignmentLineNode) {
        withAlignmentLineNode.setAlignmentLine(this.alignmentLine);
    }
}
