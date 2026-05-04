package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class HoverableKt {
    @Stable
    @m80.k
    public static final Modifier hoverable(@m80.k Modifier modifier, @m80.k MutableInteractionSource mutableInteractionSource, boolean z11) {
        return modifier.then(z11 ? new HoverableElement(mutableInteractionSource) : Modifier.Companion);
    }

    public static /* synthetic */ Modifier hoverable$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return hoverable(modifier, mutableInteractionSource, z11);
    }
}
