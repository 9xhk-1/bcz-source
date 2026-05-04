package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
class ViewGroupUtils {
    private static Method sGetChildDrawingOrderMethod = null;
    private static boolean sGetChildDrawingOrderMethodFetched = false;
    private static boolean sTryHiddenSuppressLayout = true;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        public static int getChildDrawingOrder(ViewGroup viewGroup, int i11) {
            return viewGroup.getChildDrawingOrder(i11);
        }

        @DoNotInline
        public static void suppressLayout(ViewGroup viewGroup, boolean z11) {
            viewGroup.suppressLayout(z11);
        }
    }

    private ViewGroupUtils() {
    }

    public static int getChildDrawingOrder(@NonNull ViewGroup viewGroup, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.getChildDrawingOrder(viewGroup, i11);
        }
        if (!sGetChildDrawingOrderMethodFetched) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", cls, cls);
                sGetChildDrawingOrderMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            sGetChildDrawingOrderMethodFetched = true;
        }
        Method method = sGetChildDrawingOrderMethod;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i11))).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i11;
    }

    @SuppressLint({"NewApi"})
    private static void hiddenSuppressLayout(@NonNull ViewGroup viewGroup, boolean z11) {
        if (sTryHiddenSuppressLayout) {
            try {
                Api29Impl.suppressLayout(viewGroup, z11);
            } catch (NoSuchMethodError unused) {
                sTryHiddenSuppressLayout = false;
            }
        }
    }

    public static void suppressLayout(@NonNull ViewGroup viewGroup, boolean z11) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.suppressLayout(viewGroup, z11);
        } else {
            hiddenSuppressLayout(viewGroup, z11);
        }
    }
}
