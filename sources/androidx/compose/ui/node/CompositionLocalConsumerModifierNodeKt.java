package androidx.compose.ui.node;

import androidx.compose.runtime.CompositionLocal;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCompositionLocalConsumerModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionLocalConsumerModifierNode.kt\nandroidx/compose/ui/node/CompositionLocalConsumerModifierNodeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,77:1\n56#2,5:78\n*S KotlinDebug\n*F\n+ 1 CompositionLocalConsumerModifierNode.kt\nandroidx/compose/ui/node/CompositionLocalConsumerModifierNodeKt\n*L\n72#1:78,5\n*E\n"})
/* loaded from: classes2.dex */
public final class CompositionLocalConsumerModifierNodeKt {
    public static final <T> T currentValueOf(@k CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode, @k CompositionLocal<T> compositionLocal) {
        if (!compositionLocalConsumerModifierNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        return (T) DelegatableNodeKt.requireLayoutNode(compositionLocalConsumerModifierNode).getCompositionLocalMap().get(compositionLocal);
    }
}
