package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Overscroll.kt\nandroidx/compose/foundation/OverscrollModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,397:1\n1#2:398\n*E\n"})
/* loaded from: classes.dex */
final class OverscrollModifierNode extends DelegatingNode {

    @l
    private DelegatableNode overscrollNode;

    public OverscrollModifierNode(@l DelegatableNode delegatableNode) {
        this.overscrollNode = delegatableNode;
    }

    private final void attachIfNeeded() {
        DelegatableNode delegatableNode;
        Modifier.Node node;
        DelegatableNode delegatableNode2 = this.overscrollNode;
        if (delegatableNode2 == null || (node = delegatableNode2.getNode()) == null || node.isAttached()) {
            delegatableNode = null;
        } else {
            DelegatableNode delegatableNode3 = this.overscrollNode;
            g0.m(delegatableNode3);
            delegatableNode = delegate(delegatableNode3);
        }
        this.overscrollNode = delegatableNode;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        attachIfNeeded();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        DelegatableNode delegatableNode = this.overscrollNode;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
    }

    public final void update(@l DelegatableNode delegatableNode) {
        DelegatableNode delegatableNode2 = this.overscrollNode;
        if (delegatableNode2 != null) {
            undelegate(delegatableNode2);
        }
        this.overscrollNode = delegatableNode;
        attachIfNeeded();
    }
}
