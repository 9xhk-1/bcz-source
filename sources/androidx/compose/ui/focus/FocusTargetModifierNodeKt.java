package androidx.compose.ui.focus;

import kotlin.DeprecationLevel;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class FocusTargetModifierNodeKt {
    @n(level = DeprecationLevel.HIDDEN, message = "Use the other overload with added parameters for focusability and onFocusChange")
    public static final /* synthetic */ FocusTargetModifierNode FocusTargetModifierNode() {
        return new FocusTargetNode(0, null, new FocusTargetModifierNodeKt$FocusTargetModifierNode$1(InvalidateSemantics.INSTANCE), 3, null);
    }

    @k
    /* renamed from: FocusTargetModifierNode-PYyLHbc, reason: not valid java name */
    public static final FocusTargetModifierNode m2185FocusTargetModifierNodePYyLHbc(int i11, @l p<? super FocusState, ? super FocusState, g2> pVar) {
        return new FocusTargetNode(i11, pVar, null, 4, null);
    }

    /* renamed from: FocusTargetModifierNode-PYyLHbc$default, reason: not valid java name */
    public static /* synthetic */ FocusTargetModifierNode m2186FocusTargetModifierNodePYyLHbc$default(int i11, p pVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = Focusability.Companion.m2204getAlwaysLCbbffg();
        }
        if ((i12 & 2) != 0) {
            pVar = null;
        }
        return m2185FocusTargetModifierNodePYyLHbc(i11, pVar);
    }
}
