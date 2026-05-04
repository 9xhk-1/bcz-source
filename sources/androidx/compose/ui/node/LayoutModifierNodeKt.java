package androidx.compose.ui.node;

import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLayoutModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNode.kt\nandroidx/compose/ui/node/LayoutModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,398:1\n83#2:399\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNode.kt\nandroidx/compose/ui/node/LayoutModifierNodeKt\n*L\n117#1:399\n*E\n"})
/* loaded from: classes2.dex */
public final class LayoutModifierNodeKt {
    public static final void invalidateLayer(@k LayoutModifierNode layoutModifierNode) {
        DelegatableNodeKt.m3979requireCoordinator64DMado(layoutModifierNode, NodeKind.m4118constructorimpl(2)).invalidateLayer();
    }

    public static final void invalidateMeasurement(@k LayoutModifierNode layoutModifierNode) {
        DelegatableNodeKt.requireLayoutNode(layoutModifierNode).invalidateMeasurements$ui_release();
    }

    public static final void invalidatePlacement(@k LayoutModifierNode layoutModifierNode) {
        LayoutNode.requestRelayout$ui_release$default(DelegatableNodeKt.requireLayoutNode(layoutModifierNode), false, 1, null);
    }

    public static final void remeasureSync(@k LayoutModifierNode layoutModifierNode) {
        DelegatableNodeKt.requireLayoutNode(layoutModifierNode).forceRemeasure();
    }

    public static final void requestRemeasure(@k LayoutModifierNode layoutModifierNode) {
        LayoutNode.requestRemeasure$ui_release$default(DelegatableNodeKt.requireLayoutNode(layoutModifierNode), false, false, false, 7, null);
    }
}
