package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.runtime.R;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import q30.k0;
import q30.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "ViewTreeLifecycleOwner")
/* loaded from: classes2.dex */
public final class ViewTreeLifecycleOwner {
    @l
    @w00.j(name = ct.d.f46852f)
    public static final LifecycleOwner get(@k View view) {
        g0.p(view, "<this>");
        return (LifecycleOwner) k0.i1(k0.S1(x.t(view, new x00.l<View, View>() { // from class: androidx.lifecycle.ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1
            @Override // x00.l
            @l
            public final View invoke(@k View currentView) {
                g0.p(currentView, "currentView");
                Object parent = currentView.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        }), new x00.l<View, LifecycleOwner>() { // from class: androidx.lifecycle.ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2
            @Override // x00.l
            @l
            public final LifecycleOwner invoke(@k View viewParent) {
                g0.p(viewParent, "viewParent");
                Object tag = viewParent.getTag(R.id.view_tree_lifecycle_owner);
                if (tag instanceof LifecycleOwner) {
                    return (LifecycleOwner) tag;
                }
                return null;
            }
        }));
    }

    @w00.j(name = ct.d.f46854h)
    public static final void set(@k View view, @l LifecycleOwner lifecycleOwner) {
        g0.p(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, lifecycleOwner);
    }
}
