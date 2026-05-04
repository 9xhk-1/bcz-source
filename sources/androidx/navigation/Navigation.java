package androidx.navigation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.IdRes;
import androidx.core.app.ActivityCompat;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.g0;
import m80.k;
import q30.k0;
import q30.x;
import w00.o;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class Navigation {

    @k
    public static final Navigation INSTANCE = new Navigation();

    private Navigation() {
    }

    @w00.k
    @o
    @k
    public static final View.OnClickListener createNavigateOnClickListener(@IdRes int i11) {
        return createNavigateOnClickListener$default(i11, null, 2, null);
    }

    public static /* synthetic */ View.OnClickListener createNavigateOnClickListener$default(int i11, Bundle bundle, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            bundle = null;
        }
        return createNavigateOnClickListener(i11, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createNavigateOnClickListener$lambda$0(int i11, Bundle bundle, View view) {
        g0.o(view, "view");
        findNavController(view).navigate(i11, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createNavigateOnClickListener$lambda$1(NavDirections directions, View view) {
        g0.p(directions, "$directions");
        g0.o(view, "view");
        findNavController(view).navigate(directions);
    }

    @o
    @k
    public static final NavController findNavController(@k Activity activity, @IdRes int i11) {
        g0.p(activity, "activity");
        View requireViewById = ActivityCompat.requireViewById(activity, i11);
        g0.o(requireViewById, "requireViewById<View>(activity, viewId)");
        NavController findViewNavController = INSTANCE.findViewNavController(requireViewById);
        if (findViewNavController != null) {
            return findViewNavController;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + i11);
    }

    private final NavController findViewNavController(View view) {
        return (NavController) k0.i1(k0.S1(x.t(view, new l<View, View>() { // from class: androidx.navigation.Navigation$findViewNavController$1
            @Override // x00.l
            public final View invoke(View it) {
                g0.p(it, "it");
                Object parent = it.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        }), new l<View, NavController>() { // from class: androidx.navigation.Navigation$findViewNavController$2
            @Override // x00.l
            public final NavController invoke(View it) {
                NavController viewNavController;
                g0.p(it, "it");
                viewNavController = Navigation.INSTANCE.getViewNavController(it);
                return viewNavController;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavController getViewNavController(View view) {
        Object tag = view.getTag(R.id.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            return (NavController) ((WeakReference) tag).get();
        }
        if (tag instanceof NavController) {
            return (NavController) tag;
        }
        return null;
    }

    @o
    public static final void setViewNavController(@k View view, @m80.l NavController navController) {
        g0.p(view, "view");
        view.setTag(R.id.nav_controller_view_tag, navController);
    }

    @w00.k
    @o
    @k
    public static final View.OnClickListener createNavigateOnClickListener(@IdRes final int i11, @m80.l final Bundle bundle) {
        return new View.OnClickListener() { // from class: androidx.navigation.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Navigation.createNavigateOnClickListener$lambda$0(i11, bundle, view);
            }
        };
    }

    @o
    @k
    public static final View.OnClickListener createNavigateOnClickListener(@k final NavDirections directions) {
        g0.p(directions, "directions");
        return new View.OnClickListener() { // from class: androidx.navigation.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Navigation.createNavigateOnClickListener$lambda$1(NavDirections.this, view);
            }
        };
    }

    @o
    @k
    public static final NavController findNavController(@k View view) {
        g0.p(view, "view");
        NavController findViewNavController = INSTANCE.findViewNavController(view);
        if (findViewNavController != null) {
            return findViewNavController;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }
}
