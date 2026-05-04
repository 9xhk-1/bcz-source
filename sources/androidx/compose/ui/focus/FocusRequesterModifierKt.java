package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class FocusRequesterModifierKt {
    @k
    public static final Modifier focusRequester(@k Modifier modifier, @k FocusRequester focusRequester) {
        return modifier.then(new FocusRequesterElement(focusRequester));
    }
}
