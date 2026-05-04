package androidx.compose.foundation;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.internal.u0;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "SystemGestureExclusionKt")
@u0({"SMAP\nSystemGestureExclusion.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemGestureExclusion.android.kt\nandroidx/compose/foundation/SystemGestureExclusionKt\n*L\n1#1,109:1\n65#1:110\n65#1:111\n*S KotlinDebug\n*F\n+ 1 SystemGestureExclusion.android.kt\nandroidx/compose/foundation/SystemGestureExclusionKt\n*L\n42#1:110\n58#1:111\n*E\n"})
/* loaded from: classes.dex */
public final class SystemGestureExclusionKt {
    @RequiresApi(29)
    private static final Modifier excludeFromSystemGestureQ(l<? super LayoutCoordinates, Rect> lVar) {
        return new ExcludeFromSystemGestureElement(lVar);
    }

    @m80.k
    public static final Modifier systemGestureExclusion(@m80.k Modifier modifier) {
        return Build.VERSION.SDK_INT < 29 ? modifier : modifier.then(new ExcludeFromSystemGestureElement(null));
    }

    @m80.k
    public static final Modifier systemGestureExclusion(@m80.k Modifier modifier, @m80.k l<? super LayoutCoordinates, Rect> lVar) {
        return Build.VERSION.SDK_INT < 29 ? modifier : modifier.then(new ExcludeFromSystemGestureElement(lVar));
    }
}
