package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f31622a = "n0";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {
        @NonNull
        public static Rect a(@NonNull WindowManager windowManager) {
            int i11;
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point b11 = b(defaultDisplay);
            Rect rect = new Rect();
            int i12 = b11.x;
            if (i12 == 0 || (i11 = b11.y) == 0) {
                defaultDisplay.getRectSize(rect);
                return rect;
            }
            rect.right = i12;
            rect.bottom = i11;
            return rect;
        }

        public static Point b(Display display) {
            Point point = new Point();
            try {
                Method declaredMethod = Display.class.getDeclaredMethod("getRealSize", Point.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(display, point);
                return point;
            } catch (IllegalAccessException e11) {
                Log.w(n0.f31622a, e11);
                return point;
            } catch (NoSuchMethodException e12) {
                Log.w(n0.f31622a, e12);
                return point;
            } catch (InvocationTargetException e13) {
                Log.w(n0.f31622a, e13);
                return point;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(api = 17)
    public static class b {
        @NonNull
        public static Rect a(@NonNull WindowManager windowManager) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Rect rect = new Rect();
            rect.right = point.x;
            rect.bottom = point.y;
            return rect;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(api = 30)
    public static class c {
        @NonNull
        public static Rect a(@NonNull WindowManager windowManager) {
            WindowMetrics currentWindowMetrics;
            Rect bounds;
            currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            bounds = currentWindowMetrics.getBounds();
            return bounds;
        }
    }

    @NonNull
    public static Rect b(@NonNull Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        return Build.VERSION.SDK_INT >= 30 ? c.a(windowManager) : b.a(windowManager);
    }
}
