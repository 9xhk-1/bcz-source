package androidx.compose.foundation;

import androidx.compose.ui.focus.FocusState;
import kotlin.jvm.internal.FunctionReferenceImpl;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public /* synthetic */ class FocusableNode$focusTargetNode$1 extends FunctionReferenceImpl implements p<FocusState, FocusState, g2> {
    public FocusableNode$focusTargetNode$1(Object obj) {
        super(2, obj, FocusableNode.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ g2 invoke(FocusState focusState, FocusState focusState2) {
        invoke2(focusState, focusState2);
        return g2.f100423a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FocusState focusState, FocusState focusState2) {
        ((FocusableNode) this.receiver).onFocusStateChange(focusState, focusState2);
    }
}
