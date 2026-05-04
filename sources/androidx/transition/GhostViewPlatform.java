package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(21)
/* loaded from: classes3.dex */
class GhostViewPlatform implements GhostView {
    private static final String TAG = "GhostViewApi21";
    private static Method sAddGhostMethod;
    private static boolean sAddGhostMethodFetched;
    private static Class<?> sGhostViewClass;
    private static boolean sGhostViewClassFetched;
    private static Method sRemoveGhostMethod;
    private static boolean sRemoveGhostMethodFetched;
    private final View mGhostView;

    private GhostViewPlatform(@NonNull View view) {
        this.mGhostView = view;
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static GhostView addGhost(View view, ViewGroup viewGroup, Matrix matrix) {
        fetchAddGhostMethod();
        Method method = sAddGhostMethod;
        if (method != null) {
            try {
                return new GhostViewPlatform((View) method.invoke(null, view, viewGroup, matrix));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11.getCause());
            }
        }
        return null;
    }

    private static void fetchAddGhostMethod() {
        if (sAddGhostMethodFetched) {
            return;
        }
        try {
            fetchGhostViewClass();
            Method declaredMethod = sGhostViewClass.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class);
            sAddGhostMethod = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e11) {
            Log.i(TAG, "Failed to retrieve addGhost method", e11);
        }
        sAddGhostMethodFetched = true;
    }

    private static void fetchGhostViewClass() {
        if (sGhostViewClassFetched) {
            return;
        }
        try {
            sGhostViewClass = Class.forName("android.view.GhostView");
        } catch (ClassNotFoundException e11) {
            Log.i(TAG, "Failed to retrieve GhostView class", e11);
        }
        sGhostViewClassFetched = true;
    }

    private static void fetchRemoveGhostMethod() {
        if (sRemoveGhostMethodFetched) {
            return;
        }
        try {
            fetchGhostViewClass();
            Method declaredMethod = sGhostViewClass.getDeclaredMethod("removeGhost", View.class);
            sRemoveGhostMethod = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e11) {
            Log.i(TAG, "Failed to retrieve removeGhost method", e11);
        }
        sRemoveGhostMethodFetched = true;
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static void removeGhost(View view) {
        fetchRemoveGhostMethod();
        Method method = sRemoveGhostMethod;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11.getCause());
            }
        }
    }

    @Override // androidx.transition.GhostView
    public void setVisibility(int i11) {
        this.mGhostView.setVisibility(i11);
    }

    @Override // androidx.transition.GhostView
    public void reserveEndViewTransition(ViewGroup viewGroup, View view) {
    }
}
