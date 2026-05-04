package androidx.lifecycle;

import android.view.View;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "ViewKt")
/* loaded from: classes2.dex */
public final class ViewKt {
    @n(level = DeprecationLevel.HIDDEN, message = "Replaced by View.findViewTreeLifecycleOwner() from lifecycle module", replaceWith = @w0(expression = "findViewTreeLifecycleOwner()", imports = {"androidx.lifecycle.findViewTreeLifecycleOwner"}))
    public static final /* synthetic */ LifecycleOwner findViewTreeLifecycleOwner(View view) {
        g0.p(view, "view");
        return ViewTreeLifecycleOwner.get(view);
    }
}
