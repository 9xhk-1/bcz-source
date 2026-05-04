package androidx.compose.ui.graphics.layer;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class SurfaceUtils {

    @m80.k
    public static final SurfaceUtils INSTANCE = new SurfaceUtils();
    private static boolean hasRetrievedMethod;

    @m80.l
    private static Method lockHardwareCanvasMethod;

    private SurfaceUtils() {
    }

    @SuppressLint({"BanUncheckedReflection"})
    private final Canvas lockCanvasFallback(Surface surface) {
        Method resolveLockHardwareCanvasMethod = resolveLockHardwareCanvasMethod();
        if (resolveLockHardwareCanvasMethod == null) {
            return surface.lockCanvas(null);
        }
        Object invoke = resolveLockHardwareCanvasMethod.invoke(surface, null);
        kotlin.jvm.internal.g0.n(invoke, "null cannot be cast to non-null type android.graphics.Canvas");
        return (Canvas) invoke;
    }

    @SuppressLint({"BanUncheckedReflection"})
    private final Method resolveLockHardwareCanvasMethod() {
        Method method;
        synchronized (this) {
            method = null;
            try {
                Method method2 = lockHardwareCanvasMethod;
                if (hasRetrievedMethod) {
                    method = method2;
                } else {
                    hasRetrievedMethod = true;
                    Method declaredMethod = Surface.class.getDeclaredMethod("lockHardwareCanvas", null);
                    declaredMethod.setAccessible(true);
                    lockHardwareCanvasMethod = declaredMethod;
                    method = declaredMethod;
                }
            } catch (Throwable unused) {
                lockHardwareCanvasMethod = null;
            }
        }
        return method;
    }

    public final boolean isLockHardwareCanvasAvailable() {
        return true;
    }

    @RequiresApi(22)
    @m80.k
    public final Canvas lockCanvas(@m80.k Surface surface) {
        return SurfaceVerificationHelper.INSTANCE.lockHardwareCanvas(surface);
    }
}
