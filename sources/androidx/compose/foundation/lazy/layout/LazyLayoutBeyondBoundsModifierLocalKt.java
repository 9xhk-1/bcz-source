package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsModifierLocalKt {
    private static final int BeyondBoundsViewportFactor = 2;

    @k
    public static final Modifier lazyLayoutBeyondBoundsModifier(@k Modifier modifier, @k LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState, @k LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo, boolean z11, @k Orientation orientation) {
        return modifier.then(new LazyLayoutBeyondBoundsModifierElement(lazyLayoutBeyondBoundsState, lazyLayoutBeyondBoundsInfo, z11, orientation));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void unsupportedDirection() {
        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
    }
}
