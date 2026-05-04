package zr;

import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class h {
    public static boolean a(String str) {
        String[] strArr = {"java.io.FileNotFoundException", "java.util.jar.JarException", "java.util.MissingResourceException", "java.security.acl.NotOwnerException", "java.util.ConcurrentModificationException", "javax.naming.InsufficientResourcesException", "java.net.BindException", "java.lang.OutOfMemoryError", "java.lang.StackOverflowError", "java.sql.SQLException"};
        for (int i11 = 0; i11 < 10; i11++) {
            if (str.contains(strArr[i11])) {
                return true;
            }
        }
        return false;
    }

    public static String b(String str, Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            sb2.append(" ");
        }
        sb2.append("Exception: ");
        sb2.append(th2.getClass().getName());
        sb2.append('\n');
        if (!a(th2.getClass().getCanonicalName())) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            if (stackTrace == null) {
                sb2.append("Stack trace is NULL!");
                sb2.append('\n');
            } else {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    sb2.append(stackTraceElement.toString());
                    sb2.append('\n');
                }
            }
        }
        return sb2.toString();
    }

    public static void c(String str, String str2, Throwable th2) {
        if (th2 == null) {
            return;
        }
        Log.w(str, b(str2, th2));
    }
}
