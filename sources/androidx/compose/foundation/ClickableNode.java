package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.semantics.Role;
import kotlin.jvm.internal.v;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public class ClickableNode extends AbstractClickableNode {
    public static final int $stable = 0;

    public /* synthetic */ ClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z11, String str, Role role, x00.a aVar, v vVar) {
        this(mutableInteractionSource, indicationNodeFactory, z11, str, role, aVar);
    }

    public static /* synthetic */ Object clickPointerInput$suspendImpl(final ClickableNode clickableNode, PointerInputScope pointerInputScope, j00.c<? super g2> cVar) {
        Object detectTapAndPress = TapGestureDetectorKt.detectTapAndPress(pointerInputScope, new ClickableNode$clickPointerInput$2(clickableNode, null), new l<Offset, g2>() { // from class: androidx.compose.foundation.ClickableNode$clickPointerInput$3
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Offset offset) {
                m283invokek4lQ0M(offset.m2278unboximpl());
                return g2.f100423a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m283invokek4lQ0M(long j11) {
                if (ClickableNode.this.getEnabled()) {
                    ClickableNode.this.getOnClick().invoke();
                }
            }
        }, cVar);
        return detectTapAndPress == kotlin.coroutines.intrinsics.b.l() ? detectTapAndPress : g2.f100423a;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    @m80.l
    public Object clickPointerInput(@m80.k PointerInputScope pointerInputScope, @m80.k j00.c<? super g2> cVar) {
        return clickPointerInput$suspendImpl(this, pointerInputScope, cVar);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* renamed from: onClickKeyDownEvent-ZmokQxo */
    public final boolean mo202onClickKeyDownEventZmokQxo(@m80.k KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* renamed from: onClickKeyUpEvent-ZmokQxo */
    public final boolean mo203onClickKeyUpEventZmokQxo(@m80.k KeyEvent keyEvent) {
        getOnClick().invoke();
        return true;
    }

    /* renamed from: update-QzZPfjk, reason: not valid java name */
    public final void m281updateQzZPfjk(@m80.l MutableInteractionSource mutableInteractionSource, @m80.l IndicationNodeFactory indicationNodeFactory, boolean z11, @m80.l String str, @m80.l Role role, @m80.k x00.a<g2> aVar) {
        m207updateCommonQzZPfjk(mutableInteractionSource, indicationNodeFactory, z11, str, role, aVar);
    }

    private ClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z11, String str, Role role, x00.a<g2> aVar) {
        super(mutableInteractionSource, indicationNodeFactory, z11, str, role, aVar, null);
    }
}
