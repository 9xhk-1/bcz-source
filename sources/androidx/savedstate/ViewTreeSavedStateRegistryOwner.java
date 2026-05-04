package androidx.savedstate;

import android.view.View;
import ct.d;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import q30.k0;
import q30.x;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "ViewTreeSavedStateRegistryOwner")
/* loaded from: classes3.dex */
public final class ViewTreeSavedStateRegistryOwner {
    @l
    @j(name = d.f46852f)
    public static final SavedStateRegistryOwner get(@k View view) {
        g0.p(view, "<this>");
        return (SavedStateRegistryOwner) k0.i1(k0.S1(x.t(view, new x00.l<View, View>() { // from class: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1
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
        }), new x00.l<View, SavedStateRegistryOwner>() { // from class: androidx.savedstate.ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2
            @Override // x00.l
            @l
            public final SavedStateRegistryOwner invoke(@k View view2) {
                g0.p(view2, "view");
                Object tag = view2.getTag(R.id.view_tree_saved_state_registry_owner);
                if (tag instanceof SavedStateRegistryOwner) {
                    return (SavedStateRegistryOwner) tag;
                }
                return null;
            }
        }));
    }

    @j(name = d.f46854h)
    public static final void set(@k View view, @l SavedStateRegistryOwner savedStateRegistryOwner) {
        g0.p(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, savedStateRegistryOwner);
    }
}
