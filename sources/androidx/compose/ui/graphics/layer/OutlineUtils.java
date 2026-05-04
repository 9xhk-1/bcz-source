package androidx.compose.ui.graphics.layer;

import android.view.View;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class OutlineUtils {

    @m80.k
    public static final OutlineUtils INSTANCE = new OutlineUtils();
    private static boolean hasRetrievedMethod;

    @m80.l
    private static Method rebuildOutlineMethod;

    private OutlineUtils() {
    }

    public final boolean rebuildOutline(@m80.k View view) {
        view.invalidateOutline();
        return true;
    }
}
