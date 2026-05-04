package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class AlignmentLineOffsetTextUnitElement extends ModifierNodeElement<AlignmentLineOffsetTextUnitNode> {
    private final long after;

    @m80.k
    private final AlignmentLine alignmentLine;
    private final long before;

    @m80.k
    private final l<InspectorInfo, g2> inspectorInfo;

    public /* synthetic */ AlignmentLineOffsetTextUnitElement(AlignmentLine alignmentLine, long j11, long j12, l lVar, v vVar) {
        this(alignmentLine, j11, j12, lVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        AlignmentLineOffsetTextUnitElement alignmentLineOffsetTextUnitElement = obj instanceof AlignmentLineOffsetTextUnitElement ? (AlignmentLineOffsetTextUnitElement) obj : null;
        return alignmentLineOffsetTextUnitElement != null && g0.g(this.alignmentLine, alignmentLineOffsetTextUnitElement.alignmentLine) && TextUnit.m5306equalsimpl0(this.before, alignmentLineOffsetTextUnitElement.before) && TextUnit.m5306equalsimpl0(this.after, alignmentLineOffsetTextUnitElement.after);
    }

    /* renamed from: getAfter-XSAIIZE, reason: not valid java name */
    public final long m591getAfterXSAIIZE() {
        return this.after;
    }

    @m80.k
    public final AlignmentLine getAlignmentLine() {
        return this.alignmentLine;
    }

    /* renamed from: getBefore-XSAIIZE, reason: not valid java name */
    public final long m592getBeforeXSAIIZE() {
        return this.before;
    }

    @m80.k
    public final l<InspectorInfo, g2> getInspectorInfo() {
        return this.inspectorInfo;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.alignmentLine.hashCode() * 31) + TextUnit.m5310hashCodeimpl(this.before)) * 31) + TextUnit.m5310hashCodeimpl(this.after);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AlignmentLineOffsetTextUnitElement(AlignmentLine alignmentLine, long j11, long j12, l<? super InspectorInfo, g2> lVar) {
        this.alignmentLine = alignmentLine;
        this.before = j11;
        this.after = j12;
        this.inspectorInfo = lVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public AlignmentLineOffsetTextUnitNode create() {
        return new AlignmentLineOffsetTextUnitNode(this.alignmentLine, this.before, this.after, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k AlignmentLineOffsetTextUnitNode alignmentLineOffsetTextUnitNode) {
        alignmentLineOffsetTextUnitNode.setAlignmentLine(this.alignmentLine);
        alignmentLineOffsetTextUnitNode.m596setBeforeR2X_6o(this.before);
        alignmentLineOffsetTextUnitNode.m595setAfterR2X_6o(this.after);
    }
}
