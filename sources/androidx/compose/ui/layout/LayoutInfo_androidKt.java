package androidx.compose.ui.layout;

import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LayoutInfo_androidKt {
    @l
    public static final View getView(@k LayoutInfo layoutInfo) {
        g0.n(layoutInfo, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutNode");
        Object owner$ui_release = ((LayoutNode) layoutInfo).getOwner$ui_release();
        if (owner$ui_release instanceof View) {
            return (View) owner$ui_release;
        }
        return null;
    }
}
