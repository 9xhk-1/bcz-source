package androidx.compose.ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FocusRestorerNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, FocusPropertiesModifierNode, FocusRequesterModifierNode {
    public static final int $stable = 8;

    @k
    private FocusRequester fallback;

    @l
    private PinnableContainer.PinnedHandle pinnedHandle;

    @k
    private final x00.l<FocusEnterExitScope, g2> onExit = new x00.l<FocusEnterExitScope, g2>() { // from class: androidx.compose.ui.focus.FocusRestorerNode$onExit$1
        {
            super(1);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(FocusEnterExitScope focusEnterExitScope) {
            invoke2(focusEnterExitScope);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FocusEnterExitScope focusEnterExitScope) {
            PinnableContainer.PinnedHandle pinnedHandle;
            FocusRequesterModifierNodeKt.saveFocusedChild(FocusRestorerNode.this);
            pinnedHandle = FocusRestorerNode.this.pinnedHandle;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            FocusRestorerNode focusRestorerNode = FocusRestorerNode.this;
            focusRestorerNode.pinnedHandle = FocusRequesterModifierNodeKt.pinFocusedChild(focusRestorerNode);
        }
    };

    @k
    private final x00.l<FocusEnterExitScope, g2> onEnter = new x00.l<FocusEnterExitScope, g2>() { // from class: androidx.compose.ui.focus.FocusRestorerNode$onEnter$1
        {
            super(1);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(FocusEnterExitScope focusEnterExitScope) {
            invoke2(focusEnterExitScope);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FocusEnterExitScope focusEnterExitScope) {
            PinnableContainer.PinnedHandle pinnedHandle;
            pinnedHandle = FocusRestorerNode.this.pinnedHandle;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            FocusRestorerNode.this.pinnedHandle = null;
            if (FocusRequesterModifierNodeKt.restoreFocusedChild(FocusRestorerNode.this)) {
                return;
            }
            FocusRequester fallback = FocusRestorerNode.this.getFallback();
            FocusRequester.Companion companion = FocusRequester.Companion;
            if (g0.g(fallback, companion.getDefault())) {
                return;
            }
            if (g0.g(FocusRestorerNode.this.getFallback(), companion.getCancel())) {
                focusEnterExitScope.cancelFocusChange();
            } else {
                FocusRequester.m2179requestFocus3ESFkO8$default(FocusRestorerNode.this.getFallback(), 0, 1, null);
            }
        }
    };

    public FocusRestorerNode(@k FocusRequester focusRequester) {
        this.fallback = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(@k FocusProperties focusProperties) {
        focusProperties.setOnEnter(this.onEnter);
        focusProperties.setOnExit(this.onExit);
    }

    @k
    public final FocusRequester getFallback() {
        return this.fallback;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        PinnableContainer.PinnedHandle pinnedHandle = this.pinnedHandle;
        if (pinnedHandle != null) {
            pinnedHandle.release();
        }
        this.pinnedHandle = null;
        super.onDetach();
    }

    public final void setFallback(@k FocusRequester focusRequester) {
        this.fallback = focusRequester;
    }
}
