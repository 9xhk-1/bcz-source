package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import x00.l;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "ExcludeFromSystemGestureKt")
/* loaded from: classes.dex */
public final class ExcludeFromSystemGestureKt {
    @n(message = "Use systemGestureExclusion", replaceWith = @w0(expression = "systemGestureExclusion", imports = {}))
    @m80.k
    public static final Modifier excludeFromSystemGesture(@m80.k Modifier modifier) {
        return SystemGestureExclusionKt.systemGestureExclusion(modifier);
    }

    @n(message = "Use systemGestureExclusion", replaceWith = @w0(expression = "systemGestureExclusion", imports = {}))
    @m80.k
    public static final Modifier excludeFromSystemGesture(@m80.k Modifier modifier, @m80.k l<? super LayoutCoordinates, Rect> lVar) {
        return SystemGestureExclusionKt.systemGestureExclusion(modifier, lVar);
    }
}
