package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.unit.IntOffset;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nLayoutNodeAlignmentLines.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/LookaheadAlignmentLines\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,227:1\n159#2:228\n30#3:229\n53#4,3:230\n*S KotlinDebug\n*F\n+ 1 LayoutNodeAlignmentLines.kt\nandroidx/compose/ui/node/LookaheadAlignmentLines\n*L\n225#1:228\n225#1:229\n225#1:230,3\n*E\n"})
/* loaded from: classes2.dex */
public final class LookaheadAlignmentLines extends AlignmentLines {
    public static final int $stable = 0;

    public LookaheadAlignmentLines(@k AlignmentLinesOwner alignmentLinesOwner) {
        super(alignmentLinesOwner, null);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    /* renamed from: calculatePositionInParent-R5De75A */
    public long mo3964calculatePositionInParentR5De75A(@k NodeCoordinator nodeCoordinator, long j11) {
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        g0.m(lookaheadDelegate);
        long mo4052getPositionnOccac = lookaheadDelegate.mo4052getPositionnOccac();
        float m5243getXimpl = IntOffset.m5243getXimpl(mo4052getPositionnOccac);
        float m5244getYimpl = IntOffset.m5244getYimpl(mo4052getPositionnOccac);
        return Offset.m2273plusMKHz9U(Offset.m2260constructorimpl((Float.floatToRawIntBits(m5243getXimpl) << 32) | (Float.floatToRawIntBits(m5244getYimpl) & 4294967295L)), j11);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    @k
    public Map<AlignmentLine, Integer> getAlignmentLinesMap(@k NodeCoordinator nodeCoordinator) {
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        g0.m(lookaheadDelegate);
        return lookaheadDelegate.getMeasureResult$ui_release().getAlignmentLines();
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    public int getPositionFor(@k NodeCoordinator nodeCoordinator, @k AlignmentLine alignmentLine) {
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        g0.m(lookaheadDelegate);
        return lookaheadDelegate.get(alignmentLine);
    }
}
