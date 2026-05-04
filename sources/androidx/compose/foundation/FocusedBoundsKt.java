package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class FocusedBoundsKt {
    @m80.k
    public static final Modifier onFocusedBoundsChanged(@m80.k Modifier modifier, @m80.k l<? super LayoutCoordinates, g2> lVar) {
        return modifier.then(new FocusedBoundsObserverElement(lVar));
    }
}
