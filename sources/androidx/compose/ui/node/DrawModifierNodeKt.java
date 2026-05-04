package androidx.compose.ui.node;

import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDrawModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifierNode.kt\nandroidx/compose/ui/node/DrawModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,44:1\n79#2:45\n*S KotlinDebug\n*F\n+ 1 DrawModifierNode.kt\nandroidx/compose/ui/node/DrawModifierNodeKt\n*L\n41#1:45\n*E\n"})
/* loaded from: classes2.dex */
public final class DrawModifierNodeKt {
    public static final void invalidateDraw(@k DrawModifierNode drawModifierNode) {
        if (drawModifierNode.getNode().isAttached()) {
            DelegatableNodeKt.m3979requireCoordinator64DMado(drawModifierNode, NodeKind.m4118constructorimpl(1)).invalidateLayer();
        }
    }
}
