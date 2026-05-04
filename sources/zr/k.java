package zr;

import android.app.Activity;
import android.view.Window;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f102848a = "ScreenUtil";

    /* renamed from: b, reason: collision with root package name */
    public static final int f102849b = 524288;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements PrivilegedAction {

        /* renamed from: a, reason: collision with root package name */
        public Method f102850a;

        public a(Method method) {
            this.f102850a = method;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            Method method = this.f102850a;
            if (method == null) {
                return null;
            }
            method.setAccessible(true);
            return null;
        }
    }

    public static void a(Activity activity, int i11) {
        if (activity == null || activity.isFinishing()) {
            f.k("", "activity is null");
        } else {
            activity.getWindow().addFlags(i11);
        }
    }

    public static void b(Activity activity, int i11) {
        if (activity == null || activity.isFinishing()) {
            f.k("", "activity is null");
        } else {
            activity.getWindow().clearFlags(i11);
        }
    }

    public static void c(Activity activity) {
        a(activity, 8192);
    }

    public static void d(Activity activity) {
        b(activity, 8192);
    }

    public static void e(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        try {
            Window window = activity.getWindow();
            Method declaredMethod = Class.forName("android.view.Window").getDeclaredMethod("addPrivateFlags", Integer.TYPE);
            AccessController.doPrivileged(new a(declaredMethod));
            declaredMethod.invoke(window, 524288);
        } catch (ClassNotFoundException unused) {
            f.k(f102848a, "hideOverlayWindows ClassNotFoundException");
        } catch (IllegalAccessException unused2) {
            f.k(f102848a, "hideOverlayWindows IllegalAccessException");
        } catch (NoSuchMethodException unused3) {
            f.k(f102848a, "hideOverlayWindows NoSuchMethodException");
        } catch (InvocationTargetException unused4) {
            f.k(f102848a, "hideOverlayWindows InvocationTargetException");
        }
    }
}
