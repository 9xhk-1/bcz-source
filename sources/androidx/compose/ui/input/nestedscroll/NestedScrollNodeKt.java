package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import kotlin.jvm.internal.Ref;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class NestedScrollNodeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends TraversableNode> T findNearestAttachedAncestor(T t11) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        TraversableNodeKt.traverseAncestors(t11, new l<T, Boolean>() { // from class: androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt$findNearestAttachedAncestor$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // x00.l
            public final Boolean invoke(TraversableNode traversableNode) {
                boolean z11;
                if (traversableNode.getNode().isAttached()) {
                    objectRef.element = traversableNode;
                    z11 = false;
                } else {
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            }
        });
        return (T) objectRef.element;
    }

    @k
    public static final DelegatableNode nestedScrollModifierNode(@k NestedScrollConnection nestedScrollConnection, @m80.l NestedScrollDispatcher nestedScrollDispatcher) {
        return new NestedScrollNode(nestedScrollConnection, nestedScrollDispatcher);
    }
}
