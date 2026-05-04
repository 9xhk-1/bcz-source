package com.getui.gtc.b;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* loaded from: classes6.dex */
public final class b {
    public static String a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            AccessibleObject.setAccessible(declaredConstructors, true);
            Constructor<?> constructor = declaredConstructors[0];
            Method declaredMethod = cls.getDeclaredMethod("getSdkVersion", null);
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(constructor.newInstance(null), null);
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.d(" getSdkVersion error : " + th2.toString());
            return null;
        }
    }

    public static int b(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            AccessibleObject.setAccessible(declaredConstructors, true);
            Constructor<?> constructor = declaredConstructors[0];
            Method declaredMethod = cls.getDeclaredMethod("getSdkId", null);
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(constructor.newInstance(null), null)).intValue();
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.d(" getSDKId error : " + th2.toString());
            return 0;
        }
    }

    public static String c(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            AccessibleObject.setAccessible(declaredConstructors, true);
            Constructor<?> constructor = declaredConstructors[0];
            Method declaredMethod = cls.getDeclaredMethod("getSdkAppId", null);
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(constructor.newInstance(null), null);
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.d(" getAppId error : " + th2.toString());
            return null;
        }
    }
}
