package androidx.savedstate;

import android.view.View;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class ViewKt {
    @n(level = DeprecationLevel.HIDDEN, message = "Replaced by View.findViewTreeSavedStateRegistryOwner() from savedstate module", replaceWith = @w0(expression = "findViewTreeSavedStateRegistryOwner()", imports = {"androidx.savedstate.findViewTreeSavedStateRegistryOwner"}))
    public static final /* synthetic */ SavedStateRegistryOwner findViewTreeSavedStateRegistryOwner(View view) {
        g0.p(view, "<this>");
        return ViewTreeSavedStateRegistryOwner.get(view);
    }
}
