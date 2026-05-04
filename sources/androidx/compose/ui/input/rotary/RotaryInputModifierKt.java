package androidx.compose.ui.input.rotary;

import androidx.compose.ui.Modifier;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class RotaryInputModifierKt {
    @k
    public static final Modifier onPreRotaryScrollEvent(@k Modifier modifier, @k l<? super RotaryScrollEvent, Boolean> lVar) {
        return modifier.then(new RotaryInputElement(null, lVar));
    }

    @k
    public static final Modifier onRotaryScrollEvent(@k Modifier modifier, @k l<? super RotaryScrollEvent, Boolean> lVar) {
        return modifier.then(new RotaryInputElement(lVar, null));
    }
}
