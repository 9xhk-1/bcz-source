package androidx.compose.ui.graphics;

import android.annotation.SuppressLint;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class CanvasUtils {

    @m80.k
    public static final CanvasUtils INSTANCE = new CanvasUtils();

    @m80.l
    private static Method inorderBarrierMethod;
    private static boolean orderMethodsFetched;

    @m80.l
    private static Method reorderBarrierMethod;

    private CanvasUtils() {
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public final void enableZ(@m80.k android.graphics.Canvas canvas, boolean z11) {
        Method method;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            CanvasZHelper.INSTANCE.enableZ(canvas, z11);
            return;
        }
        if (!orderMethodsFetched) {
            try {
                if (i11 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    reorderBarrierMethod = (Method) declaredMethod.invoke(android.graphics.Canvas.class, "insertReorderBarrier", new Class[0]);
                    inorderBarrierMethod = (Method) declaredMethod.invoke(android.graphics.Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    reorderBarrierMethod = android.graphics.Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    inorderBarrierMethod = android.graphics.Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = reorderBarrierMethod;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = inorderBarrierMethod;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            orderMethodsFetched = true;
        }
        if (z11) {
            try {
                Method method4 = reorderBarrierMethod;
                if (method4 != null) {
                    kotlin.jvm.internal.g0.m(method4);
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z11 || (method = inorderBarrierMethod) == null) {
            return;
        }
        kotlin.jvm.internal.g0.m(method);
        method.invoke(canvas, null);
    }
}
