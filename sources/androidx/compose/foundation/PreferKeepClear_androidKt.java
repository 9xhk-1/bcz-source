package androidx.compose.foundation;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.internal.u0;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPreferKeepClear.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreferKeepClear.android.kt\nandroidx/compose/foundation/PreferKeepClear_androidKt\n*L\n1#1,107:1\n65#1:108\n65#1:109\n*S KotlinDebug\n*F\n+ 1 PreferKeepClear.android.kt\nandroidx/compose/foundation/PreferKeepClear_androidKt\n*L\n41#1:108\n59#1:109\n*E\n"})
/* loaded from: classes.dex */
public final class PreferKeepClear_androidKt {
    @m80.k
    public static final Modifier preferKeepClear(@m80.k Modifier modifier) {
        return Build.VERSION.SDK_INT < 33 ? modifier : modifier.then(new PreferKeepClearElement(null));
    }

    @RequiresApi(33)
    private static final Modifier preferKeepClearT(l<? super LayoutCoordinates, Rect> lVar) {
        return new PreferKeepClearElement(lVar);
    }

    @m80.k
    public static final Modifier preferKeepClear(@m80.k Modifier modifier, @m80.k l<? super LayoutCoordinates, Rect> lVar) {
        return Build.VERSION.SDK_INT < 33 ? modifier : modifier.then(new PreferKeepClearElement(lVar));
    }
}
