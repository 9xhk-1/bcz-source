package androidx.compose.ui.node;

import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPointerInputModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputModifierNode.kt\nandroidx/compose/ui/node/PointerInputModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,136:1\n95#2:137\n*S KotlinDebug\n*F\n+ 1 PointerInputModifierNode.kt\nandroidx/compose/ui/node/PointerInputModifierNodeKt\n*L\n135#1:137\n*E\n"})
/* loaded from: classes2.dex */
public final class PointerInputModifierNodeKt {
    @k
    public static final LayoutCoordinates getLayoutCoordinates(@k PointerInputModifierNode pointerInputModifierNode) {
        return DelegatableNodeKt.m3979requireCoordinator64DMado(pointerInputModifierNode, NodeKind.m4118constructorimpl(16));
    }

    public static final boolean isAttached(@k PointerInputModifierNode pointerInputModifierNode) {
        return pointerInputModifierNode.getNode().isAttached();
    }
}
