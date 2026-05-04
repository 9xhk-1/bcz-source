package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class FocusableKt {
    @Stable
    @m80.k
    public static final Modifier focusGroup(@m80.k Modifier modifier) {
        return modifier.then(FocusGroupElement.INSTANCE);
    }

    @Stable
    @m80.k
    public static final Modifier focusable(@m80.k Modifier modifier, boolean z11, @l MutableInteractionSource mutableInteractionSource) {
        return modifier.then(z11 ? new FocusableElement(mutableInteractionSource) : Modifier.Companion);
    }

    public static /* synthetic */ Modifier focusable$default(Modifier modifier, boolean z11, MutableInteractionSource mutableInteractionSource, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            mutableInteractionSource = null;
        }
        return focusable(modifier, z11, mutableInteractionSource);
    }
}
