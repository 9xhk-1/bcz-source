package xb;

import android.annotation.TargetApi;
import android.app.KeyguardManager;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class r {
    public static int a(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.internal.widget.LockPatternUtils");
            return ((Integer) cls.getMethod("getKeyguardStoredPasswordQuality", null).invoke(cls.getConstructor(Context.class).newInstance(context), null)).intValue();
        } catch (ClassNotFoundException e11) {
            e11.printStackTrace();
            return -1;
        } catch (IllegalAccessException e12) {
            e12.printStackTrace();
            return -1;
        } catch (IllegalArgumentException e13) {
            e13.printStackTrace();
            return -1;
        } catch (InstantiationException e14) {
            e14.printStackTrace();
            return -1;
        } catch (NoSuchMethodException e15) {
            e15.printStackTrace();
            return -1;
        } catch (InvocationTargetException e16) {
            e16.printStackTrace();
            return -1;
        }
    }

    public static boolean b(Context context) {
        return c(context);
    }

    @TargetApi(16)
    public static boolean c(Context context) {
        return ((KeyguardManager) context.getSystemService("keyguard")).isKeyguardLocked();
    }

    public static boolean d(Context context) {
        return e(context);
    }

    @TargetApi(16)
    public static boolean e(Context context) {
        return ((KeyguardManager) context.getSystemService("keyguard")).isKeyguardSecure();
    }

    public static boolean f(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.internal.widget.LockPatternUtils");
            return ((Boolean) cls.getMethod("usingBiometricWeak", null).invoke(cls.getConstructor(Context.class).newInstance(context), null)).booleanValue();
        } catch (ClassNotFoundException e11) {
            e11.printStackTrace();
            return false;
        } catch (IllegalAccessException e12) {
            e12.printStackTrace();
            return false;
        } catch (IllegalArgumentException e13) {
            e13.printStackTrace();
            return false;
        } catch (InstantiationException e14) {
            e14.printStackTrace();
            return false;
        } catch (NoSuchMethodException e15) {
            e15.printStackTrace();
            return false;
        } catch (InvocationTargetException e16) {
            e16.printStackTrace();
            return false;
        }
    }
}
