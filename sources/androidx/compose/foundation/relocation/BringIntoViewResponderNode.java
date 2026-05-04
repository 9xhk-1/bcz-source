package androidx.compose.foundation.relocation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.relocation.BringIntoViewModifierNode;
import c40.s0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nBringIntoViewResponder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewResponder.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponderNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"})
/* loaded from: classes.dex */
public final class BringIntoViewResponderNode extends Modifier.Node implements BringIntoViewModifierNode, LayoutAwareModifierNode {
    public static final int $stable = 8;
    private boolean hasBeenPlaced;

    @k
    private BringIntoViewResponder responder;
    private final boolean shouldAutoInvalidate;

    public BringIntoViewResponderNode(@k BringIntoViewResponder bringIntoViewResponder) {
        this.responder = bringIntoViewResponder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect bringIntoView$localRect(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, a<Rect> aVar) {
        Rect invoke;
        Rect localRectOf$BringIntoViewRequesterKt__BringIntoViewResponderKt;
        if (!bringIntoViewResponderNode.isAttached() || !bringIntoViewResponderNode.hasBeenPlaced) {
            return null;
        }
        LayoutCoordinates requireLayoutCoordinates = DelegatableNodeKt.requireLayoutCoordinates(bringIntoViewResponderNode);
        if (!layoutCoordinates.isAttached()) {
            layoutCoordinates = null;
        }
        if (layoutCoordinates == null || (invoke = aVar.invoke()) == null) {
            return null;
        }
        localRectOf$BringIntoViewRequesterKt__BringIntoViewResponderKt = BringIntoViewRequesterKt__BringIntoViewResponderKt.localRectOf$BringIntoViewRequesterKt__BringIntoViewResponderKt(requireLayoutCoordinates, layoutCoordinates, invoke);
        return localRectOf$BringIntoViewRequesterKt__BringIntoViewResponderKt;
    }

    @Override // androidx.compose.ui.relocation.BringIntoViewModifierNode
    @l
    public Object bringIntoView(@k final LayoutCoordinates layoutCoordinates, @k final a<Rect> aVar, @k c<? super g2> cVar) {
        Object g11 = s0.g(new BringIntoViewResponderNode$bringIntoView$2(this, layoutCoordinates, aVar, new a<Rect>() { // from class: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$parentRect$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Rect invoke() {
                Rect bringIntoView$localRect;
                bringIntoView$localRect = BringIntoViewResponderNode.bringIntoView$localRect(BringIntoViewResponderNode.this, layoutCoordinates, aVar);
                if (bringIntoView$localRect != null) {
                    return BringIntoViewResponderNode.this.getResponder().calculateRectForParent(bringIntoView$localRect);
                }
                return null;
            }
        }, null), cVar);
        return g11 == b.l() ? g11 : g2.f100423a;
    }

    @k
    public final BringIntoViewResponder getResponder() {
        return this.responder;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(@k LayoutCoordinates layoutCoordinates) {
        this.hasBeenPlaced = true;
    }

    public final void setResponder(@k BringIntoViewResponder bringIntoViewResponder) {
        this.responder = bringIntoViewResponder;
    }
}
