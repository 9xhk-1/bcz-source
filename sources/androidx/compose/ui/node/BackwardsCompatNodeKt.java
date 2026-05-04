package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class BackwardsCompatNodeKt {

    @k
    private static final BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1 DetachedModifierLocalReadScope = new ModifierLocalReadScope() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1
        @Override // androidx.compose.ui.modifier.ModifierLocalReadScope
        public <T> T getCurrent(ModifierLocal<T> modifierLocal) {
            return modifierLocal.getDefaultFactory$ui_release().invoke();
        }
    };

    @k
    private static final l<BackwardsCompatNode, g2> onDrawCacheReadsChanged = new l<BackwardsCompatNode, g2>() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$onDrawCacheReadsChanged$1
        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(BackwardsCompatNode backwardsCompatNode) {
            invoke2(backwardsCompatNode);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(BackwardsCompatNode backwardsCompatNode) {
            backwardsCompatNode.onDrawCacheReadsChanged$ui_release();
        }
    };

    @k
    private static final l<BackwardsCompatNode, g2> updateModifierLocalConsumer = new l<BackwardsCompatNode, g2>() { // from class: androidx.compose.ui.node.BackwardsCompatNodeKt$updateModifierLocalConsumer$1
        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(BackwardsCompatNode backwardsCompatNode) {
            invoke2(backwardsCompatNode);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(BackwardsCompatNode backwardsCompatNode) {
            backwardsCompatNode.updateModifierLocalConsumer();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isChainUpdate(BackwardsCompatNode backwardsCompatNode) {
        Modifier.Node tail$ui_release = DelegatableNodeKt.requireLayoutNode(backwardsCompatNode).getNodes$ui_release().getTail$ui_release();
        g0.n(tail$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return ((TailModifierNode) tail$ui_release).getAttachHasBeenRun();
    }
}
