package androidx.compose.ui.focus;

import kotlin.jvm.internal.FunctionReferenceImpl;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public /* synthetic */ class FocusTargetModifierNodeKt$FocusTargetModifierNode$1 extends FunctionReferenceImpl implements l<FocusTargetNode, g2> {
    public FocusTargetModifierNodeKt$FocusTargetModifierNode$1(Object obj) {
        super(1, obj, InvalidateSemantics.class, "onDispatchEventsCompleted", "onDispatchEventsCompleted(Landroidx/compose/ui/focus/FocusTargetNode;)V", 0);
    }

    @Override // x00.l
    public /* bridge */ /* synthetic */ g2 invoke(FocusTargetNode focusTargetNode) {
        invoke2(focusTargetNode);
        return g2.f100423a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(FocusTargetNode focusTargetNode) {
        ((InvalidateSemantics) this.receiver).onDispatchEventsCompleted(focusTargetNode);
    }
}
