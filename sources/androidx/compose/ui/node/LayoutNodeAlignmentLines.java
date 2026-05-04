package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.AlignmentLine;
import java.util.Map;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class LayoutNodeAlignmentLines extends AlignmentLines {
    public static final int $stable = 0;

    public LayoutNodeAlignmentLines(@k AlignmentLinesOwner alignmentLinesOwner) {
        super(alignmentLinesOwner, null);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    /* renamed from: calculatePositionInParent-R5De75A */
    public long mo3964calculatePositionInParentR5De75A(@k NodeCoordinator nodeCoordinator, long j11) {
        return NodeCoordinator.m4096toParentPosition8S9VItk$default(nodeCoordinator, j11, false, 2, null);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    @k
    public Map<AlignmentLine, Integer> getAlignmentLinesMap(@k NodeCoordinator nodeCoordinator) {
        return nodeCoordinator.getMeasureResult$ui_release().getAlignmentLines();
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    public int getPositionFor(@k NodeCoordinator nodeCoordinator, @k AlignmentLine alignmentLine) {
        return nodeCoordinator.get(alignmentLine);
    }
}
