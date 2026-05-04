package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class OnPlacedModifierKt {
    @Stable
    @k
    public static final Modifier onPlaced(@k Modifier modifier, @k l<? super LayoutCoordinates, g2> lVar) {
        return modifier.then(new OnPlacedElement(lVar));
    }
}
