package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.viewmodel.R;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import q30.k0;
import q30.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "ViewTreeViewModelStoreOwner")
/* loaded from: classes2.dex */
public final class ViewTreeViewModelStoreOwner {
    @l
    @w00.j(name = ct.d.f46852f)
    public static final ViewModelStoreOwner get(@k View view) {
        g0.p(view, "<this>");
        return (ViewModelStoreOwner) k0.i1(k0.S1(x.t(view, new x00.l<View, View>() { // from class: androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1
            @Override // x00.l
            @l
            public final View invoke(@k View view2) {
                g0.p(view2, "view");
                Object parent = view2.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        }), new x00.l<View, ViewModelStoreOwner>() { // from class: androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2
            @Override // x00.l
            @l
            public final ViewModelStoreOwner invoke(@k View view2) {
                g0.p(view2, "view");
                Object tag = view2.getTag(R.id.view_tree_view_model_store_owner);
                if (tag instanceof ViewModelStoreOwner) {
                    return (ViewModelStoreOwner) tag;
                }
                return null;
            }
        }));
    }

    @w00.j(name = ct.d.f46854h)
    public static final void set(@k View view, @l ViewModelStoreOwner viewModelStoreOwner) {
        g0.p(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, viewModelStoreOwner);
    }
}
