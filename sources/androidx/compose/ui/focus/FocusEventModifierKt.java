package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class FocusEventModifierKt {
    @k
    public static final Modifier onFocusEvent(@k Modifier modifier, @k l<? super FocusState, g2> lVar) {
        return modifier.then(new FocusEventElement(lVar));
    }
}
