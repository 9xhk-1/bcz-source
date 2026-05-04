package androidx.compose.ui.node;

import android.view.View;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDelegatableNode.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatableNode.android.kt\nandroidx/compose/ui/node/DelegatableNode_androidKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,34:1\n56#2,5:35\n*S KotlinDebug\n*F\n+ 1 DelegatableNode.android.kt\nandroidx/compose/ui/node/DelegatableNode_androidKt\n*L\n29#1:35,5\n*E\n"})
/* loaded from: classes2.dex */
public final class DelegatableNode_androidKt {
    @k
    public static final View requireView(@k DelegatableNode delegatableNode) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("Cannot get View because the Modifier node is not currently attached.");
        }
        Object requireOwner = LayoutNodeKt.requireOwner(DelegatableNodeKt.requireLayoutNode(delegatableNode));
        g0.n(requireOwner, "null cannot be cast to non-null type android.view.View");
        return (View) requireOwner;
    }
}
