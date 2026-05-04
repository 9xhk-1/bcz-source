package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSemanticsModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsModifierNode.kt\nandroidx/compose/ui/node/SemanticsModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,122:1\n91#2:123\n91#2:124\n*S KotlinDebug\n*F\n+ 1 SemanticsModifierNode.kt\nandroidx/compose/ui/node/SemanticsModifierNodeKt\n*L\n117#1:123\n120#1:124\n*E\n"})
/* loaded from: classes2.dex */
public final class SemanticsModifierNodeKt {
    public static final boolean getUseMinimumTouchTarget(@k SemanticsConfiguration semanticsConfiguration) {
        return SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsActions.INSTANCE.getOnClick()) != null;
    }

    public static final void invalidateSemantics(@k SemanticsModifierNode semanticsModifierNode) {
        DelegatableNodeKt.requireLayoutNode(semanticsModifierNode).invalidateSemantics$ui_release();
    }

    @k
    public static final Rect touchBoundsInRoot(@k Modifier.Node node, boolean z11) {
        return !node.getNode().isAttached() ? Rect.Companion.getZero() : !z11 ? LayoutCoordinatesKt.boundsInRoot(DelegatableNodeKt.m3979requireCoordinator64DMado(node, NodeKind.m4118constructorimpl(8))) : DelegatableNodeKt.m3979requireCoordinator64DMado(node, NodeKind.m4118constructorimpl(8)).touchBoundsInRoot();
    }
}
