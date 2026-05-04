package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusTargetNode;
import m80.k;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class FocusModifierKt {
    @n(message = "Replaced by focusTarget", replaceWith = @w0(expression = "focusTarget()", imports = {"androidx.compose.ui.focus.focusTarget"}))
    @k
    public static final Modifier focusModifier(@k Modifier modifier) {
        return focusTarget(modifier);
    }

    @k
    public static final Modifier focusTarget(@k Modifier modifier) {
        return modifier.then(FocusTargetNode.FocusTargetElement.INSTANCE);
    }
}
