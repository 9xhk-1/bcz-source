package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class KeyInputModifierKt {
    @k
    public static final Modifier onKeyEvent(@k Modifier modifier, @k l<? super KeyEvent, Boolean> lVar) {
        return modifier.then(new KeyInputElement(lVar, null));
    }

    @k
    public static final Modifier onPreviewKeyEvent(@k Modifier modifier, @k l<? super KeyEvent, Boolean> lVar) {
        return modifier.then(new KeyInputElement(null, lVar));
    }
}
