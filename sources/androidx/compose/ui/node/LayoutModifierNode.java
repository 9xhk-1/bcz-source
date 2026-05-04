package androidx.compose.ui.node;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface LayoutModifierNode extends DelegatableNode {
    default int maxIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui_release(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode$maxIntrinsicHeight$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s, reason: not valid java name */
            public final MeasureResult mo4024measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j11) {
                return LayoutModifierNode.this.mo61measure3p2s80s(measureScope, measurable, j11);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i11);
    }

    default int maxIntrinsicWidth(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui_release(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode$maxIntrinsicWidth$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo4024measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j11) {
                return LayoutModifierNode.this.mo61measure3p2s80s(measureScope, measurable, j11);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i11);
    }

    @k
    /* renamed from: measure-3p2s80s */
    MeasureResult mo61measure3p2s80s(@k MeasureScope measureScope, @k Measurable measurable, long j11);

    default int minIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return NodeMeasuringIntrinsics.INSTANCE.minHeight$ui_release(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode$minIntrinsicHeight$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo4024measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j11) {
                return LayoutModifierNode.this.mo61measure3p2s80s(measureScope, measurable, j11);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i11);
    }

    default int minIntrinsicWidth(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return NodeMeasuringIntrinsics.INSTANCE.minWidth$ui_release(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode$minIntrinsicWidth$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo4024measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j11) {
                return LayoutModifierNode.this.mo61measure3p2s80s(measureScope, measurable, j11);
            }
        }, intrinsicMeasureScope, intrinsicMeasurable, i11);
    }
}
