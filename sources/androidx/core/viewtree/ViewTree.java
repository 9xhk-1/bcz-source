package androidx.core.viewtree;

import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "ViewTree")
/* loaded from: classes2.dex */
public final class ViewTree {
    @l
    public static final ViewParent getParentOrViewTreeDisjointParent(@k View view) {
        g0.p(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final void setViewTreeDisjointParent(@k View view, @l ViewParent viewParent) {
        g0.p(view, "<this>");
        view.setTag(R.id.view_tree_disjoint_parent, viewParent);
    }
}
